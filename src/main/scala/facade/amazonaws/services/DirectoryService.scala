package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object directoryservice {
  type AccessUrl = String
  type AddedDateTime = js.Date
  type AliasName = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Array[Attribute]
  type AvailabilityZone = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CidrIp = String
  type CidrIps = js.Array[CidrIp]
  type CloudOnlyDirectoriesLimitReached = Boolean
  type ComputerName = String
  type ComputerPassword = String
  type ConditionalForwarders = js.Array[ConditionalForwarder]
  type ConnectPassword = String
  type ConnectedDirectoriesLimitReached = Boolean
  type CreateSnapshotBeforeSchemaExtension = Boolean
  type CreatedDateTime = js.Date
  type CustomerId = String
  type CustomerUserName = String
  type DeleteAssociatedConditionalForwarder = Boolean
  type Description = String
  type DesiredNumberOfDomainControllers = Int
  type DirectoryDescriptions = js.Array[DirectoryDescription]
  type DirectoryEdition = String
  type DirectoryId = String
  type DirectoryIds = js.Array[DirectoryId]
  type DirectoryName = String
  type DirectoryShortName = String
  type DirectorySize = String
  type DirectoryStage = String
  type DirectoryType = String
  type DnsIpAddrs = js.Array[IpAddr]
  type DomainControllerId = String
  type DomainControllerIds = js.Array[DomainControllerId]
  type DomainControllerStatus = String
  type DomainControllerStatusReason = String
  type DomainControllers = js.Array[DomainController]
  type EndDateTime = js.Date
  type EventTopics = js.Array[EventTopic]
  type IpAddr = String
  type IpAddrs = js.Array[IpAddr]
  type IpRouteStatusMsg = String
  type IpRouteStatusReason = String
  type IpRoutes = js.Array[IpRoute]
  type IpRoutesInfo = js.Array[IpRouteInfo]
  type LastUpdatedDateTime = js.Date
  type LaunchTime = js.Date
  type LdifContent = String
  type Limit = Int
  type LogGroupName = String
  type LogSubscriptions = js.Array[LogSubscription]
  type ManualSnapshotsLimitReached = Boolean
  type NextToken = String
  type Notes = String
  type OrganizationalUnitDN = String
  type Password = String
  type PortNumber = Int
  type RadiusAuthenticationProtocol = String
  type RadiusDisplayLabel = String
  type RadiusRetries = Int
  type RadiusSharedSecret = String
  type RadiusStatus = String
  type RadiusTimeout = Int
  type RemoteDomainName = String
  type RemoteDomainNames = js.Array[RemoteDomainName]
  type ReplicationScope = String
  type RequestId = String
  type ResourceId = String
  type SID = String
  type SchemaExtensionId = String
  type SchemaExtensionStatus = String
  type SchemaExtensionStatusReason = String
  type SchemaExtensionsInfo = js.Array[SchemaExtensionInfo]
  type SecurityGroupId = String
  type SelectiveAuth = String
  type Server = String
  type Servers = js.Array[Server]
  type ShareMethod = String
  type ShareStatus = String
  type SharedDirectories = js.Array[SharedDirectory]
  type SnapshotId = String
  type SnapshotIds = js.Array[SnapshotId]
  type SnapshotName = String
  type SnapshotStatus = String
  type SnapshotType = String
  type Snapshots = js.Array[Snapshot]
  type SsoEnabled = Boolean
  type StageReason = String
  type StartDateTime = js.Date
  type StartTime = js.Date
  type StateLastUpdatedDateTime = js.Date
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type SubscriptionCreatedDateTime = js.Date
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TargetId = String
  type TargetType = String
  type TopicArn = String
  type TopicName = String
  type TopicNames = js.Array[TopicName]
  type TopicStatus = String
  type TrustDirection = String
  type TrustId = String
  type TrustIds = js.Array[TrustId]
  type TrustPassword = String
  type TrustState = String
  type TrustStateReason = String
  type TrustType = String
  type Trusts = js.Array[Trust]
  type UpdateSecurityGroupForDirectoryControllers = Boolean
  type UseSameUsername = Boolean
  type UserName = String
  type UserPassword = String
  type VpcId = String
}

