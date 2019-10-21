package tr.com.example.springcache.service.remote;

import tr.com.example.springcache.model.User;

public interface UserRepository {

  User getUser(String username) throws RepositoryException;

  User createUser(User user) throws RepositoryException;

  User updateUser(User user) throws RepositoryException;

  User delete(String username) throws RepositoryException;
}
