package org.springboot.riwi.chronoturner.backend.services.entityServices;

import org.springboot.riwi.chronoturner.backend.dtos.request.UserRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.User;
import org.springboot.riwi.chronoturner.backend.services.methodServices.SaveService;

    //Esta clase es firme candidata a ser extirpada de la faz de la tierra
public interface ServiceInterface extends SaveService<User, UserRequestDTO> {
}
