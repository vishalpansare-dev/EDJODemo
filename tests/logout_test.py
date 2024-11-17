import unittest
from selenium import webdriver

class LogoutTest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.get('http://example.com/login')  # Replace with actual login URL

    def test_logout_after_login(self):
        # Given the user has successfully logged in
        self.driver.find_element_by_id('username').send_keys('your_username')  # Replace with actual username field
        self.driver.find_element_by_id('password').send_keys('your_password')  # Replace with actual password field
        self.driver.find_element_by_id('login-button').click()  # Replace with actual login button

        # When the user clicks the "Logout" button
        self.driver.find_element_by_id('logout-button').click()  # Replace with actual logout button

        # Then the user should be redirected to the login page
        self.assertEqual(self.driver.current_url, 'http://example.com/login')  # Replace with actual login URL

        # And a "Logged out successfully" message should be displayed
        message = self.driver.find_element_by_id('logout-message').text  # Replace with actual message element
        self.assertEqual(message, 'Logged out successfully')

    def tearDown(self):
        self.driver.quit()

if __name__ == '__main__':
    unittest.main()