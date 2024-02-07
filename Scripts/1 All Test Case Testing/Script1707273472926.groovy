import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_Cart'))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_first_name'), 'I Putu')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_last_name'), 'Yudha')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input_(optional)_billing_company'), 'BRI')

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/span_United States (US)'))

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input_Themes Zone_select2-search__field'), 'Indo')

WebUI.sendKeys(findTestObject('Object Repository/Assessment 1 BFLP IT QA/input_Themes Zone_select2-search__field'), Keys.chord(
	Keys.ENTER))


WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_address_1'), 'Jln.Yudhistira No 5 Sukawati Gianyar Bali')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input_(optional)_billing_address_2'), 'BRI')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_city'), 'Gianyar')

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/span_Select an option'))

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input_Themes Zone_select2-search__field'), 'Bali')

WebUI.sendKeys(findTestObject('Object Repository/Assessment 1 BFLP IT QA/input_Themes Zone_select2-search__field'), Keys.chord(
	Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_postcode'), '80582')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_phone'), '081353081122')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input__billing_email'), 'dharmayudhaputu@gmail.com')

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/textarea_(optional)_order_comments'), 'Thanks')

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/button_Place order'))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_Shop'))

WebUI.setText(findTestObject('Object Repository/Testing Ninja Katalon/input_Search for_s'), 'Ninja')

WebUI.sendKeys(findTestObject('Object Repository/Testing Ninja Katalon/input_Search for_s'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/a_CDATA(function()for(var gfunctiontypeof O_f8795c'))

WebUI.click(findTestObject('Object Repository/Testing Ninja Katalon/img'))

WebUI.closeBrowser()

