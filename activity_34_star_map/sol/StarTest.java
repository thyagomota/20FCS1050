import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarTest {

    @Test
    public void testCase() {
        // a star at (-1, +1) should have getGUIX and getGUIY return (0, 0), respectively
        Star star = new Star(-1, 1, 0);
        assertEquals(0, star.getGUIX());
        assertEquals(0, star.getGUIY());
        // a star at (+1, +1) should have getGUIX and getGUIY return (WIDTH, 0), respectively
        star = new Star(1, 1, 0);
        assertEquals(StarMapFrame.WIDTH, star.getGUIX());
        assertEquals(0, star.getGUIY());
        // a star at (+1, -1) should have getGUIX and getGUIY return (WIDTH, HEIGHT), respectively
        star = new Star(1, -1, 0);
        assertEquals(StarMapFrame.WIDTH, star.getGUIX());
        assertEquals(StarMapFrame.HEIGHT, star.getGUIY());
        // a star at (-1, -1) should have getGUIX and getGUIY return (0, HEIGHT), respectively
        star = new Star(-1, -1, 0);
        assertEquals(0, star.getGUIX());
        assertEquals(StarMapFrame.HEIGHT, star.getGUIY());
        // a star at ( 0, 0) should have getGUIX and getGUIY return (WIDTH/2, HEIGHT/2), respectively
        star = new Star(0, 0, 0);
        assertEquals(StarMapFrame.WIDTH / 2, star.getGUIX());
        assertEquals(StarMapFrame.HEIGHT / 2, star.getGUIY());
    }

}