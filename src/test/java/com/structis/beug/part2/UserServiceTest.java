package com.structis.beug.part2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.structis.beug.part2.entity.User;
import com.structis.beug.part2.exceptions.UserNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private IArgosWService wService;

    @InjectMocks
    private UserService service;

    @Before
    public void setUp() {
        /*** Initialisation des Mocks */
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindUserById() throws UserNotFoundException {

        // Arrange
        Long id = 10L;
        when(wService.findUserById(any(Long.class))).thenReturn(new User());

        // Act
        User user = service.findById(id);

        // Assert
        assertNotNull(user);
    }

    @Test
    public void testFindUserByIdComplexReturn() throws UserNotFoundException {

        // Arrange
        Long id = 10L;
        when(wService.findUserById(any(Long.class))).then(new Answer<User>() {

            @Override
            public User answer(final InvocationOnMock invocation) throws Throwable {

                User user = new User("", "", "@");

                return user;
            }
        });

        // Act
        User user = service.findById(id);

        // Assert
        assertNotNull(user);
    }

    @Test(expected = UserNotFoundException.class)
    public void testFindUserByIdWithInexistantId() throws UserNotFoundException {

        // Arrange
        Long id = 0L;
        when(wService.findUserById(0L)).thenThrow(new UserNotFoundException("User does not exist"));

        // Act
        service.findById(id);

        // Assert
        // Exception Thrown
    }

    @Test
    public void testFindUsers() {

        // Arrange
        when(wService.findUsersByCriteria(any(String.class))).thenReturn(Arrays.asList(new User(), new User(), new User()));

        // Act
        List<User> users = service.findUsers();

        // Assert
        assertEquals(3, users.size());

    }

    @Test
    public void testDeactivateUser() throws UserNotFoundException {

        // Arrange
        Long id = 10L;

        // Act
        service.deactivateUser(id);

        // Assert
        assertTrue(true);
    }

    @Test(expected = UserNotFoundException.class)
    public void testDeactivateInexistantUser() throws UserNotFoundException {

        // Arrange
        Long id = 0L;
        doThrow(new UserNotFoundException("Inexistent user")).when(wService).deactivateUser(id);

        // Act
        service.deactivateUser(id);

        // Assert
        // Exception is thrown
    }

    // Example with intelligent mock-
}
