package io.gosaas.cloud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ItemId", "OrganizationId", "OrganizationCode", "ItemClass", "Template", "ItemNumber",
		"ItemDescription", "ApprovalStatusValue", "ItemStatusValue", "LifecyclePhaseValue", "StyleItemFlag",
		"StyleItemNumberValue", "Keyword", "IgnoreDuplicateItemFlag", "UserItemTypeValue", "PackTypeValue",
		"LongDescription", "FormattedDescription", "PrimaryUOMValue", "TransactionConversionValue",
		"DefaultingControlValue", "PositiveDeviationFactor", "NegativeDeviationFactor", "CopyItemAndApplyTemplatesFlag",
		"CopyAssociationsFlag", "CopyAttachmentsFlag", "CopyCategoriesFlag", "CopyFromItemValue",
		"CopyFromRevisionValue", "CopyFromVersionValue", "CopyOrganizationAssignmentsFlag",
		"LastSubmittedNewItemRequest", "ChangeNotice", "ChangeOrderLineSequenceNumber", "StructureItemTypeValue",
		"CreateConfiguredItem", "ConfigModelTypeValue", "EffectivityControlValue", "BaseItemValue",
		"AutoCreatedConfigurationFlag", "PickComponentsFlag", "AssembleToOrderFlag", "CostingEnabledFlag",
		"IncludeInRollUpFlag", "StandardLotSize", "InventoryAssetFlag", "BuildInWIPFlag", "WIPSupplyTypeValue",
		"WIPSupplyLocatorValue", "WIPSupplySubinventoryValue", "OvercompletionToleranceTypeValue",
		"OvercompletionToleranceValue", "InventoryCarryPenalty", "OperationSlackPenalty", "RecipeEnabledFlag",
		"ProcessQualityEnabledFlag", "ProcessCostingEnabledFlag", "ProcessExecutionEnabledFlag",
		"ProcessSupplySubinventoryValue", "ProcessSupplyLocatorValue", "ProcessYieldSubinventoryValue",
		"ProcessYieldLocatorValue", "HazardousMaterialFlag", "CASNumber", "AssetTrackedFlag", "AssetClassValue",
		"ServiceRequestEnabledValue", "DefectTrackingOnFlag", "ServiceDurationTypeValue", "ServiceDuration",
		"ServiceDurationPeriodValue", "ServiceStartTypeValue", "ServiceStartDelay", "AllowSuspendFlag",
		"AllowTerminateFlag", "RequiresItemAssociationFlag", "CreateFixedAssetFlag", "InstanceClassValue",
		"BillingTypeValue", "ServiceBillingEnabledFlag", "RecoveredPartDispositionValue", "InventoryItemFlag",
		"StockEnabledFlag", "MaterialTransactionEnabledFlag", "ReservableFlag", "CheckMaterialShortageFlag",
		"RevisionQuantityControlFlag", "BulkPickedFlag", "LotControlValue", "StartingLotPrefix", "StartingLotNumber",
		"MaturityDays", "HoldDays", "LotExpirationControlValue", "ShelfLifeDays", "RetestInterval",
		"ExpirationActionValue", "ExpirationActionInterval", "ChildLotEnabledFlag", "ChildLotFormatValidationFlag",
		"CopyLotAttributeFlag", "ChildLotPrefix", "ChildLotStartingNumber", "ChildLotParent", "LotTranslateEnabledFlag",
		"LotSplitEnabledFlag", "LotDivisibleFlag", "LotSubstitutionEnabledFlag", "LotMergeEnabledFlag",
		"GradeControlFlag", "DefaultGradeValue", "SerialGenerationValue", "SerialStartingPrefix",
		"SerialStartingNumber", "NegativeMeasurementError", "PositiveMeasurementError", "CycleCountEnabledFlag",
		"LotStatusEnabledFlag", "SerialStatusEnabledFlag", "DefaultLotStatusValue", "DefaultSerialStatusValue",
		"RestrictSubinventoriesFlag", "RestrictLocatorsFlag", "StockLocatorControlValue", "DimensionUOMValue",
		"UnitWidthQuantity", "UnitLengthQuantity", "UnitHeightQuantity", "WeightUOMValue", "UnitWeightQuantity",
		"VolumeUOMValue", "UnitVolumeQuantity", "ContainerItemFlag", "ContainerTypeValue", "MaximumLoadWeight",
		"VehicleItemFlag", "InternalVolume", "MinimumFillPercent", "WarehouseEquipmentFlag", "EventFlag",
		"CollateralFlag", "CustomerOrderFlag", "CustomerOrderEnabledFlag", "ATPComponentsValue", "PickingRuleValue",
		"RMAInspectionRequiredFlag", "EligibilityRuleFlag", "ReturnableFlag", "ATPValue", "FinancingAllowedFlag",
		"SalesProductTypeValue", "TransactionEnabledFlag", "OrderManagementIndivisibleFlag",
		"DefaultSalesOrderSourceTypeValue", "ElectronicFormatFlag", "ShippableFlag", "DefaultShippingOrganizationValue",
		"ShipModelCompleteFlag", "DownloadableFlag", "OverShipmentTolerance", "UnderShipmentTolerance",
		"OverReturnTolerance", "UnderReturnTolerance", "InvoiceEnabledFlag", "AccountingRuleValue", "PaymentTermsValue",
		"OutputTaxClassificationCodeValue", "InvoicedFlag", "InvoicingRuleValue", "SalesAccountValue", "WebStatusValue",
		"BackOrderableFlag", "OrderableOnWebFlag", "MinimumLicenseQuantity", "InventoryPlanningMethodValue",
		"PlanningMakeBuyValue", "Planner", "SubcontractingComponentValue", "MinimumMinmaxQuantity",
		"MaximumMinmaxQuantity", "MinimumOrderQuantity", "MaximumOrderQuantity", "OrderCost", "SourceOrganizationValue",
		"SourceSubinventoryOrganizationValue", "SourceSubinventoryValue", "FixedOrderQuantity", "FixedDaysSupply",
		"FixedLotSizeMultiplier", "ReleaseAuthorizationRequiredValue", "AutomaticallyExpireASNFlag", "ConsignedFlag",
		"ReplenishmentMinimumOrder", "ReplenishmentMaximumOrder", "VMIFixedOrderQuantity", "ForecastTypelValue",
		"ForecastHorizon", "PlanningMethodValue", "RoundingControlTypeFlag", "CreateSupplyFlag", "PlanningTimeFence",
		"DemandTimeFence", "ReleaseTimeFence", "ShrinkageRate", "ForecastControlValue", "AcceptableEarlyDays",
		"PlanningTimeDays", "DemandTimeDays", "ReleaseTimeDays", "MRPCalculateATPFlag", "RepairLeadtime", "RepairYield",
		"PreprocessingDays", "PostprocessingDays", "ProcessingDays", "VariableLeadTime", "CumulativeTotalLeadTime",
		"FixedLeadTime", "CumulativeManufacturingLeadTime", "LeadTimeLotSize", "PurchasingFlag",
		"UseApprovedSupplierFlag", "NegotiationRequiredFlag", "PurchasingInputTaxClassificationValue",
		"InvoiceCloseTolerancePercentage", "HazardClassValue", "AssetCategoryValue", "PurchasableFlag", "TaxableFlag",
		"BuyerOrganizationValue", "DefaultBuyerValue", "ReceiptCloseTolerancePercentage", "UNNumberValue", "ListPrice",
		"PriceTolerancePercentage", "MarketPrice", "RoundingFactor", "MatchApprovalLevelValue",
		"MatchConfigurationOptionValue", "ReceiptDateActionValue", "DaysEarlyReceiptAllowed", "DaysLateReceiptAllowed",
		"AllowSubstituteReceiptsFlag", "AllowUnorderedReceiptsFlag", "QuantityReceivedToleranceAction",
		"QuantityReceivedTolerancePercentage", "ItemExtensibleFlexfieldCategoryCode", "CreationDate", "LastUpdateDate",
		"BackToBackEnabledFlag", "ContractManufacturingFlag", "DaysOfCover", "DemandPeriod",
		"SafetyStockPlanningMethodValue", "OutsideProcessServiceFlag", "AllowMaintenanceAssetFlag",
		"EnableGenealogyTrackingFlag", "EngineeredItemFlag", "ProcurementBusinessUnitName", "ForcePurchaseLeadTimeFlag",
		"ReplacementTypeValue", "BuyerEmailAddress", "AssetTrackedValue", "RequestId", "CreatedBy", "CreationDateTime",
		"LastUpdateDateTime", "LastUpdateLogin", "LastUpdatedBy", "InternallyTransferableFlag",
		"TransferOrdersEnabledFlag", "ReplenishmentMaximumDaysOfSupply", "CustomerSelfServiceEnabledFlag",
		"AllowPurchasingDocumentDescriptionUpdateFlag", "EnableContractCoverage", "CarryingCostPercentage",
		"ReplenishmentMinimumDaysOfSupply", "AllowExpressTransactionsFlag", "ReceiptRoutingValue",
		"InvoiceMatchOptionValue", "CommsActivationRequiredFlag", "RequiresFulfillmentLocationFlag", "IssueUOMValue",
		"EnforceShipToLocationValue", "StandardCoverageValue", "ReplenishmentSourceTypeValue", "TrackingUOMValue",
		"SecondaryUOMValue", "PricingUOMValue", "HardPeggingLevelValue", "CommonSupplyProjectDemandFlag",
		"EnableIotFlag", "ExpenditureTypeValue", "PackagingStringValue", "CreateSupplyAfterDate",
		"CreateFixedAssetValue", "UnderCompletionToleranceTypeValue", "UnderCompletionToleranceValue", "links" })
