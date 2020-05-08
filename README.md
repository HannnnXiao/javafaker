# Project-progress-faker

Choice: TA H, Slot 3
Team Name: Faker
Group Members:

卞证(11710901)

林志远(11710712)

唐之遥(11710920)

彭金全(11710918)

韩霄(11710906)

### Processed issue

issue number: 458

test scenario:

When running `number().numberBetween(int min, int max)`, some of the test case can not generate `max-1`

 code to reproduce the bug

```java
@Test
public void numberBetweenInputInt() {
    for (int i = 1; i <= 100; i++) {
        boolean canFind = findLastNumber(i);
        assertTrue(canFind);
    }
}
public boolean findLastNumber(int number) {
    for (int i = 0; i < 100000; i++) {
        int r = faker.number().numberBetween(0, number);
        if (r == number - 1) {
            return true;
        }
    }
    return false;
}
```

Test:

see test.FindRandomLastNumberTest

Solution:

Modify the method `Number.numberBetween(long,long)`, `Number.numberBetween(int,int)` and `Number.randomNumber()`

In these method, use the `faker.random().nextLong()/nextInt()` to replace the position of `decimalBetween(long,long)`