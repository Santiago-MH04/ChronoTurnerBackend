package org.springboot.riwi.chronoturner.backend.controllers.interfacePerEntityControllers;
import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.SaveEntity;
import org.springboot.riwi.chronoturner.backend.dtos.request.UserRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.User;

public interface InterfaceUserControl extends SaveEntity<User, UserRequestDTO> {
}
