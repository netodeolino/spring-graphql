package com.br.study.graphql;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserGraphQLTest {

	@Autowired
    private GraphQLTestTemplate graphQLTestTemplate;
	
	@Test
    public void findUser() throws IOException {
        GraphQLResponse findResponse = graphQLTestTemplate.perform("graphql/queries.graphqls", null);

        System.out.println(findResponse.getRawResponse().toString());

        assertNotNull(findResponse);
        assertTrue(findResponse.isOk());
    }
}
