package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object gamelift {
  type AcceptanceType = String
  type AliasId = String
  type AliasList = js.Array[Alias]
  type ArnStringModel = String
  type BooleanModel = Boolean
  type BuildId = String
  type BuildList = js.Array[Build]
  type BuildStatus = String
  type ComparisonOperatorType = String
  type CustomEventData = String
  type DesiredPlayerSessionList = js.Array[DesiredPlayerSession]
  type DoubleObject = Double
  type EC2InstanceLimitList = js.Array[EC2InstanceLimit]
  type EC2InstanceType = String
  type EventCode = String
  type EventList = js.Array[Event]
  type FleetAction = String
  type FleetActionList = js.Array[FleetAction]
  type FleetAttributesList = js.Array[FleetAttributes]
  type FleetCapacityList = js.Array[FleetCapacity]
  type FleetId = String
  type FleetIdList = js.Array[FleetId]
  type FleetStatus = String
  type FleetType = String
  type FleetUtilizationList = js.Array[FleetUtilization]
  type FreeText = String
  type GamePropertyKey = String
  type GamePropertyList = js.Array[GameProperty]
  type GamePropertyValue = String
  type GameSessionActivationTimeoutSeconds = Int
  type GameSessionData = String
  type GameSessionDetailList = js.Array[GameSessionDetail]
  type GameSessionList = js.Array[GameSession]
  type GameSessionPlacementState = String
  type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList = js.Array[GameSessionQueue]
  type GameSessionQueueName = String
  type GameSessionQueueNameList = js.Array[GameSessionQueueName]
  type GameSessionStatus = String
  type GameSessionStatusReason = String
  type IdStringModel = String
  type InstanceId = String
  type InstanceList = js.Array[Instance]
  type InstanceStatus = String
  type IpAddress = String
  type IpPermissionsList = js.Array[IpPermission]
  type IpProtocol = String
  type LatencyMap = js.Dictionary[PositiveInteger]
  type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]
  type MatchmakerData = String
  type MatchmakingAcceptanceTimeoutInteger = Int
  type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]
  type MatchmakingConfigurationStatus = String
  type MatchmakingIdList = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel = String
  type MatchmakingRequestTimeoutInteger = Int
  type MatchmakingRuleSetList = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetNameList = js.Array[MatchmakingIdStringModel]
  type MatchmakingTicketList = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = Int
  type MetricGroup = String
  type MetricGroupList = js.Array[MetricGroup]
  type MetricName = String
  type NonBlankAndLengthConstraintString = String
  type NonBlankString = String
  type NonEmptyString = String
  type NonZeroAndMaxString = String
  type OperatingSystem = String
  type PlacedPlayerSessionList = js.Array[PlacedPlayerSession]
  type PlayerAttributeMap = js.Dictionary[AttributeValue]
  type PlayerData = String
  type PlayerDataMap = js.Dictionary[PlayerData]
  type PlayerIdList = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList = js.Array[PlayerLatencyPolicy]
  type PlayerList = js.Array[Player]
  type PlayerSessionCreationPolicy = String
  type PlayerSessionId = String
  type PlayerSessionList = js.Array[PlayerSession]
  type PlayerSessionStatus = String
  type PolicyType = String
  type PortNumber = Int
  type PositiveInteger = Int
  type PositiveLong = Double
  type ProtectionPolicy = String
  type QueueArnsList = js.Array[ArnStringModel]
  type RoutingStrategyType = String
  type RuleSetBody = String
  type RuleSetLimit = Int
  type ScalingAdjustmentType = String
  type ScalingPolicyList = js.Array[ScalingPolicy]
  type ScalingStatusType = String
  type ServerProcessList = js.Array[ServerProcess]
  type SnsArnStringModel = String
  type StringDoubleMap = js.Dictionary[DoubleObject]
  type StringList = js.Array[NonZeroAndMaxString]
  type StringModel = String
  type Timestamp = js.Date
  type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type WholeNumber = Int
}

