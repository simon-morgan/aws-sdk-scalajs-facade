package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object redshift {
  type AccountsWithRestoreAccessList = js.Array[AccountWithRestoreAccess]
  type AttributeList = js.Array[AccountAttribute]
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValueTarget]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type BatchSnapshotOperationErrorList = js.Array[SnapshotErrorMessage]
  type BatchSnapshotOperationErrors = js.Array[SnapshotErrorMessage]
  type BooleanOptional = Boolean
  type ClusterDbRevisionsList = js.Array[ClusterDbRevision]
  type ClusterIamRoleList = js.Array[ClusterIamRole]
  type ClusterList = js.Array[Cluster]
  type ClusterNodesList = js.Array[ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[ClusterParameterGroupStatus]
  type ClusterParameterStatusList = js.Array[ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[String]
  type ClusterSecurityGroups = js.Array[ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[ClusterSubnetGroup]
  type ClusterVersionList = js.Array[ClusterVersion]
  type DbGroupList = js.Array[String]
  type DeferredMaintenanceWindowsList = js.Array[DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList = js.Array[DeleteClusterSnapshotMessage]
  type DoubleOptional = Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EligibleTracksToUpdateList = js.Array[UpdateTarget]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventInfoMapList = js.Array[EventInfoMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type HsmClientCertificateList = js.Array[HsmClientCertificate]
  type HsmConfigurationList = js.Array[HsmConfiguration]
  type IPRangeList = js.Array[IPRange]
  type IamRoleArnList = js.Array[String]
  type ImportTablesCompleted = js.Array[String]
  type ImportTablesInProgress = js.Array[String]
  type ImportTablesNotStarted = js.Array[String]
  type IntegerOptional = Int
  type LongOptional = Double
  type OrderableClusterOptionsList = js.Array[OrderableClusterOption]
  type ParameterApplyType = String
  type ParameterGroupList = js.Array[ClusterParameterGroup]
  type ParametersList = js.Array[Parameter]
  type PendingActionsList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedNodeList = js.Array[ReservedNode]
  type ReservedNodeOfferingList = js.Array[ReservedNodeOffering]
  type ReservedNodeOfferingType = String
  type RestorableNodeTypeList = js.Array[String]
  type RevisionTargetsList = js.Array[RevisionTarget]
  type ScheduleDefinitionList = js.Array[String]
  type ScheduleState = String
  type ScheduledSnapshotTimeList = js.Array[TStamp]
  type SensitiveString = String
  type SnapshotAttributeToSortBy = String
  type SnapshotCopyGrantList = js.Array[SnapshotCopyGrant]
  type SnapshotIdentifierList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotScheduleList = js.Array[SnapshotSchedule]
  type SnapshotSortingEntityList = js.Array[SnapshotSortingEntity]
  type SortByOrder = String
  type SourceIdsList = js.Array[String]
  type SourceType = String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedOperationList = js.Array[SupportedOperation]
  type SupportedPlatformsList = js.Array[SupportedPlatform]
  type TStamp = js.Date
  type TableRestoreStatusList = js.Array[TableRestoreStatus]
  type TableRestoreStatusType = String
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  type TagValueList = js.Array[String]
  type TaggedResourceList = js.Array[TaggedResource]
  type TrackList = js.Array[MaintenanceTrack]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
}

package redshift {
  @js.native
  @JSImport("aws-sdk", "Redshift")
  class Redshift(config: AWSConfig) extends js.Object {
    def acceptReservedNodeExchange(params: AcceptReservedNodeExchangeInputMessage): Request[AcceptReservedNodeExchangeOutputMessage] = js.native
    def authorizeClusterSecurityGroupIngress(params: AuthorizeClusterSecurityGroupIngressMessage): Request[AuthorizeClusterSecurityGroupIngressResult] = js.native
    def authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage): Request[AuthorizeSnapshotAccessResult] = js.native
    def batchDeleteClusterSnapshots(params: BatchDeleteClusterSnapshotsRequest): Request[BatchDeleteClusterSnapshotsResult] = js.native
    def batchModifyClusterSnapshots(params: BatchModifyClusterSnapshotsMessage): Request[BatchModifyClusterSnapshotsOutputMessage] = js.native
    def cancelResize(params: CancelResizeMessage): Request[ResizeProgressMessage] = js.native
    def copyClusterSnapshot(params: CopyClusterSnapshotMessage): Request[CopyClusterSnapshotResult] = js.native
    def createCluster(params: CreateClusterMessage): Request[CreateClusterResult] = js.native
    def createClusterParameterGroup(params: CreateClusterParameterGroupMessage): Request[CreateClusterParameterGroupResult] = js.native
    def createClusterSecurityGroup(params: CreateClusterSecurityGroupMessage): Request[CreateClusterSecurityGroupResult] = js.native
    def createClusterSnapshot(params: CreateClusterSnapshotMessage): Request[CreateClusterSnapshotResult] = js.native
    def createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage): Request[CreateClusterSubnetGroupResult] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] = js.native
    def createHsmClientCertificate(params: CreateHsmClientCertificateMessage): Request[CreateHsmClientCertificateResult] = js.native
    def createHsmConfiguration(params: CreateHsmConfigurationMessage): Request[CreateHsmConfigurationResult] = js.native
    def createSnapshotCopyGrant(params: CreateSnapshotCopyGrantMessage): Request[CreateSnapshotCopyGrantResult] = js.native
    def createSnapshotSchedule(params: CreateSnapshotScheduleMessage): Request[SnapshotSchedule] = js.native
    def createTags(params: CreateTagsMessage): Request[js.Object] = js.native
    def deleteCluster(params: DeleteClusterMessage): Request[DeleteClusterResult] = js.native
    def deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage): Request[js.Object] = js.native
    def deleteClusterSnapshot(params: DeleteClusterSnapshotMessage): Request[DeleteClusterSnapshotResult] = js.native
    def deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage): Request[js.Object] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[js.Object] = js.native
    def deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage): Request[js.Object] = js.native
    def deleteHsmConfiguration(params: DeleteHsmConfigurationMessage): Request[js.Object] = js.native
    def deleteSnapshotCopyGrant(params: DeleteSnapshotCopyGrantMessage): Request[js.Object] = js.native
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleMessage): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsMessage): Request[js.Object] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributeList] = js.native
    def describeClusterDbRevisions(params: DescribeClusterDbRevisionsMessage): Request[ClusterDbRevisionsMessage] = js.native
    def describeClusterParameterGroups(params: DescribeClusterParameterGroupsMessage): Request[ClusterParameterGroupsMessage] = js.native
    def describeClusterParameters(params: DescribeClusterParametersMessage): Request[ClusterParameterGroupDetails] = js.native
    def describeClusterSecurityGroups(params: DescribeClusterSecurityGroupsMessage): Request[ClusterSecurityGroupMessage] = js.native
    def describeClusterSnapshots(params: DescribeClusterSnapshotsMessage): Request[SnapshotMessage] = js.native
    def describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage): Request[ClusterSubnetGroupMessage] = js.native
    def describeClusterTracks(params: DescribeClusterTracksMessage): Request[TrackListMessage] = js.native
    def describeClusterVersions(params: DescribeClusterVersionsMessage): Request[ClusterVersionsMessage] = js.native
    def describeClusters(params: DescribeClustersMessage): Request[ClustersMessage] = js.native
    def describeDefaultClusterParameters(params: DescribeDefaultClusterParametersMessage): Request[DescribeDefaultClusterParametersResult] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeHsmClientCertificates(params: DescribeHsmClientCertificatesMessage): Request[HsmClientCertificateMessage] = js.native
    def describeHsmConfigurations(params: DescribeHsmConfigurationsMessage): Request[HsmConfigurationMessage] = js.native
    def describeLoggingStatus(params: DescribeLoggingStatusMessage): Request[LoggingStatus] = js.native
    def describeOrderableClusterOptions(params: DescribeOrderableClusterOptionsMessage): Request[OrderableClusterOptionsMessage] = js.native
    def describeReservedNodeOfferings(params: DescribeReservedNodeOfferingsMessage): Request[ReservedNodeOfferingsMessage] = js.native
    def describeReservedNodes(params: DescribeReservedNodesMessage): Request[ReservedNodesMessage] = js.native
    def describeResize(params: DescribeResizeMessage): Request[ResizeProgressMessage] = js.native
    def describeSnapshotCopyGrants(params: DescribeSnapshotCopyGrantsMessage): Request[SnapshotCopyGrantMessage] = js.native
    def describeSnapshotSchedules(params: DescribeSnapshotSchedulesMessage): Request[DescribeSnapshotSchedulesOutputMessage] = js.native
    def describeStorage(): Request[CustomerStorageMessage] = js.native
    def describeTableRestoreStatus(params: DescribeTableRestoreStatusMessage): Request[TableRestoreStatusMessage] = js.native
    def describeTags(params: DescribeTagsMessage): Request[TaggedResourceListMessage] = js.native
    def disableLogging(params: DisableLoggingMessage): Request[LoggingStatus] = js.native
    def disableSnapshotCopy(params: DisableSnapshotCopyMessage): Request[DisableSnapshotCopyResult] = js.native
    def enableLogging(params: EnableLoggingMessage): Request[LoggingStatus] = js.native
    def enableSnapshotCopy(params: EnableSnapshotCopyMessage): Request[EnableSnapshotCopyResult] = js.native
    def getClusterCredentials(params: GetClusterCredentialsMessage): Request[ClusterCredentials] = js.native
    def getReservedNodeExchangeOfferings(params: GetReservedNodeExchangeOfferingsInputMessage): Request[GetReservedNodeExchangeOfferingsOutputMessage] = js.native
    def modifyCluster(params: ModifyClusterMessage): Request[ModifyClusterResult] = js.native
    def modifyClusterDbRevision(params: ModifyClusterDbRevisionMessage): Request[ModifyClusterDbRevisionResult] = js.native
    def modifyClusterIamRoles(params: ModifyClusterIamRolesMessage): Request[ModifyClusterIamRolesResult] = js.native
    def modifyClusterMaintenance(params: ModifyClusterMaintenanceMessage): Request[ModifyClusterMaintenanceResult] = js.native
    def modifyClusterParameterGroup(params: ModifyClusterParameterGroupMessage): Request[ClusterParameterGroupNameMessage] = js.native
    def modifyClusterSnapshot(params: ModifyClusterSnapshotMessage): Request[ModifyClusterSnapshotResult] = js.native
    def modifyClusterSnapshotSchedule(params: ModifyClusterSnapshotScheduleMessage): Request[js.Object] = js.native
    def modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage): Request[ModifyClusterSubnetGroupResult] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] = js.native
    def modifySnapshotCopyRetentionPeriod(params: ModifySnapshotCopyRetentionPeriodMessage): Request[ModifySnapshotCopyRetentionPeriodResult] = js.native
    def modifySnapshotSchedule(params: ModifySnapshotScheduleMessage): Request[SnapshotSchedule] = js.native
    def purchaseReservedNodeOffering(params: PurchaseReservedNodeOfferingMessage): Request[PurchaseReservedNodeOfferingResult] = js.native
    def rebootCluster(params: RebootClusterMessage): Request[RebootClusterResult] = js.native
    def resetClusterParameterGroup(params: ResetClusterParameterGroupMessage): Request[ClusterParameterGroupNameMessage] = js.native
    def resizeCluster(params: ResizeClusterMessage): Request[ResizeClusterResult] = js.native
    def restoreFromClusterSnapshot(params: RestoreFromClusterSnapshotMessage): Request[RestoreFromClusterSnapshotResult] = js.native
    def restoreTableFromClusterSnapshot(params: RestoreTableFromClusterSnapshotMessage): Request[RestoreTableFromClusterSnapshotResult] = js.native
    def revokeClusterSecurityGroupIngress(params: RevokeClusterSecurityGroupIngressMessage): Request[RevokeClusterSecurityGroupIngressResult] = js.native
    def revokeSnapshotAccess(params: RevokeSnapshotAccessMessage): Request[RevokeSnapshotAccessResult] = js.native
    def rotateEncryptionKey(params: RotateEncryptionKeyMessage): Request[RotateEncryptionKeyResult] = js.native
  }

  @js.native
  trait AcceptReservedNodeExchangeInputMessage extends js.Object {
    var ReservedNodeId: js.UndefOr[String]
    var TargetReservedNodeOfferingId: js.UndefOr[String]
  }

  object AcceptReservedNodeExchangeInputMessage {
    def apply(
      ReservedNodeId: js.UndefOr[String] = js.undefined,
      TargetReservedNodeOfferingId: js.UndefOr[String] = js.undefined): AcceptReservedNodeExchangeInputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeId" -> ReservedNodeId.map { x => x.asInstanceOf[js.Any] },
        "TargetReservedNodeOfferingId" -> TargetReservedNodeOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedNodeExchangeInputMessage]
    }
  }

  @js.native
  trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
    var ExchangedReservedNode: js.UndefOr[ReservedNode]
  }

  object AcceptReservedNodeExchangeOutputMessage {
    def apply(
      ExchangedReservedNode: js.UndefOr[ReservedNode] = js.undefined): AcceptReservedNodeExchangeOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExchangedReservedNode" -> ExchangedReservedNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
    }
  }

  /**
   * <p>A name value pair that describes an aspect of an account. </p>
   */
  @js.native
  trait AccountAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object AccountAttribute {
    def apply(
      AttributeName: js.UndefOr[String] = js.undefined,
      AttributeValues: js.UndefOr[AttributeValueList] = js.undefined): AccountAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValues" -> AttributeValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttribute]
    }
  }

  @js.native
  trait AccountAttributeList extends js.Object {
    var AccountAttributes: js.UndefOr[AttributeList]
  }

  object AccountAttributeList {
    def apply(
      AccountAttributes: js.UndefOr[AttributeList] = js.undefined): AccountAttributeList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountAttributes" -> AccountAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributeList]
    }
  }

  /**
   * <p>Describes an AWS customer account authorized to restore a snapshot.</p>
   */
  @js.native
  trait AccountWithRestoreAccess extends js.Object {
    var AccountId: js.UndefOr[String]
    var AccountAlias: js.UndefOr[String]
  }

  object AccountWithRestoreAccess {
    def apply(
      AccountId: js.UndefOr[String] = js.undefined,
      AccountAlias: js.UndefOr[String] = js.undefined): AccountWithRestoreAccess = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "AccountAlias" -> AccountAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountWithRestoreAccess]
    }
  }

  /**
   * <p>Describes an attribute value.</p>
   */
  @js.native
  trait AttributeValueTarget extends js.Object {
    var AttributeValue: js.UndefOr[String]
  }

  object AttributeValueTarget {
    def apply(
      AttributeValue: js.UndefOr[String] = js.undefined): AttributeValueTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeValue" -> AttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValueTarget]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeClusterSecurityGroupIngressMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): AuthorizeClusterSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "CIDRIP" -> CIDRIP.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object AuthorizeClusterSecurityGroupIngressResult {
    def apply(
      ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined): AuthorizeClusterSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroup" -> ClusterSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AuthorizeSnapshotAccessMessage extends js.Object {
    var SnapshotIdentifier: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var AccountWithRestoreAccess: js.UndefOr[String]
  }

  object AuthorizeSnapshotAccessMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      AccountWithRestoreAccess: js.UndefOr[String] = js.undefined): AuthorizeSnapshotAccessMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AccountWithRestoreAccess" -> AccountWithRestoreAccess.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSnapshotAccessMessage]
    }
  }

  @js.native
  trait AuthorizeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object AuthorizeSnapshotAccessResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): AuthorizeSnapshotAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSnapshotAccessResult]
    }
  }

  /**
   * <p>Describes an availability zone.</p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
    var SupportedPlatforms: js.UndefOr[SupportedPlatformsList]
  }

  object AvailabilityZone {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SupportedPlatforms" -> SupportedPlatforms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  @js.native
  trait BatchDeleteClusterSnapshotsRequest extends js.Object {
    var Identifiers: js.UndefOr[DeleteClusterSnapshotMessageList]
  }

  object BatchDeleteClusterSnapshotsRequest {
    def apply(
      Identifiers: js.UndefOr[DeleteClusterSnapshotMessageList] = js.undefined): BatchDeleteClusterSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identifiers" -> Identifiers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteClusterSnapshotsRequest]
    }
  }

  @js.native
  trait BatchDeleteClusterSnapshotsResult extends js.Object {
    var Resources: js.UndefOr[SnapshotIdentifierList]
    var Errors: js.UndefOr[BatchSnapshotOperationErrorList]
  }

  object BatchDeleteClusterSnapshotsResult {
    def apply(
      Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined,
      Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.undefined): BatchDeleteClusterSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "Errors" -> Errors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteClusterSnapshotsResult]
    }
  }

  @js.native
  trait BatchModifyClusterSnapshotsMessage extends js.Object {
    var SnapshotIdentifierList: js.UndefOr[SnapshotIdentifierList]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var Force: js.UndefOr[Boolean]
  }

  object BatchModifyClusterSnapshotsMessage {
    def apply(
      SnapshotIdentifierList: js.UndefOr[SnapshotIdentifierList] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined): BatchModifyClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifierList" -> SnapshotIdentifierList.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchModifyClusterSnapshotsMessage]
    }
  }

  @js.native
  trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
    var Resources: js.UndefOr[SnapshotIdentifierList]
    var Errors: js.UndefOr[BatchSnapshotOperationErrors]
  }

  object BatchModifyClusterSnapshotsOutputMessage {
    def apply(
      Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined,
      Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.undefined): BatchModifyClusterSnapshotsOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "Errors" -> Errors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
    }
  }

  @js.native
  trait CancelResizeMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object CancelResizeMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): CancelResizeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelResizeMessage]
    }
  }

  /**
   * <p>Describes a cluster.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList]
    var AllowVersionUpgrade: js.UndefOr[Boolean]
    var MaintenanceTrackName: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var ModifyStatus: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var Endpoint: js.UndefOr[Endpoint]
    var ClusterPublicKey: js.UndefOr[String]
    var ElasticIpStatus: js.UndefOr[ElasticIpStatus]
    var ClusterStatus: js.UndefOr[String]
    var ResizeInfo: js.UndefOr[ResizeInfo]
    var ClusterVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var IamRoles: js.UndefOr[ClusterIamRoleList]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var ClusterNodes: js.UndefOr[ClusterNodesList]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[Int]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
    var Encrypted: js.UndefOr[Boolean]
    var EnhancedVpcRouting: js.UndefOr[Boolean]
    var NumberOfNodes: js.UndefOr[Int]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var HsmStatus: js.UndefOr[HsmStatus]
    var Tags: js.UndefOr[TagList]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var PendingActions: js.UndefOr[PendingActionsList]
    var ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList]
    var ClusterSnapshotCopyStatus: js.UndefOr[ClusterSnapshotCopyStatus]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ElasticResizeNumberOfNodeOptions: js.UndefOr[String]
    var ClusterRevisionNumber: js.UndefOr[String]
    var SnapshotScheduleState: js.UndefOr[ScheduleState]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var DataTransferProgress: js.UndefOr[DataTransferProgress]
    var RestoreStatus: js.UndefOr[RestoreStatus]
    var VpcId: js.UndefOr[String]
  }

  object Cluster {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ModifyStatus: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      ClusterPublicKey: js.UndefOr[String] = js.undefined,
      ElasticIpStatus: js.UndefOr[ElasticIpStatus] = js.undefined,
      ClusterStatus: js.UndefOr[String] = js.undefined,
      ResizeInfo: js.UndefOr[ResizeInfo] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      IamRoles: js.UndefOr[ClusterIamRoleList] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      ClusterNodes: js.UndefOr[ClusterNodesList] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
      NumberOfNodes: js.UndefOr[Int] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      HsmStatus: js.UndefOr[HsmStatus] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      PendingActions: js.UndefOr[PendingActionsList] = js.undefined,
      ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.undefined,
      ClusterSnapshotCopyStatus: js.UndefOr[ClusterSnapshotCopyStatus] = js.undefined,
      PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
      ElasticResizeNumberOfNodeOptions: js.UndefOr[String] = js.undefined,
      ClusterRevisionNumber: js.UndefOr[String] = js.undefined,
      SnapshotScheduleState: js.UndefOr[ScheduleState] = js.undefined,
      SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
      DataTransferProgress: js.UndefOr[DataTransferProgress] = js.undefined,
      RestoreStatus: js.UndefOr[RestoreStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "DeferredMaintenanceWindows" -> DeferredMaintenanceWindows.map { x => x.asInstanceOf[js.Any] },
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ModifyStatus" -> ModifyStatus.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "ClusterPublicKey" -> ClusterPublicKey.map { x => x.asInstanceOf[js.Any] },
        "ElasticIpStatus" -> ElasticIpStatus.map { x => x.asInstanceOf[js.Any] },
        "ClusterStatus" -> ClusterStatus.map { x => x.asInstanceOf[js.Any] },
        "ResizeInfo" -> ResizeInfo.map { x => x.asInstanceOf[js.Any] },
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "IamRoles" -> IamRoles.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "ClusterNodes" -> ClusterNodes.map { x => x.asInstanceOf[js.Any] },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x => x.asInstanceOf[js.Any] },
        "NumberOfNodes" -> NumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "ClusterCreateTime" -> ClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "HsmStatus" -> HsmStatus.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "PendingActions" -> PendingActions.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterGroups" -> ClusterParameterGroups.map { x => x.asInstanceOf[js.Any] },
        "ClusterSnapshotCopyStatus" -> ClusterSnapshotCopyStatus.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "ElasticResizeNumberOfNodeOptions" -> ElasticResizeNumberOfNodeOptions.map { x => x.asInstanceOf[js.Any] },
        "ClusterRevisionNumber" -> ClusterRevisionNumber.map { x => x.asInstanceOf[js.Any] },
        "SnapshotScheduleState" -> SnapshotScheduleState.map { x => x.asInstanceOf[js.Any] },
        "SnapshotScheduleIdentifier" -> SnapshotScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DataTransferProgress" -> DataTransferProgress.map { x => x.asInstanceOf[js.Any] },
        "RestoreStatus" -> RestoreStatus.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  /**
   * <p>Temporary credentials with authorization to log on to an Amazon Redshift database. </p>
   */
  @js.native
  trait ClusterCredentials extends js.Object {
    var DbUser: js.UndefOr[String]
    var DbPassword: js.UndefOr[SensitiveString]
    var Expiration: js.UndefOr[TStamp]
  }

  object ClusterCredentials {
    def apply(
      DbUser: js.UndefOr[String] = js.undefined,
      DbPassword: js.UndefOr[SensitiveString] = js.undefined,
      Expiration: js.UndefOr[TStamp] = js.undefined): ClusterCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DbUser" -> DbUser.map { x => x.asInstanceOf[js.Any] },
        "DbPassword" -> DbPassword.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterCredentials]
    }
  }

  /**
   * <p>Describes a <code>ClusterDbRevision</code>.</p>
   */
  @js.native
  trait ClusterDbRevision extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var CurrentDatabaseRevision: js.UndefOr[String]
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp]
    var RevisionTargets: js.UndefOr[RevisionTargetsList]
  }

  object ClusterDbRevision {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      CurrentDatabaseRevision: js.UndefOr[String] = js.undefined,
      DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined,
      RevisionTargets: js.UndefOr[RevisionTargetsList] = js.undefined): ClusterDbRevision = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CurrentDatabaseRevision" -> CurrentDatabaseRevision.map { x => x.asInstanceOf[js.Any] },
        "DatabaseRevisionReleaseDate" -> DatabaseRevisionReleaseDate.map { x => x.asInstanceOf[js.Any] },
        "RevisionTargets" -> RevisionTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterDbRevision]
    }
  }

  @js.native
  trait ClusterDbRevisionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList]
  }

  object ClusterDbRevisionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.undefined): ClusterDbRevisionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ClusterDbRevisions" -> ClusterDbRevisions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterDbRevisionsMessage]
    }
  }

  /**
   * <p>An AWS Identity and Access Management (IAM) role that can be used by the associated Amazon Redshift cluster to access other AWS services.</p>
   */
  @js.native
  trait ClusterIamRole extends js.Object {
    var IamRoleArn: js.UndefOr[String]
    var ApplyStatus: js.UndefOr[String]
  }

  object ClusterIamRole {
    def apply(
      IamRoleArn: js.UndefOr[String] = js.undefined,
      ApplyStatus: js.UndefOr[String] = js.undefined): ClusterIamRole = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "ApplyStatus" -> ApplyStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterIamRole]
    }
  }

  /**
   * <p>The identifier of a node in a cluster.</p>
   */
  @js.native
  trait ClusterNode extends js.Object {
    var NodeRole: js.UndefOr[String]
    var PrivateIPAddress: js.UndefOr[String]
    var PublicIPAddress: js.UndefOr[String]
  }

  object ClusterNode {
    def apply(
      NodeRole: js.UndefOr[String] = js.undefined,
      PrivateIPAddress: js.UndefOr[String] = js.undefined,
      PublicIPAddress: js.UndefOr[String] = js.undefined): ClusterNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeRole" -> NodeRole.map { x => x.asInstanceOf[js.Any] },
        "PrivateIPAddress" -> PrivateIPAddress.map { x => x.asInstanceOf[js.Any] },
        "PublicIPAddress" -> PublicIPAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterNode]
    }
  }

  /**
   * <p>Describes a parameter group.</p>
   */
  @js.native
  trait ClusterParameterGroup extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object ClusterParameterGroup {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ClusterParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupFamily" -> ParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroup]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeClusterParameters</a> action. </p>
   */
  @js.native
  trait ClusterParameterGroupDetails extends js.Object {
    var Parameters: js.UndefOr[ParametersList]
    var Marker: js.UndefOr[String]
  }

  object ClusterParameterGroupDetails {
    def apply(
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): ClusterParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupDetails]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ClusterParameterGroupNameMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
  }

  object ClusterParameterGroupNameMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterGroupStatus: js.UndefOr[String] = js.undefined): ClusterParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupStatus" -> ParameterGroupStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupNameMessage]
    }
  }

  /**
   * <p>Describes the status of a parameter group.</p>
   */
  @js.native
  trait ClusterParameterGroupStatus extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
    var ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList]
  }

  object ClusterParameterGroupStatus {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined,
      ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList] = js.undefined): ClusterParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterStatusList" -> ClusterParameterStatusList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupStatus]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeClusterParameterGroups</a> action. </p>
   */
  @js.native
  trait ClusterParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ParameterGroups: js.UndefOr[ParameterGroupList]
  }

  object ClusterParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined): ClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroups" -> ParameterGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupsMessage]
    }
  }

  /**
   * <p>Describes the status of a parameter group.</p>
   */
  @js.native
  trait ClusterParameterStatus extends js.Object {
    var ParameterName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterApplyErrorDescription: js.UndefOr[String]
  }

  object ClusterParameterStatus {
    def apply(
      ParameterName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined,
      ParameterApplyErrorDescription: js.UndefOr[String] = js.undefined): ClusterParameterStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyErrorDescription" -> ParameterApplyErrorDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterStatus]
    }
  }

  /**
   * <p>Describes a security group.</p>
   */
  @js.native
  trait ClusterSecurityGroup extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var IPRanges: js.UndefOr[IPRangeList]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var Tags: js.UndefOr[TagList]
  }

  object ClusterSecurityGroup {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      IPRanges: js.UndefOr[IPRangeList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ClusterSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "IPRanges" -> IPRanges.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroups" -> EC2SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroup]
    }
  }

  /**
   * <p>Describes a cluster security group.</p>
   */
  @js.native
  trait ClusterSecurityGroupMembership extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ClusterSecurityGroupMembership {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): ClusterSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroupMembership]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ClusterSecurityGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups]
  }

  object ClusterSecurityGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups] = js.undefined): ClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroupMessage]
    }
  }

  /**
   * <p>Returns the destination region and retention period that are configured for cross-region snapshot copy.</p>
   */
  @js.native
  trait ClusterSnapshotCopyStatus extends js.Object {
    var DestinationRegion: js.UndefOr[String]
    var RetentionPeriod: js.UndefOr[Double]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var SnapshotCopyGrantName: js.UndefOr[String]
  }

  object ClusterSnapshotCopyStatus {
    def apply(
      DestinationRegion: js.UndefOr[String] = js.undefined,
      RetentionPeriod: js.UndefOr[Double] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
      SnapshotCopyGrantName: js.UndefOr[String] = js.undefined): ClusterSnapshotCopyStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationRegion" -> DestinationRegion.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriod" -> RetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSnapshotCopyStatus]
    }
  }

  /**
   * <p>Describes a subnet group.</p>
   */
  @js.native
  trait ClusterSubnetGroup extends js.Object {
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object ClusterSubnetGroup {
    def apply(
      SubnetGroupStatus: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): ClusterSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroupStatus" -> SubnetGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSubnetGroup]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeClusterSubnetGroups</a> action. </p>
   */
  @js.native
  trait ClusterSubnetGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups]
  }

  object ClusterSubnetGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups] = js.undefined): ClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ClusterSubnetGroups" -> ClusterSubnetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSubnetGroupMessage]
    }
  }

  /**
   * <p>Describes a cluster version, including the parameter group family and description of the version.</p>
   */
  @js.native
  trait ClusterVersion extends js.Object {
    var ClusterVersion: js.UndefOr[String]
    var ClusterParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object ClusterVersion {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): ClusterVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterGroupFamily" -> ClusterParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterVersion]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeClusterVersions</a> action. </p>
   */
  @js.native
  trait ClusterVersionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ClusterVersions: js.UndefOr[ClusterVersionList]
  }

  object ClusterVersionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined): ClusterVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ClusterVersions" -> ClusterVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterVersionsMessage]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeClusters</a> action. </p>
   */
  @js.native
  trait ClustersMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Clusters: js.UndefOr[ClusterList]
  }

  object ClustersMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Clusters: js.UndefOr[ClusterList] = js.undefined): ClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Clusters" -> Clusters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClustersMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CopyClusterSnapshotMessage extends js.Object {
    var SourceSnapshotIdentifier: js.UndefOr[String]
    var SourceSnapshotClusterIdentifier: js.UndefOr[String]
    var TargetSnapshotIdentifier: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object CopyClusterSnapshotMessage {
    def apply(
      SourceSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      TargetSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): CopyClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceSnapshotIdentifier" -> SourceSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceSnapshotClusterIdentifier" -> SourceSnapshotClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetSnapshotIdentifier" -> TargetSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopyClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): CopyClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyClusterSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ClusterParameterGroupName: js.UndefOr[String]
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional]
    var MaintenanceTrackName: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var IamRoles: js.UndefOr[IamRoleArnList]
    var ElasticIp: js.UndefOr[String]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList]
    var Encrypted: js.UndefOr[BooleanOptional]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var Port: js.UndefOr[IntegerOptional]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var MasterUserPassword: js.UndefOr[String]
    var AdditionalInfo: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
  }

  object CreateClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      IamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
      ElasticIp: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
      Encrypted: js.UndefOr[BooleanOptional] = js.undefined,
      EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined): CreateClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterGroupName" -> ClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "ClusterType" -> ClusterType.map { x => x.asInstanceOf[js.Any] },
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "IamRoles" -> IamRoles.map { x => x.asInstanceOf[js.Any] },
        "ElasticIp" -> ElasticIp.map { x => x.asInstanceOf[js.Any] },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "NumberOfNodes" -> NumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "AdditionalInfo" -> AdditionalInfo.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "SnapshotScheduleIdentifier" -> SnapshotScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupFamily" -> ParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateClusterParameterGroupResult extends js.Object {
    var ClusterParameterGroup: js.UndefOr[ClusterParameterGroup]
  }

  object CreateClusterParameterGroupResult {
    def apply(
      ClusterParameterGroup: js.UndefOr[ClusterParameterGroup] = js.undefined): CreateClusterParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterParameterGroup" -> ClusterParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterSecurityGroupMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSecurityGroupResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object CreateClusterSecurityGroupResult {
    def apply(
      ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined): CreateClusterSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroup" -> ClusterSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSecurityGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterSnapshotMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): CreateClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterSubnetGroupMessage {
    def apply(
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
  }

  object CreateClusterSubnetGroupResult {
    def apply(
      ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined): CreateClusterSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroup" -> ClusterSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSubnetGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var Enabled: js.UndefOr[BooleanOptional]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SubscriptionName: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Tags: js.UndefOr[TagList]
    var SourceType: js.UndefOr[String]
    var Severity: js.UndefOr[String]
  }

  object CreateEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SourceIds" -> SourceIds.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  @js.native
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): CreateEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateHsmClientCertificateMessage {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateHsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmClientCertificateMessage]
    }
  }

  @js.native
  trait CreateHsmClientCertificateResult extends js.Object {
    var HsmClientCertificate: js.UndefOr[HsmClientCertificate]
  }

  object CreateHsmClientCertificateResult {
    def apply(
      HsmClientCertificate: js.UndefOr[HsmClientCertificate] = js.undefined): CreateHsmClientCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificate" -> HsmClientCertificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmClientCertificateResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateHsmConfigurationMessage extends js.Object {
    var HsmPartitionName: js.UndefOr[String]
    var HsmIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var HsmServerPublicCertificate: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var HsmPartitionPassword: js.UndefOr[String]
  }

  object CreateHsmConfigurationMessage {
    def apply(
      HsmPartitionName: js.UndefOr[String] = js.undefined,
      HsmIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      HsmServerPublicCertificate: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      HsmPartitionPassword: js.UndefOr[String] = js.undefined): CreateHsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmPartitionName" -> HsmPartitionName.map { x => x.asInstanceOf[js.Any] },
        "HsmIpAddress" -> HsmIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HsmServerPublicCertificate" -> HsmServerPublicCertificate.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "HsmPartitionPassword" -> HsmPartitionPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmConfigurationMessage]
    }
  }

  @js.native
  trait CreateHsmConfigurationResult extends js.Object {
    var HsmConfiguration: js.UndefOr[HsmConfiguration]
  }

  object CreateHsmConfigurationResult {
    def apply(
      HsmConfiguration: js.UndefOr[HsmConfiguration] = js.undefined): CreateHsmConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmConfiguration" -> HsmConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmConfigurationResult]
    }
  }

  /**
   * <p>The result of the <code>CreateSnapshotCopyGrant</code> action.</p>
   */
  @js.native
  trait CreateSnapshotCopyGrantMessage extends js.Object {
    var SnapshotCopyGrantName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSnapshotCopyGrantMessage {
    def apply(
      SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateSnapshotCopyGrantMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotCopyGrantMessage]
    }
  }

  @js.native
  trait CreateSnapshotCopyGrantResult extends js.Object {
    var SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant]
  }

  object CreateSnapshotCopyGrantResult {
    def apply(
      SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant] = js.undefined): CreateSnapshotCopyGrantResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrant" -> SnapshotCopyGrant.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotCopyGrantResult]
    }
  }

  @js.native
  trait CreateSnapshotScheduleMessage extends js.Object {
    var DryRun: js.UndefOr[BooleanOptional]
    var ScheduleIdentifier: js.UndefOr[String]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var NextInvocations: js.UndefOr[IntegerOptional]
    var ScheduleDescription: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSnapshotScheduleMessage {
    def apply(
      DryRun: js.UndefOr[BooleanOptional] = js.undefined,
      ScheduleIdentifier: js.UndefOr[String] = js.undefined,
      ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined,
      NextInvocations: js.UndefOr[IntegerOptional] = js.undefined,
      ScheduleDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateSnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ScheduleDefinitions" -> ScheduleDefinitions.map { x => x.asInstanceOf[js.Any] },
        "NextInvocations" -> NextInvocations.map { x => x.asInstanceOf[js.Any] },
        "ScheduleDescription" -> ScheduleDescription.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotScheduleMessage]
    }
  }

  /**
   * <p>Contains the output from the <code>CreateTags</code> action. </p>
   */
  @js.native
  trait CreateTagsMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTagsMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsMessage]
    }
  }

  @js.native
  trait CustomerStorageMessage extends js.Object {
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double]
    var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double]
  }

  object CustomerStorageMessage {
    def apply(
      TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
      TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined): CustomerStorageMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalBackupSizeInMegaBytes" -> TotalBackupSizeInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "TotalProvisionedStorageInMegaBytes" -> TotalProvisionedStorageInMegaBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerStorageMessage]
    }
  }

  /**
   * <p>Describes the status of a cluster while it is in the process of resizing with an incremental resize.</p>
   */
  @js.native
  trait DataTransferProgress extends js.Object {
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional]
    var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional]
    var TotalDataInMegaBytes: js.UndefOr[Double]
    var DataTransferredInMegaBytes: js.UndefOr[Double]
    var Status: js.UndefOr[String]
  }

  object DataTransferProgress {
    def apply(
      ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
      CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
      EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
      TotalDataInMegaBytes: js.UndefOr[Double] = js.undefined,
      DataTransferredInMegaBytes: js.UndefOr[Double] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): DataTransferProgress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "CurrentRateInMegaBytesPerSecond" -> CurrentRateInMegaBytesPerSecond.map { x => x.asInstanceOf[js.Any] },
        "EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x => x.asInstanceOf[js.Any] },
        "TotalDataInMegaBytes" -> TotalDataInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "DataTransferredInMegaBytes" -> DataTransferredInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataTransferProgress]
    }
  }

  /**
   * <p>Describes the default cluster parameters for a parameter group family.</p>
   */
  @js.native
  trait DefaultClusterParameters extends js.Object {
    var ParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DefaultClusterParameters {
    def apply(
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): DefaultClusterParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupFamily" -> ParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultClusterParameters]
    }
  }

  /**
   * <p>Describes a deferred maintenance window</p>
   */
  @js.native
  trait DeferredMaintenanceWindow extends js.Object {
    var DeferMaintenanceIdentifier: js.UndefOr[String]
    var DeferMaintenanceStartTime: js.UndefOr[TStamp]
    var DeferMaintenanceEndTime: js.UndefOr[TStamp]
  }

  object DeferredMaintenanceWindow {
    def apply(
      DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined,
      DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined,
      DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined): DeferredMaintenanceWindow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeferMaintenanceIdentifier" -> DeferMaintenanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DeferMaintenanceStartTime" -> DeferMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "DeferMaintenanceEndTime" -> DeferMaintenanceEndTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeferredMaintenanceWindow]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteClusterMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var SkipFinalClusterSnapshot: js.UndefOr[Boolean]
    var FinalClusterSnapshotIdentifier: js.UndefOr[String]
    var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object DeleteClusterMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.undefined,
      FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): DeleteClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SkipFinalClusterSnapshot" -> SkipFinalClusterSnapshot.map { x => x.asInstanceOf[js.Any] },
        "FinalClusterSnapshotIdentifier" -> FinalClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "FinalClusterSnapshotRetentionPeriod" -> FinalClusterSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
  }

  object DeleteClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined): DeleteClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
  }

  object DeleteClusterSecurityGroupMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined): DeleteClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSecurityGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  object DeleteClusterSnapshotMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined): DeleteClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object DeleteClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): DeleteClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
  }

  object DeleteClusterSubnetGroupMessage {
    def apply(
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined): DeleteClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSubnetGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
  }

  object DeleteEventSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
  }

  object DeleteHsmClientCertificateMessage {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined): DeleteHsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmClientCertificateMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteHsmConfigurationMessage extends js.Object {
    var HsmConfigurationIdentifier: js.UndefOr[String]
  }

  object DeleteHsmConfigurationMessage {
    def apply(
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined): DeleteHsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmConfigurationMessage]
    }
  }

  /**
   * <p>The result of the <code>DeleteSnapshotCopyGrant</code> action.</p>
   */
  @js.native
  trait DeleteSnapshotCopyGrantMessage extends js.Object {
    var SnapshotCopyGrantName: js.UndefOr[String]
  }

  object DeleteSnapshotCopyGrantMessage {
    def apply(
      SnapshotCopyGrantName: js.UndefOr[String] = js.undefined): DeleteSnapshotCopyGrantMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotCopyGrantMessage]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleMessage extends js.Object {
    var ScheduleIdentifier: js.UndefOr[String]
  }

  object DeleteSnapshotScheduleMessage {
    def apply(
      ScheduleIdentifier: js.UndefOr[String] = js.undefined): DeleteSnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotScheduleMessage]
    }
  }

  /**
   * <p>Contains the output from the <code>DeleteTags</code> action. </p>
   */
  @js.native
  trait DeleteTagsMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object DeleteTagsMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): DeleteTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsMessage]
    }
  }

  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object DescribeAccountAttributesMessage {
    def apply(
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): DescribeAccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  @js.native
  trait DescribeClusterDbRevisionsMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterDbRevisionsMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterDbRevisionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterDbRevisionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClusterParameterGroupsMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterParameterGroupsMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterParameterGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClusterParametersMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterParametersMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterParametersMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClusterSecurityGroupsMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterSecurityGroupsMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSecurityGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClusterSnapshotsMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var SortingEntities: js.UndefOr[SnapshotSortingEntityList]
    var ClusterExists: js.UndefOr[BooleanOptional]
    var SnapshotType: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var EndTime: js.UndefOr[TStamp]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var OwnerAccount: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var SnapshotIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterSnapshotsMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      SortingEntities: js.UndefOr[SnapshotSortingEntityList] = js.undefined,
      ClusterExists: js.UndefOr[BooleanOptional] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      OwnerAccount: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SortingEntities" -> SortingEntities.map { x => x.asInstanceOf[js.Any] },
        "ClusterExists" -> ClusterExists.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "OwnerAccount" -> OwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSnapshotsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClusterSubnetGroupsMessage extends js.Object {
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterSubnetGroupsMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSubnetGroupsMessage]
    }
  }

  @js.native
  trait DescribeClusterTracksMessage extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterTracksMessage {
    def apply(
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterTracksMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterTracksMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClusterVersionsMessage extends js.Object {
    var ClusterVersion: js.UndefOr[String]
    var ClusterParameterGroupFamily: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeClusterVersionsMessage {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClusterVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterGroupFamily" -> ClusterParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterVersionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeClustersMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeClustersMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDefaultClusterParametersMessage extends js.Object {
    var ParameterGroupFamily: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDefaultClusterParametersMessage {
    def apply(
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDefaultClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupFamily" -> ParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeDefaultClusterParametersResult extends js.Object {
    var DefaultClusterParameters: js.UndefOr[DefaultClusterParameters]
  }

  object DescribeDefaultClusterParametersResult {
    def apply(
      DefaultClusterParameters: js.UndefOr[DefaultClusterParameters] = js.undefined): DescribeDefaultClusterParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultClusterParameters" -> DefaultClusterParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultClusterParametersResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var EndTime: js.UndefOr[TStamp]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceType: js.UndefOr[SourceType]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventsMessage {
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeHsmClientCertificatesMessage extends js.Object {
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeHsmClientCertificatesMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeHsmClientCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmClientCertificatesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeHsmConfigurationsMessage extends js.Object {
    var MaxRecords: js.UndefOr[IntegerOptional]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeHsmConfigurationsMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeHsmConfigurationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmConfigurationsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeLoggingStatusMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object DescribeLoggingStatusMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): DescribeLoggingStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoggingStatusMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeOrderableClusterOptionsMessage extends js.Object {
    var ClusterVersion: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeOrderableClusterOptionsMessage {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeOrderableClusterOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableClusterOptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReservedNodeOfferingsMessage extends js.Object {
    var ReservedNodeOfferingId: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReservedNodeOfferingsMessage {
    def apply(
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReservedNodeOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedNodeOfferingsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReservedNodesMessage extends js.Object {
    var ReservedNodeId: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReservedNodesMessage {
    def apply(
      ReservedNodeId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReservedNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeId" -> ReservedNodeId.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedNodesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeResizeMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object DescribeResizeMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): DescribeResizeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResizeMessage]
    }
  }

  /**
   * <p>The result of the <code>DescribeSnapshotCopyGrants</code> action.</p>
   */
  @js.native
  trait DescribeSnapshotCopyGrantsMessage extends js.Object {
    var SnapshotCopyGrantName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeSnapshotCopyGrantsMessage {
    def apply(
      SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeSnapshotCopyGrantsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotCopyGrantsMessage]
    }
  }

  @js.native
  trait DescribeSnapshotSchedulesMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeSnapshotSchedulesMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ScheduleIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeSnapshotSchedulesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotSchedulesMessage]
    }
  }

  @js.native
  trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
    var SnapshotSchedules: js.UndefOr[SnapshotScheduleList]
    var Marker: js.UndefOr[String]
  }

  object DescribeSnapshotSchedulesOutputMessage {
    def apply(
      SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeSnapshotSchedulesOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotSchedules" -> SnapshotSchedules.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTableRestoreStatusMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var TableRestoreRequestId: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeTableRestoreStatusMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      TableRestoreRequestId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeTableRestoreStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TableRestoreRequestId" -> TableRestoreRequestId.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableRestoreStatusMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTagsMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagValues: js.UndefOr[TagValueList]
    var TagKeys: js.UndefOr[TagKeyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeTagsMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      ResourceType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DisableLoggingMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object DisableLoggingMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): DisableLoggingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableLoggingMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DisableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object DisableSnapshotCopyMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): DisableSnapshotCopyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSnapshotCopyMessage]
    }
  }

  @js.native
  trait DisableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DisableSnapshotCopyResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): DisableSnapshotCopyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSnapshotCopyResult]
    }
  }

  /**
   * <p>Describes an Amazon EC2 security group.</p>
   */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var Status: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object EC2SecurityGroup {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
   * <p>Describes the status of the elastic IP (EIP) address.</p>
   */
  @js.native
  trait ElasticIpStatus extends js.Object {
    var ElasticIp: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ElasticIpStatus {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): ElasticIpStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticIp" -> ElasticIp.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticIpStatus]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EnableLoggingMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
  }

  object EnableLoggingMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined): EnableLoggingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableLoggingMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EnableSnapshotCopyMessage extends js.Object {
    var SnapshotCopyGrantName: js.UndefOr[String]
    var RetentionPeriod: js.UndefOr[IntegerOptional]
    var ClusterIdentifier: js.UndefOr[String]
    var DestinationRegion: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object EnableSnapshotCopyMessage {
    def apply(
      SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
      RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DestinationRegion: js.UndefOr[String] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): EnableSnapshotCopyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriod" -> RetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DestinationRegion" -> DestinationRegion.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSnapshotCopyMessage]
    }
  }

  @js.native
  trait EnableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object EnableSnapshotCopyResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): EnableSnapshotCopyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSnapshotCopyResult]
    }
  }

  /**
   * <p>Describes a connection endpoint.</p>
   */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  object Endpoint {
    def apply(
      Address: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p>Describes an event.</p>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var Date: js.UndefOr[TStamp]
    var Severity: js.UndefOr[String]
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Describes event categories.</p>
   */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var SourceType: js.UndefOr[String]
    var Events: js.UndefOr[EventInfoMapList]
  }

  object EventCategoriesMap {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventInfoMapList] = js.undefined): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  object EventCategoriesMessage {
    def apply(
      EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined): EventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventCategoriesMapList" -> EventCategoriesMapList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMessage]
    }
  }

  /**
   * <p>Describes event information.</p>
   */
  @js.native
  trait EventInfoMap extends js.Object {
    var EventId: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var EventDescription: js.UndefOr[String]
    var Severity: js.UndefOr[String]
  }

  object EventInfoMap {
    def apply(
      EventId: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      EventDescription: js.UndefOr[String] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined): EventInfoMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "EventDescription" -> EventDescription.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventInfoMap]
    }
  }

  /**
   * <p>Describes event subscriptions.</p>
   */
  @js.native
  trait EventSubscription extends js.Object {
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var CustSubscriptionId: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var SourceType: js.UndefOr[String]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SubscriptionCreationTime: js.UndefOr[TStamp]
    var Severity: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object EventSubscription {
    def apply(
      CustomerAwsId: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      CustSubscriptionId: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionCreationTime: js.UndefOr[TStamp] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerAwsId" -> CustomerAwsId.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "CustSubscriptionId" -> CustSubscriptionId.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "EventCategoriesList" -> EventCategoriesList.map { x => x.asInstanceOf[js.Any] },
        "SourceIdsList" -> SourceIdsList.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionCreationTime" -> SubscriptionCreationTime.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
  }

  object EventSubscriptionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined): EventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "EventSubscriptionsList" -> EventSubscriptionsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscriptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EventsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Events: js.UndefOr[EventList]
  }

  object EventsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
    }
  }

  /**
   * <p>The request parameters to get cluster credentials.</p>
   */
  @js.native
  trait GetClusterCredentialsMessage extends js.Object {
    var AutoCreate: js.UndefOr[BooleanOptional]
    var ClusterIdentifier: js.UndefOr[String]
    var DurationSeconds: js.UndefOr[IntegerOptional]
    var DbName: js.UndefOr[String]
    var DbGroups: js.UndefOr[DbGroupList]
    var DbUser: js.UndefOr[String]
  }

  object GetClusterCredentialsMessage {
    def apply(
      AutoCreate: js.UndefOr[BooleanOptional] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DurationSeconds: js.UndefOr[IntegerOptional] = js.undefined,
      DbName: js.UndefOr[String] = js.undefined,
      DbGroups: js.UndefOr[DbGroupList] = js.undefined,
      DbUser: js.UndefOr[String] = js.undefined): GetClusterCredentialsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoCreate" -> AutoCreate.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DurationSeconds" -> DurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "DbName" -> DbName.map { x => x.asInstanceOf[js.Any] },
        "DbGroups" -> DbGroups.map { x => x.asInstanceOf[js.Any] },
        "DbUser" -> DbUser.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClusterCredentialsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
    var ReservedNodeId: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object GetReservedNodeExchangeOfferingsInputMessage {
    def apply(
      ReservedNodeId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): GetReservedNodeExchangeOfferingsInputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeId" -> ReservedNodeId.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
    }
  }

  @js.native
  trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  object GetReservedNodeExchangeOfferingsOutputMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined): GetReservedNodeExchangeOfferingsOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedNodeOfferings" -> ReservedNodeOfferings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservedNodeExchangeOfferingsOutputMessage]
    }
  }

  /**
   * <p>Returns information about an HSM client certificate. The certificate is stored in a secure Hardware Storage Module (HSM), and used by the Amazon Redshift cluster to encrypt data files.</p>
   */
  @js.native
  trait HsmClientCertificate extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmClientCertificatePublicKey: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object HsmClientCertificate {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): HsmClientCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "HsmClientCertificatePublicKey" -> HsmClientCertificatePublicKey.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmClientCertificate]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait HsmClientCertificateMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var HsmClientCertificates: js.UndefOr[HsmClientCertificateList]
  }

  object HsmClientCertificateMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.undefined): HsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "HsmClientCertificates" -> HsmClientCertificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmClientCertificateMessage]
    }
  }

  /**
   * <p>Returns information about an HSM configuration, which is an object that describes to Amazon Redshift clusters the information they require to connect to an HSM where they can store database encryption keys.</p>
   */
  @js.native
  trait HsmConfiguration extends js.Object {
    var HsmPartitionName: js.UndefOr[String]
    var HsmIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object HsmConfiguration {
    def apply(
      HsmPartitionName: js.UndefOr[String] = js.undefined,
      HsmIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): HsmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmPartitionName" -> HsmPartitionName.map { x => x.asInstanceOf[js.Any] },
        "HsmIpAddress" -> HsmIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmConfiguration]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait HsmConfigurationMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var HsmConfigurations: js.UndefOr[HsmConfigurationList]
  }

  object HsmConfigurationMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined): HsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurations" -> HsmConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmConfigurationMessage]
    }
  }

  /**
   * <p>Describes the status of changes to HSM settings.</p>
   */
  @js.native
  trait HsmStatus extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object HsmStatus {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): HsmStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmStatus]
    }
  }

  /**
   * <p>Describes an IP range used in a security group.</p>
   */
  @js.native
  trait IPRange extends js.Object {
    var Status: js.UndefOr[String]
    var CIDRIP: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object IPRange {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): IPRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CIDRIP" -> CIDRIP.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPRange]
    }
  }

  /**
   * <p>Describes the status of logging for a cluster.</p>
   */
  @js.native
  trait LoggingStatus extends js.Object {
    var LastFailureMessage: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var LastSuccessfulDeliveryTime: js.UndefOr[TStamp]
    var S3KeyPrefix: js.UndefOr[String]
    var LoggingEnabled: js.UndefOr[Boolean]
    var LastFailureTime: js.UndefOr[TStamp]
  }

  object LoggingStatus {
    def apply(
      LastFailureMessage: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined,
      LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      LoggingEnabled: js.UndefOr[Boolean] = js.undefined,
      LastFailureTime: js.UndefOr[TStamp] = js.undefined): LoggingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastFailureMessage" -> LastFailureMessage.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "LastSuccessfulDeliveryTime" -> LastSuccessfulDeliveryTime.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "LoggingEnabled" -> LoggingEnabled.map { x => x.asInstanceOf[js.Any] },
        "LastFailureTime" -> LastFailureTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingStatus]
    }
  }

  /**
   * <p>Defines a maintenance track that determines which Amazon Redshift version to apply during a maintenance window. If the value for <code>MaintenanceTrack</code> is <code>current</code>, the cluster is updated to the most recently certified maintenance release. If the value is <code>trailing</code>, the cluster is updated to the previously certified maintenance release. </p>
   */
  @js.native
  trait MaintenanceTrack extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var DatabaseVersion: js.UndefOr[String]
    var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList]
  }

  object MaintenanceTrack {
    def apply(
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      DatabaseVersion: js.UndefOr[String] = js.undefined,
      UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.undefined): MaintenanceTrack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseVersion" -> DatabaseVersion.map { x => x.asInstanceOf[js.Any] },
        "UpdateTargets" -> UpdateTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceTrack]
    }
  }

  @js.native
  trait ModifyClusterDbRevisionMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var RevisionTarget: js.UndefOr[String]
  }

  object ModifyClusterDbRevisionMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      RevisionTarget: js.UndefOr[String] = js.undefined): ModifyClusterDbRevisionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "RevisionTarget" -> RevisionTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterDbRevisionMessage]
    }
  }

  @js.native
  trait ModifyClusterDbRevisionResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterDbRevisionResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterDbRevisionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterDbRevisionResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyClusterIamRolesMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var AddIamRoles: js.UndefOr[IamRoleArnList]
    var RemoveIamRoles: js.UndefOr[IamRoleArnList]
  }

  object ModifyClusterIamRolesMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      AddIamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
      RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.undefined): ModifyClusterIamRolesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AddIamRoles" -> AddIamRoles.map { x => x.asInstanceOf[js.Any] },
        "RemoveIamRoles" -> RemoveIamRoles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterIamRolesMessage]
    }
  }

  @js.native
  trait ModifyClusterIamRolesResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterIamRolesResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterIamRolesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterIamRolesResult]
    }
  }

  @js.native
  trait ModifyClusterMaintenanceMessage extends js.Object {
    var DeferMaintenanceStartTime: js.UndefOr[TStamp]
    var ClusterIdentifier: js.UndefOr[String]
    var DeferMaintenanceIdentifier: js.UndefOr[String]
    var DeferMaintenanceDuration: js.UndefOr[IntegerOptional]
    var DeferMaintenance: js.UndefOr[BooleanOptional]
    var DeferMaintenanceEndTime: js.UndefOr[TStamp]
  }

  object ModifyClusterMaintenanceMessage {
    def apply(
      DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined,
      DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.undefined,
      DeferMaintenance: js.UndefOr[BooleanOptional] = js.undefined,
      DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined): ModifyClusterMaintenanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeferMaintenanceStartTime" -> DeferMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DeferMaintenanceIdentifier" -> DeferMaintenanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DeferMaintenanceDuration" -> DeferMaintenanceDuration.map { x => x.asInstanceOf[js.Any] },
        "DeferMaintenance" -> DeferMaintenance.map { x => x.asInstanceOf[js.Any] },
        "DeferMaintenanceEndTime" -> DeferMaintenanceEndTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMaintenanceMessage]
    }
  }

  @js.native
  trait ModifyClusterMaintenanceResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterMaintenanceResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterMaintenanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMaintenanceResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ClusterParameterGroupName: js.UndefOr[String]
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional]
    var MaintenanceTrackName: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var NewClusterIdentifier: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var ElasticIp: js.UndefOr[String]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList]
    var Encrypted: js.UndefOr[BooleanOptional]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var MasterUserPassword: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
  }

  object ModifyClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      NewClusterIdentifier: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      ElasticIp: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
      Encrypted: js.UndefOr[BooleanOptional] = js.undefined,
      EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined): ModifyClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterGroupName" -> ClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "NewClusterIdentifier" -> NewClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ClusterType" -> ClusterType.map { x => x.asInstanceOf[js.Any] },
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "ElasticIp" -> ElasticIp.map { x => x.asInstanceOf[js.Any] },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "NumberOfNodes" -> NumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ModifyClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): ModifyClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterResult]
    }
  }

  @js.native
  trait ModifyClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var Force: js.UndefOr[Boolean]
  }

  object ModifyClusterSnapshotMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined): ModifyClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSnapshotMessage]
    }
  }

  @js.native
  trait ModifyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object ModifyClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): ModifyClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSnapshotResult]
    }
  }

  @js.native
  trait ModifyClusterSnapshotScheduleMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var DisassociateSchedule: js.UndefOr[BooleanOptional]
  }

  object ModifyClusterSnapshotScheduleMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ScheduleIdentifier: js.UndefOr[String] = js.undefined,
      DisassociateSchedule: js.UndefOr[BooleanOptional] = js.undefined): ModifyClusterSnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DisassociateSchedule" -> DisassociateSchedule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSnapshotScheduleMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object ModifyClusterSubnetGroupMessage {
    def apply(
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): ModifyClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
  }

  object ModifyClusterSubnetGroupResult {
    def apply(
      ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined): ModifyClusterSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroup" -> ClusterSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSubnetGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var Enabled: js.UndefOr[BooleanOptional]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SubscriptionName: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
    var Severity: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SourceIds" -> SourceIds.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  @js.native
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): ModifyEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var RetentionPeriod: js.UndefOr[Int]
    var Manual: js.UndefOr[Boolean]
  }

  object ModifySnapshotCopyRetentionPeriodMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      RetentionPeriod: js.UndefOr[Int] = js.undefined,
      Manual: js.UndefOr[Boolean] = js.undefined): ModifySnapshotCopyRetentionPeriodMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriod" -> RetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "Manual" -> Manual.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotCopyRetentionPeriodMessage]
    }
  }

  @js.native
  trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifySnapshotCopyRetentionPeriodResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): ModifySnapshotCopyRetentionPeriodResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
    }
  }

  @js.native
  trait ModifySnapshotScheduleMessage extends js.Object {
    var ScheduleIdentifier: js.UndefOr[String]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
  }

  object ModifySnapshotScheduleMessage {
    def apply(
      ScheduleIdentifier: js.UndefOr[String] = js.undefined,
      ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined): ModifySnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ScheduleDefinitions" -> ScheduleDefinitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotScheduleMessage]
    }
  }

  /**
   * <p>Describes an orderable cluster option.</p>
   */
  @js.native
  trait OrderableClusterOption extends js.Object {
    var ClusterVersion: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object OrderableClusterOption {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined): OrderableClusterOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "ClusterType" -> ClusterType.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableClusterOption]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeOrderableClusterOptions</a> action. </p>
   */
  @js.native
  trait OrderableClusterOptionsMessage extends js.Object {
    var OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList]
    var Marker: js.UndefOr[String]
  }

  object OrderableClusterOptionsMessage {
    def apply(
      OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): OrderableClusterOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrderableClusterOptions" -> OrderableClusterOptions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableClusterOptionsMessage]
    }
  }

  /**
   * <p>Describes a parameter in a cluster parameter group.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var IsModifiable: js.UndefOr[Boolean]
    var ApplyType: js.UndefOr[ParameterApplyType]
    var Description: js.UndefOr[String]
    var AllowedValues: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var DataType: js.UndefOr[String]
  }

  object Parameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      ApplyType: js.UndefOr[ParameterApplyType] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "ApplyType" -> ApplyType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  object ParameterApplyTypeEnum {
    val static = "static"
    val dynamic = "dynamic"

    val values = IndexedSeq(static, dynamic)
  }

  /**
   * <p>Describes cluster attributes that are in a pending state. A change to one or more the attributes was requested and is in progress or will be applied.</p>
   */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var MasterUserPassword: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var EncryptionType: js.UndefOr[String]
  }

  object PendingModifiedValues {
    def apply(
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
      NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      EncryptionType: js.UndefOr[String] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ClusterType" -> ClusterType.map { x => x.asInstanceOf[js.Any] },
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x => x.asInstanceOf[js.Any] },
        "NumberOfNodes" -> NumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PurchaseReservedNodeOfferingMessage extends js.Object {
    var ReservedNodeOfferingId: js.UndefOr[String]
    var NodeCount: js.UndefOr[IntegerOptional]
  }

  object PurchaseReservedNodeOfferingMessage {
    def apply(
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
      NodeCount: js.UndefOr[IntegerOptional] = js.undefined): PurchaseReservedNodeOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x.asInstanceOf[js.Any] },
        "NodeCount" -> NodeCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedNodeOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedNodeOfferingResult extends js.Object {
    var ReservedNode: js.UndefOr[ReservedNode]
  }

  object PurchaseReservedNodeOfferingResult {
    def apply(
      ReservedNode: js.UndefOr[ReservedNode] = js.undefined): PurchaseReservedNodeOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNode" -> ReservedNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedNodeOfferingResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RebootClusterMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object RebootClusterMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): RebootClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootClusterMessage]
    }
  }

  @js.native
  trait RebootClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RebootClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): RebootClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootClusterResult]
    }
  }

  /**
   * <p>Describes a recurring charge.</p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    def apply(
      RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
      RecurringChargeFrequency: js.UndefOr[String] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecurringChargeAmount" -> RecurringChargeAmount.map { x => x.asInstanceOf[js.Any] },
        "RecurringChargeFrequency" -> RecurringChargeFrequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  /**
   * <p>Describes a reserved node. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved node offerings. </p>
   */
  @js.native
  trait ReservedNode extends js.Object {
    var ReservedNodeId: js.UndefOr[String]
    var ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var NodeCount: js.UndefOr[Int]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var NodeType: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var OfferingType: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
    var ReservedNodeOfferingId: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  object ReservedNode {
    def apply(
      ReservedNodeId: js.UndefOr[String] = js.undefined,
      ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      NodeCount: js.UndefOr[Int] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined): ReservedNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeId" -> ReservedNodeId.map { x => x.asInstanceOf[js.Any] },
        "ReservedNodeOfferingType" -> ReservedNodeOfferingType.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "NodeCount" -> NodeCount.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNode]
    }
  }

  /**
   * <p>Describes a reserved node offering.</p>
   */
  @js.native
  trait ReservedNodeOffering extends js.Object {
    var ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var NodeType: js.UndefOr[String]
    var OfferingType: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
    var ReservedNodeOfferingId: js.UndefOr[String]
  }

  object ReservedNodeOffering {
    def apply(
      ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined): ReservedNodeOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeOfferingType" -> ReservedNodeOfferingType.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodeOffering]
    }
  }

  object ReservedNodeOfferingTypeEnum {
    val Regular = "Regular"
    val Upgradable = "Upgradable"

    val values = IndexedSeq(Regular, Upgradable)
  }

  /**
   * <p/>
   */
  @js.native
  trait ReservedNodeOfferingsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  object ReservedNodeOfferingsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined): ReservedNodeOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedNodeOfferings" -> ReservedNodeOfferings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodeOfferingsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ReservedNodesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodes: js.UndefOr[ReservedNodeList]
  }

  object ReservedNodesMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined): ReservedNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedNodes" -> ReservedNodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ResetClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ResetAllParameters: js.UndefOr[Boolean]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ResetClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): ResetClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ResizeClusterMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
    var Classic: js.UndefOr[BooleanOptional]
  }

  object ResizeClusterMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      NumberOfNodes: js.UndefOr[Int] = js.undefined,
      Classic: js.UndefOr[BooleanOptional] = js.undefined): ResizeClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ClusterType" -> ClusterType.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "NumberOfNodes" -> NumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "Classic" -> Classic.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeClusterMessage]
    }
  }

  @js.native
  trait ResizeClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ResizeClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): ResizeClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeClusterResult]
    }
  }

  /**
   * <p>Describes a resize operation.</p>
   */
  @js.native
  trait ResizeInfo extends js.Object {
    var ResizeType: js.UndefOr[String]
    var AllowCancelResize: js.UndefOr[Boolean]
  }

  object ResizeInfo {
    def apply(
      ResizeType: js.UndefOr[String] = js.undefined,
      AllowCancelResize: js.UndefOr[Boolean] = js.undefined): ResizeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResizeType" -> ResizeType.map { x => x.asInstanceOf[js.Any] },
        "AllowCancelResize" -> AllowCancelResize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeInfo]
    }
  }

  /**
   * <p>Describes the result of a cluster resize operation.</p>
   */
  @js.native
  trait ResizeProgressMessage extends js.Object {
    var TargetNumberOfNodes: js.UndefOr[IntegerOptional]
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional]
    var TargetClusterType: js.UndefOr[String]
    var TargetNodeType: js.UndefOr[String]
    var TargetEncryptionType: js.UndefOr[String]
    var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional]
    var ProgressInMegaBytes: js.UndefOr[LongOptional]
    var Message: js.UndefOr[String]
    var ResizeType: js.UndefOr[String]
    var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional]
    var ImportTablesCompleted: js.UndefOr[ImportTablesCompleted]
    var ImportTablesInProgress: js.UndefOr[ImportTablesInProgress]
    var Status: js.UndefOr[String]
    var ImportTablesNotStarted: js.UndefOr[ImportTablesNotStarted]
  }

  object ResizeProgressMessage {
    def apply(
      TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
      TargetClusterType: js.UndefOr[String] = js.undefined,
      TargetNodeType: js.UndefOr[String] = js.undefined,
      TargetEncryptionType: js.UndefOr[String] = js.undefined,
      AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
      EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
      ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      ResizeType: js.UndefOr[String] = js.undefined,
      TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
      ImportTablesCompleted: js.UndefOr[ImportTablesCompleted] = js.undefined,
      ImportTablesInProgress: js.UndefOr[ImportTablesInProgress] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      ImportTablesNotStarted: js.UndefOr[ImportTablesNotStarted] = js.undefined): ResizeProgressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetNumberOfNodes" -> TargetNumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "TargetClusterType" -> TargetClusterType.map { x => x.asInstanceOf[js.Any] },
        "TargetNodeType" -> TargetNodeType.map { x => x.asInstanceOf[js.Any] },
        "TargetEncryptionType" -> TargetEncryptionType.map { x => x.asInstanceOf[js.Any] },
        "AvgResizeRateInMegaBytesPerSecond" -> AvgResizeRateInMegaBytesPerSecond.map { x => x.asInstanceOf[js.Any] },
        "EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x => x.asInstanceOf[js.Any] },
        "ProgressInMegaBytes" -> ProgressInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "ResizeType" -> ResizeType.map { x => x.asInstanceOf[js.Any] },
        "TotalResizeDataInMegaBytes" -> TotalResizeDataInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "ImportTablesCompleted" -> ImportTablesCompleted.map { x => x.asInstanceOf[js.Any] },
        "ImportTablesInProgress" -> ImportTablesInProgress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "ImportTablesNotStarted" -> ImportTablesNotStarted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeProgressMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RestoreFromClusterSnapshotMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ClusterParameterGroupName: js.UndefOr[String]
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional]
    var MaintenanceTrackName: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var IamRoles: js.UndefOr[IamRoleArnList]
    var ElasticIp: js.UndefOr[String]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var AvailabilityZone: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var Port: js.UndefOr[IntegerOptional]
    var AdditionalInfo: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var OwnerAccount: js.UndefOr[String]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  object RestoreFromClusterSnapshotMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      IamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
      ElasticIp: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
      EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      OwnerAccount: js.UndefOr[String] = js.undefined,
      SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined): RestoreFromClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ClusterParameterGroupName" -> ClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "IamRoles" -> IamRoles.map { x => x.asInstanceOf[js.Any] },
        "ElasticIp" -> ElasticIp.map { x => x.asInstanceOf[js.Any] },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "AdditionalInfo" -> AdditionalInfo.map { x => x.asInstanceOf[js.Any] },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "OwnerAccount" -> OwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "SnapshotScheduleIdentifier" -> SnapshotScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreFromClusterSnapshotResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RestoreFromClusterSnapshotResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): RestoreFromClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromClusterSnapshotResult]
    }
  }

  /**
   * <p>Describes the status of a cluster restore action. Returns null if the cluster was not created by restoring a snapshot.</p>
   */
  @js.native
  trait RestoreStatus extends js.Object {
    var ElapsedTimeInSeconds: js.UndefOr[Double]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[Double]
    var ProgressInMegaBytes: js.UndefOr[Double]
    var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double]
    var SnapshotSizeInMegaBytes: js.UndefOr[Double]
    var Status: js.UndefOr[String]
  }

  object RestoreStatus {
    def apply(
      ElapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
      EstimatedTimeToCompletionInSeconds: js.UndefOr[Double] = js.undefined,
      ProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
      CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
      SnapshotSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): RestoreStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x => x.asInstanceOf[js.Any] },
        "ProgressInMegaBytes" -> ProgressInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "CurrentRestoreRateInMegaBytesPerSecond" -> CurrentRestoreRateInMegaBytesPerSecond.map { x => x.asInstanceOf[js.Any] },
        "SnapshotSizeInMegaBytes" -> SnapshotSizeInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreStatus]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RestoreTableFromClusterSnapshotMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var TargetDatabaseName: js.UndefOr[String]
    var SourceDatabaseName: js.UndefOr[String]
    var TargetSchemaName: js.UndefOr[String]
    var SourceSchemaName: js.UndefOr[String]
    var SourceTableName: js.UndefOr[String]
    var NewTableName: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  object RestoreTableFromClusterSnapshotMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      TargetDatabaseName: js.UndefOr[String] = js.undefined,
      SourceDatabaseName: js.UndefOr[String] = js.undefined,
      TargetSchemaName: js.UndefOr[String] = js.undefined,
      SourceSchemaName: js.UndefOr[String] = js.undefined,
      SourceTableName: js.UndefOr[String] = js.undefined,
      NewTableName: js.UndefOr[String] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined): RestoreTableFromClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDatabaseName" -> TargetDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "SourceDatabaseName" -> SourceDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "TargetSchemaName" -> TargetSchemaName.map { x => x.asInstanceOf[js.Any] },
        "SourceSchemaName" -> SourceSchemaName.map { x => x.asInstanceOf[js.Any] },
        "SourceTableName" -> SourceTableName.map { x => x.asInstanceOf[js.Any] },
        "NewTableName" -> NewTableName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreTableFromClusterSnapshotResult extends js.Object {
    var TableRestoreStatus: js.UndefOr[TableRestoreStatus]
  }

  object RestoreTableFromClusterSnapshotResult {
    def apply(
      TableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined): RestoreTableFromClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableRestoreStatus" -> TableRestoreStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromClusterSnapshotResult]
    }
  }

  /**
   * <p>Describes a <code>RevisionTarget</code>.</p>
   */
  @js.native
  trait RevisionTarget extends js.Object {
    var DatabaseRevision: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp]
  }

  object RevisionTarget {
    def apply(
      DatabaseRevision: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined): RevisionTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseRevision" -> DatabaseRevision.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DatabaseRevisionReleaseDate" -> DatabaseRevisionReleaseDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionTarget]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeClusterSecurityGroupIngressMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeClusterSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "CIDRIP" -> CIDRIP.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object RevokeClusterSecurityGroupIngressResult {
    def apply(
      ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined): RevokeClusterSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroup" -> ClusterSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeClusterSecurityGroupIngressResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RevokeSnapshotAccessMessage extends js.Object {
    var SnapshotIdentifier: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var AccountWithRestoreAccess: js.UndefOr[String]
  }

  object RevokeSnapshotAccessMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      AccountWithRestoreAccess: js.UndefOr[String] = js.undefined): RevokeSnapshotAccessMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AccountWithRestoreAccess" -> AccountWithRestoreAccess.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSnapshotAccessMessage]
    }
  }

  @js.native
  trait RevokeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object RevokeSnapshotAccessResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): RevokeSnapshotAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSnapshotAccessResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RotateEncryptionKeyMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
  }

  object RotateEncryptionKeyMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined): RotateEncryptionKeyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateEncryptionKeyMessage]
    }
  }

  @js.native
  trait RotateEncryptionKeyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RotateEncryptionKeyResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): RotateEncryptionKeyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateEncryptionKeyResult]
    }
  }

  object ScheduleStateEnum {
    val MODIFYING = "MODIFYING"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"

    val values = IndexedSeq(MODIFYING, ACTIVE, FAILED)
  }

  /**
   * <p>Describes a snapshot.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var SnapshotRetentionStartTime: js.UndefOr[TStamp]
    var EstimatedSecondsToCompletion: js.UndefOr[Double]
    var SourceRegion: js.UndefOr[String]
    var ElapsedTimeInSeconds: js.UndefOr[Double]
    var MaintenanceTrackName: js.UndefOr[String]
    var ClusterIdentifier: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double]
    var ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double]
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double]
    var ClusterVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var SnapshotType: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var BackupProgressInMegaBytes: js.UndefOr[Double]
    var Encrypted: js.UndefOr[Boolean]
    var EnhancedVpcRouting: js.UndefOr[Boolean]
    var AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList]
    var Port: js.UndefOr[Int]
    var NumberOfNodes: js.UndefOr[Int]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var EncryptedWithHSM: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
    var ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional]
    var OwnerAccount: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object Snapshot {
    def apply(
      SnapshotRetentionStartTime: js.UndefOr[TStamp] = js.undefined,
      EstimatedSecondsToCompletion: js.UndefOr[Double] = js.undefined,
      SourceRegion: js.UndefOr[String] = js.undefined,
      ElapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
      ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
      TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      BackupProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
      AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined,
      NumberOfNodes: js.UndefOr[Int] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      EncryptedWithHSM: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.undefined,
      OwnerAccount: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotRetentionStartTime" -> SnapshotRetentionStartTime.map { x => x.asInstanceOf[js.Any] },
        "EstimatedSecondsToCompletion" -> EstimatedSecondsToCompletion.map { x => x.asInstanceOf[js.Any] },
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "CurrentBackupRateInMegaBytesPerSecond" -> CurrentBackupRateInMegaBytesPerSecond.map { x => x.asInstanceOf[js.Any] },
        "ActualIncrementalBackupSizeInMegaBytes" -> ActualIncrementalBackupSizeInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "TotalBackupSizeInMegaBytes" -> TotalBackupSizeInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "ClusterVersion" -> ClusterVersion.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "RestorableNodeTypes" -> RestorableNodeTypes.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "BackupProgressInMegaBytes" -> BackupProgressInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x => x.asInstanceOf[js.Any] },
        "AccountsWithRestoreAccess" -> AccountsWithRestoreAccess.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "NumberOfNodes" -> NumberOfNodes.map { x => x.asInstanceOf[js.Any] },
        "ClusterCreateTime" -> ClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "EncryptedWithHSM" -> EncryptedWithHSM.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ManualSnapshotRemainingDays" -> ManualSnapshotRemainingDays.map { x => x.asInstanceOf[js.Any] },
        "OwnerAccount" -> OwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  object SnapshotAttributeToSortByEnum {
    val SOURCE_TYPE = "SOURCE_TYPE"
    val TOTAL_SIZE = "TOTAL_SIZE"
    val CREATE_TIME = "CREATE_TIME"

    val values = IndexedSeq(SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME)
  }

  /**
   * <p>The snapshot copy grant that grants Amazon Redshift permission to encrypt copied snapshots with the specified customer master key (CMK) from AWS KMS in the destination region.</p> <p> For more information about managing snapshot copy grants, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait SnapshotCopyGrant extends js.Object {
    var SnapshotCopyGrantName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object SnapshotCopyGrant {
    def apply(
      SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): SnapshotCopyGrant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotCopyGrant]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SnapshotCopyGrantMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList]
  }

  object SnapshotCopyGrantMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.undefined): SnapshotCopyGrantMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCopyGrants" -> SnapshotCopyGrants.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotCopyGrantMessage]
    }
  }

  /**
   * <p>Describes the errors returned by a snapshot.</p>
   */
  @js.native
  trait SnapshotErrorMessage extends js.Object {
    var SnapshotIdentifier: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var FailureCode: js.UndefOr[String]
    var FailureReason: js.UndefOr[String]
  }

  object SnapshotErrorMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      FailureCode: js.UndefOr[String] = js.undefined,
      FailureReason: js.UndefOr[String] = js.undefined): SnapshotErrorMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "FailureCode" -> FailureCode.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotErrorMessage]
    }
  }

  /**
   * <p>Contains the output from the <a>DescribeClusterSnapshots</a> action. </p>
   */
  @js.native
  trait SnapshotMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  object SnapshotMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Snapshots: js.UndefOr[SnapshotList] = js.undefined): SnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Snapshots" -> Snapshots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotMessage]
    }
  }

  /**
   * <p>Describes a snapshot schedule. You can set a regular interval for creating snapshots of a cluster. You can also schedule snapshots for specific dates. </p>
   */
  @js.native
  trait SnapshotSchedule extends js.Object {
    var ScheduleIdentifier: js.UndefOr[String]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList]
    var ScheduleDescription: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object SnapshotSchedule {
    def apply(
      ScheduleIdentifier: js.UndefOr[String] = js.undefined,
      ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined,
      NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.undefined,
      ScheduleDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): SnapshotSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ScheduleDefinitions" -> ScheduleDefinitions.map { x => x.asInstanceOf[js.Any] },
        "NextInvocations" -> NextInvocations.map { x => x.asInstanceOf[js.Any] },
        "ScheduleDescription" -> ScheduleDescription.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotSchedule]
    }
  }

  /**
   * <p>Describes a sorting entity</p>
   */
  @js.native
  trait SnapshotSortingEntity extends js.Object {
    var Attribute: js.UndefOr[SnapshotAttributeToSortBy]
    var SortOrder: js.UndefOr[SortByOrder]
  }

  object SnapshotSortingEntity {
    def apply(
      Attribute: js.UndefOr[SnapshotAttributeToSortBy] = js.undefined,
      SortOrder: js.UndefOr[SortByOrder] = js.undefined): SnapshotSortingEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotSortingEntity]
    }
  }

  object SortByOrderEnum {
    val ASC = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }

  object SourceTypeEnum {
    val cluster = "cluster"
    val `cluster-parameter-group` = "cluster-parameter-group"
    val `cluster-security-group` = "cluster-security-group"
    val `cluster-snapshot` = "cluster-snapshot"

    val values = IndexedSeq(cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`)
  }

  /**
   * <p>Describes a subnet.</p>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      SubnetStatus: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubnetStatus" -> SubnetStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p>Describes the operations that are allowed on a maintenance track.</p>
   */
  @js.native
  trait SupportedOperation extends js.Object {
    var OperationName: js.UndefOr[String]
  }

  object SupportedOperation {
    def apply(
      OperationName: js.UndefOr[String] = js.undefined): SupportedOperation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationName" -> OperationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedOperation]
    }
  }

  /**
   * <p>A list of supported platforms for orderable clusters.</p>
   */
  @js.native
  trait SupportedPlatform extends js.Object {
    var Name: js.UndefOr[String]
  }

  object SupportedPlatform {
    def apply(
      Name: js.UndefOr[String] = js.undefined): SupportedPlatform = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedPlatform]
    }
  }

  /**
   * <p>Describes the status of a <a>RestoreTableFromClusterSnapshot</a> operation.</p>
   */
  @js.native
  trait TableRestoreStatus extends js.Object {
    var RequestTime: js.UndefOr[TStamp]
    var ClusterIdentifier: js.UndefOr[String]
    var TargetDatabaseName: js.UndefOr[String]
    var SourceDatabaseName: js.UndefOr[String]
    var TargetSchemaName: js.UndefOr[String]
    var TableRestoreRequestId: js.UndefOr[String]
    var ProgressInMegaBytes: js.UndefOr[LongOptional]
    var SourceSchemaName: js.UndefOr[String]
    var SourceTableName: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var TotalDataInMegaBytes: js.UndefOr[LongOptional]
    var NewTableName: js.UndefOr[String]
    var Status: js.UndefOr[TableRestoreStatusType]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  object TableRestoreStatus {
    def apply(
      RequestTime: js.UndefOr[TStamp] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      TargetDatabaseName: js.UndefOr[String] = js.undefined,
      SourceDatabaseName: js.UndefOr[String] = js.undefined,
      TargetSchemaName: js.UndefOr[String] = js.undefined,
      TableRestoreRequestId: js.UndefOr[String] = js.undefined,
      ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
      SourceSchemaName: js.UndefOr[String] = js.undefined,
      SourceTableName: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
      NewTableName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[TableRestoreStatusType] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined): TableRestoreStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestTime" -> RequestTime.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDatabaseName" -> TargetDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "SourceDatabaseName" -> SourceDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "TargetSchemaName" -> TargetSchemaName.map { x => x.asInstanceOf[js.Any] },
        "TableRestoreRequestId" -> TableRestoreRequestId.map { x => x.asInstanceOf[js.Any] },
        "ProgressInMegaBytes" -> ProgressInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "SourceSchemaName" -> SourceSchemaName.map { x => x.asInstanceOf[js.Any] },
        "SourceTableName" -> SourceTableName.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "TotalDataInMegaBytes" -> TotalDataInMegaBytes.map { x => x.asInstanceOf[js.Any] },
        "NewTableName" -> NewTableName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableRestoreStatus]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TableRestoreStatusMessage extends js.Object {
    var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList]
    var Marker: js.UndefOr[String]
  }

  object TableRestoreStatusMessage {
    def apply(
      TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): TableRestoreStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableRestoreStatusDetails" -> TableRestoreStatusDetails.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableRestoreStatusMessage]
    }
  }

  object TableRestoreStatusTypeEnum {
    val PENDING = "PENDING"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val CANCELED = "CANCELED"

    val values = IndexedSeq(PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
  }

  /**
   * <p>A tag consisting of a name/value pair for a resource.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>A tag and its associated resource.</p>
   */
  @js.native
  trait TaggedResource extends js.Object {
    var Tag: js.UndefOr[Tag]
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
  }

  object TaggedResource {
    def apply(
      Tag: js.UndefOr[Tag] = js.undefined,
      ResourceName: js.UndefOr[String] = js.undefined,
      ResourceType: js.UndefOr[String] = js.undefined): TaggedResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tag" -> Tag.map { x => x.asInstanceOf[js.Any] },
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaggedResource]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TaggedResourceListMessage extends js.Object {
    var TaggedResources: js.UndefOr[TaggedResourceList]
    var Marker: js.UndefOr[String]
  }

  object TaggedResourceListMessage {
    def apply(
      TaggedResources: js.UndefOr[TaggedResourceList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): TaggedResourceListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaggedResources" -> TaggedResources.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaggedResourceListMessage]
    }
  }

  @js.native
  trait TrackListMessage extends js.Object {
    var MaintenanceTracks: js.UndefOr[TrackList]
    var Marker: js.UndefOr[String]
  }

  object TrackListMessage {
    def apply(
      MaintenanceTracks: js.UndefOr[TrackList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): TrackListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaintenanceTracks" -> MaintenanceTracks.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrackListMessage]
    }
  }

  /**
   * <p>A maintenance track that you can switch the current track to.</p>
   */
  @js.native
  trait UpdateTarget extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var DatabaseVersion: js.UndefOr[String]
    var SupportedOperations: js.UndefOr[SupportedOperationList]
  }

  object UpdateTarget {
    def apply(
      MaintenanceTrackName: js.UndefOr[String] = js.undefined,
      DatabaseVersion: js.UndefOr[String] = js.undefined,
      SupportedOperations: js.UndefOr[SupportedOperationList] = js.undefined): UpdateTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseVersion" -> DatabaseVersion.map { x => x.asInstanceOf[js.Any] },
        "SupportedOperations" -> SupportedOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTarget]
    }
  }

  /**
   * <p>Describes the members of a VPC security group.</p>
   */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var VpcSecurityGroupId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    def apply(
      VpcSecurityGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcSecurityGroupId" -> VpcSecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}