package com.danielbohry.challenges;

import org.junit.jupiter.api.Test;

class RectanglePerimeterChallengeTest {

    private final RectanglePerimeterChallenge challenge = new RectanglePerimeterChallenge();

    @Test
    public void should_check_a_perimeter_rectangle() {
        assert challenge.findPerimeter(6, 7) == 26;
        assert challenge.findPerimeter(20, 10) == 60;
        assert challenge.findPerimeter(2, 9) == 22;
    }

}