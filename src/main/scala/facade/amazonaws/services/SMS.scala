package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sms {
  type AmiId = String
  type AppDescription = String
  type AppId = String
  type AppIds = js.Array[AppId]
  type AppLaunchStatus = String
  type AppLaunchStatusMessage = String
  type AppName = String
  type AppReplicationStatus = String
  type AppReplicationStatusMessage = String
  type AppStatus = String
  type AppStatusMessage = String
  type Apps = js.Array[AppSummary]
  type AssociatePublicIpAddress = Boolean
  type BucketName = String
  type ClientToken = String
  type ConnectorCapability = String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = String
  type ConnectorList = js.Array[Connector]
  type ConnectorStatus = String
  type ConnectorVersion = String
  type Description = String
  type EC2KeyName = String
  type Encrypted = Boolean
  type ForceStopAppReplication = Boolean
  type ForceTerminateApp = Boolean
  type Frequency = Int
  type InstanceType = String
  type IpAddress = String
  type KeyName = String
  type KmsKeyId = String
  type LaunchOrder = Int
  type LicenseType = String
  type LogicalId = String
  type MacAddress = String
  type MaxResults = Int
  type NextToken = String
  type NumberOfRecentAmisToKeep = Int
  type OutputFormat = String
  type ReplicationJobId = String
  type ReplicationJobList = js.Array[ReplicationJob]
  type ReplicationJobState = String
  type ReplicationJobStatusMessage = String
  type ReplicationJobTerminated = Boolean
  type ReplicationRunId = String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunStage = String
  type ReplicationRunStageProgress = String
  type ReplicationRunState = String
  type ReplicationRunStatusMessage = String
  type ReplicationRunType = String
  type RoleName = String
  type RunOnce = Boolean
  type SecurityGroup = String
  type ServerCatalogStatus = String
  type ServerGroupId = String
  type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName = String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroups = js.Array[ServerGroup]
  type ServerId = String
  type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]
  type ServerList = js.Array[Server]
  type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]
  type ServerType = String
  type StackId = String
  type StackName = String
  type Subnet = String
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type Timestamp = js.Date
  type TotalServerGroups = Int
  type TotalServers = Int
  type VPC = String
  type VmId = String
  type VmManagerId = String
  type VmManagerName = String
  type VmManagerType = String
  type VmName = String
  type VmPath = String
  type VmServerAddressList = js.Array[VmServerAddress]
}

