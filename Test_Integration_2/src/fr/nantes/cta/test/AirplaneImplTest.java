package fr.nantes.cta.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.nantes.cta.Airplane;
import fr.nantes.cta.one.AirplaneImpl;

public class AirplaneImplTest {


  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testAirplaneImpl() {
    Airplane a = new AirplaneImpl(1000, 200, 10, 600);
    assertNotNull(a);
  }

  @Test
  public void testGetAutonomy() {
    Airplane a = new AirplaneImpl(1000, 200, 10, 600);
    assertEquals(600 * 10, a.getAutonomy(), 0);
  }

  @Test
  public void testGetLoading() {
    Airplane a = new AirplaneImpl(1000, 200, 10, 600);
    assertEquals(200, a.getLoading(), 0);
  }

  @Test
  public void testWeight() {
    Airplane a = new AirplaneImpl(1000, 200, 10, 600);
    assertEquals(1000, a.weight(), 0);
  }

}
