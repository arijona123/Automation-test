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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('page login fix/field_username'), GlobalVariable.username)

WebUI.setText(findTestObject('page login fix/field_password'), GlobalVariable.password)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page login fix/button_Login'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page_tambah_kategori/a_Pengaturan'))

WebUI.click(findTestObject('page_tambah_kategori/a_Resource Management'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page_tambah_kategori/a_Resource Category'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page_tambah_kategori/button_tambah'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page_tambah_kategori/dropdown_referensi'))

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByValue(findTestObject('page_tambah_kategori/dropdown_referensi'), 'RCA-000063', false)

WebUI.setText(findTestObject('page_tambah_kategori/field_judul_kategori'), 'test')

WebUI.setText(findTestObject('page_tambah_kategori/field_keterangan'), 'test')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page_tambah_kategori/button_simpan'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('page_tambah_kategori/button_kembali'))

WebUI.takeFullPageScreenshot()

