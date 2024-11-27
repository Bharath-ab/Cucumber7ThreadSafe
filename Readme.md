Note: Cucumber Runner IT should have Test in name
mvn test -Dsurefire.includeJUnit5Engines=cucumber -Dcucumber.plugin=pretty -Dcucumber.features=src/test/resources/features/Sample.feature