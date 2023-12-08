package org.sistemabancario.junittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GerenciadoraClientesTest1.class, GerenciadoraClientesTest2.class, GerenciadoraContasTest1.class})
public class AllTests {

}
