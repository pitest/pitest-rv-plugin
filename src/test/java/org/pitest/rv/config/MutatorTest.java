package org.pitest.rv.config;

import org.junit.Test;
import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
import org.pitest.mutationtest.engine.gregor.config.Mutator;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MutatorTest {

  @Test
  public void providesResearchMutators() {
    assertProvides("AOR1");
    assertProvides("AOR2");
    assertProvides("AOR3");
    assertProvides("AOR4");

    assertProvides("ABS");

    assertProvides("AOD1");
    assertProvides("AOD2");

    assertProvides("CRCR1");
    assertProvides("CRCR2");
    assertProvides("CRCR3");
    assertProvides("CRCR4");
    assertProvides("CRCR5");
    assertProvides("CRCR6");

    assertProvides("OBBN1");
    assertProvides("OBBN2");
    assertProvides("OBBN3");

    assertProvides("ROR1");
    assertProvides("ROR2");
    assertProvides("ROR3");
    assertProvides("ROR4");
    assertProvides("ROR5");

    assertProvides("UOI1");
    assertProvides("UOI2");
    assertProvides("UOI3");
    assertProvides("UOI4");
  }

  @Test
  public void providesAORGroup() {
    assertGroupHasSize("AOR", 4);
  }

  @Test
  public void providesAODGroup() {
    assertGroupHasSize("AOD", 2);
  }

  @Test
  public void providesCRCRGroup() {
    assertGroupHasSize("CRCR", 6);
  }

  @Test
  public void providesOBBNGroup() {
    assertGroupHasSize("OBBN", 3);
  }

  @Test
  public void providesRORGroup() {
    assertGroupHasSize("ROR", 5);
  }

  @Test
  public void providesUOIGroup() {
    assertGroupHasSize("UOI", 4);
  }


  @Test
  public void allMutatorIdsReturnsKeysForAllMutators() {
    List<String> incompleteSample = asList("DEFAULTS", "INCREMENTS", "EMPTY_RETURNS", "AOR");

    // method is used by pitclipse
    assertThat(Mutator.allMutatorIds()).containsAll(incompleteSample);
  }

  private Collection<MethodMutatorFactory> parseStrings(final String... s) {
    return Mutator.fromStrings(asList(s));
  }

  private void assertProvides(String name) {
    assertThatCode(() -> parseStrings(name)).doesNotThrowAnyException();
  }

  private void assertGroupHasSize(String name, int expected) {
    assertThatCode(() -> parseStrings(name)).doesNotThrowAnyException();
    assertThat(parseStrings(name)).hasSize(expected);
  }

}
