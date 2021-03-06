package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object dynamodbstreams {
  type AttributeMap = js.Dictionary[AttributeValue]
  type AttributeName = String
  type BinaryAttributeValue = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type Date = js.Date
  type ErrorMessage = String
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = String
  type KeyType = String
  type ListAttributeValue = js.Array[AttributeValue]
  type MapAttributeValue = js.Dictionary[AttributeValue]
  type NullAttributeValue = Boolean
  type NumberAttributeValue = String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type OperationType = String
  type PositiveIntegerObject = Int
  type PositiveLongObject = Double
  type RecordList = js.Array[Record]
  type SequenceNumber = String
  type ShardDescriptionList = js.Array[Shard]
  type ShardId = String
  type ShardIterator = String
  type ShardIteratorType = String
  type StreamArn = String
  type StreamList = js.Array[Stream]
  type StreamStatus = String
  type StreamViewType = String
  type StringAttributeValue = String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName = String
}

package dynamodbstreams {
  @js.native
  @JSImport("aws-sdk", "DynamoDBStreams")
  class DynamoDBStreams() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput] = js.native
    def getRecords(params: GetRecordsInput): Request[GetRecordsOutput] = js.native
    def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput] = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput] = js.native
  }

  /**
   * Represents the data for an attribute. You can set one, and only one, of the elements.
   *  Each attribute in an item is a name-value pair. An attribute can be single-valued or multi-valued set. For example, a book item can have title and authors attributes. Each book has one title but can have many authors. The multi-valued attribute is a set; duplicate values are not allowed.
   */
  @js.native
  trait AttributeValue extends js.Object {
    var B: js.UndefOr[BinaryAttributeValue]
    var BOOL: js.UndefOr[BooleanAttributeValue]
    var BS: js.UndefOr[BinarySetAttributeValue]
    var L: js.UndefOr[ListAttributeValue]
    var M: js.UndefOr[MapAttributeValue]
    var N: js.UndefOr[NumberAttributeValue]
    var NS: js.UndefOr[NumberSetAttributeValue]
    var NULL: js.UndefOr[NullAttributeValue]
    var S: js.UndefOr[StringAttributeValue]
    var SS: js.UndefOr[StringSetAttributeValue]
  }

  object AttributeValue {
    def apply(
      B: js.UndefOr[BinaryAttributeValue] = js.undefined,
      BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined,
      BS: js.UndefOr[BinarySetAttributeValue] = js.undefined,
      L: js.UndefOr[ListAttributeValue] = js.undefined,
      M: js.UndefOr[MapAttributeValue] = js.undefined,
      N: js.UndefOr[NumberAttributeValue] = js.undefined,
      NS: js.UndefOr[NumberSetAttributeValue] = js.undefined,
      NULL: js.UndefOr[NullAttributeValue] = js.undefined,
      S: js.UndefOr[StringAttributeValue] = js.undefined,
      SS: js.UndefOr[StringSetAttributeValue] = js.undefined): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "B" -> B.map { x => x.asInstanceOf[js.Any] },
        "BOOL" -> BOOL.map { x => x.asInstanceOf[js.Any] },
        "BS" -> BS.map { x => x.asInstanceOf[js.Any] },
        "L" -> L.map { x => x.asInstanceOf[js.Any] },
        "M" -> M.map { x => x.asInstanceOf[js.Any] },
        "N" -> N.map { x => x.asInstanceOf[js.Any] },
        "NS" -> NS.map { x => x.asInstanceOf[js.Any] },
        "NULL" -> NULL.map { x => x.asInstanceOf[js.Any] },
        "S" -> S.map { x => x.asInstanceOf[js.Any] },
        "SS" -> SS.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
  }

  /**
   * Represents the input of a <code>DescribeStream</code> operation.
   */
  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamArn: StreamArn
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var Limit: js.UndefOr[PositiveIntegerObject]
  }

  object DescribeStreamInput {
    def apply(
      StreamArn: StreamArn,
      ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
      Limit: js.UndefOr[PositiveIntegerObject] = js.undefined): DescribeStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamArn" -> StreamArn.asInstanceOf[js.Any],
        "ExclusiveStartShardId" -> ExclusiveStartShardId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamInput]
    }
  }

  /**
   * Represents the output of a <code>DescribeStream</code> operation.
   */
  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: js.UndefOr[StreamDescription]
  }

  object DescribeStreamOutput {
    def apply(
      StreamDescription: js.UndefOr[StreamDescription] = js.undefined): DescribeStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamDescription" -> StreamDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamOutput]
    }
  }

  /**
   * The shard iterator has expired and can no longer be used to retrieve stream records. A shard iterator expires 15 minutes after it is retrieved using the <code>GetShardIterator</code> action.
   */
  @js.native
  trait ExpiredIteratorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Represents the input of a <code>GetRecords</code> operation.
   */
  @js.native
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: js.UndefOr[PositiveIntegerObject]
  }

  object GetRecordsInput {
    def apply(
      ShardIterator: ShardIterator,
      Limit: js.UndefOr[PositiveIntegerObject] = js.undefined): GetRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardIterator" -> ShardIterator.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsInput]
    }
  }

  /**
   * Represents the output of a <code>GetRecords</code> operation.
   */
  @js.native
  trait GetRecordsOutput extends js.Object {
    var NextShardIterator: js.UndefOr[ShardIterator]
    var Records: js.UndefOr[RecordList]
  }

  object GetRecordsOutput {
    def apply(
      NextShardIterator: js.UndefOr[ShardIterator] = js.undefined,
      Records: js.UndefOr[RecordList] = js.undefined): GetRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextShardIterator" -> NextShardIterator.map { x => x.asInstanceOf[js.Any] },
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsOutput]
    }
  }

  /**
   * Represents the input of a <code>GetShardIterator</code> operation.
   */
  @js.native
  trait GetShardIteratorInput extends js.Object {
    var ShardId: ShardId
    var ShardIteratorType: ShardIteratorType
    var StreamArn: StreamArn
    var SequenceNumber: js.UndefOr[SequenceNumber]
  }

  object GetShardIteratorInput {
    def apply(
      ShardId: ShardId,
      ShardIteratorType: ShardIteratorType,
      StreamArn: StreamArn,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined): GetShardIteratorInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardId" -> ShardId.asInstanceOf[js.Any],
        "ShardIteratorType" -> ShardIteratorType.asInstanceOf[js.Any],
        "StreamArn" -> StreamArn.asInstanceOf[js.Any],
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorInput]
    }
  }

  /**
   * Represents the output of a <code>GetShardIterator</code> operation.
   */
  @js.native
  trait GetShardIteratorOutput extends js.Object {
    var ShardIterator: js.UndefOr[ShardIterator]
  }

  object GetShardIteratorOutput {
    def apply(
      ShardIterator: js.UndefOr[ShardIterator] = js.undefined): GetShardIteratorOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardIterator" -> ShardIterator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorOutput]
    }
  }

  /**
   * Contains details about the type of identity that made the request.
   */
  @js.native
  trait Identity extends js.Object {
    var PrincipalId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object Identity {
    def apply(
      PrincipalId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): Identity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalId" -> PrincipalId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Identity]
    }
  }

  /**
   * An error occurred on the server side.
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.
   *  A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary key (partition key) would be represented by one <code>KeySchemaElement</code>. A composite primary key (partition key and sort key) would require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the sort key.
   *
   * '''Note:'''The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
   *  The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
   */
  @js.native
  trait KeySchemaElement extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var KeyType: KeyType
  }

  object KeySchemaElement {
    def apply(
      AttributeName: KeySchemaAttributeName,
      KeyType: KeyType): KeySchemaElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "KeyType" -> KeyType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeySchemaElement]
    }
  }

  object KeyTypeEnum {
    val HASH = "HASH"
    val RANGE = "RANGE"

    val values = IndexedSeq(HASH, RANGE)
  }

  /**
   * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries|Error Retries and Exponential Backoff]] in the <i>Amazon DynamoDB Developer Guide</i>.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Represents the input of a <code>ListStreams</code> operation.
   */
  @js.native
  trait ListStreamsInput extends js.Object {
    var ExclusiveStartStreamArn: js.UndefOr[StreamArn]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var TableName: js.UndefOr[TableName]
  }

  object ListStreamsInput {
    def apply(
      ExclusiveStartStreamArn: js.UndefOr[StreamArn] = js.undefined,
      Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): ListStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartStreamArn" -> ExclusiveStartStreamArn.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsInput]
    }
  }

  /**
   * Represents the output of a <code>ListStreams</code> operation.
   */
  @js.native
  trait ListStreamsOutput extends js.Object {
    var LastEvaluatedStreamArn: js.UndefOr[StreamArn]
    var Streams: js.UndefOr[StreamList]
  }

  object ListStreamsOutput {
    def apply(
      LastEvaluatedStreamArn: js.UndefOr[StreamArn] = js.undefined,
      Streams: js.UndefOr[StreamList] = js.undefined): ListStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastEvaluatedStreamArn" -> LastEvaluatedStreamArn.map { x => x.asInstanceOf[js.Any] },
        "Streams" -> Streams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsOutput]
    }
  }

  object OperationTypeEnum {
    val INSERT = "INSERT"
    val MODIFY = "MODIFY"
    val REMOVE = "REMOVE"

    val values = IndexedSeq(INSERT, MODIFY, REMOVE)
  }

  /**
   * A description of a unique event within a stream.
   */
  @js.native
  trait Record extends js.Object {
    var awsRegion: js.UndefOr[String]
    var dynamodb: js.UndefOr[StreamRecord]
    var eventID: js.UndefOr[String]
    var eventName: js.UndefOr[OperationType]
    var eventSource: js.UndefOr[String]
    var eventVersion: js.UndefOr[String]
    var userIdentity: js.UndefOr[Identity]
  }

  object Record {
    def apply(
      awsRegion: js.UndefOr[String] = js.undefined,
      dynamodb: js.UndefOr[StreamRecord] = js.undefined,
      eventID: js.UndefOr[String] = js.undefined,
      eventName: js.UndefOr[OperationType] = js.undefined,
      eventSource: js.UndefOr[String] = js.undefined,
      eventVersion: js.UndefOr[String] = js.undefined,
      userIdentity: js.UndefOr[Identity] = js.undefined): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "dynamodb" -> dynamodb.map { x => x.asInstanceOf[js.Any] },
        "eventID" -> eventID.map { x => x.asInstanceOf[js.Any] },
        "eventName" -> eventName.map { x => x.asInstanceOf[js.Any] },
        "eventSource" -> eventSource.map { x => x.asInstanceOf[js.Any] },
        "eventVersion" -> eventVersion.map { x => x.asInstanceOf[js.Any] },
        "userIdentity" -> userIdentity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  /**
   * The operation tried to access a nonexistent stream.
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The beginning and ending sequence numbers for the stream records contained within a shard.
   */
  @js.native
  trait SequenceNumberRange extends js.Object {
    var EndingSequenceNumber: js.UndefOr[SequenceNumber]
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  object SequenceNumberRange {
    def apply(
      EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined): SequenceNumberRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndingSequenceNumber" -> EndingSequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "StartingSequenceNumber" -> StartingSequenceNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SequenceNumberRange]
    }
  }

  /**
   * A uniquely identified group of stream records within a stream.
   */
  @js.native
  trait Shard extends js.Object {
    var ParentShardId: js.UndefOr[ShardId]
    var SequenceNumberRange: js.UndefOr[SequenceNumberRange]
    var ShardId: js.UndefOr[ShardId]
  }

  object Shard {
    def apply(
      ParentShardId: js.UndefOr[ShardId] = js.undefined,
      SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined): Shard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentShardId" -> ParentShardId.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumberRange" -> SequenceNumberRange.map { x => x.asInstanceOf[js.Any] },
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Shard]
    }
  }

  object ShardIteratorTypeEnum {
    val TRIM_HORIZON = "TRIM_HORIZON"
    val LATEST = "LATEST"
    val AT_SEQUENCE_NUMBER = "AT_SEQUENCE_NUMBER"
    val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER"

    val values = IndexedSeq(TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER)
  }

  /**
   * Represents all of the data describing a particular stream.
   */
  @js.native
  trait Stream extends js.Object {
    var StreamArn: js.UndefOr[StreamArn]
    var StreamLabel: js.UndefOr[String]
    var TableName: js.UndefOr[TableName]
  }

  object Stream {
    def apply(
      StreamArn: js.UndefOr[StreamArn] = js.undefined,
      StreamLabel: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): Stream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamArn" -> StreamArn.map { x => x.asInstanceOf[js.Any] },
        "StreamLabel" -> StreamLabel.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stream]
    }
  }

  /**
   * Represents all of the data describing a particular stream.
   */
  @js.native
  trait StreamDescription extends js.Object {
    var CreationRequestDateTime: js.UndefOr[Date]
    var KeySchema: js.UndefOr[KeySchema]
    var LastEvaluatedShardId: js.UndefOr[ShardId]
    var Shards: js.UndefOr[ShardDescriptionList]
    var StreamArn: js.UndefOr[StreamArn]
    var StreamLabel: js.UndefOr[String]
    var StreamStatus: js.UndefOr[StreamStatus]
    var StreamViewType: js.UndefOr[StreamViewType]
    var TableName: js.UndefOr[TableName]
  }

  object StreamDescription {
    def apply(
      CreationRequestDateTime: js.UndefOr[Date] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      LastEvaluatedShardId: js.UndefOr[ShardId] = js.undefined,
      Shards: js.UndefOr[ShardDescriptionList] = js.undefined,
      StreamArn: js.UndefOr[StreamArn] = js.undefined,
      StreamLabel: js.UndefOr[String] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      StreamViewType: js.UndefOr[StreamViewType] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): StreamDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationRequestDateTime" -> CreationRequestDateTime.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "LastEvaluatedShardId" -> LastEvaluatedShardId.map { x => x.asInstanceOf[js.Any] },
        "Shards" -> Shards.map { x => x.asInstanceOf[js.Any] },
        "StreamArn" -> StreamArn.map { x => x.asInstanceOf[js.Any] },
        "StreamLabel" -> StreamLabel.map { x => x.asInstanceOf[js.Any] },
        "StreamStatus" -> StreamStatus.map { x => x.asInstanceOf[js.Any] },
        "StreamViewType" -> StreamViewType.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamDescription]
    }
  }

  /**
   * A description of a single data modification that was performed on an item in a DynamoDB table.
   */
  @js.native
  trait StreamRecord extends js.Object {
    var ApproximateCreationDateTime: js.UndefOr[Date]
    var Keys: js.UndefOr[AttributeMap]
    var NewImage: js.UndefOr[AttributeMap]
    var OldImage: js.UndefOr[AttributeMap]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var SizeBytes: js.UndefOr[PositiveLongObject]
    var StreamViewType: js.UndefOr[StreamViewType]
  }

  object StreamRecord {
    def apply(
      ApproximateCreationDateTime: js.UndefOr[Date] = js.undefined,
      Keys: js.UndefOr[AttributeMap] = js.undefined,
      NewImage: js.UndefOr[AttributeMap] = js.undefined,
      OldImage: js.UndefOr[AttributeMap] = js.undefined,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      SizeBytes: js.UndefOr[PositiveLongObject] = js.undefined,
      StreamViewType: js.UndefOr[StreamViewType] = js.undefined): StreamRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApproximateCreationDateTime" -> ApproximateCreationDateTime.map { x => x.asInstanceOf[js.Any] },
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] },
        "NewImage" -> NewImage.map { x => x.asInstanceOf[js.Any] },
        "OldImage" -> OldImage.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "SizeBytes" -> SizeBytes.map { x => x.asInstanceOf[js.Any] },
        "StreamViewType" -> StreamViewType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamRecord]
    }
  }

  object StreamStatusEnum {
    val ENABLING = "ENABLING"
    val ENABLED = "ENABLED"
    val DISABLING = "DISABLING"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLING, ENABLED, DISABLING, DISABLED)
  }

  object StreamViewTypeEnum {
    val NEW_IMAGE = "NEW_IMAGE"
    val OLD_IMAGE = "OLD_IMAGE"
    val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES"
    val KEYS_ONLY = "KEYS_ONLY"

    val values = IndexedSeq(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
  }

  /**
   * The operation attempted to read past the oldest stream record in a shard.
   *  In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException if:
   * * You request a shard iterator with a sequence number older than the trim point (24 hours).
   *  * You obtain a shard iterator, but before you use the iterator in a <code>GetRecords</code> request, a stream record in the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access a record that no longer exists.
   */
  @js.native
  trait TrimmedDataAccessExceptionException extends js.Object {
    val message: ErrorMessage
  }
}
