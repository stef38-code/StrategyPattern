package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.ClientRestStrategies;
import com.stephane.strategy.pattern.examples.client.rest.response.post.Post;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/*************************************************************
 *
 *
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.client.rest
 * ----------------------------------------------------------
 * Date: 25 juin 2021,
 * Time: 13:53
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
@Slf4j
class CommunStrategyTest_HttpDelete {


    @Test
    void getActionHttpGet_Post() {
        Post post = Post.builder()
                .id(1)
                .build();

        Post response = ClientRestStrategies.REST_JSON_PLACE_HOLDER_POST_STRATEGY.supprimer(Post.class, Optional.of(post));

        log.info(String.valueOf(response));

    }

}

