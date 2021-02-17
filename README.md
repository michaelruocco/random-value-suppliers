# Library Template

[![Build](https://github.com/michaelruocco/random-value-suppliers/workflows/pipeline/badge.svg)](https://github.com/michaelruocco/random-value-suppliers/actions)
[![codecov](https://codecov.io/gh/michaelruocco/random-value-suppliers/branch/master/graph/badge.svg?token=FWDNP534O7)](https://codecov.io/gh/michaelruocco/random-value-suppliers)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/272889cf707b4dcb90bf451392530794)](https://www.codacy.com/gh/michaelruocco/random-value-suppliers/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=michaelruocco/random-value-suppliers&amp;utm_campaign=Badge_Grade)
[![BCH compliance](https://bettercodehub.com/edge/badge/michaelruocco/random-value-suppliers?branch=master)](https://bettercodehub.com/)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_random-value-suppliers&metric=alert_status)](https://sonarcloud.io/dashboard?id=michaelruocco_random-value-suppliers)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_random-value-suppliers&metric=sqale_index)](https://sonarcloud.io/dashboard?id=michaelruocco_random-value-suppliers)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_random-value-suppliers&metric=coverage)](https://sonarcloud.io/dashboard?id=michaelruocco_random-value-suppliers)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_random-value-suppliers&metric=ncloc)](https://sonarcloud.io/dashboard?id=michaelruocco_random-value-suppliers)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.michaelruocco/random-value-suppliers.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.michaelruocco%22%20AND%20a:%22random-value-suppliers%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Overview

This library contains some small utilities for generating random values in a testable way.

### UUIDs

If you need to generate a UUID value you can of course just call ```UUID.randomUUID()``` and this works fine.
However, when you are testing you cannot easily determine what the value will be. This library aims to help with
that by providing the ```UuidGenerator``` interface, in normal execution the ```RandomUuidGenerator``` can
be used to provide a random UUID, this is ultimately just calls ```UUID.randomUUID()```. when testing you
can use ```NonRandomUuidGenerator``` instead, by default it will cycle around 5 fixed UUID values each time
it is called, if you require more than 5 distinct values you can pass in your own list of fixed UUID values
instead if you wish.

### Numeric Strings

For generic string values a similar ```NumericStringGenerator``` interface has been created, the generate method
takes a single argument which determines the length of the numeric string to be returned. If you do not need to
vary the length of the string value you can wrap the generated inside the ```FixedLengthNumericStringGenerator```
class. There are two implementations of ```NumericStringGenerator``` the first is ```RandomNumericStringGenerator```
which unsurprisingly will generate a string containing random digits of the specified length. When testing you
can use ```IncrementingNumericStringGenerator``` this will return predictable results by returning an incrementing
value starting from 1. So if you pass a length of 5, the first 3 calls would return "00001", "00002", "00003".

### Examples

The unit tests for each of the classes listed above demonstrate each of the classes above and how they can be used.

## Useful Commands

```gradle
// cleans build directories
// prints currentVersion
// formats code
// builds code
// runs tests
// checks for gradle issues
// checks dependency versions
./gradlew clean currentVersion dependencyUpdates lintGradle spotlessApply build
```