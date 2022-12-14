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

Mobile.startApplication('C:\\Users\\User\\git\\android-testing\\Data Files\\android-app\\Android-MyDemoAppRN.1.2.0.build-231.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/data_login/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/data_login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/data_login/android.widget.TextView - Log In'), 0)

for (def rowNum = 1; rowNum <= findTestData('Data Files/Data Driven/login'); rowNum++) {
    Mobile.setText(findTestObject('Object Repository/data_login/aw.username'), findTestData('Data Files/Data Driven/login').getValue(
            1, rowNum), 0)

    Mobile.setText(findTestObject('Object Repository/data_login/aw.password'), findTestData('Data Files/Data Driven/login').getValue(
            2, rowNum), 0)

    Mobile.tap(findTestObject('Object Repository/data_login/android.view.ViewGroup'), 0)
}

//Mobile.setText(findTestObject('Object Repository/data_login/aw.username'), Username, 0)
//Mobile.setText(findTestObject('Object Repository/data_login/aw.password'), Password, 0)
//Mobile.tap(findTestObject('Object Repository/data_login/android.view.ViewGroup'), 0)
Mobile.pressBack()

Mobile.closeApplication()

