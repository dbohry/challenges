package com.danielbohry.challenges;

import org.junit.jupiter.api.Test;

class MaxEdgeTriangleChallengeTest {

    private final MaxEdgeTriangleChallenge challenge = new MaxEdgeTriangleChallenge();

    @Test
    public void should_calculate_max_edge_of_triangle() {
        assert challenge.nextEdge(8, 10) == 17;
        assert challenge.nextEdge(5, 7) == 11;
        assert challenge.nextEdge(9, 2) == 10;
    }

}