@Generated("jsonschema2pojo")
public class ItemCloud {

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", organizationId=" + organizationId + ", organizationCode="
				+ organizationCode + ", itemClass=" + itemClass + ", template=" + template + ", itemNumber="
				+ itemNumber + ", itemDescription=" + itemDescription + ", approvalStatusValue=" + approvalStatusValue
				+ ", itemStatusValue=" + itemStatusValue + ", lifecyclePhaseValue=" + lifecyclePhaseValue
				+ ", styleItemFlag=" + styleItemFlag + ", styleItemNumberValue=" + styleItemNumberValue + ", keyword="
				+ keyword + ", ignoreDuplicateItemFlag=" + ignoreDuplicateItemFlag + ", userItemTypeValue="
				+ userItemTypeValue + ", packTypeValue=" + packTypeValue + ", longDescription=" + longDescription
				+ ", formattedDescription=" + formattedDescription + ", primaryUOMValue=" + primaryUOMValue
				+ ", transactionConversionValue=" + transactionConversionValue + ", defaultingControlValue="
				+ defaultingControlValue + ", positiveDeviationFactor=" + positiveDeviationFactor
				+ ", negativeDeviationFactor=" + negativeDeviationFactor + ", copyItemAndApplyTemplatesFlag="
				+ copyItemAndApplyTemplatesFlag + ", copyAssociationsFlag=" + copyAssociationsFlag
				+ ", copyAttachmentsFlag=" + copyAttachmentsFlag + ", copyCategoriesFlag=" + copyCategoriesFlag
				+ ", copyFromItemValue=" + copyFromItemValue + ", copyFromRevisionValue=" + copyFromRevisionValue
				+ ", copyFromVersionValue=" + copyFromVersionValue + ", copyOrganizationAssignmentsFlag="
				+ copyOrganizationAssignmentsFlag + ", lastSubmittedNewItemRequest=" + lastSubmittedNewItemRequest
				+ ", changeNotice=" + changeNotice + ", changeOrderLineSequenceNumber=" + changeOrderLineSequenceNumber
				+ ", structureItemTypeValue=" + structureItemTypeValue + ", createConfiguredItem="
				+ createConfiguredItem + ", configModelTypeValue=" + configModelTypeValue + ", effectivityControlValue="
				+ effectivityControlValue + ", baseItemValue=" + baseItemValue + ", autoCreatedConfigurationFlag="
				+ autoCreatedConfigurationFlag + ", pickComponentsFlag=" + pickComponentsFlag + ", assembleToOrderFlag="
				+ assembleToOrderFlag + ", costingEnabledFlag=" + costingEnabledFlag + ", includeInRollUpFlag="
				+ includeInRollUpFlag + ", standardLotSize=" + standardLotSize + ", inventoryAssetFlag="
				+ inventoryAssetFlag + ", buildInWIPFlag=" + buildInWIPFlag + ", wIPSupplyTypeValue="
				+ wIPSupplyTypeValue + ", wIPSupplyLocatorValue=" + wIPSupplyLocatorValue
				+ ", wIPSupplySubinventoryValue=" + wIPSupplySubinventoryValue + ", overcompletionToleranceTypeValue="
				+ overcompletionToleranceTypeValue + ", overcompletionToleranceValue=" + overcompletionToleranceValue
				+ ", inventoryCarryPenalty=" + inventoryCarryPenalty + ", operationSlackPenalty="
				+ operationSlackPenalty + ", recipeEnabledFlag=" + recipeEnabledFlag + ", processQualityEnabledFlag="
				+ processQualityEnabledFlag + ", processCostingEnabledFlag=" + processCostingEnabledFlag
				+ ", processExecutionEnabledFlag=" + processExecutionEnabledFlag + ", processSupplySubinventoryValue="
				+ processSupplySubinventoryValue + ", processSupplyLocatorValue=" + processSupplyLocatorValue
				+ ", processYieldSubinventoryValue=" + processYieldSubinventoryValue + ", processYieldLocatorValue="
				+ processYieldLocatorValue + ", hazardousMaterialFlag=" + hazardousMaterialFlag + ", cASNumber="
				+ cASNumber + ", assetTrackedFlag=" + assetTrackedFlag + ", assetClassValue=" + assetClassValue
				+ ", serviceRequestEnabledValue=" + serviceRequestEnabledValue + ", defectTrackingOnFlag="
				+ defectTrackingOnFlag + ", serviceDurationTypeValue=" + serviceDurationTypeValue + ", serviceDuration="
				+ serviceDuration + ", serviceDurationPeriodValue=" + serviceDurationPeriodValue
				+ ", serviceStartTypeValue=" + serviceStartTypeValue + ", serviceStartDelay=" + serviceStartDelay
				+ ", allowSuspendFlag=" + allowSuspendFlag + ", allowTerminateFlag=" + allowTerminateFlag
				+ ", requiresItemAssociationFlag=" + requiresItemAssociationFlag + ", createFixedAssetFlag="
				+ createFixedAssetFlag + ", instanceClassValue=" + instanceClassValue + ", billingTypeValue="
				+ billingTypeValue + ", serviceBillingEnabledFlag=" + serviceBillingEnabledFlag
				+ ", recoveredPartDispositionValue=" + recoveredPartDispositionValue + ", inventoryItemFlag="
				+ inventoryItemFlag + ", stockEnabledFlag=" + stockEnabledFlag + ", materialTransactionEnabledFlag="
				+ materialTransactionEnabledFlag + ", reservableFlag=" + reservableFlag + ", checkMaterialShortageFlag="
				+ checkMaterialShortageFlag + ", revisionQuantityControlFlag=" + revisionQuantityControlFlag
				+ ", bulkPickedFlag=" + bulkPickedFlag + ", lotControlValue=" + lotControlValue + ", startingLotPrefix="
				+ startingLotPrefix + ", startingLotNumber=" + startingLotNumber + ", maturityDays=" + maturityDays
				+ ", holdDays=" + holdDays + ", lotExpirationControlValue=" + lotExpirationControlValue
				+ ", shelfLifeDays=" + shelfLifeDays + ", retestInterval=" + retestInterval + ", expirationActionValue="
				+ expirationActionValue + ", expirationActionInterval=" + expirationActionInterval
				+ ", childLotEnabledFlag=" + childLotEnabledFlag + ", childLotFormatValidationFlag="
				+ childLotFormatValidationFlag + ", copyLotAttributeFlag=" + copyLotAttributeFlag + ", childLotPrefix="
				+ childLotPrefix + ", childLotStartingNumber=" + childLotStartingNumber + ", childLotParent="
				+ childLotParent + ", lotTranslateEnabledFlag=" + lotTranslateEnabledFlag + ", lotSplitEnabledFlag="
				+ lotSplitEnabledFlag + ", lotDivisibleFlag=" + lotDivisibleFlag + ", lotSubstitutionEnabledFlag="
				+ lotSubstitutionEnabledFlag + ", lotMergeEnabledFlag=" + lotMergeEnabledFlag + ", gradeControlFlag="
				+ gradeControlFlag + ", defaultGradeValue=" + defaultGradeValue + ", serialGenerationValue="
				+ serialGenerationValue + ", serialStartingPrefix=" + serialStartingPrefix + ", serialStartingNumber="
				+ serialStartingNumber + ", negativeMeasurementError=" + negativeMeasurementError
				+ ", positiveMeasurementError=" + positiveMeasurementError + ", cycleCountEnabledFlag="
				+ cycleCountEnabledFlag + ", lotStatusEnabledFlag=" + lotStatusEnabledFlag
				+ ", serialStatusEnabledFlag=" + serialStatusEnabledFlag + ", defaultLotStatusValue="
				+ defaultLotStatusValue + ", defaultSerialStatusValue=" + defaultSerialStatusValue
				+ ", restrictSubinventoriesFlag=" + restrictSubinventoriesFlag + ", restrictLocatorsFlag="
				+ restrictLocatorsFlag + ", stockLocatorControlValue=" + stockLocatorControlValue
				+ ", dimensionUOMValue=" + dimensionUOMValue + ", unitWidthQuantity=" + unitWidthQuantity
				+ ", unitLengthQuantity=" + unitLengthQuantity + ", unitHeightQuantity=" + unitHeightQuantity
				+ ", weightUOMValue=" + weightUOMValue + ", unitWeightQuantity=" + unitWeightQuantity
				+ ", volumeUOMValue=" + volumeUOMValue + ", unitVolumeQuantity=" + unitVolumeQuantity
				+ ", containerItemFlag=" + containerItemFlag + ", containerTypeValue=" + containerTypeValue
				+ ", maximumLoadWeight=" + maximumLoadWeight + ", vehicleItemFlag=" + vehicleItemFlag
				+ ", internalVolume=" + internalVolume + ", minimumFillPercent=" + minimumFillPercent
				+ ", warehouseEquipmentFlag=" + warehouseEquipmentFlag + ", eventFlag=" + eventFlag
				+ ", collateralFlag=" + collateralFlag + ", customerOrderFlag=" + customerOrderFlag
				+ ", customerOrderEnabledFlag=" + customerOrderEnabledFlag + ", aTPComponentsValue="
				+ aTPComponentsValue + ", pickingRuleValue=" + pickingRuleValue + ", rMAInspectionRequiredFlag="
				+ rMAInspectionRequiredFlag + ", eligibilityRuleFlag=" + eligibilityRuleFlag + ", returnableFlag="
				+ returnableFlag + ", aTPValue=" + aTPValue + ", financingAllowedFlag=" + financingAllowedFlag
				+ ", salesProductTypeValue=" + salesProductTypeValue + ", transactionEnabledFlag="
				+ transactionEnabledFlag + ", orderManagementIndivisibleFlag=" + orderManagementIndivisibleFlag
				+ ", defaultSalesOrderSourceTypeValue=" + defaultSalesOrderSourceTypeValue + ", electronicFormatFlag="
				+ electronicFormatFlag + ", shippableFlag=" + shippableFlag + ", defaultShippingOrganizationValue="
				+ defaultShippingOrganizationValue + ", shipModelCompleteFlag=" + shipModelCompleteFlag
				+ ", downloadableFlag=" + downloadableFlag + ", overShipmentTolerance=" + overShipmentTolerance
				+ ", underShipmentTolerance=" + underShipmentTolerance + ", overReturnTolerance=" + overReturnTolerance
				+ ", underReturnTolerance=" + underReturnTolerance + ", invoiceEnabledFlag=" + invoiceEnabledFlag
				+ ", accountingRuleValue=" + accountingRuleValue + ", paymentTermsValue=" + paymentTermsValue
				+ ", outputTaxClassificationCodeValue=" + outputTaxClassificationCodeValue + ", invoicedFlag="
				+ invoicedFlag + ", invoicingRuleValue=" + invoicingRuleValue + ", salesAccountValue="
				+ salesAccountValue + ", webStatusValue=" + webStatusValue + ", backOrderableFlag=" + backOrderableFlag
				+ ", orderableOnWebFlag=" + orderableOnWebFlag + ", minimumLicenseQuantity=" + minimumLicenseQuantity
				+ ", inventoryPlanningMethodValue=" + inventoryPlanningMethodValue + ", planningMakeBuyValue="
				+ planningMakeBuyValue + ", planner=" + planner + ", subcontractingComponentValue="
				+ subcontractingComponentValue + ", minimumMinmaxQuantity=" + minimumMinmaxQuantity
				+ ", maximumMinmaxQuantity=" + maximumMinmaxQuantity + ", minimumOrderQuantity=" + minimumOrderQuantity
				+ ", maximumOrderQuantity=" + maximumOrderQuantity + ", orderCost=" + orderCost
				+ ", sourceOrganizationValue=" + sourceOrganizationValue + ", sourceSubinventoryOrganizationValue="
				+ sourceSubinventoryOrganizationValue + ", sourceSubinventoryValue=" + sourceSubinventoryValue
				+ ", fixedOrderQuantity=" + fixedOrderQuantity + ", fixedDaysSupply=" + fixedDaysSupply
				+ ", fixedLotSizeMultiplier=" + fixedLotSizeMultiplier + ", releaseAuthorizationRequiredValue="
				+ releaseAuthorizationRequiredValue + ", automaticallyExpireASNFlag=" + automaticallyExpireASNFlag
				+ ", consignedFlag=" + consignedFlag + ", replenishmentMinimumOrder=" + replenishmentMinimumOrder
				+ ", replenishmentMaximumOrder=" + replenishmentMaximumOrder + ", vMIFixedOrderQuantity="
				+ vMIFixedOrderQuantity + ", forecastTypelValue=" + forecastTypelValue + ", forecastHorizon="
				+ forecastHorizon + ", planningMethodValue=" + planningMethodValue + ", roundingControlTypeFlag="
				+ roundingControlTypeFlag + ", createSupplyFlag=" + createSupplyFlag + ", planningTimeFence="
				+ planningTimeFence + ", demandTimeFence=" + demandTimeFence + ", releaseTimeFence=" + releaseTimeFence
				+ ", shrinkageRate=" + shrinkageRate + ", forecastControlValue=" + forecastControlValue
				+ ", acceptableEarlyDays=" + acceptableEarlyDays + ", planningTimeDays=" + planningTimeDays
				+ ", demandTimeDays=" + demandTimeDays + ", releaseTimeDays=" + releaseTimeDays
				+ ", mRPCalculateATPFlag=" + mRPCalculateATPFlag + ", repairLeadtime=" + repairLeadtime
				+ ", repairYield=" + repairYield + ", preprocessingDays=" + preprocessingDays + ", postprocessingDays="
				+ postprocessingDays + ", processingDays=" + processingDays + ", variableLeadTime=" + variableLeadTime
				+ ", cumulativeTotalLeadTime=" + cumulativeTotalLeadTime + ", fixedLeadTime=" + fixedLeadTime
				+ ", cumulativeManufacturingLeadTime=" + cumulativeManufacturingLeadTime + ", leadTimeLotSize="
				+ leadTimeLotSize + ", purchasingFlag=" + purchasingFlag + ", useApprovedSupplierFlag="
				+ useApprovedSupplierFlag + ", negotiationRequiredFlag=" + negotiationRequiredFlag
				+ ", purchasingInputTaxClassificationValue=" + purchasingInputTaxClassificationValue
				+ ", invoiceCloseTolerancePercentage=" + invoiceCloseTolerancePercentage + ", hazardClassValue="
				+ hazardClassValue + ", assetCategoryValue=" + assetCategoryValue + ", purchasableFlag="
				+ purchasableFlag + ", taxableFlag=" + taxableFlag + ", buyerOrganizationValue="
				+ buyerOrganizationValue + ", defaultBuyerValue=" + defaultBuyerValue
				+ ", receiptCloseTolerancePercentage=" + receiptCloseTolerancePercentage + ", uNNumberValue="
				+ uNNumberValue + ", listPrice=" + listPrice + ", priceTolerancePercentage=" + priceTolerancePercentage
				+ ", marketPrice=" + marketPrice + ", roundingFactor=" + roundingFactor + ", matchApprovalLevelValue="
				+ matchApprovalLevelValue + ", matchConfigurationOptionValue=" + matchConfigurationOptionValue
				+ ", receiptDateActionValue=" + receiptDateActionValue + ", daysEarlyReceiptAllowed="
				+ daysEarlyReceiptAllowed + ", daysLateReceiptAllowed=" + daysLateReceiptAllowed
				+ ", allowSubstituteReceiptsFlag=" + allowSubstituteReceiptsFlag + ", allowUnorderedReceiptsFlag="
				+ allowUnorderedReceiptsFlag + ", quantityReceivedToleranceAction=" + quantityReceivedToleranceAction
				+ ", quantityReceivedTolerancePercentage=" + quantityReceivedTolerancePercentage
				+ ", itemExtensibleFlexfieldCategoryCode=" + itemExtensibleFlexfieldCategoryCode + ", creationDate="
				+ creationDate + ", lastUpdateDate=" + lastUpdateDate + ", backToBackEnabledFlag="
				+ backToBackEnabledFlag + ", contractManufacturingFlag=" + contractManufacturingFlag + ", daysOfCover="
				+ daysOfCover + ", demandPeriod=" + demandPeriod + ", safetyStockPlanningMethodValue="
				+ safetyStockPlanningMethodValue + ", outsideProcessServiceFlag=" + outsideProcessServiceFlag
				+ ", allowMaintenanceAssetFlag=" + allowMaintenanceAssetFlag + ", enableGenealogyTrackingFlag="
				+ enableGenealogyTrackingFlag + ", engineeredItemFlag=" + engineeredItemFlag
				+ ", procurementBusinessUnitName=" + procurementBusinessUnitName + ", forcePurchaseLeadTimeFlag="
				+ forcePurchaseLeadTimeFlag + ", replacementTypeValue=" + replacementTypeValue + ", buyerEmailAddress="
				+ buyerEmailAddress + ", assetTrackedValue=" + assetTrackedValue + ", requestId=" + requestId
				+ ", createdBy=" + createdBy + ", creationDateTime=" + creationDateTime + ", lastUpdateDateTime="
				+ lastUpdateDateTime + ", lastUpdateLogin=" + lastUpdateLogin + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", internallyTransferableFlag=" + internallyTransferableFlag + ", transferOrdersEnabledFlag="
				+ transferOrdersEnabledFlag + ", replenishmentMaximumDaysOfSupply=" + replenishmentMaximumDaysOfSupply
				+ ", customerSelfServiceEnabledFlag=" + customerSelfServiceEnabledFlag
				+ ", allowPurchasingDocumentDescriptionUpdateFlag=" + allowPurchasingDocumentDescriptionUpdateFlag
				+ ", enableContractCoverage=" + enableContractCoverage + ", carryingCostPercentage="
				+ carryingCostPercentage + ", replenishmentMinimumDaysOfSupply=" + replenishmentMinimumDaysOfSupply
				+ ", allowExpressTransactionsFlag=" + allowExpressTransactionsFlag + ", receiptRoutingValue="
				+ receiptRoutingValue + ", invoiceMatchOptionValue=" + invoiceMatchOptionValue
				+ ", commsActivationRequiredFlag=" + commsActivationRequiredFlag + ", requiresFulfillmentLocationFlag="
				+ requiresFulfillmentLocationFlag + ", issueUOMValue=" + issueUOMValue + ", enforceShipToLocationValue="
				+ enforceShipToLocationValue + ", standardCoverageValue=" + standardCoverageValue
				+ ", replenishmentSourceTypeValue=" + replenishmentSourceTypeValue + ", trackingUOMValue="
				+ trackingUOMValue + ", secondaryUOMValue=" + secondaryUOMValue + ", pricingUOMValue=" + pricingUOMValue
				+ ", hardPeggingLevelValue=" + hardPeggingLevelValue + ", commonSupplyProjectDemandFlag="
				+ commonSupplyProjectDemandFlag + ", enableIotFlag=" + enableIotFlag + ", expenditureTypeValue="
				+ expenditureTypeValue + ", packagingStringValue=" + packagingStringValue + ", createSupplyAfterDate="
				+ createSupplyAfterDate + ", createFixedAssetValue=" + createFixedAssetValue
				+ ", underCompletionToleranceTypeValue=" + underCompletionToleranceTypeValue
				+ ", underCompletionToleranceValue=" + underCompletionToleranceValue + ", links=" + links
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("ItemId")
	private Long itemId;
	@JsonProperty("OrganizationId")
	private Long organizationId;
	@JsonProperty("OrganizationCode")
	private String organizationCode;
	@JsonProperty("ItemClass")
	private String itemClass;
	@JsonProperty("Template")
	private Object template;
	@JsonProperty("ItemNumber")
	private String itemNumber;
	@JsonProperty("ItemDescription")
	private String itemDescription;
	@JsonProperty("ApprovalStatusValue")
	private String approvalStatusValue;
	@JsonProperty("ItemStatusValue")
	private String itemStatusValue;
	@JsonProperty("LifecyclePhaseValue")
	private String lifecyclePhaseValue;
	@JsonProperty("StyleItemFlag")
	private Object styleItemFlag;
	@JsonProperty("StyleItemNumberValue")
	private String styleItemNumberValue;
	@JsonProperty("Keyword")
	private Object keyword;
	@JsonProperty("IgnoreDuplicateItemFlag")
	private Object ignoreDuplicateItemFlag;
	@JsonProperty("UserItemTypeValue")
	private String userItemTypeValue;
	@JsonProperty("PackTypeValue")
	private String packTypeValue;
	@JsonProperty("LongDescription")
	private Object longDescription;
	@JsonProperty("FormattedDescription")
	private Object formattedDescription;
	@JsonProperty("PrimaryUOMValue")
	private String primaryUOMValue;
	@JsonProperty("TransactionConversionValue")
	private String transactionConversionValue;
	@JsonProperty("DefaultingControlValue")
	private Object defaultingControlValue;
	@JsonProperty("PositiveDeviationFactor")
	private Integer positiveDeviationFactor;
	@JsonProperty("NegativeDeviationFactor")
	private Integer negativeDeviationFactor;
	@JsonProperty("CopyItemAndApplyTemplatesFlag")
	private Object copyItemAndApplyTemplatesFlag;
	@JsonProperty("CopyAssociationsFlag")
	private Object copyAssociationsFlag;
	@JsonProperty("CopyAttachmentsFlag")
	private Object copyAttachmentsFlag;
	@JsonProperty("CopyCategoriesFlag")
	private Object copyCategoriesFlag;
	@JsonProperty("CopyFromItemValue")
	private Object copyFromItemValue;
	@JsonProperty("CopyFromRevisionValue")
	private Object copyFromRevisionValue;
	@JsonProperty("CopyFromVersionValue")
	private Object copyFromVersionValue;
	@JsonProperty("CopyOrganizationAssignmentsFlag")
	private Object copyOrganizationAssignmentsFlag;
	@JsonProperty("LastSubmittedNewItemRequest")
	private Object lastSubmittedNewItemRequest;
	@JsonProperty("ChangeNotice")
	private Object changeNotice;
	@JsonProperty("ChangeOrderLineSequenceNumber")
	private Object changeOrderLineSequenceNumber;
	@JsonProperty("StructureItemTypeValue")
	private String structureItemTypeValue;
	@JsonProperty("CreateConfiguredItem")
	private Object createConfiguredItem;
	@JsonProperty("ConfigModelTypeValue")
	private String configModelTypeValue;
	@JsonProperty("EffectivityControlValue")
	private String effectivityControlValue;
	@JsonProperty("BaseItemValue")
	private Object baseItemValue;
	@JsonProperty("AutoCreatedConfigurationFlag")
	private Boolean autoCreatedConfigurationFlag;
	@JsonProperty("PickComponentsFlag")
	private Boolean pickComponentsFlag;
	@JsonProperty("AssembleToOrderFlag")
	private Boolean assembleToOrderFlag;
	@JsonProperty("CostingEnabledFlag")
	private Boolean costingEnabledFlag;
	@JsonProperty("IncludeInRollUpFlag")
	private Object includeInRollUpFlag;
	@JsonProperty("StandardLotSize")
	private Object standardLotSize;
	@JsonProperty("InventoryAssetFlag")
	private Boolean inventoryAssetFlag;
	@JsonProperty("BuildInWIPFlag")
	private Boolean buildInWIPFlag;
	@JsonProperty("WIPSupplyTypeValue")
	private String wIPSupplyTypeValue;
	@JsonProperty("WIPSupplyLocatorValue")
	private Object wIPSupplyLocatorValue;
	@JsonProperty("WIPSupplySubinventoryValue")
	private Object wIPSupplySubinventoryValue;
	@JsonProperty("OvercompletionToleranceTypeValue")
	private Object overcompletionToleranceTypeValue;
	@JsonProperty("OvercompletionToleranceValue")
	private Object overcompletionToleranceValue;
	@JsonProperty("InventoryCarryPenalty")
	private Object inventoryCarryPenalty;
	@JsonProperty("OperationSlackPenalty")
	private Object operationSlackPenalty;
	@JsonProperty("RecipeEnabledFlag")
	private Boolean recipeEnabledFlag;
	@JsonProperty("ProcessQualityEnabledFlag")
	private Boolean processQualityEnabledFlag;
	@JsonProperty("ProcessCostingEnabledFlag")
	private Boolean processCostingEnabledFlag;
	@JsonProperty("ProcessExecutionEnabledFlag")
	private Boolean processExecutionEnabledFlag;
	@JsonProperty("ProcessSupplySubinventoryValue")
	private Object processSupplySubinventoryValue;
	@JsonProperty("ProcessSupplyLocatorValue")
	private Object processSupplyLocatorValue;
	@JsonProperty("ProcessYieldSubinventoryValue")
	private Object processYieldSubinventoryValue;
	@JsonProperty("ProcessYieldLocatorValue")
	private Object processYieldLocatorValue;
	@JsonProperty("HazardousMaterialFlag")
	private Boolean hazardousMaterialFlag;
	@JsonProperty("CASNumber")
	private Object cASNumber;
	@JsonProperty("AssetTrackedFlag")
	private Boolean assetTrackedFlag;
	@JsonProperty("AssetClassValue")
	private String assetClassValue;
	@JsonProperty("ServiceRequestEnabledValue")
	private Object serviceRequestEnabledValue;
	@JsonProperty("DefectTrackingOnFlag")
	private Object defectTrackingOnFlag;
	@JsonProperty("ServiceDurationTypeValue")
	private String serviceDurationTypeValue;
	@JsonProperty("ServiceDuration")
	private Object serviceDuration;
	@JsonProperty("ServiceDurationPeriodValue")
	private Object serviceDurationPeriodValue;
	@JsonProperty("ServiceStartTypeValue")
	private String serviceStartTypeValue;
	@JsonProperty("ServiceStartDelay")
	private Integer serviceStartDelay;
	@JsonProperty("AllowSuspendFlag")
	private Boolean allowSuspendFlag;
	@JsonProperty("AllowTerminateFlag")
	private Boolean allowTerminateFlag;
	@JsonProperty("RequiresItemAssociationFlag")
	private Boolean requiresItemAssociationFlag;
	@JsonProperty("CreateFixedAssetFlag")
	private Object createFixedAssetFlag;
	@JsonProperty("InstanceClassValue")
	private Object instanceClassValue;
	@JsonProperty("BillingTypeValue")
	private Object billingTypeValue;
	@JsonProperty("ServiceBillingEnabledFlag")
	private Boolean serviceBillingEnabledFlag;
	@JsonProperty("RecoveredPartDispositionValue")
	private Object recoveredPartDispositionValue;
	@JsonProperty("InventoryItemFlag")
	private Boolean inventoryItemFlag;
	@JsonProperty("StockEnabledFlag")
	private Boolean stockEnabledFlag;
	@JsonProperty("MaterialTransactionEnabledFlag")
	private Boolean materialTransactionEnabledFlag;
	@JsonProperty("ReservableFlag")
	private Boolean reservableFlag;
	@JsonProperty("CheckMaterialShortageFlag")
	private Boolean checkMaterialShortageFlag;
	@JsonProperty("RevisionQuantityControlFlag")
	private Boolean revisionQuantityControlFlag;
	@JsonProperty("BulkPickedFlag")
	private Boolean bulkPickedFlag;
	@JsonProperty("LotControlValue")
	private String lotControlValue;
	@JsonProperty("StartingLotPrefix")
	private Object startingLotPrefix;
	@JsonProperty("StartingLotNumber")
	private Object startingLotNumber;
	@JsonProperty("MaturityDays")
	private Object maturityDays;
	@JsonProperty("HoldDays")
	private Object holdDays;
	@JsonProperty("LotExpirationControlValue")
	private String lotExpirationControlValue;
	@JsonProperty("ShelfLifeDays")
	private Integer shelfLifeDays;
	@JsonProperty("RetestInterval")
	private Object retestInterval;
	@JsonProperty("ExpirationActionValue")
	private Object expirationActionValue;
	@JsonProperty("ExpirationActionInterval")
	private Object expirationActionInterval;
	@JsonProperty("ChildLotEnabledFlag")
	private Boolean childLotEnabledFlag;
	@JsonProperty("ChildLotFormatValidationFlag")
	private Boolean childLotFormatValidationFlag;
	@JsonProperty("CopyLotAttributeFlag")
	private Boolean copyLotAttributeFlag;
	@JsonProperty("ChildLotPrefix")
	private Object childLotPrefix;
	@JsonProperty("ChildLotStartingNumber")
	private Object childLotStartingNumber;
	@JsonProperty("ChildLotParent")
	private Object childLotParent;
	@JsonProperty("LotTranslateEnabledFlag")
	private Boolean lotTranslateEnabledFlag;
	@JsonProperty("LotSplitEnabledFlag")
	private Boolean lotSplitEnabledFlag;
	@JsonProperty("LotDivisibleFlag")
	private Boolean lotDivisibleFlag;
	@JsonProperty("LotSubstitutionEnabledFlag")
	private Object lotSubstitutionEnabledFlag;
	@JsonProperty("LotMergeEnabledFlag")
	private Boolean lotMergeEnabledFlag;
	@JsonProperty("GradeControlFlag")
	private Boolean gradeControlFlag;
	@JsonProperty("DefaultGradeValue")
	private Object defaultGradeValue;
	@JsonProperty("SerialGenerationValue")
	private String serialGenerationValue;
	@JsonProperty("SerialStartingPrefix")
	private Object serialStartingPrefix;
	@JsonProperty("SerialStartingNumber")
	private Object serialStartingNumber;
	@JsonProperty("NegativeMeasurementError")
	private Object negativeMeasurementError;
	@JsonProperty("PositiveMeasurementError")
	private Object positiveMeasurementError;
	@JsonProperty("CycleCountEnabledFlag")
	private Boolean cycleCountEnabledFlag;
	@JsonProperty("LotStatusEnabledFlag")
	private Boolean lotStatusEnabledFlag;
	@JsonProperty("SerialStatusEnabledFlag")
	private Boolean serialStatusEnabledFlag;
	@JsonProperty("DefaultLotStatusValue")
	private Object defaultLotStatusValue;
	@JsonProperty("DefaultSerialStatusValue")
	private Object defaultSerialStatusValue;
	@JsonProperty("RestrictSubinventoriesFlag")
	private Boolean restrictSubinventoriesFlag;
	@JsonProperty("RestrictLocatorsFlag")
	private Boolean restrictLocatorsFlag;
	@JsonProperty("StockLocatorControlValue")
	private String stockLocatorControlValue;
	@JsonProperty("DimensionUOMValue")
	private Object dimensionUOMValue;
	@JsonProperty("UnitWidthQuantity")
	private Object unitWidthQuantity;
	@JsonProperty("UnitLengthQuantity")
	private Object unitLengthQuantity;
	@JsonProperty("UnitHeightQuantity")
	private Object unitHeightQuantity;
	@JsonProperty("WeightUOMValue")
	private Object weightUOMValue;
	@JsonProperty("UnitWeightQuantity")
	private Object unitWeightQuantity;
	@JsonProperty("VolumeUOMValue")
	private Object volumeUOMValue;
	@JsonProperty("UnitVolumeQuantity")
	private Object unitVolumeQuantity;
	@JsonProperty("ContainerItemFlag")
	private Object containerItemFlag;
	@JsonProperty("ContainerTypeValue")
	private Object containerTypeValue;
	@JsonProperty("MaximumLoadWeight")
	private Object maximumLoadWeight;
	@JsonProperty("VehicleItemFlag")
	private Object vehicleItemFlag;
	@JsonProperty("InternalVolume")
	private Object internalVolume;
	@JsonProperty("MinimumFillPercent")
	private Object minimumFillPercent;
	@JsonProperty("WarehouseEquipmentFlag")
	private Boolean warehouseEquipmentFlag;
	@JsonProperty("EventFlag")
	private Object eventFlag;
	@JsonProperty("CollateralFlag")
	private Object collateralFlag;
	@JsonProperty("CustomerOrderFlag")
	private Boolean customerOrderFlag;
	@JsonProperty("CustomerOrderEnabledFlag")
	private Boolean customerOrderEnabledFlag;
	@JsonProperty("ATPComponentsValue")
	private String aTPComponentsValue;
	@JsonProperty("PickingRuleValue")
	private Object pickingRuleValue;
	@JsonProperty("RMAInspectionRequiredFlag")
	private Boolean rMAInspectionRequiredFlag;
	@JsonProperty("EligibilityRuleFlag")
	private Object eligibilityRuleFlag;
	@JsonProperty("ReturnableFlag")
	private Boolean returnableFlag;
	@JsonProperty("ATPValue")
	private String aTPValue;
	@JsonProperty("FinancingAllowedFlag")
	private Object financingAllowedFlag;
	@JsonProperty("SalesProductTypeValue")
	private Object salesProductTypeValue;
	@JsonProperty("TransactionEnabledFlag")
	private Boolean transactionEnabledFlag;
	@JsonProperty("OrderManagementIndivisibleFlag")
	private Object orderManagementIndivisibleFlag;
	@JsonProperty("DefaultSalesOrderSourceTypeValue")
	private String defaultSalesOrderSourceTypeValue;
	@JsonProperty("ElectronicFormatFlag")
	private Object electronicFormatFlag;
	@JsonProperty("ShippableFlag")
	private Boolean shippableFlag;
	@JsonProperty("DefaultShippingOrganizationValue")
	private Object defaultShippingOrganizationValue;
	@JsonProperty("ShipModelCompleteFlag")
	private Boolean shipModelCompleteFlag;
	@JsonProperty("DownloadableFlag")
	private Object downloadableFlag;
	@JsonProperty("OverShipmentTolerance")
	private Object overShipmentTolerance;
	@JsonProperty("UnderShipmentTolerance")
	private Object underShipmentTolerance;
	@JsonProperty("OverReturnTolerance")
	private Object overReturnTolerance;
	@JsonProperty("UnderReturnTolerance")
	private Object underReturnTolerance;
	@JsonProperty("InvoiceEnabledFlag")
	private Boolean invoiceEnabledFlag;
	@JsonProperty("AccountingRuleValue")
	private Object accountingRuleValue;
	@JsonProperty("PaymentTermsValue")
	private Object paymentTermsValue;
	@JsonProperty("OutputTaxClassificationCodeValue")
	private Object outputTaxClassificationCodeValue;
	@JsonProperty("InvoicedFlag")
	private Boolean invoicedFlag;
	@JsonProperty("InvoicingRuleValue")
	private Object invoicingRuleValue;
	@JsonProperty("SalesAccountValue")
	private Object salesAccountValue;
	@JsonProperty("WebStatusValue")
	private String webStatusValue;
	@JsonProperty("BackOrderableFlag")
	private Object backOrderableFlag;
	@JsonProperty("OrderableOnWebFlag")
	private Boolean orderableOnWebFlag;
	@JsonProperty("MinimumLicenseQuantity")
	private Object minimumLicenseQuantity;
	@JsonProperty("InventoryPlanningMethodValue")
	private String inventoryPlanningMethodValue;
	@JsonProperty("PlanningMakeBuyValue")
	private String planningMakeBuyValue;
	@JsonProperty("Planner")
	private Object planner;
	@JsonProperty("SubcontractingComponentValue")
	private Object subcontractingComponentValue;
	@JsonProperty("MinimumMinmaxQuantity")
	private Object minimumMinmaxQuantity;
	@JsonProperty("MaximumMinmaxQuantity")
	private Object maximumMinmaxQuantity;
	@JsonProperty("MinimumOrderQuantity")
	private Object minimumOrderQuantity;
	@JsonProperty("MaximumOrderQuantity")
	private Object maximumOrderQuantity;
	@JsonProperty("OrderCost")
	private Object orderCost;
	@JsonProperty("SourceOrganizationValue")
	private Object sourceOrganizationValue;
	@JsonProperty("SourceSubinventoryOrganizationValue")
	private Object sourceSubinventoryOrganizationValue;
	@JsonProperty("SourceSubinventoryValue")
	private Object sourceSubinventoryValue;
	@JsonProperty("FixedOrderQuantity")
	private Object fixedOrderQuantity;
	@JsonProperty("FixedDaysSupply")
	private Object fixedDaysSupply;
	@JsonProperty("FixedLotSizeMultiplier")
	private Object fixedLotSizeMultiplier;
	@JsonProperty("ReleaseAuthorizationRequiredValue")
	private String releaseAuthorizationRequiredValue;
	@JsonProperty("AutomaticallyExpireASNFlag")
	private Boolean automaticallyExpireASNFlag;
	@JsonProperty("ConsignedFlag")
	private Boolean consignedFlag;
	@JsonProperty("ReplenishmentMinimumOrder")
	private Object replenishmentMinimumOrder;
	@JsonProperty("ReplenishmentMaximumOrder")
	private Object replenishmentMaximumOrder;
	@JsonProperty("VMIFixedOrderQuantity")
	private Object vMIFixedOrderQuantity;
	@JsonProperty("ForecastTypelValue")
	private String forecastTypelValue;
	@JsonProperty("ForecastHorizon")
	private Object forecastHorizon;
	@JsonProperty("PlanningMethodValue")
	private String planningMethodValue;
	@JsonProperty("RoundingControlTypeFlag")
	private Object roundingControlTypeFlag;
	@JsonProperty("CreateSupplyFlag")
	private Boolean createSupplyFlag;
	@JsonProperty("PlanningTimeFence")
	private String planningTimeFence;
	@JsonProperty("DemandTimeFence")
	private Object demandTimeFence;
	@JsonProperty("ReleaseTimeFence")
	private Object releaseTimeFence;
	@JsonProperty("ShrinkageRate")
	private Object shrinkageRate;
	@JsonProperty("ForecastControlValue")
	private Object forecastControlValue;
	@JsonProperty("AcceptableEarlyDays")
	private Object acceptableEarlyDays;
	@JsonProperty("PlanningTimeDays")
	private Integer planningTimeDays;
	@JsonProperty("DemandTimeDays")
	private Object demandTimeDays;
	@JsonProperty("ReleaseTimeDays")
	private Object releaseTimeDays;
	@JsonProperty("MRPCalculateATPFlag")
	private Object mRPCalculateATPFlag;
	@JsonProperty("RepairLeadtime")
	private Object repairLeadtime;
	@JsonProperty("RepairYield")
	private Object repairYield;
	@JsonProperty("PreprocessingDays")
	private Object preprocessingDays;
	@JsonProperty("PostprocessingDays")
	private Integer postprocessingDays;
	@JsonProperty("ProcessingDays")
	private Object processingDays;
	@JsonProperty("VariableLeadTime")
	private Object variableLeadTime;
	@JsonProperty("CumulativeTotalLeadTime")
	private Object cumulativeTotalLeadTime;
	@JsonProperty("FixedLeadTime")
	private Object fixedLeadTime;
	@JsonProperty("CumulativeManufacturingLeadTime")
	private Object cumulativeManufacturingLeadTime;
	@JsonProperty("LeadTimeLotSize")
	private Integer leadTimeLotSize;
	@JsonProperty("PurchasingFlag")
	private Boolean purchasingFlag;
	@JsonProperty("UseApprovedSupplierFlag")
	private Boolean useApprovedSupplierFlag;
	@JsonProperty("NegotiationRequiredFlag")
	private Object negotiationRequiredFlag;
	@JsonProperty("PurchasingInputTaxClassificationValue")
	private Object purchasingInputTaxClassificationValue;
	@JsonProperty("InvoiceCloseTolerancePercentage")
	private Object invoiceCloseTolerancePercentage;
	@JsonProperty("HazardClassValue")
	private Object hazardClassValue;
	@JsonProperty("AssetCategoryValue")
	private Object assetCategoryValue;
	@JsonProperty("PurchasableFlag")
	private Boolean purchasableFlag;
	@JsonProperty("TaxableFlag")
	private Boolean taxableFlag;
	@JsonProperty("BuyerOrganizationValue")
	private Object buyerOrganizationValue;
	@JsonProperty("DefaultBuyerValue")
	private Object defaultBuyerValue;
	@JsonProperty("ReceiptCloseTolerancePercentage")
	private Object receiptCloseTolerancePercentage;
	@JsonProperty("UNNumberValue")
	private Object uNNumberValue;
	@JsonProperty("ListPrice")
	private Object listPrice;
	@JsonProperty("PriceTolerancePercentage")
	private Object priceTolerancePercentage;
	@JsonProperty("MarketPrice")
	private Object marketPrice;
	@JsonProperty("RoundingFactor")
	private Object roundingFactor;
	@JsonProperty("MatchApprovalLevelValue")
	private Object matchApprovalLevelValue;
	@JsonProperty("MatchConfigurationOptionValue")
	private Object matchConfigurationOptionValue;
	@JsonProperty("ReceiptDateActionValue")
	private Object receiptDateActionValue;
	@JsonProperty("DaysEarlyReceiptAllowed")
	private Object daysEarlyReceiptAllowed;
	@JsonProperty("DaysLateReceiptAllowed")
	private Object daysLateReceiptAllowed;
	@JsonProperty("AllowSubstituteReceiptsFlag")
	private Object allowSubstituteReceiptsFlag;
	@JsonProperty("AllowUnorderedReceiptsFlag")
	private Object allowUnorderedReceiptsFlag;
	@JsonProperty("QuantityReceivedToleranceAction")
	private Object quantityReceivedToleranceAction;
	@JsonProperty("QuantityReceivedTolerancePercentage")
	private Object quantityReceivedTolerancePercentage;
	@JsonProperty("ItemExtensibleFlexfieldCategoryCode")
	private String itemExtensibleFlexfieldCategoryCode;
	@JsonProperty("CreationDate")
	private String creationDate;
	@JsonProperty("LastUpdateDate")
	private String lastUpdateDate;
	@JsonProperty("BackToBackEnabledFlag")
	private Boolean backToBackEnabledFlag;
	@JsonProperty("ContractManufacturingFlag")
	private Boolean contractManufacturingFlag;
	@JsonProperty("DaysOfCover")
	private Object daysOfCover;
	@JsonProperty("DemandPeriod")
	private Object demandPeriod;
	@JsonProperty("SafetyStockPlanningMethodValue")
	private String safetyStockPlanningMethodValue;
	@JsonProperty("OutsideProcessServiceFlag")
	private Boolean outsideProcessServiceFlag;
	@JsonProperty("AllowMaintenanceAssetFlag")
	private Boolean allowMaintenanceAssetFlag;
	@JsonProperty("EnableGenealogyTrackingFlag")
	private Boolean enableGenealogyTrackingFlag;
	@JsonProperty("EngineeredItemFlag")
	private Boolean engineeredItemFlag;
	@JsonProperty("ProcurementBusinessUnitName")
	private Object procurementBusinessUnitName;
	@JsonProperty("ForcePurchaseLeadTimeFlag")
	private Boolean forcePurchaseLeadTimeFlag;
	@JsonProperty("ReplacementTypeValue")
	private Object replacementTypeValue;
	@JsonProperty("BuyerEmailAddress")
	private Object buyerEmailAddress;
	@JsonProperty("AssetTrackedValue")
	private String assetTrackedValue;
	@JsonProperty("RequestId")
	private Integer requestId;
	@JsonProperty("CreatedBy")
	private String createdBy;
	@JsonProperty("CreationDateTime")
	private String creationDateTime;
	@JsonProperty("LastUpdateDateTime")
	private String lastUpdateDateTime;
	@JsonProperty("LastUpdateLogin")
	private String lastUpdateLogin;
	@JsonProperty("LastUpdatedBy")
	private String lastUpdatedBy;
	@JsonProperty("InternallyTransferableFlag")
	private Boolean internallyTransferableFlag;
	@JsonProperty("TransferOrdersEnabledFlag")
	private Boolean transferOrdersEnabledFlag;
	@JsonProperty("ReplenishmentMaximumDaysOfSupply")
	private Object replenishmentMaximumDaysOfSupply;
	@JsonProperty("CustomerSelfServiceEnabledFlag")
	private Boolean customerSelfServiceEnabledFlag;
	@JsonProperty("AllowPurchasingDocumentDescriptionUpdateFlag")
	private Boolean allowPurchasingDocumentDescriptionUpdateFlag;
	@JsonProperty("EnableContractCoverage")
	private Boolean enableContractCoverage;
	@JsonProperty("CarryingCostPercentage")
	private Object carryingCostPercentage;
	@JsonProperty("ReplenishmentMinimumDaysOfSupply")
	private Object replenishmentMinimumDaysOfSupply;
	@JsonProperty("AllowExpressTransactionsFlag")
	private Object allowExpressTransactionsFlag;
	@JsonProperty("ReceiptRoutingValue")
	private Object receiptRoutingValue;
	@JsonProperty("InvoiceMatchOptionValue")
	private Object invoiceMatchOptionValue;
	@JsonProperty("CommsActivationRequiredFlag")
	private Object commsActivationRequiredFlag;
	@JsonProperty("RequiresFulfillmentLocationFlag")
	private Boolean requiresFulfillmentLocationFlag;
	@JsonProperty("IssueUOMValue")
	private Object issueUOMValue;
	@JsonProperty("EnforceShipToLocationValue")
	private Object enforceShipToLocationValue;
	@JsonProperty("StandardCoverageValue")
	private Object standardCoverageValue;
	@JsonProperty("ReplenishmentSourceTypeValue")
	private Object replenishmentSourceTypeValue;
	@JsonProperty("TrackingUOMValue")
	private String trackingUOMValue;
	@JsonProperty("SecondaryUOMValue")
	private Object secondaryUOMValue;
	@JsonProperty("PricingUOMValue")
	private String pricingUOMValue;
	@JsonProperty("HardPeggingLevelValue")
	private String hardPeggingLevelValue;
	@JsonProperty("CommonSupplyProjectDemandFlag")
	private Object commonSupplyProjectDemandFlag;
	@JsonProperty("EnableIotFlag")
	private Boolean enableIotFlag;
	@JsonProperty("ExpenditureTypeValue")
	private Object expenditureTypeValue;
	@JsonProperty("PackagingStringValue")
	private Object packagingStringValue;
	@JsonProperty("CreateSupplyAfterDate")
	private Object createSupplyAfterDate;
	@JsonProperty("CreateFixedAssetValue")
	private Object createFixedAssetValue;
	@JsonProperty("UnderCompletionToleranceTypeValue")
	private Object underCompletionToleranceTypeValue;
	@JsonProperty("UnderCompletionToleranceValue")
	private Object underCompletionToleranceValue;
	@JsonProperty("links")
	private List<Link> links = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ItemId")
	public Long getItemId() {
		return itemId;
	}

