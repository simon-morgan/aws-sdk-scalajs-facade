package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mediaconnect {
  type Algorithm = String
  type KeyType = String
  type MaxResults = Int
  type Protocol = String
  type SourceType = String
  type Status = String
  type __integer = Int
  type __listOfAddOutputRequest = js.Array[AddOutputRequest]
  type __listOfEntitlement = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfListedEntitlement = js.Array[ListedEntitlement]
  type __listOfListedFlow = js.Array[ListedFlow]
  type __listOfOutput = js.Array[Output]
  type __listOf__string = js.Array[__string]
  type __string = String
}

package mediaconnect {
  @js.native
  @JSImport("aws-sdk", "MediaConnect")
  class MediaConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def addFlowOutputs(params: AddFlowOutputsRequest): Request[AddFlowOutputsResponse] = js.native
    def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse] = js.native
    def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse] = js.native
    def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse] = js.native
    def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): Request[GrantFlowEntitlementsResponse] = js.native
    def listEntitlements(params: ListEntitlementsRequest): Request[ListEntitlementsResponse] = js.native
    def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse] = js.native
    def removeFlowOutput(params: RemoveFlowOutputRequest): Request[RemoveFlowOutputResponse] = js.native
    def revokeFlowEntitlement(params: RevokeFlowEntitlementRequest): Request[RevokeFlowEntitlementResponse] = js.native
    def startFlow(params: StartFlowRequest): Request[StartFlowResponse] = js.native
    def stopFlow(params: StopFlowRequest): Request[StopFlowResponse] = js.native
    def updateFlowEntitlement(params: UpdateFlowEntitlementRequest): Request[UpdateFlowEntitlementResponse] = js.native
    def updateFlowOutput(params: UpdateFlowOutputRequest): Request[UpdateFlowOutputResponse] = js.native
    def updateFlowSource(params: UpdateFlowSourceRequest): Request[UpdateFlowSourceResponse] = js.native
  }

  /**
   * A request to add outputs to the specified flow.
   */
  @js.native
  trait AddFlowOutputsRequest extends js.Object {
    var FlowArn: __string
    var Outputs: __listOfAddOutputRequest
  }

  object AddFlowOutputsRequest {
    def apply(
      FlowArn: __string,
      Outputs: __listOfAddOutputRequest): AddFlowOutputsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddFlowOutputsRequest]
    }
  }

  @js.native
  trait AddFlowOutputsResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  object AddFlowOutputsResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      Outputs: js.UndefOr[__listOfOutput] = js.undefined): AddFlowOutputsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddFlowOutputsResponse]
    }
  }

  /**
   * The output that you want to add to this flow.
   */
  @js.native
  trait AddOutputRequest extends js.Object {
    var Destination: __string
    var Port: __integer
    var Protocol: Protocol
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var MaxLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  object AddOutputRequest {
    def apply(
      Destination: __string,
      Port: __integer,
      Protocol: Protocol,
      Description: js.UndefOr[__string] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      MaxLatency: js.UndefOr[__integer] = js.undefined,
      Name: js.UndefOr[__string] = js.undefined,
      SmoothingLatency: js.UndefOr[__integer] = js.undefined,
      StreamId: js.UndefOr[__string] = js.undefined): AddOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "MaxLatency" -> MaxLatency.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SmoothingLatency" -> SmoothingLatency.map { x => x.asInstanceOf[js.Any] },
        "StreamId" -> StreamId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddOutputRequest]
    }
  }

  object AlgorithmEnum {
    val aes128 = "aes128"
    val aes192 = "aes192"
    val aes256 = "aes256"

    val values = IndexedSeq(aes128, aes192, aes256)
  }

  /**
   * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
   */
  @js.native
  trait CreateFlowRequest extends js.Object {
    var Name: __string
    var Source: SetSourceRequest
    var AvailabilityZone: js.UndefOr[__string]
    var Entitlements: js.UndefOr[__listOfGrantEntitlementRequest]
    var Outputs: js.UndefOr[__listOfAddOutputRequest]
  }

  object CreateFlowRequest {
    def apply(
      Name: __string,
      Source: SetSourceRequest,
      AvailabilityZone: js.UndefOr[__string] = js.undefined,
      Entitlements: js.UndefOr[__listOfGrantEntitlementRequest] = js.undefined,
      Outputs: js.UndefOr[__listOfAddOutputRequest] = js.undefined): CreateFlowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Entitlements" -> Entitlements.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFlowRequest]
    }
  }

  @js.native
  trait CreateFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
  }

  object CreateFlowResponse {
    def apply(
      Flow: js.UndefOr[Flow] = js.undefined): CreateFlowResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Flow" -> Flow.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFlowResponse]
    }
  }

  @js.native
  trait DeleteFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object DeleteFlowRequest {
    def apply(
      FlowArn: __string): DeleteFlowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFlowRequest]
    }
  }

  @js.native
  trait DeleteFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object DeleteFlowResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): DeleteFlowResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFlowResponse]
    }
  }

  @js.native
  trait DescribeFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object DescribeFlowRequest {
    def apply(
      FlowArn: __string): DescribeFlowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFlowRequest]
    }
  }

  @js.native
  trait DescribeFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
    var Messages: js.UndefOr[Messages]
  }

  object DescribeFlowResponse {
    def apply(
      Flow: js.UndefOr[Flow] = js.undefined,
      Messages: js.UndefOr[Messages] = js.undefined): DescribeFlowResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Flow" -> Flow.map { x => x.asInstanceOf[js.Any] },
        "Messages" -> Messages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFlowResponse]
    }
  }

  /**
   * Information about the encryption of the flow.
   */
  @js.native
  trait Encryption extends js.Object {
    var Algorithm: Algorithm
    var RoleArn: __string
    var SecretArn: __string
    var KeyType: js.UndefOr[KeyType]
  }

  object Encryption {
    def apply(
      Algorithm: Algorithm,
      RoleArn: __string,
      SecretArn: __string,
      KeyType: js.UndefOr[KeyType] = js.undefined): Encryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Algorithm" -> Algorithm.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "KeyType" -> KeyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Encryption]
    }
  }

  /**
   * The settings for a flow entitlement.
   */
  @js.native
  trait Entitlement extends js.Object {
    var EntitlementArn: __string
    var Name: __string
    var Subscribers: __listOf__string
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
  }

  object Entitlement {
    def apply(
      EntitlementArn: __string,
      Name: __string,
      Subscribers: __listOf__string,
      Description: js.UndefOr[__string] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined): Entitlement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Entitlement]
    }
  }

  /**
   * The settings for a flow, including its source, outputs, and entitlements.
   */
  @js.native
  trait Flow extends js.Object {
    var AvailabilityZone: __string
    var Entitlements: __listOfEntitlement
    var FlowArn: __string
    var Name: __string
    var Outputs: __listOfOutput
    var Source: Source
    var Status: Status
    var Description: js.UndefOr[__string]
    var EgressIp: js.UndefOr[__string]
  }

  object Flow {
    def apply(
      AvailabilityZone: __string,
      Entitlements: __listOfEntitlement,
      FlowArn: __string,
      Name: __string,
      Outputs: __listOfOutput,
      Source: Source,
      Status: Status,
      Description: js.UndefOr[__string] = js.undefined,
      EgressIp: js.UndefOr[__string] = js.undefined): Flow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EgressIp" -> EgressIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Flow]
    }
  }

  /**
   * The entitlements that you want to grant on a flow.
   */
  @js.native
  trait GrantEntitlementRequest extends js.Object {
    var Subscribers: __listOf__string
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var Name: js.UndefOr[__string]
  }

  object GrantEntitlementRequest {
    def apply(
      Subscribers: __listOf__string,
      Description: js.UndefOr[__string] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      Name: js.UndefOr[__string] = js.undefined): GrantEntitlementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subscribers" -> Subscribers.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantEntitlementRequest]
    }
  }

  /**
   * A request to grant entitlements on a flow.
   */
  @js.native
  trait GrantFlowEntitlementsRequest extends js.Object {
    var Entitlements: __listOfGrantEntitlementRequest
    var FlowArn: __string
  }

  object GrantFlowEntitlementsRequest {
    def apply(
      Entitlements: __listOfGrantEntitlementRequest,
      FlowArn: __string): GrantFlowEntitlementsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantFlowEntitlementsRequest]
    }
  }

  @js.native
  trait GrantFlowEntitlementsResponse extends js.Object {
    var Entitlements: js.UndefOr[__listOfEntitlement]
    var FlowArn: js.UndefOr[__string]
  }

  object GrantFlowEntitlementsResponse {
    def apply(
      Entitlements: js.UndefOr[__listOfEntitlement] = js.undefined,
      FlowArn: js.UndefOr[__string] = js.undefined): GrantFlowEntitlementsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entitlements" -> Entitlements.map { x => x.asInstanceOf[js.Any] },
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantFlowEntitlementsResponse]
    }
  }

  object KeyTypeEnum {
    val `static-key` = "static-key"

    val values = IndexedSeq(`static-key`)
  }

  @js.native
  trait ListEntitlementsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListEntitlementsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): ListEntitlementsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitlementsRequest]
    }
  }

  @js.native
  trait ListEntitlementsResponse extends js.Object {
    var Entitlements: js.UndefOr[__listOfListedEntitlement]
    var NextToken: js.UndefOr[__string]
  }

  object ListEntitlementsResponse {
    def apply(
      Entitlements: js.UndefOr[__listOfListedEntitlement] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): ListEntitlementsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entitlements" -> Entitlements.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitlementsResponse]
    }
  }

  @js.native
  trait ListFlowsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListFlowsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): ListFlowsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFlowsRequest]
    }
  }

  @js.native
  trait ListFlowsResponse extends js.Object {
    var Flows: js.UndefOr[__listOfListedFlow]
    var NextToken: js.UndefOr[__string]
  }

  object ListFlowsResponse {
    def apply(
      Flows: js.UndefOr[__listOfListedFlow] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): ListFlowsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Flows" -> Flows.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFlowsResponse]
    }
  }

  /**
   * An entitlement that has been granted to you from other AWS accounts.
   */
  @js.native
  trait ListedEntitlement extends js.Object {
    var EntitlementArn: __string
    var EntitlementName: __string
  }

  object ListedEntitlement {
    def apply(
      EntitlementArn: __string,
      EntitlementName: __string): ListedEntitlement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "EntitlementName" -> EntitlementName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListedEntitlement]
    }
  }

  /**
   * Provides a summary of a flow, including its ARN, Availability Zone, and source type.
   */
  @js.native
  trait ListedFlow extends js.Object {
    var AvailabilityZone: __string
    var Description: __string
    var FlowArn: __string
    var Name: __string
    var SourceType: SourceType
    var Status: Status
  }

  object ListedFlow {
    def apply(
      AvailabilityZone: __string,
      Description: __string,
      FlowArn: __string,
      Name: __string,
      SourceType: SourceType,
      Status: Status): ListedFlow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListedFlow]
    }
  }

  /**
   * Messages that provide the state of the flow.
   */
  @js.native
  trait Messages extends js.Object {
    var Errors: __listOf__string
  }

  object Messages {
    def apply(
      Errors: __listOf__string): Messages = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Messages]
    }
  }

  /**
   * The settings for an output.
   */
  @js.native
  trait Output extends js.Object {
    var Name: __string
    var OutputArn: __string
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var EntitlementArn: js.UndefOr[__string]
    var MediaLiveInputArn: js.UndefOr[__string]
    var Port: js.UndefOr[__integer]
    var Transport: js.UndefOr[Transport]
  }

  object Output {
    def apply(
      Name: __string,
      OutputArn: __string,
      Description: js.UndefOr[__string] = js.undefined,
      Destination: js.UndefOr[__string] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      EntitlementArn: js.UndefOr[__string] = js.undefined,
      MediaLiveInputArn: js.UndefOr[__string] = js.undefined,
      Port: js.UndefOr[__integer] = js.undefined,
      Transport: js.UndefOr[Transport] = js.undefined): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "OutputArn" -> OutputArn.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "EntitlementArn" -> EntitlementArn.map { x => x.asInstanceOf[js.Any] },
        "MediaLiveInputArn" -> MediaLiveInputArn.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Transport" -> Transport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  object ProtocolEnum {
    val `zixi-push` = "zixi-push"
    val `rtp-fec` = "rtp-fec"
    val rtp = "rtp"

    val values = IndexedSeq(`zixi-push`, `rtp-fec`, rtp)
  }

  @js.native
  trait RemoveFlowOutputRequest extends js.Object {
    var FlowArn: __string
    var OutputArn: __string
  }

  object RemoveFlowOutputRequest {
    def apply(
      FlowArn: __string,
      OutputArn: __string): RemoveFlowOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "OutputArn" -> OutputArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFlowOutputRequest]
    }
  }

  @js.native
  trait RemoveFlowOutputResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var OutputArn: js.UndefOr[__string]
  }

  object RemoveFlowOutputResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      OutputArn: js.UndefOr[__string] = js.undefined): RemoveFlowOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "OutputArn" -> OutputArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFlowOutputResponse]
    }
  }

  @js.native
  trait RevokeFlowEntitlementRequest extends js.Object {
    var EntitlementArn: __string
    var FlowArn: __string
  }

  object RevokeFlowEntitlementRequest {
    def apply(
      EntitlementArn: __string,
      FlowArn: __string): RevokeFlowEntitlementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeFlowEntitlementRequest]
    }
  }

  @js.native
  trait RevokeFlowEntitlementResponse extends js.Object {
    var EntitlementArn: js.UndefOr[__string]
    var FlowArn: js.UndefOr[__string]
  }

  object RevokeFlowEntitlementResponse {
    def apply(
      EntitlementArn: js.UndefOr[__string] = js.undefined,
      FlowArn: js.UndefOr[__string] = js.undefined): RevokeFlowEntitlementResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitlementArn" -> EntitlementArn.map { x => x.asInstanceOf[js.Any] },
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeFlowEntitlementResponse]
    }
  }

  /**
   * The settings for the source of the flow.
   */
  @js.native
  trait SetSourceRequest extends js.Object {
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Protocol: js.UndefOr[Protocol]
    var StreamId: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  object SetSourceRequest {
    def apply(
      Decryption: js.UndefOr[Encryption] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      EntitlementArn: js.UndefOr[__string] = js.undefined,
      IngestPort: js.UndefOr[__integer] = js.undefined,
      MaxBitrate: js.UndefOr[__integer] = js.undefined,
      MaxLatency: js.UndefOr[__integer] = js.undefined,
      Name: js.UndefOr[__string] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined,
      StreamId: js.UndefOr[__string] = js.undefined,
      WhitelistCidr: js.UndefOr[__string] = js.undefined): SetSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Decryption" -> Decryption.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EntitlementArn" -> EntitlementArn.map { x => x.asInstanceOf[js.Any] },
        "IngestPort" -> IngestPort.map { x => x.asInstanceOf[js.Any] },
        "MaxBitrate" -> MaxBitrate.map { x => x.asInstanceOf[js.Any] },
        "MaxLatency" -> MaxLatency.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "StreamId" -> StreamId.map { x => x.asInstanceOf[js.Any] },
        "WhitelistCidr" -> WhitelistCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSourceRequest]
    }
  }

  /**
   * The settings for the source of the flow.
   */
  @js.native
  trait Source extends js.Object {
    var Name: __string
    var SourceArn: __string
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestIp: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var Transport: js.UndefOr[Transport]
    var WhitelistCidr: js.UndefOr[__string]
  }

  object Source {
    def apply(
      Name: __string,
      SourceArn: __string,
      Decryption: js.UndefOr[Encryption] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      EntitlementArn: js.UndefOr[__string] = js.undefined,
      IngestIp: js.UndefOr[__string] = js.undefined,
      IngestPort: js.UndefOr[__integer] = js.undefined,
      Transport: js.UndefOr[Transport] = js.undefined,
      WhitelistCidr: js.UndefOr[__string] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any],
        "Decryption" -> Decryption.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EntitlementArn" -> EntitlementArn.map { x => x.asInstanceOf[js.Any] },
        "IngestIp" -> IngestIp.map { x => x.asInstanceOf[js.Any] },
        "IngestPort" -> IngestPort.map { x => x.asInstanceOf[js.Any] },
        "Transport" -> Transport.map { x => x.asInstanceOf[js.Any] },
        "WhitelistCidr" -> WhitelistCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
    }
  }

  object SourceTypeEnum {
    val OWNED = "OWNED"
    val ENTITLED = "ENTITLED"

    val values = IndexedSeq(OWNED, ENTITLED)
  }

  @js.native
  trait StartFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object StartFlowRequest {
    def apply(
      FlowArn: __string): StartFlowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFlowRequest]
    }
  }

  @js.native
  trait StartFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object StartFlowResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): StartFlowResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFlowResponse]
    }
  }

  object StatusEnum {
    val STANDBY = "STANDBY"
    val ACTIVE = "ACTIVE"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val STARTING = "STARTING"
    val STOPPING = "STOPPING"
    val ERROR = "ERROR"

    val values = IndexedSeq(STANDBY, ACTIVE, UPDATING, DELETING, STARTING, STOPPING, ERROR)
  }

  @js.native
  trait StopFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object StopFlowRequest {
    def apply(
      FlowArn: __string): StopFlowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFlowRequest]
    }
  }

  @js.native
  trait StopFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object StopFlowResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): StopFlowResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFlowResponse]
    }
  }

  /**
   * Attributes related to the transport stream that are used in a source or output.
   */
  @js.native
  trait Transport extends js.Object {
    var Protocol: Protocol
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  object Transport {
    def apply(
      Protocol: Protocol,
      MaxBitrate: js.UndefOr[__integer] = js.undefined,
      MaxLatency: js.UndefOr[__integer] = js.undefined,
      SmoothingLatency: js.UndefOr[__integer] = js.undefined,
      StreamId: js.UndefOr[__string] = js.undefined): Transport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "MaxBitrate" -> MaxBitrate.map { x => x.asInstanceOf[js.Any] },
        "MaxLatency" -> MaxLatency.map { x => x.asInstanceOf[js.Any] },
        "SmoothingLatency" -> SmoothingLatency.map { x => x.asInstanceOf[js.Any] },
        "StreamId" -> StreamId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Transport]
    }
  }

  /**
   * Information about the encryption of the flow.
   */
  @js.native
  trait UpdateEncryption extends js.Object {
    var Algorithm: js.UndefOr[Algorithm]
    var KeyType: js.UndefOr[KeyType]
    var RoleArn: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
  }

  object UpdateEncryption {
    def apply(
      Algorithm: js.UndefOr[Algorithm] = js.undefined,
      KeyType: js.UndefOr[KeyType] = js.undefined,
      RoleArn: js.UndefOr[__string] = js.undefined,
      SecretArn: js.UndefOr[__string] = js.undefined): UpdateEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Algorithm" -> Algorithm.map { x => x.asInstanceOf[js.Any] },
        "KeyType" -> KeyType.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "SecretArn" -> SecretArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEncryption]
    }
  }

  /**
   * The entitlement fields that you want to update.
   */
  @js.native
  trait UpdateFlowEntitlementRequest extends js.Object {
    var EntitlementArn: __string
    var FlowArn: __string
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[UpdateEncryption]
    var Subscribers: js.UndefOr[__listOf__string]
  }

  object UpdateFlowEntitlementRequest {
    def apply(
      EntitlementArn: __string,
      FlowArn: __string,
      Description: js.UndefOr[__string] = js.undefined,
      Encryption: js.UndefOr[UpdateEncryption] = js.undefined,
      Subscribers: js.UndefOr[__listOf__string] = js.undefined): UpdateFlowEntitlementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "Subscribers" -> Subscribers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFlowEntitlementRequest]
    }
  }

  @js.native
  trait UpdateFlowEntitlementResponse extends js.Object {
    var Entitlement: js.UndefOr[Entitlement]
    var FlowArn: js.UndefOr[__string]
  }

  object UpdateFlowEntitlementResponse {
    def apply(
      Entitlement: js.UndefOr[Entitlement] = js.undefined,
      FlowArn: js.UndefOr[__string] = js.undefined): UpdateFlowEntitlementResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entitlement" -> Entitlement.map { x => x.asInstanceOf[js.Any] },
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFlowEntitlementResponse]
    }
  }

  /**
   * The fields that you want to update in the output.
   */
  @js.native
  trait UpdateFlowOutputRequest extends js.Object {
    var FlowArn: __string
    var OutputArn: __string
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[UpdateEncryption]
    var MaxLatency: js.UndefOr[__integer]
    var Port: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  object UpdateFlowOutputRequest {
    def apply(
      FlowArn: __string,
      OutputArn: __string,
      Description: js.UndefOr[__string] = js.undefined,
      Destination: js.UndefOr[__string] = js.undefined,
      Encryption: js.UndefOr[UpdateEncryption] = js.undefined,
      MaxLatency: js.UndefOr[__integer] = js.undefined,
      Port: js.UndefOr[__integer] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined,
      SmoothingLatency: js.UndefOr[__integer] = js.undefined,
      StreamId: js.UndefOr[__string] = js.undefined): UpdateFlowOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "OutputArn" -> OutputArn.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "MaxLatency" -> MaxLatency.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "SmoothingLatency" -> SmoothingLatency.map { x => x.asInstanceOf[js.Any] },
        "StreamId" -> StreamId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFlowOutputRequest]
    }
  }

  @js.native
  trait UpdateFlowOutputResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Output: js.UndefOr[Output]
  }

  object UpdateFlowOutputResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      Output: js.UndefOr[Output] = js.undefined): UpdateFlowOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFlowOutputResponse]
    }
  }

  /**
   * A request to update the source of a flow.
   */
  @js.native
  trait UpdateFlowSourceRequest extends js.Object {
    var FlowArn: __string
    var SourceArn: __string
    var Decryption: js.UndefOr[UpdateEncryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var StreamId: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  object UpdateFlowSourceRequest {
    def apply(
      FlowArn: __string,
      SourceArn: __string,
      Decryption: js.UndefOr[UpdateEncryption] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      EntitlementArn: js.UndefOr[__string] = js.undefined,
      IngestPort: js.UndefOr[__integer] = js.undefined,
      MaxBitrate: js.UndefOr[__integer] = js.undefined,
      MaxLatency: js.UndefOr[__integer] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined,
      StreamId: js.UndefOr[__string] = js.undefined,
      WhitelistCidr: js.UndefOr[__string] = js.undefined): UpdateFlowSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any],
        "Decryption" -> Decryption.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EntitlementArn" -> EntitlementArn.map { x => x.asInstanceOf[js.Any] },
        "IngestPort" -> IngestPort.map { x => x.asInstanceOf[js.Any] },
        "MaxBitrate" -> MaxBitrate.map { x => x.asInstanceOf[js.Any] },
        "MaxLatency" -> MaxLatency.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "StreamId" -> StreamId.map { x => x.asInstanceOf[js.Any] },
        "WhitelistCidr" -> WhitelistCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFlowSourceRequest]
    }
  }

  @js.native
  trait UpdateFlowSourceResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Source: js.UndefOr[Source]
  }

  object UpdateFlowSourceResponse {
    def apply(
      FlowArn: js.UndefOr[__string] = js.undefined,
      Source: js.UndefOr[Source] = js.undefined): UpdateFlowSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFlowSourceResponse]
    }
  }
}
