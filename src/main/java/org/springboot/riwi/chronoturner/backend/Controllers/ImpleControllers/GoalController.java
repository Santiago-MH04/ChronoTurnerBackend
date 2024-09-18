package org.springboot.riwi.chronoturner.backend.controllers.ImpleControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springboot.riwi.chronoturner.backend.Controllers.InterfacesPerEntityControllers.InterfaceGoalControl;
import org.springboot.riwi.chronoturner.backend.Service.interfaces.IGoalService;
import org.springboot.riwi.chronoturner.backend.dtos.exception.ErrorResponse;
import org.springboot.riwi.chronoturner.backend.dtos.exception.ErrorsResponse;
import org.springboot.riwi.chronoturner.backend.dtos.exception.NoUserIdException;
import org.springboot.riwi.chronoturner.backend.dtos.exception.WithoutGoalsException;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.ServiceUnavailableException;
import java.net.SocketTimeoutException;
import java.util.List;



@RestController
@RequestMapping("/goals")
@Tag(name="Goals")
public class GoalController implements InterfaceGoalControl {


    @Autowired
    IGoalService goalService;

    private boolean maintenanceMode = false; // Simulación del modo de mantenimiento

    public GoalController(IGoalService goalService) {
        this.goalService = goalService;
    }

    @Override
    @PostMapping
    @Operation(summary = "Este endpoint es para crear metas", description="Este endpoint requiere que envies la información de las metas")

    @ApiResponses(value={
            @ApiResponse(responseCode = "400",
                    description = "Este error sale cuando falta un atributo o el tipo es invalido",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ErrorsResponse.class)
                            )
                    })
    })

    public ResponseEntity<String> create(@RequestBody  @Valid GoalRequest goal) throws ServiceUnavailableException {

        if (maintenanceMode) {
            throw new ServiceUnavailableException("El servidor está en mantenimiento. Por favor, inténtelo más tarde.");
        }
        goalService.create(goal);
        return ResponseEntity.ok("Hay una nueva meta creada");
    }

    @Override
    @GetMapping("/{id}")
    @Operation(summary = "Este endpoint es para traer metas", description="Este endpoint requiere que envies el id de la meta")
    @ApiResponse(responseCode = "400",
            description = "Este error sale cuando el usuario no existe ",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorsResponse.class)
                    )
            })
    public ResponseEntity<GoalResponse> ById(@PathVariable String id) {
        GoalResponse goalResponse = goalService.readById(id).orElseThrow(()->new NoUserIdException("Este usuario no existe"));
        return ResponseEntity.ok(goalResponse);
    }

    // error de tiempo, borrar
    @PostMapping("/test-timeout")
    @Operation(summary = "Este endpoint simular un GATEWAY_TIMEOUT", description="solo requiere ejecución")
    @ApiResponse(responseCode = "400",
            description = "Este error sale cuando no hay internet XD",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorsResponse.class)
                    )
    })
    public ResponseEntity<String> testTimeout() throws SocketTimeoutException {
        throw new SocketTimeoutException("Simulated timeout exception");
    }

    @Override
    @GetMapping("/readAll")
    @Operation(summary = "Este endpoint es para traer todas las metas existentes", description="Este endpoint solo requiere pongas la dirección http")
    @ApiResponse(responseCode = "400",
            description = "Este error sale cuando no hay metas existentes",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorsResponse.class)
                    )
            })
    public ResponseEntity<List<GoalResponse>> readAll() {
        List<GoalResponse> list= goalService.readAll().orElseThrow(()->new WithoutGoalsException("No hay metas existentes"));
        return  ResponseEntity.ok(list);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Este endpoint es para eliminar metas", description="Este endpoint solo que pongas el id de la meta que se desea eliminar")
    @ApiResponse(responseCode = "400",
            description = "Este error sale cuando se desea eliminar una meta que no existe",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorsResponse.class)
                    )
            })
    public String delete(@PathVariable String id) {

        GoalResponse goalResponse = goalService.readById(id).orElseThrow(()->new NoUserIdException("Este meta no existe"));
        goalService.delete(goalResponse,id);
        return "Meta borrada con exito";
    }

    @Override
    @RequestMapping(value = "/update/{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
    @Operation(summary = "Este endpoint es para actualizar las metas", description="Este endpoint solo requiere  el id de la meta hacer actualizada")
    @ApiResponse(responseCode = "400",
            description = "Este error sale cuando no la meta no existe",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorsResponse.class)
                    )
            })
    public String put(@RequestBody GoalRequest goalRequest,@PathVariable String id) {
        GoalResponse goalResponse= goalService.readById(id).orElseThrow(()->new NoUserIdException("Esta meta no existe"));
        goalService.put(goalRequest,id,goalResponse);
        return "Meta actualizada correctamente";
    }



}