package directoryservice {
  @js.native
  @JSImport("aws-sdk", "DirectoryService")
  class DirectoryService(config: AWSConfig) extends js.Object {
    def acceptSharedDirectory(params: AcceptSharedDirectoryRequest): Request[AcceptSharedDirectoryResult] = js.native
    def addIpRoutes(params: AddIpRoutesRequest): Request[AddIpRoutesResult] = js.native
    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult] = js.native
    def cancelSchemaExtension(params: CancelSchemaExtensionRequest): Request[CancelSchemaExtensionResult] = js.native
    def connectDirectory(params: ConnectDirectoryRequest): Request[ConnectDirectoryResult] = js.native
    def createAlias(params: CreateAliasRequest): Request[CreateAliasResult] = js.native
    def createComputer(params: CreateComputerRequest): Request[CreateComputerResult] = js.native
    def createConditionalForwarder(params: CreateConditionalForwarderRequest): Request[CreateConditionalForwarderResult] = js.native
    def createDirectory(params: CreateDirectoryRequest): Request[CreateDirectoryResult] = js.native
    def createLogSubscription(params: CreateLogSubscriptionRequest): Request[CreateLogSubscriptionResult] = js.native
    def createMicrosoftAD(params: CreateMicrosoftADRequest): Request[CreateMicrosoftADResult] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResult] = js.native
    def createTrust(params: CreateTrustRequest): Request[CreateTrustResult] = js.native
    def deleteConditionalForwarder(params: DeleteConditionalForwarderRequest): Request[DeleteConditionalForwarderResult] = js.native
    def deleteDirectory(params: DeleteDirectoryRequest): Request[DeleteDirectoryResult] = js.native
    def deleteLogSubscription(params: DeleteLogSubscriptionRequest): Request[DeleteLogSubscriptionResult] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResult] = js.native
    def deleteTrust(params: DeleteTrustRequest): Request[DeleteTrustResult] = js.native
    def deregisterEventTopic(params: DeregisterEventTopicRequest): Request[DeregisterEventTopicResult] = js.native
    def describeConditionalForwarders(params: DescribeConditionalForwardersRequest): Request[DescribeConditionalForwardersResult] = js.native
    def describeDirectories(params: DescribeDirectoriesRequest): Request[DescribeDirectoriesResult] = js.native
    def describeDomainControllers(params: DescribeDomainControllersRequest): Request[DescribeDomainControllersResult] = js.native
    def describeEventTopics(params: DescribeEventTopicsRequest): Request[DescribeEventTopicsResult] = js.native
    def describeSharedDirectories(params: DescribeSharedDirectoriesRequest): Request[DescribeSharedDirectoriesResult] = js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult] = js.native
    def describeTrusts(params: DescribeTrustsRequest): Request[DescribeTrustsResult] = js.native
    def disableRadius(params: DisableRadiusRequest): Request[DisableRadiusResult] = js.native
    def disableSso(params: DisableSsoRequest): Request[DisableSsoResult] = js.native
    def enableRadius(params: EnableRadiusRequest): Request[EnableRadiusResult] = js.native
    def enableSso(params: EnableSsoRequest): Request[EnableSsoResult] = js.native
    def getDirectoryLimits(params: GetDirectoryLimitsRequest): Request[GetDirectoryLimitsResult] = js.native
    def getSnapshotLimits(params: GetSnapshotLimitsRequest): Request[GetSnapshotLimitsResult] = js.native
    def listIpRoutes(params: ListIpRoutesRequest): Request[ListIpRoutesResult] = js.native
    def listLogSubscriptions(params: ListLogSubscriptionsRequest): Request[ListLogSubscriptionsResult] = js.native
    def listSchemaExtensions(params: ListSchemaExtensionsRequest): Request[ListSchemaExtensionsResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def registerEventTopic(params: RegisterEventTopicRequest): Request[RegisterEventTopicResult] = js.native
    def rejectSharedDirectory(params: RejectSharedDirectoryRequest): Request[RejectSharedDirectoryResult] = js.native
    def removeIpRoutes(params: RemoveIpRoutesRequest): Request[RemoveIpRoutesResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult] = js.native
    def resetUserPassword(params: ResetUserPasswordRequest): Request[ResetUserPasswordResult] = js.native
    def restoreFromSnapshot(params: RestoreFromSnapshotRequest): Request[RestoreFromSnapshotResult] = js.native
    def shareDirectory(params: ShareDirectoryRequest): Request[ShareDirectoryResult] = js.native
    def startSchemaExtension(params: StartSchemaExtensionRequest): Request[StartSchemaExtensionResult] = js.native
    def unshareDirectory(params: UnshareDirectoryRequest): Request[UnshareDirectoryResult] = js.native
    def updateConditionalForwarder(params: UpdateConditionalForwarderRequest): Request[UpdateConditionalForwarderResult] = js.native
    def updateNumberOfDomainControllers(params: UpdateNumberOfDomainControllersRequest): Request[UpdateNumberOfDomainControllersResult] = js.native
    def updateRadius(params: UpdateRadiusRequest): Request[UpdateRadiusResult] = js.native
    def updateTrust(params: UpdateTrustRequest): Request[UpdateTrustResult] = js.native
    def verifyTrust(params: VerifyTrustRequest): Request[VerifyTrustResult] = js.native
  }

  @js.native
  trait AcceptSharedDirectoryRequest extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object AcceptSharedDirectoryRequest {
    def apply(
      SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined): AcceptSharedDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectoryId" -> SharedDirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptSharedDirectoryRequest]
    }
  }

  @js.native
  trait AcceptSharedDirectoryResult extends js.Object {
    var SharedDirectory: js.UndefOr[SharedDirectory]
  }

  object AcceptSharedDirectoryResult {
    def apply(
      SharedDirectory: js.UndefOr[SharedDirectory] = js.undefined): AcceptSharedDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectory" -> SharedDirectory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptSharedDirectoryResult]
    }
  }

  @js.native
  trait AddIpRoutesRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var IpRoutes: js.UndefOr[IpRoutes]
    var UpdateSecurityGroupForDirectoryControllers: js.UndefOr[UpdateSecurityGroupForDirectoryControllers]
  }

  object AddIpRoutesRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      IpRoutes: js.UndefOr[IpRoutes] = js.undefined,
      UpdateSecurityGroupForDirectoryControllers: js.UndefOr[UpdateSecurityGroupForDirectoryControllers] = js.undefined): AddIpRoutesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "IpRoutes" -> IpRoutes.map { x => x.asInstanceOf[js.Any] },
        "UpdateSecurityGroupForDirectoryControllers" -> UpdateSecurityGroupForDirectoryControllers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddIpRoutesRequest]
    }
  }

  @js.native
  trait AddIpRoutesResult extends js.Object {

  }

  object AddIpRoutesResult {
    def apply(): AddIpRoutesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddIpRoutesResult]
    }
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
    var Tags: js.UndefOr[Tags]
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResult extends js.Object {

  }

  object AddTagsToResourceResult {
    def apply(): AddTagsToResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceResult]
    }
  }

  /**
   * <p>Represents a named directory attribute.</p>
   */
  @js.native
  trait Attribute extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Value: js.UndefOr[AttributeValue]
  }

  object Attribute {
    def apply(
      Name: js.UndefOr[AttributeName] = js.undefined,
      Value: js.UndefOr[AttributeValue] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  @js.native
  trait CancelSchemaExtensionRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
  }

  object CancelSchemaExtensionRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined): CancelSchemaExtensionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "SchemaExtensionId" -> SchemaExtensionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSchemaExtensionRequest]
    }
  }

  @js.native
  trait CancelSchemaExtensionResult extends js.Object {

  }

  object CancelSchemaExtensionResult {
    def apply(): CancelSchemaExtensionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSchemaExtensionResult]
    }
  }

  /**
   * <p>Contains information about a computer account in a directory.</p>
   */
  @js.native
  trait Computer extends js.Object {
    var ComputerId: js.UndefOr[SID]
    var ComputerName: js.UndefOr[ComputerName]
    var ComputerAttributes: js.UndefOr[Attributes]
  }

  object Computer {
    def apply(
      ComputerId: js.UndefOr[SID] = js.undefined,
      ComputerName: js.UndefOr[ComputerName] = js.undefined,
      ComputerAttributes: js.UndefOr[Attributes] = js.undefined): Computer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComputerId" -> ComputerId.map { x => x.asInstanceOf[js.Any] },
        "ComputerName" -> ComputerName.map { x => x.asInstanceOf[js.Any] },
        "ComputerAttributes" -> ComputerAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Computer]
    }
  }

  /**
   * <p>Points to a remote domain with which you are setting up a trust relationship. Conditional forwarders are required in order to set up a trust relationship with another domain.</p>
   */
  @js.native
  trait ConditionalForwarder extends js.Object {
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var ReplicationScope: js.UndefOr[ReplicationScope]
  }

  object ConditionalForwarder {
    def apply(
      RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
      DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
      ReplicationScope: js.UndefOr[ReplicationScope] = js.undefined): ConditionalForwarder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RemoteDomainName" -> RemoteDomainName.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddrs" -> DnsIpAddrs.map { x => x.asInstanceOf[js.Any] },
        "ReplicationScope" -> ReplicationScope.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConditionalForwarder]
    }
  }

  /**
   * <p>Contains the inputs for the <a>ConnectDirectory</a> operation.</p>
   */
  @js.native
  trait ConnectDirectoryRequest extends js.Object {
    var Name: js.UndefOr[DirectoryName]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Size: js.UndefOr[DirectorySize]
    var Description: js.UndefOr[Description]
    var Password: js.UndefOr[ConnectPassword]
    var ConnectSettings: js.UndefOr[DirectoryConnectSettings]
  }

  object ConnectDirectoryRequest {
    def apply(
      Name: js.UndefOr[DirectoryName] = js.undefined,
      ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
      Size: js.UndefOr[DirectorySize] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Password: js.UndefOr[ConnectPassword] = js.undefined,
      ConnectSettings: js.UndefOr[DirectoryConnectSettings] = js.undefined): ConnectDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ShortName" -> ShortName.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "ConnectSettings" -> ConnectSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectDirectoryRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>ConnectDirectory</a> operation.</p>
   */
  @js.native
  trait ConnectDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object ConnectDirectoryResult {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): ConnectDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectDirectoryResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateAlias</a> operation.</p>
   */
  @js.native
  trait CreateAliasRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Alias: js.UndefOr[AliasName]
  }

  object CreateAliasRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      Alias: js.UndefOr[AliasName] = js.undefined): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>CreateAlias</a> operation.</p>
   */
  @js.native
  trait CreateAliasResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Alias: js.UndefOr[AliasName]
  }

  object CreateAliasResult {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      Alias: js.UndefOr[AliasName] = js.undefined): CreateAliasResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateComputer</a> operation.</p>
   */
  @js.native
  trait CreateComputerRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN]
    var ComputerName: js.UndefOr[ComputerName]
    var Password: js.UndefOr[ComputerPassword]
    var ComputerAttributes: js.UndefOr[Attributes]
  }

  object CreateComputerRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.undefined,
      ComputerName: js.UndefOr[ComputerName] = js.undefined,
      Password: js.UndefOr[ComputerPassword] = js.undefined,
      ComputerAttributes: js.UndefOr[Attributes] = js.undefined): CreateComputerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "OrganizationalUnitDistinguishedName" -> OrganizationalUnitDistinguishedName.map { x => x.asInstanceOf[js.Any] },
        "ComputerName" -> ComputerName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "ComputerAttributes" -> ComputerAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateComputerRequest]
    }
  }

  /**
   * <p>Contains the results for the <a>CreateComputer</a> operation.</p>
   */
  @js.native
  trait CreateComputerResult extends js.Object {
    var Computer: js.UndefOr[Computer]
  }

  object CreateComputerResult {
    def apply(
      Computer: js.UndefOr[Computer] = js.undefined): CreateComputerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Computer" -> Computer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateComputerResult]
    }
  }

  /**
   * <p>Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain.</p>
   */
  @js.native
  trait CreateConditionalForwarderRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
  }

  object CreateConditionalForwarderRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
      DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined): CreateConditionalForwarderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RemoteDomainName" -> RemoteDomainName.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddrs" -> DnsIpAddrs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConditionalForwarderRequest]
    }
  }

  /**
   * <p>The result of a CreateConditinalForwarder request.</p>
   */
  @js.native
  trait CreateConditionalForwarderResult extends js.Object {

  }

  object CreateConditionalForwarderResult {
    def apply(): CreateConditionalForwarderResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConditionalForwarderResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateDirectory</a> operation. </p>
   */
  @js.native
  trait CreateDirectoryRequest extends js.Object {
    var Name: js.UndefOr[DirectoryName]
    var VpcSettings: js.UndefOr[DirectoryVpcSettings]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Size: js.UndefOr[DirectorySize]
    var Description: js.UndefOr[Description]
    var Password: js.UndefOr[Password]
  }

  object CreateDirectoryRequest {
    def apply(
      Name: js.UndefOr[DirectoryName] = js.undefined,
      VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined,
      ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
      Size: js.UndefOr[DirectorySize] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined): CreateDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VpcSettings" -> VpcSettings.map { x => x.asInstanceOf[js.Any] },
        "ShortName" -> ShortName.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>CreateDirectory</a> operation.</p>
   */
  @js.native
  trait CreateDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object CreateDirectoryResult {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): CreateDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryResult]
    }
  }

  @js.native
  trait CreateLogSubscriptionRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var LogGroupName: js.UndefOr[LogGroupName]
  }

  object CreateLogSubscriptionRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      LogGroupName: js.UndefOr[LogGroupName] = js.undefined): CreateLogSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "LogGroupName" -> LogGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogSubscriptionRequest]
    }
  }

  @js.native
  trait CreateLogSubscriptionResult extends js.Object {

  }

  object CreateLogSubscriptionResult {
    def apply(): CreateLogSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogSubscriptionResult]
    }
  }

  /**
   * <p>Creates an AWS Managed Microsoft AD directory.</p>
   */
  @js.native
  trait CreateMicrosoftADRequest extends js.Object {
    var Name: js.UndefOr[DirectoryName]
    var VpcSettings: js.UndefOr[DirectoryVpcSettings]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Description: js.UndefOr[Description]
    var Edition: js.UndefOr[DirectoryEdition]
    var Password: js.UndefOr[Password]
  }

  object CreateMicrosoftADRequest {
    def apply(
      Name: js.UndefOr[DirectoryName] = js.undefined,
      VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined,
      ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Edition: js.UndefOr[DirectoryEdition] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined): CreateMicrosoftADRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VpcSettings" -> VpcSettings.map { x => x.asInstanceOf[js.Any] },
        "ShortName" -> ShortName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Edition" -> Edition.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMicrosoftADRequest]
    }
  }

  /**
   * <p>Result of a CreateMicrosoftAD request.</p>
   */
  @js.native
  trait CreateMicrosoftADResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object CreateMicrosoftADResult {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): CreateMicrosoftADResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMicrosoftADResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateSnapshot</a> operation.</p>
   */
  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Name: js.UndefOr[SnapshotName]
  }

  object CreateSnapshotRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      Name: js.UndefOr[SnapshotName] = js.undefined): CreateSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>CreateSnapshot</a> operation.</p>
   */
  @js.native
  trait CreateSnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object CreateSnapshotResult {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): CreateSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotResult]
    }
  }

  /**
   * <p>AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials.</p> <p>This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain.</p>
   */
  @js.native
  trait CreateTrustRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TrustPassword: js.UndefOr[TrustPassword]
    var TrustType: js.UndefOr[TrustType]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
    var TrustDirection: js.UndefOr[TrustDirection]
    var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs]
  }

  object CreateTrustRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      TrustPassword: js.UndefOr[TrustPassword] = js.undefined,
      TrustType: js.UndefOr[TrustType] = js.undefined,
      RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
      SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined,
      TrustDirection: js.UndefOr[TrustDirection] = js.undefined,
      ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined): CreateTrustRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "TrustPassword" -> TrustPassword.map { x => x.asInstanceOf[js.Any] },
        "TrustType" -> TrustType.map { x => x.asInstanceOf[js.Any] },
        "RemoteDomainName" -> RemoteDomainName.map { x => x.asInstanceOf[js.Any] },
        "SelectiveAuth" -> SelectiveAuth.map { x => x.asInstanceOf[js.Any] },
        "TrustDirection" -> TrustDirection.map { x => x.asInstanceOf[js.Any] },
        "ConditionalForwarderIpAddrs" -> ConditionalForwarderIpAddrs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrustRequest]
    }
  }

  /**
   * <p>The result of a CreateTrust request.</p>
   */
  @js.native
  trait CreateTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object CreateTrustResult {
    def apply(
      TrustId: js.UndefOr[TrustId] = js.undefined): CreateTrustResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrustResult]
    }
  }

  /**
   * <p>Deletes a conditional forwarder.</p>
   */
  @js.native
  trait DeleteConditionalForwarderRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
  }

  object DeleteConditionalForwarderRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined): DeleteConditionalForwarderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RemoteDomainName" -> RemoteDomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConditionalForwarderRequest]
    }
  }

  /**
   * <p>The result of a DeleteConditionalForwarder request.</p>
   */
  @js.native
  trait DeleteConditionalForwarderResult extends js.Object {

  }

  object DeleteConditionalForwarderResult {
    def apply(): DeleteConditionalForwarderResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConditionalForwarderResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DeleteDirectory</a> operation.</p>
   */
  @js.native
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object DeleteDirectoryRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): DeleteDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DeleteDirectory</a> operation.</p>
   */
  @js.native
  trait DeleteDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object DeleteDirectoryResult {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): DeleteDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryResult]
    }
  }

  @js.native
  trait DeleteLogSubscriptionRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object DeleteLogSubscriptionRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): DeleteLogSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteLogSubscriptionResult extends js.Object {

  }

  object DeleteLogSubscriptionResult {
    def apply(): DeleteLogSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogSubscriptionResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DeleteSnapshot</a> operation.</p>
   */
  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object DeleteSnapshotRequest {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): DeleteSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DeleteSnapshot</a> operation.</p>
   */
  @js.native
  trait DeleteSnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object DeleteSnapshotResult {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): DeleteSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotResult]
    }
  }

  /**
   * <p>Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain.</p>
   */
  @js.native
  trait DeleteTrustRequest extends js.Object {
    var TrustId: js.UndefOr[TrustId]
    var DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder]
  }

  object DeleteTrustRequest {
    def apply(
      TrustId: js.UndefOr[TrustId] = js.undefined,
      DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder] = js.undefined): DeleteTrustRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] },
        "DeleteAssociatedConditionalForwarder" -> DeleteAssociatedConditionalForwarder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrustRequest]
    }
  }

  /**
   * <p>The result of a DeleteTrust request.</p>
   */
  @js.native
  trait DeleteTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object DeleteTrustResult {
    def apply(
      TrustId: js.UndefOr[TrustId] = js.undefined): DeleteTrustResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrustResult]
    }
  }

  /**
   * <p>Removes the specified directory as a publisher to the specified SNS topic.</p>
   */
  @js.native
  trait DeregisterEventTopicRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TopicName: js.UndefOr[TopicName]
  }

  object DeregisterEventTopicRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      TopicName: js.UndefOr[TopicName] = js.undefined): DeregisterEventTopicRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "TopicName" -> TopicName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEventTopicRequest]
    }
  }

  /**
   * <p>The result of a DeregisterEventTopic request.</p>
   */
  @js.native
  trait DeregisterEventTopicResult extends js.Object {

  }

  object DeregisterEventTopicResult {
    def apply(): DeregisterEventTopicResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEventTopicResult]
    }
  }

  /**
   * <p>Describes a conditional forwarder.</p>
   */
  @js.native
  trait DescribeConditionalForwardersRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RemoteDomainNames: js.UndefOr[RemoteDomainNames]
  }

  object DescribeConditionalForwardersRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RemoteDomainNames: js.UndefOr[RemoteDomainNames] = js.undefined): DescribeConditionalForwardersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RemoteDomainNames" -> RemoteDomainNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConditionalForwardersRequest]
    }
  }

  /**
   * <p>The result of a DescribeConditionalForwarder request.</p>
   */
  @js.native
  trait DescribeConditionalForwardersResult extends js.Object {
    var ConditionalForwarders: js.UndefOr[ConditionalForwarders]
  }

  object DescribeConditionalForwardersResult {
    def apply(
      ConditionalForwarders: js.UndefOr[ConditionalForwarders] = js.undefined): DescribeConditionalForwardersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConditionalForwarders" -> ConditionalForwarders.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConditionalForwardersResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeDirectories</a> operation.</p>
   */
  @js.native
  trait DescribeDirectoriesRequest extends js.Object {
    var DirectoryIds: js.UndefOr[DirectoryIds]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeDirectoriesRequest {
    def apply(
      DirectoryIds: js.UndefOr[DirectoryIds] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryIds" -> DirectoryIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectoriesRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DescribeDirectories</a> operation.</p>
   */
  @js.native
  trait DescribeDirectoriesResult extends js.Object {
    var DirectoryDescriptions: js.UndefOr[DirectoryDescriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDirectoriesResult {
    def apply(
      DirectoryDescriptions: js.UndefOr[DirectoryDescriptions] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeDirectoriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryDescriptions" -> DirectoryDescriptions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectoriesResult]
    }
  }

  @js.native
  trait DescribeDomainControllersRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var DomainControllerIds: js.UndefOr[DomainControllerIds]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeDomainControllersRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      DomainControllerIds: js.UndefOr[DomainControllerIds] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeDomainControllersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "DomainControllerIds" -> DomainControllerIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDomainControllersRequest]
    }
  }

  @js.native
  trait DescribeDomainControllersResult extends js.Object {
    var DomainControllers: js.UndefOr[DomainControllers]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDomainControllersResult {
    def apply(
      DomainControllers: js.UndefOr[DomainControllers] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeDomainControllersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainControllers" -> DomainControllers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDomainControllersResult]
    }
  }

  /**
   * <p>Describes event topics.</p>
   */
  @js.native
  trait DescribeEventTopicsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TopicNames: js.UndefOr[TopicNames]
  }

  object DescribeEventTopicsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      TopicNames: js.UndefOr[TopicNames] = js.undefined): DescribeEventTopicsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "TopicNames" -> TopicNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventTopicsRequest]
    }
  }

  /**
   * <p>The result of a DescribeEventTopic request.</p>
   */
  @js.native
  trait DescribeEventTopicsResult extends js.Object {
    var EventTopics: js.UndefOr[EventTopics]
  }

  object DescribeEventTopicsResult {
    def apply(
      EventTopics: js.UndefOr[EventTopics] = js.undefined): DescribeEventTopicsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventTopics" -> EventTopics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventTopicsResult]
    }
  }

  @js.native
  trait DescribeSharedDirectoriesRequest extends js.Object {
    var OwnerDirectoryId: js.UndefOr[DirectoryId]
    var SharedDirectoryIds: js.UndefOr[DirectoryIds]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeSharedDirectoriesRequest {
    def apply(
      OwnerDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeSharedDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerDirectoryId" -> OwnerDirectoryId.map { x => x.asInstanceOf[js.Any] },
        "SharedDirectoryIds" -> SharedDirectoryIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSharedDirectoriesRequest]
    }
  }

  @js.native
  trait DescribeSharedDirectoriesResult extends js.Object {
    var SharedDirectories: js.UndefOr[SharedDirectories]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeSharedDirectoriesResult {
    def apply(
      SharedDirectories: js.UndefOr[SharedDirectories] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeSharedDirectoriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectories" -> SharedDirectories.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSharedDirectoriesResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeSnapshots</a> operation.</p>
   */
  @js.native
  trait DescribeSnapshotsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var SnapshotIds: js.UndefOr[SnapshotIds]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeSnapshotsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      SnapshotIds: js.UndefOr[SnapshotIds] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIds" -> SnapshotIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DescribeSnapshots</a> operation.</p>
   */
  @js.native
  trait DescribeSnapshotsResult extends js.Object {
    var Snapshots: js.UndefOr[Snapshots]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeSnapshotsResult {
    def apply(
      Snapshots: js.UndefOr[Snapshots] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshots" -> Snapshots.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsResult]
    }
  }

  /**
   * <p>Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships.</p>
   */
  @js.native
  trait DescribeTrustsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TrustIds: js.UndefOr[TrustIds]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object DescribeTrustsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      TrustIds: js.UndefOr[TrustIds] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DescribeTrustsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "TrustIds" -> TrustIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustsRequest]
    }
  }

  /**
   * <p>The result of a DescribeTrust request.</p>
   */
  @js.native
  trait DescribeTrustsResult extends js.Object {
    var Trusts: js.UndefOr[Trusts]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeTrustsResult {
    def apply(
      Trusts: js.UndefOr[Trusts] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeTrustsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Trusts" -> Trusts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustsResult]
    }
  }

  /**
   * <p>Contains information for the <a>ConnectDirectory</a> operation when an AD Connector directory is being created.</p>
   */
  @js.native
  trait DirectoryConnectSettings extends js.Object {
    var VpcId: js.UndefOr[VpcId]
    var SubnetIds: js.UndefOr[SubnetIds]
    var CustomerDnsIps: js.UndefOr[DnsIpAddrs]
    var CustomerUserName: js.UndefOr[UserName]
  }

  object DirectoryConnectSettings {
    def apply(
      VpcId: js.UndefOr[VpcId] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      CustomerDnsIps: js.UndefOr[DnsIpAddrs] = js.undefined,
      CustomerUserName: js.UndefOr[UserName] = js.undefined): DirectoryConnectSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "CustomerDnsIps" -> CustomerDnsIps.map { x => x.asInstanceOf[js.Any] },
        "CustomerUserName" -> CustomerUserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryConnectSettings]
    }
  }

  /**
   * <p>Contains information about an AD Connector directory.</p>
   */
  @js.native
  trait DirectoryConnectSettingsDescription extends js.Object {
    var ConnectIps: js.UndefOr[IpAddrs]
    var CustomerUserName: js.UndefOr[UserName]
    var SubnetIds: js.UndefOr[SubnetIds]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var VpcId: js.UndefOr[VpcId]
  }

  object DirectoryConnectSettingsDescription {
    def apply(
      ConnectIps: js.UndefOr[IpAddrs] = js.undefined,
      CustomerUserName: js.UndefOr[UserName] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): DirectoryConnectSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectIps" -> ConnectIps.map { x => x.asInstanceOf[js.Any] },
        "CustomerUserName" -> CustomerUserName.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupId" -> SecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryConnectSettingsDescription]
    }
  }

  /**
   * <p>Contains information about an AWS Directory Service directory.</p>
   */
  @js.native
  trait DirectoryDescription extends js.Object {
    var Alias: js.UndefOr[AliasName]
    var DirectoryId: js.UndefOr[DirectoryId]
    var OwnerDirectoryDescription: js.UndefOr[OwnerDirectoryDescription]
    var Name: js.UndefOr[DirectoryName]
    var LaunchTime: js.UndefOr[LaunchTime]
    var RadiusStatus: js.UndefOr[RadiusStatus]
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription]
    var ShareMethod: js.UndefOr[ShareMethod]
    var StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var ShortName: js.UndefOr[DirectoryShortName]
    var ShareNotes: js.UndefOr[Notes]
    var DesiredNumberOfDomainControllers: js.UndefOr[DesiredNumberOfDomainControllers]
    var Size: js.UndefOr[DirectorySize]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var Description: js.UndefOr[Description]
    var ShareStatus: js.UndefOr[ShareStatus]
    var Edition: js.UndefOr[DirectoryEdition]
    var AccessUrl: js.UndefOr[AccessUrl]
    var SsoEnabled: js.UndefOr[SsoEnabled]
    var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription]
    var StageReason: js.UndefOr[StageReason]
    var Stage: js.UndefOr[DirectoryStage]
    var RadiusSettings: js.UndefOr[RadiusSettings]
    var Type: js.UndefOr[DirectoryType]
  }

  object DirectoryDescription {
    def apply(
      Alias: js.UndefOr[AliasName] = js.undefined,
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      OwnerDirectoryDescription: js.UndefOr[OwnerDirectoryDescription] = js.undefined,
      Name: js.UndefOr[DirectoryName] = js.undefined,
      LaunchTime: js.UndefOr[LaunchTime] = js.undefined,
      RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined,
      VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined,
      ShareMethod: js.UndefOr[ShareMethod] = js.undefined,
      StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
      ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
      ShareNotes: js.UndefOr[Notes] = js.undefined,
      DesiredNumberOfDomainControllers: js.UndefOr[DesiredNumberOfDomainControllers] = js.undefined,
      Size: js.UndefOr[DirectorySize] = js.undefined,
      DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
      Edition: js.UndefOr[DirectoryEdition] = js.undefined,
      AccessUrl: js.UndefOr[AccessUrl] = js.undefined,
      SsoEnabled: js.UndefOr[SsoEnabled] = js.undefined,
      ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.undefined,
      StageReason: js.UndefOr[StageReason] = js.undefined,
      Stage: js.UndefOr[DirectoryStage] = js.undefined,
      RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined,
      Type: js.UndefOr[DirectoryType] = js.undefined): DirectoryDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] },
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "OwnerDirectoryDescription" -> OwnerDirectoryDescription.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LaunchTime" -> LaunchTime.map { x => x.asInstanceOf[js.Any] },
        "RadiusStatus" -> RadiusStatus.map { x => x.asInstanceOf[js.Any] },
        "VpcSettings" -> VpcSettings.map { x => x.asInstanceOf[js.Any] },
        "ShareMethod" -> ShareMethod.map { x => x.asInstanceOf[js.Any] },
        "StageLastUpdatedDateTime" -> StageLastUpdatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "ShortName" -> ShortName.map { x => x.asInstanceOf[js.Any] },
        "ShareNotes" -> ShareNotes.map { x => x.asInstanceOf[js.Any] },
        "DesiredNumberOfDomainControllers" -> DesiredNumberOfDomainControllers.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddrs" -> DnsIpAddrs.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ShareStatus" -> ShareStatus.map { x => x.asInstanceOf[js.Any] },
        "Edition" -> Edition.map { x => x.asInstanceOf[js.Any] },
        "AccessUrl" -> AccessUrl.map { x => x.asInstanceOf[js.Any] },
        "SsoEnabled" -> SsoEnabled.map { x => x.asInstanceOf[js.Any] },
        "ConnectSettings" -> ConnectSettings.map { x => x.asInstanceOf[js.Any] },
        "StageReason" -> StageReason.map { x => x.asInstanceOf[js.Any] },
        "Stage" -> Stage.map { x => x.asInstanceOf[js.Any] },
        "RadiusSettings" -> RadiusSettings.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryDescription]
    }
  }

  object DirectoryEditionEnum {
    val Enterprise = "Enterprise"
    val Standard = "Standard"

    val values = IndexedSeq(Enterprise, Standard)
  }

  /**
   * <p>Contains directory limit information for a region.</p>
   */
  @js.native
  trait DirectoryLimits extends js.Object {
    var CloudOnlyDirectoriesLimit: js.UndefOr[Limit]
    var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit]
    var ConnectedDirectoriesLimit: js.UndefOr[Limit]
    var CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached]
    var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit]
    var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached]
    var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit]
    var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit]
    var ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached]
  }

  object DirectoryLimits {
    def apply(
      CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
      CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined,
      ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
      CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
      ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
      CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
      CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined,
      CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
      ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached] = js.undefined): DirectoryLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudOnlyDirectoriesLimit" -> CloudOnlyDirectoriesLimit.map { x => x.asInstanceOf[js.Any] },
        "CloudOnlyMicrosoftADCurrentCount" -> CloudOnlyMicrosoftADCurrentCount.map { x => x.asInstanceOf[js.Any] },
        "ConnectedDirectoriesLimit" -> ConnectedDirectoriesLimit.map { x => x.asInstanceOf[js.Any] },
        "CloudOnlyDirectoriesLimitReached" -> CloudOnlyDirectoriesLimitReached.map { x => x.asInstanceOf[js.Any] },
        "ConnectedDirectoriesCurrentCount" -> ConnectedDirectoriesCurrentCount.map { x => x.asInstanceOf[js.Any] },
        "CloudOnlyMicrosoftADLimitReached" -> CloudOnlyMicrosoftADLimitReached.map { x => x.asInstanceOf[js.Any] },
        "CloudOnlyMicrosoftADLimit" -> CloudOnlyMicrosoftADLimit.map { x => x.asInstanceOf[js.Any] },
        "CloudOnlyDirectoriesCurrentCount" -> CloudOnlyDirectoriesCurrentCount.map { x => x.asInstanceOf[js.Any] },
        "ConnectedDirectoriesLimitReached" -> ConnectedDirectoriesLimitReached.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryLimits]
    }
  }

  object DirectorySizeEnum {
    val Small = "Small"
    val Large = "Large"

    val values = IndexedSeq(Small, Large)
  }

  object DirectoryStageEnum {
    val Requested = "Requested"
    val Creating = "Creating"
    val Created = "Created"
    val Active = "Active"
    val Inoperable = "Inoperable"
    val Impaired = "Impaired"
    val Restoring = "Restoring"
    val RestoreFailed = "RestoreFailed"
    val Deleting = "Deleting"
    val Deleted = "Deleted"
    val Failed = "Failed"

    val values = IndexedSeq(Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed)
  }

  object DirectoryTypeEnum {
    val SimpleAD = "SimpleAD"
    val ADConnector = "ADConnector"
    val MicrosoftAD = "MicrosoftAD"
    val SharedMicrosoftAD = "SharedMicrosoftAD"

    val values = IndexedSeq(SimpleAD, ADConnector, MicrosoftAD, SharedMicrosoftAD)
  }

  /**
   * <p>Contains VPC information for the <a>CreateDirectory</a> or <a>CreateMicrosoftAD</a> operation.</p>
   */
  @js.native
  trait DirectoryVpcSettings extends js.Object {
    var VpcId: js.UndefOr[VpcId]
    var SubnetIds: js.UndefOr[SubnetIds]
  }

  object DirectoryVpcSettings {
    def apply(
      VpcId: js.UndefOr[VpcId] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined): DirectoryVpcSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryVpcSettings]
    }
  }

  /**
   * <p>Contains information about the directory.</p>
   */
  @js.native
  trait DirectoryVpcSettingsDescription extends js.Object {
    var VpcId: js.UndefOr[VpcId]
    var SubnetIds: js.UndefOr[SubnetIds]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object DirectoryVpcSettingsDescription {
    def apply(
      VpcId: js.UndefOr[VpcId] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): DirectoryVpcSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupId" -> SecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectoryVpcSettingsDescription]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DisableRadius</a> operation.</p>
   */
  @js.native
  trait DisableRadiusRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object DisableRadiusRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): DisableRadiusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableRadiusRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DisableRadius</a> operation.</p>
   */
  @js.native
  trait DisableRadiusResult extends js.Object {

  }

  object DisableRadiusResult {
    def apply(): DisableRadiusResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableRadiusResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DisableSso</a> operation.</p>
   */
  @js.native
  trait DisableSsoRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var UserName: js.UndefOr[UserName]
    var Password: js.UndefOr[ConnectPassword]
  }

  object DisableSsoRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      Password: js.UndefOr[ConnectPassword] = js.undefined): DisableSsoRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSsoRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DisableSso</a> operation.</p>
   */
  @js.native
  trait DisableSsoResult extends js.Object {

  }

  object DisableSsoResult {
    def apply(): DisableSsoResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSsoResult]
    }
  }

  /**
   * <p>Contains information about the domain controllers for a specified directory.</p>
   */
  @js.native
  trait DomainController extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var LaunchTime: js.UndefOr[LaunchTime]
    var StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var DomainControllerId: js.UndefOr[DomainControllerId]
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var DnsIpAddr: js.UndefOr[IpAddr]
    var StatusReason: js.UndefOr[DomainControllerStatusReason]
    var Status: js.UndefOr[DomainControllerStatus]
    var VpcId: js.UndefOr[VpcId]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object DomainController {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      LaunchTime: js.UndefOr[LaunchTime] = js.undefined,
      StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
      DomainControllerId: js.UndefOr[DomainControllerId] = js.undefined,
      AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      DnsIpAddr: js.UndefOr[IpAddr] = js.undefined,
      StatusReason: js.UndefOr[DomainControllerStatusReason] = js.undefined,
      Status: js.UndefOr[DomainControllerStatus] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): DomainController = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTime" -> LaunchTime.map { x => x.asInstanceOf[js.Any] },
        "StatusLastUpdatedDateTime" -> StatusLastUpdatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "DomainControllerId" -> DomainControllerId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddr" -> DnsIpAddr.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainController]
    }
  }

  object DomainControllerStatusEnum {
    val Creating = "Creating"
    val Active = "Active"
    val Impaired = "Impaired"
    val Restoring = "Restoring"
    val Deleting = "Deleting"
    val Deleted = "Deleted"
    val Failed = "Failed"

    val values = IndexedSeq(Creating, Active, Impaired, Restoring, Deleting, Deleted, Failed)
  }

  /**
   * <p>Contains the inputs for the <a>EnableRadius</a> operation.</p>
   */
  @js.native
  trait EnableRadiusRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RadiusSettings: js.UndefOr[RadiusSettings]
  }

  object EnableRadiusRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined): EnableRadiusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RadiusSettings" -> RadiusSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableRadiusRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>EnableRadius</a> operation.</p>
   */
  @js.native
  trait EnableRadiusResult extends js.Object {

  }

  object EnableRadiusResult {
    def apply(): EnableRadiusResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableRadiusResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>EnableSso</a> operation.</p>
   */
  @js.native
  trait EnableSsoRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var UserName: js.UndefOr[UserName]
    var Password: js.UndefOr[ConnectPassword]
  }

  object EnableSsoRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      Password: js.UndefOr[ConnectPassword] = js.undefined): EnableSsoRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSsoRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>EnableSso</a> operation.</p>
   */
  @js.native
  trait EnableSsoResult extends js.Object {

  }

  object EnableSsoResult {
    def apply(): EnableSsoResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSsoResult]
    }
  }

  /**
   * <p>Information about SNS topic and AWS Directory Service directory associations.</p>
   */
  @js.native
  trait EventTopic extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var TopicName: js.UndefOr[TopicName]
    var TopicArn: js.UndefOr[TopicArn]
    var Status: js.UndefOr[TopicStatus]
  }

  object EventTopic {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined,
      TopicName: js.UndefOr[TopicName] = js.undefined,
      TopicArn: js.UndefOr[TopicArn] = js.undefined,
      Status: js.UndefOr[TopicStatus] = js.undefined): EventTopic = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CreatedDateTime" -> CreatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "TopicName" -> TopicName.map { x => x.asInstanceOf[js.Any] },
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventTopic]
    }
  }

  /**
   * <p>Contains the inputs for the <a>GetDirectoryLimits</a> operation.</p>
   */
  @js.native
  trait GetDirectoryLimitsRequest extends js.Object {

  }

  object GetDirectoryLimitsRequest {
    def apply(): GetDirectoryLimitsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDirectoryLimitsRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>GetDirectoryLimits</a> operation.</p>
   */
  @js.native
  trait GetDirectoryLimitsResult extends js.Object {
    var DirectoryLimits: js.UndefOr[DirectoryLimits]
  }

  object GetDirectoryLimitsResult {
    def apply(
      DirectoryLimits: js.UndefOr[DirectoryLimits] = js.undefined): GetDirectoryLimitsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryLimits" -> DirectoryLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDirectoryLimitsResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>GetSnapshotLimits</a> operation.</p>
   */
  @js.native
  trait GetSnapshotLimitsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object GetSnapshotLimitsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined): GetSnapshotLimitsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSnapshotLimitsRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>GetSnapshotLimits</a> operation.</p>
   */
  @js.native
  trait GetSnapshotLimitsResult extends js.Object {
    var SnapshotLimits: js.UndefOr[SnapshotLimits]
  }

  object GetSnapshotLimitsResult {
    def apply(
      SnapshotLimits: js.UndefOr[SnapshotLimits] = js.undefined): GetSnapshotLimitsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotLimits" -> SnapshotLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSnapshotLimitsResult]
    }
  }

  /**
   * <p>IP address block. This is often the address block of the DNS server used for your on-premises domain. </p>
   */
  @js.native
  trait IpRoute extends js.Object {
    var CidrIp: js.UndefOr[CidrIp]
    var Description: js.UndefOr[Description]
  }

  object IpRoute {
    def apply(
      CidrIp: js.UndefOr[CidrIp] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined): IpRoute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpRoute]
    }
  }

  /**
   * <p>Information about one or more IP address blocks.</p>
   */
  @js.native
  trait IpRouteInfo extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var CidrIp: js.UndefOr[CidrIp]
    var AddedDateTime: js.UndefOr[AddedDateTime]
    var IpRouteStatusReason: js.UndefOr[IpRouteStatusReason]
    var Description: js.UndefOr[Description]
    var IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg]
  }

  object IpRouteInfo {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CidrIp: js.UndefOr[CidrIp] = js.undefined,
      AddedDateTime: js.UndefOr[AddedDateTime] = js.undefined,
      IpRouteStatusReason: js.UndefOr[IpRouteStatusReason] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg] = js.undefined): IpRouteInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "AddedDateTime" -> AddedDateTime.map { x => x.asInstanceOf[js.Any] },
        "IpRouteStatusReason" -> IpRouteStatusReason.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IpRouteStatusMsg" -> IpRouteStatusMsg.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpRouteInfo]
    }
  }

  object IpRouteStatusMsgEnum {
    val Adding = "Adding"
    val Added = "Added"
    val Removing = "Removing"
    val Removed = "Removed"
    val AddFailed = "AddFailed"
    val RemoveFailed = "RemoveFailed"

    val values = IndexedSeq(Adding, Added, Removing, Removed, AddFailed, RemoveFailed)
  }

  @js.native
  trait ListIpRoutesRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object ListIpRoutesRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): ListIpRoutesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIpRoutesRequest]
    }
  }

  @js.native
  trait ListIpRoutesResult extends js.Object {
    var IpRoutesInfo: js.UndefOr[IpRoutesInfo]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIpRoutesResult {
    def apply(
      IpRoutesInfo: js.UndefOr[IpRoutesInfo] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListIpRoutesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpRoutesInfo" -> IpRoutesInfo.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIpRoutesResult]
    }
  }

  @js.native
  trait ListLogSubscriptionsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object ListLogSubscriptionsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): ListLogSubscriptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLogSubscriptionsRequest]
    }
  }

  @js.native
  trait ListLogSubscriptionsResult extends js.Object {
    var LogSubscriptions: js.UndefOr[LogSubscriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLogSubscriptionsResult {
    def apply(
      LogSubscriptions: js.UndefOr[LogSubscriptions] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLogSubscriptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogSubscriptions" -> LogSubscriptions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLogSubscriptionsResult]
    }
  }

  @js.native
  trait ListSchemaExtensionsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object ListSchemaExtensionsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): ListSchemaExtensionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSchemaExtensionsRequest]
    }
  }

  @js.native
  trait ListSchemaExtensionsResult extends js.Object {
    var SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSchemaExtensionsResult {
    def apply(
      SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSchemaExtensionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaExtensionsInfo" -> SchemaExtensionsInfo.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSchemaExtensionsResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
    var NextToken: js.UndefOr[NextToken]
    var Limit: js.UndefOr[Limit]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var Tags: js.UndefOr[Tags]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceResult {
    def apply(
      Tags: js.UndefOr[Tags] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
   * <p>Represents a log subscription, which tracks real-time data from a chosen log group to a specified destination.</p>
   */
  @js.native
  trait LogSubscription extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var LogGroupName: js.UndefOr[LogGroupName]
    var SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime]
  }

  object LogSubscription {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      LogGroupName: js.UndefOr[LogGroupName] = js.undefined,
      SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime] = js.undefined): LogSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "LogGroupName" -> LogGroupName.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionCreatedDateTime" -> SubscriptionCreatedDateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogSubscription]
    }
  }

  /**
   * <p>Describes the directory owner account details that have been shared to the directory consumer account.</p>
   */
  @js.native
  trait OwnerDirectoryDescription extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RadiusStatus: js.UndefOr[RadiusStatus]
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var AccountId: js.UndefOr[CustomerId]
    var RadiusSettings: js.UndefOr[RadiusSettings]
  }

  object OwnerDirectoryDescription {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined,
      VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined,
      DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
      AccountId: js.UndefOr[CustomerId] = js.undefined,
      RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined): OwnerDirectoryDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RadiusStatus" -> RadiusStatus.map { x => x.asInstanceOf[js.Any] },
        "VpcSettings" -> VpcSettings.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddrs" -> DnsIpAddrs.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "RadiusSettings" -> RadiusSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OwnerDirectoryDescription]
    }
  }

  object RadiusAuthenticationProtocolEnum {
    val PAP = "PAP"
    val CHAP = "CHAP"
    val `MS-CHAPv1` = "MS-CHAPv1"
    val `MS-CHAPv2` = "MS-CHAPv2"

    val values = IndexedSeq(PAP, CHAP, `MS-CHAPv1`, `MS-CHAPv2`)
  }

  /**
   * <p>Contains information about a Remote Authentication Dial In User Service (RADIUS) server.</p>
   */
  @js.native
  trait RadiusSettings extends js.Object {
    var RadiusRetries: js.UndefOr[RadiusRetries]
    var RadiusTimeout: js.UndefOr[RadiusTimeout]
    var DisplayLabel: js.UndefOr[RadiusDisplayLabel]
    var RadiusPort: js.UndefOr[PortNumber]
    var SharedSecret: js.UndefOr[RadiusSharedSecret]
    var UseSameUsername: js.UndefOr[UseSameUsername]
    var RadiusServers: js.UndefOr[Servers]
    var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol]
  }

  object RadiusSettings {
    def apply(
      RadiusRetries: js.UndefOr[RadiusRetries] = js.undefined,
      RadiusTimeout: js.UndefOr[RadiusTimeout] = js.undefined,
      DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.undefined,
      RadiusPort: js.UndefOr[PortNumber] = js.undefined,
      SharedSecret: js.UndefOr[RadiusSharedSecret] = js.undefined,
      UseSameUsername: js.UndefOr[UseSameUsername] = js.undefined,
      RadiusServers: js.UndefOr[Servers] = js.undefined,
      AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.undefined): RadiusSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RadiusRetries" -> RadiusRetries.map { x => x.asInstanceOf[js.Any] },
        "RadiusTimeout" -> RadiusTimeout.map { x => x.asInstanceOf[js.Any] },
        "DisplayLabel" -> DisplayLabel.map { x => x.asInstanceOf[js.Any] },
        "RadiusPort" -> RadiusPort.map { x => x.asInstanceOf[js.Any] },
        "SharedSecret" -> SharedSecret.map { x => x.asInstanceOf[js.Any] },
        "UseSameUsername" -> UseSameUsername.map { x => x.asInstanceOf[js.Any] },
        "RadiusServers" -> RadiusServers.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationProtocol" -> AuthenticationProtocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RadiusSettings]
    }
  }

  object RadiusStatusEnum {
    val Creating = "Creating"
    val Completed = "Completed"
    val Failed = "Failed"

    val values = IndexedSeq(Creating, Completed, Failed)
  }

  /**
   * <p>Registers a new event topic.</p>
   */
  @js.native
  trait RegisterEventTopicRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TopicName: js.UndefOr[TopicName]
  }

  object RegisterEventTopicRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      TopicName: js.UndefOr[TopicName] = js.undefined): RegisterEventTopicRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "TopicName" -> TopicName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEventTopicRequest]
    }
  }

  /**
   * <p>The result of a RegisterEventTopic request.</p>
   */
  @js.native
  trait RegisterEventTopicResult extends js.Object {

  }

  object RegisterEventTopicResult {
    def apply(): RegisterEventTopicResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEventTopicResult]
    }
  }

  @js.native
  trait RejectSharedDirectoryRequest extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object RejectSharedDirectoryRequest {
    def apply(
      SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined): RejectSharedDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectoryId" -> SharedDirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectSharedDirectoryRequest]
    }
  }

  @js.native
  trait RejectSharedDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object RejectSharedDirectoryResult {
    def apply(
      SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined): RejectSharedDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectoryId" -> SharedDirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectSharedDirectoryResult]
    }
  }

  @js.native
  trait RemoveIpRoutesRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var CidrIps: js.UndefOr[CidrIps]
  }

  object RemoveIpRoutesRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CidrIps: js.UndefOr[CidrIps] = js.undefined): RemoveIpRoutesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CidrIps" -> CidrIps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveIpRoutesRequest]
    }
  }

  @js.native
  trait RemoveIpRoutesResult extends js.Object {

  }

  object RemoveIpRoutesResult {
    def apply(): RemoveIpRoutesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveIpRoutesResult]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceId]
    var TagKeys: js.UndefOr[TagKeys]
  }

  object RemoveTagsFromResourceRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceId] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResult extends js.Object {

  }

  object RemoveTagsFromResourceResult {
    def apply(): RemoveTagsFromResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResult]
    }
  }

  object ReplicationScopeEnum {
    val Domain = "Domain"

    val values = IndexedSeq(Domain)
  }

  @js.native
  trait ResetUserPasswordRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var UserName: js.UndefOr[CustomerUserName]
    var NewPassword: js.UndefOr[UserPassword]
  }

  object ResetUserPasswordRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[CustomerUserName] = js.undefined,
      NewPassword: js.UndefOr[UserPassword] = js.undefined): ResetUserPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "NewPassword" -> NewPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetUserPasswordRequest]
    }
  }

  @js.native
  trait ResetUserPasswordResult extends js.Object {

  }

  object ResetUserPasswordResult {
    def apply(): ResetUserPasswordResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetUserPasswordResult]
    }
  }

  /**
   * <p>An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.</p>
   */
  @js.native
  trait RestoreFromSnapshotRequest extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object RestoreFromSnapshotRequest {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): RestoreFromSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromSnapshotRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>RestoreFromSnapshot</a> operation.</p>
   */
  @js.native
  trait RestoreFromSnapshotResult extends js.Object {

  }

  object RestoreFromSnapshotResult {
    def apply(): RestoreFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromSnapshotResult]
    }
  }

  /**
   * <p>Information about a schema extension.</p>
   */
  @js.native
  trait SchemaExtensionInfo extends js.Object {
    var StartDateTime: js.UndefOr[StartDateTime]
    var DirectoryId: js.UndefOr[DirectoryId]
    var EndDateTime: js.UndefOr[EndDateTime]
    var Description: js.UndefOr[Description]
    var SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason]
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
    var SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus]
  }

  object SchemaExtensionInfo {
    def apply(
      StartDateTime: js.UndefOr[StartDateTime] = js.undefined,
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      EndDateTime: js.UndefOr[EndDateTime] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason] = js.undefined,
      SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined,
      SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus] = js.undefined): SchemaExtensionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartDateTime" -> StartDateTime.map { x => x.asInstanceOf[js.Any] },
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "EndDateTime" -> EndDateTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SchemaExtensionStatusReason" -> SchemaExtensionStatusReason.map { x => x.asInstanceOf[js.Any] },
        "SchemaExtensionId" -> SchemaExtensionId.map { x => x.asInstanceOf[js.Any] },
        "SchemaExtensionStatus" -> SchemaExtensionStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaExtensionInfo]
    }
  }

  object SchemaExtensionStatusEnum {
    val Initializing = "Initializing"
    val CreatingSnapshot = "CreatingSnapshot"
    val UpdatingSchema = "UpdatingSchema"
    val Replicating = "Replicating"
    val CancelInProgress = "CancelInProgress"
    val RollbackInProgress = "RollbackInProgress"
    val Cancelled = "Cancelled"
    val Failed = "Failed"
    val Completed = "Completed"

    val values = IndexedSeq(Initializing, CreatingSnapshot, UpdatingSchema, Replicating, CancelInProgress, RollbackInProgress, Cancelled, Failed, Completed)
  }

  object SelectiveAuthEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  @js.native
  trait ShareDirectoryRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var ShareNotes: js.UndefOr[Notes]
    var ShareTarget: js.UndefOr[ShareTarget]
    var ShareMethod: js.UndefOr[ShareMethod]
  }

  object ShareDirectoryRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      ShareNotes: js.UndefOr[Notes] = js.undefined,
      ShareTarget: js.UndefOr[ShareTarget] = js.undefined,
      ShareMethod: js.UndefOr[ShareMethod] = js.undefined): ShareDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "ShareNotes" -> ShareNotes.map { x => x.asInstanceOf[js.Any] },
        "ShareTarget" -> ShareTarget.map { x => x.asInstanceOf[js.Any] },
        "ShareMethod" -> ShareMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShareDirectoryRequest]
    }
  }

  @js.native
  trait ShareDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object ShareDirectoryResult {
    def apply(
      SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined): ShareDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectoryId" -> SharedDirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShareDirectoryResult]
    }
  }

  object ShareMethodEnum {
    val ORGANIZATIONS = "ORGANIZATIONS"
    val HANDSHAKE = "HANDSHAKE"

    val values = IndexedSeq(ORGANIZATIONS, HANDSHAKE)
  }

  object ShareStatusEnum {
    val Shared = "Shared"
    val PendingAcceptance = "PendingAcceptance"
    val Rejected = "Rejected"
    val Rejecting = "Rejecting"
    val RejectFailed = "RejectFailed"
    val Sharing = "Sharing"
    val ShareFailed = "ShareFailed"
    val Deleted = "Deleted"
    val Deleting = "Deleting"

    val values = IndexedSeq(Shared, PendingAcceptance, Rejected, Rejecting, RejectFailed, Sharing, ShareFailed, Deleted, Deleting)
  }

  /**
   * <p>Identifier that contains details about the directory consumer account.</p>
   */
  @js.native
  trait ShareTarget extends js.Object {
    var Id: js.UndefOr[TargetId]
    var Type: js.UndefOr[TargetType]
  }

  object ShareTarget {
    def apply(
      Id: js.UndefOr[TargetId] = js.undefined,
      Type: js.UndefOr[TargetType] = js.undefined): ShareTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShareTarget]
    }
  }

  /**
   * <p>Details about the shared directory in the directory owner account for which the share request in the directory consumer account has been accepted.</p>
   */
  @js.native
  trait SharedDirectory extends js.Object {
    var OwnerAccountId: js.UndefOr[CustomerId]
    var ShareMethod: js.UndefOr[ShareMethod]
    var ShareNotes: js.UndefOr[Notes]
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var ShareStatus: js.UndefOr[ShareStatus]
    var OwnerDirectoryId: js.UndefOr[DirectoryId]
    var SharedAccountId: js.UndefOr[CustomerId]
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object SharedDirectory {
    def apply(
      OwnerAccountId: js.UndefOr[CustomerId] = js.undefined,
      ShareMethod: js.UndefOr[ShareMethod] = js.undefined,
      ShareNotes: js.UndefOr[Notes] = js.undefined,
      CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined,
      LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
      ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
      OwnerDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      SharedAccountId: js.UndefOr[CustomerId] = js.undefined,
      SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined): SharedDirectory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerAccountId" -> OwnerAccountId.map { x => x.asInstanceOf[js.Any] },
        "ShareMethod" -> ShareMethod.map { x => x.asInstanceOf[js.Any] },
        "ShareNotes" -> ShareNotes.map { x => x.asInstanceOf[js.Any] },
        "CreatedDateTime" -> CreatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedDateTime" -> LastUpdatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "ShareStatus" -> ShareStatus.map { x => x.asInstanceOf[js.Any] },
        "OwnerDirectoryId" -> OwnerDirectoryId.map { x => x.asInstanceOf[js.Any] },
        "SharedAccountId" -> SharedAccountId.map { x => x.asInstanceOf[js.Any] },
        "SharedDirectoryId" -> SharedDirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SharedDirectory]
    }
  }

  /**
   * <p>Describes a directory snapshot.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Name: js.UndefOr[SnapshotName]
    var SnapshotId: js.UndefOr[SnapshotId]
    var StartTime: js.UndefOr[StartTime]
    var Status: js.UndefOr[SnapshotStatus]
    var Type: js.UndefOr[SnapshotType]
  }

  object Snapshot {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      Name: js.UndefOr[SnapshotName] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      StartTime: js.UndefOr[StartTime] = js.undefined,
      Status: js.UndefOr[SnapshotStatus] = js.undefined,
      Type: js.UndefOr[SnapshotType] = js.undefined): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  /**
   * <p>Contains manual snapshot limit information for a directory.</p>
   */
  @js.native
  trait SnapshotLimits extends js.Object {
    var ManualSnapshotsLimit: js.UndefOr[Limit]
    var ManualSnapshotsCurrentCount: js.UndefOr[Limit]
    var ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached]
  }

  object SnapshotLimits {
    def apply(
      ManualSnapshotsLimit: js.UndefOr[Limit] = js.undefined,
      ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.undefined,
      ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached] = js.undefined): SnapshotLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManualSnapshotsLimit" -> ManualSnapshotsLimit.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotsCurrentCount" -> ManualSnapshotsCurrentCount.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotsLimitReached" -> ManualSnapshotsLimitReached.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotLimits]
    }
  }

  object SnapshotStatusEnum {
    val Creating = "Creating"
    val Completed = "Completed"
    val Failed = "Failed"

    val values = IndexedSeq(Creating, Completed, Failed)
  }

  object SnapshotTypeEnum {
    val Auto = "Auto"
    val Manual = "Manual"

    val values = IndexedSeq(Auto, Manual)
  }

  @js.native
  trait StartSchemaExtensionRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var CreateSnapshotBeforeSchemaExtension: js.UndefOr[CreateSnapshotBeforeSchemaExtension]
    var LdifContent: js.UndefOr[LdifContent]
    var Description: js.UndefOr[Description]
  }

  object StartSchemaExtensionRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CreateSnapshotBeforeSchemaExtension: js.UndefOr[CreateSnapshotBeforeSchemaExtension] = js.undefined,
      LdifContent: js.UndefOr[LdifContent] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined): StartSchemaExtensionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CreateSnapshotBeforeSchemaExtension" -> CreateSnapshotBeforeSchemaExtension.map { x => x.asInstanceOf[js.Any] },
        "LdifContent" -> LdifContent.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSchemaExtensionRequest]
    }
  }

  @js.native
  trait StartSchemaExtensionResult extends js.Object {
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
  }

  object StartSchemaExtensionResult {
    def apply(
      SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined): StartSchemaExtensionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaExtensionId" -> SchemaExtensionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSchemaExtensionResult]
    }
  }

  /**
   * <p>Metadata assigned to a directory consisting of a key-value pair.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  object TargetTypeEnum {
    val ACCOUNT = "ACCOUNT"

    val values = IndexedSeq(ACCOUNT)
  }

  object TopicStatusEnum {
    val Registered = "Registered"
    val `Topic not found` = "Topic not found"
    val Failed = "Failed"
    val Deleted = "Deleted"

    val values = IndexedSeq(Registered, `Topic not found`, Failed, Deleted)
  }

  /**
   * <p>Describes a trust relationship between an AWS Managed Microsoft AD directory and an external domain.</p>
   */
  @js.native
  trait Trust extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TrustId: js.UndefOr[TrustId]
    var TrustType: js.UndefOr[TrustType]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var StateLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime]
    var TrustDirection: js.UndefOr[TrustDirection]
    var TrustStateReason: js.UndefOr[TrustStateReason]
    var TrustState: js.UndefOr[TrustState]
  }

  object Trust {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      TrustId: js.UndefOr[TrustId] = js.undefined,
      TrustType: js.UndefOr[TrustType] = js.undefined,
      RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
      CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined,
      SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined,
      LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
      StateLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime] = js.undefined,
      TrustDirection: js.UndefOr[TrustDirection] = js.undefined,
      TrustStateReason: js.UndefOr[TrustStateReason] = js.undefined,
      TrustState: js.UndefOr[TrustState] = js.undefined): Trust = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] },
        "TrustType" -> TrustType.map { x => x.asInstanceOf[js.Any] },
        "RemoteDomainName" -> RemoteDomainName.map { x => x.asInstanceOf[js.Any] },
        "CreatedDateTime" -> CreatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "SelectiveAuth" -> SelectiveAuth.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedDateTime" -> LastUpdatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "StateLastUpdatedDateTime" -> StateLastUpdatedDateTime.map { x => x.asInstanceOf[js.Any] },
        "TrustDirection" -> TrustDirection.map { x => x.asInstanceOf[js.Any] },
        "TrustStateReason" -> TrustStateReason.map { x => x.asInstanceOf[js.Any] },
        "TrustState" -> TrustState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trust]
    }
  }

  object TrustDirectionEnum {
    val `One-Way: Outgoing` = "One-Way: Outgoing"
    val `One-Way: Incoming` = "One-Way: Incoming"
    val `Two-Way` = "Two-Way"

    val values = IndexedSeq(`One-Way: Outgoing`, `One-Way: Incoming`, `Two-Way`)
  }

  object TrustStateEnum {
    val Creating = "Creating"
    val Created = "Created"
    val Verifying = "Verifying"
    val VerifyFailed = "VerifyFailed"
    val Verified = "Verified"
    val Updating = "Updating"
    val UpdateFailed = "UpdateFailed"
    val Updated = "Updated"
    val Deleting = "Deleting"
    val Deleted = "Deleted"
    val Failed = "Failed"

    val values = IndexedSeq(Creating, Created, Verifying, VerifyFailed, Verified, Updating, UpdateFailed, Updated, Deleting, Deleted, Failed)
  }

  object TrustTypeEnum {
    val Forest = "Forest"
    val External = "External"

    val values = IndexedSeq(Forest, External)
  }

  @js.native
  trait UnshareDirectoryRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var UnshareTarget: js.UndefOr[UnshareTarget]
  }

  object UnshareDirectoryRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UnshareTarget: js.UndefOr[UnshareTarget] = js.undefined): UnshareDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UnshareTarget" -> UnshareTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnshareDirectoryRequest]
    }
  }

  @js.native
  trait UnshareDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object UnshareDirectoryResult {
    def apply(
      SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined): UnshareDirectoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SharedDirectoryId" -> SharedDirectoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnshareDirectoryResult]
    }
  }

  /**
   * <p>Identifier that contains details about the directory consumer account with whom the directory is being unshared.</p>
   */
  @js.native
  trait UnshareTarget extends js.Object {
    var Id: js.UndefOr[TargetId]
    var Type: js.UndefOr[TargetType]
  }

  object UnshareTarget {
    def apply(
      Id: js.UndefOr[TargetId] = js.undefined,
      Type: js.UndefOr[TargetType] = js.undefined): UnshareTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnshareTarget]
    }
  }

  /**
   * <p>Updates a conditional forwarder.</p>
   */
  @js.native
  trait UpdateConditionalForwarderRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
  }

  object UpdateConditionalForwarderRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
      DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined): UpdateConditionalForwarderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RemoteDomainName" -> RemoteDomainName.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddrs" -> DnsIpAddrs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConditionalForwarderRequest]
    }
  }

  /**
   * <p>The result of an UpdateConditionalForwarder request.</p>
   */
  @js.native
  trait UpdateConditionalForwarderResult extends js.Object {

  }

  object UpdateConditionalForwarderResult {
    def apply(): UpdateConditionalForwarderResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConditionalForwarderResult]
    }
  }

  @js.native
  trait UpdateNumberOfDomainControllersRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var DesiredNumber: js.UndefOr[DesiredNumberOfDomainControllers]
  }

  object UpdateNumberOfDomainControllersRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      DesiredNumber: js.UndefOr[DesiredNumberOfDomainControllers] = js.undefined): UpdateNumberOfDomainControllersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "DesiredNumber" -> DesiredNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNumberOfDomainControllersRequest]
    }
  }

  @js.native
  trait UpdateNumberOfDomainControllersResult extends js.Object {

  }

  object UpdateNumberOfDomainControllersResult {
    def apply(): UpdateNumberOfDomainControllersResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNumberOfDomainControllersResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>UpdateRadius</a> operation.</p>
   */
  @js.native
  trait UpdateRadiusRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var RadiusSettings: js.UndefOr[RadiusSettings]
  }

  object UpdateRadiusRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined): UpdateRadiusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "RadiusSettings" -> RadiusSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRadiusRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>UpdateRadius</a> operation.</p>
   */
  @js.native
  trait UpdateRadiusResult extends js.Object {

  }

  object UpdateRadiusResult {
    def apply(): UpdateRadiusResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRadiusResult]
    }
  }

  @js.native
  trait UpdateTrustRequest extends js.Object {
    var TrustId: js.UndefOr[TrustId]
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
  }

  object UpdateTrustRequest {
    def apply(
      TrustId: js.UndefOr[TrustId] = js.undefined,
      SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined): UpdateTrustRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] },
        "SelectiveAuth" -> SelectiveAuth.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrustRequest]
    }
  }

  @js.native
  trait UpdateTrustResult extends js.Object {
    var RequestId: js.UndefOr[RequestId]
    var TrustId: js.UndefOr[TrustId]
  }

  object UpdateTrustResult {
    def apply(
      RequestId: js.UndefOr[RequestId] = js.undefined,
      TrustId: js.UndefOr[TrustId] = js.undefined): UpdateTrustResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestId" -> RequestId.map { x => x.asInstanceOf[js.Any] },
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrustResult]
    }
  }

  /**
   * <p>Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain.</p>
   */
  @js.native
  trait VerifyTrustRequest extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object VerifyTrustRequest {
    def apply(
      TrustId: js.UndefOr[TrustId] = js.undefined): VerifyTrustRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyTrustRequest]
    }
  }

  /**
   * <p>Result of a VerifyTrust request.</p>
   */
  @js.native
  trait VerifyTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object VerifyTrustResult {
    def apply(
      TrustId: js.UndefOr[TrustId] = js.undefined): VerifyTrustResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrustId" -> TrustId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyTrustResult]
    }
  }
}