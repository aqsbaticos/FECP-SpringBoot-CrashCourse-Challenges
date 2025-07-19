package myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

	private Product product;

	@BeforeEach
	void setup() {
		product = new Product("Banana", 10.00);
	}

	@Nested
	class WithId {

		@BeforeEach
		void setup() {
			product = new Product((long) 2, "Apple", 25.00);
		}

		@Test
		void getIdWithId() {
			assertEquals( 2, product.getId());
		}
	}

	@Test
	void getIdWithoutId() {
		assertNull(product.getId(), "Product may or may not have an ID = NULL");
	}
	@Test
	void getName() {
		assertEquals("Banana", product.getName());
	}
	@Test
	void getPrice() {
		assertEquals(10.00, product.getPrice());
	}

	@Test
	void setId() {
		product.setId((long)5);
		assertEquals(5, product.getId());
	}

	@Test
	void setName() {
		product.setName("Orange");
		assertEquals("Orange", product.getName());
	}

	@Test
	void setPrice() {
		product.setPrice(20.00);
		assertEquals(20.00, product.getPrice());
	}

	@Test
	void testToString() {
		String expected = "Product{id=" + product.getId() + ", name='" + product.getName() + "', price=" + product.getPrice() + "}";
		assertEquals(product.toString(), expected);
	}

	@Test
	void testEquals() {
		Product newProduct1 = new Product("Banana", 10);
		assertTrue(product.equals(newProduct1));
		Product newProduct2 = new Product("Mango", 50);
		assertFalse(product.equals(newProduct2));
	}

	@Test
	void testHashCode_shouldBeConsistent() {

		int hashCode1 = product.hashCode();
		int hashCode2 = product.hashCode();
		int hashCode3 = product.hashCode();

		assertEquals(hashCode1, hashCode2, "Hash code should be consistent on successive calls");
		assertEquals(hashCode1, hashCode3, "Hash code should be consistent on successive calls");
		assertNotNull(product.hashCode(), "Hash code should not be null (though int cannot be null)");

	}

	@Test
	void testHashCode_shouldBeEqualForEqualObjects() {

		Product newProduct = new Product("Banana", 10);

		assertTrue(newProduct.equals(product));

		int hashCode1 = newProduct.hashCode();
		int hashCode2 = product.hashCode();

		assertEquals(hashCode1, hashCode2);
	}

	@Test
	void testHashCode_shouldBeDifferentForUnequalObjects() {
		Product newProduct = new Product("Cherry", 2.00);
		assertFalse(newProduct.equals(product));
		assertNotEquals(newProduct.hashCode(), product.hashCode());
	}

}