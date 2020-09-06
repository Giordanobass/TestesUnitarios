package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;
import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {


  @Test
  public void test() {
    Assert.assertTrue(true);
    Assert.assertFalse(false);

    Assert.assertEquals("Erro de comparação", 1, 1);
    Assert.assertEquals(1, 1);
    Assert.assertEquals(0.51, 0.51, 0.01);// Delta 0.01 para margem de erro em comparações
    Assert.assertEquals(Math.PI, 3.14, 0.01);

    int i = 5;
    Integer i2 = 5;
    Assert.assertEquals(Integer.valueOf(i), i2);// Converção para objeto
    Assert.assertEquals(i, i2.intValue());// converção para tipo primitivo

    Assert.assertEquals("bola", "bola");
    Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
    Assert.assertTrue("bola".startsWith("bo"));

    Usuario u1 = new Usuario("Usuario 1");
    Usuario u2 = new Usuario("Usuario 1");
    Usuario u3 = null;
    Assert.assertEquals(u1, u2);

    Assert.assertSame(u2, u2);
    Assert.assertNotSame(u1, u2);

    Assert.assertNull(u3);
    Assert.assertNotNull(u2);

  }

}
