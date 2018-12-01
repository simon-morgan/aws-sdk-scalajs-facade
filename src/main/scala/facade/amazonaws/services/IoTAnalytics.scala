package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object iotanalytics {
  type ActivityBatchSize = Int
  type ActivityName = String
  type AttributeName = String
  type AttributeNameMapping = js.Dictionary[AttributeName]
  type AttributeNames = js.Array[AttributeName]
  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type ChannelArn = String
  type ChannelName = String
  type ChannelStatus = String
  type ChannelSummaries = js.Array[ChannelSummary]
  type ComputeType = String
  type DatasetActionName = String
  type DatasetActionSummaries = js.Array[DatasetActionSummary]
  type DatasetActionType = String
  type DatasetActions = js.Array[DatasetAction]
  type DatasetArn = String
  type DatasetContentDeliveryRules = js.Array[DatasetContentDeliveryRule]
  type DatasetContentState = String
  type DatasetContentSummaries = js.Array[DatasetContentSummary]
  type DatasetContentVersion = String
  type DatasetEntries = js.Array[DatasetEntry]
  type DatasetName = String
  type DatasetStatus = String
  type DatasetSummaries = js.Array[DatasetSummary]
  type DatasetTriggers = js.Array[DatasetTrigger]
  type DatastoreArn = String
  type DatastoreName = String
  type DatastoreStatus = String
  type DatastoreSummaries = js.Array[DatastoreSummary]
  type DoubleValue = Double
  type EndTime = js.Date
  type EntryName = String
  type ErrorCode = String
  type ErrorMessage = String
  type FilterExpression = String
  type Image = String
  type IncludeStatisticsFlag = Boolean
  type IotEventsInputName = String
  type LambdaName = String
  type LogResult = String
  type LoggingEnabled = Boolean
  type LoggingLevel = String
  type MathExpression = String
  type MaxMessages = Int
  type MaxResults = Int
  type MessageId = String
  type MessagePayload = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MessagePayloads = js.Array[MessagePayload]
  type Messages = js.Array[Message]
  type NextToken = String
  type OffsetSeconds = Int
  type OutputFileName = String
  type PipelineActivities = js.Array[PipelineActivity]
  type PipelineArn = String
  type PipelineName = String
  type PipelineSummaries = js.Array[PipelineSummary]
  type PresignedURI = String
  type QueryFilters = js.Array[QueryFilter]
  type Reason = String
  type ReprocessingId = String
  type ReprocessingStatus = String
  type ReprocessingSummaries = js.Array[ReprocessingSummary]
  type ResourceArn = String
  type RetentionPeriodInDays = Int
  type RoleArn = String
  type ScheduleExpression = String
  type SizeInBytes = Double
  type SqlQuery = String
  type StartTime = js.Date
  type StringValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeExpression = String
  type Timestamp = js.Date
  type UnlimitedRetentionPeriod = Boolean
  type VariableName = String
  type Variables = js.Array[Variable]
  type VolumeSizeInGB = Int
}

