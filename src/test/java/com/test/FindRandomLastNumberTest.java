package com.test;

import static org.junit.Assert.assertTrue;

import com.github.javafaker.Faker;
import org.junit.Before;
import org.junit.Test;


/**
 * @author BianZheng
 * the test for debuging that some of the test case can not generate max - 1
 * */
@SuppressWarnings("ALL")
public class FindRandomLastNumberTest {
    Faker faker;

    @Before
    public void Init() {
        faker = new Faker();
    }

    @Test
    public void numberBetweenInputInt() {
        for (int i = 1; i <= 100; i++) {
            boolean canFind = findLastNumber(0,i);
            assertTrue(canFind);
        }
    }

    @Test
	public void numberBetweenInputIntReturnError(){
		for (int i = 1; i <= 100; i++) {
			try {
				boolean canFind = findLastNumber(i,0);
			}catch (IllegalArgumentException e){

			}
		}
	}

	@Test
	public void numberBetweenInputLong() {
		for (long i = 1; i <= 100; i++) {
			boolean canFind = findLastNumber(0,i);
			assertTrue(canFind);
		}
	}

	@Test
	public void randomNumber() {
    	boolean canFind = false;
		for (int i = 0; i < 100000; i++) {
			long r = faker.number().randomNumber();
			if(r == 9){
				canFind = true;
			}
		}
		assertTrue(canFind);
	}

    public boolean findLastNumber(int min,int max) {
		for (int i = 0; i < 100000; i++) {
			int r = faker.number().numberBetween(min, max);
			if (r == max - 1) {
				return true;
			}
		}
        return false;
    }

    public boolean findLastNumber(long min,long max){
		for (int i = 0; i < 100000; i++) {
			long r = faker.number().numberBetween(min,max);
			if (r == max - 1) {
				return true;
			}
		}
		return false;
	}

}
