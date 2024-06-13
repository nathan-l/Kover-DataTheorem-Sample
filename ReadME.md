# Introduction
When we enable datathorem, we are unable to get coverage reports for all our unit tests. This is a sample project which has datathorem and kover.

Whem we do remove datatheorm from project's build.gradle.kts, we do start seeing coverage reports.

# How to run the tests to generate coverage reports
`./gradlew tasks`

`./gradlew clean :lib:koverHtmlReportDebug`