package iotanalytics {
  @js.native
  @JSImport("aws-sdk", "IoTAnalytics")
  class IoTAnalytics(config: AWSConfig) extends js.Object {
    def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse] = js.native
    def cancelPipelineReprocessing(params: CancelPipelineReprocessingRequest): Request[CancelPipelineReprocessingResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createDatasetContent(params: CreateDatasetContentRequest): Request[CreateDatasetContentResponse] = js.native
    def createDatastore(params: CreateDatastoreRequest): Request[CreateDatastoreResponse] = js.native
    def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[js.Object] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object] = js.native
    def deleteDatasetContent(params: DeleteDatasetContentRequest): Request[js.Object] = js.native
    def deleteDatastore(params: DeleteDatastoreRequest): Request[js.Object] = js.native
    def deletePipeline(params: DeletePipelineRequest): Request[js.Object] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeDatastore(params: DescribeDatastoreRequest): Request[DescribeDatastoreResponse] = js.native
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse] = js.native
    def describePipeline(params: DescribePipelineRequest): Request[DescribePipelineResponse] = js.native
    def getDatasetContent(params: GetDatasetContentRequest): Request[GetDatasetContentResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listDatasetContents(params: ListDatasetContentsRequest): Request[ListDatasetContentsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listDatastores(params: ListDatastoresRequest): Request[ListDatastoresResponse] = js.native
    def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object] = js.native
    def runPipelineActivity(params: RunPipelineActivityRequest): Request[RunPipelineActivityResponse] = js.native
    def sampleChannelData(params: SampleChannelDataRequest): Request[SampleChannelDataResponse] = js.native
    def startPipelineReprocessing(params: StartPipelineReprocessingRequest): Request[StartPipelineReprocessingResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[js.Object] = js.native
    def updateDataset(params: UpdateDatasetRequest): Request[js.Object] = js.native
    def updateDatastore(params: UpdateDatastoreRequest): Request[js.Object] = js.native
    def updatePipeline(params: UpdatePipelineRequest): Request[js.Object] = js.native
  }

  /**
   * <p>An activity that adds other attributes based on existing attributes in the message.</p>
   */
  @js.native
  trait AddAttributesActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var attributes: js.UndefOr[AttributeNameMapping]
    var next: js.UndefOr[ActivityName]
  }

  object AddAttributesActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      attributes: js.UndefOr[AttributeNameMapping] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): AddAttributesActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttributesActivity]
    }
  }

  /**
   * <p>Contains informations about errors.</p>
   */
  @js.native
  trait BatchPutMessageErrorEntry extends js.Object {
    var messageId: js.UndefOr[MessageId]
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchPutMessageErrorEntry {
    def apply(
      messageId: js.UndefOr[MessageId] = js.undefined,
      errorCode: js.UndefOr[ErrorCode] = js.undefined,
      errorMessage: js.UndefOr[ErrorMessage] = js.undefined): BatchPutMessageErrorEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "messageId" -> messageId.map { x => x.asInstanceOf[js.Any] },
        "errorCode" -> errorCode.map { x => x.asInstanceOf[js.Any] },
        "errorMessage" -> errorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutMessageErrorEntry]
    }
  }

  @js.native
  trait BatchPutMessageRequest extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var messages: js.UndefOr[Messages]
  }

  object BatchPutMessageRequest {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      messages: js.UndefOr[Messages] = js.undefined): BatchPutMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "messages" -> messages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutMessageRequest]
    }
  }

  @js.native
  trait BatchPutMessageResponse extends js.Object {
    var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries]
  }

  object BatchPutMessageResponse {
    def apply(
      batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined): BatchPutMessageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "batchPutMessageErrorEntries" -> batchPutMessageErrorEntries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutMessageResponse]
    }
  }

  @js.native
  trait CancelPipelineReprocessingRequest extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
    var reprocessingId: js.UndefOr[ReprocessingId]
  }

  object CancelPipelineReprocessingRequest {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined,
      reprocessingId: js.UndefOr[ReprocessingId] = js.undefined): CancelPipelineReprocessingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] },
        "reprocessingId" -> reprocessingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelPipelineReprocessingRequest]
    }
  }

  @js.native
  trait CancelPipelineReprocessingResponse extends js.Object {

  }

  object CancelPipelineReprocessingResponse {
    def apply(): CancelPipelineReprocessingResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelPipelineReprocessingResponse]
    }
  }

  /**
   * <p>A collection of data from an MQTT topic. Channels archive the raw, unprocessed messages before publishing the data to a pipeline.</p>
   */
  @js.native
  trait Channel extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var name: js.UndefOr[ChannelName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[ChannelStatus]
    var creationTime: js.UndefOr[Timestamp]
  }

  object Channel {
    def apply(
      arn: js.UndefOr[ChannelArn] = js.undefined,
      name: js.UndefOr[ChannelName] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      status: js.UndefOr[ChannelStatus] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
    }
  }

  /**
   * <p>The activity that determines the source of the messages to be processed.</p>
   */
  @js.native
  trait ChannelActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var channelName: js.UndefOr[ChannelName]
    var next: js.UndefOr[ActivityName]
  }

  object ChannelActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      channelName: js.UndefOr[ChannelName] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): ChannelActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelActivity]
    }
  }

  /**
   * <p>Statistics information about the channel.</p>
   */
  @js.native
  trait ChannelStatistics extends js.Object {
    var size: js.UndefOr[EstimatedResourceSize]
  }

  object ChannelStatistics {
    def apply(
      size: js.UndefOr[EstimatedResourceSize] = js.undefined): ChannelStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "size" -> size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelStatistics]
    }
  }

  object ChannelStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING)
  }

  /**
   * <p>A summary of information about a channel.</p>
   */
  @js.native
  trait ChannelSummary extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var status: js.UndefOr[ChannelStatus]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
  }

  object ChannelSummary {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      status: js.UndefOr[ChannelStatus] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined): ChannelSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelSummary]
    }
  }

  object ComputeTypeEnum {
    val ACU_1 = "ACU_1"
    val ACU_2 = "ACU_2"

    val values = IndexedSeq(ACU_1, ACU_2)
  }

  /**
   * <p>Information needed to run the "containerAction" to produce data set contents.</p>
   */
  @js.native
  trait ContainerDatasetAction extends js.Object {
    var image: js.UndefOr[Image]
    var executionRoleArn: js.UndefOr[RoleArn]
    var resourceConfiguration: js.UndefOr[ResourceConfiguration]
    var variables: js.UndefOr[Variables]
  }

  object ContainerDatasetAction {
    def apply(
      image: js.UndefOr[Image] = js.undefined,
      executionRoleArn: js.UndefOr[RoleArn] = js.undefined,
      resourceConfiguration: js.UndefOr[ResourceConfiguration] = js.undefined,
      variables: js.UndefOr[Variables] = js.undefined): ContainerDatasetAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "image" -> image.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "resourceConfiguration" -> resourceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "variables" -> variables.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDatasetAction]
    }
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  object CreateChannelRequest {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): CreateChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var channelArn: js.UndefOr[ChannelArn]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object CreateChannelResponse {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      channelArn: js.UndefOr[ChannelArn] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined): CreateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "channelArn" -> channelArn.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelResponse]
    }
  }

  @js.native
  trait CreateDatasetContentRequest extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
  }

  object CreateDatasetContentRequest {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined): CreateDatasetContentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatasetContentRequest]
    }
  }

  @js.native
  trait CreateDatasetContentResponse extends js.Object {
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object CreateDatasetContentResponse {
    def apply(
      versionId: js.UndefOr[DatasetContentVersion] = js.undefined): CreateDatasetContentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "versionId" -> versionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatasetContentResponse]
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var tags: js.UndefOr[TagList]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var datasetName: js.UndefOr[DatasetName]
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var triggers: js.UndefOr[DatasetTriggers]
    var actions: js.UndefOr[DatasetActions]
  }

  object CreateDatasetRequest {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
      triggers: js.UndefOr[DatasetTriggers] = js.undefined,
      actions: js.UndefOr[DatasetActions] = js.undefined): CreateDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "contentDeliveryRules" -> contentDeliveryRules.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] },
        "actions" -> actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
    var datasetArn: js.UndefOr[DatasetArn]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object CreateDatasetResponse {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      datasetArn: js.UndefOr[DatasetArn] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined): CreateDatasetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "datasetArn" -> datasetArn.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateDatastoreRequest extends js.Object {
    var datastoreName: js.UndefOr[DatastoreName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  object CreateDatastoreRequest {
    def apply(
      datastoreName: js.UndefOr[DatastoreName] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): CreateDatastoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatastoreRequest]
    }
  }

  @js.native
  trait CreateDatastoreResponse extends js.Object {
    var datastoreName: js.UndefOr[DatastoreName]
    var datastoreArn: js.UndefOr[DatastoreArn]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object CreateDatastoreResponse {
    def apply(
      datastoreName: js.UndefOr[DatastoreName] = js.undefined,
      datastoreArn: js.UndefOr[DatastoreArn] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined): CreateDatastoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] },
        "datastoreArn" -> datastoreArn.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatastoreResponse]
    }
  }

  @js.native
  trait CreatePipelineRequest extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineActivities: js.UndefOr[PipelineActivities]
    var tags: js.UndefOr[TagList]
  }

  object CreatePipelineRequest {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined,
      pipelineActivities: js.UndefOr[PipelineActivities] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): CreatePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] },
        "pipelineActivities" -> pipelineActivities.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineRequest]
    }
  }

  @js.native
  trait CreatePipelineResponse extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineArn: js.UndefOr[PipelineArn]
  }

  object CreatePipelineResponse {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined,
      pipelineArn: js.UndefOr[PipelineArn] = js.undefined): CreatePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] },
        "pipelineArn" -> pipelineArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineResponse]
    }
  }

  /**
   * <p>Information about a data set.</p>
   */
  @js.native
  trait Dataset extends js.Object {
    var arn: js.UndefOr[DatasetArn]
    var name: js.UndefOr[DatasetName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var triggers: js.UndefOr[DatasetTriggers]
    var status: js.UndefOr[DatasetStatus]
    var actions: js.UndefOr[DatasetActions]
    var creationTime: js.UndefOr[Timestamp]
  }

  object Dataset {
    def apply(
      arn: js.UndefOr[DatasetArn] = js.undefined,
      name: js.UndefOr[DatasetName] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
      triggers: js.UndefOr[DatasetTriggers] = js.undefined,
      status: js.UndefOr[DatasetStatus] = js.undefined,
      actions: js.UndefOr[DatasetActions] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): Dataset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "contentDeliveryRules" -> contentDeliveryRules.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "actions" -> actions.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dataset]
    }
  }

  /**
   * <p>A "DatasetAction" object specifying the query that creates the data set content.</p>
   */
  @js.native
  trait DatasetAction extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var queryAction: js.UndefOr[SqlQueryDatasetAction]
    var containerAction: js.UndefOr[ContainerDatasetAction]
  }

  object DatasetAction {
    def apply(
      actionName: js.UndefOr[DatasetActionName] = js.undefined,
      queryAction: js.UndefOr[SqlQueryDatasetAction] = js.undefined,
      containerAction: js.UndefOr[ContainerDatasetAction] = js.undefined): DatasetAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "actionName" -> actionName.map { x => x.asInstanceOf[js.Any] },
        "queryAction" -> queryAction.map { x => x.asInstanceOf[js.Any] },
        "containerAction" -> containerAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetAction]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DatasetActionSummary extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var actionType: js.UndefOr[DatasetActionType]
  }

  object DatasetActionSummary {
    def apply(
      actionName: js.UndefOr[DatasetActionName] = js.undefined,
      actionType: js.UndefOr[DatasetActionType] = js.undefined): DatasetActionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "actionName" -> actionName.map { x => x.asInstanceOf[js.Any] },
        "actionType" -> actionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetActionSummary]
    }
  }

  object DatasetActionTypeEnum {
    val QUERY = "QUERY"
    val CONTAINER = "CONTAINER"

    val values = IndexedSeq(QUERY, CONTAINER)
  }

  @js.native
  trait DatasetContentDeliveryDestination extends js.Object {
    var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration]
  }

  object DatasetContentDeliveryDestination {
    def apply(
      iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined): DatasetContentDeliveryDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "iotEventsDestinationConfiguration" -> iotEventsDestinationConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetContentDeliveryDestination]
    }
  }

  @js.native
  trait DatasetContentDeliveryRule extends js.Object {
    var entryName: js.UndefOr[EntryName]
    var destination: js.UndefOr[DatasetContentDeliveryDestination]
  }

  object DatasetContentDeliveryRule {
    def apply(
      entryName: js.UndefOr[EntryName] = js.undefined,
      destination: js.UndefOr[DatasetContentDeliveryDestination] = js.undefined): DatasetContentDeliveryRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "entryName" -> entryName.map { x => x.asInstanceOf[js.Any] },
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetContentDeliveryRule]
    }
  }

  object DatasetContentStateEnum {
    val CREATING = "CREATING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATING, SUCCEEDED, FAILED)
  }

  /**
   * <p>The state of the data set contents and the reason they are in this state.</p>
   */
  @js.native
  trait DatasetContentStatus extends js.Object {
    var state: js.UndefOr[DatasetContentState]
    var reason: js.UndefOr[Reason]
  }

  object DatasetContentStatus {
    def apply(
      state: js.UndefOr[DatasetContentState] = js.undefined,
      reason: js.UndefOr[Reason] = js.undefined): DatasetContentStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetContentStatus]
    }
  }

  /**
   * <p>Summary information about data set contents.</p>
   */
  @js.native
  trait DatasetContentSummary extends js.Object {
    var version: js.UndefOr[DatasetContentVersion]
    var status: js.UndefOr[DatasetContentStatus]
    var creationTime: js.UndefOr[Timestamp]
    var scheduleTime: js.UndefOr[Timestamp]
  }

  object DatasetContentSummary {
    def apply(
      version: js.UndefOr[DatasetContentVersion] = js.undefined,
      status: js.UndefOr[DatasetContentStatus] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      scheduleTime: js.UndefOr[Timestamp] = js.undefined): DatasetContentSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "scheduleTime" -> scheduleTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetContentSummary]
    }
  }

  /**
   * <p>The data set whose latest contents will be used as input to the notebook or application.</p>
   */
  @js.native
  trait DatasetContentVersionValue extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
  }

  object DatasetContentVersionValue {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined): DatasetContentVersionValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetContentVersionValue]
    }
  }

  /**
   * <p>The reference to a data set entry.</p>
   */
  @js.native
  trait DatasetEntry extends js.Object {
    var entryName: js.UndefOr[EntryName]
    var dataURI: js.UndefOr[PresignedURI]
  }

  object DatasetEntry {
    def apply(
      entryName: js.UndefOr[EntryName] = js.undefined,
      dataURI: js.UndefOr[PresignedURI] = js.undefined): DatasetEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "entryName" -> entryName.map { x => x.asInstanceOf[js.Any] },
        "dataURI" -> dataURI.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetEntry]
    }
  }

  object DatasetStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING)
  }

  /**
   * <p>A summary of information about a data set.</p>
   */
  @js.native
  trait DatasetSummary extends js.Object {
    var lastUpdateTime: js.UndefOr[Timestamp]
    var datasetName: js.UndefOr[DatasetName]
    var triggers: js.UndefOr[DatasetTriggers]
    var status: js.UndefOr[DatasetStatus]
    var actions: js.UndefOr[DatasetActionSummaries]
    var creationTime: js.UndefOr[Timestamp]
  }

  object DatasetSummary {
    def apply(
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      triggers: js.UndefOr[DatasetTriggers] = js.undefined,
      status: js.UndefOr[DatasetStatus] = js.undefined,
      actions: js.UndefOr[DatasetActionSummaries] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): DatasetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "actions" -> actions.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetSummary]
    }
  }

  /**
   * <p>The "DatasetTrigger" that specifies when the data set is automatically updated.</p>
   */
  @js.native
  trait DatasetTrigger extends js.Object {
    var schedule: js.UndefOr[Schedule]
    var dataset: js.UndefOr[TriggeringDataset]
  }

  object DatasetTrigger {
    def apply(
      schedule: js.UndefOr[Schedule] = js.undefined,
      dataset: js.UndefOr[TriggeringDataset] = js.undefined): DatasetTrigger = {
      val _fields = IndexedSeq[(String, js.Any)](
        "schedule" -> schedule.map { x => x.asInstanceOf[js.Any] },
        "dataset" -> dataset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatasetTrigger]
    }
  }

  /**
   * <p>Information about a data store.</p>
   */
  @js.native
  trait Datastore extends js.Object {
    var arn: js.UndefOr[DatastoreArn]
    var name: js.UndefOr[DatastoreName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[DatastoreStatus]
    var creationTime: js.UndefOr[Timestamp]
  }

  object Datastore {
    def apply(
      arn: js.UndefOr[DatastoreArn] = js.undefined,
      name: js.UndefOr[DatastoreName] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      status: js.UndefOr[DatastoreStatus] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): Datastore = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Datastore]
    }
  }

  /**
   * <p>The 'datastore' activity that specifies where to store the processed data.</p>
   */
  @js.native
  trait DatastoreActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var datastoreName: js.UndefOr[DatastoreName]
  }

  object DatastoreActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      datastoreName: js.UndefOr[DatastoreName] = js.undefined): DatastoreActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatastoreActivity]
    }
  }

  /**
   * <p>Statistical information about the data store.</p>
   */
  @js.native
  trait DatastoreStatistics extends js.Object {
    var size: js.UndefOr[EstimatedResourceSize]
  }

  object DatastoreStatistics {
    def apply(
      size: js.UndefOr[EstimatedResourceSize] = js.undefined): DatastoreStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "size" -> size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatastoreStatistics]
    }
  }

  object DatastoreStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING)
  }

  /**
   * <p>A summary of information about a data store.</p>
   */
  @js.native
  trait DatastoreSummary extends js.Object {
    var datastoreName: js.UndefOr[DatastoreName]
    var status: js.UndefOr[DatastoreStatus]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
  }

  object DatastoreSummary {
    def apply(
      datastoreName: js.UndefOr[DatastoreName] = js.undefined,
      status: js.UndefOr[DatastoreStatus] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined): DatastoreSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatastoreSummary]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var channelName: js.UndefOr[ChannelName]
  }

  object DeleteChannelRequest {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined): DeleteChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteDatasetContentRequest extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object DeleteDatasetContentRequest {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      versionId: js.UndefOr[DatasetContentVersion] = js.undefined): DeleteDatasetContentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "versionId" -> versionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatasetContentRequest]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
  }

  object DeleteDatasetRequest {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined): DeleteDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteDatastoreRequest extends js.Object {
    var datastoreName: js.UndefOr[DatastoreName]
  }

  object DeleteDatastoreRequest {
    def apply(
      datastoreName: js.UndefOr[DatastoreName] = js.undefined): DeleteDatastoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatastoreRequest]
    }
  }

  @js.native
  trait DeletePipelineRequest extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
  }

  object DeletePipelineRequest {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined): DeletePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePipelineRequest]
    }
  }

  /**
   * <p>When you create data set contents using message data from a specified time frame, some message data may still be "in flight" when processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your message data, so that data not processed from the previous time frame will be included with the next time frame. Without this, missed message data would be excluded from processing during the next time frame as well, because its timestamp places it within the previous time frame.</p>
   */
  @js.native
  trait DeltaTime extends js.Object {
    var offsetSeconds: js.UndefOr[OffsetSeconds]
    var timeExpression: js.UndefOr[TimeExpression]
  }

  object DeltaTime {
    def apply(
      offsetSeconds: js.UndefOr[OffsetSeconds] = js.undefined,
      timeExpression: js.UndefOr[TimeExpression] = js.undefined): DeltaTime = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offsetSeconds" -> offsetSeconds.map { x => x.asInstanceOf[js.Any] },
        "timeExpression" -> timeExpression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeltaTime]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  object DescribeChannelRequest {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined): DescribeChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "includeStatistics" -> includeStatistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
    var statistics: js.UndefOr[ChannelStatistics]
  }

  object DescribeChannelResponse {
    def apply(
      channel: js.UndefOr[Channel] = js.undefined,
      statistics: js.UndefOr[ChannelStatistics] = js.undefined): DescribeChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channel" -> channel.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
  }

  object DescribeDatasetRequest {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined): DescribeDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var dataset: js.UndefOr[Dataset]
  }

  object DescribeDatasetResponse {
    def apply(
      dataset: js.UndefOr[Dataset] = js.undefined): DescribeDatasetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataset" -> dataset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeDatastoreRequest extends js.Object {
    var datastoreName: js.UndefOr[DatastoreName]
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  object DescribeDatastoreRequest {
    def apply(
      datastoreName: js.UndefOr[DatastoreName] = js.undefined,
      includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined): DescribeDatastoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] },
        "includeStatistics" -> includeStatistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDatastoreRequest]
    }
  }

  @js.native
  trait DescribeDatastoreResponse extends js.Object {
    var datastore: js.UndefOr[Datastore]
    var statistics: js.UndefOr[DatastoreStatistics]
  }

  object DescribeDatastoreResponse {
    def apply(
      datastore: js.UndefOr[Datastore] = js.undefined,
      statistics: js.UndefOr[DatastoreStatistics] = js.undefined): DescribeDatastoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastore" -> datastore.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDatastoreResponse]
    }
  }

  @js.native
  trait DescribeLoggingOptionsRequest extends js.Object {

  }

  object DescribeLoggingOptionsRequest {
    def apply(): DescribeLoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoggingOptionsRequest]
    }
  }

  @js.native
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  object DescribeLoggingOptionsResponse {
    def apply(
      loggingOptions: js.UndefOr[LoggingOptions] = js.undefined): DescribeLoggingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loggingOptions" -> loggingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoggingOptionsResponse]
    }
  }

  @js.native
  trait DescribePipelineRequest extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
  }

  object DescribePipelineRequest {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined): DescribePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePipelineRequest]
    }
  }

  @js.native
  trait DescribePipelineResponse extends js.Object {
    var pipeline: js.UndefOr[Pipeline]
  }

  object DescribePipelineResponse {
    def apply(
      pipeline: js.UndefOr[Pipeline] = js.undefined): DescribePipelineResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipeline" -> pipeline.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePipelineResponse]
    }
  }

  /**
   * <p>An activity that adds data from the AWS IoT device registry to your message.</p>
   */
  @js.native
  trait DeviceRegistryEnrichActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var thingName: js.UndefOr[AttributeName]
    var roleArn: js.UndefOr[RoleArn]
    var next: js.UndefOr[ActivityName]
    var attribute: js.UndefOr[AttributeName]
  }

  object DeviceRegistryEnrichActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      thingName: js.UndefOr[AttributeName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined,
      attribute: js.UndefOr[AttributeName] = js.undefined): DeviceRegistryEnrichActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] },
        "attribute" -> attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceRegistryEnrichActivity]
    }
  }

  /**
   * <p>An activity that adds information from the AWS IoT Device Shadows service to a message.</p>
   */
  @js.native
  trait DeviceShadowEnrichActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var thingName: js.UndefOr[AttributeName]
    var roleArn: js.UndefOr[RoleArn]
    var next: js.UndefOr[ActivityName]
    var attribute: js.UndefOr[AttributeName]
  }

  object DeviceShadowEnrichActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      thingName: js.UndefOr[AttributeName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined,
      attribute: js.UndefOr[AttributeName] = js.undefined): DeviceShadowEnrichActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] },
        "attribute" -> attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceShadowEnrichActivity]
    }
  }

  /**
   * <p>The estimated size of the resource.</p>
   */
  @js.native
  trait EstimatedResourceSize extends js.Object {
    var estimatedSizeInBytes: js.UndefOr[SizeInBytes]
    var estimatedOn: js.UndefOr[Timestamp]
  }

  object EstimatedResourceSize {
    def apply(
      estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined,
      estimatedOn: js.UndefOr[Timestamp] = js.undefined): EstimatedResourceSize = {
      val _fields = IndexedSeq[(String, js.Any)](
        "estimatedSizeInBytes" -> estimatedSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "estimatedOn" -> estimatedOn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EstimatedResourceSize]
    }
  }

  /**
   * <p>An activity that filters a message based on its attributes.</p>
   */
  @js.native
  trait FilterActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var filter: js.UndefOr[FilterExpression]
    var next: js.UndefOr[ActivityName]
  }

  object FilterActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      filter: js.UndefOr[FilterExpression] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): FilterActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterActivity]
    }
  }

  @js.native
  trait GetDatasetContentRequest extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object GetDatasetContentRequest {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      versionId: js.UndefOr[DatasetContentVersion] = js.undefined): GetDatasetContentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "versionId" -> versionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDatasetContentRequest]
    }
  }

  @js.native
  trait GetDatasetContentResponse extends js.Object {
    var entries: js.UndefOr[DatasetEntries]
    var timestamp: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatasetContentStatus]
  }

  object GetDatasetContentResponse {
    def apply(
      entries: js.UndefOr[DatasetEntries] = js.undefined,
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      status: js.UndefOr[DatasetContentStatus] = js.undefined): GetDatasetContentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "entries" -> entries.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDatasetContentResponse]
    }
  }

  @js.native
  trait IotEventsDestinationConfiguration extends js.Object {
    var inputName: js.UndefOr[IotEventsInputName]
    var roleArn: js.UndefOr[RoleArn]
  }

  object IotEventsDestinationConfiguration {
    def apply(
      inputName: js.UndefOr[IotEventsInputName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): IotEventsDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inputName" -> inputName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IotEventsDestinationConfiguration]
    }
  }

  /**
   * <p>An activity that runs a Lambda function to modify the message.</p>
   */
  @js.native
  trait LambdaActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var lambdaName: js.UndefOr[LambdaName]
    var batchSize: js.UndefOr[ActivityBatchSize]
    var next: js.UndefOr[ActivityName]
  }

  object LambdaActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      lambdaName: js.UndefOr[LambdaName] = js.undefined,
      batchSize: js.UndefOr[ActivityBatchSize] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): LambdaActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lambdaName" -> lambdaName.map { x => x.asInstanceOf[js.Any] },
        "batchSize" -> batchSize.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaActivity]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListChannelsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var channelSummaries: js.UndefOr[ChannelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListChannelsResponse {
    def apply(
      channelSummaries: js.UndefOr[ChannelSummaries] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelSummaries" -> channelSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListDatasetContentsRequest extends js.Object {
    var datasetName: js.UndefOr[DatasetName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListDatasetContentsRequest {
    def apply(
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListDatasetContentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetContentsRequest]
    }
  }

  @js.native
  trait ListDatasetContentsResponse extends js.Object {
    var datasetContentSummaries: js.UndefOr[DatasetContentSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetContentsResponse {
    def apply(
      datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDatasetContentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetContentSummaries" -> datasetContentSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetContentsResponse]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListDatasetsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListDatasetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var datasetSummaries: js.UndefOr[DatasetSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    def apply(
      datasetSummaries: js.UndefOr[DatasetSummaries] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDatasetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datasetSummaries" -> datasetSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListDatastoresRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListDatastoresRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListDatastoresRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatastoresRequest]
    }
  }

  @js.native
  trait ListDatastoresResponse extends js.Object {
    var datastoreSummaries: js.UndefOr[DatastoreSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatastoresResponse {
    def apply(
      datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDatastoresResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreSummaries" -> datastoreSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatastoresResponse]
    }
  }

  @js.native
  trait ListPipelinesRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListPipelinesRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListPipelinesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesRequest]
    }
  }

  @js.native
  trait ListPipelinesResponse extends js.Object {
    var pipelineSummaries: js.UndefOr[PipelineSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelinesResponse {
    def apply(
      pipelineSummaries: js.UndefOr[PipelineSummaries] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListPipelinesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineSummaries" -> pipelineSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
  }

  object ListTagsForResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LoggingLevelEnum {
    val ERROR = "ERROR"

    val values = IndexedSeq(ERROR)
  }

  /**
   * <p>Information about logging options.</p>
   */
  @js.native
  trait LoggingOptions extends js.Object {
    var roleArn: js.UndefOr[RoleArn]
    var level: js.UndefOr[LoggingLevel]
    var enabled: js.UndefOr[LoggingEnabled]
  }

  object LoggingOptions {
    def apply(
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      level: js.UndefOr[LoggingLevel] = js.undefined,
      enabled: js.UndefOr[LoggingEnabled] = js.undefined): LoggingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "level" -> level.map { x => x.asInstanceOf[js.Any] },
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingOptions]
    }
  }

  /**
   * <p>An activity that computes an arithmetic expression using the message's attributes.</p>
   */
  @js.native
  trait MathActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var attribute: js.UndefOr[AttributeName]
    var math: js.UndefOr[MathExpression]
    var next: js.UndefOr[ActivityName]
  }

  object MathActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      attribute: js.UndefOr[AttributeName] = js.undefined,
      math: js.UndefOr[MathExpression] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): MathActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "attribute" -> attribute.map { x => x.asInstanceOf[js.Any] },
        "math" -> math.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MathActivity]
    }
  }

  /**
   * <p>Information about a message.</p>
   */
  @js.native
  trait Message extends js.Object {
    var messageId: js.UndefOr[MessageId]
    var payload: js.UndefOr[MessagePayload]
  }

  object Message {
    def apply(
      messageId: js.UndefOr[MessageId] = js.undefined,
      payload: js.UndefOr[MessagePayload] = js.undefined): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "messageId" -> messageId.map { x => x.asInstanceOf[js.Any] },
        "payload" -> payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
   * <p>The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.</p>
   */
  @js.native
  trait OutputFileUriValue extends js.Object {
    var fileName: js.UndefOr[OutputFileName]
  }

  object OutputFileUriValue {
    def apply(
      fileName: js.UndefOr[OutputFileName] = js.undefined): OutputFileUriValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fileName" -> fileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputFileUriValue]
    }
  }

  /**
   * <p>Contains information about a pipeline.</p>
   */
  @js.native
  trait Pipeline extends js.Object {
    var arn: js.UndefOr[PipelineArn]
    var name: js.UndefOr[PipelineName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var activities: js.UndefOr[PipelineActivities]
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries]
    var creationTime: js.UndefOr[Timestamp]
  }

  object Pipeline {
    def apply(
      arn: js.UndefOr[PipelineArn] = js.undefined,
      name: js.UndefOr[PipelineName] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
      activities: js.UndefOr[PipelineActivities] = js.undefined,
      reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): Pipeline = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "activities" -> activities.map { x => x.asInstanceOf[js.Any] },
        "reprocessingSummaries" -> reprocessingSummaries.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Pipeline]
    }
  }

  /**
   * <p>An activity that performs a transformation on a message.</p>
   */
  @js.native
  trait PipelineActivity extends js.Object {
    var channel: js.UndefOr[ChannelActivity]
    var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity]
    var lambda: js.UndefOr[LambdaActivity]
    var filter: js.UndefOr[FilterActivity]
    var addAttributes: js.UndefOr[AddAttributesActivity]
    var math: js.UndefOr[MathActivity]
    var datastore: js.UndefOr[DatastoreActivity]
    var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity]
    var selectAttributes: js.UndefOr[SelectAttributesActivity]
    var removeAttributes: js.UndefOr[RemoveAttributesActivity]
  }

  object PipelineActivity {
    def apply(
      channel: js.UndefOr[ChannelActivity] = js.undefined,
      deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.undefined,
      lambda: js.UndefOr[LambdaActivity] = js.undefined,
      filter: js.UndefOr[FilterActivity] = js.undefined,
      addAttributes: js.UndefOr[AddAttributesActivity] = js.undefined,
      math: js.UndefOr[MathActivity] = js.undefined,
      datastore: js.UndefOr[DatastoreActivity] = js.undefined,
      deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.undefined,
      selectAttributes: js.UndefOr[SelectAttributesActivity] = js.undefined,
      removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.undefined): PipelineActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channel" -> channel.map { x => x.asInstanceOf[js.Any] },
        "deviceShadowEnrich" -> deviceShadowEnrich.map { x => x.asInstanceOf[js.Any] },
        "lambda" -> lambda.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "addAttributes" -> addAttributes.map { x => x.asInstanceOf[js.Any] },
        "math" -> math.map { x => x.asInstanceOf[js.Any] },
        "datastore" -> datastore.map { x => x.asInstanceOf[js.Any] },
        "deviceRegistryEnrich" -> deviceRegistryEnrich.map { x => x.asInstanceOf[js.Any] },
        "selectAttributes" -> selectAttributes.map { x => x.asInstanceOf[js.Any] },
        "removeAttributes" -> removeAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineActivity]
    }
  }

  /**
   * <p>A summary of information about a pipeline.</p>
   */
  @js.native
  trait PipelineSummary extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
  }

  object PipelineSummary {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined,
      reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      lastUpdateTime: js.UndefOr[Timestamp] = js.undefined): PipelineSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] },
        "reprocessingSummaries" -> reprocessingSummaries.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "lastUpdateTime" -> lastUpdateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineSummary]
    }
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  object PutLoggingOptionsRequest {
    def apply(
      loggingOptions: js.UndefOr[LoggingOptions] = js.undefined): PutLoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loggingOptions" -> loggingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLoggingOptionsRequest]
    }
  }

  /**
   * <p>Information which is used to filter message data, to segregate it according to the time frame in which it arrives.</p>
   */
  @js.native
  trait QueryFilter extends js.Object {
    var deltaTime: js.UndefOr[DeltaTime]
  }

  object QueryFilter {
    def apply(
      deltaTime: js.UndefOr[DeltaTime] = js.undefined): QueryFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deltaTime" -> deltaTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryFilter]
    }
  }

  /**
   * <p>An activity that removes attributes from a message.</p>
   */
  @js.native
  trait RemoveAttributesActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var attributes: js.UndefOr[AttributeNames]
    var next: js.UndefOr[ActivityName]
  }

  object RemoveAttributesActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      attributes: js.UndefOr[AttributeNames] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): RemoveAttributesActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesActivity]
    }
  }

  object ReprocessingStatusEnum {
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val CANCELLED = "CANCELLED"
    val FAILED = "FAILED"

    val values = IndexedSeq(RUNNING, SUCCEEDED, CANCELLED, FAILED)
  }

  /**
   * <p>Information about pipeline reprocessing.</p>
   */
  @js.native
  trait ReprocessingSummary extends js.Object {
    var id: js.UndefOr[ReprocessingId]
    var status: js.UndefOr[ReprocessingStatus]
    var creationTime: js.UndefOr[Timestamp]
  }

  object ReprocessingSummary {
    def apply(
      id: js.UndefOr[ReprocessingId] = js.undefined,
      status: js.UndefOr[ReprocessingStatus] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): ReprocessingSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReprocessingSummary]
    }
  }

  /**
   * <p>The configuration of the resource used to execute the "containerAction".</p>
   */
  @js.native
  trait ResourceConfiguration extends js.Object {
    var computeType: js.UndefOr[ComputeType]
    var volumeSizeInGB: js.UndefOr[VolumeSizeInGB]
  }

  object ResourceConfiguration {
    def apply(
      computeType: js.UndefOr[ComputeType] = js.undefined,
      volumeSizeInGB: js.UndefOr[VolumeSizeInGB] = js.undefined): ResourceConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeType" -> computeType.map { x => x.asInstanceOf[js.Any] },
        "volumeSizeInGB" -> volumeSizeInGB.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceConfiguration]
    }
  }

  /**
   * <p>How long, in days, message data is kept.</p>
   */
  @js.native
  trait RetentionPeriod extends js.Object {
    var unlimited: js.UndefOr[UnlimitedRetentionPeriod]
    var numberOfDays: js.UndefOr[RetentionPeriodInDays]
  }

  object RetentionPeriod {
    def apply(
      unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined,
      numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined): RetentionPeriod = {
      val _fields = IndexedSeq[(String, js.Any)](
        "unlimited" -> unlimited.map { x => x.asInstanceOf[js.Any] },
        "numberOfDays" -> numberOfDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetentionPeriod]
    }
  }

  @js.native
  trait RunPipelineActivityRequest extends js.Object {
    var pipelineActivity: js.UndefOr[PipelineActivity]
    var payloads: js.UndefOr[MessagePayloads]
  }

  object RunPipelineActivityRequest {
    def apply(
      pipelineActivity: js.UndefOr[PipelineActivity] = js.undefined,
      payloads: js.UndefOr[MessagePayloads] = js.undefined): RunPipelineActivityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineActivity" -> pipelineActivity.map { x => x.asInstanceOf[js.Any] },
        "payloads" -> payloads.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunPipelineActivityRequest]
    }
  }

  @js.native
  trait RunPipelineActivityResponse extends js.Object {
    var payloads: js.UndefOr[MessagePayloads]
    var logResult: js.UndefOr[LogResult]
  }

  object RunPipelineActivityResponse {
    def apply(
      payloads: js.UndefOr[MessagePayloads] = js.undefined,
      logResult: js.UndefOr[LogResult] = js.undefined): RunPipelineActivityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "payloads" -> payloads.map { x => x.asInstanceOf[js.Any] },
        "logResult" -> logResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunPipelineActivityResponse]
    }
  }

  @js.native
  trait SampleChannelDataRequest extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var maxMessages: js.UndefOr[MaxMessages]
    var startTime: js.UndefOr[StartTime]
    var endTime: js.UndefOr[EndTime]
  }

  object SampleChannelDataRequest {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      maxMessages: js.UndefOr[MaxMessages] = js.undefined,
      startTime: js.UndefOr[StartTime] = js.undefined,
      endTime: js.UndefOr[EndTime] = js.undefined): SampleChannelDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "maxMessages" -> maxMessages.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SampleChannelDataRequest]
    }
  }

  @js.native
  trait SampleChannelDataResponse extends js.Object {
    var payloads: js.UndefOr[MessagePayloads]
  }

  object SampleChannelDataResponse {
    def apply(
      payloads: js.UndefOr[MessagePayloads] = js.undefined): SampleChannelDataResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "payloads" -> payloads.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SampleChannelDataResponse]
    }
  }

  /**
   * <p>The schedule for when to trigger an update.</p>
   */
  @js.native
  trait Schedule extends js.Object {
    var expression: js.UndefOr[ScheduleExpression]
  }

  object Schedule {
    def apply(
      expression: js.UndefOr[ScheduleExpression] = js.undefined): Schedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expression" -> expression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Schedule]
    }
  }

  /**
   * <p>Creates a new message using only the specified attributes from the original message.</p>
   */
  @js.native
  trait SelectAttributesActivity extends js.Object {
    var name: js.UndefOr[ActivityName]
    var attributes: js.UndefOr[AttributeNames]
    var next: js.UndefOr[ActivityName]
  }

  object SelectAttributesActivity {
    def apply(
      name: js.UndefOr[ActivityName] = js.undefined,
      attributes: js.UndefOr[AttributeNames] = js.undefined,
      next: js.UndefOr[ActivityName] = js.undefined): SelectAttributesActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "next" -> next.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectAttributesActivity]
    }
  }

  /**
   * <p>The SQL query to modify the message.</p>
   */
  @js.native
  trait SqlQueryDatasetAction extends js.Object {
    var sqlQuery: js.UndefOr[SqlQuery]
    var filters: js.UndefOr[QueryFilters]
  }

  object SqlQueryDatasetAction {
    def apply(
      sqlQuery: js.UndefOr[SqlQuery] = js.undefined,
      filters: js.UndefOr[QueryFilters] = js.undefined): SqlQueryDatasetAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sqlQuery" -> sqlQuery.map { x => x.asInstanceOf[js.Any] },
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlQueryDatasetAction]
    }
  }

  @js.native
  trait StartPipelineReprocessingRequest extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
    var startTime: js.UndefOr[StartTime]
    var endTime: js.UndefOr[EndTime]
  }

  object StartPipelineReprocessingRequest {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined,
      startTime: js.UndefOr[StartTime] = js.undefined,
      endTime: js.UndefOr[EndTime] = js.undefined): StartPipelineReprocessingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartPipelineReprocessingRequest]
    }
  }

  @js.native
  trait StartPipelineReprocessingResponse extends js.Object {
    var reprocessingId: js.UndefOr[ReprocessingId]
  }

  object StartPipelineReprocessingResponse {
    def apply(
      reprocessingId: js.UndefOr[ReprocessingId] = js.undefined): StartPipelineReprocessingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reprocessingId" -> reprocessingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartPipelineReprocessingResponse]
    }
  }

  /**
   * <p>A set of key/value pairs which are used to manage the resource.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  /**
   * <p>Information about the data set whose content generation will trigger the new data set content generation.</p>
   */
  @js.native
  trait TriggeringDataset extends js.Object {
    var name: js.UndefOr[DatasetName]
  }

  object TriggeringDataset {
    def apply(
      name: js.UndefOr[DatasetName] = js.undefined): TriggeringDataset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TriggeringDataset]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var tagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tagKeys" -> tagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateChannelRequest extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateChannelRequest {
    def apply(
      channelName: js.UndefOr[ChannelName] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined): UpdateChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateDatasetRequest extends js.Object {
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var datasetName: js.UndefOr[DatasetName]
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var triggers: js.UndefOr[DatasetTriggers]
    var actions: js.UndefOr[DatasetActions]
  }

  object UpdateDatasetRequest {
    def apply(
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
      datasetName: js.UndefOr[DatasetName] = js.undefined,
      contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
      triggers: js.UndefOr[DatasetTriggers] = js.undefined,
      actions: js.UndefOr[DatasetActions] = js.undefined): UpdateDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "datasetName" -> datasetName.map { x => x.asInstanceOf[js.Any] },
        "contentDeliveryRules" -> contentDeliveryRules.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] },
        "actions" -> actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDatasetRequest]
    }
  }

  @js.native
  trait UpdateDatastoreRequest extends js.Object {
    var datastoreName: js.UndefOr[DatastoreName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateDatastoreRequest {
    def apply(
      datastoreName: js.UndefOr[DatastoreName] = js.undefined,
      retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined): UpdateDatastoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "datastoreName" -> datastoreName.map { x => x.asInstanceOf[js.Any] },
        "retentionPeriod" -> retentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDatastoreRequest]
    }
  }

  @js.native
  trait UpdatePipelineRequest extends js.Object {
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineActivities: js.UndefOr[PipelineActivities]
  }

  object UpdatePipelineRequest {
    def apply(
      pipelineName: js.UndefOr[PipelineName] = js.undefined,
      pipelineActivities: js.UndefOr[PipelineActivities] = js.undefined): UpdatePipelineRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineName" -> pipelineName.map { x => x.asInstanceOf[js.Any] },
        "pipelineActivities" -> pipelineActivities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePipelineRequest]
    }
  }

  /**
   * <p>An instance of a variable to be passed to the "containerAction" execution. Each variable must have a name and a value given by one of "stringValue", "datasetContentVersionValue", or "outputFileUriValue".</p>
   */
  @js.native
  trait Variable extends js.Object {
    var name: js.UndefOr[VariableName]
    var doubleValue: js.UndefOr[DoubleValue]
    var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue]
    var outputFileUriValue: js.UndefOr[OutputFileUriValue]
    var stringValue: js.UndefOr[StringValue]
  }

  object Variable {
    def apply(
      name: js.UndefOr[VariableName] = js.undefined,
      doubleValue: js.UndefOr[DoubleValue] = js.undefined,
      datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.undefined,
      outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.undefined,
      stringValue: js.UndefOr[StringValue] = js.undefined): Variable = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "doubleValue" -> doubleValue.map { x => x.asInstanceOf[js.Any] },
        "datasetContentVersionValue" -> datasetContentVersionValue.map { x => x.asInstanceOf[js.Any] },
        "outputFileUriValue" -> outputFileUriValue.map { x => x.asInstanceOf[js.Any] },
        "stringValue" -> stringValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Variable]
    }
  }
}