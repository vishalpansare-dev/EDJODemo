import unittest

class TestShoppingCart(unittest.TestCase):

    def setUp(self):
        self.cart = ShoppingCart()
        self.cart.add_product("Product B")

    def test_remove_product(self):
        self.cart.remove_product("Product B")
        self.assertNotIn("Product B", self.cart.products)
        self.assertEqual(self.cart.item_count(), 0)
        self.assertEqual(self.cart.total_price(), 0)

if __name__ == '__main__':
    unittest.main()