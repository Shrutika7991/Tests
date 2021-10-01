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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Attribute Editor'))

def data = []

data = CustomKeywords.'com.database_keywords.test.Database_Keywords.array'()

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/label_Select feature by street name'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    'ABBOTT ST')

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ABBY LN'))
WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_SS_ID'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_streetname'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_fromstreetname'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_fromstreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_fromstreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_fromstreetname'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_fromstreetname'), 'ADAMS ST')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ADAMS ST'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_tostreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_tostreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_tostreetname'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_tostreetname'), 'ACCESS RD')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ACCESS RD'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_PCI'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), '85')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Maintenance Suggestion'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Maintenance Suggestion'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Maintenance Suggestion'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Maintenance Suggestion'), 'Reconstruction')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Reconstruction'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Estimated Cost ()'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), '8888')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Repair Priority'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__repair_priority'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__repair_priority'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__repair_priority'), '77.66')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Functional Class'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Functional Class'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Functional Class'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Functional Class'), 'Minor Arterial')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Minor Arterial'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Functional Class'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), 
    '7')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Length (ft)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), 
    '222')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Width (ft)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), 
    '33')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Area (sy)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), 
    '4444')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Surface Type'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Surface Type'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Surface Type'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Surface Type'), 'Asphalt')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Asphalt'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Method'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Last Repair Method'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Last Repair Method'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Last Repair Method'), 'Preventive Maintenance')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Date'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Cost'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), 
    '56565')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Future Event'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Future Event Date'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_notes'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), 'Test')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_UID'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), '15031_1')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_TravelLane'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__travellane'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__travellane'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__travellane'), 
    '2')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Name'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_name'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Id'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Edit'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Notes'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Surface Type ID'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_city'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), 'Portland')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_state'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), 'ME')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_country'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_country'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_country'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_country'), 
    'USA')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Feature attribute updated'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/button_OK'))

WebUI.delay(10)

def array = ((['12', '13', 'ABBOTT ST', 'ADAMS ST', 'ACCESS RD', '85', 'Reconstruction', '8888', '77.66000000', 'Minor Arterial', '7', '222', '33', '4444', 
	'<iframe src="http://pavemon.com/RAID/bulkmedia/ME_Portland_PMT_2019/customer_movies/851.mp4" width="500" height ="400" allowfullscreen></iframe>', 
	'Preventive Maintenance', '56565', null, 'Test', 'Shrutika Sawant', '1026', '2021-09-29 18:51:12', 'Test', null, null, 'Asphalt', 'Portland', 'ME', 'USA', 
	'27', '3', '10', '10', '10', '90', '2', 'Test', '15031_1', null, '0102000020110F00000200000046B6F3750AD95DC14013619BCDAB544128ED0DC222D95DC1C8073DCFF4AB5441']) as String[])

def newData = ((CustomKeywords.'com.database_keywords.test.Database_Keywords.array'()) as String[])

println(newData)
println(array)

for(i=0;i<newData.size();i++) {
if (newData[i] == array[i]) {
    println('Attributes changed for selected feature')
} else {
    throw new Exception('Attributes are not changed for selected feature')
}
}

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Restore Edits'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Pavement Maintenance_Restore_Edits'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Pavement Maintenance_Restore_Edits'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Demo Admin_6368'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Restore'))

WebUI.delay(10)

def newData2 = []

newData2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.array'()

if (data.equals(newData2)) {
    println('Attributes restored')
} else {
    throw new Exception('Restore did not work')
}