package sms {
  @js.native
  @JSImport("aws-sdk", "SMS")
  class SMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResponse] = js.native
    def createReplicationJob(params: CreateReplicationJobRequest): Request[CreateReplicationJobResponse] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse] = js.native
    def deleteAppLaunchConfiguration(params: DeleteAppLaunchConfigurationRequest): Request[DeleteAppLaunchConfigurationResponse] = js.native
    def deleteAppReplicationConfiguration(params: DeleteAppReplicationConfigurationRequest): Request[DeleteAppReplicationConfigurationResponse] = js.native
    def deleteReplicationJob(params: DeleteReplicationJobRequest): Request[DeleteReplicationJobResponse] = js.native
    def deleteServerCatalog(params: DeleteServerCatalogRequest): Request[DeleteServerCatalogResponse] = js.native
    def disassociateConnector(params: DisassociateConnectorRequest): Request[DisassociateConnectorResponse] = js.native
    def generateChangeSet(params: GenerateChangeSetRequest): Request[GenerateChangeSetResponse] = js.native
    def generateTemplate(params: GenerateTemplateRequest): Request[GenerateTemplateResponse] = js.native
    def getApp(params: GetAppRequest): Request[GetAppResponse] = js.native
    def getAppLaunchConfiguration(params: GetAppLaunchConfigurationRequest): Request[GetAppLaunchConfigurationResponse] = js.native
    def getAppReplicationConfiguration(params: GetAppReplicationConfigurationRequest): Request[GetAppReplicationConfigurationResponse] = js.native
    def getConnectors(params: GetConnectorsRequest): Request[GetConnectorsResponse] = js.native
    def getReplicationJobs(params: GetReplicationJobsRequest): Request[GetReplicationJobsResponse] = js.native
    def getReplicationRuns(params: GetReplicationRunsRequest): Request[GetReplicationRunsResponse] = js.native
    def getServers(params: GetServersRequest): Request[GetServersResponse] = js.native
    def importServerCatalog(params: ImportServerCatalogRequest): Request[ImportServerCatalogResponse] = js.native
    def launchApp(params: LaunchAppRequest): Request[LaunchAppResponse] = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResponse] = js.native
    def putAppLaunchConfiguration(params: PutAppLaunchConfigurationRequest): Request[PutAppLaunchConfigurationResponse] = js.native
    def putAppReplicationConfiguration(params: PutAppReplicationConfigurationRequest): Request[PutAppReplicationConfigurationResponse] = js.native
    def startAppReplication(params: StartAppReplicationRequest): Request[StartAppReplicationResponse] = js.native
    def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): Request[StartOnDemandReplicationRunResponse] = js.native
    def stopAppReplication(params: StopAppReplicationRequest): Request[StopAppReplicationResponse] = js.native
    def terminateApp(params: TerminateAppRequest): Request[TerminateAppResponse] = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse] = js.native
    def updateReplicationJob(params: UpdateReplicationJobRequest): Request[UpdateReplicationJobResponse] = js.native
  }

  object AppLaunchStatusEnum {
    val READY_FOR_CONFIGURATION = "READY_FOR_CONFIGURATION"
    val CONFIGURATION_IN_PROGRESS = "CONFIGURATION_IN_PROGRESS"
    val CONFIGURATION_INVALID = "CONFIGURATION_INVALID"
    val READY_FOR_LAUNCH = "READY_FOR_LAUNCH"
    val VALIDATION_IN_PROGRESS = "VALIDATION_IN_PROGRESS"
    val LAUNCH_PENDING = "LAUNCH_PENDING"
    val LAUNCH_IN_PROGRESS = "LAUNCH_IN_PROGRESS"
    val LAUNCHED = "LAUNCHED"
    val DELTA_LAUNCH_IN_PROGRESS = "DELTA_LAUNCH_IN_PROGRESS"
    val DELTA_LAUNCH_FAILED = "DELTA_LAUNCH_FAILED"
    val LAUNCH_FAILED = "LAUNCH_FAILED"
    val TERMINATE_IN_PROGRESS = "TERMINATE_IN_PROGRESS"
    val TERMINATE_FAILED = "TERMINATE_FAILED"
    val TERMINATED = "TERMINATED"

    val values = IndexedSeq(READY_FOR_CONFIGURATION, CONFIGURATION_IN_PROGRESS, CONFIGURATION_INVALID, READY_FOR_LAUNCH, VALIDATION_IN_PROGRESS, LAUNCH_PENDING, LAUNCH_IN_PROGRESS, LAUNCHED, DELTA_LAUNCH_IN_PROGRESS, DELTA_LAUNCH_FAILED, LAUNCH_FAILED, TERMINATE_IN_PROGRESS, TERMINATE_FAILED, TERMINATED)
  }

  object AppReplicationStatusEnum {
    val READY_FOR_CONFIGURATION = "READY_FOR_CONFIGURATION"
    val CONFIGURATION_IN_PROGRESS = "CONFIGURATION_IN_PROGRESS"
    val CONFIGURATION_INVALID = "CONFIGURATION_INVALID"
    val READY_FOR_REPLICATION = "READY_FOR_REPLICATION"
    val VALIDATION_IN_PROGRESS = "VALIDATION_IN_PROGRESS"
    val REPLICATION_PENDING = "REPLICATION_PENDING"
    val REPLICATION_IN_PROGRESS = "REPLICATION_IN_PROGRESS"
    val REPLICATED = "REPLICATED"
    val DELTA_REPLICATION_IN_PROGRESS = "DELTA_REPLICATION_IN_PROGRESS"
    val DELTA_REPLICATED = "DELTA_REPLICATED"
    val DELTA_REPLICATION_FAILED = "DELTA_REPLICATION_FAILED"
    val REPLICATION_FAILED = "REPLICATION_FAILED"
    val REPLICATION_STOPPING = "REPLICATION_STOPPING"
    val REPLICATION_STOP_FAILED = "REPLICATION_STOP_FAILED"
    val REPLICATION_STOPPED = "REPLICATION_STOPPED"

    val values = IndexedSeq(READY_FOR_CONFIGURATION, CONFIGURATION_IN_PROGRESS, CONFIGURATION_INVALID, READY_FOR_REPLICATION, VALIDATION_IN_PROGRESS, REPLICATION_PENDING, REPLICATION_IN_PROGRESS, REPLICATED, DELTA_REPLICATION_IN_PROGRESS, DELTA_REPLICATED, DELTA_REPLICATION_FAILED, REPLICATION_FAILED, REPLICATION_STOPPING, REPLICATION_STOP_FAILED, REPLICATION_STOPPED)
  }

  object AppStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED = "DELETED"
    val DELETE_FAILED = "DELETE_FAILED"

    val values = IndexedSeq(CREATING, ACTIVE, UPDATING, DELETING, DELETED, DELETE_FAILED)
  }

  /**
   * Information about the application.
   */
  @js.native
  trait AppSummary extends js.Object {
    var appId: js.UndefOr[AppId]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[AppDescription]
    var lastModified: js.UndefOr[Timestamp]
    var latestReplicationTime: js.UndefOr[Timestamp]
    var launchDetails: js.UndefOr[LaunchDetails]
    var launchStatus: js.UndefOr[AppLaunchStatus]
    var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage]
    var name: js.UndefOr[AppName]
    var replicationStatus: js.UndefOr[AppReplicationStatus]
    var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage]
    var roleName: js.UndefOr[RoleName]
    var status: js.UndefOr[AppStatus]
    var statusMessage: js.UndefOr[AppStatusMessage]
    var totalServerGroups: js.UndefOr[TotalServerGroups]
    var totalServers: js.UndefOr[TotalServers]
  }

  object AppSummary {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[AppDescription] = js.undefined,
      lastModified: js.UndefOr[Timestamp] = js.undefined,
      latestReplicationTime: js.UndefOr[Timestamp] = js.undefined,
      launchDetails: js.UndefOr[LaunchDetails] = js.undefined,
      launchStatus: js.UndefOr[AppLaunchStatus] = js.undefined,
      launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.undefined,
      name: js.UndefOr[AppName] = js.undefined,
      replicationStatus: js.UndefOr[AppReplicationStatus] = js.undefined,
      replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      status: js.UndefOr[AppStatus] = js.undefined,
      statusMessage: js.UndefOr[AppStatusMessage] = js.undefined,
      totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined,
      totalServers: js.UndefOr[TotalServers] = js.undefined): AppSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "lastModified" -> lastModified.map { x => x.asInstanceOf[js.Any] },
        "latestReplicationTime" -> latestReplicationTime.map { x => x.asInstanceOf[js.Any] },
        "launchDetails" -> launchDetails.map { x => x.asInstanceOf[js.Any] },
        "launchStatus" -> launchStatus.map { x => x.asInstanceOf[js.Any] },
        "launchStatusMessage" -> launchStatusMessage.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "replicationStatus" -> replicationStatus.map { x => x.asInstanceOf[js.Any] },
        "replicationStatusMessage" -> replicationStatusMessage.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "totalServerGroups" -> totalServerGroups.map { x => x.asInstanceOf[js.Any] },
        "totalServers" -> totalServers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AppSummary]
    }
  }

  /**
   * Represents a connector.
   */
  @js.native
  trait Connector extends js.Object {
    var associatedOn: js.UndefOr[Timestamp]
    var capabilityList: js.UndefOr[ConnectorCapabilityList]
    var connectorId: js.UndefOr[ConnectorId]
    var ipAddress: js.UndefOr[IpAddress]
    var macAddress: js.UndefOr[MacAddress]
    var status: js.UndefOr[ConnectorStatus]
    var version: js.UndefOr[ConnectorVersion]
    var vmManagerId: js.UndefOr[VmManagerId]
    var vmManagerName: js.UndefOr[VmManagerName]
    var vmManagerType: js.UndefOr[VmManagerType]
  }

  object Connector {
    def apply(
      associatedOn: js.UndefOr[Timestamp] = js.undefined,
      capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined,
      connectorId: js.UndefOr[ConnectorId] = js.undefined,
      ipAddress: js.UndefOr[IpAddress] = js.undefined,
      macAddress: js.UndefOr[MacAddress] = js.undefined,
      status: js.UndefOr[ConnectorStatus] = js.undefined,
      version: js.UndefOr[ConnectorVersion] = js.undefined,
      vmManagerId: js.UndefOr[VmManagerId] = js.undefined,
      vmManagerName: js.UndefOr[VmManagerName] = js.undefined,
      vmManagerType: js.UndefOr[VmManagerType] = js.undefined): Connector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "associatedOn" -> associatedOn.map { x => x.asInstanceOf[js.Any] },
        "capabilityList" -> capabilityList.map { x => x.asInstanceOf[js.Any] },
        "connectorId" -> connectorId.map { x => x.asInstanceOf[js.Any] },
        "ipAddress" -> ipAddress.map { x => x.asInstanceOf[js.Any] },
        "macAddress" -> macAddress.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "vmManagerId" -> vmManagerId.map { x => x.asInstanceOf[js.Any] },
        "vmManagerName" -> vmManagerName.map { x => x.asInstanceOf[js.Any] },
        "vmManagerType" -> vmManagerType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connector]
    }
  }

  object ConnectorCapabilityEnum {
    val VSPHERE = "VSPHERE"
    val SCVMM = "SCVMM"
    val `HYPERV-MANAGER` = "HYPERV-MANAGER"
    val SNAPSHOT_BATCHING = "SNAPSHOT_BATCHING"

    val values = IndexedSeq(VSPHERE, SCVMM, `HYPERV-MANAGER`, SNAPSHOT_BATCHING)
  }

  object ConnectorStatusEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = IndexedSeq(HEALTHY, UNHEALTHY)
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[AppDescription]
    var name: js.UndefOr[AppName]
    var roleName: js.UndefOr[RoleName]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object CreateAppRequest {
    def apply(
      clientToken: js.UndefOr[ClientToken] = js.undefined,
      description: js.UndefOr[AppDescription] = js.undefined,
      name: js.UndefOr[AppName] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      serverGroups: js.UndefOr[ServerGroups] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): CreateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "serverGroups" -> serverGroups.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object CreateAppResponse {
    def apply(
      appSummary: js.UndefOr[AppSummary] = js.undefined,
      serverGroups: js.UndefOr[ServerGroups] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): CreateAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appSummary" -> appSummary.map { x => x.asInstanceOf[js.Any] },
        "serverGroups" -> serverGroups.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppResponse]
    }
  }

  @js.native
  trait CreateReplicationJobRequest extends js.Object {
    var seedReplicationTime: Timestamp
    var serverId: ServerId
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var roleName: js.UndefOr[RoleName]
    var runOnce: js.UndefOr[RunOnce]
  }

  object CreateReplicationJobRequest {
    def apply(
      seedReplicationTime: Timestamp,
      serverId: ServerId,
      description: js.UndefOr[Description] = js.undefined,
      encrypted: js.UndefOr[Encrypted] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      runOnce: js.UndefOr[RunOnce] = js.undefined): CreateReplicationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "seedReplicationTime" -> seedReplicationTime.asInstanceOf[js.Any],
        "serverId" -> serverId.asInstanceOf[js.Any],
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "encrypted" -> encrypted.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "numberOfRecentAmisToKeep" -> numberOfRecentAmisToKeep.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "runOnce" -> runOnce.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationJobRequest]
    }
  }

  @js.native
  trait CreateReplicationJobResponse extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object CreateReplicationJobResponse {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined): CreateReplicationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppLaunchConfigurationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): DeleteAppLaunchConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppLaunchConfigurationResponse extends js.Object {

  }

  object DeleteAppLaunchConfigurationResponse {
    def apply(): DeleteAppLaunchConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppReplicationConfigurationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): DeleteAppReplicationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppReplicationConfigurationResponse extends js.Object {

  }

  object DeleteAppReplicationConfigurationResponse {
    def apply(): DeleteAppReplicationConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppReplicationConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var forceStopAppReplication: js.UndefOr[ForceStopAppReplication]
    var forceTerminateApp: js.UndefOr[ForceTerminateApp]
  }

  object DeleteAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.undefined,
      forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.undefined): DeleteAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "forceStopAppReplication" -> forceStopAppReplication.map { x => x.asInstanceOf[js.Any] },
        "forceTerminateApp" -> forceTerminateApp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteAppResponse extends js.Object {

  }

  object DeleteAppResponse {
    def apply(): DeleteAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppResponse]
    }
  }

  @js.native
  trait DeleteReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
  }

  object DeleteReplicationJobRequest {
    def apply(
      replicationJobId: ReplicationJobId): DeleteReplicationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationJobRequest]
    }
  }

  @js.native
  trait DeleteReplicationJobResponse extends js.Object {

  }

  object DeleteReplicationJobResponse {
    def apply(): DeleteReplicationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteServerCatalogRequest extends js.Object {

  }

  object DeleteServerCatalogRequest {
    def apply(): DeleteServerCatalogRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerCatalogRequest]
    }
  }

  @js.native
  trait DeleteServerCatalogResponse extends js.Object {

  }

  object DeleteServerCatalogResponse {
    def apply(): DeleteServerCatalogResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerCatalogResponse]
    }
  }

  @js.native
  trait DisassociateConnectorRequest extends js.Object {
    var connectorId: ConnectorId
  }

  object DisassociateConnectorRequest {
    def apply(
      connectorId: ConnectorId): DisassociateConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectorId" -> connectorId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConnectorRequest]
    }
  }

  @js.native
  trait DisassociateConnectorResponse extends js.Object {

  }

  object DisassociateConnectorResponse {
    def apply(): DisassociateConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConnectorResponse]
    }
  }

  @js.native
  trait GenerateChangeSetRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var changesetFormat: js.UndefOr[OutputFormat]
  }

  object GenerateChangeSetRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      changesetFormat: js.UndefOr[OutputFormat] = js.undefined): GenerateChangeSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "changesetFormat" -> changesetFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateChangeSetRequest]
    }
  }

  @js.native
  trait GenerateChangeSetResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object GenerateChangeSetResponse {
    def apply(
      s3Location: js.UndefOr[S3Location] = js.undefined): GenerateChangeSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Location" -> s3Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateChangeSetResponse]
    }
  }

  @js.native
  trait GenerateTemplateRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var templateFormat: js.UndefOr[OutputFormat]
  }

  object GenerateTemplateRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      templateFormat: js.UndefOr[OutputFormat] = js.undefined): GenerateTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "templateFormat" -> templateFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateTemplateRequest]
    }
  }

  @js.native
  trait GenerateTemplateResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object GenerateTemplateResponse {
    def apply(
      s3Location: js.UndefOr[S3Location] = js.undefined): GenerateTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Location" -> s3Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateTemplateResponse]
    }
  }

  @js.native
  trait GetAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppLaunchConfigurationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): GetAppLaunchConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait GetAppLaunchConfigurationResponse extends js.Object {
    var appId: js.UndefOr[AppId]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  object GetAppLaunchConfigurationResponse {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined): GetAppLaunchConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "serverGroupLaunchConfigurations" -> serverGroupLaunchConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait GetAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppReplicationConfigurationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): GetAppReplicationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait GetAppReplicationConfigurationResponse extends js.Object {
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  object GetAppReplicationConfigurationResponse {
    def apply(
      serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined): GetAppReplicationConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serverGroupReplicationConfigurations" -> serverGroupReplicationConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppReplicationConfigurationResponse]
    }
  }

  @js.native
  trait GetAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): GetAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppRequest]
    }
  }

  @js.native
  trait GetAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object GetAppResponse {
    def apply(
      appSummary: js.UndefOr[AppSummary] = js.undefined,
      serverGroups: js.UndefOr[ServerGroups] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): GetAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appSummary" -> appSummary.map { x => x.asInstanceOf[js.Any] },
        "serverGroups" -> serverGroups.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppResponse]
    }
  }

  @js.native
  trait GetConnectorsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetConnectorsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetConnectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorsRequest]
    }
  }

  @js.native
  trait GetConnectorsResponse extends js.Object {
    var connectorList: js.UndefOr[ConnectorList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetConnectorsResponse {
    def apply(
      connectorList: js.UndefOr[ConnectorList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetConnectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectorList" -> connectorList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorsResponse]
    }
  }

  @js.native
  trait GetReplicationJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object GetReplicationJobsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined): GetReplicationJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationJobsRequest]
    }
  }

  @js.native
  trait GetReplicationJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJobList: js.UndefOr[ReplicationJobList]
  }

  object GetReplicationJobsResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined): GetReplicationJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "replicationJobList" -> replicationJobList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationJobsResponse]
    }
  }

  @js.native
  trait GetReplicationRunsRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetReplicationRunsRequest {
    def apply(
      replicationJobId: ReplicationJobId,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetReplicationRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationRunsRequest]
    }
  }

  @js.native
  trait GetReplicationRunsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJob: js.UndefOr[ReplicationJob]
    var replicationRunList: js.UndefOr[ReplicationRunList]
  }

  object GetReplicationRunsResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      replicationJob: js.UndefOr[ReplicationJob] = js.undefined,
      replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined): GetReplicationRunsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "replicationJob" -> replicationJob.map { x => x.asInstanceOf[js.Any] },
        "replicationRunList" -> replicationRunList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationRunsResponse]
    }
  }

  @js.native
  trait GetServersRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var vmServerAddressList: js.UndefOr[VmServerAddressList]
  }

  object GetServersRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      vmServerAddressList: js.UndefOr[VmServerAddressList] = js.undefined): GetServersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "vmServerAddressList" -> vmServerAddressList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServersRequest]
    }
  }

  @js.native
  trait GetServersResponse extends js.Object {
    var lastModifiedOn: js.UndefOr[Timestamp]
    var nextToken: js.UndefOr[NextToken]
    var serverCatalogStatus: js.UndefOr[ServerCatalogStatus]
    var serverList: js.UndefOr[ServerList]
  }

  object GetServersResponse {
    def apply(
      lastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined,
      serverList: js.UndefOr[ServerList] = js.undefined): GetServersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastModifiedOn" -> lastModifiedOn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "serverCatalogStatus" -> serverCatalogStatus.map { x => x.asInstanceOf[js.Any] },
        "serverList" -> serverList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServersResponse]
    }
  }

  @js.native
  trait ImportServerCatalogRequest extends js.Object {

  }

  object ImportServerCatalogRequest {
    def apply(): ImportServerCatalogRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportServerCatalogRequest]
    }
  }

  @js.native
  trait ImportServerCatalogResponse extends js.Object {

  }

  object ImportServerCatalogResponse {
    def apply(): ImportServerCatalogResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportServerCatalogResponse]
    }
  }

  @js.native
  trait LaunchAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object LaunchAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): LaunchAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchAppRequest]
    }
  }

  @js.native
  trait LaunchAppResponse extends js.Object {

  }

  object LaunchAppResponse {
    def apply(): LaunchAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchAppResponse]
    }
  }

  /**
   * Details about the latest launch of an application.
   */
  @js.native
  trait LaunchDetails extends js.Object {
    var latestLaunchTime: js.UndefOr[Timestamp]
    var stackId: js.UndefOr[StackId]
    var stackName: js.UndefOr[StackName]
  }

  object LaunchDetails {
    def apply(
      latestLaunchTime: js.UndefOr[Timestamp] = js.undefined,
      stackId: js.UndefOr[StackId] = js.undefined,
      stackName: js.UndefOr[StackName] = js.undefined): LaunchDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "latestLaunchTime" -> latestLaunchTime.map { x => x.asInstanceOf[js.Any] },
        "stackId" -> stackId.map { x => x.asInstanceOf[js.Any] },
        "stackName" -> stackName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchDetails]
    }
  }

  object LicenseTypeEnum {
    val AWS = "AWS"
    val BYOL = "BYOL"

    val values = IndexedSeq(AWS, BYOL)
  }

  @js.native
  trait ListAppsRequest extends js.Object {
    var appIds: js.UndefOr[AppIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsRequest {
    def apply(
      appIds: js.UndefOr[AppIds] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListAppsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appIds" -> appIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppsRequest]
    }
  }

  @js.native
  trait ListAppsResponse extends js.Object {
    var apps: js.UndefOr[Apps]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResponse {
    def apply(
      apps: js.UndefOr[Apps] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListAppsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apps" -> apps.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppsResponse]
    }
  }

  object OutputFormatEnum {
    val JSON = "JSON"
    val YAML = "YAML"

    val values = IndexedSeq(JSON, YAML)
  }

  @js.native
  trait PutAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  object PutAppLaunchConfigurationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined): PutAppLaunchConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "serverGroupLaunchConfigurations" -> serverGroupLaunchConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait PutAppLaunchConfigurationResponse extends js.Object {

  }

  object PutAppLaunchConfigurationResponse {
    def apply(): PutAppLaunchConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait PutAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  object PutAppReplicationConfigurationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined): PutAppReplicationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "serverGroupReplicationConfigurations" -> serverGroupReplicationConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait PutAppReplicationConfigurationResponse extends js.Object {

  }

  object PutAppReplicationConfigurationResponse {
    def apply(): PutAppReplicationConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAppReplicationConfigurationResponse]
    }
  }

  /**
   * Represents a replication job.
   */
  @js.native
  trait ReplicationJob extends js.Object {
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var latestAmiId: js.UndefOr[AmiId]
    var licenseType: js.UndefOr[LicenseType]
    var nextReplicationRunStartTime: js.UndefOr[Timestamp]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var replicationRunList: js.UndefOr[ReplicationRunList]
    var roleName: js.UndefOr[RoleName]
    var runOnce: js.UndefOr[RunOnce]
    var seedReplicationTime: js.UndefOr[Timestamp]
    var serverId: js.UndefOr[ServerId]
    var serverType: js.UndefOr[ServerType]
    var state: js.UndefOr[ReplicationJobState]
    var statusMessage: js.UndefOr[ReplicationJobStatusMessage]
    var vmServer: js.UndefOr[VmServer]
  }

  object ReplicationJob {
    def apply(
      description: js.UndefOr[Description] = js.undefined,
      encrypted: js.UndefOr[Encrypted] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      latestAmiId: js.UndefOr[AmiId] = js.undefined,
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined,
      numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      runOnce: js.UndefOr[RunOnce] = js.undefined,
      seedReplicationTime: js.UndefOr[Timestamp] = js.undefined,
      serverId: js.UndefOr[ServerId] = js.undefined,
      serverType: js.UndefOr[ServerType] = js.undefined,
      state: js.UndefOr[ReplicationJobState] = js.undefined,
      statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined,
      vmServer: js.UndefOr[VmServer] = js.undefined): ReplicationJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "encrypted" -> encrypted.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "latestAmiId" -> latestAmiId.map { x => x.asInstanceOf[js.Any] },
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "nextReplicationRunStartTime" -> nextReplicationRunStartTime.map { x => x.asInstanceOf[js.Any] },
        "numberOfRecentAmisToKeep" -> numberOfRecentAmisToKeep.map { x => x.asInstanceOf[js.Any] },
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "replicationRunList" -> replicationRunList.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "runOnce" -> runOnce.map { x => x.asInstanceOf[js.Any] },
        "seedReplicationTime" -> seedReplicationTime.map { x => x.asInstanceOf[js.Any] },
        "serverId" -> serverId.map { x => x.asInstanceOf[js.Any] },
        "serverType" -> serverType.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "vmServer" -> vmServer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationJob]
    }
  }

  object ReplicationJobStateEnum {
    val PENDING = "PENDING"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"
    val DELETING = "DELETING"
    val DELETED = "DELETED"
    val COMPLETED = "COMPLETED"
    val PAUSED_ON_FAILURE = "PAUSED_ON_FAILURE"
    val FAILING = "FAILING"

    val values = IndexedSeq(PENDING, ACTIVE, FAILED, DELETING, DELETED, COMPLETED, PAUSED_ON_FAILURE, FAILING)
  }

  /**
   * Represents a replication run.
   */
  @js.native
  trait ReplicationRun extends js.Object {
    var amiId: js.UndefOr[AmiId]
    var completedTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var replicationRunId: js.UndefOr[ReplicationRunId]
    var scheduledStartTime: js.UndefOr[Timestamp]
    var stageDetails: js.UndefOr[ReplicationRunStageDetails]
    var state: js.UndefOr[ReplicationRunState]
    var statusMessage: js.UndefOr[ReplicationRunStatusMessage]
    var `type`: js.UndefOr[ReplicationRunType]
  }

  object ReplicationRun {
    def apply(
      amiId: js.UndefOr[AmiId] = js.undefined,
      completedTime: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      encrypted: js.UndefOr[Encrypted] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined,
      scheduledStartTime: js.UndefOr[Timestamp] = js.undefined,
      stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.undefined,
      state: js.UndefOr[ReplicationRunState] = js.undefined,
      statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined,
      `type`: js.UndefOr[ReplicationRunType] = js.undefined): ReplicationRun = {
      val _fields = IndexedSeq[(String, js.Any)](
        "amiId" -> amiId.map { x => x.asInstanceOf[js.Any] },
        "completedTime" -> completedTime.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "encrypted" -> encrypted.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "replicationRunId" -> replicationRunId.map { x => x.asInstanceOf[js.Any] },
        "scheduledStartTime" -> scheduledStartTime.map { x => x.asInstanceOf[js.Any] },
        "stageDetails" -> stageDetails.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRun]
    }
  }

  /**
   * Details of the current stage of a replication run.
   */
  @js.native
  trait ReplicationRunStageDetails extends js.Object {
    var stage: js.UndefOr[ReplicationRunStage]
    var stageProgress: js.UndefOr[ReplicationRunStageProgress]
  }

  object ReplicationRunStageDetails {
    def apply(
      stage: js.UndefOr[ReplicationRunStage] = js.undefined,
      stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.undefined): ReplicationRunStageDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] },
        "stageProgress" -> stageProgress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRunStageDetails]
    }
  }

  object ReplicationRunStateEnum {
    val PENDING = "PENDING"
    val MISSED = "MISSED"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"
    val COMPLETED = "COMPLETED"
    val DELETING = "DELETING"
    val DELETED = "DELETED"

    val values = IndexedSeq(PENDING, MISSED, ACTIVE, FAILED, COMPLETED, DELETING, DELETED)
  }

  object ReplicationRunTypeEnum {
    val ON_DEMAND = "ON_DEMAND"
    val AUTOMATIC = "AUTOMATIC"

    val values = IndexedSeq(ON_DEMAND, AUTOMATIC)
  }

  /**
   * Location of the Amazon S3 object in the customer's account.
   */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var key: js.UndefOr[KeyName]
  }

  object S3Location {
    def apply(
      bucket: js.UndefOr[BucketName] = js.undefined,
      key: js.UndefOr[KeyName] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucket" -> bucket.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  /**
   * Represents a server.
   */
  @js.native
  trait Server extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated]
    var serverId: js.UndefOr[ServerId]
    var serverType: js.UndefOr[ServerType]
    var vmServer: js.UndefOr[VmServer]
  }

  object Server {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined,
      serverId: js.UndefOr[ServerId] = js.undefined,
      serverType: js.UndefOr[ServerType] = js.undefined,
      vmServer: js.UndefOr[VmServer] = js.undefined): Server = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "replicationJobTerminated" -> replicationJobTerminated.map { x => x.asInstanceOf[js.Any] },
        "serverId" -> serverId.map { x => x.asInstanceOf[js.Any] },
        "serverType" -> serverType.map { x => x.asInstanceOf[js.Any] },
        "vmServer" -> vmServer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Server]
    }
  }

  object ServerCatalogStatusEnum {
    val NOT_IMPORTED = "NOT_IMPORTED"
    val IMPORTING = "IMPORTING"
    val AVAILABLE = "AVAILABLE"
    val DELETED = "DELETED"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(NOT_IMPORTED, IMPORTING, AVAILABLE, DELETED, EXPIRED)
  }

  /**
   * A logical grouping of servers.
   */
  @js.native
  trait ServerGroup extends js.Object {
    var name: js.UndefOr[ServerGroupName]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverList: js.UndefOr[ServerList]
  }

  object ServerGroup {
    def apply(
      name: js.UndefOr[ServerGroupName] = js.undefined,
      serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
      serverList: js.UndefOr[ServerList] = js.undefined): ServerGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "serverGroupId" -> serverGroupId.map { x => x.asInstanceOf[js.Any] },
        "serverList" -> serverList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerGroup]
    }
  }

  /**
   * Launch configuration for a server group.
   */
  @js.native
  trait ServerGroupLaunchConfiguration extends js.Object {
    var launchOrder: js.UndefOr[LaunchOrder]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations]
  }

  object ServerGroupLaunchConfiguration {
    def apply(
      launchOrder: js.UndefOr[LaunchOrder] = js.undefined,
      serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
      serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.undefined): ServerGroupLaunchConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "launchOrder" -> launchOrder.map { x => x.asInstanceOf[js.Any] },
        "serverGroupId" -> serverGroupId.map { x => x.asInstanceOf[js.Any] },
        "serverLaunchConfigurations" -> serverLaunchConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerGroupLaunchConfiguration]
    }
  }

  /**
   * Replication configuration for a server group.
   */
  @js.native
  trait ServerGroupReplicationConfiguration extends js.Object {
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations]
  }

  object ServerGroupReplicationConfiguration {
    def apply(
      serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
      serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.undefined): ServerGroupReplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serverGroupId" -> serverGroupId.map { x => x.asInstanceOf[js.Any] },
        "serverReplicationConfigurations" -> serverReplicationConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerGroupReplicationConfiguration]
    }
  }

  /**
   * Launch configuration for a server.
   */
  @js.native
  trait ServerLaunchConfiguration extends js.Object {
    var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress]
    var ec2KeyName: js.UndefOr[EC2KeyName]
    var instanceType: js.UndefOr[InstanceType]
    var logicalId: js.UndefOr[LogicalId]
    var securityGroup: js.UndefOr[SecurityGroup]
    var server: js.UndefOr[Server]
    var subnet: js.UndefOr[Subnet]
    var userData: js.UndefOr[UserData]
    var vpc: js.UndefOr[VPC]
  }

  object ServerLaunchConfiguration {
    def apply(
      associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
      ec2KeyName: js.UndefOr[EC2KeyName] = js.undefined,
      instanceType: js.UndefOr[InstanceType] = js.undefined,
      logicalId: js.UndefOr[LogicalId] = js.undefined,
      securityGroup: js.UndefOr[SecurityGroup] = js.undefined,
      server: js.UndefOr[Server] = js.undefined,
      subnet: js.UndefOr[Subnet] = js.undefined,
      userData: js.UndefOr[UserData] = js.undefined,
      vpc: js.UndefOr[VPC] = js.undefined): ServerLaunchConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "associatePublicIpAddress" -> associatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "ec2KeyName" -> ec2KeyName.map { x => x.asInstanceOf[js.Any] },
        "instanceType" -> instanceType.map { x => x.asInstanceOf[js.Any] },
        "logicalId" -> logicalId.map { x => x.asInstanceOf[js.Any] },
        "securityGroup" -> securityGroup.map { x => x.asInstanceOf[js.Any] },
        "server" -> server.map { x => x.asInstanceOf[js.Any] },
        "subnet" -> subnet.map { x => x.asInstanceOf[js.Any] },
        "userData" -> userData.map { x => x.asInstanceOf[js.Any] },
        "vpc" -> vpc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerLaunchConfiguration]
    }
  }

  /**
   * Replication configuration of a server.
   */
  @js.native
  trait ServerReplicationConfiguration extends js.Object {
    var server: js.UndefOr[Server]
    var serverReplicationParameters: js.UndefOr[ServerReplicationParameters]
  }

  object ServerReplicationConfiguration {
    def apply(
      server: js.UndefOr[Server] = js.undefined,
      serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.undefined): ServerReplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "server" -> server.map { x => x.asInstanceOf[js.Any] },
        "serverReplicationParameters" -> serverReplicationParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerReplicationConfiguration]
    }
  }

  /**
   * Replication parameters for replicating a server.
   */
  @js.native
  trait ServerReplicationParameters extends js.Object {
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var runOnce: js.UndefOr[RunOnce]
    var seedTime: js.UndefOr[Timestamp]
  }

  object ServerReplicationParameters {
    def apply(
      encrypted: js.UndefOr[Encrypted] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
      runOnce: js.UndefOr[RunOnce] = js.undefined,
      seedTime: js.UndefOr[Timestamp] = js.undefined): ServerReplicationParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "encrypted" -> encrypted.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "numberOfRecentAmisToKeep" -> numberOfRecentAmisToKeep.map { x => x.asInstanceOf[js.Any] },
        "runOnce" -> runOnce.map { x => x.asInstanceOf[js.Any] },
        "seedTime" -> seedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerReplicationParameters]
    }
  }

  object ServerTypeEnum {
    val VIRTUAL_MACHINE = "VIRTUAL_MACHINE"

    val values = IndexedSeq(VIRTUAL_MACHINE)
  }

  @js.native
  trait StartAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object StartAppReplicationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): StartAppReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAppReplicationRequest]
    }
  }

  @js.native
  trait StartAppReplicationResponse extends js.Object {

  }

  object StartAppReplicationResponse {
    def apply(): StartAppReplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAppReplicationResponse]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var description: js.UndefOr[Description]
  }

  object StartOnDemandReplicationRunRequest {
    def apply(
      replicationJobId: ReplicationJobId,
      description: js.UndefOr[Description] = js.undefined): StartOnDemandReplicationRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any],
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandReplicationRunRequest]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunResponse extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId]
  }

  object StartOnDemandReplicationRunResponse {
    def apply(
      replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined): StartOnDemandReplicationRunResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationRunId" -> replicationRunId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandReplicationRunResponse]
    }
  }

  @js.native
  trait StopAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object StopAppReplicationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): StopAppReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAppReplicationRequest]
    }
  }

  @js.native
  trait StopAppReplicationResponse extends js.Object {

  }

  object StopAppReplicationResponse {
    def apply(): StopAppReplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAppReplicationResponse]
    }
  }

  /**
   * A label that can be assigned to an application.
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
  trait TerminateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object TerminateAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): TerminateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateAppRequest]
    }
  }

  @js.native
  trait TerminateAppResponse extends js.Object {

  }

  object TerminateAppResponse {
    def apply(): TerminateAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateAppResponse]
    }
  }

  @js.native
  trait UpdateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var description: js.UndefOr[AppDescription]
    var name: js.UndefOr[AppName]
    var roleName: js.UndefOr[RoleName]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object UpdateAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      description: js.UndefOr[AppDescription] = js.undefined,
      name: js.UndefOr[AppName] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      serverGroups: js.UndefOr[ServerGroups] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): UpdateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "serverGroups" -> serverGroups.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppRequest]
    }
  }

  @js.native
  trait UpdateAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object UpdateAppResponse {
    def apply(
      appSummary: js.UndefOr[AppSummary] = js.undefined,
      serverGroups: js.UndefOr[ServerGroups] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): UpdateAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appSummary" -> appSummary.map { x => x.asInstanceOf[js.Any] },
        "serverGroups" -> serverGroups.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppResponse]
    }
  }

  @js.native
  trait UpdateReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var nextReplicationRunStartTime: js.UndefOr[Timestamp]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var roleName: js.UndefOr[RoleName]
  }

  object UpdateReplicationJobRequest {
    def apply(
      replicationJobId: ReplicationJobId,
      description: js.UndefOr[Description] = js.undefined,
      encrypted: js.UndefOr[Encrypted] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined,
      numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined): UpdateReplicationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any],
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "encrypted" -> encrypted.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "nextReplicationRunStartTime" -> nextReplicationRunStartTime.map { x => x.asInstanceOf[js.Any] },
        "numberOfRecentAmisToKeep" -> numberOfRecentAmisToKeep.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReplicationJobRequest]
    }
  }

  @js.native
  trait UpdateReplicationJobResponse extends js.Object {

  }

  object UpdateReplicationJobResponse {
    def apply(): UpdateReplicationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReplicationJobResponse]
    }
  }

  /**
   * A script that runs on first launch of an Amazon EC2 instance. Used for configuring the server during launch.
   */
  @js.native
  trait UserData extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object UserData {
    def apply(
      s3Location: js.UndefOr[S3Location] = js.undefined): UserData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Location" -> s3Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserData]
    }
  }

  object VmManagerTypeEnum {
    val VSPHERE = "VSPHERE"
    val SCVMM = "SCVMM"
    val `HYPERV-MANAGER` = "HYPERV-MANAGER"

    val values = IndexedSeq(VSPHERE, SCVMM, `HYPERV-MANAGER`)
  }

  /**
   * Represents a VM server.
   */
  @js.native
  trait VmServer extends js.Object {
    var vmManagerName: js.UndefOr[VmManagerName]
    var vmManagerType: js.UndefOr[VmManagerType]
    var vmName: js.UndefOr[VmName]
    var vmPath: js.UndefOr[VmPath]
    var vmServerAddress: js.UndefOr[VmServerAddress]
  }

  object VmServer {
    def apply(
      vmManagerName: js.UndefOr[VmManagerName] = js.undefined,
      vmManagerType: js.UndefOr[VmManagerType] = js.undefined,
      vmName: js.UndefOr[VmName] = js.undefined,
      vmPath: js.UndefOr[VmPath] = js.undefined,
      vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined): VmServer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vmManagerName" -> vmManagerName.map { x => x.asInstanceOf[js.Any] },
        "vmManagerType" -> vmManagerType.map { x => x.asInstanceOf[js.Any] },
        "vmName" -> vmName.map { x => x.asInstanceOf[js.Any] },
        "vmPath" -> vmPath.map { x => x.asInstanceOf[js.Any] },
        "vmServerAddress" -> vmServerAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VmServer]
    }
  }

  /**
   * Represents a VM server location.
   */
  @js.native
  trait VmServerAddress extends js.Object {
    var vmId: js.UndefOr[VmId]
    var vmManagerId: js.UndefOr[VmManagerId]
  }

  object VmServerAddress {
    def apply(
      vmId: js.UndefOr[VmId] = js.undefined,
      vmManagerId: js.UndefOr[VmManagerId] = js.undefined): VmServerAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vmId" -> vmId.map { x => x.asInstanceOf[js.Any] },
        "vmManagerId" -> vmManagerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VmServerAddress]
    }
  }
}
