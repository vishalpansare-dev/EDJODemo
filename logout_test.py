# Test for logout functionality

def test_logout():
    # Given the user has successfully logged in
    login()
    
    # When the user clicks the "Logout" button
    click_logout()
    
    # Then the user should be redirected to the login page
    assert current_page() == 'login'
    
    # And a "Logged out successfully" message should be displayed
    assert get_message() == "Logged out successfully"