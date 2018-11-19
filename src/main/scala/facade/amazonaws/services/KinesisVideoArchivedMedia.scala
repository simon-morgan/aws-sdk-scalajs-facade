package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisvideoarchivedmedia {
  type ContentType = String
  type DiscontinuityMode = String
  type ErrorMessage = String
  type Expires = Int
  type FragmentList = js.Array[Fragment]
  type FragmentNumberList = js.Array[FragmentNumberString]
  type FragmentNumberString = String
  type FragmentSelectorType = String
  type HLSFragmentSelectorType = String
  type HLSStreamingSessionURL = String
  type PageLimit = Double
  type Payload = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PlaybackMode = String
  type ResourceARN = String
  type StreamName = String
  type Timestamp = js.Date
}

package kinesisvideoarchivedmedia {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoArchivedMedia")
  class KinesisVideoArchivedMedia(config: AWSConfig) extends js.Object {
    def getHLSStreamingSessionURL(params: GetHLSStreamingSessionURLInput): Request[GetHLSStreamingSessionURLOutput] = js.native
    def getMediaForFragmentList(params: GetMediaForFragmentListInput): Request[GetMediaForFragmentListOutput] = js.native
    def listFragments(params: ListFragmentsInput): Request[ListFragmentsOutput] = js.native
  }

  /**
   * <p>Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later.</p>
   */
  @js.native
  trait ClientLimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object DiscontinuityModeEnum {
    val ALWAYS = "ALWAYS"
    val NEVER = "NEVER"

    val values = IndexedSeq(ALWAYS, NEVER)
  }

  /**
   * <p>Represents a segment of video or other time-delimited data.</p>
   */
  @js.native
  trait Fragment extends js.Object {
    var FragmentNumber: js.UndefOr[String]
    var ServerTimestamp: js.UndefOr[Timestamp]
    var FragmentLengthInMilliseconds: js.UndefOr[Double]
    var FragmentSizeInBytes: js.UndefOr[Double]
    var ProducerTimestamp: js.UndefOr[Timestamp]
  }

  object Fragment {
    def apply(
      FragmentNumber: js.UndefOr[String] = js.undefined,
      ServerTimestamp: js.UndefOr[Timestamp] = js.undefined,
      FragmentLengthInMilliseconds: js.UndefOr[Double] = js.undefined,
      FragmentSizeInBytes: js.UndefOr[Double] = js.undefined,
      ProducerTimestamp: js.UndefOr[Timestamp] = js.undefined): Fragment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FragmentNumber" -> FragmentNumber.map { x => x.asInstanceOf[js.Any] },
        "ServerTimestamp" -> ServerTimestamp.map { x => x.asInstanceOf[js.Any] },
        "FragmentLengthInMilliseconds" -> FragmentLengthInMilliseconds.map { x => x.asInstanceOf[js.Any] },
        "FragmentSizeInBytes" -> FragmentSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "ProducerTimestamp" -> ProducerTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Fragment]
    }
  }

  /**
   * <p>Describes the time stamp range and time stamp origin of a range of fragments.</p>
   */
  @js.native
  trait FragmentSelector extends js.Object {
    var FragmentSelectorType: js.UndefOr[FragmentSelectorType]
    var TimestampRange: js.UndefOr[TimestampRange]
  }

  object FragmentSelector {
    def apply(
      FragmentSelectorType: js.UndefOr[FragmentSelectorType] = js.undefined,
      TimestampRange: js.UndefOr[TimestampRange] = js.undefined): FragmentSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FragmentSelectorType" -> FragmentSelectorType.map { x => x.asInstanceOf[js.Any] },
        "TimestampRange" -> TimestampRange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FragmentSelector]
    }
  }

  object FragmentSelectorTypeEnum {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP"
    val SERVER_TIMESTAMP = "SERVER_TIMESTAMP"

    val values = IndexedSeq(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
  }

  @js.native
  trait GetHLSStreamingSessionURLInput extends js.Object {
    var HLSFragmentSelector: js.UndefOr[HLSFragmentSelector]
    var StreamARN: js.UndefOr[ResourceARN]
    var PlaybackMode: js.UndefOr[PlaybackMode]
    var Expires: js.UndefOr[Expires]
    var MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit]
    var DiscontinuityMode: js.UndefOr[DiscontinuityMode]
    var StreamName: js.UndefOr[StreamName]
  }

  object GetHLSStreamingSessionURLInput {
    def apply(
      HLSFragmentSelector: js.UndefOr[HLSFragmentSelector] = js.undefined,
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      PlaybackMode: js.UndefOr[PlaybackMode] = js.undefined,
      Expires: js.UndefOr[Expires] = js.undefined,
      MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.undefined,
      DiscontinuityMode: js.UndefOr[DiscontinuityMode] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): GetHLSStreamingSessionURLInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HLSFragmentSelector" -> HLSFragmentSelector.map { x => x.asInstanceOf[js.Any] },
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "PlaybackMode" -> PlaybackMode.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] },
        "MaxMediaPlaylistFragmentResults" -> MaxMediaPlaylistFragmentResults.map { x => x.asInstanceOf[js.Any] },
        "DiscontinuityMode" -> DiscontinuityMode.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHLSStreamingSessionURLInput]
    }
  }

  @js.native
  trait GetHLSStreamingSessionURLOutput extends js.Object {
    var HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL]
  }

  object GetHLSStreamingSessionURLOutput {
    def apply(
      HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL] = js.undefined): GetHLSStreamingSessionURLOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HLSStreamingSessionURL" -> HLSStreamingSessionURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHLSStreamingSessionURLOutput]
    }
  }

  @js.native
  trait GetMediaForFragmentListInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var Fragments: js.UndefOr[FragmentNumberList]
  }

  object GetMediaForFragmentListInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Fragments: js.UndefOr[FragmentNumberList] = js.undefined): GetMediaForFragmentListInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "Fragments" -> Fragments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMediaForFragmentListInput]
    }
  }

  @js.native
  trait GetMediaForFragmentListOutput extends js.Object {
    var ContentType: js.UndefOr[ContentType]
    var Payload: js.UndefOr[Payload]
  }

  object GetMediaForFragmentListOutput {
    def apply(
      ContentType: js.UndefOr[ContentType] = js.undefined,
      Payload: js.UndefOr[Payload] = js.undefined): GetMediaForFragmentListOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMediaForFragmentListOutput]
    }
  }

  /**
   * <p>Contains the range of time stamps for the requested media, and the source of the time stamps.</p>
   */
  @js.native
  trait HLSFragmentSelector extends js.Object {
    var FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType]
    var TimestampRange: js.UndefOr[HLSTimestampRange]
  }

  object HLSFragmentSelector {
    def apply(
      FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType] = js.undefined,
      TimestampRange: js.UndefOr[HLSTimestampRange] = js.undefined): HLSFragmentSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FragmentSelectorType" -> FragmentSelectorType.map { x => x.asInstanceOf[js.Any] },
        "TimestampRange" -> TimestampRange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HLSFragmentSelector]
    }
  }

  object HLSFragmentSelectorTypeEnum {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP"
    val SERVER_TIMESTAMP = "SERVER_TIMESTAMP"

    val values = IndexedSeq(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
  }

  /**
   * <p>The start and end of the time stamp range for the requested media.</p> <p>This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.</p> <note> <p>The values in the <code>HLSTimestampRange</code> are inclusive. Fragments that begin before the start time but continue past it, or fragments that begin before the end time but continue past it, are included in the session.</p> </note>
   */
  @js.native
  trait HLSTimestampRange extends js.Object {
    var StartTimestamp: js.UndefOr[Timestamp]
    var EndTimestamp: js.UndefOr[Timestamp]
  }

  object HLSTimestampRange {
    def apply(
      StartTimestamp: js.UndefOr[Timestamp] = js.undefined,
      EndTimestamp: js.UndefOr[Timestamp] = js.undefined): HLSTimestampRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTimestamp" -> StartTimestamp.map { x => x.asInstanceOf[js.Any] },
        "EndTimestamp" -> EndTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HLSTimestampRange]
    }
  }

  /**
   * <p>A specified parameter exceeds its restrictions, is not supported, or can't be used.</p>
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The Codec Private Data in the video stream is not valid for this operation.</p>
   */
  @js.native
  trait InvalidCodecPrivateDataExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait ListFragmentsInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var MaxResults: js.UndefOr[PageLimit]
    var NextToken: js.UndefOr[String]
    var FragmentSelector: js.UndefOr[FragmentSelector]
  }

  object ListFragmentsInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      MaxResults: js.UndefOr[PageLimit] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      FragmentSelector: js.UndefOr[FragmentSelector] = js.undefined): ListFragmentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "FragmentSelector" -> FragmentSelector.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFragmentsInput]
    }
  }

  @js.native
  trait ListFragmentsOutput extends js.Object {
    var Fragments: js.UndefOr[FragmentList]
    var NextToken: js.UndefOr[String]
  }

  object ListFragmentsOutput {
    def apply(
      Fragments: js.UndefOr[FragmentList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListFragmentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fragments" -> Fragments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFragmentsOutput]
    }
  }

  /**
   * <p>No Codec Private Data was found in the video stream.</p>
   */
  @js.native
  trait MissingCodecPrivateDataExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A <code>PlaybackMode</code> of <code>ON_DEMAND</code> was requested for a stream that does not retain data (that is, has a <code>DataRetentionInHours</code> of 0). </p>
   */
  @js.native
  trait NoDataRetentionExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token has expired.</p>
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object PlaybackModeEnum {
    val LIVE = "LIVE"
    val ON_DEMAND = "ON_DEMAND"

    val values = IndexedSeq(LIVE, ON_DEMAND)
  }

  /**
   * <p> <code>GetMedia</code> throws this error when Kinesis Video Streams can't find the stream that you specified.</p> <p> <code>GetHLSStreamingSessionURL</code> throws this error if a session with a <code>PlaybackMode</code> of <code>ON_DEMAND</code> is requested for a stream that has no fragments within the requested time range, or if a session with a <code>PlaybackMode</code> of <code>LIVE</code> is requested for a stream that has no fragments within the last 30 seconds.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The range of time stamps for which to return fragments.</p>
   */
  @js.native
  trait TimestampRange extends js.Object {
    var StartTimestamp: js.UndefOr[Timestamp]
    var EndTimestamp: js.UndefOr[Timestamp]
  }

  object TimestampRange {
    def apply(
      StartTimestamp: js.UndefOr[Timestamp] = js.undefined,
      EndTimestamp: js.UndefOr[Timestamp] = js.undefined): TimestampRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTimestamp" -> StartTimestamp.map { x => x.asInstanceOf[js.Any] },
        "EndTimestamp" -> EndTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimestampRange]
    }
  }

  /**
   * <p>An HLS streaming session was requested for a stream with a media type that is not <code>video/h264</code>.</p>
   */
  @js.native
  trait UnsupportedStreamMediaTypeExceptionException extends js.Object {
    val Message: ErrorMessage
  }
}