	@JsonProperty("ItemId")
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@JsonProperty("OrganizationId")
	public Long getOrganizationId() {
		return organizationId;
	}

	@JsonProperty("OrganizationId")
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	@JsonProperty("OrganizationCode")
	public String getOrganizationCode() {
		return organizationCode;
	}

	@JsonProperty("OrganizationCode")
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	@JsonProperty("ItemClass")
	public String getItemClass() {
		return itemClass;
	}

	@JsonProperty("ItemClass")
	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}

	@JsonProperty("Template")
	public Object getTemplate() {
		return template;
	}

	@JsonProperty("Template")
	public void setTemplate(Object template) {
		this.template = template;
	}

	@JsonProperty("ItemNumber")
	public String getItemNumber() {
		return itemNumber;
	}

	@JsonProperty("ItemNumber")
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	@JsonProperty("ItemDescription")
	public String getItemDescription() {
		return itemDescription;
	}

	@JsonProperty("ItemDescription")
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@JsonProperty("ApprovalStatusValue")
	public String getApprovalStatusValue() {
		return approvalStatusValue;
	}

	@JsonProperty("ApprovalStatusValue")
	public void setApprovalStatusValue(String approvalStatusValue) {
		this.approvalStatusValue = approvalStatusValue;
	}

	@JsonProperty("ItemStatusValue")
	public String getItemStatusValue() {
		return itemStatusValue;
	}

	@JsonProperty("ItemStatusValue")
	public void setItemStatusValue(String itemStatusValue) {
		this.itemStatusValue = itemStatusValue;
	}

	@JsonProperty("LifecyclePhaseValue")
	public String getLifecyclePhaseValue() {
		return lifecyclePhaseValue;
	}

	@JsonProperty("LifecyclePhaseValue")
	public void setLifecyclePhaseValue(String lifecyclePhaseValue) {
		this.lifecyclePhaseValue = lifecyclePhaseValue;
	}

	@JsonProperty("StyleItemFlag")
	public Object getStyleItemFlag() {
		return styleItemFlag;
	}

	@JsonProperty("StyleItemFlag")
	public void setStyleItemFlag(Object styleItemFlag) {
		this.styleItemFlag = styleItemFlag;
	}

	@JsonProperty("StyleItemNumberValue")
	public String getStyleItemNumberValue() {
		return styleItemNumberValue;
	}

	@JsonProperty("StyleItemNumberValue")
	public void setStyleItemNumberValue(String styleItemNumberValue) {
		this.styleItemNumberValue = styleItemNumberValue;
	}

	@JsonProperty("Keyword")
	public Object getKeyword() {
		return keyword;
	}

	@JsonProperty("Keyword")
	public void setKeyword(Object keyword) {
		this.keyword = keyword;
	}

	@JsonProperty("IgnoreDuplicateItemFlag")
	public Object getIgnoreDuplicateItemFlag() {
		return ignoreDuplicateItemFlag;
	}

	@JsonProperty("IgnoreDuplicateItemFlag")
	public void setIgnoreDuplicateItemFlag(Object ignoreDuplicateItemFlag) {
		this.ignoreDuplicateItemFlag = ignoreDuplicateItemFlag;
	}

	@JsonProperty("UserItemTypeValue")
	public String getUserItemTypeValue() {
		return userItemTypeValue;
	}

	@JsonProperty("UserItemTypeValue")
	public void setUserItemTypeValue(String userItemTypeValue) {
		this.userItemTypeValue = userItemTypeValue;
	}

	@JsonProperty("PackTypeValue")
	public String getPackTypeValue() {
		return packTypeValue;
	}

	@JsonProperty("PackTypeValue")
	public void setPackTypeValue(String packTypeValue) {
		this.packTypeValue = packTypeValue;
	}

	@JsonProperty("LongDescription")
	public Object getLongDescription() {
		return longDescription;
	}

	@JsonProperty("LongDescription")
	public void setLongDescription(Object longDescription) {
		this.longDescription = longDescription;
	}

	@JsonProperty("FormattedDescription")
	public Object getFormattedDescription() {
		return formattedDescription;
	}

	@JsonProperty("FormattedDescription")
	public void setFormattedDescription(Object formattedDescription) {
		this.formattedDescription = formattedDescription;
	}

	@JsonProperty("PrimaryUOMValue")
	public String getPrimaryUOMValue() {
		return primaryUOMValue;
	}

	@JsonProperty("PrimaryUOMValue")
	public void setPrimaryUOMValue(String primaryUOMValue) {
		this.primaryUOMValue = primaryUOMValue;
	}

	@JsonProperty("TransactionConversionValue")
	public String getTransactionConversionValue() {
		return transactionConversionValue;
	}

	@JsonProperty("TransactionConversionValue")
	public void setTransactionConversionValue(String transactionConversionValue) {
		this.transactionConversionValue = transactionConversionValue;
	}

	@JsonProperty("DefaultingControlValue")
	public Object getDefaultingControlValue() {
		return defaultingControlValue;
	}

	@JsonProperty("DefaultingControlValue")
	public void setDefaultingControlValue(Object defaultingControlValue) {
		this.defaultingControlValue = defaultingControlValue;
	}

	@JsonProperty("PositiveDeviationFactor")
	public Integer getPositiveDeviationFactor() {
		return positiveDeviationFactor;
	}

	@JsonProperty("PositiveDeviationFactor")
	public void setPositiveDeviationFactor(Integer positiveDeviationFactor) {
		this.positiveDeviationFactor = positiveDeviationFactor;
	}

	@JsonProperty("NegativeDeviationFactor")
	public Integer getNegativeDeviationFactor() {
		return negativeDeviationFactor;
	}

	@JsonProperty("NegativeDeviationFactor")
	public void setNegativeDeviationFactor(Integer negativeDeviationFactor) {
		this.negativeDeviationFactor = negativeDeviationFactor;
	}

	@JsonProperty("CopyItemAndApplyTemplatesFlag")
	public Object getCopyItemAndApplyTemplatesFlag() {
		return copyItemAndApplyTemplatesFlag;
	}

	@JsonProperty("CopyItemAndApplyTemplatesFlag")
	public void setCopyItemAndApplyTemplatesFlag(Object copyItemAndApplyTemplatesFlag) {
		this.copyItemAndApplyTemplatesFlag = copyItemAndApplyTemplatesFlag;
	}

	@JsonProperty("CopyAssociationsFlag")
	public Object getCopyAssociationsFlag() {
		return copyAssociationsFlag;
	}

	@JsonProperty("CopyAssociationsFlag")
	public void setCopyAssociationsFlag(Object copyAssociationsFlag) {
		this.copyAssociationsFlag = copyAssociationsFlag;
	}

	@JsonProperty("CopyAttachmentsFlag")
	public Object getCopyAttachmentsFlag() {
		return copyAttachmentsFlag;
	}

	@JsonProperty("CopyAttachmentsFlag")
	public void setCopyAttachmentsFlag(Object copyAttachmentsFlag) {
		this.copyAttachmentsFlag = copyAttachmentsFlag;
	}

	@JsonProperty("CopyCategoriesFlag")
	public Object getCopyCategoriesFlag() {
		return copyCategoriesFlag;
	}

	@JsonProperty("CopyCategoriesFlag")
	public void setCopyCategoriesFlag(Object copyCategoriesFlag) {
		this.copyCategoriesFlag = copyCategoriesFlag;
	}

	@JsonProperty("CopyFromItemValue")
	public Object getCopyFromItemValue() {
		return copyFromItemValue;
	}

	@JsonProperty("CopyFromItemValue")
	public void setCopyFromItemValue(Object copyFromItemValue) {
		this.copyFromItemValue = copyFromItemValue;
	}

	@JsonProperty("CopyFromRevisionValue")
	public Object getCopyFromRevisionValue() {
		return copyFromRevisionValue;
	}

	@JsonProperty("CopyFromRevisionValue")
	public void setCopyFromRevisionValue(Object copyFromRevisionValue) {
		this.copyFromRevisionValue = copyFromRevisionValue;
	}

	@JsonProperty("CopyFromVersionValue")
	public Object getCopyFromVersionValue() {
		return copyFromVersionValue;
	}

	@JsonProperty("CopyFromVersionValue")
	public void setCopyFromVersionValue(Object copyFromVersionValue) {
		this.copyFromVersionValue = copyFromVersionValue;
	}

	@JsonProperty("CopyOrganizationAssignmentsFlag")
	public Object getCopyOrganizationAssignmentsFlag() {
		return copyOrganizationAssignmentsFlag;
	}

	@JsonProperty("CopyOrganizationAssignmentsFlag")
	public void setCopyOrganizationAssignmentsFlag(Object copyOrganizationAssignmentsFlag) {
		this.copyOrganizationAssignmentsFlag = copyOrganizationAssignmentsFlag;
	}

	@JsonProperty("LastSubmittedNewItemRequest")
	public Object getLastSubmittedNewItemRequest() {
		return lastSubmittedNewItemRequest;
	}

	@JsonProperty("LastSubmittedNewItemRequest")
	public void setLastSubmittedNewItemRequest(Object lastSubmittedNewItemRequest) {
		this.lastSubmittedNewItemRequest = lastSubmittedNewItemRequest;
	}

	@JsonProperty("ChangeNotice")
	public Object getChangeNotice() {
		return changeNotice;
	}

	@JsonProperty("ChangeNotice")
	public void setChangeNotice(Object changeNotice) {
		this.changeNotice = changeNotice;
	}

	@JsonProperty("ChangeOrderLineSequenceNumber")
	public Object getChangeOrderLineSequenceNumber() {
		return changeOrderLineSequenceNumber;
	}

	@JsonProperty("ChangeOrderLineSequenceNumber")
	public void setChangeOrderLineSequenceNumber(Object changeOrderLineSequenceNumber) {
		this.changeOrderLineSequenceNumber = changeOrderLineSequenceNumber;
	}

	@JsonProperty("StructureItemTypeValue")
	public String getStructureItemTypeValue() {
		return structureItemTypeValue;
	}

	@JsonProperty("StructureItemTypeValue")
	public void setStructureItemTypeValue(String structureItemTypeValue) {
		this.structureItemTypeValue = structureItemTypeValue;
	}

	@JsonProperty("CreateConfiguredItem")
	public Object getCreateConfiguredItem() {
		return createConfiguredItem;
	}

	@JsonProperty("CreateConfiguredItem")
	public void setCreateConfiguredItem(Object createConfiguredItem) {
		this.createConfiguredItem = createConfiguredItem;
	}

	@JsonProperty("ConfigModelTypeValue")
	public String getConfigModelTypeValue() {
		return configModelTypeValue;
	}

	@JsonProperty("ConfigModelTypeValue")
	public void setConfigModelTypeValue(String configModelTypeValue) {
		this.configModelTypeValue = configModelTypeValue;
	}

	@JsonProperty("EffectivityControlValue")
	public String getEffectivityControlValue() {
		return effectivityControlValue;
	}

	@JsonProperty("EffectivityControlValue")
	public void setEffectivityControlValue(String effectivityControlValue) {
		this.effectivityControlValue = effectivityControlValue;
	}

	@JsonProperty("BaseItemValue")
	public Object getBaseItemValue() {
		return baseItemValue;
	}

	@JsonProperty("BaseItemValue")
	public void setBaseItemValue(Object baseItemValue) {
		this.baseItemValue = baseItemValue;
	}

	@JsonProperty("AutoCreatedConfigurationFlag")
	public Boolean getAutoCreatedConfigurationFlag() {
		return autoCreatedConfigurationFlag;
	}

	@JsonProperty("AutoCreatedConfigurationFlag")
	public void setAutoCreatedConfigurationFlag(Boolean autoCreatedConfigurationFlag) {
		this.autoCreatedConfigurationFlag = autoCreatedConfigurationFlag;
	}

	@JsonProperty("PickComponentsFlag")
	public Boolean getPickComponentsFlag() {
		return pickComponentsFlag;
	}

	@JsonProperty("PickComponentsFlag")
	public void setPickComponentsFlag(Boolean pickComponentsFlag) {
		this.pickComponentsFlag = pickComponentsFlag;
	}

	@JsonProperty("AssembleToOrderFlag")
	public Boolean getAssembleToOrderFlag() {
		return assembleToOrderFlag;
	}

	@JsonProperty("AssembleToOrderFlag")
	public void setAssembleToOrderFlag(Boolean assembleToOrderFlag) {
		this.assembleToOrderFlag = assembleToOrderFlag;
	}

	@JsonProperty("CostingEnabledFlag")
	public Boolean getCostingEnabledFlag() {
		return costingEnabledFlag;
	}

	@JsonProperty("CostingEnabledFlag")
	public void setCostingEnabledFlag(Boolean costingEnabledFlag) {
		this.costingEnabledFlag = costingEnabledFlag;
	}

	@JsonProperty("IncludeInRollUpFlag")
	public Object getIncludeInRollUpFlag() {
		return includeInRollUpFlag;
	}

	@JsonProperty("IncludeInRollUpFlag")
	public void setIncludeInRollUpFlag(Object includeInRollUpFlag) {
		this.includeInRollUpFlag = includeInRollUpFlag;
	}

	@JsonProperty("StandardLotSize")
	public Object getStandardLotSize() {
		return standardLotSize;
	}

	@JsonProperty("StandardLotSize")
	public void setStandardLotSize(Object standardLotSize) {
		this.standardLotSize = standardLotSize;
	}

	@JsonProperty("InventoryAssetFlag")
	public Boolean getInventoryAssetFlag() {
		return inventoryAssetFlag;
	}

	@JsonProperty("InventoryAssetFlag")
	public void setInventoryAssetFlag(Boolean inventoryAssetFlag) {
		this.inventoryAssetFlag = inventoryAssetFlag;
	}

	@JsonProperty("BuildInWIPFlag")
	public Boolean getBuildInWIPFlag() {
		return buildInWIPFlag;
	}

	@JsonProperty("BuildInWIPFlag")
	public void setBuildInWIPFlag(Boolean buildInWIPFlag) {
		this.buildInWIPFlag = buildInWIPFlag;
	}

	@JsonProperty("WIPSupplyTypeValue")
	public String getWIPSupplyTypeValue() {
		return wIPSupplyTypeValue;
	}

	@JsonProperty("WIPSupplyTypeValue")
	public void setWIPSupplyTypeValue(String wIPSupplyTypeValue) {
		this.wIPSupplyTypeValue = wIPSupplyTypeValue;
	}

	@JsonProperty("WIPSupplyLocatorValue")
	public Object getWIPSupplyLocatorValue() {
		return wIPSupplyLocatorValue;
	}

	@JsonProperty("WIPSupplyLocatorValue")
	public void setWIPSupplyLocatorValue(Object wIPSupplyLocatorValue) {
		this.wIPSupplyLocatorValue = wIPSupplyLocatorValue;
	}

	@JsonProperty("WIPSupplySubinventoryValue")
	public Object getWIPSupplySubinventoryValue() {
		return wIPSupplySubinventoryValue;
	}

	@JsonProperty("WIPSupplySubinventoryValue")
	public void setWIPSupplySubinventoryValue(Object wIPSupplySubinventoryValue) {
		this.wIPSupplySubinventoryValue = wIPSupplySubinventoryValue;
	}

	@JsonProperty("OvercompletionToleranceTypeValue")
	public Object getOvercompletionToleranceTypeValue() {
		return overcompletionToleranceTypeValue;
	}

	@JsonProperty("OvercompletionToleranceTypeValue")
	public void setOvercompletionToleranceTypeValue(Object overcompletionToleranceTypeValue) {
		this.overcompletionToleranceTypeValue = overcompletionToleranceTypeValue;
	}

	@JsonProperty("OvercompletionToleranceValue")
	public Object getOvercompletionToleranceValue() {
		return overcompletionToleranceValue;
	}

	@JsonProperty("OvercompletionToleranceValue")
	public void setOvercompletionToleranceValue(Object overcompletionToleranceValue) {
		this.overcompletionToleranceValue = overcompletionToleranceValue;
	}

	@JsonProperty("InventoryCarryPenalty")
	public Object getInventoryCarryPenalty() {
		return inventoryCarryPenalty;
	}

	@JsonProperty("InventoryCarryPenalty")
	public void setInventoryCarryPenalty(Object inventoryCarryPenalty) {
		this.inventoryCarryPenalty = inventoryCarryPenalty;
	}

	@JsonProperty("OperationSlackPenalty")
	public Object getOperationSlackPenalty() {
		return operationSlackPenalty;
	}

	@JsonProperty("OperationSlackPenalty")
	public void setOperationSlackPenalty(Object operationSlackPenalty) {
		this.operationSlackPenalty = operationSlackPenalty;
	}

	@JsonProperty("RecipeEnabledFlag")
	public Boolean getRecipeEnabledFlag() {
		return recipeEnabledFlag;
	}

	@JsonProperty("RecipeEnabledFlag")
	public void setRecipeEnabledFlag(Boolean recipeEnabledFlag) {
		this.recipeEnabledFlag = recipeEnabledFlag;
	}

	@JsonProperty("ProcessQualityEnabledFlag")
	public Boolean getProcessQualityEnabledFlag() {
		return processQualityEnabledFlag;
	}

	@JsonProperty("ProcessQualityEnabledFlag")
	public void setProcessQualityEnabledFlag(Boolean processQualityEnabledFlag) {
		this.processQualityEnabledFlag = processQualityEnabledFlag;
	}

	@JsonProperty("ProcessCostingEnabledFlag")
	public Boolean getProcessCostingEnabledFlag() {
		return processCostingEnabledFlag;
	}

	@JsonProperty("ProcessCostingEnabledFlag")
	public void setProcessCostingEnabledFlag(Boolean processCostingEnabledFlag) {
		this.processCostingEnabledFlag = processCostingEnabledFlag;
	}

	@JsonProperty("ProcessExecutionEnabledFlag")
	public Boolean getProcessExecutionEnabledFlag() {
		return processExecutionEnabledFlag;
	}

	@JsonProperty("ProcessExecutionEnabledFlag")
	public void setProcessExecutionEnabledFlag(Boolean processExecutionEnabledFlag) {
		this.processExecutionEnabledFlag = processExecutionEnabledFlag;
	}

	@JsonProperty("ProcessSupplySubinventoryValue")
	public Object getProcessSupplySubinventoryValue() {
		return processSupplySubinventoryValue;
	}

	@JsonProperty("ProcessSupplySubinventoryValue")
	public void setProcessSupplySubinventoryValue(Object processSupplySubinventoryValue) {
		this.processSupplySubinventoryValue = processSupplySubinventoryValue;
	}

	@JsonProperty("ProcessSupplyLocatorValue")
	public Object getProcessSupplyLocatorValue() {
		return processSupplyLocatorValue;
	}

	@JsonProperty("ProcessSupplyLocatorValue")
	public void setProcessSupplyLocatorValue(Object processSupplyLocatorValue) {
		this.processSupplyLocatorValue = processSupplyLocatorValue;
	}

	@JsonProperty("ProcessYieldSubinventoryValue")
	public Object getProcessYieldSubinventoryValue() {
		return processYieldSubinventoryValue;
	}

	@JsonProperty("ProcessYieldSubinventoryValue")
	public void setProcessYieldSubinventoryValue(Object processYieldSubinventoryValue) {
		this.processYieldSubinventoryValue = processYieldSubinventoryValue;
	}

	@JsonProperty("ProcessYieldLocatorValue")
	public Object getProcessYieldLocatorValue() {
		return processYieldLocatorValue;
	}

	@JsonProperty("ProcessYieldLocatorValue")
	public void setProcessYieldLocatorValue(Object processYieldLocatorValue) {
		this.processYieldLocatorValue = processYieldLocatorValue;
	}

	@JsonProperty("HazardousMaterialFlag")
	public Boolean getHazardousMaterialFlag() {
		return hazardousMaterialFlag;
	}

	@JsonProperty("HazardousMaterialFlag")
	public void setHazardousMaterialFlag(Boolean hazardousMaterialFlag) {
		this.hazardousMaterialFlag = hazardousMaterialFlag;
	}

	@JsonProperty("CASNumber")
	public Object getCASNumber() {
		return cASNumber;
	}

	@JsonProperty("CASNumber")
	public void setCASNumber(Object cASNumber) {
		this.cASNumber = cASNumber;
	}

	@JsonProperty("AssetTrackedFlag")
	public Boolean getAssetTrackedFlag() {
		return assetTrackedFlag;
	}

	@JsonProperty("AssetTrackedFlag")
	public void setAssetTrackedFlag(Boolean assetTrackedFlag) {
		this.assetTrackedFlag = assetTrackedFlag;
	}

	@JsonProperty("AssetClassValue")
	public String getAssetClassValue() {
		return assetClassValue;
	}

	@JsonProperty("AssetClassValue")
	public void setAssetClassValue(String assetClassValue) {
		this.assetClassValue = assetClassValue;
	}

	@JsonProperty("ServiceRequestEnabledValue")
	public Object getServiceRequestEnabledValue() {
		return serviceRequestEnabledValue;
	}

	@JsonProperty("ServiceRequestEnabledValue")
	public void setServiceRequestEnabledValue(Object serviceRequestEnabledValue) {
		this.serviceRequestEnabledValue = serviceRequestEnabledValue;
	}

	@JsonProperty("DefectTrackingOnFlag")
	public Object getDefectTrackingOnFlag() {
		return defectTrackingOnFlag;
	}

	@JsonProperty("DefectTrackingOnFlag")
	public void setDefectTrackingOnFlag(Object defectTrackingOnFlag) {
		this.defectTrackingOnFlag = defectTrackingOnFlag;
	}

	@JsonProperty("ServiceDurationTypeValue")
	public String getServiceDurationTypeValue() {
		return serviceDurationTypeValue;
	}

	@JsonProperty("ServiceDurationTypeValue")
	public void setServiceDurationTypeValue(String serviceDurationTypeValue) {
		this.serviceDurationTypeValue = serviceDurationTypeValue;
	}

	@JsonProperty("ServiceDuration")
	public Object getServiceDuration() {
		return serviceDuration;
	}

	@JsonProperty("ServiceDuration")
	public void setServiceDuration(Object serviceDuration) {
		this.serviceDuration = serviceDuration;
	}

	@JsonProperty("ServiceDurationPeriodValue")
	public Object getServiceDurationPeriodValue() {
		return serviceDurationPeriodValue;
	}

	@JsonProperty("ServiceDurationPeriodValue")
	public void setServiceDurationPeriodValue(Object serviceDurationPeriodValue) {
		this.serviceDurationPeriodValue = serviceDurationPeriodValue;
	}

	@JsonProperty("ServiceStartTypeValue")
	public String getServiceStartTypeValue() {
		return serviceStartTypeValue;
	}

	@JsonProperty("ServiceStartTypeValue")
	public void setServiceStartTypeValue(String serviceStartTypeValue) {
		this.serviceStartTypeValue = serviceStartTypeValue;
	}

	@JsonProperty("ServiceStartDelay")
	public Integer getServiceStartDelay() {
		return serviceStartDelay;
	}

	@JsonProperty("ServiceStartDelay")
	public void setServiceStartDelay(Integer serviceStartDelay) {
		this.serviceStartDelay = serviceStartDelay;
	}

	@JsonProperty("AllowSuspendFlag")
	public Boolean getAllowSuspendFlag() {
		return allowSuspendFlag;
	}

	@JsonProperty("AllowSuspendFlag")
	public void setAllowSuspendFlag(Boolean allowSuspendFlag) {
		this.allowSuspendFlag = allowSuspendFlag;
	}

	@JsonProperty("AllowTerminateFlag")
	public Boolean getAllowTerminateFlag() {
		return allowTerminateFlag;
	}

	@JsonProperty("AllowTerminateFlag")
	public void setAllowTerminateFlag(Boolean allowTerminateFlag) {
		this.allowTerminateFlag = allowTerminateFlag;
	}

	@JsonProperty("RequiresItemAssociationFlag")
	public Boolean getRequiresItemAssociationFlag() {
		return requiresItemAssociationFlag;
	}

	@JsonProperty("RequiresItemAssociationFlag")
	public void setRequiresItemAssociationFlag(Boolean requiresItemAssociationFlag) {
		this.requiresItemAssociationFlag = requiresItemAssociationFlag;
	}

	@JsonProperty("CreateFixedAssetFlag")
	public Object getCreateFixedAssetFlag() {
		return createFixedAssetFlag;
	}

	@JsonProperty("CreateFixedAssetFlag")
	public void setCreateFixedAssetFlag(Object createFixedAssetFlag) {
		this.createFixedAssetFlag = createFixedAssetFlag;
	}

	@JsonProperty("InstanceClassValue")
	public Object getInstanceClassValue() {
		return instanceClassValue;
	}

	@JsonProperty("InstanceClassValue")
	public void setInstanceClassValue(Object instanceClassValue) {
		this.instanceClassValue = instanceClassValue;
	}

	@JsonProperty("BillingTypeValue")
	public Object getBillingTypeValue() {
		return billingTypeValue;
	}

	@JsonProperty("BillingTypeValue")
	public void setBillingTypeValue(Object billingTypeValue) {
		this.billingTypeValue = billingTypeValue;
	}

	@JsonProperty("ServiceBillingEnabledFlag")
	public Boolean getServiceBillingEnabledFlag() {
		return serviceBillingEnabledFlag;
	}

	@JsonProperty("ServiceBillingEnabledFlag")
	public void setServiceBillingEnabledFlag(Boolean serviceBillingEnabledFlag) {
		this.serviceBillingEnabledFlag = serviceBillingEnabledFlag;
	}

	@JsonProperty("RecoveredPartDispositionValue")
	public Object getRecoveredPartDispositionValue() {
		return recoveredPartDispositionValue;
	}

	@JsonProperty("RecoveredPartDispositionValue")
	public void setRecoveredPartDispositionValue(Object recoveredPartDispositionValue) {
		this.recoveredPartDispositionValue = recoveredPartDispositionValue;
	}

	@JsonProperty("InventoryItemFlag")
	public Boolean getInventoryItemFlag() {
		return inventoryItemFlag;
	}

	@JsonProperty("InventoryItemFlag")
	public void setInventoryItemFlag(Boolean inventoryItemFlag) {
		this.inventoryItemFlag = inventoryItemFlag;
	}

	@JsonProperty("StockEnabledFlag")
	public Boolean getStockEnabledFlag() {
		return stockEnabledFlag;
	}

	@JsonProperty("StockEnabledFlag")
	public void setStockEnabledFlag(Boolean stockEnabledFlag) {
		this.stockEnabledFlag = stockEnabledFlag;
	}

	@JsonProperty("MaterialTransactionEnabledFlag")
	public Boolean getMaterialTransactionEnabledFlag() {
		return materialTransactionEnabledFlag;
	}

	@JsonProperty("MaterialTransactionEnabledFlag")
	public void setMaterialTransactionEnabledFlag(Boolean materialTransactionEnabledFlag) {
		this.materialTransactionEnabledFlag = materialTransactionEnabledFlag;
	}

	@JsonProperty("ReservableFlag")
	public Boolean getReservableFlag() {
		return reservableFlag;
	}

	@JsonProperty("ReservableFlag")
	public void setReservableFlag(Boolean reservableFlag) {
		this.reservableFlag = reservableFlag;
	}

	@JsonProperty("CheckMaterialShortageFlag")
	public Boolean getCheckMaterialShortageFlag() {
		return checkMaterialShortageFlag;
	}

	@JsonProperty("CheckMaterialShortageFlag")
	public void setCheckMaterialShortageFlag(Boolean checkMaterialShortageFlag) {
		this.checkMaterialShortageFlag = checkMaterialShortageFlag;
	}

	@JsonProperty("RevisionQuantityControlFlag")
	public Boolean getRevisionQuantityControlFlag() {
		return revisionQuantityControlFlag;
	}

	@JsonProperty("RevisionQuantityControlFlag")
	public void setRevisionQuantityControlFlag(Boolean revisionQuantityControlFlag) {
		this.revisionQuantityControlFlag = revisionQuantityControlFlag;
	}

	@JsonProperty("BulkPickedFlag")
	public Boolean getBulkPickedFlag() {
		return bulkPickedFlag;
	}

	@JsonProperty("BulkPickedFlag")
	public void setBulkPickedFlag(Boolean bulkPickedFlag) {
		this.bulkPickedFlag = bulkPickedFlag;
	}

	@JsonProperty("LotControlValue")
	public String getLotControlValue() {
		return lotControlValue;
	}

	@JsonProperty("LotControlValue")
	public void setLotControlValue(String lotControlValue) {
		this.lotControlValue = lotControlValue;
	}

	@JsonProperty("StartingLotPrefix")
	public Object getStartingLotPrefix() {
		return startingLotPrefix;
	}

	@JsonProperty("StartingLotPrefix")
	public void setStartingLotPrefix(Object startingLotPrefix) {
		this.startingLotPrefix = startingLotPrefix;
	}

	@JsonProperty("StartingLotNumber")
	public Object getStartingLotNumber() {
		return startingLotNumber;
	}

	@JsonProperty("StartingLotNumber")
	public void setStartingLotNumber(Object startingLotNumber) {
		this.startingLotNumber = startingLotNumber;
	}

	@JsonProperty("MaturityDays")
	public Object getMaturityDays() {
		return maturityDays;
	}

	@JsonProperty("MaturityDays")
	public void setMaturityDays(Object maturityDays) {
		this.maturityDays = maturityDays;
	}

	@JsonProperty("HoldDays")
	public Object getHoldDays() {
		return holdDays;
	}

	@JsonProperty("HoldDays")
	public void setHoldDays(Object holdDays) {
		this.holdDays = holdDays;
	}

	@JsonProperty("LotExpirationControlValue")
	public String getLotExpirationControlValue() {
		return lotExpirationControlValue;
	}

	@JsonProperty("LotExpirationControlValue")
	public void setLotExpirationControlValue(String lotExpirationControlValue) {
		this.lotExpirationControlValue = lotExpirationControlValue;
	}

	@JsonProperty("ShelfLifeDays")
	public Integer getShelfLifeDays() {
		return shelfLifeDays;
	}

	@JsonProperty("ShelfLifeDays")
	public void setShelfLifeDays(Integer shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}

	@JsonProperty("RetestInterval")
	public Object getRetestInterval() {
		return retestInterval;
	}

	@JsonProperty("RetestInterval")
	public void setRetestInterval(Object retestInterval) {
		this.retestInterval = retestInterval;
	}

	@JsonProperty("ExpirationActionValue")
	public Object getExpirationActionValue() {
		return expirationActionValue;
	}

	@JsonProperty("ExpirationActionValue")
	public void setExpirationActionValue(Object expirationActionValue) {
		this.expirationActionValue = expirationActionValue;
	}

	@JsonProperty("ExpirationActionInterval")
	public Object getExpirationActionInterval() {
		return expirationActionInterval;
	}

	@JsonProperty("ExpirationActionInterval")
	public void setExpirationActionInterval(Object expirationActionInterval) {
		this.expirationActionInterval = expirationActionInterval;
	}

	@JsonProperty("ChildLotEnabledFlag")
	public Boolean getChildLotEnabledFlag() {
		return childLotEnabledFlag;
	}

	@JsonProperty("ChildLotEnabledFlag")
	public void setChildLotEnabledFlag(Boolean childLotEnabledFlag) {
		this.childLotEnabledFlag = childLotEnabledFlag;
	}

	@JsonProperty("ChildLotFormatValidationFlag")
	public Boolean getChildLotFormatValidationFlag() {
		return childLotFormatValidationFlag;
	}

	@JsonProperty("ChildLotFormatValidationFlag")
	public void setChildLotFormatValidationFlag(Boolean childLotFormatValidationFlag) {
		this.childLotFormatValidationFlag = childLotFormatValidationFlag;
	}

	@JsonProperty("CopyLotAttributeFlag")
	public Boolean getCopyLotAttributeFlag() {
		return copyLotAttributeFlag;
	}

	@JsonProperty("CopyLotAttributeFlag")
	public void setCopyLotAttributeFlag(Boolean copyLotAttributeFlag) {
		this.copyLotAttributeFlag = copyLotAttributeFlag;
	}

	@JsonProperty("ChildLotPrefix")
	public Object getChildLotPrefix() {
		return childLotPrefix;
	}

	@JsonProperty("ChildLotPrefix")
	public void setChildLotPrefix(Object childLotPrefix) {
		this.childLotPrefix = childLotPrefix;
	}

	@JsonProperty("ChildLotStartingNumber")
	public Object getChildLotStartingNumber() {
		return childLotStartingNumber;
	}

	@JsonProperty("ChildLotStartingNumber")
	public void setChildLotStartingNumber(Object childLotStartingNumber) {
		this.childLotStartingNumber = childLotStartingNumber;
	}

	@JsonProperty("ChildLotParent")
	public Object getChildLotParent() {
		return childLotParent;
	}

	@JsonProperty("ChildLotParent")
	public void setChildLotParent(Object childLotParent) {
		this.childLotParent = childLotParent;
	}

	@JsonProperty("LotTranslateEnabledFlag")
	public Boolean getLotTranslateEnabledFlag() {
		return lotTranslateEnabledFlag;
	}

	@JsonProperty("LotTranslateEnabledFlag")
	public void setLotTranslateEnabledFlag(Boolean lotTranslateEnabledFlag) {
		this.lotTranslateEnabledFlag = lotTranslateEnabledFlag;
	}

	@JsonProperty("LotSplitEnabledFlag")
	public Boolean getLotSplitEnabledFlag() {
		return lotSplitEnabledFlag;
	}

	@JsonProperty("LotSplitEnabledFlag")
	public void setLotSplitEnabledFlag(Boolean lotSplitEnabledFlag) {
		this.lotSplitEnabledFlag = lotSplitEnabledFlag;
	}

	@JsonProperty("LotDivisibleFlag")
	public Boolean getLotDivisibleFlag() {
		return lotDivisibleFlag;
	}

	@JsonProperty("LotDivisibleFlag")
	public void setLotDivisibleFlag(Boolean lotDivisibleFlag) {
		this.lotDivisibleFlag = lotDivisibleFlag;
	}

	@JsonProperty("LotSubstitutionEnabledFlag")
	public Object getLotSubstitutionEnabledFlag() {
		return lotSubstitutionEnabledFlag;
	}

	@JsonProperty("LotSubstitutionEnabledFlag")
	public void setLotSubstitutionEnabledFlag(Object lotSubstitutionEnabledFlag) {
		this.lotSubstitutionEnabledFlag = lotSubstitutionEnabledFlag;
	}

	@JsonProperty("LotMergeEnabledFlag")
	public Boolean getLotMergeEnabledFlag() {
		return lotMergeEnabledFlag;
	}

	@JsonProperty("LotMergeEnabledFlag")
	public void setLotMergeEnabledFlag(Boolean lotMergeEnabledFlag) {
		this.lotMergeEnabledFlag = lotMergeEnabledFlag;
	}

	@JsonProperty("GradeControlFlag")
	public Boolean getGradeControlFlag() {
		return gradeControlFlag;
	}

	@JsonProperty("GradeControlFlag")
	public void setGradeControlFlag(Boolean gradeControlFlag) {
		this.gradeControlFlag = gradeControlFlag;
	}

	@JsonProperty("DefaultGradeValue")
	public Object getDefaultGradeValue() {
		return defaultGradeValue;
	}

	@JsonProperty("DefaultGradeValue")
	public void setDefaultGradeValue(Object defaultGradeValue) {
		this.defaultGradeValue = defaultGradeValue;
	}

	@JsonProperty("SerialGenerationValue")
	public String getSerialGenerationValue() {
		return serialGenerationValue;
	}

	@JsonProperty("SerialGenerationValue")
	public void setSerialGenerationValue(String serialGenerationValue) {
		this.serialGenerationValue = serialGenerationValue;
	}

	@JsonProperty("SerialStartingPrefix")
	public Object getSerialStartingPrefix() {
		return serialStartingPrefix;
	}

	@JsonProperty("SerialStartingPrefix")
	public void setSerialStartingPrefix(Object serialStartingPrefix) {
		this.serialStartingPrefix = serialStartingPrefix;
	}

	@JsonProperty("SerialStartingNumber")
	public Object getSerialStartingNumber() {
		return serialStartingNumber;
	}

	@JsonProperty("SerialStartingNumber")
	public void setSerialStartingNumber(Object serialStartingNumber) {
		this.serialStartingNumber = serialStartingNumber;
	}

	@JsonProperty("NegativeMeasurementError")
	public Object getNegativeMeasurementError() {
		return negativeMeasurementError;
	}

	@JsonProperty("NegativeMeasurementError")
	public void setNegativeMeasurementError(Object negativeMeasurementError) {
		this.negativeMeasurementError = negativeMeasurementError;
	}

	@JsonProperty("PositiveMeasurementError")
	public Object getPositiveMeasurementError() {
		return positiveMeasurementError;
	}

	@JsonProperty("PositiveMeasurementError")
	public void setPositiveMeasurementError(Object positiveMeasurementError) {
		this.positiveMeasurementError = positiveMeasurementError;
	}

	@JsonProperty("CycleCountEnabledFlag")
	public Boolean getCycleCountEnabledFlag() {
		return cycleCountEnabledFlag;
	}

	@JsonProperty("CycleCountEnabledFlag")
	public void setCycleCountEnabledFlag(Boolean cycleCountEnabledFlag) {
		this.cycleCountEnabledFlag = cycleCountEnabledFlag;
	}

	@JsonProperty("LotStatusEnabledFlag")
	public Boolean getLotStatusEnabledFlag() {
		return lotStatusEnabledFlag;
	}

	@JsonProperty("LotStatusEnabledFlag")
	public void setLotStatusEnabledFlag(Boolean lotStatusEnabledFlag) {
		this.lotStatusEnabledFlag = lotStatusEnabledFlag;
	}

	@JsonProperty("SerialStatusEnabledFlag")
	public Boolean getSerialStatusEnabledFlag() {
		return serialStatusEnabledFlag;
	}

	@JsonProperty("SerialStatusEnabledFlag")
	public void setSerialStatusEnabledFlag(Boolean serialStatusEnabledFlag) {
		this.serialStatusEnabledFlag = serialStatusEnabledFlag;
	}

	@JsonProperty("DefaultLotStatusValue")
	public Object getDefaultLotStatusValue() {
		return defaultLotStatusValue;
	}

	@JsonProperty("DefaultLotStatusValue")
	public void setDefaultLotStatusValue(Object defaultLotStatusValue) {
		this.defaultLotStatusValue = defaultLotStatusValue;
	}

	@JsonProperty("DefaultSerialStatusValue")
	public Object getDefaultSerialStatusValue() {
		return defaultSerialStatusValue;
	}

	@JsonProperty("DefaultSerialStatusValue")
	public void setDefaultSerialStatusValue(Object defaultSerialStatusValue) {
		this.defaultSerialStatusValue = defaultSerialStatusValue;
	}

	@JsonProperty("RestrictSubinventoriesFlag")
	public Boolean getRestrictSubinventoriesFlag() {
		return restrictSubinventoriesFlag;
	}

	@JsonProperty("RestrictSubinventoriesFlag")
	public void setRestrictSubinventoriesFlag(Boolean restrictSubinventoriesFlag) {
		this.restrictSubinventoriesFlag = restrictSubinventoriesFlag;
	}

	@JsonProperty("RestrictLocatorsFlag")
	public Boolean getRestrictLocatorsFlag() {
		return restrictLocatorsFlag;
	}

	@JsonProperty("RestrictLocatorsFlag")
	public void setRestrictLocatorsFlag(Boolean restrictLocatorsFlag) {
		this.restrictLocatorsFlag = restrictLocatorsFlag;
	}

	@JsonProperty("StockLocatorControlValue")
	public String getStockLocatorControlValue() {
		return stockLocatorControlValue;
	}

	@JsonProperty("StockLocatorControlValue")
	public void setStockLocatorControlValue(String stockLocatorControlValue) {
		this.stockLocatorControlValue = stockLocatorControlValue;
	}

	@JsonProperty("DimensionUOMValue")
	public Object getDimensionUOMValue() {
		return dimensionUOMValue;
	}

	@JsonProperty("DimensionUOMValue")
	public void setDimensionUOMValue(Object dimensionUOMValue) {
		this.dimensionUOMValue = dimensionUOMValue;
	}

	@JsonProperty("UnitWidthQuantity")
	public Object getUnitWidthQuantity() {
		return unitWidthQuantity;
	}

	@JsonProperty("UnitWidthQuantity")
	public void setUnitWidthQuantity(Object unitWidthQuantity) {
		this.unitWidthQuantity = unitWidthQuantity;
	}

	@JsonProperty("UnitLengthQuantity")
	public Object getUnitLengthQuantity() {
		return unitLengthQuantity;
	}

	@JsonProperty("UnitLengthQuantity")
	public void setUnitLengthQuantity(Object unitLengthQuantity) {
		this.unitLengthQuantity = unitLengthQuantity;
	}

	@JsonProperty("UnitHeightQuantity")
	public Object getUnitHeightQuantity() {
		return unitHeightQuantity;
	}

	@JsonProperty("UnitHeightQuantity")
	public void setUnitHeightQuantity(Object unitHeightQuantity) {
		this.unitHeightQuantity = unitHeightQuantity;
	}

	@JsonProperty("WeightUOMValue")
	public Object getWeightUOMValue() {
		return weightUOMValue;
	}

	@JsonProperty("WeightUOMValue")
	public void setWeightUOMValue(Object weightUOMValue) {
		this.weightUOMValue = weightUOMValue;
	}

	@JsonProperty("UnitWeightQuantity")
	public Object getUnitWeightQuantity() {
		return unitWeightQuantity;
	}

	@JsonProperty("UnitWeightQuantity")
	public void setUnitWeightQuantity(Object unitWeightQuantity) {
		this.unitWeightQuantity = unitWeightQuantity;
	}

	@JsonProperty("VolumeUOMValue")
	public Object getVolumeUOMValue() {
		return volumeUOMValue;
	}

	@JsonProperty("VolumeUOMValue")
	public void setVolumeUOMValue(Object volumeUOMValue) {
		this.volumeUOMValue = volumeUOMValue;
	}

	@JsonProperty("UnitVolumeQuantity")
	public Object getUnitVolumeQuantity() {
		return unitVolumeQuantity;
	}

	@JsonProperty("UnitVolumeQuantity")
	public void setUnitVolumeQuantity(Object unitVolumeQuantity) {
		this.unitVolumeQuantity = unitVolumeQuantity;
	}

	@JsonProperty("ContainerItemFlag")
	public Object getContainerItemFlag() {
		return containerItemFlag;
	}

	@JsonProperty("ContainerItemFlag")
	public void setContainerItemFlag(Object containerItemFlag) {
		this.containerItemFlag = containerItemFlag;
	}

	@JsonProperty("ContainerTypeValue")
	public Object getContainerTypeValue() {
		return containerTypeValue;
	}

	@JsonProperty("ContainerTypeValue")
	public void setContainerTypeValue(Object containerTypeValue) {
		this.containerTypeValue = containerTypeValue;
	}

	@JsonProperty("MaximumLoadWeight")
	public Object getMaximumLoadWeight() {
		return maximumLoadWeight;
	}

	@JsonProperty("MaximumLoadWeight")
	public void setMaximumLoadWeight(Object maximumLoadWeight) {
		this.maximumLoadWeight = maximumLoadWeight;
	}

	@JsonProperty("VehicleItemFlag")
	public Object getVehicleItemFlag() {
		return vehicleItemFlag;
	}

	@JsonProperty("VehicleItemFlag")
	public void setVehicleItemFlag(Object vehicleItemFlag) {
		this.vehicleItemFlag = vehicleItemFlag;
	}

	@JsonProperty("InternalVolume")
	public Object getInternalVolume() {
		return internalVolume;
	}

	@JsonProperty("InternalVolume")
	public void setInternalVolume(Object internalVolume) {
		this.internalVolume = internalVolume;
	}

	@JsonProperty("MinimumFillPercent")
	public Object getMinimumFillPercent() {
		return minimumFillPercent;
	}

	@JsonProperty("MinimumFillPercent")
	public void setMinimumFillPercent(Object minimumFillPercent) {
		this.minimumFillPercent = minimumFillPercent;
	}

	@JsonProperty("WarehouseEquipmentFlag")
	public Boolean getWarehouseEquipmentFlag() {
		return warehouseEquipmentFlag;
	}

	@JsonProperty("WarehouseEquipmentFlag")
	public void setWarehouseEquipmentFlag(Boolean warehouseEquipmentFlag) {
		this.warehouseEquipmentFlag = warehouseEquipmentFlag;
	}

	@JsonProperty("EventFlag")
	public Object getEventFlag() {
		return eventFlag;
	}

	@JsonProperty("EventFlag")
	public void setEventFlag(Object eventFlag) {
		this.eventFlag = eventFlag;
	}

	@JsonProperty("CollateralFlag")
	public Object getCollateralFlag() {
		return collateralFlag;
	}

	@JsonProperty("CollateralFlag")
	public void setCollateralFlag(Object collateralFlag) {
		this.collateralFlag = collateralFlag;
	}

	@JsonProperty("CustomerOrderFlag")
	public Boolean getCustomerOrderFlag() {
		return customerOrderFlag;
	}

	@JsonProperty("CustomerOrderFlag")
	public void setCustomerOrderFlag(Boolean customerOrderFlag) {
		this.customerOrderFlag = customerOrderFlag;
	}

	@JsonProperty("CustomerOrderEnabledFlag")
	public Boolean getCustomerOrderEnabledFlag() {
		return customerOrderEnabledFlag;
	}

	@JsonProperty("CustomerOrderEnabledFlag")
	public void setCustomerOrderEnabledFlag(Boolean customerOrderEnabledFlag) {
		this.customerOrderEnabledFlag = customerOrderEnabledFlag;
	}

	@JsonProperty("ATPComponentsValue")
	public String getATPComponentsValue() {
		return aTPComponentsValue;
	}

	@JsonProperty("ATPComponentsValue")
	public void setATPComponentsValue(String aTPComponentsValue) {
		this.aTPComponentsValue = aTPComponentsValue;
	}

	@JsonProperty("PickingRuleValue")
	public Object getPickingRuleValue() {
		return pickingRuleValue;
	}

	@JsonProperty("PickingRuleValue")
	public void setPickingRuleValue(Object pickingRuleValue) {
		this.pickingRuleValue = pickingRuleValue;
	}

	@JsonProperty("RMAInspectionRequiredFlag")
	public Boolean getRMAInspectionRequiredFlag() {
		return rMAInspectionRequiredFlag;
	}

	@JsonProperty("RMAInspectionRequiredFlag")
	public void setRMAInspectionRequiredFlag(Boolean rMAInspectionRequiredFlag) {
		this.rMAInspectionRequiredFlag = rMAInspectionRequiredFlag;
	}

	@JsonProperty("EligibilityRuleFlag")
	public Object getEligibilityRuleFlag() {
		return eligibilityRuleFlag;
	}

	@JsonProperty("EligibilityRuleFlag")
	public void setEligibilityRuleFlag(Object eligibilityRuleFlag) {
		this.eligibilityRuleFlag = eligibilityRuleFlag;
	}

	@JsonProperty("ReturnableFlag")
	public Boolean getReturnableFlag() {
		return returnableFlag;
	}

	@JsonProperty("ReturnableFlag")
	public void setReturnableFlag(Boolean returnableFlag) {
		this.returnableFlag = returnableFlag;
	}

	@JsonProperty("ATPValue")
	public String getATPValue() {
		return aTPValue;
	}

	@JsonProperty("ATPValue")
	public void setATPValue(String aTPValue) {
		this.aTPValue = aTPValue;
	}

	@JsonProperty("FinancingAllowedFlag")
	public Object getFinancingAllowedFlag() {
		return financingAllowedFlag;
	}

	@JsonProperty("FinancingAllowedFlag")
	public void setFinancingAllowedFlag(Object financingAllowedFlag) {
		this.financingAllowedFlag = financingAllowedFlag;
	}

	@JsonProperty("SalesProductTypeValue")
	public Object getSalesProductTypeValue() {
		return salesProductTypeValue;
	}

	@JsonProperty("SalesProductTypeValue")
	public void setSalesProductTypeValue(Object salesProductTypeValue) {
		this.salesProductTypeValue = salesProductTypeValue;
	}

	@JsonProperty("TransactionEnabledFlag")
	public Boolean getTransactionEnabledFlag() {
		return transactionEnabledFlag;
	}

	@JsonProperty("TransactionEnabledFlag")
	public void setTransactionEnabledFlag(Boolean transactionEnabledFlag) {
		this.transactionEnabledFlag = transactionEnabledFlag;
	}

	@JsonProperty("OrderManagementIndivisibleFlag")
	public Object getOrderManagementIndivisibleFlag() {
		return orderManagementIndivisibleFlag;
	}

	@JsonProperty("OrderManagementIndivisibleFlag")
	public void setOrderManagementIndivisibleFlag(Object orderManagementIndivisibleFlag) {
		this.orderManagementIndivisibleFlag = orderManagementIndivisibleFlag;
	}

	@JsonProperty("DefaultSalesOrderSourceTypeValue")
	public String getDefaultSalesOrderSourceTypeValue() {
		return defaultSalesOrderSourceTypeValue;
	}

	@JsonProperty("DefaultSalesOrderSourceTypeValue")
	public void setDefaultSalesOrderSourceTypeValue(String defaultSalesOrderSourceTypeValue) {
		this.defaultSalesOrderSourceTypeValue = defaultSalesOrderSourceTypeValue;
	}

	@JsonProperty("ElectronicFormatFlag")
	public Object getElectronicFormatFlag() {
		return electronicFormatFlag;
	}

	@JsonProperty("ElectronicFormatFlag")
	public void setElectronicFormatFlag(Object electronicFormatFlag) {
		this.electronicFormatFlag = electronicFormatFlag;
	}

	@JsonProperty("ShippableFlag")
	public Boolean getShippableFlag() {
		return shippableFlag;
	}

	@JsonProperty("ShippableFlag")
	public void setShippableFlag(Boolean shippableFlag) {
		this.shippableFlag = shippableFlag;
	}

	@JsonProperty("DefaultShippingOrganizationValue")
	public Object getDefaultShippingOrganizationValue() {
		return defaultShippingOrganizationValue;
	}

	@JsonProperty("DefaultShippingOrganizationValue")
	public void setDefaultShippingOrganizationValue(Object defaultShippingOrganizationValue) {
		this.defaultShippingOrganizationValue = defaultShippingOrganizationValue;
	}

	@JsonProperty("ShipModelCompleteFlag")
	public Boolean getShipModelCompleteFlag() {
		return shipModelCompleteFlag;
	}

	@JsonProperty("ShipModelCompleteFlag")
	public void setShipModelCompleteFlag(Boolean shipModelCompleteFlag) {
		this.shipModelCompleteFlag = shipModelCompleteFlag;
	}

	@JsonProperty("DownloadableFlag")
	public Object getDownloadableFlag() {
		return downloadableFlag;
	}

	@JsonProperty("DownloadableFlag")
	public void setDownloadableFlag(Object downloadableFlag) {
		this.downloadableFlag = downloadableFlag;
	}

	@JsonProperty("OverShipmentTolerance")
	public Object getOverShipmentTolerance() {
		return overShipmentTolerance;
	}

	@JsonProperty("OverShipmentTolerance")
	public void setOverShipmentTolerance(Object overShipmentTolerance) {
		this.overShipmentTolerance = overShipmentTolerance;
	}

	@JsonProperty("UnderShipmentTolerance")
	public Object getUnderShipmentTolerance() {
		return underShipmentTolerance;
	}

	@JsonProperty("UnderShipmentTolerance")
	public void setUnderShipmentTolerance(Object underShipmentTolerance) {
		this.underShipmentTolerance = underShipmentTolerance;
	}

	@JsonProperty("OverReturnTolerance")
	public Object getOverReturnTolerance() {
		return overReturnTolerance;
	}

	@JsonProperty("OverReturnTolerance")
	public void setOverReturnTolerance(Object overReturnTolerance) {
		this.overReturnTolerance = overReturnTolerance;
	}

	@JsonProperty("UnderReturnTolerance")
	public Object getUnderReturnTolerance() {
		return underReturnTolerance;
	}

	@JsonProperty("UnderReturnTolerance")
	public void setUnderReturnTolerance(Object underReturnTolerance) {
		this.underReturnTolerance = underReturnTolerance;
	}

	@JsonProperty("InvoiceEnabledFlag")
	public Boolean getInvoiceEnabledFlag() {
		return invoiceEnabledFlag;
	}

	@JsonProperty("InvoiceEnabledFlag")
	public void setInvoiceEnabledFlag(Boolean invoiceEnabledFlag) {
		this.invoiceEnabledFlag = invoiceEnabledFlag;
	}

	@JsonProperty("AccountingRuleValue")
	public Object getAccountingRuleValue() {
		return accountingRuleValue;
	}

	@JsonProperty("AccountingRuleValue")
	public void setAccountingRuleValue(Object accountingRuleValue) {
		this.accountingRuleValue = accountingRuleValue;
	}

	@JsonProperty("PaymentTermsValue")
	public Object getPaymentTermsValue() {
		return paymentTermsValue;
	}

	@JsonProperty("PaymentTermsValue")
	public void setPaymentTermsValue(Object paymentTermsValue) {
		this.paymentTermsValue = paymentTermsValue;
	}

	@JsonProperty("OutputTaxClassificationCodeValue")
	public Object getOutputTaxClassificationCodeValue() {
		return outputTaxClassificationCodeValue;
	}

	@JsonProperty("OutputTaxClassificationCodeValue")
	public void setOutputTaxClassificationCodeValue(Object outputTaxClassificationCodeValue) {
		this.outputTaxClassificationCodeValue = outputTaxClassificationCodeValue;
	}

	@JsonProperty("InvoicedFlag")
	public Boolean getInvoicedFlag() {
		return invoicedFlag;
	}

	@JsonProperty("InvoicedFlag")
	public void setInvoicedFlag(Boolean invoicedFlag) {
		this.invoicedFlag = invoicedFlag;
	}

	@JsonProperty("InvoicingRuleValue")
	public Object getInvoicingRuleValue() {
		return invoicingRuleValue;
	}

	@JsonProperty("InvoicingRuleValue")
	public void setInvoicingRuleValue(Object invoicingRuleValue) {
		this.invoicingRuleValue = invoicingRuleValue;
	}

	@JsonProperty("SalesAccountValue")
	public Object getSalesAccountValue() {
		return salesAccountValue;
	}

	@JsonProperty("SalesAccountValue")
	public void setSalesAccountValue(Object salesAccountValue) {
		this.salesAccountValue = salesAccountValue;
	}

	@JsonProperty("WebStatusValue")
	public String getWebStatusValue() {
		return webStatusValue;
	}

	@JsonProperty("WebStatusValue")
	public void setWebStatusValue(String webStatusValue) {
		this.webStatusValue = webStatusValue;
	}

	@JsonProperty("BackOrderableFlag")
	public Object getBackOrderableFlag() {
		return backOrderableFlag;
	}

	@JsonProperty("BackOrderableFlag")
	public void setBackOrderableFlag(Object backOrderableFlag) {
		this.backOrderableFlag = backOrderableFlag;
	}

	@JsonProperty("OrderableOnWebFlag")
	public Boolean getOrderableOnWebFlag() {
		return orderableOnWebFlag;
	}

	@JsonProperty("OrderableOnWebFlag")
	public void setOrderableOnWebFlag(Boolean orderableOnWebFlag) {
		this.orderableOnWebFlag = orderableOnWebFlag;
	}

	@JsonProperty("MinimumLicenseQuantity")
	public Object getMinimumLicenseQuantity() {
		return minimumLicenseQuantity;
	}

	@JsonProperty("MinimumLicenseQuantity")
	public void setMinimumLicenseQuantity(Object minimumLicenseQuantity) {
		this.minimumLicenseQuantity = minimumLicenseQuantity;
	}

	@JsonProperty("InventoryPlanningMethodValue")
	public String getInventoryPlanningMethodValue() {
		return inventoryPlanningMethodValue;
	}

	@JsonProperty("InventoryPlanningMethodValue")
	public void setInventoryPlanningMethodValue(String inventoryPlanningMethodValue) {
		this.inventoryPlanningMethodValue = inventoryPlanningMethodValue;
	}

	@JsonProperty("PlanningMakeBuyValue")
	public String getPlanningMakeBuyValue() {
		return planningMakeBuyValue;
	}

	@JsonProperty("PlanningMakeBuyValue")
	public void setPlanningMakeBuyValue(String planningMakeBuyValue) {
		this.planningMakeBuyValue = planningMakeBuyValue;
	}

	@JsonProperty("Planner")
	public Object getPlanner() {
		return planner;
	}

	@JsonProperty("Planner")
	public void setPlanner(Object planner) {
		this.planner = planner;
	}

	@JsonProperty("SubcontractingComponentValue")
	public Object getSubcontractingComponentValue() {
		return subcontractingComponentValue;
	}

	@JsonProperty("SubcontractingComponentValue")
	public void setSubcontractingComponentValue(Object subcontractingComponentValue) {
		this.subcontractingComponentValue = subcontractingComponentValue;
	}

	@JsonProperty("MinimumMinmaxQuantity")
	public Object getMinimumMinmaxQuantity() {
		return minimumMinmaxQuantity;
	}

	@JsonProperty("MinimumMinmaxQuantity")
	public void setMinimumMinmaxQuantity(Object minimumMinmaxQuantity) {
		this.minimumMinmaxQuantity = minimumMinmaxQuantity;
	}

	@JsonProperty("MaximumMinmaxQuantity")
	public Object getMaximumMinmaxQuantity() {
		return maximumMinmaxQuantity;
	}

	@JsonProperty("MaximumMinmaxQuantity")
	public void setMaximumMinmaxQuantity(Object maximumMinmaxQuantity) {
		this.maximumMinmaxQuantity = maximumMinmaxQuantity;
	}

	@JsonProperty("MinimumOrderQuantity")
	public Object getMinimumOrderQuantity() {
		return minimumOrderQuantity;
	}

	@JsonProperty("MinimumOrderQuantity")
	public void setMinimumOrderQuantity(Object minimumOrderQuantity) {
		this.minimumOrderQuantity = minimumOrderQuantity;
	}

	@JsonProperty("MaximumOrderQuantity")
	public Object getMaximumOrderQuantity() {
		return maximumOrderQuantity;
	}

	@JsonProperty("MaximumOrderQuantity")
	public void setMaximumOrderQuantity(Object maximumOrderQuantity) {
		this.maximumOrderQuantity = maximumOrderQuantity;
	}

	@JsonProperty("OrderCost")
	public Object getOrderCost() {
		return orderCost;
	}

	@JsonProperty("OrderCost")
	public void setOrderCost(Object orderCost) {
		this.orderCost = orderCost;
	}

	@JsonProperty("SourceOrganizationValue")
	public Object getSourceOrganizationValue() {
		return sourceOrganizationValue;
	}

	@JsonProperty("SourceOrganizationValue")
	public void setSourceOrganizationValue(Object sourceOrganizationValue) {
		this.sourceOrganizationValue = sourceOrganizationValue;
	}

	@JsonProperty("SourceSubinventoryOrganizationValue")
	public Object getSourceSubinventoryOrganizationValue() {
		return sourceSubinventoryOrganizationValue;
	}

	@JsonProperty("SourceSubinventoryOrganizationValue")
	public void setSourceSubinventoryOrganizationValue(Object sourceSubinventoryOrganizationValue) {
		this.sourceSubinventoryOrganizationValue = sourceSubinventoryOrganizationValue;
	}

	@JsonProperty("SourceSubinventoryValue")
	public Object getSourceSubinventoryValue() {
		return sourceSubinventoryValue;
	}

	@JsonProperty("SourceSubinventoryValue")
	public void setSourceSubinventoryValue(Object sourceSubinventoryValue) {
		this.sourceSubinventoryValue = sourceSubinventoryValue;
	}

	@JsonProperty("FixedOrderQuantity")
	public Object getFixedOrderQuantity() {
		return fixedOrderQuantity;
	}

	@JsonProperty("FixedOrderQuantity")
	public void setFixedOrderQuantity(Object fixedOrderQuantity) {
		this.fixedOrderQuantity = fixedOrderQuantity;
	}

	@JsonProperty("FixedDaysSupply")
	public Object getFixedDaysSupply() {
		return fixedDaysSupply;
	}

	@JsonProperty("FixedDaysSupply")
	public void setFixedDaysSupply(Object fixedDaysSupply) {
		this.fixedDaysSupply = fixedDaysSupply;
	}

	@JsonProperty("FixedLotSizeMultiplier")
	public Object getFixedLotSizeMultiplier() {
		return fixedLotSizeMultiplier;
	}

	@JsonProperty("FixedLotSizeMultiplier")
	public void setFixedLotSizeMultiplier(Object fixedLotSizeMultiplier) {
		this.fixedLotSizeMultiplier = fixedLotSizeMultiplier;
	}

	@JsonProperty("ReleaseAuthorizationRequiredValue")
	public String getReleaseAuthorizationRequiredValue() {
		return releaseAuthorizationRequiredValue;
	}

	@JsonProperty("ReleaseAuthorizationRequiredValue")
	public void setReleaseAuthorizationRequiredValue(String releaseAuthorizationRequiredValue) {
		this.releaseAuthorizationRequiredValue = releaseAuthorizationRequiredValue;
	}

	@JsonProperty("AutomaticallyExpireASNFlag")
	public Boolean getAutomaticallyExpireASNFlag() {
		return automaticallyExpireASNFlag;
	}

	@JsonProperty("AutomaticallyExpireASNFlag")
	public void setAutomaticallyExpireASNFlag(Boolean automaticallyExpireASNFlag) {
		this.automaticallyExpireASNFlag = automaticallyExpireASNFlag;
	}

	@JsonProperty("ConsignedFlag")
	public Boolean getConsignedFlag() {
		return consignedFlag;
	}

	@JsonProperty("ConsignedFlag")
	public void setConsignedFlag(Boolean consignedFlag) {
		this.consignedFlag = consignedFlag;
	}

	@JsonProperty("ReplenishmentMinimumOrder")
	public Object getReplenishmentMinimumOrder() {
		return replenishmentMinimumOrder;
	}

	@JsonProperty("ReplenishmentMinimumOrder")
	public void setReplenishmentMinimumOrder(Object replenishmentMinimumOrder) {
		this.replenishmentMinimumOrder = replenishmentMinimumOrder;
	}

	@JsonProperty("ReplenishmentMaximumOrder")
	public Object getReplenishmentMaximumOrder() {
		return replenishmentMaximumOrder;
	}

	@JsonProperty("ReplenishmentMaximumOrder")
	public void setReplenishmentMaximumOrder(Object replenishmentMaximumOrder) {
		this.replenishmentMaximumOrder = replenishmentMaximumOrder;
	}

	@JsonProperty("VMIFixedOrderQuantity")
	public Object getVMIFixedOrderQuantity() {
		return vMIFixedOrderQuantity;
	}

	@JsonProperty("VMIFixedOrderQuantity")
	public void setVMIFixedOrderQuantity(Object vMIFixedOrderQuantity) {
		this.vMIFixedOrderQuantity = vMIFixedOrderQuantity;
	}

	@JsonProperty("ForecastTypelValue")
	public String getForecastTypelValue() {
		return forecastTypelValue;
	}

	@JsonProperty("ForecastTypelValue")
	public void setForecastTypelValue(String forecastTypelValue) {
		this.forecastTypelValue = forecastTypelValue;
	}

	@JsonProperty("ForecastHorizon")
	public Object getForecastHorizon() {
		return forecastHorizon;
	}

	@JsonProperty("ForecastHorizon")
	public void setForecastHorizon(Object forecastHorizon) {
		this.forecastHorizon = forecastHorizon;
	}

	@JsonProperty("PlanningMethodValue")
	public String getPlanningMethodValue() {
		return planningMethodValue;
	}

	@JsonProperty("PlanningMethodValue")
	public void setPlanningMethodValue(String planningMethodValue) {
		this.planningMethodValue = planningMethodValue;
	}

	@JsonProperty("RoundingControlTypeFlag")
	public Object getRoundingControlTypeFlag() {
		return roundingControlTypeFlag;
	}

	@JsonProperty("RoundingControlTypeFlag")
	public void setRoundingControlTypeFlag(Object roundingControlTypeFlag) {
		this.roundingControlTypeFlag = roundingControlTypeFlag;
	}

	@JsonProperty("CreateSupplyFlag")
	public Boolean getCreateSupplyFlag() {
		return createSupplyFlag;
	}

	@JsonProperty("CreateSupplyFlag")
	public void setCreateSupplyFlag(Boolean createSupplyFlag) {
		this.createSupplyFlag = createSupplyFlag;
	}

	@JsonProperty("PlanningTimeFence")
	public String getPlanningTimeFence() {
		return planningTimeFence;
	}

	@JsonProperty("PlanningTimeFence")
	public void setPlanningTimeFence(String planningTimeFence) {
		this.planningTimeFence = planningTimeFence;
	}

	@JsonProperty("DemandTimeFence")
	public Object getDemandTimeFence() {
		return demandTimeFence;
	}

	@JsonProperty("DemandTimeFence")
	public void setDemandTimeFence(Object demandTimeFence) {
		this.demandTimeFence = demandTimeFence;
	}

	@JsonProperty("ReleaseTimeFence")
	public Object getReleaseTimeFence() {
		return releaseTimeFence;
	}

	@JsonProperty("ReleaseTimeFence")
	public void setReleaseTimeFence(Object releaseTimeFence) {
		this.releaseTimeFence = releaseTimeFence;
	}

	@JsonProperty("ShrinkageRate")
	public Object getShrinkageRate() {
		return shrinkageRate;
	}

	@JsonProperty("ShrinkageRate")
	public void setShrinkageRate(Object shrinkageRate) {
		this.shrinkageRate = shrinkageRate;
	}

	@JsonProperty("ForecastControlValue")
	public Object getForecastControlValue() {
		return forecastControlValue;
	}

	@JsonProperty("ForecastControlValue")
	public void setForecastControlValue(Object forecastControlValue) {
		this.forecastControlValue = forecastControlValue;
	}

	@JsonProperty("AcceptableEarlyDays")
	public Object getAcceptableEarlyDays() {
		return acceptableEarlyDays;
	}

	@JsonProperty("AcceptableEarlyDays")
	public void setAcceptableEarlyDays(Object acceptableEarlyDays) {
		this.acceptableEarlyDays = acceptableEarlyDays;
	}

	@JsonProperty("PlanningTimeDays")
	public Integer getPlanningTimeDays() {
		return planningTimeDays;
	}

	@JsonProperty("PlanningTimeDays")
	public void setPlanningTimeDays(Integer planningTimeDays) {
		this.planningTimeDays = planningTimeDays;
	}

	@JsonProperty("DemandTimeDays")
	public Object getDemandTimeDays() {
		return demandTimeDays;
	}

	@JsonProperty("DemandTimeDays")
	public void setDemandTimeDays(Object demandTimeDays) {
		this.demandTimeDays = demandTimeDays;
	}

	@JsonProperty("ReleaseTimeDays")
	public Object getReleaseTimeDays() {
		return releaseTimeDays;
	}

	@JsonProperty("ReleaseTimeDays")
	public void setReleaseTimeDays(Object releaseTimeDays) {
		this.releaseTimeDays = releaseTimeDays;
	}

	@JsonProperty("MRPCalculateATPFlag")
	public Object getMRPCalculateATPFlag() {
		return mRPCalculateATPFlag;
	}

	@JsonProperty("MRPCalculateATPFlag")
	public void setMRPCalculateATPFlag(Object mRPCalculateATPFlag) {
		this.mRPCalculateATPFlag = mRPCalculateATPFlag;
	}

	@JsonProperty("RepairLeadtime")
	public Object getRepairLeadtime() {
		return repairLeadtime;
	}

	@JsonProperty("RepairLeadtime")
	public void setRepairLeadtime(Object repairLeadtime) {
		this.repairLeadtime = repairLeadtime;
	}

	@JsonProperty("RepairYield")
	public Object getRepairYield() {
		return repairYield;
	}

	@JsonProperty("RepairYield")
	public void setRepairYield(Object repairYield) {
		this.repairYield = repairYield;
	}

	@JsonProperty("PreprocessingDays")
	public Object getPreprocessingDays() {
		return preprocessingDays;
	}

	@JsonProperty("PreprocessingDays")
	public void setPreprocessingDays(Object preprocessingDays) {
		this.preprocessingDays = preprocessingDays;
	}

	@JsonProperty("PostprocessingDays")
	public Integer getPostprocessingDays() {
		return postprocessingDays;
	}

	@JsonProperty("PostprocessingDays")
	public void setPostprocessingDays(Integer postprocessingDays) {
		this.postprocessingDays = postprocessingDays;
	}

	@JsonProperty("ProcessingDays")
	public Object getProcessingDays() {
		return processingDays;
	}

	@JsonProperty("ProcessingDays")
	public void setProcessingDays(Object processingDays) {
		this.processingDays = processingDays;
	}

	@JsonProperty("VariableLeadTime")
	public Object getVariableLeadTime() {
		return variableLeadTime;
	}

	@JsonProperty("VariableLeadTime")
	public void setVariableLeadTime(Object variableLeadTime) {
		this.variableLeadTime = variableLeadTime;
	}

	@JsonProperty("CumulativeTotalLeadTime")
	public Object getCumulativeTotalLeadTime() {
		return cumulativeTotalLeadTime;
	}

	@JsonProperty("CumulativeTotalLeadTime")
	public void setCumulativeTotalLeadTime(Object cumulativeTotalLeadTime) {
		this.cumulativeTotalLeadTime = cumulativeTotalLeadTime;
	}

	@JsonProperty("FixedLeadTime")
	public Object getFixedLeadTime() {
		return fixedLeadTime;
	}

	@JsonProperty("FixedLeadTime")
	public void setFixedLeadTime(Object fixedLeadTime) {
		this.fixedLeadTime = fixedLeadTime;
	}

	@JsonProperty("CumulativeManufacturingLeadTime")
	public Object getCumulativeManufacturingLeadTime() {
		return cumulativeManufacturingLeadTime;
	}

	@JsonProperty("CumulativeManufacturingLeadTime")
	public void setCumulativeManufacturingLeadTime(Object cumulativeManufacturingLeadTime) {
		this.cumulativeManufacturingLeadTime = cumulativeManufacturingLeadTime;
	}

	@JsonProperty("LeadTimeLotSize")
	public Integer getLeadTimeLotSize() {
		return leadTimeLotSize;
	}

	@JsonProperty("LeadTimeLotSize")
	public void setLeadTimeLotSize(Integer leadTimeLotSize) {
		this.leadTimeLotSize = leadTimeLotSize;
	}

	@JsonProperty("PurchasingFlag")
	public Boolean getPurchasingFlag() {
		return purchasingFlag;
	}

	@JsonProperty("PurchasingFlag")
	public void setPurchasingFlag(Boolean purchasingFlag) {
		this.purchasingFlag = purchasingFlag;
	}

	@JsonProperty("UseApprovedSupplierFlag")
	public Boolean getUseApprovedSupplierFlag() {
		return useApprovedSupplierFlag;
	}

	@JsonProperty("UseApprovedSupplierFlag")
	public void setUseApprovedSupplierFlag(Boolean useApprovedSupplierFlag) {
		this.useApprovedSupplierFlag = useApprovedSupplierFlag;
	}

	@JsonProperty("NegotiationRequiredFlag")
	public Object getNegotiationRequiredFlag() {
		return negotiationRequiredFlag;
	}

	@JsonProperty("NegotiationRequiredFlag")
	public void setNegotiationRequiredFlag(Object negotiationRequiredFlag) {
		this.negotiationRequiredFlag = negotiationRequiredFlag;
	}

	@JsonProperty("PurchasingInputTaxClassificationValue")
	public Object getPurchasingInputTaxClassificationValue() {
		return purchasingInputTaxClassificationValue;
	}

	@JsonProperty("PurchasingInputTaxClassificationValue")
	public void setPurchasingInputTaxClassificationValue(Object purchasingInputTaxClassificationValue) {
		this.purchasingInputTaxClassificationValue = purchasingInputTaxClassificationValue;
	}

	@JsonProperty("InvoiceCloseTolerancePercentage")
	public Object getInvoiceCloseTolerancePercentage() {
		return invoiceCloseTolerancePercentage;
	}

	@JsonProperty("InvoiceCloseTolerancePercentage")
	public void setInvoiceCloseTolerancePercentage(Object invoiceCloseTolerancePercentage) {
		this.invoiceCloseTolerancePercentage = invoiceCloseTolerancePercentage;
	}

	@JsonProperty("HazardClassValue")
	public Object getHazardClassValue() {
		return hazardClassValue;
	}

	@JsonProperty("HazardClassValue")
	public void setHazardClassValue(Object hazardClassValue) {
		this.hazardClassValue = hazardClassValue;
	}

	@JsonProperty("AssetCategoryValue")
	public Object getAssetCategoryValue() {
		return assetCategoryValue;
	}

	@JsonProperty("AssetCategoryValue")
	public void setAssetCategoryValue(Object assetCategoryValue) {
		this.assetCategoryValue = assetCategoryValue;
	}

	@JsonProperty("PurchasableFlag")
	public Boolean getPurchasableFlag() {
		return purchasableFlag;
	}

	@JsonProperty("PurchasableFlag")
	public void setPurchasableFlag(Boolean purchasableFlag) {
		this.purchasableFlag = purchasableFlag;
	}

	@JsonProperty("TaxableFlag")
	public Boolean getTaxableFlag() {
		return taxableFlag;
	}

	@JsonProperty("TaxableFlag")
	public void setTaxableFlag(Boolean taxableFlag) {
		this.taxableFlag = taxableFlag;
	}

	@JsonProperty("BuyerOrganizationValue")
	public Object getBuyerOrganizationValue() {
		return buyerOrganizationValue;
	}

	@JsonProperty("BuyerOrganizationValue")
	public void setBuyerOrganizationValue(Object buyerOrganizationValue) {
		this.buyerOrganizationValue = buyerOrganizationValue;
	}

	@JsonProperty("DefaultBuyerValue")
	public Object getDefaultBuyerValue() {
		return defaultBuyerValue;
	}

	@JsonProperty("DefaultBuyerValue")
	public void setDefaultBuyerValue(Object defaultBuyerValue) {
		this.defaultBuyerValue = defaultBuyerValue;
	}

	@JsonProperty("ReceiptCloseTolerancePercentage")
	public Object getReceiptCloseTolerancePercentage() {
		return receiptCloseTolerancePercentage;
	}

	@JsonProperty("ReceiptCloseTolerancePercentage")
	public void setReceiptCloseTolerancePercentage(Object receiptCloseTolerancePercentage) {
		this.receiptCloseTolerancePercentage = receiptCloseTolerancePercentage;
	}

	@JsonProperty("UNNumberValue")
	public Object getUNNumberValue() {
		return uNNumberValue;
	}

	@JsonProperty("UNNumberValue")
	public void setUNNumberValue(Object uNNumberValue) {
		this.uNNumberValue = uNNumberValue;
	}

	@JsonProperty("ListPrice")
	public Object getListPrice() {
		return listPrice;
	}

	@JsonProperty("ListPrice")
	public void setListPrice(Object listPrice) {
		this.listPrice = listPrice;
	}

	@JsonProperty("PriceTolerancePercentage")
	public Object getPriceTolerancePercentage() {
		return priceTolerancePercentage;
	}

	@JsonProperty("PriceTolerancePercentage")
	public void setPriceTolerancePercentage(Object priceTolerancePercentage) {
		this.priceTolerancePercentage = priceTolerancePercentage;
	}

	@JsonProperty("MarketPrice")
	public Object getMarketPrice() {
		return marketPrice;
	}

	@JsonProperty("MarketPrice")
	public void setMarketPrice(Object marketPrice) {
		this.marketPrice = marketPrice;
	}

	@JsonProperty("RoundingFactor")
	public Object getRoundingFactor() {
		return roundingFactor;
	}

	@JsonProperty("RoundingFactor")
	public void setRoundingFactor(Object roundingFactor) {
		this.roundingFactor = roundingFactor;
	}

	@JsonProperty("MatchApprovalLevelValue")
	public Object getMatchApprovalLevelValue() {
		return matchApprovalLevelValue;
	}

	@JsonProperty("MatchApprovalLevelValue")
	public void setMatchApprovalLevelValue(Object matchApprovalLevelValue) {
		this.matchApprovalLevelValue = matchApprovalLevelValue;
	}

	@JsonProperty("MatchConfigurationOptionValue")
	public Object getMatchConfigurationOptionValue() {
		return matchConfigurationOptionValue;
	}

	@JsonProperty("MatchConfigurationOptionValue")
	public void setMatchConfigurationOptionValue(Object matchConfigurationOptionValue) {
		this.matchConfigurationOptionValue = matchConfigurationOptionValue;
	}

	@JsonProperty("ReceiptDateActionValue")
	public Object getReceiptDateActionValue() {
		return receiptDateActionValue;
	}

	@JsonProperty("ReceiptDateActionValue")
	public void setReceiptDateActionValue(Object receiptDateActionValue) {
		this.receiptDateActionValue = receiptDateActionValue;
	}

	@JsonProperty("DaysEarlyReceiptAllowed")
	public Object getDaysEarlyReceiptAllowed() {
		return daysEarlyReceiptAllowed;
	}

	@JsonProperty("DaysEarlyReceiptAllowed")
	public void setDaysEarlyReceiptAllowed(Object daysEarlyReceiptAllowed) {
		this.daysEarlyReceiptAllowed = daysEarlyReceiptAllowed;
	}

	@JsonProperty("DaysLateReceiptAllowed")
	public Object getDaysLateReceiptAllowed() {
		return daysLateReceiptAllowed;
	}

	@JsonProperty("DaysLateReceiptAllowed")
	public void setDaysLateReceiptAllowed(Object daysLateReceiptAllowed) {
		this.daysLateReceiptAllowed = daysLateReceiptAllowed;
	}

	@JsonProperty("AllowSubstituteReceiptsFlag")
	public Object getAllowSubstituteReceiptsFlag() {
		return allowSubstituteReceiptsFlag;
	}

	@JsonProperty("AllowSubstituteReceiptsFlag")
	public void setAllowSubstituteReceiptsFlag(Object allowSubstituteReceiptsFlag) {
		this.allowSubstituteReceiptsFlag = allowSubstituteReceiptsFlag;
	}

	@JsonProperty("AllowUnorderedReceiptsFlag")
	public Object getAllowUnorderedReceiptsFlag() {
		return allowUnorderedReceiptsFlag;
	}

	@JsonProperty("AllowUnorderedReceiptsFlag")
	public void setAllowUnorderedReceiptsFlag(Object allowUnorderedReceiptsFlag) {
		this.allowUnorderedReceiptsFlag = allowUnorderedReceiptsFlag;
	}

	@JsonProperty("QuantityReceivedToleranceAction")
	public Object getQuantityReceivedToleranceAction() {
		return quantityReceivedToleranceAction;
	}

	@JsonProperty("QuantityReceivedToleranceAction")
	public void setQuantityReceivedToleranceAction(Object quantityReceivedToleranceAction) {
		this.quantityReceivedToleranceAction = quantityReceivedToleranceAction;
	}

	@JsonProperty("QuantityReceivedTolerancePercentage")
	public Object getQuantityReceivedTolerancePercentage() {
		return quantityReceivedTolerancePercentage;
	}

	@JsonProperty("QuantityReceivedTolerancePercentage")
	public void setQuantityReceivedTolerancePercentage(Object quantityReceivedTolerancePercentage) {
		this.quantityReceivedTolerancePercentage = quantityReceivedTolerancePercentage;
	}

	@JsonProperty("ItemExtensibleFlexfieldCategoryCode")
	public String getItemExtensibleFlexfieldCategoryCode() {
		return itemExtensibleFlexfieldCategoryCode;
	}

	@JsonProperty("ItemExtensibleFlexfieldCategoryCode")
	public void setItemExtensibleFlexfieldCategoryCode(String itemExtensibleFlexfieldCategoryCode) {
		this.itemExtensibleFlexfieldCategoryCode = itemExtensibleFlexfieldCategoryCode;
	}

	@JsonProperty("CreationDate")
	public String getCreationDate() {
		return creationDate;
	}

	@JsonProperty("CreationDate")
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@JsonProperty("LastUpdateDate")
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	@JsonProperty("LastUpdateDate")
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@JsonProperty("BackToBackEnabledFlag")
	public Boolean getBackToBackEnabledFlag() {
		return backToBackEnabledFlag;
	}

	@JsonProperty("BackToBackEnabledFlag")
	public void setBackToBackEnabledFlag(Boolean backToBackEnabledFlag) {
		this.backToBackEnabledFlag = backToBackEnabledFlag;
	}

	@JsonProperty("ContractManufacturingFlag")
	public Boolean getContractManufacturingFlag() {
		return contractManufacturingFlag;
	}

	@JsonProperty("ContractManufacturingFlag")
	public void setContractManufacturingFlag(Boolean contractManufacturingFlag) {
		this.contractManufacturingFlag = contractManufacturingFlag;
	}

	@JsonProperty("DaysOfCover")
	public Object getDaysOfCover() {
		return daysOfCover;
	}

	@JsonProperty("DaysOfCover")
	public void setDaysOfCover(Object daysOfCover) {
		this.daysOfCover = daysOfCover;
	}

	@JsonProperty("DemandPeriod")
	public Object getDemandPeriod() {
		return demandPeriod;
	}

	@JsonProperty("DemandPeriod")
	public void setDemandPeriod(Object demandPeriod) {
		this.demandPeriod = demandPeriod;
	}

	@JsonProperty("SafetyStockPlanningMethodValue")
	public String getSafetyStockPlanningMethodValue() {
		return safetyStockPlanningMethodValue;
	}

	@JsonProperty("SafetyStockPlanningMethodValue")
	public void setSafetyStockPlanningMethodValue(String safetyStockPlanningMethodValue) {
		this.safetyStockPlanningMethodValue = safetyStockPlanningMethodValue;
	}

	@JsonProperty("OutsideProcessServiceFlag")
	public Boolean getOutsideProcessServiceFlag() {
		return outsideProcessServiceFlag;
	}

	@JsonProperty("OutsideProcessServiceFlag")
	public void setOutsideProcessServiceFlag(Boolean outsideProcessServiceFlag) {
		this.outsideProcessServiceFlag = outsideProcessServiceFlag;
	}

	@JsonProperty("AllowMaintenanceAssetFlag")
	public Boolean getAllowMaintenanceAssetFlag() {
		return allowMaintenanceAssetFlag;
	}

	@JsonProperty("AllowMaintenanceAssetFlag")
	public void setAllowMaintenanceAssetFlag(Boolean allowMaintenanceAssetFlag) {
		this.allowMaintenanceAssetFlag = allowMaintenanceAssetFlag;
	}

	@JsonProperty("EnableGenealogyTrackingFlag")
	public Boolean getEnableGenealogyTrackingFlag() {
		return enableGenealogyTrackingFlag;
	}

	@JsonProperty("EnableGenealogyTrackingFlag")
	public void setEnableGenealogyTrackingFlag(Boolean enableGenealogyTrackingFlag) {
		this.enableGenealogyTrackingFlag = enableGenealogyTrackingFlag;
	}

	@JsonProperty("EngineeredItemFlag")
	public Boolean getEngineeredItemFlag() {
		return engineeredItemFlag;
	}

	@JsonProperty("EngineeredItemFlag")
	public void setEngineeredItemFlag(Boolean engineeredItemFlag) {
		this.engineeredItemFlag = engineeredItemFlag;
	}

	@JsonProperty("ProcurementBusinessUnitName")
	public Object getProcurementBusinessUnitName() {
		return procurementBusinessUnitName;
	}

	@JsonProperty("ProcurementBusinessUnitName")
	public void setProcurementBusinessUnitName(Object procurementBusinessUnitName) {
		this.procurementBusinessUnitName = procurementBusinessUnitName;
	}

	@JsonProperty("ForcePurchaseLeadTimeFlag")
	public Boolean getForcePurchaseLeadTimeFlag() {
		return forcePurchaseLeadTimeFlag;
	}

	@JsonProperty("ForcePurchaseLeadTimeFlag")
	public void setForcePurchaseLeadTimeFlag(Boolean forcePurchaseLeadTimeFlag) {
		this.forcePurchaseLeadTimeFlag = forcePurchaseLeadTimeFlag;
	}

	@JsonProperty("ReplacementTypeValue")
	public Object getReplacementTypeValue() {
		return replacementTypeValue;
	}

	@JsonProperty("ReplacementTypeValue")
	public void setReplacementTypeValue(Object replacementTypeValue) {
		this.replacementTypeValue = replacementTypeValue;
	}

	@JsonProperty("BuyerEmailAddress")
	public Object getBuyerEmailAddress() {
		return buyerEmailAddress;
	}

	@JsonProperty("BuyerEmailAddress")
	public void setBuyerEmailAddress(Object buyerEmailAddress) {
		this.buyerEmailAddress = buyerEmailAddress;
	}

	@JsonProperty("AssetTrackedValue")
	public String getAssetTrackedValue() {
		return assetTrackedValue;
	}

	@JsonProperty("AssetTrackedValue")
	public void setAssetTrackedValue(String assetTrackedValue) {
		this.assetTrackedValue = assetTrackedValue;
	}

	@JsonProperty("RequestId")
	public Integer getRequestId() {
		return requestId;
	}

	@JsonProperty("RequestId")
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	@JsonProperty("CreatedBy")
	public String getCreatedBy() {
		return createdBy;
	}

	@JsonProperty("CreatedBy")
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@JsonProperty("CreationDateTime")
	public String getCreationDateTime() {
		return creationDateTime;
	}

	@JsonProperty("CreationDateTime")
	public void setCreationDateTime(String creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@JsonProperty("LastUpdateDateTime")
	public String getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}

	@JsonProperty("LastUpdateDateTime")
	public void setLastUpdateDateTime(String lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}

	@JsonProperty("LastUpdateLogin")
	public String getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	@JsonProperty("LastUpdateLogin")
	public void setLastUpdateLogin(String lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	@JsonProperty("LastUpdatedBy")
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	@JsonProperty("LastUpdatedBy")
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@JsonProperty("InternallyTransferableFlag")
	public Boolean getInternallyTransferableFlag() {
		return internallyTransferableFlag;
	}

	@JsonProperty("InternallyTransferableFlag")
	public void setInternallyTransferableFlag(Boolean internallyTransferableFlag) {
		this.internallyTransferableFlag = internallyTransferableFlag;
	}

	@JsonProperty("TransferOrdersEnabledFlag")
	public Boolean getTransferOrdersEnabledFlag() {
		return transferOrdersEnabledFlag;
	}

	@JsonProperty("TransferOrdersEnabledFlag")
	public void setTransferOrdersEnabledFlag(Boolean transferOrdersEnabledFlag) {
		this.transferOrdersEnabledFlag = transferOrdersEnabledFlag;
	}

	@JsonProperty("ReplenishmentMaximumDaysOfSupply")
	public Object getReplenishmentMaximumDaysOfSupply() {
		return replenishmentMaximumDaysOfSupply;
	}

	@JsonProperty("ReplenishmentMaximumDaysOfSupply")
	public void setReplenishmentMaximumDaysOfSupply(Object replenishmentMaximumDaysOfSupply) {
		this.replenishmentMaximumDaysOfSupply = replenishmentMaximumDaysOfSupply;
	}

	@JsonProperty("CustomerSelfServiceEnabledFlag")
	public Boolean getCustomerSelfServiceEnabledFlag() {
		return customerSelfServiceEnabledFlag;
	}

	@JsonProperty("CustomerSelfServiceEnabledFlag")
	public void setCustomerSelfServiceEnabledFlag(Boolean customerSelfServiceEnabledFlag) {
		this.customerSelfServiceEnabledFlag = customerSelfServiceEnabledFlag;
	}

	@JsonProperty("AllowPurchasingDocumentDescriptionUpdateFlag")
	public Boolean getAllowPurchasingDocumentDescriptionUpdateFlag() {
		return allowPurchasingDocumentDescriptionUpdateFlag;
	}

	@JsonProperty("AllowPurchasingDocumentDescriptionUpdateFlag")
	public void setAllowPurchasingDocumentDescriptionUpdateFlag(Boolean allowPurchasingDocumentDescriptionUpdateFlag) {
		this.allowPurchasingDocumentDescriptionUpdateFlag = allowPurchasingDocumentDescriptionUpdateFlag;
	}

	@JsonProperty("EnableContractCoverage")
	public Boolean getEnableContractCoverage() {
		return enableContractCoverage;
	}

	@JsonProperty("EnableContractCoverage")
	public void setEnableContractCoverage(Boolean enableContractCoverage) {
		this.enableContractCoverage = enableContractCoverage;
	}

	@JsonProperty("CarryingCostPercentage")
	public Object getCarryingCostPercentage() {
		return carryingCostPercentage;
	}

	@JsonProperty("CarryingCostPercentage")
	public void setCarryingCostPercentage(Object carryingCostPercentage) {
		this.carryingCostPercentage = carryingCostPercentage;
	}

	@JsonProperty("ReplenishmentMinimumDaysOfSupply")
	public Object getReplenishmentMinimumDaysOfSupply() {
		return replenishmentMinimumDaysOfSupply;
	}

	@JsonProperty("ReplenishmentMinimumDaysOfSupply")
	public void setReplenishmentMinimumDaysOfSupply(Object replenishmentMinimumDaysOfSupply) {
		this.replenishmentMinimumDaysOfSupply = replenishmentMinimumDaysOfSupply;
	}

	@JsonProperty("AllowExpressTransactionsFlag")
	public Object getAllowExpressTransactionsFlag() {
		return allowExpressTransactionsFlag;
	}

	@JsonProperty("AllowExpressTransactionsFlag")
	public void setAllowExpressTransactionsFlag(Object allowExpressTransactionsFlag) {
		this.allowExpressTransactionsFlag = allowExpressTransactionsFlag;
	}

	@JsonProperty("ReceiptRoutingValue")
	public Object getReceiptRoutingValue() {
		return receiptRoutingValue;
	}

	@JsonProperty("ReceiptRoutingValue")
	public void setReceiptRoutingValue(Object receiptRoutingValue) {
		this.receiptRoutingValue = receiptRoutingValue;
	}

	@JsonProperty("InvoiceMatchOptionValue")
	public Object getInvoiceMatchOptionValue() {
		return invoiceMatchOptionValue;
	}

	@JsonProperty("InvoiceMatchOptionValue")
	public void setInvoiceMatchOptionValue(Object invoiceMatchOptionValue) {
		this.invoiceMatchOptionValue = invoiceMatchOptionValue;
	}

	@JsonProperty("CommsActivationRequiredFlag")
	public Object getCommsActivationRequiredFlag() {
		return commsActivationRequiredFlag;
	}

	@JsonProperty("CommsActivationRequiredFlag")
	public void setCommsActivationRequiredFlag(Object commsActivationRequiredFlag) {
		this.commsActivationRequiredFlag = commsActivationRequiredFlag;
	}

	@JsonProperty("RequiresFulfillmentLocationFlag")
	public Boolean getRequiresFulfillmentLocationFlag() {
		return requiresFulfillmentLocationFlag;
	}

	@JsonProperty("RequiresFulfillmentLocationFlag")
	public void setRequiresFulfillmentLocationFlag(Boolean requiresFulfillmentLocationFlag) {
		this.requiresFulfillmentLocationFlag = requiresFulfillmentLocationFlag;
	}

	@JsonProperty("IssueUOMValue")
	public Object getIssueUOMValue() {
		return issueUOMValue;
	}

	@JsonProperty("IssueUOMValue")
	public void setIssueUOMValue(Object issueUOMValue) {
		this.issueUOMValue = issueUOMValue;
	}

	@JsonProperty("EnforceShipToLocationValue")
	public Object getEnforceShipToLocationValue() {
		return enforceShipToLocationValue;
	}

	@JsonProperty("EnforceShipToLocationValue")
	public void setEnforceShipToLocationValue(Object enforceShipToLocationValue) {
		this.enforceShipToLocationValue = enforceShipToLocationValue;
	}

	@JsonProperty("StandardCoverageValue")
	public Object getStandardCoverageValue() {
		return standardCoverageValue;
	}

	@JsonProperty("StandardCoverageValue")
	public void setStandardCoverageValue(Object standardCoverageValue) {
		this.standardCoverageValue = standardCoverageValue;
	}

	@JsonProperty("ReplenishmentSourceTypeValue")
	public Object getReplenishmentSourceTypeValue() {
		return replenishmentSourceTypeValue;
	}

	@JsonProperty("ReplenishmentSourceTypeValue")
	public void setReplenishmentSourceTypeValue(Object replenishmentSourceTypeValue) {
		this.replenishmentSourceTypeValue = replenishmentSourceTypeValue;
	}

	@JsonProperty("TrackingUOMValue")
	public String getTrackingUOMValue() {
		return trackingUOMValue;
	}

	@JsonProperty("TrackingUOMValue")
	public void setTrackingUOMValue(String trackingUOMValue) {
		this.trackingUOMValue = trackingUOMValue;
	}

	@JsonProperty("SecondaryUOMValue")
	public Object getSecondaryUOMValue() {
		return secondaryUOMValue;
	}

	@JsonProperty("SecondaryUOMValue")
	public void setSecondaryUOMValue(Object secondaryUOMValue) {
		this.secondaryUOMValue = secondaryUOMValue;
	}

	@JsonProperty("PricingUOMValue")
	public String getPricingUOMValue() {
		return pricingUOMValue;
	}

	@JsonProperty("PricingUOMValue")
	public void setPricingUOMValue(String pricingUOMValue) {
		this.pricingUOMValue = pricingUOMValue;
	}

	@JsonProperty("HardPeggingLevelValue")
	public String getHardPeggingLevelValue() {
		return hardPeggingLevelValue;
	}

	@JsonProperty("HardPeggingLevelValue")
	public void setHardPeggingLevelValue(String hardPeggingLevelValue) {
		this.hardPeggingLevelValue = hardPeggingLevelValue;
	}

	@JsonProperty("CommonSupplyProjectDemandFlag")
	public Object getCommonSupplyProjectDemandFlag() {
		return commonSupplyProjectDemandFlag;
	}

	@JsonProperty("CommonSupplyProjectDemandFlag")
	public void setCommonSupplyProjectDemandFlag(Object commonSupplyProjectDemandFlag) {
		this.commonSupplyProjectDemandFlag = commonSupplyProjectDemandFlag;
	}

	@JsonProperty("EnableIotFlag")
	public Boolean getEnableIotFlag() {
		return enableIotFlag;
	}

	@JsonProperty("EnableIotFlag")
	public void setEnableIotFlag(Boolean enableIotFlag) {
		this.enableIotFlag = enableIotFlag;
	}

	@JsonProperty("ExpenditureTypeValue")
	public Object getExpenditureTypeValue() {
		return expenditureTypeValue;
	}

	@JsonProperty("ExpenditureTypeValue")
	public void setExpenditureTypeValue(Object expenditureTypeValue) {
		this.expenditureTypeValue = expenditureTypeValue;
	}

	@JsonProperty("PackagingStringValue")
	public Object getPackagingStringValue() {
		return packagingStringValue;
	}

	@JsonProperty("PackagingStringValue")
	public void setPackagingStringValue(Object packagingStringValue) {
		this.packagingStringValue = packagingStringValue;
	}

	@JsonProperty("CreateSupplyAfterDate")
	public Object getCreateSupplyAfterDate() {
		return createSupplyAfterDate;
	}

	@JsonProperty("CreateSupplyAfterDate")
	public void setCreateSupplyAfterDate(Object createSupplyAfterDate) {
		this.createSupplyAfterDate = createSupplyAfterDate;
	}

	@JsonProperty("CreateFixedAssetValue")
	public Object getCreateFixedAssetValue() {
		return createFixedAssetValue;
	}

	@JsonProperty("CreateFixedAssetValue")
	public void setCreateFixedAssetValue(Object createFixedAssetValue) {
		this.createFixedAssetValue = createFixedAssetValue;
	}

	@JsonProperty("UnderCompletionToleranceTypeValue")
	public Object getUnderCompletionToleranceTypeValue() {
		return underCompletionToleranceTypeValue;
	}

	@JsonProperty("UnderCompletionToleranceTypeValue")
	public void setUnderCompletionToleranceTypeValue(Object underCompletionToleranceTypeValue) {
		this.underCompletionToleranceTypeValue = underCompletionToleranceTypeValue;
	}

	@JsonProperty("UnderCompletionToleranceValue")
	public Object getUnderCompletionToleranceValue() {
		return underCompletionToleranceValue;
	}

	@JsonProperty("UnderCompletionToleranceValue")
	public void setUnderCompletionToleranceValue(Object underCompletionToleranceValue) {
		this.underCompletionToleranceValue = underCompletionToleranceValue;
	}

	@JsonProperty("links")
	public List<Link> getLinks() {
		return links;
	}

	@JsonProperty("links")
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}