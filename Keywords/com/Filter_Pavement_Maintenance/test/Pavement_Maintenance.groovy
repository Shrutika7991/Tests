package com.Filter_Pavement_Maintenance.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

import internal.GlobalVariable

public class Pavement_Maintenance {

	@Keyword
	public void code() {
		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Filter'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Pavement Evaluation'))

		List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_layers_list'),
				30)

		List<WebElement> allLayersList1 = new ArrayList()

		def allLayersList2 = ((['Sidewalk Evaluation', 'Pavement Maintenance', 'Sidewalk Maintenance', 'Pavement Evaluation']) as String[])

		for (WebElement el : listLayers) {
			allLayersList1.add(el.getText())
		}

		if (allLayersList1.containsAll(allLayersList2)) {
			println('All Layers Present')
		} else {
			throw new Exception('All layers are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Pavement Maintenance'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_Add Expression'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		List<WebElement> listSelectField = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Pavement_Maintenance'),
				30)

		List<WebElement> allFieldsList1 = new ArrayList()

		def allFieldsList2 = ((['OBJECTID', 'PCI_historic', 'notes', 'UID', 'TravelLane', 'SS_ID', 'streetname', 'fromstreetname'
			, 'tostreetname', 'PCI', 'Functional Class', 'Functional Class', 'Length (ft)', 'Width (ft)', 'Maintenance Suggestion'
			, 'Estimated Cost ($)', 'Repair Priority', 'Area (sy)', 'video', 'Last Repair Method', 'Last Repair Cost', 'Last Repair Date'
			, 'Future Event', 'Editor Name', 'Editor Id', 'Last Edit', 'Editor Notes', 'Future Event Date', 'Width (ft)', 'Length (ft)'
			, 'Ward', 'Surface Type', 'Surface Type ID', 'globalid', 'city', 'state', 'country', 'Management Section', 'Need Year'
			, 'L/T Crack Density', 'Alligator Crack Density', 'Bump Density', 'Load Associated Deducts']) as String[])

		for (WebElement el : listSelectField) {
			allFieldsList1.add(el.getText())
		}

		if (allFieldsList1.containsAll(allFieldsList2)) {
			println('All Correct Fields Present')
		} else {
			throw new Exception('All fields are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_OBJECTID'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFiltersList1 = new ArrayList()

		def allFiltersList2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter) {
			allFiltersList1.add(el.getText())
		}

		println(allFiltersList1)

		if (allFiltersList1.containsAll(allFiltersList2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input__input_value'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/svg__0'))

		List<WebElement> listSelectInput = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Input_Type'),
				30)

		List<WebElement> allInputsList1 = new ArrayList()

		def allInputsList2 = ((['value', 'field', 'unique']) as String[])

		for (WebElement el : listSelectInput) {
			allInputsList1.add(el.getText())
		}

		if (allInputsList1.containsAll(allInputsList2)) {
			println('All Input Types Present')
		} else {
			throw new Exception('All input types are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_value'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_PCI_historic'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter1 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters1List1 = new ArrayList()

		def allFilters1List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter1) {
			allFilters1List1.add(el.getText())
		}

		println(allFilters1List1)

		if (allFilters1List1.containsAll(allFilters1List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_notes'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter2 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters2List1 = new ArrayList()

		def allFilters2List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter2) {
			allFilters2List1.add(el.getText())
		}

		println(allFilters2List1)

		if (allFilters2List1.containsAll(allFilters2List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_UID'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter3 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters3List1 = new ArrayList()

		def allFilters3List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter3) {
			allFilters3List1.add(el.getText())
		}

		println(allFilters3List1)

		if (allFilters3List1.containsAll(allFilters3List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_TravelLane'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter4 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters4List1 = new ArrayList()

		def allFilters4List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter4) {
			allFilters4List1.add(el.getText())
		}

		println(allFilters4List1)

		if (allFilters4List1.containsAll(allFilters4List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_SS_ID'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter5 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters5List1 = new ArrayList()

		def allFilters5List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter5) {
			allFilters5List1.add(el.getText())
		}

		println(allFilters5List1)

		if (allFilters5List1.containsAll(allFilters5List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_streetname'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter6 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters6List1 = new ArrayList()

		def allFilters6List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter6) {
			allFilters6List1.add(el.getText())
		}

		println(allFilters6List1)

		if (allFilters6List1.containsAll(allFilters6List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_fromstreetname'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter7 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters7List1 = new ArrayList()

		def allFilters7List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter7) {
			allFilters7List1.add(el.getText())
		}

		println(allFilters7List1)

		if (allFilters7List1.containsAll(allFilters7List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_tostreetname'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter8 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters8List1 = new ArrayList()

		def allFilters8List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter8) {
			allFilters8List1.add(el.getText())
		}

		println(allFilters8List1)

		if (allFilters8List1.containsAll(allFilters8List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_PCI'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter9 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters9List1 = new ArrayList()

		def allFilters9List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter9) {
			allFilters9List1.add(el.getText())
		}

		println(allFilters9List1)

		if (allFilters9List1.containsAll(allFilters9List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Functional Class'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter10 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters10List1 = new ArrayList()

		def allFilters10List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter10) {
			allFilters10List1.add(el.getText())
		}

		println(allFilters10List1)

		if (allFilters10List1.containsAll(allFilters10List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Functional Class ID'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter11 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters11List1 = new ArrayList()

		def allFilters11List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter11) {
			allFilters11List1.add(el.getText())
		}

		println(allFilters11List1)

		if (allFilters11List1.containsAll(allFilters11List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Length (ft)'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter12 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters12List1 = new ArrayList()

		def allFilters12List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter12) {
			allFilters12List1.add(el.getText())
		}

		println(allFilters12List1)

		if (allFilters12List1.containsAll(allFilters12List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Width (ft)'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter13 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters13List1 = new ArrayList()

		def allFilters13List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter13) {
			allFilters13List1.add(el.getText())
		}

		println(allFilters13List1)

		if (allFilters13List1.containsAll(allFilters13List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Maintenance Suggestion'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter14 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters14List1 = new ArrayList()

		def allFilters14List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter14) {
			allFilters14List1.add(el.getText())
		}

		println(allFilters14List1)

		if (allFilters14List1.containsAll(allFilters14List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Estimated Cost ()'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter15 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters15List1 = new ArrayList()

		def allFilters15List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter15) {
			allFilters15List1.add(el.getText())
		}

		println(allFilters15List1)

		if (allFilters15List1.containsAll(allFilters15List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Repair Priority'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter16 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters16List1 = new ArrayList()

		def allFilters16List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter16) {
			allFilters16List1.add(el.getText())
		}

		println(allFilters16List1)

		if (allFilters16List1.containsAll(allFilters16List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Area (sy)'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter17 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters17List1 = new ArrayList()

		def allFilters17List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter17) {
			allFilters17List1.add(el.getText())
		}

		println(allFilters17List1)

		if (allFilters17List1.containsAll(allFilters17List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_video'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter18 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters18List1 = new ArrayList()

		def allFilters18List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter18) {
			allFilters18List1.add(el.getText())
		}

		println(allFilters18List1)

		if (allFilters18List1.containsAll(allFilters18List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Last Repair Method'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter19 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters19List1 = new ArrayList()

		def allFilters19List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter19) {
			allFilters19List1.add(el.getText())
		}

		println(allFilters19List1)

		if (allFilters19List1.containsAll(allFilters19List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Last Repair Cost'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter20 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters20List1 = new ArrayList()

		def allFilters20List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter20) {
			allFilters20List1.add(el.getText())
		}

		println(allFilters20List1)

		if (allFilters20List1.containsAll(allFilters20List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Last Repair Date'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter21 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters21List1 = new ArrayList()

		def allFilters21List2 = ((['is on', 'is not on', 'is in', 'is not in', 'is before', 'is after', 'is on or before', 'is on or after'
			, 'is between', 'is not between', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter21) {
			allFilters21List1.add(el.getText())
		}

		println(allFilters21List1)

		if (allFilters21List1.containsAll(allFilters21List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date2'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date2'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Future Event'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter22 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters22List1 = new ArrayList()

		def allFilters22List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter22) {
			allFilters22List1.add(el.getText())
		}

		println(allFilters22List1)

		if (allFilters22List1.containsAll(allFilters22List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Editor Name'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter23 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters23List1 = new ArrayList()

		def allFilters23List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter23) {
			allFilters23List1.add(el.getText())
		}

		println(allFilters23List1)

		if (allFilters23List1.containsAll(allFilters23List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Editor Id'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter24 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters24List1 = new ArrayList()

		def allFilters24List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter24) {
			allFilters24List1.add(el.getText())
		}

		println(allFilters24List1)

		if (allFilters24List1.containsAll(allFilters24List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Last Edit'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter25 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters25List1 = new ArrayList()

		def allFilters25List2 = ((['is on', 'is not on', 'is in', 'is not in', 'is before', 'is after', 'is on or before', 'is on or after'
			, 'is between', 'is not between', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter25) {
			allFilters25List1.add(el.getText())
		}

		println(allFilters25List1)

		if (allFilters25List1.containsAll(allFilters25List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date2'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date2'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Editor Notes'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter26 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters26List1 = new ArrayList()

		def allFilters26List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter26) {
			allFilters26List1.add(el.getText())
		}

		println(allFilters26List1)

		if (allFilters26List1.containsAll(allFilters26List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Future Event Date'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter27 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters27List1 = new ArrayList()

		def allFilters27List2 = ((['is on', 'is not on', 'is in', 'is not in', 'is before', 'is after', 'is on or before', 'is on or after'
			, 'is between', 'is not between', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter27) {
			allFilters27List1.add(el.getText())
		}

		println(allFilters27List1)

		if (allFilters27List1.containsAll(allFilters27List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date2'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date1'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND_date'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Date2'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_the date2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Width (ft)1'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter28 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters28List1 = new ArrayList()

		def allFilters28List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter28) {
			allFilters28List1.add(el.getText())
		}

		println(allFilters28List1)

		if (allFilters28List1.containsAll(allFilters28List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Length (ft)1'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter29 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters29List1 = new ArrayList()

		def allFilters29List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter29) {
			allFilters29List1.add(el.getText())
		}

		println(allFilters29List1)

		if (allFilters29List1.containsAll(allFilters29List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Ward'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter30 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters30List1 = new ArrayList()

		def allFilters30List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter30) {
			allFilters30List1.add(el.getText())
		}

		println(allFilters30List1)

		if (allFilters30List1.containsAll(allFilters30List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Surface Type'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter31 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters31List1 = new ArrayList()

		def allFilters31List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter31) {
			allFilters31List1.add(el.getText())
		}

		println(allFilters31List1)

		if (allFilters31List1.containsAll(allFilters31List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Surface Type ID'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter32 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters32List1 = new ArrayList()

		def allFilters32List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter32) {
			allFilters32List1.add(el.getText())
		}

		println(allFilters32List1)

		if (allFilters32List1.containsAll(allFilters32List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_globalid'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter33 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters33List1 = new ArrayList()

		def allFilters33List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter33) {
			allFilters33List1.add(el.getText())
		}

		println(allFilters33List1)

		if (allFilters33List1.containsAll(allFilters33List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_city'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter34 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters34List1 = new ArrayList()

		def allFilters34List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter34) {
			allFilters34List1.add(el.getText())
		}

		println(allFilters34List1)

		if (allFilters34List1.containsAll(allFilters34List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_state'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter35 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters35List1 = new ArrayList()

		def allFilters35List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter35) {
			allFilters35List1.add(el.getText())
		}

		println(allFilters35List1)

		if (allFilters35List1.containsAll(allFilters35List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_country'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter36 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters36List1 = new ArrayList()

		def allFilters36List2 = ((['is', 'is not', 'starts with', 'ends with', 'contains', 'does not contain', 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter36) {
			allFilters36List1.add(el.getText())
		}

		println(allFilters36List1)

		if (allFilters36List1.containsAll(allFilters36List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Management Section'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter37 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters37List1 = new ArrayList()

		def allFilters37List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter37) {
			allFilters37List1.add(el.getText())
		}

		println(allFilters37List1)

		if (allFilters37List1.containsAll(allFilters37List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Need Year'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter38 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters38List1 = new ArrayList()

		def allFilters38List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter38) {
			allFilters38List1.add(el.getText())
		}

		println(allFilters38List1)

		if (allFilters38List1.containsAll(allFilters38List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_LT Crack Density'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter39 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters39List1 = new ArrayList()

		def allFilters39List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter39) {
			allFilters39List1.add(el.getText())
		}

		println(allFilters39List1)

		if (allFilters39List1.containsAll(allFilters39List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Alligator Crack Density'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter40 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters40List1 = new ArrayList()

		def allFilters40List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter40) {
			allFilters40List1.add(el.getText())
		}

		println(allFilters40List1)

		if (allFilters40List1.containsAll(allFilters40List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Bump Density'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter41 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters41List1 = new ArrayList()

		def allFilters41List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter41) {
			allFilters41List1.add(el.getText())
		}

		println(allFilters41List1)

		if (allFilters41List1.containsAll(allFilters41List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Field_Name'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_Load Associated Deducts'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		List<WebElement> listSelectFilter42 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter_Pavement_Maintenance'),
				30)

		List<WebElement> allFilters42List1 = new ArrayList()

		def allFilters42List2 = ((['is', 'is not', 'is at least', 'is at most', 'is less than', 'is greater than', 'is between', 'is not between'
			, 'is blank', 'is not blank']) as String[])

		for (WebElement el : listSelectFilter42) {
			allFilters42List1.add(el.getText())
		}

		println(allFilters42List1)

		if (allFilters42List1.containsAll(allFilters42List2)) {
			println('All Correct Filters Present')
		} else {
			throw new Exception('All filters are not in the dropdown')
		}

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))

		WebUI.click(findTestObject('Filter/Filter_Pavement_Maintenance/Page_Streetlogix/div_Select_Filter'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/li_is not between'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_is between_input'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/span_AND'))

		WebUI.click(findTestObject('Object Repository/Filter/Filter_Pavement_Maintenance/Page_Streetlogix/input_AND_input2'))
	}
}