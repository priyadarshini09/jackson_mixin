package guru.springframework.blog.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.blog.mixin.UserMixin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class UserTest {
    private User user;

    @Before
    public void setUp(){
        user = new User(123,"James",23,"Male",
                "james@gmail.com", "1234567890");
    }
    @After
    public void tearDown(){
        user = null;
    }

    @Test
    public void JacksonMixinAnnotationTest() throws JsonProcessingException{
        ObjectMapper objectMapper = buildMapper();
        objectMapper.addMixIn(User.class, UserMixin.class);
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(json);

    }

    @Test
    public void DeserializeUsingJacksonMixinAnnotationTest() throws IOException {
        ObjectMapper objectMapper = buildMapperForDeserialize();
        System.out.println("Hiiiii");
        String json = "{\n" +
                "  \"id\": \"321\",\n" +
                "  \"name\": \"James Clark\",\n" +
                "  \"age\": 23,\n" +
                "  \"gender\": \"Male\",\n" +
                " \"email\": \"james@gmail.com\",\n" +
                " \"phoneNo\": \"9898989898\",\n" +
                "}";
        System.out.println(json);
        objectMapper.addMixIn(User.class, UserMixin.class);
        User user1 = objectMapper.readValue(json, User.class);
        System.out.println("Hiiiii");
        System.out.println(user1);
    }
    private static ObjectMapper buildMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibilityChecker(objectMapper.getSerializationConfig()
                .getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
        return objectMapper;
    }

    private static ObjectMapper buildMapperForDeserialize(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibilityChecker(objectMapper.getDeserializationConfig()
                .getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withIsGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
        return objectMapper;
    }
}
