package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisvideo {
  type APIName = String
  type ComparisonOperator = String
  type DataEndpoint = String
  type DataRetentionChangeInHours = Int
  type DataRetentionInHours = Int
  type DeviceName = String
  type ErrorMessage = String
  type KmsKeyId = String
  type ListStreamsInputLimit = Int
  type MediaType = String
  type NextToken = String
  type ResourceARN = String
  type ResourceTags = js.Dictionary[TagValue]
  type Status = String
  type StreamInfoList = js.Array[StreamInfo]
  type StreamName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Timestamp = js.Date
  type UpdateDataRetentionOperation = String
  type Version = String
}

package kinesisvideo {
  @js.native
  @JSImport("aws-sdk", "KinesisVideo")
  class KinesisVideo(config: AWSConfig) extends js.Object {
    def createStream(params: CreateStreamInput): Request[CreateStreamOutput] = js.native
    def deleteStream(params: DeleteStreamInput): Request[DeleteStreamOutput] = js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput] = js.native
    def getDataEndpoint(params: GetDataEndpointInput): Request[GetDataEndpointOutput] = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput] = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput] = js.native
    def tagStream(params: TagStreamInput): Request[TagStreamOutput] = js.native
    def untagStream(params: UntagStreamInput): Request[UntagStreamOutput] = js.native
    def updateDataRetention(params: UpdateDataRetentionInput): Request[UpdateDataRetentionOutput] = js.native
    def updateStream(params: UpdateStreamInput): Request[UpdateStreamOutput] = js.native
  }

  object APINameEnum {
    val PUT_MEDIA = "PUT_MEDIA"
    val GET_MEDIA = "GET_MEDIA"
    val LIST_FRAGMENTS = "LIST_FRAGMENTS"
    val GET_MEDIA_FOR_FRAGMENT_LIST = "GET_MEDIA_FOR_FRAGMENT_LIST"
    val GET_HLS_STREAMING_SESSION_URL = "GET_HLS_STREAMING_SESSION_URL"

    val values = IndexedSeq(PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL)
  }

  /**
   * <p>The number of streams created for the account is too high.</p>
   */
  @js.native
  trait AccountStreamLimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later.</p>
   */
  @js.native
  trait ClientLimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object ComparisonOperatorEnum {
    val BEGINS_WITH = "BEGINS_WITH"

    val values = IndexedSeq(BEGINS_WITH)
  }

  @js.native
  trait CreateStreamInput extends js.Object {
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var MediaType: js.UndefOr[MediaType]
    var StreamName: js.UndefOr[StreamName]
    var DeviceName: js.UndefOr[DeviceName]
  }

  object CreateStreamInput {
    def apply(
      DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      MediaType: js.UndefOr[MediaType] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      DeviceName: js.UndefOr[DeviceName] = js.undefined): CreateStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataRetentionInHours" -> DataRetentionInHours.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "MediaType" -> MediaType.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamInput]
    }
  }

  @js.native
  trait CreateStreamOutput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
  }

  object CreateStreamOutput {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined): CreateStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamOutput]
    }
  }

  @js.native
  trait DeleteStreamInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var CurrentVersion: js.UndefOr[Version]
  }

  object DeleteStreamInput {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      CurrentVersion: js.UndefOr[Version] = js.undefined): DeleteStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "CurrentVersion" -> CurrentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamInput]
    }
  }

  @js.native
  trait DeleteStreamOutput extends js.Object {

  }

  object DeleteStreamOutput {
    def apply(): DeleteStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamOutput]
    }
  }

  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var StreamARN: js.UndefOr[ResourceARN]
  }

  object DescribeStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      StreamARN: js.UndefOr[ResourceARN] = js.undefined): DescribeStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamInput]
    }
  }

  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamInfo: js.UndefOr[StreamInfo]
  }

  object DescribeStreamOutput {
    def apply(
      StreamInfo: js.UndefOr[StreamInfo] = js.undefined): DescribeStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamInfo" -> StreamInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamOutput]
    }
  }

  /**
   * <p>Not implemented. </p>
   */
  @js.native
  trait DeviceStreamLimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait GetDataEndpointInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var StreamARN: js.UndefOr[ResourceARN]
    var APIName: js.UndefOr[APIName]
  }

  object GetDataEndpointInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      APIName: js.UndefOr[APIName] = js.undefined): GetDataEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "APIName" -> APIName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataEndpointInput]
    }
  }

  @js.native
  trait GetDataEndpointOutput extends js.Object {
    var DataEndpoint: js.UndefOr[DataEndpoint]
  }

  object GetDataEndpointOutput {
    def apply(
      DataEndpoint: js.UndefOr[DataEndpoint] = js.undefined): GetDataEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataEndpoint" -> DataEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataEndpointOutput]
    }
  }

  /**
   * <p>The value for this input parameter is invalid.</p>
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Not implemented.</p>
   */
  @js.native
  trait InvalidDeviceExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The format of the <code>StreamARN</code> is invalid.</p>
   */
  @js.native
  trait InvalidResourceFormatExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait ListStreamsInput extends js.Object {
    var MaxResults: js.UndefOr[ListStreamsInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamNameCondition: js.UndefOr[StreamNameCondition]
  }

  object ListStreamsInput {
    def apply(
      MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StreamNameCondition: js.UndefOr[StreamNameCondition] = js.undefined): ListStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StreamNameCondition" -> StreamNameCondition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsInput]
    }
  }

  @js.native
  trait ListStreamsOutput extends js.Object {
    var StreamInfoList: js.UndefOr[StreamInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStreamsOutput {
    def apply(
      StreamInfoList: js.UndefOr[StreamInfoList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamInfoList" -> StreamInfoList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsOutput]
    }
  }

  @js.native
  trait ListTagsForStreamInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object ListTagsForStreamInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): ListTagsForStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamInput]
    }
  }

  @js.native
  trait ListTagsForStreamOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[ResourceTags]
  }

  object ListTagsForStreamOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Tags: js.UndefOr[ResourceTags] = js.undefined): ListTagsForStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamOutput]
    }
  }

  /**
   * <p>The caller is not authorized to perform this operation.</p>
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The stream is currently not available for this operation.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Amazon Kinesis Video Streams can't find the stream that you specified.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object StatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, UPDATING, DELETING)
  }

  /**
   * <p>An object describing a Kinesis video stream.</p>
   */
  @js.native
  trait StreamInfo extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours]
    var Version: js.UndefOr[Version]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var MediaType: js.UndefOr[MediaType]
    var StreamName: js.UndefOr[StreamName]
    var DeviceName: js.UndefOr[DeviceName]
    var Status: js.UndefOr[Status]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object StreamInfo {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined,
      Version: js.UndefOr[Version] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      MediaType: js.UndefOr[MediaType] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      DeviceName: js.UndefOr[DeviceName] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): StreamInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "DataRetentionInHours" -> DataRetentionInHours.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "MediaType" -> MediaType.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamInfo]
    }
  }

  /**
   * <p>Specifies the condition that streams must satisfy to be returned when you list streams (see the <code>ListStreams</code> API). A condition has a comparison operation and a value. Currently, you can specify only the <code>BEGINS_WITH</code> operator, which finds streams whose names start with a given prefix. </p>
   */
  @js.native
  trait StreamNameCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var ComparisonValue: js.UndefOr[StreamName]
  }

  object StreamNameCondition {
    def apply(
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      ComparisonValue: js.UndefOr[StreamName] = js.undefined): StreamNameCondition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "ComparisonValue" -> ComparisonValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamNameCondition]
    }
  }

  @js.native
  trait TagStreamInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
    var Tags: js.UndefOr[ResourceTags]
  }

  object TagStreamInput {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Tags: js.UndefOr[ResourceTags] = js.undefined): TagStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagStreamInput]
    }
  }

  @js.native
  trait TagStreamOutput extends js.Object {

  }

  object TagStreamOutput {
    def apply(): TagStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagStreamOutput]
    }
  }

  /**
   * <p>You have exceeded the limit of tags that you can associate with the resource. Kinesis video streams support up to 50 tags. </p>
   */
  @js.native
  trait TagsPerResourceExceededLimitExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait UntagStreamInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
    var TagKeyList: js.UndefOr[TagKeyList]
  }

  object UntagStreamInput {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      TagKeyList: js.UndefOr[TagKeyList] = js.undefined): UntagStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "TagKeyList" -> TagKeyList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagStreamInput]
    }
  }

  @js.native
  trait UntagStreamOutput extends js.Object {

  }

  object UntagStreamOutput {
    def apply(): UntagStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagStreamOutput]
    }
  }

  @js.native
  trait UpdateDataRetentionInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var DataRetentionChangeInHours: js.UndefOr[DataRetentionChangeInHours]
    var Operation: js.UndefOr[UpdateDataRetentionOperation]
    var CurrentVersion: js.UndefOr[Version]
    var StreamName: js.UndefOr[StreamName]
  }

  object UpdateDataRetentionInput {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      DataRetentionChangeInHours: js.UndefOr[DataRetentionChangeInHours] = js.undefined,
      Operation: js.UndefOr[UpdateDataRetentionOperation] = js.undefined,
      CurrentVersion: js.UndefOr[Version] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): UpdateDataRetentionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "DataRetentionChangeInHours" -> DataRetentionChangeInHours.map { x => x.asInstanceOf[js.Any] },
        "Operation" -> Operation.map { x => x.asInstanceOf[js.Any] },
        "CurrentVersion" -> CurrentVersion.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataRetentionInput]
    }
  }

  object UpdateDataRetentionOperationEnum {
    val INCREASE_DATA_RETENTION = "INCREASE_DATA_RETENTION"
    val DECREASE_DATA_RETENTION = "DECREASE_DATA_RETENTION"

    val values = IndexedSeq(INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION)
  }

  @js.native
  trait UpdateDataRetentionOutput extends js.Object {

  }

  object UpdateDataRetentionOutput {
    def apply(): UpdateDataRetentionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataRetentionOutput]
    }
  }

  @js.native
  trait UpdateStreamInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var MediaType: js.UndefOr[MediaType]
    var CurrentVersion: js.UndefOr[Version]
    var StreamName: js.UndefOr[StreamName]
    var DeviceName: js.UndefOr[DeviceName]
  }

  object UpdateStreamInput {
    def apply(
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      MediaType: js.UndefOr[MediaType] = js.undefined,
      CurrentVersion: js.UndefOr[Version] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      DeviceName: js.UndefOr[DeviceName] = js.undefined): UpdateStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "MediaType" -> MediaType.map { x => x.asInstanceOf[js.Any] },
        "CurrentVersion" -> CurrentVersion.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamInput]
    }
  }

  @js.native
  trait UpdateStreamOutput extends js.Object {

  }

  object UpdateStreamOutput {
    def apply(): UpdateStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamOutput]
    }
  }

  /**
   * <p>The stream version that you specified is not the latest version. To get the latest version, use the <a href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a> API.</p>
   */
  @js.native
  trait VersionMismatchExceptionException extends js.Object {
    val Message: ErrorMessage
  }
}