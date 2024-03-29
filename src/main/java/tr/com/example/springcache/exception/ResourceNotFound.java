package tr.com.example.springcache.exception;

import tr.com.example.springcache.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such resource")
public class ResourceNotFound extends RuntimeException {
  public ResourceNotFound(Class<User> clazz, String resourceId) {
    super(String.format("Resource '%s' with id '%s' does not exists", clazz.getSimpleName(), resourceId));
  }
}
