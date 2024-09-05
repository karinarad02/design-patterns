package test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTest;
import test.suite.categorii.TestErrorConditions;
import test.suite.categorii.TestRange;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({TestRange.class})
@Categories.ExcludeCategory({TestErrorConditions.class})
public class SuitaCustom {
}
