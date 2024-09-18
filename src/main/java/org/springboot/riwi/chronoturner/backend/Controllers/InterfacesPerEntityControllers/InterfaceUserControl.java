package org.springboot.riwi.chronoturner.backend.controllers.InterfacesPerEntityControllers;

import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.Save;
import org.springboot.riwi.chronoturner.backend.dtos.request.UserRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.User;

public interface InterfaceUserControl extends Save<User, UserRequestDTO> {
}
