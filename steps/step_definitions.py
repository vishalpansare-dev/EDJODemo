from behave import given, when, then

@given('the product is in the cart')
def step_impl(context):
    pass

@when('I update the quantity to {quantity}')
def step_impl(context, quantity):
    pass

@then('the cart should reflect the updated quantity')
def step_impl(context):
    pass
