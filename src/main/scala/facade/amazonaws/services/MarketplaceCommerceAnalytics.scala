package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object marketplacecommerceanalytics {
  type CustomerDefinedValues = js.Dictionary[OptionalValue]
  type DataSetPublicationDate = js.Date
  type DataSetRequestId = String
  type DataSetType = String
  type DestinationS3BucketName = String
  type DestinationS3Prefix = String
  type ExceptionMessage = String
  type FromDate = js.Date
  type OptionalKey = String
  type OptionalValue = String
  type RoleNameArn = String
  type SnsTopicArn = String
  type SupportDataSetType = String
}

package marketplacecommerceanalytics {
  @js.native
  @JSImport("aws-sdk", "MarketplaceCommerceAnalytics")
  class MarketplaceCommerceAnalytics(config: AWSConfig) extends js.Object {
    def generateDataSet(params: GenerateDataSetRequest): Request[GenerateDataSetResult] = js.native
    def startSupportDataExport(params: StartSupportDataExportRequest): Request[StartSupportDataExportResult] = js.native
  }

  object DataSetTypeEnum {
    val customer_subscriber_hourly_monthly_subscriptions = "customer_subscriber_hourly_monthly_subscriptions"
    val customer_subscriber_annual_subscriptions = "customer_subscriber_annual_subscriptions"
    val daily_business_usage_by_instance_type = "daily_business_usage_by_instance_type"
    val daily_business_fees = "daily_business_fees"
    val daily_business_free_trial_conversions = "daily_business_free_trial_conversions"
    val daily_business_new_instances = "daily_business_new_instances"
    val daily_business_new_product_subscribers = "daily_business_new_product_subscribers"
    val daily_business_canceled_product_subscribers = "daily_business_canceled_product_subscribers"
    val monthly_revenue_billing_and_revenue_data = "monthly_revenue_billing_and_revenue_data"
    val monthly_revenue_annual_subscriptions = "monthly_revenue_annual_subscriptions"
    val disbursed_amount_by_product = "disbursed_amount_by_product"
    val disbursed_amount_by_product_with_uncollected_funds = "disbursed_amount_by_product_with_uncollected_funds"
    val disbursed_amount_by_instance_hours = "disbursed_amount_by_instance_hours"
    val disbursed_amount_by_customer_geo = "disbursed_amount_by_customer_geo"
    val disbursed_amount_by_age_of_uncollected_funds = "disbursed_amount_by_age_of_uncollected_funds"
    val disbursed_amount_by_age_of_disbursed_funds = "disbursed_amount_by_age_of_disbursed_funds"
    val customer_profile_by_industry = "customer_profile_by_industry"
    val customer_profile_by_revenue = "customer_profile_by_revenue"
    val customer_profile_by_geography = "customer_profile_by_geography"
    val sales_compensation_billed_revenue = "sales_compensation_billed_revenue"
    val us_sales_and_use_tax_records = "us_sales_and_use_tax_records"

    val values = IndexedSeq(customer_subscriber_hourly_monthly_subscriptions, customer_subscriber_annual_subscriptions, daily_business_usage_by_instance_type, daily_business_fees, daily_business_free_trial_conversions, daily_business_new_instances, daily_business_new_product_subscribers, daily_business_canceled_product_subscribers, monthly_revenue_billing_and_revenue_data, monthly_revenue_annual_subscriptions, disbursed_amount_by_product, disbursed_amount_by_product_with_uncollected_funds, disbursed_amount_by_instance_hours, disbursed_amount_by_customer_geo, disbursed_amount_by_age_of_uncollected_funds, disbursed_amount_by_age_of_disbursed_funds, customer_profile_by_industry, customer_profile_by_revenue, customer_profile_by_geography, sales_compensation_billed_revenue, us_sales_and_use_tax_records)
  }

  /**
   * Container for the parameters to the GenerateDataSet operation.
   */
  @js.native
  trait GenerateDataSetRequest extends js.Object {
    var destinationS3BucketName: js.UndefOr[DestinationS3BucketName]
    var dataSetType: js.UndefOr[DataSetType]
    var customerDefinedValues: js.UndefOr[CustomerDefinedValues]
    var dataSetPublicationDate: js.UndefOr[DataSetPublicationDate]
    var roleNameArn: js.UndefOr[RoleNameArn]
    var destinationS3Prefix: js.UndefOr[DestinationS3Prefix]
    var snsTopicArn: js.UndefOr[SnsTopicArn]
  }

  object GenerateDataSetRequest {
    def apply(
      destinationS3BucketName: js.UndefOr[DestinationS3BucketName] = js.undefined,
      dataSetType: js.UndefOr[DataSetType] = js.undefined,
      customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.undefined,
      dataSetPublicationDate: js.UndefOr[DataSetPublicationDate] = js.undefined,
      roleNameArn: js.UndefOr[RoleNameArn] = js.undefined,
      destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.undefined,
      snsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined): GenerateDataSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationS3BucketName" -> destinationS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "dataSetType" -> dataSetType.map { x => x.asInstanceOf[js.Any] },
        "customerDefinedValues" -> customerDefinedValues.map { x => x.asInstanceOf[js.Any] },
        "dataSetPublicationDate" -> dataSetPublicationDate.map { x => x.asInstanceOf[js.Any] },
        "roleNameArn" -> roleNameArn.map { x => x.asInstanceOf[js.Any] },
        "destinationS3Prefix" -> destinationS3Prefix.map { x => x.asInstanceOf[js.Any] },
        "snsTopicArn" -> snsTopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataSetRequest]
    }
  }

  /**
   * Container for the result of the GenerateDataSet operation.
   */
  @js.native
  trait GenerateDataSetResult extends js.Object {
    var dataSetRequestId: js.UndefOr[DataSetRequestId]
  }

  object GenerateDataSetResult {
    def apply(
      dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined): GenerateDataSetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSetRequestId" -> dataSetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataSetResult]
    }
  }

  /**
   * This exception is thrown when an internal service error occurs.
   */
  @js.native
  trait MarketplaceCommerceAnalyticsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * Container for the parameters to the StartSupportDataExport operation.
   */
  @js.native
  trait StartSupportDataExportRequest extends js.Object {
    var destinationS3BucketName: js.UndefOr[DestinationS3BucketName]
    var dataSetType: js.UndefOr[SupportDataSetType]
    var customerDefinedValues: js.UndefOr[CustomerDefinedValues]
    var fromDate: js.UndefOr[FromDate]
    var roleNameArn: js.UndefOr[RoleNameArn]
    var destinationS3Prefix: js.UndefOr[DestinationS3Prefix]
    var snsTopicArn: js.UndefOr[SnsTopicArn]
  }

  object StartSupportDataExportRequest {
    def apply(
      destinationS3BucketName: js.UndefOr[DestinationS3BucketName] = js.undefined,
      dataSetType: js.UndefOr[SupportDataSetType] = js.undefined,
      customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.undefined,
      fromDate: js.UndefOr[FromDate] = js.undefined,
      roleNameArn: js.UndefOr[RoleNameArn] = js.undefined,
      destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.undefined,
      snsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined): StartSupportDataExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationS3BucketName" -> destinationS3BucketName.map { x => x.asInstanceOf[js.Any] },
        "dataSetType" -> dataSetType.map { x => x.asInstanceOf[js.Any] },
        "customerDefinedValues" -> customerDefinedValues.map { x => x.asInstanceOf[js.Any] },
        "fromDate" -> fromDate.map { x => x.asInstanceOf[js.Any] },
        "roleNameArn" -> roleNameArn.map { x => x.asInstanceOf[js.Any] },
        "destinationS3Prefix" -> destinationS3Prefix.map { x => x.asInstanceOf[js.Any] },
        "snsTopicArn" -> snsTopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSupportDataExportRequest]
    }
  }

  /**
   * Container for the result of the StartSupportDataExport operation.
   */
  @js.native
  trait StartSupportDataExportResult extends js.Object {
    var dataSetRequestId: js.UndefOr[DataSetRequestId]
  }

  object StartSupportDataExportResult {
    def apply(
      dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined): StartSupportDataExportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSetRequestId" -> dataSetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSupportDataExportResult]
    }
  }

  object SupportDataSetTypeEnum {
    val customer_support_contacts_data = "customer_support_contacts_data"
    val test_customer_support_contacts_data = "test_customer_support_contacts_data"

    val values = IndexedSeq(customer_support_contacts_data, test_customer_support_contacts_data)
  }
}
