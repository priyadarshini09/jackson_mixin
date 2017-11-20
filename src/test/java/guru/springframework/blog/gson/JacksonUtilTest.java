/*
package guru.springframework.blog.gson;

import guru.springframework.blog.domain.Product;
import guru.springframework.blog.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.math.BigDecimal;

public class JacksonUtilTest {
    private Product product;

    @Before
    public void setUp(){
        product = new Product("P01","Spring Guru Mug","https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg",new BigDecimal(18.95), new User().setName("Ram"));
    }
    
    @After
    public void tearDown(){
        product=null;
    }

    @Test
    public void jsonDeserialize() throws Exception{
        Product product = JacksonUtil.jsonDeserialize();
        assertNotNull(product);
        assertEquals("235268845711068312", product.getProductId());
        assertEquals("Spring Framework Guru Mug", product.getDescription());
        assertEquals("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_mug-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg", product.getImageUrl());
        assertEquals(new BigDecimal(14), product.getPrice());
    }

    */
/*@Test
    public void jsonSerialize() throws Exception{
        String result = JacksonUtil.jsonSerialize(product);
        assertEquals(5, result.replace("{", "").replace("}","").split(",").length);
        assertEquals("\"product-id\":\"P01\"", result.replace("{", "").replace("}","").split(",")[0].trim());
        assertEquals("\"description\":\"Spring Guru Mug\"".trim(), result.replace("{", "").replace("}","").split(",")[1].trim());
        assertEquals("\"image-url\":\"https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg\"".trim(), result.replace("{", "").replace("}","").split(",")[2].trim());
        assertEquals("\"price\":18.95".trim(), result.replace("{", "").replace("}","").split(",")[3].trim());
        assertEquals("\"createdBy\":\"Ram\"", result.replace("{", "").replace("}", "").split(",")[4].trim());
    }*//*


    */
/*@Test
    public void jsonSerializeWithJsonIgnore() throws Exception{
        String result = JacksonUtil.jsonSerializeWithJsonIgnore(product);
        assertThat(result, containsString("P01"));
        assertThat(result, not(containsString("description")));
    }*//*



}
*/