package gamelift {
  @js.native
  @JSImport("aws-sdk", "GameLift")
  class GameLift(config: AWSConfig) extends js.Object {
    def acceptMatch(params: AcceptMatchInput): Request[AcceptMatchOutput] = js.native
    def createAlias(params: CreateAliasInput): Request[CreateAliasOutput] = js.native
    def createBuild(params: CreateBuildInput): Request[CreateBuildOutput] = js.native
    def createFleet(params: CreateFleetInput): Request[CreateFleetOutput] = js.native
    def createGameSession(params: CreateGameSessionInput): Request[CreateGameSessionOutput] = js.native
    def createGameSessionQueue(params: CreateGameSessionQueueInput): Request[CreateGameSessionQueueOutput] = js.native
    def createMatchmakingConfiguration(params: CreateMatchmakingConfigurationInput): Request[CreateMatchmakingConfigurationOutput] = js.native
    def createMatchmakingRuleSet(params: CreateMatchmakingRuleSetInput): Request[CreateMatchmakingRuleSetOutput] = js.native
    def createPlayerSession(params: CreatePlayerSessionInput): Request[CreatePlayerSessionOutput] = js.native
    def createPlayerSessions(params: CreatePlayerSessionsInput): Request[CreatePlayerSessionsOutput] = js.native
    def createVpcPeeringAuthorization(params: CreateVpcPeeringAuthorizationInput): Request[CreateVpcPeeringAuthorizationOutput] = js.native
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionInput): Request[CreateVpcPeeringConnectionOutput] = js.native
    def deleteAlias(params: DeleteAliasInput): Request[js.Object] = js.native
    def deleteBuild(params: DeleteBuildInput): Request[js.Object] = js.native
    def deleteFleet(params: DeleteFleetInput): Request[js.Object] = js.native
    def deleteGameSessionQueue(params: DeleteGameSessionQueueInput): Request[DeleteGameSessionQueueOutput] = js.native
    def deleteMatchmakingConfiguration(params: DeleteMatchmakingConfigurationInput): Request[DeleteMatchmakingConfigurationOutput] = js.native
    def deleteScalingPolicy(params: DeleteScalingPolicyInput): Request[js.Object] = js.native
    def deleteVpcPeeringAuthorization(params: DeleteVpcPeeringAuthorizationInput): Request[DeleteVpcPeeringAuthorizationOutput] = js.native
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionInput): Request[DeleteVpcPeeringConnectionOutput] = js.native
    def describeAlias(params: DescribeAliasInput): Request[DescribeAliasOutput] = js.native
    def describeBuild(params: DescribeBuildInput): Request[DescribeBuildOutput] = js.native
    def describeEC2InstanceLimits(params: DescribeEC2InstanceLimitsInput): Request[DescribeEC2InstanceLimitsOutput] = js.native
    def describeFleetAttributes(params: DescribeFleetAttributesInput): Request[DescribeFleetAttributesOutput] = js.native
    def describeFleetCapacity(params: DescribeFleetCapacityInput): Request[DescribeFleetCapacityOutput] = js.native
    def describeFleetEvents(params: DescribeFleetEventsInput): Request[DescribeFleetEventsOutput] = js.native
    def describeFleetPortSettings(params: DescribeFleetPortSettingsInput): Request[DescribeFleetPortSettingsOutput] = js.native
    def describeFleetUtilization(params: DescribeFleetUtilizationInput): Request[DescribeFleetUtilizationOutput] = js.native
    def describeGameSessionDetails(params: DescribeGameSessionDetailsInput): Request[DescribeGameSessionDetailsOutput] = js.native
    def describeGameSessionPlacement(params: DescribeGameSessionPlacementInput): Request[DescribeGameSessionPlacementOutput] = js.native
    def describeGameSessionQueues(params: DescribeGameSessionQueuesInput): Request[DescribeGameSessionQueuesOutput] = js.native
    def describeGameSessions(params: DescribeGameSessionsInput): Request[DescribeGameSessionsOutput] = js.native
    def describeInstances(params: DescribeInstancesInput): Request[DescribeInstancesOutput] = js.native
    def describeMatchmaking(params: DescribeMatchmakingInput): Request[DescribeMatchmakingOutput] = js.native
    def describeMatchmakingConfigurations(params: DescribeMatchmakingConfigurationsInput): Request[DescribeMatchmakingConfigurationsOutput] = js.native
    def describeMatchmakingRuleSets(params: DescribeMatchmakingRuleSetsInput): Request[DescribeMatchmakingRuleSetsOutput] = js.native
    def describePlayerSessions(params: DescribePlayerSessionsInput): Request[DescribePlayerSessionsOutput] = js.native
    def describeRuntimeConfiguration(params: DescribeRuntimeConfigurationInput): Request[DescribeRuntimeConfigurationOutput] = js.native
    def describeScalingPolicies(params: DescribeScalingPoliciesInput): Request[DescribeScalingPoliciesOutput] = js.native
    def describeVpcPeeringAuthorizations(params: DescribeVpcPeeringAuthorizationsInput): Request[DescribeVpcPeeringAuthorizationsOutput] = js.native
    def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsInput): Request[DescribeVpcPeeringConnectionsOutput] = js.native
    def getGameSessionLogUrl(params: GetGameSessionLogUrlInput): Request[GetGameSessionLogUrlOutput] = js.native
    def getInstanceAccess(params: GetInstanceAccessInput): Request[GetInstanceAccessOutput] = js.native
    def listAliases(params: ListAliasesInput): Request[ListAliasesOutput] = js.native
    def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput] = js.native
    def listFleets(params: ListFleetsInput): Request[ListFleetsOutput] = js.native
    def putScalingPolicy(params: PutScalingPolicyInput): Request[PutScalingPolicyOutput] = js.native
    def requestUploadCredentials(params: RequestUploadCredentialsInput): Request[RequestUploadCredentialsOutput] = js.native
    def resolveAlias(params: ResolveAliasInput): Request[ResolveAliasOutput] = js.native
    def searchGameSessions(params: SearchGameSessionsInput): Request[SearchGameSessionsOutput] = js.native
    def startFleetActions(params: StartFleetActionsInput): Request[StartFleetActionsOutput] = js.native
    def startGameSessionPlacement(params: StartGameSessionPlacementInput): Request[StartGameSessionPlacementOutput] = js.native
    def startMatchBackfill(params: StartMatchBackfillInput): Request[StartMatchBackfillOutput] = js.native
    def startMatchmaking(params: StartMatchmakingInput): Request[StartMatchmakingOutput] = js.native
    def stopFleetActions(params: StopFleetActionsInput): Request[StopFleetActionsOutput] = js.native
    def stopGameSessionPlacement(params: StopGameSessionPlacementInput): Request[StopGameSessionPlacementOutput] = js.native
    def stopMatchmaking(params: StopMatchmakingInput): Request[StopMatchmakingOutput] = js.native
    def updateAlias(params: UpdateAliasInput): Request[UpdateAliasOutput] = js.native
    def updateBuild(params: UpdateBuildInput): Request[UpdateBuildOutput] = js.native
    def updateFleetAttributes(params: UpdateFleetAttributesInput): Request[UpdateFleetAttributesOutput] = js.native
    def updateFleetCapacity(params: UpdateFleetCapacityInput): Request[UpdateFleetCapacityOutput] = js.native
    def updateFleetPortSettings(params: UpdateFleetPortSettingsInput): Request[UpdateFleetPortSettingsOutput] = js.native
    def updateGameSession(params: UpdateGameSessionInput): Request[UpdateGameSessionOutput] = js.native
    def updateGameSessionQueue(params: UpdateGameSessionQueueInput): Request[UpdateGameSessionQueueOutput] = js.native
    def updateMatchmakingConfiguration(params: UpdateMatchmakingConfigurationInput): Request[UpdateMatchmakingConfigurationOutput] = js.native
    def updateRuntimeConfiguration(params: UpdateRuntimeConfigurationInput): Request[UpdateRuntimeConfigurationOutput] = js.native
    def validateMatchmakingRuleSet(params: ValidateMatchmakingRuleSetInput): Request[ValidateMatchmakingRuleSetOutput] = js.native
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait AcceptMatchInput extends js.Object {
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
    var PlayerIds: js.UndefOr[StringList]
    var AcceptanceType: js.UndefOr[AcceptanceType]
  }

  object AcceptMatchInput {
    def apply(
      TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      PlayerIds: js.UndefOr[StringList] = js.undefined,
      AcceptanceType: js.UndefOr[AcceptanceType] = js.undefined): AcceptMatchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketId" -> TicketId.map { x => x.asInstanceOf[js.Any] },
        "PlayerIds" -> PlayerIds.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceType" -> AcceptanceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptMatchInput]
    }
  }

  @js.native
  trait AcceptMatchOutput extends js.Object {

  }

  object AcceptMatchOutput {
    def apply(): AcceptMatchOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptMatchOutput]
    }
  }

  object AcceptanceTypeEnum {
    val ACCEPT = "ACCEPT"
    val REJECT = "REJECT"

    val values = IndexedSeq(ACCEPT, REJECT)
  }

  /**
   * <p>Properties describing a fleet alias.</p> <p>Alias-related operations include:</p> <ul> <li> <p> <a>CreateAlias</a> </p> </li> <li> <p> <a>ListAliases</a> </p> </li> <li> <p> <a>DescribeAlias</a> </p> </li> <li> <p> <a>UpdateAlias</a> </p> </li> <li> <p> <a>DeleteAlias</a> </p> </li> <li> <p> <a>ResolveAlias</a> </p> </li> </ul>
   */
  @js.native
  trait Alias extends js.Object {
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var AliasId: js.UndefOr[AliasId]
    var Description: js.UndefOr[FreeText]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
    var AliasArn: js.UndefOr[ArnStringModel]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object Alias {
    def apply(
      Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
      LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
      AliasId: js.UndefOr[AliasId] = js.undefined,
      Description: js.UndefOr[FreeText] = js.undefined,
      RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined,
      AliasArn: js.UndefOr[ArnStringModel] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): Alias = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RoutingStrategy" -> RoutingStrategy.map { x => x.asInstanceOf[js.Any] },
        "AliasArn" -> AliasArn.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alias]
    }
  }

  /**
   * <p>Values for use in <a>Player</a> attribute key:value pairs. This object lets you specify an attribute value using any of the valid data types: string, number, string array or data map. Each <code>AttributeValue</code> object can use only one of the available properties.</p>
   */
  @js.native
  trait AttributeValue extends js.Object {
    var S: js.UndefOr[NonZeroAndMaxString]
    var N: js.UndefOr[DoubleObject]
    var SL: js.UndefOr[StringList]
    var SDM: js.UndefOr[StringDoubleMap]
  }

  object AttributeValue {
    def apply(
      S: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      N: js.UndefOr[DoubleObject] = js.undefined,
      SL: js.UndefOr[StringList] = js.undefined,
      SDM: js.UndefOr[StringDoubleMap] = js.undefined): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S" -> S.map { x => x.asInstanceOf[js.Any] },
        "N" -> N.map { x => x.asInstanceOf[js.Any] },
        "SL" -> SL.map { x => x.asInstanceOf[js.Any] },
        "SDM" -> SDM.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
  }

  /**
   * <p>Temporary access credentials used for uploading game build files to Amazon GameLift. They are valid for a limited time. If they expire before you upload your game build, get a new set by calling <a>RequestUploadCredentials</a>.</p>
   */
  @js.native
  trait AwsCredentials extends js.Object {
    var AccessKeyId: js.UndefOr[NonEmptyString]
    var SecretAccessKey: js.UndefOr[NonEmptyString]
    var SessionToken: js.UndefOr[NonEmptyString]
  }

  object AwsCredentials {
    def apply(
      AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined,
      SecretAccessKey: js.UndefOr[NonEmptyString] = js.undefined,
      SessionToken: js.UndefOr[NonEmptyString] = js.undefined): AwsCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "SecretAccessKey" -> SecretAccessKey.map { x => x.asInstanceOf[js.Any] },
        "SessionToken" -> SessionToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsCredentials]
    }
  }

  /**
   * <p>Properties describing a game build.</p> <p>Build-related operations include:</p> <ul> <li> <p> <a>CreateBuild</a> </p> </li> <li> <p> <a>ListBuilds</a> </p> </li> <li> <p> <a>DescribeBuild</a> </p> </li> <li> <p> <a>UpdateBuild</a> </p> </li> <li> <p> <a>DeleteBuild</a> </p> </li> </ul>
   */
  @js.native
  trait Build extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var Name: js.UndefOr[FreeText]
    var SizeOnDisk: js.UndefOr[PositiveLong]
    var Version: js.UndefOr[FreeText]
    var BuildId: js.UndefOr[BuildId]
    var Status: js.UndefOr[BuildStatus]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object Build {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      Name: js.UndefOr[FreeText] = js.undefined,
      SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined,
      Version: js.UndefOr[FreeText] = js.undefined,
      BuildId: js.UndefOr[BuildId] = js.undefined,
      Status: js.UndefOr[BuildStatus] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): Build = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SizeOnDisk" -> SizeOnDisk.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Build]
    }
  }

  object BuildStatusEnum {
    val INITIALIZED = "INITIALIZED"
    val READY = "READY"
    val FAILED = "FAILED"

    val values = IndexedSeq(INITIALIZED, READY, FAILED)
  }

  object ComparisonOperatorTypeEnum {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold"
    val GreaterThanThreshold = "GreaterThanThreshold"
    val LessThanThreshold = "LessThanThreshold"
    val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold"

    val values = IndexedSeq(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
  }

  /**
   * <p>The requested operation would cause a conflict with the current state of a service resource associated with the request. Resolve the conflict before retrying this request.</p>
   */
  @js.native
  trait ConflictExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateAliasInput extends js.Object {
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  object CreateAliasInput {
    def apply(
      Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined): CreateAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RoutingStrategy" -> RoutingStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object CreateAliasOutput {
    def apply(
      Alias: js.UndefOr[Alias] = js.undefined): CreateAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateBuildInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var Version: js.UndefOr[NonZeroAndMaxString]
    var StorageLocation: js.UndefOr[S3Location]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object CreateBuildInput {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      Version: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      StorageLocation: js.UndefOr[S3Location] = js.undefined,
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined): CreateBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "StorageLocation" -> StorageLocation.map { x => x.asInstanceOf[js.Any] },
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBuildInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
    var UploadCredentials: js.UndefOr[AwsCredentials]
    var StorageLocation: js.UndefOr[S3Location]
  }

  object CreateBuildOutput {
    def apply(
      Build: js.UndefOr[Build] = js.undefined,
      UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined,
      StorageLocation: js.UndefOr[S3Location] = js.undefined): CreateBuildOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Build" -> Build.map { x => x.asInstanceOf[js.Any] },
        "UploadCredentials" -> UploadCredentials.map { x => x.asInstanceOf[js.Any] },
        "StorageLocation" -> StorageLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBuildOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateFleetInput extends js.Object {
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var FleetType: js.UndefOr[FleetType]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var BuildId: js.UndefOr[BuildId]
    var EC2InboundPermissions: js.UndefOr[IpPermissionsList]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
    var LogPaths: js.UndefOr[StringList]
  }

  object CreateFleetInput {
    def apply(
      PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetType: js.UndefOr[FleetType] = js.undefined,
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
      RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined,
      PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
      MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      BuildId: js.UndefOr[BuildId] = js.undefined,
      EC2InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined,
      ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined,
      ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      LogPaths: js.UndefOr[StringList] = js.undefined): CreateFleetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] },
        "FleetType" -> FleetType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NewGameSessionProtectionPolicy" -> NewGameSessionProtectionPolicy.map { x => x.asInstanceOf[js.Any] },
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "EC2InstanceType" -> EC2InstanceType.map { x => x.asInstanceOf[js.Any] },
        "MetricGroups" -> MetricGroups.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] },
        "EC2InboundPermissions" -> EC2InboundPermissions.map { x => x.asInstanceOf[js.Any] },
        "ResourceCreationLimitPolicy" -> ResourceCreationLimitPolicy.map { x => x.asInstanceOf[js.Any] },
        "ServerLaunchParameters" -> ServerLaunchParameters.map { x => x.asInstanceOf[js.Any] },
        "ServerLaunchPath" -> ServerLaunchPath.map { x => x.asInstanceOf[js.Any] },
        "LogPaths" -> LogPaths.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateFleetOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributes]
  }

  object CreateFleetOutput {
    def apply(
      FleetAttributes: js.UndefOr[FleetAttributes] = js.undefined): CreateFleetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetAttributes" -> FleetAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateGameSessionInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var GameSessionId: js.UndefOr[IdStringModel]
    var GameSessionData: js.UndefOr[GameSessionData]
    var AliasId: js.UndefOr[AliasId]
    var IdempotencyToken: js.UndefOr[IdStringModel]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var FleetId: js.UndefOr[FleetId]
  }

  object CreateGameSessionInput {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionId: js.UndefOr[IdStringModel] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      AliasId: js.UndefOr[AliasId] = js.undefined,
      IdempotencyToken: js.UndefOr[IdStringModel] = js.undefined,
      MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined): CreateGameSessionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] },
        "IdempotencyToken" -> IdempotencyToken.map { x => x.asInstanceOf[js.Any] },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "CreatorId" -> CreatorId.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  object CreateGameSessionOutput {
    def apply(
      GameSession: js.UndefOr[GameSession] = js.undefined): CreateGameSessionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSession" -> GameSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateGameSessionQueueInput extends js.Object {
    var Name: js.UndefOr[GameSessionQueueName]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
  }

  object CreateGameSessionQueueInput {
    def apply(
      Name: js.UndefOr[GameSessionQueueName] = js.undefined,
      TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined,
      PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
      Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined): CreateGameSessionQueueInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TimeoutInSeconds" -> TimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "PlayerLatencyPolicies" -> PlayerLatencyPolicies.map { x => x.asInstanceOf[js.Any] },
        "Destinations" -> Destinations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionQueueInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  object CreateGameSessionQueueOutput {
    def apply(
      GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined): CreateGameSessionQueueOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueue" -> GameSessionQueue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionQueueOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateMatchmakingConfigurationInput extends js.Object {
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var GameSessionData: js.UndefOr[GameSessionData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var CustomEventData: js.UndefOr[CustomEventData]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
  }

  object CreateMatchmakingConfigurationInput {
    def apply(
      Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
      AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
      RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
      GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
      AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
      NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined): CreateMatchmakingConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "CustomEventData" -> CustomEventData.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceTimeoutSeconds" -> AcceptanceTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] },
        "GameSessionQueueArns" -> GameSessionQueueArns.map { x => x.asInstanceOf[js.Any] },
        "AdditionalPlayerCount" -> AdditionalPlayerCount.map { x => x.asInstanceOf[js.Any] },
        "NotificationTarget" -> NotificationTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingConfigurationInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  object CreateMatchmakingConfigurationOutput {
    def apply(
      Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined): CreateMatchmakingConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configuration" -> Configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingConfigurationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateMatchmakingRuleSetInput extends js.Object {
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var RuleSetBody: js.UndefOr[RuleSetBody]
  }

  object CreateMatchmakingRuleSetInput {
    def apply(
      Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      RuleSetBody: js.UndefOr[RuleSetBody] = js.undefined): CreateMatchmakingRuleSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RuleSetBody" -> RuleSetBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingRuleSetInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateMatchmakingRuleSetOutput extends js.Object {
    var RuleSet: js.UndefOr[MatchmakingRuleSet]
  }

  object CreateMatchmakingRuleSetOutput {
    def apply(
      RuleSet: js.UndefOr[MatchmakingRuleSet] = js.undefined): CreateMatchmakingRuleSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSet" -> RuleSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingRuleSetOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreatePlayerSessionInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerData: js.UndefOr[PlayerData]
  }

  object CreatePlayerSessionInput {
    def apply(
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerData: js.UndefOr[PlayerData] = js.undefined): CreatePlayerSessionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "PlayerData" -> PlayerData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreatePlayerSessionOutput extends js.Object {
    var PlayerSession: js.UndefOr[PlayerSession]
  }

  object CreatePlayerSessionOutput {
    def apply(
      PlayerSession: js.UndefOr[PlayerSession] = js.undefined): CreatePlayerSessionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerSession" -> PlayerSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreatePlayerSessionsInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var PlayerIds: js.UndefOr[PlayerIdList]
    var PlayerDataMap: js.UndefOr[PlayerDataMap]
  }

  object CreatePlayerSessionsInput {
    def apply(
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
      PlayerIds: js.UndefOr[PlayerIdList] = js.undefined,
      PlayerDataMap: js.UndefOr[PlayerDataMap] = js.undefined): CreatePlayerSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "PlayerIds" -> PlayerIds.map { x => x.asInstanceOf[js.Any] },
        "PlayerDataMap" -> PlayerDataMap.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreatePlayerSessionsOutput extends js.Object {
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  object CreatePlayerSessionsOutput {
    def apply(
      PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined): CreatePlayerSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerSessions" -> PlayerSessions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateVpcPeeringAuthorizationInput {
    def apply(
      GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined): CreateVpcPeeringAuthorizationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringAuthorizationInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait CreateVpcPeeringAuthorizationOutput extends js.Object {
    var VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization]
  }

  object CreateVpcPeeringAuthorizationOutput {
    def apply(
      VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization] = js.undefined): CreateVpcPeeringAuthorizationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringAuthorization" -> VpcPeeringAuthorization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringAuthorizationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait CreateVpcPeeringConnectionInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateVpcPeeringConnectionInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined): CreateVpcPeeringConnectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionInput]
    }
  }

  @js.native
  trait CreateVpcPeeringConnectionOutput extends js.Object {

  }

  object CreateVpcPeeringConnectionOutput {
    def apply(): CreateVpcPeeringConnectionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteAliasInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
  }

  object DeleteAliasInput {
    def apply(
      AliasId: js.UndefOr[AliasId] = js.undefined): DeleteAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasInput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteBuildInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
  }

  object DeleteBuildInput {
    def apply(
      BuildId: js.UndefOr[BuildId] = js.undefined): DeleteBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBuildInput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteFleetInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object DeleteFleetInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): DeleteFleetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetInput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteGameSessionQueueInput extends js.Object {
    var Name: js.UndefOr[GameSessionQueueName]
  }

  object DeleteGameSessionQueueInput {
    def apply(
      Name: js.UndefOr[GameSessionQueueName] = js.undefined): DeleteGameSessionQueueInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGameSessionQueueInput]
    }
  }

  @js.native
  trait DeleteGameSessionQueueOutput extends js.Object {

  }

  object DeleteGameSessionQueueOutput {
    def apply(): DeleteGameSessionQueueOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGameSessionQueueOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteMatchmakingConfigurationInput extends js.Object {
    var Name: js.UndefOr[MatchmakingIdStringModel]
  }

  object DeleteMatchmakingConfigurationInput {
    def apply(
      Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined): DeleteMatchmakingConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMatchmakingConfigurationInput]
    }
  }

  @js.native
  trait DeleteMatchmakingConfigurationOutput extends js.Object {

  }

  object DeleteMatchmakingConfigurationOutput {
    def apply(): DeleteMatchmakingConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMatchmakingConfigurationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteScalingPolicyInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
  }

  object DeleteScalingPolicyInput {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined): DeleteScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScalingPolicyInput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
  }

  object DeleteVpcPeeringAuthorizationInput {
    def apply(
      GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined): DeleteVpcPeeringAuthorizationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringAuthorizationInput]
    }
  }

  @js.native
  trait DeleteVpcPeeringAuthorizationOutput extends js.Object {

  }

  object DeleteVpcPeeringAuthorizationOutput {
    def apply(): DeleteVpcPeeringAuthorizationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringAuthorizationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DeleteVpcPeeringConnectionInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString]
  }

  object DeleteVpcPeeringConnectionInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.undefined): DeleteVpcPeeringConnectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionInput]
    }
  }

  @js.native
  trait DeleteVpcPeeringConnectionOutput extends js.Object {

  }

  object DeleteVpcPeeringConnectionOutput {
    def apply(): DeleteVpcPeeringConnectionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeAliasInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
  }

  object DescribeAliasInput {
    def apply(
      AliasId: js.UndefOr[AliasId] = js.undefined): DescribeAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAliasInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object DescribeAliasOutput {
    def apply(
      Alias: js.UndefOr[Alias] = js.undefined): DescribeAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAliasOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeBuildInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
  }

  object DescribeBuildInput {
    def apply(
      BuildId: js.UndefOr[BuildId] = js.undefined): DescribeBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBuildInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  object DescribeBuildOutput {
    def apply(
      Build: js.UndefOr[Build] = js.undefined): DescribeBuildOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Build" -> Build.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBuildOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeEC2InstanceLimitsInput extends js.Object {
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
  }

  object DescribeEC2InstanceLimitsInput {
    def apply(
      EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined): DescribeEC2InstanceLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2InstanceType" -> EC2InstanceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEC2InstanceLimitsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeEC2InstanceLimitsOutput extends js.Object {
    var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList]
  }

  object DescribeEC2InstanceLimitsOutput {
    def apply(
      EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.undefined): DescribeEC2InstanceLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2InstanceLimits" -> EC2InstanceLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEC2InstanceLimitsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeFleetAttributesInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetAttributesInput {
    def apply(
      FleetIds: js.UndefOr[FleetIdList] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetAttributesInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeFleetAttributesOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributesList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetAttributesOutput {
    def apply(
      FleetAttributes: js.UndefOr[FleetAttributesList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetAttributes" -> FleetAttributes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetAttributesOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeFleetCapacityInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetCapacityInput {
    def apply(
      FleetIds: js.UndefOr[FleetIdList] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetCapacityInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeFleetCapacityOutput extends js.Object {
    var FleetCapacity: js.UndefOr[FleetCapacityList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetCapacityOutput {
    def apply(
      FleetCapacity: js.UndefOr[FleetCapacityList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetCapacity" -> FleetCapacity.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetCapacityOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeFleetEventsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var FleetId: js.UndefOr[FleetId]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetEventsInput {
    def apply(
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetEventsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeFleetEventsOutput extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetEventsOutput {
    def apply(
      Events: js.UndefOr[EventList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetEventsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetEventsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeFleetPortSettingsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object DescribeFleetPortSettingsInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): DescribeFleetPortSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetPortSettingsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeFleetPortSettingsOutput extends js.Object {
    var InboundPermissions: js.UndefOr[IpPermissionsList]
  }

  object DescribeFleetPortSettingsOutput {
    def apply(
      InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined): DescribeFleetPortSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboundPermissions" -> InboundPermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetPortSettingsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeFleetUtilizationInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetUtilizationInput {
    def apply(
      FleetIds: js.UndefOr[FleetIdList] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetUtilizationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetUtilizationInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeFleetUtilizationOutput extends js.Object {
    var FleetUtilization: js.UndefOr[FleetUtilizationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetUtilizationOutput {
    def apply(
      FleetUtilization: js.UndefOr[FleetUtilizationList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeFleetUtilizationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetUtilization" -> FleetUtilization.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetUtilizationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeGameSessionDetailsInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var AliasId: js.UndefOr[AliasId]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionDetailsInput {
    def apply(
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      AliasId: js.UndefOr[AliasId] = js.undefined,
      StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeGameSessionDetailsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] },
        "StatusFilter" -> StatusFilter.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionDetailsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeGameSessionDetailsOutput extends js.Object {
    var GameSessionDetails: js.UndefOr[GameSessionDetailList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionDetailsOutput {
    def apply(
      GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeGameSessionDetailsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionDetails" -> GameSessionDetails.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionDetailsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeGameSessionPlacementInput extends js.Object {
    var PlacementId: js.UndefOr[IdStringModel]
  }

  object DescribeGameSessionPlacementInput {
    def apply(
      PlacementId: js.UndefOr[IdStringModel] = js.undefined): DescribeGameSessionPlacementInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlacementId" -> PlacementId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionPlacementInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object DescribeGameSessionPlacementOutput {
    def apply(
      GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined): DescribeGameSessionPlacementOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionPlacement" -> GameSessionPlacement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionPlacementOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeGameSessionQueuesInput extends js.Object {
    var Names: js.UndefOr[GameSessionQueueNameList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionQueuesInput {
    def apply(
      Names: js.UndefOr[GameSessionQueueNameList] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeGameSessionQueuesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionQueuesInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeGameSessionQueuesOutput extends js.Object {
    var GameSessionQueues: js.UndefOr[GameSessionQueueList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionQueuesOutput {
    def apply(
      GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeGameSessionQueuesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueues" -> GameSessionQueues.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionQueuesOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeGameSessionsInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var AliasId: js.UndefOr[AliasId]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionsInput {
    def apply(
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      AliasId: js.UndefOr[AliasId] = js.undefined,
      StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeGameSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] },
        "StatusFilter" -> StatusFilter.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionsOutput {
    def apply(
      GameSessions: js.UndefOr[GameSessionList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeGameSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessions" -> GameSessions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeInstancesInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InstanceId: js.UndefOr[InstanceId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeInstancesInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeInstancesOutput extends js.Object {
    var Instances: js.UndefOr[InstanceList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeInstancesOutput {
    def apply(
      Instances: js.UndefOr[InstanceList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeMatchmakingConfigurationsInput extends js.Object {
    var Names: js.UndefOr[MatchmakingIdList]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingConfigurationsInput {
    def apply(
      Names: js.UndefOr[MatchmakingIdList] = js.undefined,
      RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeMatchmakingConfigurationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingConfigurationsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeMatchmakingConfigurationsOutput extends js.Object {
    var Configurations: js.UndefOr[MatchmakingConfigurationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingConfigurationsOutput {
    def apply(
      Configurations: js.UndefOr[MatchmakingConfigurationList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeMatchmakingConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configurations" -> Configurations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingConfigurationsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeMatchmakingInput extends js.Object {
    var TicketIds: js.UndefOr[MatchmakingIdList]
  }

  object DescribeMatchmakingInput {
    def apply(
      TicketIds: js.UndefOr[MatchmakingIdList] = js.undefined): DescribeMatchmakingInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketIds" -> TicketIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeMatchmakingOutput extends js.Object {
    var TicketList: js.UndefOr[MatchmakingTicketList]
  }

  object DescribeMatchmakingOutput {
    def apply(
      TicketList: js.UndefOr[MatchmakingTicketList] = js.undefined): DescribeMatchmakingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketList" -> TicketList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeMatchmakingRuleSetsInput extends js.Object {
    var Names: js.UndefOr[MatchmakingRuleSetNameList]
    var Limit: js.UndefOr[RuleSetLimit]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingRuleSetsInput {
    def apply(
      Names: js.UndefOr[MatchmakingRuleSetNameList] = js.undefined,
      Limit: js.UndefOr[RuleSetLimit] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeMatchmakingRuleSetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingRuleSetsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeMatchmakingRuleSetsOutput extends js.Object {
    var RuleSets: js.UndefOr[MatchmakingRuleSetList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingRuleSetsOutput {
    def apply(
      RuleSets: js.UndefOr[MatchmakingRuleSetList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeMatchmakingRuleSetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSets" -> RuleSets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingRuleSetsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribePlayerSessionsInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
    var Limit: js.UndefOr[PositiveInteger]
    var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribePlayerSessionsInput {
    def apply(
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
      PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribePlayerSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionId" -> PlayerSessionId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionStatusFilter" -> PlayerSessionStatusFilter.map { x => x.asInstanceOf[js.Any] },
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlayerSessionsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribePlayerSessionsOutput extends js.Object {
    var PlayerSessions: js.UndefOr[PlayerSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribePlayerSessionsOutput {
    def apply(
      PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribePlayerSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerSessions" -> PlayerSessions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlayerSessionsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeRuntimeConfigurationInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object DescribeRuntimeConfigurationInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): DescribeRuntimeConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRuntimeConfigurationInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object DescribeRuntimeConfigurationOutput {
    def apply(
      RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined): DescribeRuntimeConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRuntimeConfigurationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeScalingPoliciesInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var StatusFilter: js.UndefOr[ScalingStatusType]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeScalingPoliciesInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      StatusFilter: js.UndefOr[ScalingStatusType] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeScalingPoliciesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "StatusFilter" -> StatusFilter.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeScalingPoliciesOutput extends js.Object {
    var ScalingPolicies: js.UndefOr[ScalingPolicyList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeScalingPoliciesOutput {
    def apply(
      ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): DescribeScalingPoliciesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalingPolicies" -> ScalingPolicies.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesOutput]
    }
  }

  @js.native
  trait DescribeVpcPeeringAuthorizationsInput extends js.Object {

  }

  object DescribeVpcPeeringAuthorizationsInput {
    def apply(): DescribeVpcPeeringAuthorizationsInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringAuthorizationsInput]
    }
  }

  @js.native
  trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
    var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList]
  }

  object DescribeVpcPeeringAuthorizationsOutput {
    def apply(
      VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.undefined): DescribeVpcPeeringAuthorizationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringAuthorizations" -> VpcPeeringAuthorizations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait DescribeVpcPeeringConnectionsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object DescribeVpcPeeringConnectionsInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): DescribeVpcPeeringConnectionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait DescribeVpcPeeringConnectionsOutput extends js.Object {
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList]
  }

  object DescribeVpcPeeringConnectionsOutput {
    def apply(
      VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined): DescribeVpcPeeringConnectionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringConnections" -> VpcPeeringConnections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsOutput]
    }
  }

  /**
   * <p>Player information for use when creating player sessions using a game session placement request with <a>StartGameSessionPlacement</a>.</p>
   */
  @js.native
  trait DesiredPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerData: js.UndefOr[PlayerData]
  }

  object DesiredPlayerSession {
    def apply(
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerData: js.UndefOr[PlayerData] = js.undefined): DesiredPlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "PlayerData" -> PlayerData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DesiredPlayerSession]
    }
  }

  /**
   * <p>Current status of fleet capacity. The number of active instances should match or be in the process of matching the number of desired instances. Pending and terminating counts are non-zero only if fleet capacity is adjusting to an <a>UpdateFleetCapacity</a> request, or if access to resources is temporarily affected.</p> <p>Fleet-related operations include:</p> <ul> <li> <p> <a>CreateFleet</a> </p> </li> <li> <p> <a>ListFleets</a> </p> </li> <li> <p> <a>DeleteFleet</a> </p> </li> <li> <p>Describe fleets:</p> <ul> <li> <p> <a>DescribeFleetAttributes</a> </p> </li> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>DescribeFleetPortSettings</a> </p> </li> <li> <p> <a>DescribeFleetUtilization</a> </p> </li> <li> <p> <a>DescribeRuntimeConfiguration</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p> <a>DescribeFleetEvents</a> </p> </li> </ul> </li> <li> <p>Update fleets:</p> <ul> <li> <p> <a>UpdateFleetAttributes</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetPortSettings</a> </p> </li> <li> <p> <a>UpdateRuntimeConfiguration</a> </p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait EC2InstanceCounts extends js.Object {
    var ACTIVE: js.UndefOr[WholeNumber]
    var MINIMUM: js.UndefOr[WholeNumber]
    var MAXIMUM: js.UndefOr[WholeNumber]
    var TERMINATING: js.UndefOr[WholeNumber]
    var PENDING: js.UndefOr[WholeNumber]
    var DESIRED: js.UndefOr[WholeNumber]
    var IDLE: js.UndefOr[WholeNumber]
  }

  object EC2InstanceCounts {
    def apply(
      ACTIVE: js.UndefOr[WholeNumber] = js.undefined,
      MINIMUM: js.UndefOr[WholeNumber] = js.undefined,
      MAXIMUM: js.UndefOr[WholeNumber] = js.undefined,
      TERMINATING: js.UndefOr[WholeNumber] = js.undefined,
      PENDING: js.UndefOr[WholeNumber] = js.undefined,
      DESIRED: js.UndefOr[WholeNumber] = js.undefined,
      IDLE: js.UndefOr[WholeNumber] = js.undefined): EC2InstanceCounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ACTIVE" -> ACTIVE.map { x => x.asInstanceOf[js.Any] },
        "MINIMUM" -> MINIMUM.map { x => x.asInstanceOf[js.Any] },
        "MAXIMUM" -> MAXIMUM.map { x => x.asInstanceOf[js.Any] },
        "TERMINATING" -> TERMINATING.map { x => x.asInstanceOf[js.Any] },
        "PENDING" -> PENDING.map { x => x.asInstanceOf[js.Any] },
        "DESIRED" -> DESIRED.map { x => x.asInstanceOf[js.Any] },
        "IDLE" -> IDLE.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2InstanceCounts]
    }
  }

  /**
   * <p>Maximum number of instances allowed based on the Amazon Elastic Compute Cloud (Amazon EC2) instance type. Instance limits can be retrieved by calling <a>DescribeEC2InstanceLimits</a>.</p>
   */
  @js.native
  trait EC2InstanceLimit extends js.Object {
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
    var CurrentInstances: js.UndefOr[WholeNumber]
    var InstanceLimit: js.UndefOr[WholeNumber]
  }

  object EC2InstanceLimit {
    def apply(
      EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
      CurrentInstances: js.UndefOr[WholeNumber] = js.undefined,
      InstanceLimit: js.UndefOr[WholeNumber] = js.undefined): EC2InstanceLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2InstanceType" -> EC2InstanceType.map { x => x.asInstanceOf[js.Any] },
        "CurrentInstances" -> CurrentInstances.map { x => x.asInstanceOf[js.Any] },
        "InstanceLimit" -> InstanceLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2InstanceLimit]
    }
  }

  object EC2InstanceTypeEnum {
    val `t2.micro` = "t2.micro"
    val `t2.small` = "t2.small"
    val `t2.medium` = "t2.medium"
    val `t2.large` = "t2.large"
    val `c3.large` = "c3.large"
    val `c3.xlarge` = "c3.xlarge"
    val `c3.2xlarge` = "c3.2xlarge"
    val `c3.4xlarge` = "c3.4xlarge"
    val `c3.8xlarge` = "c3.8xlarge"
    val `c4.large` = "c4.large"
    val `c4.xlarge` = "c4.xlarge"
    val `c4.2xlarge` = "c4.2xlarge"
    val `c4.4xlarge` = "c4.4xlarge"
    val `c4.8xlarge` = "c4.8xlarge"
    val `r3.large` = "r3.large"
    val `r3.xlarge` = "r3.xlarge"
    val `r3.2xlarge` = "r3.2xlarge"
    val `r3.4xlarge` = "r3.4xlarge"
    val `r3.8xlarge` = "r3.8xlarge"
    val `r4.large` = "r4.large"
    val `r4.xlarge` = "r4.xlarge"
    val `r4.2xlarge` = "r4.2xlarge"
    val `r4.4xlarge` = "r4.4xlarge"
    val `r4.8xlarge` = "r4.8xlarge"
    val `r4.16xlarge` = "r4.16xlarge"
    val `m3.medium` = "m3.medium"
    val `m3.large` = "m3.large"
    val `m3.xlarge` = "m3.xlarge"
    val `m3.2xlarge` = "m3.2xlarge"
    val `m4.large` = "m4.large"
    val `m4.xlarge` = "m4.xlarge"
    val `m4.2xlarge` = "m4.2xlarge"
    val `m4.4xlarge` = "m4.4xlarge"
    val `m4.10xlarge` = "m4.10xlarge"

    val values = IndexedSeq(`t2.micro`, `t2.small`, `t2.medium`, `t2.large`, `c3.large`, `c3.xlarge`, `c3.2xlarge`, `c3.4xlarge`, `c3.8xlarge`, `c4.large`, `c4.xlarge`, `c4.2xlarge`, `c4.4xlarge`, `c4.8xlarge`, `r3.large`, `r3.xlarge`, `r3.2xlarge`, `r3.4xlarge`, `r3.8xlarge`, `r4.large`, `r4.xlarge`, `r4.2xlarge`, `r4.4xlarge`, `r4.8xlarge`, `r4.16xlarge`, `m3.medium`, `m3.large`, `m3.xlarge`, `m3.2xlarge`, `m4.large`, `m4.xlarge`, `m4.2xlarge`, `m4.4xlarge`, `m4.10xlarge`)
  }

  /**
   * <p>Log entry describing an event that involves Amazon GameLift resources (such as a fleet). In addition to tracking activity, event codes and messages can provide additional information for troubleshooting and debugging problems.</p>
   */
  @js.native
  trait Event extends js.Object {
    var ResourceId: js.UndefOr[NonZeroAndMaxString]
    var EventCode: js.UndefOr[EventCode]
    var PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString]
    var EventId: js.UndefOr[NonZeroAndMaxString]
    var Message: js.UndefOr[NonEmptyString]
    var EventTime: js.UndefOr[Timestamp]
  }

  object Event {
    def apply(
      ResourceId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      EventCode: js.UndefOr[EventCode] = js.undefined,
      PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      EventId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      Message: js.UndefOr[NonEmptyString] = js.undefined,
      EventTime: js.UndefOr[Timestamp] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "EventCode" -> EventCode.map { x => x.asInstanceOf[js.Any] },
        "PreSignedLogUrl" -> PreSignedLogUrl.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "EventTime" -> EventTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  object EventCodeEnum {
    val GENERIC_EVENT = "GENERIC_EVENT"
    val FLEET_CREATED = "FLEET_CREATED"
    val FLEET_DELETED = "FLEET_DELETED"
    val FLEET_SCALING_EVENT = "FLEET_SCALING_EVENT"
    val FLEET_STATE_DOWNLOADING = "FLEET_STATE_DOWNLOADING"
    val FLEET_STATE_VALIDATING = "FLEET_STATE_VALIDATING"
    val FLEET_STATE_BUILDING = "FLEET_STATE_BUILDING"
    val FLEET_STATE_ACTIVATING = "FLEET_STATE_ACTIVATING"
    val FLEET_STATE_ACTIVE = "FLEET_STATE_ACTIVE"
    val FLEET_STATE_ERROR = "FLEET_STATE_ERROR"
    val FLEET_INITIALIZATION_FAILED = "FLEET_INITIALIZATION_FAILED"
    val FLEET_BINARY_DOWNLOAD_FAILED = "FLEET_BINARY_DOWNLOAD_FAILED"
    val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND"
    val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE = "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE"
    val FLEET_VALIDATION_TIMED_OUT = "FLEET_VALIDATION_TIMED_OUT"
    val FLEET_ACTIVATION_FAILED = "FLEET_ACTIVATION_FAILED"
    val FLEET_ACTIVATION_FAILED_NO_INSTANCES = "FLEET_ACTIVATION_FAILED_NO_INSTANCES"
    val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED = "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED"
    val SERVER_PROCESS_INVALID_PATH = "SERVER_PROCESS_INVALID_PATH"
    val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT"
    val SERVER_PROCESS_PROCESS_READY_TIMEOUT = "SERVER_PROCESS_PROCESS_READY_TIMEOUT"
    val SERVER_PROCESS_CRASHED = "SERVER_PROCESS_CRASHED"
    val SERVER_PROCESS_TERMINATED_UNHEALTHY = "SERVER_PROCESS_TERMINATED_UNHEALTHY"
    val SERVER_PROCESS_FORCE_TERMINATED = "SERVER_PROCESS_FORCE_TERMINATED"
    val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT"
    val GAME_SESSION_ACTIVATION_TIMEOUT = "GAME_SESSION_ACTIVATION_TIMEOUT"
    val FLEET_CREATION_EXTRACTING_BUILD = "FLEET_CREATION_EXTRACTING_BUILD"
    val FLEET_CREATION_RUNNING_INSTALLER = "FLEET_CREATION_RUNNING_INSTALLER"
    val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG"
    val FLEET_VPC_PEERING_SUCCEEDED = "FLEET_VPC_PEERING_SUCCEEDED"
    val FLEET_VPC_PEERING_FAILED = "FLEET_VPC_PEERING_FAILED"
    val FLEET_VPC_PEERING_DELETED = "FLEET_VPC_PEERING_DELETED"
    val INSTANCE_INTERRUPTED = "INSTANCE_INTERRUPTED"

    val values = IndexedSeq(GENERIC_EVENT, FLEET_CREATED, FLEET_DELETED, FLEET_SCALING_EVENT, FLEET_STATE_DOWNLOADING, FLEET_STATE_VALIDATING, FLEET_STATE_BUILDING, FLEET_STATE_ACTIVATING, FLEET_STATE_ACTIVE, FLEET_STATE_ERROR, FLEET_INITIALIZATION_FAILED, FLEET_BINARY_DOWNLOAD_FAILED, FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND, FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE, FLEET_VALIDATION_TIMED_OUT, FLEET_ACTIVATION_FAILED, FLEET_ACTIVATION_FAILED_NO_INSTANCES, FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED, SERVER_PROCESS_INVALID_PATH, SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT, SERVER_PROCESS_PROCESS_READY_TIMEOUT, SERVER_PROCESS_CRASHED, SERVER_PROCESS_TERMINATED_UNHEALTHY, SERVER_PROCESS_FORCE_TERMINATED, SERVER_PROCESS_PROCESS_EXIT_TIMEOUT, GAME_SESSION_ACTIVATION_TIMEOUT, FLEET_CREATION_EXTRACTING_BUILD, FLEET_CREATION_RUNNING_INSTALLER, FLEET_CREATION_VALIDATING_RUNTIME_CONFIG, FLEET_VPC_PEERING_SUCCEEDED, FLEET_VPC_PEERING_FAILED, FLEET_VPC_PEERING_DELETED, INSTANCE_INTERRUPTED)
  }

  object FleetActionEnum {
    val AUTO_SCALING = "AUTO_SCALING"

    val values = IndexedSeq(AUTO_SCALING)
  }

  /**
   * <p>General properties describing a fleet.</p> <p>Fleet-related operations include:</p> <ul> <li> <p> <a>CreateFleet</a> </p> </li> <li> <p> <a>ListFleets</a> </p> </li> <li> <p> <a>DeleteFleet</a> </p> </li> <li> <p>Describe fleets:</p> <ul> <li> <p> <a>DescribeFleetAttributes</a> </p> </li> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>DescribeFleetPortSettings</a> </p> </li> <li> <p> <a>DescribeFleetUtilization</a> </p> </li> <li> <p> <a>DescribeRuntimeConfiguration</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p> <a>DescribeFleetEvents</a> </p> </li> </ul> </li> <li> <p>Update fleets:</p> <ul> <li> <p> <a>UpdateFleetAttributes</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetPortSettings</a> </p> </li> <li> <p> <a>UpdateRuntimeConfiguration</a> </p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait FleetAttributes extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var FleetType: js.UndefOr[FleetType]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var TerminationTime: js.UndefOr[Timestamp]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var BuildId: js.UndefOr[BuildId]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
    var StoppedActions: js.UndefOr[FleetActionList]
    var InstanceType: js.UndefOr[EC2InstanceType]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var FleetArn: js.UndefOr[ArnStringModel]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
    var LogPaths: js.UndefOr[StringList]
    var FleetId: js.UndefOr[FleetId]
    var Status: js.UndefOr[FleetStatus]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object FleetAttributes {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      FleetType: js.UndefOr[FleetType] = js.undefined,
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
      TerminationTime: js.UndefOr[Timestamp] = js.undefined,
      MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      BuildId: js.UndefOr[BuildId] = js.undefined,
      ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined,
      StoppedActions: js.UndefOr[FleetActionList] = js.undefined,
      InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
      ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetArn: js.UndefOr[ArnStringModel] = js.undefined,
      ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      LogPaths: js.UndefOr[StringList] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Status: js.UndefOr[FleetStatus] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): FleetAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "FleetType" -> FleetType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NewGameSessionProtectionPolicy" -> NewGameSessionProtectionPolicy.map { x => x.asInstanceOf[js.Any] },
        "TerminationTime" -> TerminationTime.map { x => x.asInstanceOf[js.Any] },
        "MetricGroups" -> MetricGroups.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] },
        "ResourceCreationLimitPolicy" -> ResourceCreationLimitPolicy.map { x => x.asInstanceOf[js.Any] },
        "StoppedActions" -> StoppedActions.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "ServerLaunchParameters" -> ServerLaunchParameters.map { x => x.asInstanceOf[js.Any] },
        "FleetArn" -> FleetArn.map { x => x.asInstanceOf[js.Any] },
        "ServerLaunchPath" -> ServerLaunchPath.map { x => x.asInstanceOf[js.Any] },
        "LogPaths" -> LogPaths.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetAttributes]
    }
  }

  /**
   * <p>Information about the fleet's capacity. Fleet capacity is measured in EC2 instances. By default, new fleets have a capacity of one instance, but can be updated as needed. The maximum number of instances for a fleet is determined by the fleet's instance type.</p> <p>Fleet-related operations include:</p> <ul> <li> <p> <a>CreateFleet</a> </p> </li> <li> <p> <a>ListFleets</a> </p> </li> <li> <p> <a>DeleteFleet</a> </p> </li> <li> <p>Describe fleets:</p> <ul> <li> <p> <a>DescribeFleetAttributes</a> </p> </li> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>DescribeFleetPortSettings</a> </p> </li> <li> <p> <a>DescribeFleetUtilization</a> </p> </li> <li> <p> <a>DescribeRuntimeConfiguration</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p> <a>DescribeFleetEvents</a> </p> </li> </ul> </li> <li> <p>Update fleets:</p> <ul> <li> <p> <a>UpdateFleetAttributes</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetPortSettings</a> </p> </li> <li> <p> <a>UpdateRuntimeConfiguration</a> </p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait FleetCapacity extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InstanceType: js.UndefOr[EC2InstanceType]
    var InstanceCounts: js.UndefOr[EC2InstanceCounts]
  }

  object FleetCapacity {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
      InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.undefined): FleetCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceCounts" -> InstanceCounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetCapacity]
    }
  }

  /**
   * <p>The specified fleet has no available instances to fulfill a <code>CreateGameSession</code> request. Clients can retry such requests immediately or after a waiting period.</p>
   */
  @js.native
  trait FleetCapacityExceededExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  object FleetStatusEnum {
    val NEW = "NEW"
    val DOWNLOADING = "DOWNLOADING"
    val VALIDATING = "VALIDATING"
    val BUILDING = "BUILDING"
    val ACTIVATING = "ACTIVATING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"
    val ERROR = "ERROR"
    val TERMINATED = "TERMINATED"

    val values = IndexedSeq(NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
  }

  object FleetTypeEnum {
    val ON_DEMAND = "ON_DEMAND"
    val SPOT = "SPOT"

    val values = IndexedSeq(ON_DEMAND, SPOT)
  }

  /**
   * <p>Current status of fleet utilization, including the number of game and player sessions being hosted.</p> <p>Fleet-related operations include:</p> <ul> <li> <p> <a>CreateFleet</a> </p> </li> <li> <p> <a>ListFleets</a> </p> </li> <li> <p> <a>DeleteFleet</a> </p> </li> <li> <p>Describe fleets:</p> <ul> <li> <p> <a>DescribeFleetAttributes</a> </p> </li> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>DescribeFleetPortSettings</a> </p> </li> <li> <p> <a>DescribeFleetUtilization</a> </p> </li> <li> <p> <a>DescribeRuntimeConfiguration</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p> <a>DescribeFleetEvents</a> </p> </li> </ul> </li> <li> <p>Update fleets:</p> <ul> <li> <p> <a>UpdateFleetAttributes</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetPortSettings</a> </p> </li> <li> <p> <a>UpdateRuntimeConfiguration</a> </p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait FleetUtilization extends js.Object {
    var ActiveServerProcessCount: js.UndefOr[WholeNumber]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var ActiveGameSessionCount: js.UndefOr[WholeNumber]
    var FleetId: js.UndefOr[FleetId]
  }

  object FleetUtilization {
    def apply(
      ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined,
      CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined): FleetUtilization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActiveServerProcessCount" -> ActiveServerProcessCount.map { x => x.asInstanceOf[js.Any] },
        "CurrentPlayerSessionCount" -> CurrentPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "ActiveGameSessionCount" -> ActiveGameSessionCount.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetUtilization]
    }
  }

  /**
   * <p>Set of key-value pairs that contain information about a game session. When included in a game session request, these properties communicate details to be used when setting up the new game session, such as to specify a game mode, level, or map. Game properties are passed to the game server process when initiating a new game session; the server process uses the properties as appropriate. For more information, see the <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create"> Amazon GameLift Developer Guide</a>.</p>
   */
  @js.native
  trait GameProperty extends js.Object {
    var Key: js.UndefOr[GamePropertyKey]
    var Value: js.UndefOr[GamePropertyValue]
  }

  object GameProperty {
    def apply(
      Key: js.UndefOr[GamePropertyKey] = js.undefined,
      Value: js.UndefOr[GamePropertyValue] = js.undefined): GameProperty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameProperty]
    }
  }

  /**
   * <p>Properties describing a game session.</p> <p>A game session in ACTIVE status can host players. When a game session ends, its status is set to <code>TERMINATED</code>. </p> <p>Once the session ends, the game session object is retained for 30 days. This means you can reuse idempotency token values after this time. Game session logs are retained for 14 days.</p> <p>Game-session-related operations include:</p> <ul> <li> <p> <a>CreateGameSession</a> </p> </li> <li> <p> <a>DescribeGameSessions</a> </p> </li> <li> <p> <a>DescribeGameSessionDetails</a> </p> </li> <li> <p> <a>SearchGameSessions</a> </p> </li> <li> <p> <a>UpdateGameSession</a> </p> </li> <li> <p> <a>GetGameSessionLogUrl</a> </p> </li> <li> <p>Game session placements</p> <ul> <li> <p> <a>StartGameSessionPlacement</a> </p> </li> <li> <p> <a>DescribeGameSessionPlacement</a> </p> </li> <li> <p> <a>StopGameSessionPlacement</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait GameSession extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var GameSessionId: js.UndefOr[NonZeroAndMaxString]
    var GameSessionData: js.UndefOr[GameSessionData]
    var TerminationTime: js.UndefOr[Timestamp]
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var IpAddress: js.UndefOr[IpAddress]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var Port: js.UndefOr[PortNumber]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var StatusReason: js.UndefOr[GameSessionStatusReason]
    var MatchmakerData: js.UndefOr[MatchmakerData]
    var FleetId: js.UndefOr[FleetId]
    var Status: js.UndefOr[GameSessionStatus]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object GameSession {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      TerminationTime: js.UndefOr[Timestamp] = js.undefined,
      PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined,
      CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      Port: js.UndefOr[PortNumber] = js.undefined,
      CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
      StatusReason: js.UndefOr[GameSessionStatusReason] = js.undefined,
      MatchmakerData: js.UndefOr[MatchmakerData] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Status: js.UndefOr[GameSessionStatus] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): GameSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "TerminationTime" -> TerminationTime.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionCreationPolicy" -> PlayerSessionCreationPolicy.map { x => x.asInstanceOf[js.Any] },
        "CurrentPlayerSessionCount" -> CurrentPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "CreatorId" -> CreatorId.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] },
        "MatchmakerData" -> MatchmakerData.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSession]
    }
  }

  /**
   * <p>Connection information for the new game session that is created with matchmaking. (with <a>StartMatchmaking</a>). Once a match is set, the FlexMatch engine places the match and creates a new game session for it. This information, including the game session endpoint and player sessions for each player in the original matchmaking request, is added to the <a>MatchmakingTicket</a>, which can be retrieved by calling <a>DescribeMatchmaking</a>.</p>
   */
  @js.native
  trait GameSessionConnectionInfo extends js.Object {
    var GameSessionArn: js.UndefOr[ArnStringModel]
    var IpAddress: js.UndefOr[StringModel]
    var Port: js.UndefOr[PositiveInteger]
    var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList]
  }

  object GameSessionConnectionInfo {
    def apply(
      GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined,
      IpAddress: js.UndefOr[StringModel] = js.undefined,
      Port: js.UndefOr[PositiveInteger] = js.undefined,
      MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.undefined): GameSessionConnectionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionArn" -> GameSessionArn.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "MatchedPlayerSessions" -> MatchedPlayerSessions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionConnectionInfo]
    }
  }

  /**
   * <p>A game session's properties plus the protection policy currently in force.</p>
   */
  @js.native
  trait GameSessionDetail extends js.Object {
    var GameSession: js.UndefOr[GameSession]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  object GameSessionDetail {
    def apply(
      GameSession: js.UndefOr[GameSession] = js.undefined,
      ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined): GameSessionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSession" -> GameSession.map { x => x.asInstanceOf[js.Any] },
        "ProtectionPolicy" -> ProtectionPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionDetail]
    }
  }

  /**
   * <p>The game instance is currently full and cannot allow the requested player(s) to join. Clients can retry such requests immediately or after a waiting period.</p>
   */
  @js.native
  trait GameSessionFullExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>Object that describes a <a>StartGameSessionPlacement</a> request. This object includes the full details of the original request plus the current status and start/end time stamps.</p> <p>Game session placement-related operations include:</p> <ul> <li> <p> <a>StartGameSessionPlacement</a> </p> </li> <li> <p> <a>DescribeGameSessionPlacement</a> </p> </li> <li> <p> <a>StopGameSessionPlacement</a> </p> </li> </ul>
   */
  @js.native
  trait GameSessionPlacement extends js.Object {
    var GameSessionArn: js.UndefOr[NonZeroAndMaxString]
    var GameSessionId: js.UndefOr[NonZeroAndMaxString]
    var GameSessionRegion: js.UndefOr[NonZeroAndMaxString]
    var GameSessionData: js.UndefOr[GameSessionData]
    var IpAddress: js.UndefOr[IpAddress]
    var PlayerLatencies: js.UndefOr[PlayerLatencyList]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var Port: js.UndefOr[PortNumber]
    var PlacementId: js.UndefOr[IdStringModel]
    var PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList]
    var GameSessionName: js.UndefOr[NonZeroAndMaxString]
    var GameSessionQueueName: js.UndefOr[GameSessionQueueName]
    var GameProperties: js.UndefOr[GamePropertyList]
    var MatchmakerData: js.UndefOr[MatchmakerData]
    var Status: js.UndefOr[GameSessionPlacementState]
  }

  object GameSessionPlacement {
    def apply(
      GameSessionArn: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionRegion: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      Port: js.UndefOr[PortNumber] = js.undefined,
      PlacementId: js.UndefOr[IdStringModel] = js.undefined,
      PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList] = js.undefined,
      GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionQueueName: js.UndefOr[GameSessionQueueName] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
      MatchmakerData: js.UndefOr[MatchmakerData] = js.undefined,
      Status: js.UndefOr[GameSessionPlacementState] = js.undefined): GameSessionPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionArn" -> GameSessionArn.map { x => x.asInstanceOf[js.Any] },
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "GameSessionRegion" -> GameSessionRegion.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "PlayerLatencies" -> PlayerLatencies.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PlacementId" -> PlacementId.map { x => x.asInstanceOf[js.Any] },
        "PlacedPlayerSessions" -> PlacedPlayerSessions.map { x => x.asInstanceOf[js.Any] },
        "GameSessionName" -> GameSessionName.map { x => x.asInstanceOf[js.Any] },
        "GameSessionQueueName" -> GameSessionQueueName.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] },
        "MatchmakerData" -> MatchmakerData.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionPlacement]
    }
  }

  object GameSessionPlacementStateEnum {
    val PENDING = "PENDING"
    val FULFILLED = "FULFILLED"
    val CANCELLED = "CANCELLED"
    val TIMED_OUT = "TIMED_OUT"

    val values = IndexedSeq(PENDING, FULFILLED, CANCELLED, TIMED_OUT)
  }

  /**
   * <p>Configuration of a queue that is used to process game session placement requests. The queue configuration identifies several game features:</p> <ul> <li> <p>The destinations where a new game session can potentially be hosted. Amazon GameLift tries these destinations in an order based on either the queue's default order or player latency information, if provided in a placement request. With latency information, Amazon GameLift can place game sessions where the majority of players are reporting the lowest possible latency. </p> </li> <li> <p>The length of time that placement requests can wait in the queue before timing out. </p> </li> <li> <p>A set of optional latency policies that protect individual players from high latencies, preventing game sessions from being placed where any individual player is reporting latency higher than a policy's maximum.</p> </li> </ul> <p>Queue-related operations include:</p> <ul> <li> <p> <a>CreateGameSessionQueue</a> </p> </li> <li> <p> <a>DescribeGameSessionQueues</a> </p> </li> <li> <p> <a>UpdateGameSessionQueue</a> </p> </li> <li> <p> <a>DeleteGameSessionQueue</a> </p> </li> </ul>
   */
  @js.native
  trait GameSessionQueue extends js.Object {
    var Name: js.UndefOr[GameSessionQueueName]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
    var GameSessionQueueArn: js.UndefOr[ArnStringModel]
  }

  object GameSessionQueue {
    def apply(
      Name: js.UndefOr[GameSessionQueueName] = js.undefined,
      PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
      Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
      TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined,
      GameSessionQueueArn: js.UndefOr[ArnStringModel] = js.undefined): GameSessionQueue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PlayerLatencyPolicies" -> PlayerLatencyPolicies.map { x => x.asInstanceOf[js.Any] },
        "Destinations" -> Destinations.map { x => x.asInstanceOf[js.Any] },
        "TimeoutInSeconds" -> TimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "GameSessionQueueArn" -> GameSessionQueueArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionQueue]
    }
  }

  /**
   * <p>Fleet designated in a game session queue. Requests for new game sessions in the queue are fulfilled by starting a new game session on any destination configured for a queue. </p> <p>Queue-related operations include:</p> <ul> <li> <p> <a>CreateGameSessionQueue</a> </p> </li> <li> <p> <a>DescribeGameSessionQueues</a> </p> </li> <li> <p> <a>UpdateGameSessionQueue</a> </p> </li> <li> <p> <a>DeleteGameSessionQueue</a> </p> </li> </ul>
   */
  @js.native
  trait GameSessionQueueDestination extends js.Object {
    var DestinationArn: js.UndefOr[ArnStringModel]
  }

  object GameSessionQueueDestination {
    def apply(
      DestinationArn: js.UndefOr[ArnStringModel] = js.undefined): GameSessionQueueDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationArn" -> DestinationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionQueueDestination]
    }
  }

  object GameSessionStatusEnum {
    val ACTIVE = "ACTIVE"
    val ACTIVATING = "ACTIVATING"
    val TERMINATED = "TERMINATED"
    val TERMINATING = "TERMINATING"
    val ERROR = "ERROR"

    val values = IndexedSeq(ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR)
  }

  object GameSessionStatusReasonEnum {
    val INTERRUPTED = "INTERRUPTED"

    val values = IndexedSeq(INTERRUPTED)
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait GetGameSessionLogUrlInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
  }

  object GetGameSessionLogUrlInput {
    def apply(
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined): GetGameSessionLogUrlInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGameSessionLogUrlInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait GetGameSessionLogUrlOutput extends js.Object {
    var PreSignedUrl: js.UndefOr[NonZeroAndMaxString]
  }

  object GetGameSessionLogUrlOutput {
    def apply(
      PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined): GetGameSessionLogUrlOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGameSessionLogUrlOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait GetInstanceAccessInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object GetInstanceAccessInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): GetInstanceAccessInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait GetInstanceAccessOutput extends js.Object {
    var InstanceAccess: js.UndefOr[InstanceAccess]
  }

  object GetInstanceAccessOutput {
    def apply(
      InstanceAccess: js.UndefOr[InstanceAccess] = js.undefined): GetInstanceAccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceAccess" -> InstanceAccess.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessOutput]
    }
  }

  /**
   * <p>A game session with this custom ID string already exists in this fleet. Resolve this conflict before retrying this request.</p>
   */
  @js.native
  trait IdempotentParameterMismatchExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>Properties that describe an instance of a virtual computing resource that hosts one or more game servers. A fleet may contain zero or more instances.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var IpAddress: js.UndefOr[IpAddress]
    var InstanceId: js.UndefOr[InstanceId]
    var FleetId: js.UndefOr[FleetId]
    var Status: js.UndefOr[InstanceStatus]
    var Type: js.UndefOr[EC2InstanceType]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object Instance {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Status: js.UndefOr[InstanceStatus] = js.undefined,
      Type: js.UndefOr[EC2InstanceType] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Information required to remotely connect to a fleet instance. Access is requested by calling <a>GetInstanceAccess</a>. </p>
   */
  @js.native
  trait InstanceAccess extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var IpAddress: js.UndefOr[IpAddress]
    var InstanceId: js.UndefOr[InstanceId]
    var Credentials: js.UndefOr[InstanceCredentials]
    var FleetId: js.UndefOr[FleetId]
  }

  object InstanceAccess {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Credentials: js.UndefOr[InstanceCredentials] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined): InstanceAccess = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAccess]
    }
  }

  /**
   * <p>Set of credentials required to remotely access a fleet instance. Access credentials are requested by calling <a>GetInstanceAccess</a> and returned in an <a>InstanceAccess</a> object.</p>
   */
  @js.native
  trait InstanceCredentials extends js.Object {
    var UserName: js.UndefOr[NonEmptyString]
    var Secret: js.UndefOr[NonEmptyString]
  }

  object InstanceCredentials {
    def apply(
      UserName: js.UndefOr[NonEmptyString] = js.undefined,
      Secret: js.UndefOr[NonEmptyString] = js.undefined): InstanceCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Secret" -> Secret.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCredentials]
    }
  }

  object InstanceStatusEnum {
    val PENDING = "PENDING"
    val ACTIVE = "ACTIVE"
    val TERMINATING = "TERMINATING"

    val values = IndexedSeq(PENDING, ACTIVE, TERMINATING)
  }

  /**
   * <p>The service encountered an unrecoverable internal failure while processing the request. Clients can retry such requests immediately or after a waiting period.</p>
   */
  @js.native
  trait InternalServiceExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>The requested operation would cause a conflict with the current state of a resource associated with the request and/or the fleet. Resolve the conflict before retrying.</p>
   */
  @js.native
  trait InvalidFleetStatusExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>The requested operation would cause a conflict with the current state of a resource associated with the request and/or the game instance. Resolve the conflict before retrying.</p>
   */
  @js.native
  trait InvalidGameSessionStatusExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>One or more parameter values in the request are invalid. Correct the invalid parameter values before retrying.</p>
   */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>A range of IP addresses and port settings that allow inbound traffic to connect to server processes on Amazon GameLift. Each game session hosted on a fleet is assigned a unique combination of IP address and port number, which must fall into the fleet's allowed ranges. This combination is included in the <a>GameSession</a> object. </p>
   */
  @js.native
  trait IpPermission extends js.Object {
    var FromPort: js.UndefOr[PortNumber]
    var ToPort: js.UndefOr[PortNumber]
    var IpRange: js.UndefOr[NonBlankString]
    var Protocol: js.UndefOr[IpProtocol]
  }

  object IpPermission {
    def apply(
      FromPort: js.UndefOr[PortNumber] = js.undefined,
      ToPort: js.UndefOr[PortNumber] = js.undefined,
      IpRange: js.UndefOr[NonBlankString] = js.undefined,
      Protocol: js.UndefOr[IpProtocol] = js.undefined): IpPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "IpRange" -> IpRange.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpPermission]
    }
  }

  object IpProtocolEnum {
    val TCP = "TCP"
    val UDP = "UDP"

    val values = IndexedSeq(TCP, UDP)
  }

  /**
   * <p>The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue before retrying.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait ListAliasesInput extends js.Object {
    var RoutingStrategyType: js.UndefOr[RoutingStrategyType]
    var Name: js.UndefOr[NonEmptyString]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListAliasesInput {
    def apply(
      RoutingStrategyType: js.UndefOr[RoutingStrategyType] = js.undefined,
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): ListAliasesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoutingStrategyType" -> RoutingStrategyType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait ListAliasesOutput extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListAliasesOutput {
    def apply(
      Aliases: js.UndefOr[AliasList] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): ListAliasesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait ListBuildsInput extends js.Object {
    var Status: js.UndefOr[BuildStatus]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListBuildsInput {
    def apply(
      Status: js.UndefOr[BuildStatus] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): ListBuildsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBuildsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait ListBuildsOutput extends js.Object {
    var Builds: js.UndefOr[BuildList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListBuildsOutput {
    def apply(
      Builds: js.UndefOr[BuildList] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): ListBuildsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Builds" -> Builds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBuildsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait ListFleetsInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListFleetsInput {
    def apply(
      BuildId: js.UndefOr[BuildId] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): ListFleetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFleetsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait ListFleetsOutput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListFleetsOutput {
    def apply(
      FleetIds: js.UndefOr[FleetIdList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): ListFleetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFleetsOutput]
    }
  }

  /**
   * <p>Represents a new player session that is created as a result of a successful FlexMatch match. A successful match automatically creates new player sessions for every player ID in the original matchmaking request. </p> <p>When players connect to the match's game session, they must include both player ID and player session ID in order to claim their assigned player slot.</p>
   */
  @js.native
  trait MatchedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  object MatchedPlayerSession {
    def apply(
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined): MatchedPlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionId" -> PlayerSessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchedPlayerSession]
    }
  }

  /**
   * <p>Guidelines for use with FlexMatch to match players into games. All matchmaking requests must specify a matchmaking configuration.</p>
   */
  @js.native
  trait MatchmakingConfiguration extends js.Object {
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var GameSessionData: js.UndefOr[GameSessionData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var CustomEventData: js.UndefOr[CustomEventData]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object MatchmakingConfiguration {
    def apply(
      Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
      AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
      RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
      GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
      AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
      NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): MatchmakingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "CustomEventData" -> CustomEventData.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceTimeoutSeconds" -> AcceptanceTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] },
        "GameSessionQueueArns" -> GameSessionQueueArns.map { x => x.asInstanceOf[js.Any] },
        "AdditionalPlayerCount" -> AdditionalPlayerCount.map { x => x.asInstanceOf[js.Any] },
        "NotificationTarget" -> NotificationTarget.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchmakingConfiguration]
    }
  }

  object MatchmakingConfigurationStatusEnum {
    val CANCELLED = "CANCELLED"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val PLACING = "PLACING"
    val QUEUED = "QUEUED"
    val REQUIRES_ACCEPTANCE = "REQUIRES_ACCEPTANCE"
    val SEARCHING = "SEARCHING"
    val TIMED_OUT = "TIMED_OUT"

    val values = IndexedSeq(CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
  }

  /**
   * <p>Set of rule statements, used with FlexMatch, that determine how to build a certain kind of player match. Each rule set describes a type of group to be created and defines the parameters for acceptable player matches. Rule sets are used in <a>MatchmakingConfiguration</a> objects.</p> <p>A rule set may define the following elements for a match. For detailed information and examples showing how to construct a rule set, see <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html">Build a FlexMatch Rule Set</a>. </p> <ul> <li> <p>Teams -- Required. A rule set must define one or multiple teams for the match and set minimum and maximum team sizes. For example, a rule set might describe a 4x4 match that requires all eight slots to be filled. </p> </li> <li> <p>Player attributes -- Optional. These attributes specify a set of player characteristics to evaluate when looking for a match. Matchmaking requests that use a rule set with player attributes must provide the corresponding attribute values. For example, an attribute might specify a player's skill or level.</p> </li> <li> <p>Rules -- Optional. Rules define how to evaluate potential players for a match based on player attributes. A rule might specify minimum requirements for individual players, teams, or entire matches. For example, a rule might require each player to meet a certain skill level, each team to have at least one player in a certain role, or the match to have a minimum average skill level. or may describe an entire group--such as all teams must be evenly matched or have at least one player in a certain role. </p> </li> <li> <p>Expansions -- Optional. Expansions allow you to relax the rules after a period of time when no acceptable matches are found. This feature lets you balance getting players into games in a reasonable amount of time instead of making them wait indefinitely for the best possible match. For example, you might use an expansion to increase the maximum skill variance between players after 30 seconds.</p> </li> </ul>
   */
  @js.native
  trait MatchmakingRuleSet extends js.Object {
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
    var RuleSetBody: js.UndefOr[RuleSetBody]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object MatchmakingRuleSet {
    def apply(
      RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      RuleSetBody: js.UndefOr[RuleSetBody] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): MatchmakingRuleSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "RuleSetBody" -> RuleSetBody.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchmakingRuleSet]
    }
  }

  /**
   * <p>Ticket generated to track the progress of a matchmaking request. Each ticket is uniquely identified by a ticket ID, supplied by the requester, when creating a matchmaking request with <a>StartMatchmaking</a>. Tickets can be retrieved by calling <a>DescribeMatchmaking</a> with the ticket ID.</p>
   */
  @js.native
  trait MatchmakingTicket extends js.Object {
    var StatusMessage: js.UndefOr[StringModel]
    var EstimatedWaitTime: js.UndefOr[WholeNumber]
    var Players: js.UndefOr[PlayerList]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
    var StatusReason: js.UndefOr[StringModel]
    var GameSessionConnectionInfo: js.UndefOr[GameSessionConnectionInfo]
    var ConfigurationName: js.UndefOr[MatchmakingIdStringModel]
    var Status: js.UndefOr[MatchmakingConfigurationStatus]
  }

  object MatchmakingTicket {
    def apply(
      StatusMessage: js.UndefOr[StringModel] = js.undefined,
      EstimatedWaitTime: js.UndefOr[WholeNumber] = js.undefined,
      Players: js.UndefOr[PlayerList] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      StatusReason: js.UndefOr[StringModel] = js.undefined,
      GameSessionConnectionInfo: js.UndefOr[GameSessionConnectionInfo] = js.undefined,
      ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      Status: js.UndefOr[MatchmakingConfigurationStatus] = js.undefined): MatchmakingTicket = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "EstimatedWaitTime" -> EstimatedWaitTime.map { x => x.asInstanceOf[js.Any] },
        "Players" -> Players.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "TicketId" -> TicketId.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] },
        "GameSessionConnectionInfo" -> GameSessionConnectionInfo.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationName" -> ConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchmakingTicket]
    }
  }

  object MetricNameEnum {
    val ActivatingGameSessions = "ActivatingGameSessions"
    val ActiveGameSessions = "ActiveGameSessions"
    val ActiveInstances = "ActiveInstances"
    val AvailableGameSessions = "AvailableGameSessions"
    val AvailablePlayerSessions = "AvailablePlayerSessions"
    val CurrentPlayerSessions = "CurrentPlayerSessions"
    val IdleInstances = "IdleInstances"
    val PercentAvailableGameSessions = "PercentAvailableGameSessions"
    val PercentIdleInstances = "PercentIdleInstances"
    val QueueDepth = "QueueDepth"
    val WaitTime = "WaitTime"

    val values = IndexedSeq(ActivatingGameSessions, ActiveGameSessions, ActiveInstances, AvailableGameSessions, AvailablePlayerSessions, CurrentPlayerSessions, IdleInstances, PercentAvailableGameSessions, PercentIdleInstances, QueueDepth, WaitTime)
  }

  /**
   * <p>A service resource associated with the request could not be found. Clients should not retry such requests.</p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  object OperatingSystemEnum {
    val WINDOWS_2012 = "WINDOWS_2012"
    val AMAZON_LINUX = "AMAZON_LINUX"

    val values = IndexedSeq(WINDOWS_2012, AMAZON_LINUX)
  }

  /**
   * <p>Information about a player session that was created as part of a <a>StartGameSessionPlacement</a> request. This object contains only the player ID and player session ID. To retrieve full details on a player session, call <a>DescribePlayerSessions</a> with the player session ID.</p> <p>Player-session-related operations include:</p> <ul> <li> <p> <a>CreatePlayerSession</a> </p> </li> <li> <p> <a>CreatePlayerSessions</a> </p> </li> <li> <p> <a>DescribePlayerSessions</a> </p> </li> <li> <p>Game session placements</p> <ul> <li> <p> <a>StartGameSessionPlacement</a> </p> </li> <li> <p> <a>DescribeGameSessionPlacement</a> </p> </li> <li> <p> <a>StopGameSessionPlacement</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait PlacedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  object PlacedPlayerSession {
    def apply(
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined): PlacedPlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionId" -> PlayerSessionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacedPlayerSession]
    }
  }

  /**
   * <p>Represents a player in matchmaking. When starting a matchmaking request, a player has a player ID, attributes, and may have latency data. Team information is added after a match has been successfully completed.</p>
   */
  @js.native
  trait Player extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerAttributes: js.UndefOr[PlayerAttributeMap]
    var Team: js.UndefOr[NonZeroAndMaxString]
    var LatencyInMs: js.UndefOr[LatencyMap]
  }

  object Player {
    def apply(
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.undefined,
      Team: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      LatencyInMs: js.UndefOr[LatencyMap] = js.undefined): Player = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "PlayerAttributes" -> PlayerAttributes.map { x => x.asInstanceOf[js.Any] },
        "Team" -> Team.map { x => x.asInstanceOf[js.Any] },
        "LatencyInMs" -> LatencyInMs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Player]
    }
  }

  /**
   * <p>Regional latency information for a player, used when requesting a new game session with <a>StartGameSessionPlacement</a>. This value indicates the amount of time lag that exists when the player is connected to a fleet in the specified region. The relative difference between a player's latency values for multiple regions are used to determine which fleets are best suited to place a new game session for the player. </p>
   */
  @js.native
  trait PlayerLatency extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var RegionIdentifier: js.UndefOr[NonZeroAndMaxString]
    var LatencyInMilliseconds: js.UndefOr[Float]
  }

  object PlayerLatency {
    def apply(
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      LatencyInMilliseconds: js.UndefOr[Float] = js.undefined): PlayerLatency = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "RegionIdentifier" -> RegionIdentifier.map { x => x.asInstanceOf[js.Any] },
        "LatencyInMilliseconds" -> LatencyInMilliseconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayerLatency]
    }
  }

  /**
   * <p>Queue setting that determines the highest latency allowed for individual players when placing a game session. When a latency policy is in force, a game session cannot be placed at any destination in a region where a player is reporting latency higher than the cap. Latency policies are only enforced when the placement request contains player latency information.</p> <p>Queue-related operations include:</p> <ul> <li> <p> <a>CreateGameSessionQueue</a> </p> </li> <li> <p> <a>DescribeGameSessionQueues</a> </p> </li> <li> <p> <a>UpdateGameSessionQueue</a> </p> </li> <li> <p> <a>DeleteGameSessionQueue</a> </p> </li> </ul>
   */
  @js.native
  trait PlayerLatencyPolicy extends js.Object {
    var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber]
    var PolicyDurationSeconds: js.UndefOr[WholeNumber]
  }

  object PlayerLatencyPolicy {
    def apply(
      MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined,
      PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined): PlayerLatencyPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaximumIndividualPlayerLatencyMilliseconds" -> MaximumIndividualPlayerLatencyMilliseconds.map { x => x.asInstanceOf[js.Any] },
        "PolicyDurationSeconds" -> PolicyDurationSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayerLatencyPolicy]
    }
  }

  /**
   * <p>Properties describing a player session. Player session objects are created either by creating a player session for a specific game session, or as part of a game session placement. A player session represents either a player reservation for a game session (status <code>RESERVED</code>) or actual player activity in a game session (status <code>ACTIVE</code>). A player session object (including player data) is automatically passed to a game session when the player connects to the game session and is validated.</p> <p>When a player disconnects, the player session status changes to <code>COMPLETED</code>. Once the session ends, the player session object is retained for 30 days and then removed.</p> <p>Player-session-related operations include:</p> <ul> <li> <p> <a>CreatePlayerSession</a> </p> </li> <li> <p> <a>CreatePlayerSessions</a> </p> </li> <li> <p> <a>DescribePlayerSessions</a> </p> </li> <li> <p>Game session placements</p> <ul> <li> <p> <a>StartGameSessionPlacement</a> </p> </li> <li> <p> <a>DescribeGameSessionPlacement</a> </p> </li> <li> <p> <a>StopGameSessionPlacement</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait PlayerSession extends js.Object {
    var GameSessionId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
    var TerminationTime: js.UndefOr[Timestamp]
    var PlayerData: js.UndefOr[PlayerData]
    var IpAddress: js.UndefOr[IpAddress]
    var Port: js.UndefOr[PortNumber]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var Status: js.UndefOr[PlayerSessionStatus]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object PlayerSession {
    def apply(
      GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined,
      TerminationTime: js.UndefOr[Timestamp] = js.undefined,
      PlayerData: js.UndefOr[PlayerData] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      Port: js.UndefOr[PortNumber] = js.undefined,
      PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Status: js.UndefOr[PlayerSessionStatus] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): PlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionId" -> PlayerSessionId.map { x => x.asInstanceOf[js.Any] },
        "TerminationTime" -> TerminationTime.map { x => x.asInstanceOf[js.Any] },
        "PlayerData" -> PlayerData.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PlayerId" -> PlayerId.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayerSession]
    }
  }

  object PlayerSessionCreationPolicyEnum {
    val ACCEPT_ALL = "ACCEPT_ALL"
    val DENY_ALL = "DENY_ALL"

    val values = IndexedSeq(ACCEPT_ALL, DENY_ALL)
  }

  object PlayerSessionStatusEnum {
    val RESERVED = "RESERVED"
    val ACTIVE = "ACTIVE"
    val COMPLETED = "COMPLETED"
    val TIMEDOUT = "TIMEDOUT"

    val values = IndexedSeq(RESERVED, ACTIVE, COMPLETED, TIMEDOUT)
  }

  object PolicyTypeEnum {
    val RuleBased = "RuleBased"
    val TargetBased = "TargetBased"

    val values = IndexedSeq(RuleBased, TargetBased)
  }

  object ProtectionPolicyEnum {
    val NoProtection = "NoProtection"
    val FullProtection = "FullProtection"

    val values = IndexedSeq(NoProtection, FullProtection)
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait PutScalingPolicyInput extends js.Object {
    var PolicyType: js.UndefOr[PolicyType]
    var Threshold: js.UndefOr[Double]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var ScalingAdjustment: js.UndefOr[Int]
    var ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType]
    var EvaluationPeriods: js.UndefOr[PositiveInteger]
    var ComparisonOperator: js.UndefOr[ComparisonOperatorType]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
    var FleetId: js.UndefOr[FleetId]
    var MetricName: js.UndefOr[MetricName]
  }

  object PutScalingPolicyInput {
    def apply(
      PolicyType: js.UndefOr[PolicyType] = js.undefined,
      Threshold: js.UndefOr[Double] = js.undefined,
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      ScalingAdjustment: js.UndefOr[Int] = js.undefined,
      ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType] = js.undefined,
      EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined,
      TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): PutScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "Threshold" -> Threshold.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustment" -> ScalingAdjustment.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustmentType" -> ScalingAdjustmentType.map { x => x.asInstanceOf[js.Any] },
        "EvaluationPeriods" -> EvaluationPeriods.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "TargetConfiguration" -> TargetConfiguration.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait PutScalingPolicyOutput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
  }

  object PutScalingPolicyOutput {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined): PutScalingPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait RequestUploadCredentialsInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
  }

  object RequestUploadCredentialsInput {
    def apply(
      BuildId: js.UndefOr[BuildId] = js.undefined): RequestUploadCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestUploadCredentialsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait RequestUploadCredentialsOutput extends js.Object {
    var UploadCredentials: js.UndefOr[AwsCredentials]
    var StorageLocation: js.UndefOr[S3Location]
  }

  object RequestUploadCredentialsOutput {
    def apply(
      UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined,
      StorageLocation: js.UndefOr[S3Location] = js.undefined): RequestUploadCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UploadCredentials" -> UploadCredentials.map { x => x.asInstanceOf[js.Any] },
        "StorageLocation" -> StorageLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestUploadCredentialsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait ResolveAliasInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
  }

  object ResolveAliasInput {
    def apply(
      AliasId: js.UndefOr[AliasId] = js.undefined): ResolveAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveAliasInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait ResolveAliasOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object ResolveAliasOutput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): ResolveAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveAliasOutput]
    }
  }

  /**
   * <p>Policy that limits the number of game sessions a player can create on the same fleet. This optional policy gives game owners control over how players can consume available game server resources. A resource creation policy makes the following statement: "An individual player can create a maximum number of new game sessions within a specified time period".</p> <p>The policy is evaluated when a player tries to create a new game session. For example, with a policy of 10 new game sessions and a time period of 60 minutes, on receiving a <code>CreateGameSession</code> request, Amazon GameLift checks that the player (identified by <code>CreatorId</code>) has created fewer than 10 game sessions in the past 60 minutes.</p>
   */
  @js.native
  trait ResourceCreationLimitPolicy extends js.Object {
    var NewGameSessionsPerCreator: js.UndefOr[WholeNumber]
    var PolicyPeriodInMinutes: js.UndefOr[WholeNumber]
  }

  object ResourceCreationLimitPolicy {
    def apply(
      NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined,
      PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined): ResourceCreationLimitPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewGameSessionsPerCreator" -> NewGameSessionsPerCreator.map { x => x.asInstanceOf[js.Any] },
        "PolicyPeriodInMinutes" -> PolicyPeriodInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceCreationLimitPolicy]
    }
  }

  /**
   * <p>Routing configuration for a fleet alias.</p> <p>Fleet-related operations include:</p> <ul> <li> <p> <a>CreateFleet</a> </p> </li> <li> <p> <a>ListFleets</a> </p> </li> <li> <p> <a>DeleteFleet</a> </p> </li> <li> <p>Describe fleets:</p> <ul> <li> <p> <a>DescribeFleetAttributes</a> </p> </li> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>DescribeFleetPortSettings</a> </p> </li> <li> <p> <a>DescribeFleetUtilization</a> </p> </li> <li> <p> <a>DescribeRuntimeConfiguration</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p> <a>DescribeFleetEvents</a> </p> </li> </ul> </li> <li> <p>Update fleets:</p> <ul> <li> <p> <a>UpdateFleetAttributes</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetPortSettings</a> </p> </li> <li> <p> <a>UpdateRuntimeConfiguration</a> </p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait RoutingStrategy extends js.Object {
    var Type: js.UndefOr[RoutingStrategyType]
    var FleetId: js.UndefOr[FleetId]
    var Message: js.UndefOr[FreeText]
  }

  object RoutingStrategy {
    def apply(
      Type: js.UndefOr[RoutingStrategyType] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Message: js.UndefOr[FreeText] = js.undefined): RoutingStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoutingStrategy]
    }
  }

  object RoutingStrategyTypeEnum {
    val SIMPLE = "SIMPLE"
    val TERMINAL = "TERMINAL"

    val values = IndexedSeq(SIMPLE, TERMINAL)
  }

  /**
   * <p>A collection of server process configurations that describe what processes to run on each instance in a fleet. All fleets must have a run-time configuration. Each instance in the fleet launches the server processes specified in the run-time configuration and launches new ones as existing processes end. Each instance regularly checks for an updated run-time configuration and follows the new instructions. </p> <p>The run-time configuration enables the instances in a fleet to run multiple processes simultaneously. Potential scenarios are as follows: (1) Run multiple processes of a single game server executable to maximize usage of your hosting resources. (2) Run one or more processes of different build executables, such as your game server executable and a related program, or two or more different versions of a game server. (3) Run multiple processes of a single game server but with different launch parameters, for example to run one process on each instance in debug mode.</p> <p>A Amazon GameLift instance is limited to 50 processes running simultaneously. A run-time configuration must specify fewer than this limit. To calculate the total number of processes specified in a run-time configuration, add the values of the <code>ConcurrentExecutions</code> parameter for each <code> <a>ServerProcess</a> </code> object in the run-time configuration.</p> <p>Fleet-related operations include:</p> <ul> <li> <p> <a>CreateFleet</a> </p> </li> <li> <p> <a>ListFleets</a> </p> </li> <li> <p> <a>DeleteFleet</a> </p> </li> <li> <p>Describe fleets:</p> <ul> <li> <p> <a>DescribeFleetAttributes</a> </p> </li> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>DescribeFleetPortSettings</a> </p> </li> <li> <p> <a>DescribeFleetUtilization</a> </p> </li> <li> <p> <a>DescribeRuntimeConfiguration</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p> <a>DescribeFleetEvents</a> </p> </li> </ul> </li> <li> <p>Update fleets:</p> <ul> <li> <p> <a>UpdateFleetAttributes</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetPortSettings</a> </p> </li> <li> <p> <a>UpdateRuntimeConfiguration</a> </p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait RuntimeConfiguration extends js.Object {
    var ServerProcesses: js.UndefOr[ServerProcessList]
    var MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations]
    var GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds]
  }

  object RuntimeConfiguration {
    def apply(
      ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined,
      MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations] = js.undefined,
      GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds] = js.undefined): RuntimeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerProcesses" -> ServerProcesses.map { x => x.asInstanceOf[js.Any] },
        "MaxConcurrentGameSessionActivations" -> MaxConcurrentGameSessionActivations.map { x => x.asInstanceOf[js.Any] },
        "GameSessionActivationTimeoutSeconds" -> GameSessionActivationTimeoutSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuntimeConfiguration]
    }
  }

  /**
   * <p>Location in Amazon Simple Storage Service (Amazon S3) where build files can be stored for access by Amazon GameLift. This location is specified in a <a>CreateBuild</a> request. For more details, see the <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build">Create a Build with Files in Amazon S3</a>.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var Bucket: js.UndefOr[NonEmptyString]
    var Key: js.UndefOr[NonEmptyString]
    var RoleArn: js.UndefOr[NonEmptyString]
  }

  object S3Location {
    def apply(
      Bucket: js.UndefOr[NonEmptyString] = js.undefined,
      Key: js.UndefOr[NonEmptyString] = js.undefined,
      RoleArn: js.UndefOr[NonEmptyString] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  object ScalingAdjustmentTypeEnum {
    val ChangeInCapacity = "ChangeInCapacity"
    val ExactCapacity = "ExactCapacity"
    val PercentChangeInCapacity = "PercentChangeInCapacity"

    val values = IndexedSeq(ChangeInCapacity, ExactCapacity, PercentChangeInCapacity)
  }

  /**
   * <p>Rule that controls how a fleet is scaled. Scaling policies are uniquely identified by the combination of name and fleet ID.</p> <p>Operations related to fleet capacity scaling include:</p> <ul> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p>Manage scaling policies:</p> <ul> <li> <p> <a>PutScalingPolicy</a> (auto-scaling)</p> </li> <li> <p> <a>DescribeScalingPolicies</a> (auto-scaling)</p> </li> <li> <p> <a>DeleteScalingPolicy</a> (auto-scaling)</p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait ScalingPolicy extends js.Object {
    var PolicyType: js.UndefOr[PolicyType]
    var Threshold: js.UndefOr[Double]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var ScalingAdjustment: js.UndefOr[Int]
    var ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType]
    var EvaluationPeriods: js.UndefOr[PositiveInteger]
    var ComparisonOperator: js.UndefOr[ComparisonOperatorType]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
    var FleetId: js.UndefOr[FleetId]
    var MetricName: js.UndefOr[MetricName]
    var Status: js.UndefOr[ScalingStatusType]
  }

  object ScalingPolicy {
    def apply(
      PolicyType: js.UndefOr[PolicyType] = js.undefined,
      Threshold: js.UndefOr[Double] = js.undefined,
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      ScalingAdjustment: js.UndefOr[Int] = js.undefined,
      ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType] = js.undefined,
      EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined,
      TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Status: js.UndefOr[ScalingStatusType] = js.undefined): ScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "Threshold" -> Threshold.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustment" -> ScalingAdjustment.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustmentType" -> ScalingAdjustmentType.map { x => x.asInstanceOf[js.Any] },
        "EvaluationPeriods" -> EvaluationPeriods.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "TargetConfiguration" -> TargetConfiguration.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingPolicy]
    }
  }

  object ScalingStatusTypeEnum {
    val ACTIVE = "ACTIVE"
    val UPDATE_REQUESTED = "UPDATE_REQUESTED"
    val UPDATING = "UPDATING"
    val DELETE_REQUESTED = "DELETE_REQUESTED"
    val DELETING = "DELETING"
    val DELETED = "DELETED"
    val ERROR = "ERROR"

    val values = IndexedSeq(ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR)
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait SearchGameSessionsInput extends js.Object {
    var SortExpression: js.UndefOr[NonZeroAndMaxString]
    var Limit: js.UndefOr[PositiveInteger]
    var AliasId: js.UndefOr[AliasId]
    var FilterExpression: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object SearchGameSessionsInput {
    def apply(
      SortExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      Limit: js.UndefOr[PositiveInteger] = js.undefined,
      AliasId: js.UndefOr[AliasId] = js.undefined,
      FilterExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): SearchGameSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SortExpression" -> SortExpression.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchGameSessionsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait SearchGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object SearchGameSessionsOutput {
    def apply(
      GameSessions: js.UndefOr[GameSessionList] = js.undefined,
      NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined): SearchGameSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessions" -> GameSessions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchGameSessionsOutput]
    }
  }

  /**
   * <p>A set of instructions for launching server processes on each instance in a fleet. Each instruction set identifies the location of the server executable, optional launch parameters, and the number of server processes with this configuration to maintain concurrently on the instance. Server process configurations make up a fleet's <code> <a>RuntimeConfiguration</a> </code>.</p>
   */
  @js.native
  trait ServerProcess extends js.Object {
    var LaunchPath: js.UndefOr[NonZeroAndMaxString]
    var Parameters: js.UndefOr[NonZeroAndMaxString]
    var ConcurrentExecutions: js.UndefOr[PositiveInteger]
  }

  object ServerProcess {
    def apply(
      LaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      Parameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      ConcurrentExecutions: js.UndefOr[PositiveInteger] = js.undefined): ServerProcess = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchPath" -> LaunchPath.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ConcurrentExecutions" -> ConcurrentExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerProcess]
    }
  }

  @js.native
  trait StartFleetActionsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var Actions: js.UndefOr[FleetActionList]
  }

  object StartFleetActionsInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Actions: js.UndefOr[FleetActionList] = js.undefined): StartFleetActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetActionsInput]
    }
  }

  @js.native
  trait StartFleetActionsOutput extends js.Object {

  }

  object StartFleetActionsOutput {
    def apply(): StartFleetActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetActionsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait StartGameSessionPlacementInput extends js.Object {
    var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var PlayerLatencies: js.UndefOr[PlayerLatencyList]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var PlacementId: js.UndefOr[IdStringModel]
    var GameSessionName: js.UndefOr[NonZeroAndMaxString]
    var GameSessionQueueName: js.UndefOr[GameSessionQueueName]
    var GameProperties: js.UndefOr[GamePropertyList]
  }

  object StartGameSessionPlacementInput {
    def apply(
      DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined,
      MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      PlacementId: js.UndefOr[IdStringModel] = js.undefined,
      GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionQueueName: js.UndefOr[GameSessionQueueName] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined): StartGameSessionPlacementInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DesiredPlayerSessions" -> DesiredPlayerSessions.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "PlayerLatencies" -> PlayerLatencies.map { x => x.asInstanceOf[js.Any] },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "PlacementId" -> PlacementId.map { x => x.asInstanceOf[js.Any] },
        "GameSessionName" -> GameSessionName.map { x => x.asInstanceOf[js.Any] },
        "GameSessionQueueName" -> GameSessionQueueName.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGameSessionPlacementInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait StartGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object StartGameSessionPlacementOutput {
    def apply(
      GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined): StartGameSessionPlacementOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionPlacement" -> GameSessionPlacement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGameSessionPlacementOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait StartMatchBackfillInput extends js.Object {
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
    var ConfigurationName: js.UndefOr[MatchmakingIdStringModel]
    var GameSessionArn: js.UndefOr[ArnStringModel]
    var Players: js.UndefOr[PlayerList]
  }

  object StartMatchBackfillInput {
    def apply(
      TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined,
      Players: js.UndefOr[PlayerList] = js.undefined): StartMatchBackfillInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketId" -> TicketId.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationName" -> ConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "GameSessionArn" -> GameSessionArn.map { x => x.asInstanceOf[js.Any] },
        "Players" -> Players.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchBackfillInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait StartMatchBackfillOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  object StartMatchBackfillOutput {
    def apply(
      MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined): StartMatchBackfillOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchmakingTicket" -> MatchmakingTicket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchBackfillOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait StartMatchmakingInput extends js.Object {
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
    var ConfigurationName: js.UndefOr[MatchmakingIdStringModel]
    var Players: js.UndefOr[PlayerList]
  }

  object StartMatchmakingInput {
    def apply(
      TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      Players: js.UndefOr[PlayerList] = js.undefined): StartMatchmakingInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketId" -> TicketId.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationName" -> ConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "Players" -> Players.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchmakingInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait StartMatchmakingOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  object StartMatchmakingOutput {
    def apply(
      MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined): StartMatchmakingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchmakingTicket" -> MatchmakingTicket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchmakingOutput]
    }
  }

  @js.native
  trait StopFleetActionsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var Actions: js.UndefOr[FleetActionList]
  }

  object StopFleetActionsInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Actions: js.UndefOr[FleetActionList] = js.undefined): StopFleetActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetActionsInput]
    }
  }

  @js.native
  trait StopFleetActionsOutput extends js.Object {

  }

  object StopFleetActionsOutput {
    def apply(): StopFleetActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetActionsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait StopGameSessionPlacementInput extends js.Object {
    var PlacementId: js.UndefOr[IdStringModel]
  }

  object StopGameSessionPlacementInput {
    def apply(
      PlacementId: js.UndefOr[IdStringModel] = js.undefined): StopGameSessionPlacementInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlacementId" -> PlacementId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopGameSessionPlacementInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait StopGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object StopGameSessionPlacementOutput {
    def apply(
      GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined): StopGameSessionPlacementOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionPlacement" -> GameSessionPlacement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopGameSessionPlacementOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait StopMatchmakingInput extends js.Object {
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  object StopMatchmakingInput {
    def apply(
      TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined): StopMatchmakingInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketId" -> TicketId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopMatchmakingInput]
    }
  }

  @js.native
  trait StopMatchmakingOutput extends js.Object {

  }

  object StopMatchmakingOutput {
    def apply(): StopMatchmakingOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopMatchmakingOutput]
    }
  }

  /**
   * <p>Settings for a target-based scaling policy (see <a>ScalingPolicy</a>. A target-based policy tracks a particular fleet metric specifies a target value for the metric. As player usage changes, the policy triggers Amazon GameLift to adjust capacity so that the metric returns to the target value. The target configuration specifies settings as needed for the target based policy, including the target value. </p> <p>Operations related to fleet capacity scaling include:</p> <ul> <li> <p> <a>DescribeFleetCapacity</a> </p> </li> <li> <p> <a>UpdateFleetCapacity</a> </p> </li> <li> <p> <a>DescribeEC2InstanceLimits</a> </p> </li> <li> <p>Manage scaling policies:</p> <ul> <li> <p> <a>PutScalingPolicy</a> (auto-scaling)</p> </li> <li> <p> <a>DescribeScalingPolicies</a> (auto-scaling)</p> </li> <li> <p> <a>DeleteScalingPolicy</a> (auto-scaling)</p> </li> </ul> </li> <li> <p>Manage fleet actions:</p> <ul> <li> <p> <a>StartFleetActions</a> </p> </li> <li> <p> <a>StopFleetActions</a> </p> </li> </ul> </li> </ul>
   */
  @js.native
  trait TargetConfiguration extends js.Object {
    var TargetValue: js.UndefOr[Double]
  }

  object TargetConfiguration {
    def apply(
      TargetValue: js.UndefOr[Double] = js.undefined): TargetConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetValue" -> TargetValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetConfiguration]
    }
  }

  /**
   * <p>The service is unable to resolve the routing for a particular alias because it has a terminal <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined in the routing strategy itself. Such requests should only be retried if the routing strategy for the specified alias is modified. </p>
   */
  @js.native
  trait TerminalRoutingStrategyExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>The client failed authentication. Clients should not retry such requests.</p>
   */
  @js.native
  trait UnauthorizedExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>The requested operation is not supported in the region specified.</p>
   */
  @js.native
  trait UnsupportedRegionExceptionException extends js.Object {
    val Message: NonEmptyString
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateAliasInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  object UpdateAliasInput {
    def apply(
      AliasId: js.UndefOr[AliasId] = js.undefined,
      Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined): UpdateAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RoutingStrategy" -> RoutingStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object UpdateAliasOutput {
    def apply(
      Alias: js.UndefOr[Alias] = js.undefined): UpdateAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateBuildInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  object UpdateBuildInput {
    def apply(
      BuildId: js.UndefOr[BuildId] = js.undefined,
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      Version: js.UndefOr[NonZeroAndMaxString] = js.undefined): UpdateBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBuildInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  object UpdateBuildOutput {
    def apply(
      Build: js.UndefOr[Build] = js.undefined): UpdateBuildOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Build" -> Build.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBuildOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateFleetAttributesInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetAttributesInput {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
      MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined): UpdateFleetAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NewGameSessionProtectionPolicy" -> NewGameSessionProtectionPolicy.map { x => x.asInstanceOf[js.Any] },
        "MetricGroups" -> MetricGroups.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ResourceCreationLimitPolicy" -> ResourceCreationLimitPolicy.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetAttributesInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateFleetAttributesOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetAttributesOutput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): UpdateFleetAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetAttributesOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateFleetCapacityInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var DesiredInstances: js.UndefOr[WholeNumber]
    var MinSize: js.UndefOr[WholeNumber]
    var MaxSize: js.UndefOr[WholeNumber]
  }

  object UpdateFleetCapacityInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      DesiredInstances: js.UndefOr[WholeNumber] = js.undefined,
      MinSize: js.UndefOr[WholeNumber] = js.undefined,
      MaxSize: js.UndefOr[WholeNumber] = js.undefined): UpdateFleetCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "DesiredInstances" -> DesiredInstances.map { x => x.asInstanceOf[js.Any] },
        "MinSize" -> MinSize.map { x => x.asInstanceOf[js.Any] },
        "MaxSize" -> MaxSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetCapacityInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateFleetCapacityOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetCapacityOutput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): UpdateFleetCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetCapacityOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateFleetPortSettingsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList]
    var InboundPermissionRevocations: js.UndefOr[IpPermissionsList]
  }

  object UpdateFleetPortSettingsInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.undefined,
      InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.undefined): UpdateFleetPortSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "InboundPermissionAuthorizations" -> InboundPermissionAuthorizations.map { x => x.asInstanceOf[js.Any] },
        "InboundPermissionRevocations" -> InboundPermissionRevocations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetPortSettingsInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateFleetPortSettingsOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetPortSettingsOutput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined): UpdateFleetPortSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetPortSettingsOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateGameSessionInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  object UpdateGameSessionInput {
    def apply(
      Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
      PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined,
      MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
      ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined): UpdateGameSessionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "GameSessionId" -> GameSessionId.map { x => x.asInstanceOf[js.Any] },
        "PlayerSessionCreationPolicy" -> PlayerSessionCreationPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x => x.asInstanceOf[js.Any] },
        "ProtectionPolicy" -> ProtectionPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  object UpdateGameSessionOutput {
    def apply(
      GameSession: js.UndefOr[GameSession] = js.undefined): UpdateGameSessionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSession" -> GameSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateGameSessionQueueInput extends js.Object {
    var Name: js.UndefOr[GameSessionQueueName]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
  }

  object UpdateGameSessionQueueInput {
    def apply(
      Name: js.UndefOr[GameSessionQueueName] = js.undefined,
      TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined,
      PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
      Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined): UpdateGameSessionQueueInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TimeoutInSeconds" -> TimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "PlayerLatencyPolicies" -> PlayerLatencyPolicies.map { x => x.asInstanceOf[js.Any] },
        "Destinations" -> Destinations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionQueueInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  object UpdateGameSessionQueueOutput {
    def apply(
      GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined): UpdateGameSessionQueueOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueue" -> GameSessionQueue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionQueueOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateMatchmakingConfigurationInput extends js.Object {
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var GameSessionData: js.UndefOr[GameSessionData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var CustomEventData: js.UndefOr[CustomEventData]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
  }

  object UpdateMatchmakingConfigurationInput {
    def apply(
      Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
      AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
      GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
      Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
      AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
      RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
      GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
      GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
      AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
      NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined): UpdateMatchmakingConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "GameSessionData" -> GameSessionData.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "CustomEventData" -> CustomEventData.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceTimeoutSeconds" -> AcceptanceTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "GameProperties" -> GameProperties.map { x => x.asInstanceOf[js.Any] },
        "GameSessionQueueArns" -> GameSessionQueueArns.map { x => x.asInstanceOf[js.Any] },
        "AdditionalPlayerCount" -> AdditionalPlayerCount.map { x => x.asInstanceOf[js.Any] },
        "NotificationTarget" -> NotificationTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMatchmakingConfigurationInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  object UpdateMatchmakingConfigurationOutput {
    def apply(
      Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined): UpdateMatchmakingConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configuration" -> Configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMatchmakingConfigurationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait UpdateRuntimeConfigurationInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object UpdateRuntimeConfigurationInput {
    def apply(
      FleetId: js.UndefOr[FleetId] = js.undefined,
      RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined): UpdateRuntimeConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuntimeConfigurationInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait UpdateRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object UpdateRuntimeConfigurationOutput {
    def apply(
      RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined): UpdateRuntimeConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuntimeConfigurationOutput]
    }
  }

  /**
   * <p>Represents the input for a request action.</p>
   */
  @js.native
  trait ValidateMatchmakingRuleSetInput extends js.Object {
    var RuleSetBody: js.UndefOr[RuleSetBody]
  }

  object ValidateMatchmakingRuleSetInput {
    def apply(
      RuleSetBody: js.UndefOr[RuleSetBody] = js.undefined): ValidateMatchmakingRuleSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetBody" -> RuleSetBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateMatchmakingRuleSetInput]
    }
  }

  /**
   * <p>Represents the returned data in response to a request action.</p>
   */
  @js.native
  trait ValidateMatchmakingRuleSetOutput extends js.Object {
    var Valid: js.UndefOr[BooleanModel]
  }

  object ValidateMatchmakingRuleSetOutput {
    def apply(
      Valid: js.UndefOr[BooleanModel] = js.undefined): ValidateMatchmakingRuleSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Valid" -> Valid.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateMatchmakingRuleSetOutput]
    }
  }

  /**
   * <p>Represents an authorization for a VPC peering connection between the VPC for an Amazon GameLift fleet and another VPC on an account you have access to. This authorization must exist and be valid for the peering connection to be established. Authorizations are valid for 24 hours after they are issued.</p> <p>VPC peering connection operations include:</p> <ul> <li> <p> <a>CreateVpcPeeringAuthorization</a> </p> </li> <li> <p> <a>DescribeVpcPeeringAuthorizations</a> </p> </li> <li> <p> <a>DeleteVpcPeeringAuthorization</a> </p> </li> <li> <p> <a>CreateVpcPeeringConnection</a> </p> </li> <li> <p> <a>DescribeVpcPeeringConnections</a> </p> </li> <li> <p> <a>DeleteVpcPeeringConnection</a> </p> </li> </ul>
   */
  @js.native
  trait VpcPeeringAuthorization extends js.Object {
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var ExpirationTime: js.UndefOr[Timestamp]
    var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object VpcPeeringAuthorization {
    def apply(
      PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
      GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): VpcPeeringAuthorization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "ExpirationTime" -> ExpirationTime.map { x => x.asInstanceOf[js.Any] },
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringAuthorization]
    }
  }

  /**
   * <p>Represents a peering connection between a VPC on one of your AWS accounts and the VPC for your Amazon GameLift fleets. This record may be for an active peering connection or a pending connection that has not yet been established.</p> <p>VPC peering connection operations include:</p> <ul> <li> <p> <a>CreateVpcPeeringAuthorization</a> </p> </li> <li> <p> <a>DescribeVpcPeeringAuthorizations</a> </p> </li> <li> <p> <a>DeleteVpcPeeringAuthorization</a> </p> </li> <li> <p> <a>CreateVpcPeeringConnection</a> </p> </li> <li> <p> <a>DescribeVpcPeeringConnections</a> </p> </li> <li> <p> <a>DeleteVpcPeeringConnection</a> </p> </li> </ul>
   */
  @js.native
  trait VpcPeeringConnection extends js.Object {
    var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString]
    var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var Status: js.UndefOr[VpcPeeringConnectionStatus]
  }

  object VpcPeeringConnection {
    def apply(
      GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      FleetId: js.UndefOr[FleetId] = js.undefined,
      Status: js.UndefOr[VpcPeeringConnectionStatus] = js.undefined): VpcPeeringConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameLiftVpcId" -> GameLiftVpcId.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] },
        "IpV4CidrBlock" -> IpV4CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnection]
    }
  }

  /**
   * <p>Represents status information for a VPC peering connection. Status is associated with a <a>VpcPeeringConnection</a> object. Status codes and messages are provided from EC2 (see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpcPeeringConnectionStateReason.html">VpcPeeringConnectionStateReason</a>). Connection status information is also communicated as a fleet <a>Event</a>.</p>
   */
  @js.native
  trait VpcPeeringConnectionStatus extends js.Object {
    var Code: js.UndefOr[NonZeroAndMaxString]
    var Message: js.UndefOr[NonZeroAndMaxString]
  }

  object VpcPeeringConnectionStatus {
    def apply(
      Code: js.UndefOr[NonZeroAndMaxString] = js.undefined,
      Message: js.UndefOr[NonZeroAndMaxString] = js.undefined): VpcPeeringConnectionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionStatus]
    }
  }
}