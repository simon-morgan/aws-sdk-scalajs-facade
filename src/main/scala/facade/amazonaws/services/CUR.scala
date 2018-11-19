package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cur {
  type AWSRegion = String
  type AdditionalArtifact = String
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type CompressionFormat = String
  type DeleteResponseMessage = String
  type ErrorMessage = String
  type GenericString = String
  type MaxResults = Int
  type ReportDefinitionList = js.Array[ReportDefinition]
  type ReportFormat = String
  type ReportName = String
  type S3Bucket = String
  type S3Prefix = String
  type SchemaElement = String
  type SchemaElementList = js.Array[SchemaElement]
  type TimeUnit = String
}

package cur {
  @js.native
  @JSImport("aws-sdk", "CUR")
  class CUR(config: AWSConfig) extends js.Object {
    def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResponse] = js.native
    def describeReportDefinitions(params: DescribeReportDefinitionsRequest): Request[DescribeReportDefinitionsResponse] = js.native
    def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResponse] = js.native
  }

  /**
   * Region of customer S3 bucket.
   */
  object AWSRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-central-1` = "eu-central-1"
    val `eu-west-1` = "eu-west-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"

    val values = IndexedSeq(`us-east-1`, `us-west-1`, `us-west-2`, `eu-central-1`, `eu-west-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`)
  }

  /**
   * Enable support for Redshift and/or QuickSight.
   */
  object AdditionalArtifactEnum {
    val REDSHIFT = "REDSHIFT"
    val QUICKSIGHT = "QUICKSIGHT"

    val values = IndexedSeq(REDSHIFT, QUICKSIGHT)
  }

  /**
   * Preferred compression format for report.
   */
  object CompressionFormatEnum {
    val ZIP = "ZIP"
    val GZIP = "GZIP"

    val values = IndexedSeq(ZIP, GZIP)
  }

  /**
   * Request of DeleteReportDefinition
   */
  @js.native
  trait DeleteReportDefinitionRequest extends js.Object {
    var ReportName: js.UndefOr[ReportName]
  }

  object DeleteReportDefinitionRequest {
    def apply(
      ReportName: js.UndefOr[ReportName] = js.undefined): DeleteReportDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReportName" -> ReportName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReportDefinitionRequest]
    }
  }

  /**
   * Response of DeleteReportDefinition
   */
  @js.native
  trait DeleteReportDefinitionResponse extends js.Object {
    var ResponseMessage: js.UndefOr[DeleteResponseMessage]
  }

  object DeleteReportDefinitionResponse {
    def apply(
      ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.undefined): DeleteReportDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResponseMessage" -> ResponseMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReportDefinitionResponse]
    }
  }

  /**
   * Request of DescribeReportDefinitions
   */
  @js.native
  trait DescribeReportDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeReportDefinitionsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeReportDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReportDefinitionsRequest]
    }
  }

  /**
   * Response of DescribeReportDefinitions
   */
  @js.native
  trait DescribeReportDefinitionsResponse extends js.Object {
    var ReportDefinitions: js.UndefOr[ReportDefinitionList]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeReportDefinitionsResponse {
    def apply(
      ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined,
      NextToken: js.UndefOr[GenericString] = js.undefined): DescribeReportDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReportDefinitions" -> ReportDefinitions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReportDefinitionsResponse]
    }
  }

  /**
   * This exception is thrown when putting a report preference with a name that already exists.
   */
  @js.native
  trait DuplicateReportNameExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * This exception is thrown on a known dependency failure.
   */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Request of PutReportDefinition
   */
  @js.native
  trait PutReportDefinitionRequest extends js.Object {
    var ReportDefinition: js.UndefOr[ReportDefinition]
  }

  object PutReportDefinitionRequest {
    def apply(
      ReportDefinition: js.UndefOr[ReportDefinition] = js.undefined): PutReportDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReportDefinition" -> ReportDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutReportDefinitionRequest]
    }
  }

  /**
   * Response of PutReportDefinition
   */
  @js.native
  trait PutReportDefinitionResponse extends js.Object {

  }

  object PutReportDefinitionResponse {
    def apply(): PutReportDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutReportDefinitionResponse]
    }
  }

  /**
   * The definition of AWS Cost and Usage Report. Customer can specify the report name, time unit, report format, compression format, S3 bucket and additional artifacts and schema elements in the definition.
   */
  @js.native
  trait ReportDefinition extends js.Object {
    var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList]
    var Format: js.UndefOr[ReportFormat]
    var S3Bucket: js.UndefOr[S3Bucket]
    var Compression: js.UndefOr[CompressionFormat]
    var ReportName: js.UndefOr[ReportName]
    var S3Prefix: js.UndefOr[S3Prefix]
    var TimeUnit: js.UndefOr[TimeUnit]
    var S3Region: js.UndefOr[AWSRegion]
    var AdditionalSchemaElements: js.UndefOr[SchemaElementList]
  }

  object ReportDefinition {
    def apply(
      AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.undefined,
      Format: js.UndefOr[ReportFormat] = js.undefined,
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      Compression: js.UndefOr[CompressionFormat] = js.undefined,
      ReportName: js.UndefOr[ReportName] = js.undefined,
      S3Prefix: js.UndefOr[S3Prefix] = js.undefined,
      TimeUnit: js.UndefOr[TimeUnit] = js.undefined,
      S3Region: js.UndefOr[AWSRegion] = js.undefined,
      AdditionalSchemaElements: js.UndefOr[SchemaElementList] = js.undefined): ReportDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalArtifacts" -> AdditionalArtifacts.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "Compression" -> Compression.map { x => x.asInstanceOf[js.Any] },
        "ReportName" -> ReportName.map { x => x.asInstanceOf[js.Any] },
        "S3Prefix" -> S3Prefix.map { x => x.asInstanceOf[js.Any] },
        "TimeUnit" -> TimeUnit.map { x => x.asInstanceOf[js.Any] },
        "S3Region" -> S3Region.map { x => x.asInstanceOf[js.Any] },
        "AdditionalSchemaElements" -> AdditionalSchemaElements.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportDefinition]
    }
  }

  /**
   * Preferred format for report.
   */
  object ReportFormatEnum {
    val textORcsv = "textORcsv"

    val values = IndexedSeq(textORcsv)
  }

  /**
   * This exception is thrown when the number of report preference reaches max limit. The max number is 5.
   */
  @js.native
  trait ReportLimitReachedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Preference of including Resource IDs. You can include additional details about individual resource IDs in your report.
   */
  object SchemaElementEnum {
    val RESOURCES = "RESOURCES"

    val values = IndexedSeq(RESOURCES)
  }

  /**
   * The frequency on which report data are measured and displayed.
   */
  object TimeUnitEnum {
    val HOURLY = "HOURLY"
    val DAILY = "DAILY"

    val values = IndexedSeq(HOURLY, DAILY)
  }

  /**
   * This exception is thrown when providing an invalid input. eg. Put a report preference with an invalid report name, or Delete a report preference with an empty report name.
   */
  @js.native
  trait ValidationExceptionException extends js.Object {
    val Message: ErrorMessage
  }
}
