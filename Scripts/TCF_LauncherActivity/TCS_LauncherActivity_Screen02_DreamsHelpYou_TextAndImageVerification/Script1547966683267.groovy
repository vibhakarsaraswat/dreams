import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/vibhakarsaraswat/Documents/devlernings/apks_and_ipas/Android-APKs/com.getdreams_2019-01-14.apk', 
    true)

Mobile.delay(15)

// Verify that correct Screen is displayed at the App Launch (after the DreamLogo display)
Mobile.verifyElementText(findTestObject('ORF_LauncherActivity/ORF_LauncherActivity_Screen02_DreamsHelpYou/android.widget.TextView0 - Dreams help you save money to reach your dreams'), 
    'Dreams help you save money to reach your dreams', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('ORF_LauncherActivity/ORF_LauncherActivity_Screen02_DreamsHelpYou/android.widget.ImageView0'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('ORF_LauncherActivity/ORF_LauncherActivity_Screen02_DreamsHelpYou/android.widget.ImageView1'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ORF_LauncherActivity/ORF_LauncherActivity_Screen02_DreamsHelpYou/android.widget.Button0 - NEXT'), 
    0)

// Verify that clicking on NEXT button navigates to the right screen
Mobile.verifyElementText(findTestObject('ORF_LauncherActivity/ORF_LauncherActivity_Screen03_TheAppMake/android.widget.TextView0 - The app makes saving fun easy and efficient'), 
    'The app makes saving fun, easy and efficient', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

