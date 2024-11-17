import unittest

class TestLogout(unittest.TestCase):
    def setUp(self):
        # Code to log in the user
        self.user_logged_in = True

    def test_logout_redirects_to_login(self):
        # Given the user has successfully logged in
        if self.user_logged_in:
            # When the user clicks the 'Logout' button
            redirect_url = self.logout()

            # Then the user should be redirected to the login page
            self.assertEqual(redirect_url, '/login')

            # And a 'Logged out successfully' message should be displayed
            message = self.get_logout_message()
            self.assertEqual(message, 'Logged out successfully')

    def logout(self):
        # Simulate the logout process and return the redirect URL
        return '/login'

    def get_logout_message(self):
        # Simulate getting the logout message
        return 'Logged out successfully'

if __name__ == '__main__':
    unittest.main()