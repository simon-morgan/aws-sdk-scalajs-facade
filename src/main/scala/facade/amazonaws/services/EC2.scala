package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object ec2 {
  type AccountAttributeList = js.Array[AccountAttribute]
  type AccountAttributeName = String
  type AccountAttributeNameStringList = js.Array[AccountAttributeName]
  type AccountAttributeValueList = js.Array[AccountAttributeValue]
  type ActiveInstanceSet = js.Array[ActiveInstance]
  type ActivityStatus = String
  type AddressList = js.Array[Address]
  type Affinity = String
  type AllocationIdList = js.Array[String]
  type AllocationState = String
  type AllocationStrategy = String
  type AllowedPrincipalSet = js.Array[AllowedPrincipal]
  type ArchitectureValues = String
  type AssociationIdList = js.Array[String]
  type AttachmentStatus = String
  type AutoPlacement = String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[AvailabilityZoneMessage]
  type AvailabilityZoneState = String
  type AvailableInstanceCapacityList = js.Array[InstanceCapacity]
  type BatchState = String
  type BillingProductList = js.Array[String]
  type Blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlockDeviceMappingList = js.Array[BlockDeviceMapping]
  type BlockDeviceMappingRequestList = js.Array[BlockDeviceMapping]
  type BundleIdStringList = js.Array[String]
  type BundleTaskList = js.Array[BundleTask]
  type BundleTaskState = String
  type ByoipCidrSet = js.Array[ByoipCidr]
  type ByoipCidrState = String
  type CancelBatchErrorCode = String
  type CancelSpotFleetRequestsErrorSet = js.Array[CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[CancelSpotFleetRequestsSuccessItem]
  type CancelSpotInstanceRequestState = String
  type CancelledSpotInstanceRequestList = js.Array[CancelledSpotInstanceRequest]
  type CapacityReservationIdSet = js.Array[String]
  type CapacityReservationInstancePlatform = String
  type CapacityReservationPreference = String
  type CapacityReservationSet = js.Array[CapacityReservation]
  type CapacityReservationState = String
  type CapacityReservationTenancy = String
  type CidrBlockSet = js.Array[CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[ClassicLoadBalancer]
  type ConnectionNotificationSet = js.Array[ConnectionNotification]
  type ConnectionNotificationState = String
  type ConnectionNotificationType = String
  type ContainerFormat = String
  type ConversionIdStringList = js.Array[String]
  type ConversionTaskState = String
  type CreateFleetErrorsSet = js.Array[CreateFleetError]
  type CreateFleetInstancesSet = js.Array[CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[CreateVolumePermission]
  type CurrencyCodeValues = String
  type CustomerGatewayIdStringList = js.Array[String]
  type CustomerGatewayList = js.Array[CustomerGateway]
  type DatafeedSubscriptionState = String
  type DateTime = js.Date
  type DefaultTargetCapacityType = String
  type DeleteFleetErrorCode = String
  type DeleteFleetErrorSet = js.Array[DeleteFleetErrorItem]
  type DeleteFleetSuccessSet = js.Array[DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[DeleteLaunchTemplateVersionsResponseSuccessItem]
  type DescribeConversionTaskList = js.Array[ConversionTask]
  type DescribeFleetsErrorSet = js.Array[DescribeFleetError]
  type DescribeFleetsInstancesSet = js.Array[DescribeFleetsInstances]
  type DeviceType = String
  type DhcpConfigurationList = js.Array[DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[AttributeValue]
  type DhcpOptionsIdStringList = js.Array[String]
  type DhcpOptionsList = js.Array[DhcpOptions]
  type DiskImageFormat = String
  type DiskImageList = js.Array[DiskImage]
  type DnsEntrySet = js.Array[DnsEntry]
  type DomainType = String
  type EgressOnlyInternetGatewayId = String
  type EgressOnlyInternetGatewayIdList = js.Array[EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList = js.Array[EgressOnlyInternetGateway]
  type ElasticGpuAssociationList = js.Array[ElasticGpuAssociation]
  type ElasticGpuIdSet = js.Array[String]
  type ElasticGpuSet = js.Array[ElasticGpus]
  type ElasticGpuSpecificationList = js.Array[ElasticGpuSpecification]
  type ElasticGpuSpecificationResponseList = js.Array[ElasticGpuSpecificationResponse]
  type ElasticGpuSpecifications = js.Array[ElasticGpuSpecification]
  type ElasticGpuState = String
  type ElasticGpuStatus = String
  type EndDateType = String
  type EventCode = String
  type EventType = String
  type ExcessCapacityTerminationPolicy = String
  type ExecutableByStringList = js.Array[String]
  type ExportEnvironment = String
  type ExportTaskIdStringList = js.Array[String]
  type ExportTaskList = js.Array[ExportTask]
  type ExportTaskState = String
  type FilterList = js.Array[Filter]
  type FleetActivityStatus = String
  type FleetEventType = String
  type FleetExcessCapacityTerminationPolicy = String
  type FleetIdSet = js.Array[FleetIdentifier]
  type FleetIdentifier = String
  type FleetLaunchTemplateConfigList = js.Array[FleetLaunchTemplateConfig]
  type FleetLaunchTemplateConfigListRequest = js.Array[FleetLaunchTemplateConfigRequest]
  type FleetLaunchTemplateOverridesList = js.Array[FleetLaunchTemplateOverrides]
  type FleetLaunchTemplateOverridesListRequest = js.Array[FleetLaunchTemplateOverridesRequest]
  type FleetOnDemandAllocationStrategy = String
  type FleetSet = js.Array[FleetData]
  type FleetStateCode = String
  type FleetType = String
  type FlowLogSet = js.Array[FlowLog]
  type FlowLogsResourceType = String
  type FpgaImageAttributeName = String
  type FpgaImageIdList = js.Array[String]
  type FpgaImageList = js.Array[FpgaImage]
  type FpgaImageStateCode = String
  type GatewayType = String
  type GroupIdStringList = js.Array[String]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupIdentifierSet = js.Array[SecurityGroupIdentifier]
  type GroupIds = js.Array[String]
  type GroupNameStringList = js.Array[String]
  type HistoryRecordSet = js.Array[HistoryRecordEntry]
  type HistoryRecords = js.Array[HistoryRecord]
  type HostInstanceList = js.Array[HostInstance]
  type HostList = js.Array[Host]
  type HostOfferingSet = js.Array[HostOffering]
  type HostReservationIdSet = js.Array[String]
  type HostReservationSet = js.Array[HostReservation]
  type HostTenancy = String
  type HypervisorType = String
  type IamInstanceProfileAssociationSet = js.Array[IamInstanceProfileAssociation]
  type IamInstanceProfileAssociationState = String
  type IdFormatList = js.Array[IdFormat]
  type ImageAttributeName = String
  type ImageDiskContainerList = js.Array[ImageDiskContainer]
  type ImageIdStringList = js.Array[String]
  type ImageList = js.Array[Image]
  type ImageState = String
  type ImageTypeValues = String
  type ImportImageTaskList = js.Array[ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskList = js.Array[ImportSnapshotTask]
  type ImportTaskIdList = js.Array[String]
  type InstanceAttributeName = String
  type InstanceBlockDeviceMappingList = js.Array[InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList = js.Array[InstanceBlockDeviceMappingSpecification]
  type InstanceCountList = js.Array[InstanceCount]
  type InstanceCreditSpecificationList = js.Array[InstanceCreditSpecification]
  type InstanceCreditSpecificationListRequest = js.Array[InstanceCreditSpecificationRequest]
  type InstanceHealthStatus = String
  type InstanceId = String
  type InstanceIdSet = js.Array[String]
  type InstanceIdStringList = js.Array[String]
  type InstanceIdsSet = js.Array[InstanceId]
  type InstanceInterruptionBehavior = String
  type InstanceIpv6AddressList = js.Array[InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[InstanceIpv6AddressRequest]
  type InstanceLifecycle = String
  type InstanceLifecycleType = String
  type InstanceList = js.Array[Instance]
  type InstanceMatchCriteria = String
  type InstanceMonitoringList = js.Array[InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[InstanceStateChange]
  type InstanceStateName = String
  type InstanceStatusDetailsList = js.Array[InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[InstanceStatusEvent]
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceType = String
  type InstanceTypeList = js.Array[InstanceType]
  type InterfacePermissionType = String
  type InternetGatewayAttachmentList = js.Array[InternetGatewayAttachment]
  type InternetGatewayList = js.Array[InternetGateway]
  type IpPermissionList = js.Array[IpPermission]
  type IpRangeList = js.Array[IpRange]
  type IpRanges = js.Array[String]
  type Ipv6Address = String
  type Ipv6AddressList = js.Array[String]
  type Ipv6CidrBlockSet = js.Array[Ipv6CidrBlock]
  type Ipv6RangeList = js.Array[Ipv6Range]
  type KeyNameStringList = js.Array[String]
  type KeyPairList = js.Array[KeyPairInfo]
  type LaunchPermissionList = js.Array[LaunchPermission]
  type LaunchSpecsList = js.Array[SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList = js.Array[LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList = js.Array[LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList = js.Array[LaunchTemplateConfig]
  type LaunchTemplateErrorCode = String
  type LaunchTemplateInstanceNetworkInterfaceSpecificationList = js.Array[LaunchTemplateInstanceNetworkInterfaceSpecification]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList = js.Array[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]
  type LaunchTemplateName = String
  type LaunchTemplateNameStringList = js.Array[LaunchTemplateName]
  type LaunchTemplateOverridesList = js.Array[LaunchTemplateOverrides]
  type LaunchTemplateSet = js.Array[LaunchTemplate]
  type LaunchTemplateTagSpecificationList = js.Array[LaunchTemplateTagSpecification]
  type LaunchTemplateTagSpecificationRequestList = js.Array[LaunchTemplateTagSpecificationRequest]
  type LaunchTemplateVersionSet = js.Array[LaunchTemplateVersion]
  type ListingState = String
  type ListingStatus = String
  type LoadPermissionList = js.Array[LoadPermission]
  type LoadPermissionListRequest = js.Array[LoadPermissionRequest]
  type LogDestinationType = String
  type MarketType = String
  type MaxResults = Int
  type MonitoringState = String
  type MoveStatus = String
  type MovingAddressStatusSet = js.Array[MovingAddressStatus]
  type NatGatewayAddressList = js.Array[NatGatewayAddress]
  type NatGatewayList = js.Array[NatGateway]
  type NatGatewayState = String
  type NetworkAclAssociationList = js.Array[NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[NetworkAclEntry]
  type NetworkAclList = js.Array[NetworkAcl]
  type NetworkInterfaceAttribute = String
  type NetworkInterfaceIdList = js.Array[String]
  type NetworkInterfaceIpv6AddressesList = js.Array[NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NetworkInterfacePermissionIdList = js.Array[String]
  type NetworkInterfacePermissionList = js.Array[NetworkInterfacePermission]
  type NetworkInterfacePermissionStateCode = String
  type NetworkInterfacePrivateIpAddressList = js.Array[NetworkInterfacePrivateIpAddress]
  type NetworkInterfaceStatus = String
  type NetworkInterfaceType = String
  type NewDhcpConfigurationList = js.Array[NewDhcpConfiguration]
  type NextToken = String
  type OccurrenceDayRequestSet = js.Array[Int]
  type OccurrenceDaySet = js.Array[Int]
  type OfferingClassType = String
  type OfferingTypeValues = String
  type OnDemandAllocationStrategy = String
  type OperationType = String
  type OwnerStringList = js.Array[String]
  type PaymentOption = String
  type PermissionGroup = String
  type PlacementGroupList = js.Array[PlacementGroup]
  type PlacementGroupState = String
  type PlacementGroupStringList = js.Array[String]
  type PlacementStrategy = String
  type PlatformValues = String
  type PoolMaxResults = Int
  type PrefixListIdList = js.Array[PrefixListId]
  type PrefixListIdSet = js.Array[String]
  type PrefixListSet = js.Array[PrefixList]
  type PriceScheduleList = js.Array[PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[PriceScheduleSpecification]
  type PricingDetailsList = js.Array[PricingDetail]
  type PrincipalIdFormatList = js.Array[PrincipalIdFormat]
  type PrincipalType = String
  type PrivateIpAddressConfigSet = js.Array[ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[String]
  type ProductCodeList = js.Array[ProductCode]
  type ProductCodeStringList = js.Array[String]
  type ProductCodeValues = String
  type ProductDescriptionList = js.Array[String]
  type PropagatingVgwList = js.Array[PropagatingVgw]
  type PublicIpStringList = js.Array[String]
  type PublicIpv4PoolRangeSet = js.Array[PublicIpv4PoolRange]
  type PublicIpv4PoolSet = js.Array[PublicIpv4Pool]
  type PurchaseRequestSet = js.Array[PurchaseRequest]
  type PurchaseSet = js.Array[Purchase]
  type PurchasedScheduledInstanceSet = js.Array[ScheduledInstance]
  type RIProductDescription = String
  type ReasonCodesList = js.Array[ReportInstanceReasonCodes]
  type RecurringChargeFrequency = String
  type RecurringChargesList = js.Array[RecurringCharge]
  type RegionList = js.Array[Region]
  type RegionNameStringList = js.Array[String]
  type ReportInstanceReasonCodes = String
  type ReportStatusType = String
  type RequestHostIdList = js.Array[String]
  type RequestHostIdSet = js.Array[String]
  type ReservationList = js.Array[Reservation]
  type ReservationState = String
  type ReservedInstanceIdSet = js.Array[String]
  type ReservedInstanceReservationValueSet = js.Array[ReservedInstanceReservationValue]
  type ReservedInstanceState = String
  type ReservedInstancesConfigurationList = js.Array[ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[String]
  type ReservedInstancesList = js.Array[ReservedInstances]
  type ReservedInstancesListingList = js.Array[ReservedInstancesListing]
  type ReservedInstancesModificationIdStringList = js.Array[String]
  type ReservedInstancesModificationList = js.Array[ReservedInstancesModification]
  type ReservedInstancesModificationResultList = js.Array[ReservedInstancesModificationResult]
  type ReservedInstancesOfferingIdStringList = js.Array[String]
  type ReservedInstancesOfferingList = js.Array[ReservedInstancesOffering]
  type ReservedIntancesIds = js.Array[ReservedInstancesId]
  type ResetFpgaImageAttributeName = String
  type ResetImageAttributeName = String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[String]
  type ResourceType = String
  type ResponseHostIdList = js.Array[String]
  type ResponseHostIdSet = js.Array[String]
  type RestorableByStringList = js.Array[String]
  type RouteList = js.Array[Route]
  type RouteOrigin = String
  type RouteState = String
  type RouteTableAssociationList = js.Array[RouteTableAssociation]
  type RouteTableList = js.Array[RouteTable]
  type RuleAction = String
  type ScheduledInstanceAvailabilitySet = js.Array[ScheduledInstanceAvailability]
  type ScheduledInstanceIdRequestSet = js.Array[String]
  type ScheduledInstanceSet = js.Array[ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet = js.Array[ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList = js.Array[ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet = js.Array[ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet = js.Array[String]
  type SecurityGroupIdStringList = js.Array[String]
  type SecurityGroupList = js.Array[SecurityGroup]
  type SecurityGroupReferences = js.Array[SecurityGroupReference]
  type SecurityGroupStringList = js.Array[String]
  type ServiceConfigurationSet = js.Array[ServiceConfiguration]
  type ServiceDetailSet = js.Array[ServiceDetail]
  type ServiceState = String
  type ServiceType = String
  type ServiceTypeDetailSet = js.Array[ServiceTypeDetail]
  type ShutdownBehavior = String
  type SnapshotAttributeName = String
  type SnapshotDetailList = js.Array[SnapshotDetail]
  type SnapshotIdStringList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotState = String
  type SpotAllocationStrategy = String
  type SpotFleetRequestConfigSet = js.Array[SpotFleetRequestConfig]
  type SpotFleetTagSpecificationList = js.Array[SpotFleetTagSpecification]
  type SpotInstanceInterruptionBehavior = String
  type SpotInstanceRequestIdList = js.Array[String]
  type SpotInstanceRequestList = js.Array[SpotInstanceRequest]
  type SpotInstanceState = String
  type SpotInstanceType = String
  type SpotPriceHistoryList = js.Array[SpotPrice]
  type StaleIpPermissionSet = js.Array[StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[StaleSecurityGroup]
  type State = String
  type Status = String
  type StatusName = String
  type StatusType = String
  type SubnetCidrBlockStateCode = String
  type SubnetIdStringList = js.Array[String]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[Subnet]
  type SubnetState = String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[SuccessfulInstanceCreditSpecificationItem]
  type SummaryStatus = String
  type TagDescriptionList = js.Array[TagDescription]
  type TagList = js.Array[Tag]
  type TagSpecificationList = js.Array[TagSpecification]
  type TargetConfigurationRequestSet = js.Array[TargetConfigurationRequest]
  type TargetGroups = js.Array[TargetGroup]
  type TargetReservationValueSet = js.Array[TargetReservationValue]
  type TelemetryStatus = String
  type Tenancy = String
  type TrafficType = String
  type TunnelOptionsList = js.Array[VpnTunnelOptionsSpecification]
  type UnsuccessfulInstanceCreditSpecificationErrorCode = String
  type UnsuccessfulInstanceCreditSpecificationSet = js.Array[UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList = js.Array[UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[UnsuccessfulItem]
  type UserGroupStringList = js.Array[String]
  type UserIdGroupPairList = js.Array[UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[UserIdGroupPair]
  type UserIdStringList = js.Array[String]
  type ValueStringList = js.Array[String]
  type VersionDescription = String
  type VersionStringList = js.Array[String]
  type VgwTelemetryList = js.Array[VgwTelemetry]
  type VirtualizationType = String
  type VolumeAttachmentList = js.Array[VolumeAttachment]
  type VolumeAttachmentState = String
  type VolumeAttributeName = String
  type VolumeIdStringList = js.Array[String]
  type VolumeList = js.Array[Volume]
  type VolumeModificationList = js.Array[VolumeModification]
  type VolumeModificationState = String
  type VolumeState = String
  type VolumeStatusActionsList = js.Array[VolumeStatusAction]
  type VolumeStatusDetailsList = js.Array[VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[VolumeStatusEvent]
  type VolumeStatusInfoStatus = String
  type VolumeStatusList = js.Array[VolumeStatusItem]
  type VolumeStatusName = String
  type VolumeType = String
  type VpcAttachmentList = js.Array[VpcAttachment]
  type VpcAttributeName = String
  type VpcCidrBlockAssociationSet = js.Array[VpcCidrBlockAssociation]
  type VpcCidrBlockStateCode = String
  type VpcClassicLinkIdList = js.Array[String]
  type VpcClassicLinkList = js.Array[VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[VpcEndpointConnection]
  type VpcEndpointSet = js.Array[VpcEndpoint]
  type VpcEndpointType = String
  type VpcIdStringList = js.Array[String]
  type VpcIpv6CidrBlockAssociationSet = js.Array[VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[Vpc]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type VpcPeeringConnectionStateReasonCode = String
  type VpcState = String
  type VpcTenancy = String
  type VpnConnectionIdStringList = js.Array[String]
  type VpnConnectionList = js.Array[VpnConnection]
  type VpnGatewayIdStringList = js.Array[String]
  type VpnGatewayList = js.Array[VpnGateway]
  type VpnState = String
  type VpnStaticRouteList = js.Array[VpnStaticRoute]
  type VpnStaticRouteSource = String
  type ZoneNameStringList = js.Array[String]
  type scope = String
}

package ec2 {
  @js.native
  @JSImport("aws-sdk", "EC2")
  class EC2(config: AWSConfig) extends js.Object {
    def acceptReservedInstancesExchangeQuote(params: AcceptReservedInstancesExchangeQuoteRequest): Request[AcceptReservedInstancesExchangeQuoteResult] = js.native
    def acceptVpcEndpointConnections(params: AcceptVpcEndpointConnectionsRequest): Request[AcceptVpcEndpointConnectionsResult] = js.native
    def acceptVpcPeeringConnection(params: AcceptVpcPeeringConnectionRequest): Request[AcceptVpcPeeringConnectionResult] = js.native
    def advertiseByoipCidr(params: AdvertiseByoipCidrRequest): Request[AdvertiseByoipCidrResult] = js.native
    def allocateAddress(params: AllocateAddressRequest): Request[AllocateAddressResult] = js.native
    def allocateHosts(params: AllocateHostsRequest): Request[AllocateHostsResult] = js.native
    def assignIpv6Addresses(params: AssignIpv6AddressesRequest): Request[AssignIpv6AddressesResult] = js.native
    def assignPrivateIpAddresses(params: AssignPrivateIpAddressesRequest): Request[js.Object] = js.native
    def associateAddress(params: AssociateAddressRequest): Request[AssociateAddressResult] = js.native
    def associateDhcpOptions(params: AssociateDhcpOptionsRequest): Request[js.Object] = js.native
    def associateIamInstanceProfile(params: AssociateIamInstanceProfileRequest): Request[AssociateIamInstanceProfileResult] = js.native
    def associateRouteTable(params: AssociateRouteTableRequest): Request[AssociateRouteTableResult] = js.native
    def associateSubnetCidrBlock(params: AssociateSubnetCidrBlockRequest): Request[AssociateSubnetCidrBlockResult] = js.native
    def associateVpcCidrBlock(params: AssociateVpcCidrBlockRequest): Request[AssociateVpcCidrBlockResult] = js.native
    def attachClassicLinkVpc(params: AttachClassicLinkVpcRequest): Request[AttachClassicLinkVpcResult] = js.native
    def attachInternetGateway(params: AttachInternetGatewayRequest): Request[js.Object] = js.native
    def attachNetworkInterface(params: AttachNetworkInterfaceRequest): Request[AttachNetworkInterfaceResult] = js.native
    def attachVolume(params: AttachVolumeRequest): Request[VolumeAttachment] = js.native
    def attachVpnGateway(params: AttachVpnGatewayRequest): Request[AttachVpnGatewayResult] = js.native
    def authorizeSecurityGroupEgress(params: AuthorizeSecurityGroupEgressRequest): Request[js.Object] = js.native
    def authorizeSecurityGroupIngress(params: AuthorizeSecurityGroupIngressRequest): Request[js.Object] = js.native
    def bundleInstance(params: BundleInstanceRequest): Request[BundleInstanceResult] = js.native
    def cancelBundleTask(params: CancelBundleTaskRequest): Request[CancelBundleTaskResult] = js.native
    def cancelCapacityReservation(params: CancelCapacityReservationRequest): Request[CancelCapacityReservationResult] = js.native
    def cancelConversionTask(params: CancelConversionRequest): Request[js.Object] = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object] = js.native
    def cancelImportTask(params: CancelImportTaskRequest): Request[CancelImportTaskResult] = js.native
    def cancelReservedInstancesListing(params: CancelReservedInstancesListingRequest): Request[CancelReservedInstancesListingResult] = js.native
    def cancelSpotFleetRequests(params: CancelSpotFleetRequestsRequest): Request[CancelSpotFleetRequestsResponse] = js.native
    def cancelSpotInstanceRequests(params: CancelSpotInstanceRequestsRequest): Request[CancelSpotInstanceRequestsResult] = js.native
    def confirmProductInstance(params: ConfirmProductInstanceRequest): Request[ConfirmProductInstanceResult] = js.native
    def copyFpgaImage(params: CopyFpgaImageRequest): Request[CopyFpgaImageResult] = js.native
    def copyImage(params: CopyImageRequest): Request[CopyImageResult] = js.native
    def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult] = js.native
    def createCapacityReservation(params: CreateCapacityReservationRequest): Request[CreateCapacityReservationResult] = js.native
    def createCustomerGateway(params: CreateCustomerGatewayRequest): Request[CreateCustomerGatewayResult] = js.native
    def createDefaultSubnet(params: CreateDefaultSubnetRequest): Request[CreateDefaultSubnetResult] = js.native
    def createDefaultVpc(params: CreateDefaultVpcRequest): Request[CreateDefaultVpcResult] = js.native
    def createDhcpOptions(params: CreateDhcpOptionsRequest): Request[CreateDhcpOptionsResult] = js.native
    def createEgressOnlyInternetGateway(params: CreateEgressOnlyInternetGatewayRequest): Request[CreateEgressOnlyInternetGatewayResult] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResult] = js.native
    def createFlowLogs(params: CreateFlowLogsRequest): Request[CreateFlowLogsResult] = js.native
    def createFpgaImage(params: CreateFpgaImageRequest): Request[CreateFpgaImageResult] = js.native
    def createImage(params: CreateImageRequest): Request[CreateImageResult] = js.native
    def createInstanceExportTask(params: CreateInstanceExportTaskRequest): Request[CreateInstanceExportTaskResult] = js.native
    def createInternetGateway(params: CreateInternetGatewayRequest): Request[CreateInternetGatewayResult] = js.native
    def createKeyPair(params: CreateKeyPairRequest): Request[KeyPair] = js.native
    def createLaunchTemplate(params: CreateLaunchTemplateRequest): Request[CreateLaunchTemplateResult] = js.native
    def createLaunchTemplateVersion(params: CreateLaunchTemplateVersionRequest): Request[CreateLaunchTemplateVersionResult] = js.native
    def createNatGateway(params: CreateNatGatewayRequest): Request[CreateNatGatewayResult] = js.native
    def createNetworkAcl(params: CreateNetworkAclRequest): Request[CreateNetworkAclResult] = js.native
    def createNetworkAclEntry(params: CreateNetworkAclEntryRequest): Request[js.Object] = js.native
    def createNetworkInterface(params: CreateNetworkInterfaceRequest): Request[CreateNetworkInterfaceResult] = js.native
    def createNetworkInterfacePermission(params: CreateNetworkInterfacePermissionRequest): Request[CreateNetworkInterfacePermissionResult] = js.native
    def createPlacementGroup(params: CreatePlacementGroupRequest): Request[js.Object] = js.native
    def createReservedInstancesListing(params: CreateReservedInstancesListingRequest): Request[CreateReservedInstancesListingResult] = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResult] = js.native
    def createRouteTable(params: CreateRouteTableRequest): Request[CreateRouteTableResult] = js.native
    def createSecurityGroup(params: CreateSecurityGroupRequest): Request[CreateSecurityGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[Snapshot] = js.native
    def createSpotDatafeedSubscription(params: CreateSpotDatafeedSubscriptionRequest): Request[CreateSpotDatafeedSubscriptionResult] = js.native
    def createSubnet(params: CreateSubnetRequest): Request[CreateSubnetResult] = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object] = js.native
    def createVolume(params: CreateVolumeRequest): Request[Volume] = js.native
    def createVpc(params: CreateVpcRequest): Request[CreateVpcResult] = js.native
    def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResult] = js.native
    def createVpcEndpointConnectionNotification(params: CreateVpcEndpointConnectionNotificationRequest): Request[CreateVpcEndpointConnectionNotificationResult] = js.native
    def createVpcEndpointServiceConfiguration(params: CreateVpcEndpointServiceConfigurationRequest): Request[CreateVpcEndpointServiceConfigurationResult] = js.native
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionRequest): Request[CreateVpcPeeringConnectionResult] = js.native
    def createVpnConnection(params: CreateVpnConnectionRequest): Request[CreateVpnConnectionResult] = js.native
    def createVpnConnectionRoute(params: CreateVpnConnectionRouteRequest): Request[js.Object] = js.native
    def createVpnGateway(params: CreateVpnGatewayRequest): Request[CreateVpnGatewayResult] = js.native
    def deleteCustomerGateway(params: DeleteCustomerGatewayRequest): Request[js.Object] = js.native
    def deleteDhcpOptions(params: DeleteDhcpOptionsRequest): Request[js.Object] = js.native
    def deleteEgressOnlyInternetGateway(params: DeleteEgressOnlyInternetGatewayRequest): Request[DeleteEgressOnlyInternetGatewayResult] = js.native
    def deleteFleets(params: DeleteFleetsRequest): Request[DeleteFleetsResult] = js.native
    def deleteFlowLogs(params: DeleteFlowLogsRequest): Request[DeleteFlowLogsResult] = js.native
    def deleteFpgaImage(params: DeleteFpgaImageRequest): Request[DeleteFpgaImageResult] = js.native
    def deleteInternetGateway(params: DeleteInternetGatewayRequest): Request[js.Object] = js.native
    def deleteKeyPair(params: DeleteKeyPairRequest): Request[js.Object] = js.native
    def deleteLaunchTemplate(params: DeleteLaunchTemplateRequest): Request[DeleteLaunchTemplateResult] = js.native
    def deleteLaunchTemplateVersions(params: DeleteLaunchTemplateVersionsRequest): Request[DeleteLaunchTemplateVersionsResult] = js.native
    def deleteNatGateway(params: DeleteNatGatewayRequest): Request[DeleteNatGatewayResult] = js.native
    def deleteNetworkAcl(params: DeleteNetworkAclRequest): Request[js.Object] = js.native
    def deleteNetworkAclEntry(params: DeleteNetworkAclEntryRequest): Request[js.Object] = js.native
    def deleteNetworkInterface(params: DeleteNetworkInterfaceRequest): Request[js.Object] = js.native
    def deleteNetworkInterfacePermission(params: DeleteNetworkInterfacePermissionRequest): Request[DeleteNetworkInterfacePermissionResult] = js.native
    def deletePlacementGroup(params: DeletePlacementGroupRequest): Request[js.Object] = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[js.Object] = js.native
    def deleteRouteTable(params: DeleteRouteTableRequest): Request[js.Object] = js.native
    def deleteSecurityGroup(params: DeleteSecurityGroupRequest): Request[js.Object] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[js.Object] = js.native
    def deleteSpotDatafeedSubscription(params: DeleteSpotDatafeedSubscriptionRequest): Request[js.Object] = js.native
    def deleteSubnet(params: DeleteSubnetRequest): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object] = js.native
    def deleteVolume(params: DeleteVolumeRequest): Request[js.Object] = js.native
    def deleteVpc(params: DeleteVpcRequest): Request[js.Object] = js.native
    def deleteVpcEndpointConnectionNotifications(params: DeleteVpcEndpointConnectionNotificationsRequest): Request[DeleteVpcEndpointConnectionNotificationsResult] = js.native
    def deleteVpcEndpointServiceConfigurations(params: DeleteVpcEndpointServiceConfigurationsRequest): Request[DeleteVpcEndpointServiceConfigurationsResult] = js.native
    def deleteVpcEndpoints(params: DeleteVpcEndpointsRequest): Request[DeleteVpcEndpointsResult] = js.native
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionRequest): Request[DeleteVpcPeeringConnectionResult] = js.native
    def deleteVpnConnection(params: DeleteVpnConnectionRequest): Request[js.Object] = js.native
    def deleteVpnConnectionRoute(params: DeleteVpnConnectionRouteRequest): Request[js.Object] = js.native
    def deleteVpnGateway(params: DeleteVpnGatewayRequest): Request[js.Object] = js.native
    def deprovisionByoipCidr(params: DeprovisionByoipCidrRequest): Request[DeprovisionByoipCidrResult] = js.native
    def deregisterImage(params: DeregisterImageRequest): Request[js.Object] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResult] = js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult] = js.native
    def describeAggregateIdFormat(params: DescribeAggregateIdFormatRequest): Request[DescribeAggregateIdFormatResult] = js.native
    def describeAvailabilityZones(params: DescribeAvailabilityZonesRequest): Request[DescribeAvailabilityZonesResult] = js.native
    def describeBundleTasks(params: DescribeBundleTasksRequest): Request[DescribeBundleTasksResult] = js.native
    def describeByoipCidrs(params: DescribeByoipCidrsRequest): Request[DescribeByoipCidrsResult] = js.native
    def describeCapacityReservations(params: DescribeCapacityReservationsRequest): Request[DescribeCapacityReservationsResult] = js.native
    def describeClassicLinkInstances(params: DescribeClassicLinkInstancesRequest): Request[DescribeClassicLinkInstancesResult] = js.native
    def describeConversionTasks(params: DescribeConversionTasksRequest): Request[DescribeConversionTasksResult] = js.native
    def describeCustomerGateways(params: DescribeCustomerGatewaysRequest): Request[DescribeCustomerGatewaysResult] = js.native
    def describeDhcpOptions(params: DescribeDhcpOptionsRequest): Request[DescribeDhcpOptionsResult] = js.native
    def describeEgressOnlyInternetGateways(params: DescribeEgressOnlyInternetGatewaysRequest): Request[DescribeEgressOnlyInternetGatewaysResult] = js.native
    def describeElasticGpus(params: DescribeElasticGpusRequest): Request[DescribeElasticGpusResult] = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResult] = js.native
    def describeFleetHistory(params: DescribeFleetHistoryRequest): Request[DescribeFleetHistoryResult] = js.native
    def describeFleetInstances(params: DescribeFleetInstancesRequest): Request[DescribeFleetInstancesResult] = js.native
    def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult] = js.native
    def describeFlowLogs(params: DescribeFlowLogsRequest): Request[DescribeFlowLogsResult] = js.native
    def describeFpgaImageAttribute(params: DescribeFpgaImageAttributeRequest): Request[DescribeFpgaImageAttributeResult] = js.native
    def describeFpgaImages(params: DescribeFpgaImagesRequest): Request[DescribeFpgaImagesResult] = js.native
    def describeHostReservationOfferings(params: DescribeHostReservationOfferingsRequest): Request[DescribeHostReservationOfferingsResult] = js.native
    def describeHostReservations(params: DescribeHostReservationsRequest): Request[DescribeHostReservationsResult] = js.native
    def describeHosts(params: DescribeHostsRequest): Request[DescribeHostsResult] = js.native
    def describeIamInstanceProfileAssociations(params: DescribeIamInstanceProfileAssociationsRequest): Request[DescribeIamInstanceProfileAssociationsResult] = js.native
    def describeIdFormat(params: DescribeIdFormatRequest): Request[DescribeIdFormatResult] = js.native
    def describeIdentityIdFormat(params: DescribeIdentityIdFormatRequest): Request[DescribeIdentityIdFormatResult] = js.native
    def describeImageAttribute(params: DescribeImageAttributeRequest): Request[ImageAttribute] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult] = js.native
    def describeImportImageTasks(params: DescribeImportImageTasksRequest): Request[DescribeImportImageTasksResult] = js.native
    def describeImportSnapshotTasks(params: DescribeImportSnapshotTasksRequest): Request[DescribeImportSnapshotTasksResult] = js.native
    def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[InstanceAttribute] = js.native
    def describeInstanceCreditSpecifications(params: DescribeInstanceCreditSpecificationsRequest): Request[DescribeInstanceCreditSpecificationsResult] = js.native
    def describeInstanceStatus(params: DescribeInstanceStatusRequest): Request[DescribeInstanceStatusResult] = js.native
    def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult] = js.native
    def describeInternetGateways(params: DescribeInternetGatewaysRequest): Request[DescribeInternetGatewaysResult] = js.native
    def describeKeyPairs(params: DescribeKeyPairsRequest): Request[DescribeKeyPairsResult] = js.native
    def describeLaunchTemplateVersions(params: DescribeLaunchTemplateVersionsRequest): Request[DescribeLaunchTemplateVersionsResult] = js.native
    def describeLaunchTemplates(params: DescribeLaunchTemplatesRequest): Request[DescribeLaunchTemplatesResult] = js.native
    def describeMovingAddresses(params: DescribeMovingAddressesRequest): Request[DescribeMovingAddressesResult] = js.native
    def describeNatGateways(params: DescribeNatGatewaysRequest): Request[DescribeNatGatewaysResult] = js.native
    def describeNetworkAcls(params: DescribeNetworkAclsRequest): Request[DescribeNetworkAclsResult] = js.native
    def describeNetworkInterfaceAttribute(params: DescribeNetworkInterfaceAttributeRequest): Request[DescribeNetworkInterfaceAttributeResult] = js.native
    def describeNetworkInterfacePermissions(params: DescribeNetworkInterfacePermissionsRequest): Request[DescribeNetworkInterfacePermissionsResult] = js.native
    def describeNetworkInterfaces(params: DescribeNetworkInterfacesRequest): Request[DescribeNetworkInterfacesResult] = js.native
    def describePlacementGroups(params: DescribePlacementGroupsRequest): Request[DescribePlacementGroupsResult] = js.native
    def describePrefixLists(params: DescribePrefixListsRequest): Request[DescribePrefixListsResult] = js.native
    def describePrincipalIdFormat(params: DescribePrincipalIdFormatRequest): Request[DescribePrincipalIdFormatResult] = js.native
    def describePublicIpv4Pools(params: DescribePublicIpv4PoolsRequest): Request[DescribePublicIpv4PoolsResult] = js.native
    def describeRegions(params: DescribeRegionsRequest): Request[DescribeRegionsResult] = js.native
    def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResult] = js.native
    def describeReservedInstancesListings(params: DescribeReservedInstancesListingsRequest): Request[DescribeReservedInstancesListingsResult] = js.native
    def describeReservedInstancesModifications(params: DescribeReservedInstancesModificationsRequest): Request[DescribeReservedInstancesModificationsResult] = js.native
    def describeReservedInstancesOfferings(params: DescribeReservedInstancesOfferingsRequest): Request[DescribeReservedInstancesOfferingsResult] = js.native
    def describeRouteTables(params: DescribeRouteTablesRequest): Request[DescribeRouteTablesResult] = js.native
    def describeScheduledInstanceAvailability(params: DescribeScheduledInstanceAvailabilityRequest): Request[DescribeScheduledInstanceAvailabilityResult] = js.native
    def describeScheduledInstances(params: DescribeScheduledInstancesRequest): Request[DescribeScheduledInstancesResult] = js.native
    def describeSecurityGroupReferences(params: DescribeSecurityGroupReferencesRequest): Request[DescribeSecurityGroupReferencesResult] = js.native
    def describeSecurityGroups(params: DescribeSecurityGroupsRequest): Request[DescribeSecurityGroupsResult] = js.native
    def describeSnapshotAttribute(params: DescribeSnapshotAttributeRequest): Request[DescribeSnapshotAttributeResult] = js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult] = js.native
    def describeSpotDatafeedSubscription(params: DescribeSpotDatafeedSubscriptionRequest): Request[DescribeSpotDatafeedSubscriptionResult] = js.native
    def describeSpotFleetInstances(params: DescribeSpotFleetInstancesRequest): Request[DescribeSpotFleetInstancesResponse] = js.native
    def describeSpotFleetRequestHistory(params: DescribeSpotFleetRequestHistoryRequest): Request[DescribeSpotFleetRequestHistoryResponse] = js.native
    def describeSpotFleetRequests(params: DescribeSpotFleetRequestsRequest): Request[DescribeSpotFleetRequestsResponse] = js.native
    def describeSpotInstanceRequests(params: DescribeSpotInstanceRequestsRequest): Request[DescribeSpotInstanceRequestsResult] = js.native
    def describeSpotPriceHistory(params: DescribeSpotPriceHistoryRequest): Request[DescribeSpotPriceHistoryResult] = js.native
    def describeStaleSecurityGroups(params: DescribeStaleSecurityGroupsRequest): Request[DescribeStaleSecurityGroupsResult] = js.native
    def describeSubnets(params: DescribeSubnetsRequest): Request[DescribeSubnetsResult] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult] = js.native
    def describeVolumeAttribute(params: DescribeVolumeAttributeRequest): Request[DescribeVolumeAttributeResult] = js.native
    def describeVolumeStatus(params: DescribeVolumeStatusRequest): Request[DescribeVolumeStatusResult] = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult] = js.native
    def describeVolumesModifications(params: DescribeVolumesModificationsRequest): Request[DescribeVolumesModificationsResult] = js.native
    def describeVpcAttribute(params: DescribeVpcAttributeRequest): Request[DescribeVpcAttributeResult] = js.native
    def describeVpcClassicLink(params: DescribeVpcClassicLinkRequest): Request[DescribeVpcClassicLinkResult] = js.native
    def describeVpcClassicLinkDnsSupport(params: DescribeVpcClassicLinkDnsSupportRequest): Request[DescribeVpcClassicLinkDnsSupportResult] = js.native
    def describeVpcEndpointConnectionNotifications(params: DescribeVpcEndpointConnectionNotificationsRequest): Request[DescribeVpcEndpointConnectionNotificationsResult] = js.native
    def describeVpcEndpointConnections(params: DescribeVpcEndpointConnectionsRequest): Request[DescribeVpcEndpointConnectionsResult] = js.native
    def describeVpcEndpointServiceConfigurations(params: DescribeVpcEndpointServiceConfigurationsRequest): Request[DescribeVpcEndpointServiceConfigurationsResult] = js.native
    def describeVpcEndpointServicePermissions(params: DescribeVpcEndpointServicePermissionsRequest): Request[DescribeVpcEndpointServicePermissionsResult] = js.native
    def describeVpcEndpointServices(params: DescribeVpcEndpointServicesRequest): Request[DescribeVpcEndpointServicesResult] = js.native
    def describeVpcEndpoints(params: DescribeVpcEndpointsRequest): Request[DescribeVpcEndpointsResult] = js.native
    def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsRequest): Request[DescribeVpcPeeringConnectionsResult] = js.native
    def describeVpcs(params: DescribeVpcsRequest): Request[DescribeVpcsResult] = js.native
    def describeVpnConnections(params: DescribeVpnConnectionsRequest): Request[DescribeVpnConnectionsResult] = js.native
    def describeVpnGateways(params: DescribeVpnGatewaysRequest): Request[DescribeVpnGatewaysResult] = js.native
    def detachClassicLinkVpc(params: DetachClassicLinkVpcRequest): Request[DetachClassicLinkVpcResult] = js.native
    def detachInternetGateway(params: DetachInternetGatewayRequest): Request[js.Object] = js.native
    def detachNetworkInterface(params: DetachNetworkInterfaceRequest): Request[js.Object] = js.native
    def detachVolume(params: DetachVolumeRequest): Request[VolumeAttachment] = js.native
    def detachVpnGateway(params: DetachVpnGatewayRequest): Request[js.Object] = js.native
    def disableVgwRoutePropagation(params: DisableVgwRoutePropagationRequest): Request[js.Object] = js.native
    def disableVpcClassicLink(params: DisableVpcClassicLinkRequest): Request[DisableVpcClassicLinkResult] = js.native
    def disableVpcClassicLinkDnsSupport(params: DisableVpcClassicLinkDnsSupportRequest): Request[DisableVpcClassicLinkDnsSupportResult] = js.native
    def disassociateAddress(params: DisassociateAddressRequest): Request[js.Object] = js.native
    def disassociateIamInstanceProfile(params: DisassociateIamInstanceProfileRequest): Request[DisassociateIamInstanceProfileResult] = js.native
    def disassociateRouteTable(params: DisassociateRouteTableRequest): Request[js.Object] = js.native
    def disassociateSubnetCidrBlock(params: DisassociateSubnetCidrBlockRequest): Request[DisassociateSubnetCidrBlockResult] = js.native
    def disassociateVpcCidrBlock(params: DisassociateVpcCidrBlockRequest): Request[DisassociateVpcCidrBlockResult] = js.native
    def enableVgwRoutePropagation(params: EnableVgwRoutePropagationRequest): Request[js.Object] = js.native
    def enableVolumeIO(params: EnableVolumeIORequest): Request[js.Object] = js.native
    def enableVpcClassicLink(params: EnableVpcClassicLinkRequest): Request[EnableVpcClassicLinkResult] = js.native
    def enableVpcClassicLinkDnsSupport(params: EnableVpcClassicLinkDnsSupportRequest): Request[EnableVpcClassicLinkDnsSupportResult] = js.native
    def getConsoleOutput(params: GetConsoleOutputRequest): Request[GetConsoleOutputResult] = js.native
    def getConsoleScreenshot(params: GetConsoleScreenshotRequest): Request[GetConsoleScreenshotResult] = js.native
    def getHostReservationPurchasePreview(params: GetHostReservationPurchasePreviewRequest): Request[GetHostReservationPurchasePreviewResult] = js.native
    def getLaunchTemplateData(params: GetLaunchTemplateDataRequest): Request[GetLaunchTemplateDataResult] = js.native
    def getPasswordData(params: GetPasswordDataRequest): Request[GetPasswordDataResult] = js.native
    def getReservedInstancesExchangeQuote(params: GetReservedInstancesExchangeQuoteRequest): Request[GetReservedInstancesExchangeQuoteResult] = js.native
    def importImage(params: ImportImageRequest): Request[ImportImageResult] = js.native
    def importInstance(params: ImportInstanceRequest): Request[ImportInstanceResult] = js.native
    def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult] = js.native
    def importSnapshot(params: ImportSnapshotRequest): Request[ImportSnapshotResult] = js.native
    def importVolume(params: ImportVolumeRequest): Request[ImportVolumeResult] = js.native
    def modifyCapacityReservation(params: ModifyCapacityReservationRequest): Request[ModifyCapacityReservationResult] = js.native
    def modifyFleet(params: ModifyFleetRequest): Request[ModifyFleetResult] = js.native
    def modifyFpgaImageAttribute(params: ModifyFpgaImageAttributeRequest): Request[ModifyFpgaImageAttributeResult] = js.native
    def modifyHosts(params: ModifyHostsRequest): Request[ModifyHostsResult] = js.native
    def modifyIdFormat(params: ModifyIdFormatRequest): Request[js.Object] = js.native
    def modifyIdentityIdFormat(params: ModifyIdentityIdFormatRequest): Request[js.Object] = js.native
    def modifyImageAttribute(params: ModifyImageAttributeRequest): Request[js.Object] = js.native
    def modifyInstanceAttribute(params: ModifyInstanceAttributeRequest): Request[js.Object] = js.native
    def modifyInstanceCapacityReservationAttributes(params: ModifyInstanceCapacityReservationAttributesRequest): Request[ModifyInstanceCapacityReservationAttributesResult] = js.native
    def modifyInstanceCreditSpecification(params: ModifyInstanceCreditSpecificationRequest): Request[ModifyInstanceCreditSpecificationResult] = js.native
    def modifyInstancePlacement(params: ModifyInstancePlacementRequest): Request[ModifyInstancePlacementResult] = js.native
    def modifyLaunchTemplate(params: ModifyLaunchTemplateRequest): Request[ModifyLaunchTemplateResult] = js.native
    def modifyNetworkInterfaceAttribute(params: ModifyNetworkInterfaceAttributeRequest): Request[js.Object] = js.native
    def modifyReservedInstances(params: ModifyReservedInstancesRequest): Request[ModifyReservedInstancesResult] = js.native
    def modifySnapshotAttribute(params: ModifySnapshotAttributeRequest): Request[js.Object] = js.native
    def modifySpotFleetRequest(params: ModifySpotFleetRequestRequest): Request[ModifySpotFleetRequestResponse] = js.native
    def modifySubnetAttribute(params: ModifySubnetAttributeRequest): Request[js.Object] = js.native
    def modifyVolume(params: ModifyVolumeRequest): Request[ModifyVolumeResult] = js.native
    def modifyVolumeAttribute(params: ModifyVolumeAttributeRequest): Request[js.Object] = js.native
    def modifyVpcAttribute(params: ModifyVpcAttributeRequest): Request[js.Object] = js.native
    def modifyVpcEndpoint(params: ModifyVpcEndpointRequest): Request[ModifyVpcEndpointResult] = js.native
    def modifyVpcEndpointConnectionNotification(params: ModifyVpcEndpointConnectionNotificationRequest): Request[ModifyVpcEndpointConnectionNotificationResult] = js.native
    def modifyVpcEndpointServiceConfiguration(params: ModifyVpcEndpointServiceConfigurationRequest): Request[ModifyVpcEndpointServiceConfigurationResult] = js.native
    def modifyVpcEndpointServicePermissions(params: ModifyVpcEndpointServicePermissionsRequest): Request[ModifyVpcEndpointServicePermissionsResult] = js.native
    def modifyVpcPeeringConnectionOptions(params: ModifyVpcPeeringConnectionOptionsRequest): Request[ModifyVpcPeeringConnectionOptionsResult] = js.native
    def modifyVpcTenancy(params: ModifyVpcTenancyRequest): Request[ModifyVpcTenancyResult] = js.native
    def monitorInstances(params: MonitorInstancesRequest): Request[MonitorInstancesResult] = js.native
    def moveAddressToVpc(params: MoveAddressToVpcRequest): Request[MoveAddressToVpcResult] = js.native
    def provisionByoipCidr(params: ProvisionByoipCidrRequest): Request[ProvisionByoipCidrResult] = js.native
    def purchaseHostReservation(params: PurchaseHostReservationRequest): Request[PurchaseHostReservationResult] = js.native
    def purchaseReservedInstancesOffering(params: PurchaseReservedInstancesOfferingRequest): Request[PurchaseReservedInstancesOfferingResult] = js.native
    def purchaseScheduledInstances(params: PurchaseScheduledInstancesRequest): Request[PurchaseScheduledInstancesResult] = js.native
    def rebootInstances(params: RebootInstancesRequest): Request[js.Object] = js.native
    def registerImage(params: RegisterImageRequest): Request[RegisterImageResult] = js.native
    def rejectVpcEndpointConnections(params: RejectVpcEndpointConnectionsRequest): Request[RejectVpcEndpointConnectionsResult] = js.native
    def rejectVpcPeeringConnection(params: RejectVpcPeeringConnectionRequest): Request[RejectVpcPeeringConnectionResult] = js.native
    def releaseAddress(params: ReleaseAddressRequest): Request[js.Object] = js.native
    def releaseHosts(params: ReleaseHostsRequest): Request[ReleaseHostsResult] = js.native
    def replaceIamInstanceProfileAssociation(params: ReplaceIamInstanceProfileAssociationRequest): Request[ReplaceIamInstanceProfileAssociationResult] = js.native
    def replaceNetworkAclAssociation(params: ReplaceNetworkAclAssociationRequest): Request[ReplaceNetworkAclAssociationResult] = js.native
    def replaceNetworkAclEntry(params: ReplaceNetworkAclEntryRequest): Request[js.Object] = js.native
    def replaceRoute(params: ReplaceRouteRequest): Request[js.Object] = js.native
    def replaceRouteTableAssociation(params: ReplaceRouteTableAssociationRequest): Request[ReplaceRouteTableAssociationResult] = js.native
    def reportInstanceStatus(params: ReportInstanceStatusRequest): Request[js.Object] = js.native
    def requestSpotFleet(params: RequestSpotFleetRequest): Request[RequestSpotFleetResponse] = js.native
    def requestSpotInstances(params: RequestSpotInstancesRequest): Request[RequestSpotInstancesResult] = js.native
    def resetFpgaImageAttribute(params: ResetFpgaImageAttributeRequest): Request[ResetFpgaImageAttributeResult] = js.native
    def resetImageAttribute(params: ResetImageAttributeRequest): Request[js.Object] = js.native
    def resetInstanceAttribute(params: ResetInstanceAttributeRequest): Request[js.Object] = js.native
    def resetNetworkInterfaceAttribute(params: ResetNetworkInterfaceAttributeRequest): Request[js.Object] = js.native
    def resetSnapshotAttribute(params: ResetSnapshotAttributeRequest): Request[js.Object] = js.native
    def restoreAddressToClassic(params: RestoreAddressToClassicRequest): Request[RestoreAddressToClassicResult] = js.native
    def revokeSecurityGroupEgress(params: RevokeSecurityGroupEgressRequest): Request[js.Object] = js.native
    def revokeSecurityGroupIngress(params: RevokeSecurityGroupIngressRequest): Request[js.Object] = js.native
    def runInstances(params: RunInstancesRequest): Request[Reservation] = js.native
    def runScheduledInstances(params: RunScheduledInstancesRequest): Request[RunScheduledInstancesResult] = js.native
    def startInstances(params: StartInstancesRequest): Request[StartInstancesResult] = js.native
    def stopInstances(params: StopInstancesRequest): Request[StopInstancesResult] = js.native
    def terminateInstances(params: TerminateInstancesRequest): Request[TerminateInstancesResult] = js.native
    def unassignIpv6Addresses(params: UnassignIpv6AddressesRequest): Request[UnassignIpv6AddressesResult] = js.native
    def unassignPrivateIpAddresses(params: UnassignPrivateIpAddressesRequest): Request[js.Object] = js.native
    def unmonitorInstances(params: UnmonitorInstancesRequest): Request[UnmonitorInstancesResult] = js.native
    def updateSecurityGroupRuleDescriptionsEgress(params: UpdateSecurityGroupRuleDescriptionsEgressRequest): Request[UpdateSecurityGroupRuleDescriptionsEgressResult] = js.native
    def updateSecurityGroupRuleDescriptionsIngress(params: UpdateSecurityGroupRuleDescriptionsIngressRequest): Request[UpdateSecurityGroupRuleDescriptionsIngressResult] = js.native
    def withdrawByoipCidr(params: WithdrawByoipCidrRequest): Request[WithdrawByoipCidrResult] = js.native
  }

  /**
   * <p>Contains the parameters for accepting the quote.</p>
   */
  @js.native
  trait AcceptReservedInstancesExchangeQuoteRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ReservedInstanceIds: js.UndefOr[ReservedInstanceIdSet]
    var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet]
  }

  object AcceptReservedInstancesExchangeQuoteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ReservedInstanceIds: js.UndefOr[ReservedInstanceIdSet] = js.undefined,
      TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.undefined): AcceptReservedInstancesExchangeQuoteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstanceIds" -> ReservedInstanceIds.map { x => x.asInstanceOf[js.Any] },
        "TargetConfigurations" -> TargetConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedInstancesExchangeQuoteRequest]
    }
  }

  /**
   * <p>The result of the exchange and whether it was <code>successful</code>.</p>
   */
  @js.native
  trait AcceptReservedInstancesExchangeQuoteResult extends js.Object {
    var ExchangeId: js.UndefOr[String]
  }

  object AcceptReservedInstancesExchangeQuoteResult {
    def apply(
      ExchangeId: js.UndefOr[String] = js.undefined): AcceptReservedInstancesExchangeQuoteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExchangeId" -> ExchangeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
    }
  }

  @js.native
  trait AcceptVpcEndpointConnectionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ServiceId: js.UndefOr[String]
    var VpcEndpointIds: js.UndefOr[ValueStringList]
  }

  object AcceptVpcEndpointConnectionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined,
      VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined): AcceptVpcEndpointConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointIds" -> VpcEndpointIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptVpcEndpointConnectionsRequest]
    }
  }

  @js.native
  trait AcceptVpcEndpointConnectionsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object AcceptVpcEndpointConnectionsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): AcceptVpcEndpointConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptVpcEndpointConnectionsResult]
    }
  }

  @js.native
  trait AcceptVpcPeeringConnectionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  object AcceptVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined): AcceptVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptVpcPeeringConnectionRequest]
    }
  }

  @js.native
  trait AcceptVpcPeeringConnectionResult extends js.Object {
    var VpcPeeringConnection: js.UndefOr[VpcPeeringConnection]
  }

  object AcceptVpcPeeringConnectionResult {
    def apply(
      VpcPeeringConnection: js.UndefOr[VpcPeeringConnection] = js.undefined): AcceptVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringConnection" -> VpcPeeringConnection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptVpcPeeringConnectionResult]
    }
  }

  /**
   * <p>Describes an account attribute.</p>
   */
  @js.native
  trait AccountAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AccountAttributeValueList]
  }

  object AccountAttribute {
    def apply(
      AttributeName: js.UndefOr[String] = js.undefined,
      AttributeValues: js.UndefOr[AccountAttributeValueList] = js.undefined): AccountAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValues" -> AttributeValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttribute]
    }
  }

  object AccountAttributeNameEnum {
    val `supported-platforms` = "supported-platforms"
    val `default-vpc` = "default-vpc"

    val values = IndexedSeq(`supported-platforms`, `default-vpc`)
  }

  /**
   * <p>Describes a value of an account attribute.</p>
   */
  @js.native
  trait AccountAttributeValue extends js.Object {
    var AttributeValue: js.UndefOr[String]
  }

  object AccountAttributeValue {
    def apply(
      AttributeValue: js.UndefOr[String] = js.undefined): AccountAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeValue" -> AttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributeValue]
    }
  }

  /**
   * <p>Describes a running instance in a Spot Fleet.</p>
   */
  @js.native
  trait ActiveInstance extends js.Object {
    var InstanceId: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var SpotInstanceRequestId: js.UndefOr[String]
    var InstanceHealth: js.UndefOr[InstanceHealthStatus]
  }

  object ActiveInstance {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      InstanceHealth: js.UndefOr[InstanceHealthStatus] = js.undefined): ActiveInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x.asInstanceOf[js.Any] },
        "InstanceHealth" -> InstanceHealth.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActiveInstance]
    }
  }

  object ActivityStatusEnum {
    val error = "error"
    val pending_fulfillment = "pending_fulfillment"
    val pending_termination = "pending_termination"
    val fulfilled = "fulfilled"

    val values = IndexedSeq(error, pending_fulfillment, pending_termination, fulfilled)
  }

  /**
   * <p>Describes an Elastic IP address.</p>
   */
  @js.native
  trait Address extends js.Object {
    var PrivateIpAddress: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var AllocationId: js.UndefOr[String]
    var NetworkInterfaceOwnerId: js.UndefOr[String]
    var PublicIpv4Pool: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var NetworkInterfaceId: js.UndefOr[String]
    var Domain: js.UndefOr[DomainType]
    var AssociationId: js.UndefOr[String]
  }

  object Address {
    def apply(
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceOwnerId: js.UndefOr[String] = js.undefined,
      PublicIpv4Pool: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined): Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceOwnerId" -> NetworkInterfaceOwnerId.map { x => x.asInstanceOf[js.Any] },
        "PublicIpv4Pool" -> PublicIpv4Pool.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Address]
    }
  }

  @js.native
  trait AdvertiseByoipCidrRequest extends js.Object {
    var Cidr: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object AdvertiseByoipCidrRequest {
    def apply(
      Cidr: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): AdvertiseByoipCidrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdvertiseByoipCidrRequest]
    }
  }

  @js.native
  trait AdvertiseByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object AdvertiseByoipCidrResult {
    def apply(
      ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined): AdvertiseByoipCidrResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByoipCidr" -> ByoipCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdvertiseByoipCidrResult]
    }
  }

  object AffinityEnum {
    val default = "default"
    val host = "host"

    val values = IndexedSeq(default, host)
  }

  @js.native
  trait AllocateAddressRequest extends js.Object {
    var Domain: js.UndefOr[DomainType]
    var Address: js.UndefOr[String]
    var PublicIpv4Pool: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object AllocateAddressRequest {
    def apply(
      Domain: js.UndefOr[DomainType] = js.undefined,
      Address: js.UndefOr[String] = js.undefined,
      PublicIpv4Pool: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): AllocateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "PublicIpv4Pool" -> PublicIpv4Pool.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateAddressRequest]
    }
  }

  @js.native
  trait AllocateAddressResult extends js.Object {
    var PublicIp: js.UndefOr[String]
    var AllocationId: js.UndefOr[String]
    var PublicIpv4Pool: js.UndefOr[String]
    var Domain: js.UndefOr[DomainType]
  }

  object AllocateAddressResult {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      PublicIpv4Pool: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined): AllocateAddressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "PublicIpv4Pool" -> PublicIpv4Pool.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateAddressResult]
    }
  }

  @js.native
  trait AllocateHostsRequest extends js.Object {
    var Quantity: js.UndefOr[Int]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var ClientToken: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var AutoPlacement: js.UndefOr[AutoPlacement]
  }

  object AllocateHostsRequest {
    def apply(
      Quantity: js.UndefOr[Int] = js.undefined,
      TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined): AllocateHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AutoPlacement" -> AutoPlacement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateHostsRequest]
    }
  }

  /**
   * <p>Contains the output of AllocateHosts.</p>
   */
  @js.native
  trait AllocateHostsResult extends js.Object {
    var HostIds: js.UndefOr[ResponseHostIdList]
  }

  object AllocateHostsResult {
    def apply(
      HostIds: js.UndefOr[ResponseHostIdList] = js.undefined): AllocateHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostIds" -> HostIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateHostsResult]
    }
  }

  object AllocationStateEnum {
    val available = "available"
    val `under-assessment` = "under-assessment"
    val `permanent-failure` = "permanent-failure"
    val released = "released"
    val `released-permanent-failure` = "released-permanent-failure"

    val values = IndexedSeq(available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`)
  }

  object AllocationStrategyEnum {
    val lowestPrice = "lowestPrice"
    val diversified = "diversified"

    val values = IndexedSeq(lowestPrice, diversified)
  }

  /**
   * <p>Describes a principal.</p>
   */
  @js.native
  trait AllowedPrincipal extends js.Object {
    var PrincipalType: js.UndefOr[PrincipalType]
    var Principal: js.UndefOr[String]
  }

  object AllowedPrincipal {
    def apply(
      PrincipalType: js.UndefOr[PrincipalType] = js.undefined,
      Principal: js.UndefOr[String] = js.undefined): AllowedPrincipal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalType" -> PrincipalType.map { x => x.asInstanceOf[js.Any] },
        "Principal" -> Principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllowedPrincipal]
    }
  }

  object ArchitectureValuesEnum {
    val i386 = "i386"
    val x86_64 = "x86_64"

    val values = IndexedSeq(i386, x86_64)
  }

  @js.native
  trait AssignIpv6AddressesRequest extends js.Object {
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[Ipv6AddressList]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object AssignIpv6AddressesRequest {
    def apply(
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): AssignIpv6AddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignIpv6AddressesRequest]
    }
  }

  @js.native
  trait AssignIpv6AddressesResult extends js.Object {
    var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object AssignIpv6AddressesResult {
    def apply(
      AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): AssignIpv6AddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignedIpv6Addresses" -> AssignedIpv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignIpv6AddressesResult]
    }
  }

  /**
   * <p>Contains the parameters for AssignPrivateIpAddresses.</p>
   */
  @js.native
  trait AssignPrivateIpAddressesRequest extends js.Object {
    var AllowReassignment: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
  }

  object AssignPrivateIpAddressesRequest {
    def apply(
      AllowReassignment: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Int] = js.undefined): AssignPrivateIpAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowReassignment" -> AllowReassignment.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignPrivateIpAddressesRequest]
    }
  }

  @js.native
  trait AssociateAddressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var PrivateIpAddress: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var AllocationId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var AllowReassociation: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object AssociateAddressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      AllowReassociation: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): AssociateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "AllowReassociation" -> AllowReassociation.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateAddressRequest]
    }
  }

  @js.native
  trait AssociateAddressResult extends js.Object {
    var AssociationId: js.UndefOr[String]
  }

  object AssociateAddressResult {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined): AssociateAddressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateAddressResult]
    }
  }

  @js.native
  trait AssociateDhcpOptionsRequest extends js.Object {
    var DhcpOptionsId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object AssociateDhcpOptionsRequest {
    def apply(
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): AssociateDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpOptionsId" -> DhcpOptionsId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDhcpOptionsRequest]
    }
  }

  @js.native
  trait AssociateIamInstanceProfileRequest extends js.Object {
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var InstanceId: js.UndefOr[String]
  }

  object AssociateIamInstanceProfileRequest {
    def apply(
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): AssociateIamInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateIamInstanceProfileRequest]
    }
  }

  @js.native
  trait AssociateIamInstanceProfileResult extends js.Object {
    var IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation]
  }

  object AssociateIamInstanceProfileResult {
    def apply(
      IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation] = js.undefined): AssociateIamInstanceProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfileAssociation" -> IamInstanceProfileAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateIamInstanceProfileResult]
    }
  }

  @js.native
  trait AssociateRouteTableRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var RouteTableId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object AssociateRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): AssociateRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateRouteTableRequest]
    }
  }

  @js.native
  trait AssociateRouteTableResult extends js.Object {
    var AssociationId: js.UndefOr[String]
  }

  object AssociateRouteTableResult {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined): AssociateRouteTableResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateRouteTableResult]
    }
  }

  @js.native
  trait AssociateSubnetCidrBlockRequest extends js.Object {
    var Ipv6CidrBlock: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object AssociateSubnetCidrBlockRequest {
    def apply(
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): AssociateSubnetCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSubnetCidrBlockRequest]
    }
  }

  @js.native
  trait AssociateSubnetCidrBlockResult extends js.Object {
    var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation]
    var SubnetId: js.UndefOr[String]
  }

  object AssociateSubnetCidrBlockResult {
    def apply(
      Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): AssociateSubnetCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSubnetCidrBlockResult]
    }
  }

  @js.native
  trait AssociateVpcCidrBlockRequest extends js.Object {
    var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean]
    var CidrBlock: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object AssociateVpcCidrBlockRequest {
    def apply(
      AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): AssociateVpcCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmazonProvidedIpv6CidrBlock" -> AmazonProvidedIpv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVpcCidrBlockRequest]
    }
  }

  @js.native
  trait AssociateVpcCidrBlockResult extends js.Object {
    var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation]
    var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation]
    var VpcId: js.UndefOr[String]
  }

  object AssociateVpcCidrBlockResult {
    def apply(
      Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.undefined,
      CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): AssociateVpcCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x.asInstanceOf[js.Any] },
        "CidrBlockAssociation" -> CidrBlockAssociation.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVpcCidrBlockResult]
    }
  }

  @js.native
  trait AttachClassicLinkVpcRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Groups: js.UndefOr[GroupIdStringList]
    var InstanceId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object AttachClassicLinkVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Groups: js.UndefOr[GroupIdStringList] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): AttachClassicLinkVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachClassicLinkVpcRequest]
    }
  }

  @js.native
  trait AttachClassicLinkVpcResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object AttachClassicLinkVpcResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): AttachClassicLinkVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachClassicLinkVpcResult]
    }
  }

  @js.native
  trait AttachInternetGatewayRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InternetGatewayId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object AttachInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): AttachInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InternetGatewayId" -> InternetGatewayId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInternetGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for AttachNetworkInterface.</p>
   */
  @js.native
  trait AttachNetworkInterfaceRequest extends js.Object {
    var DeviceIndex: js.UndefOr[Int]
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object AttachNetworkInterfaceRequest {
    def apply(
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): AttachNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the output of AttachNetworkInterface.</p>
   */
  @js.native
  trait AttachNetworkInterfaceResult extends js.Object {
    var AttachmentId: js.UndefOr[String]
  }

  object AttachNetworkInterfaceResult {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined): AttachNetworkInterfaceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachmentId" -> AttachmentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachNetworkInterfaceResult]
    }
  }

  /**
   * <p>Contains the parameters for AttachVolume.</p>
   */
  @js.native
  trait AttachVolumeRequest extends js.Object {
    var Device: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object AttachVolumeRequest {
    def apply(
      Device: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): AttachVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachVolumeRequest]
    }
  }

  /**
   * <p>Contains the parameters for AttachVpnGateway.</p>
   */
  @js.native
  trait AttachVpnGatewayRequest extends js.Object {
    var VpcId: js.UndefOr[String]
    var VpnGatewayId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object AttachVpnGatewayRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): AttachVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "VpnGatewayId" -> VpnGatewayId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachVpnGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of AttachVpnGateway.</p>
   */
  @js.native
  trait AttachVpnGatewayResult extends js.Object {
    var VpcAttachment: js.UndefOr[VpcAttachment]
  }

  object AttachVpnGatewayResult {
    def apply(
      VpcAttachment: js.UndefOr[VpcAttachment] = js.undefined): AttachVpnGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcAttachment" -> VpcAttachment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachVpnGatewayResult]
    }
  }

  object AttachmentStatusEnum {
    val attaching = "attaching"
    val attached = "attached"
    val detaching = "detaching"
    val detached = "detached"

    val values = IndexedSeq(attaching, attached, detaching, detached)
  }

  /**
   * <p>Describes a value for a resource attribute that is a Boolean value.</p>
   */
  @js.native
  trait AttributeBooleanValue extends js.Object {
    var Value: js.UndefOr[Boolean]
  }

  object AttributeBooleanValue {
    def apply(
      Value: js.UndefOr[Boolean] = js.undefined): AttributeBooleanValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeBooleanValue]
    }
  }

  /**
   * <p>Describes a value for a resource attribute that is a String.</p>
   */
  @js.native
  trait AttributeValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  object AttributeValue {
    def apply(
      Value: js.UndefOr[String] = js.undefined): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
  }

  @js.native
  trait AuthorizeSecurityGroupEgressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var CidrIp: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var SourceSecurityGroupName: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeSecurityGroupEgressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Int] = js.undefined,
      FromPort: js.UndefOr[Int] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined): AuthorizeSecurityGroupEgressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "IpProtocol" -> IpProtocol.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSecurityGroupEgressRequest]
    }
  }

  @js.native
  trait AuthorizeSecurityGroupIngressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var CidrIp: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var SourceSecurityGroupName: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeSecurityGroupIngressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Int] = js.undefined,
      FromPort: js.UndefOr[Int] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined): AuthorizeSecurityGroupIngressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "IpProtocol" -> IpProtocol.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSecurityGroupIngressRequest]
    }
  }

  object AutoPlacementEnum {
    val on = "on"
    val off = "off"

    val values = IndexedSeq(on, off)
  }

  /**
   * <p>Describes an Availability Zone.</p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var State: js.UndefOr[AvailabilityZoneState]
    var Messages: js.UndefOr[AvailabilityZoneMessageList]
    var RegionName: js.UndefOr[String]
    var ZoneName: js.UndefOr[String]
  }

  object AvailabilityZone {
    def apply(
      State: js.UndefOr[AvailabilityZoneState] = js.undefined,
      Messages: js.UndefOr[AvailabilityZoneMessageList] = js.undefined,
      RegionName: js.UndefOr[String] = js.undefined,
      ZoneName: js.UndefOr[String] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Messages" -> Messages.map { x => x.asInstanceOf[js.Any] },
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] },
        "ZoneName" -> ZoneName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p>Describes a message about an Availability Zone.</p>
   */
  @js.native
  trait AvailabilityZoneMessage extends js.Object {
    var Message: js.UndefOr[String]
  }

  object AvailabilityZoneMessage {
    def apply(
      Message: js.UndefOr[String] = js.undefined): AvailabilityZoneMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZoneMessage]
    }
  }

  object AvailabilityZoneStateEnum {
    val available = "available"
    val information = "information"
    val impaired = "impaired"
    val unavailable = "unavailable"

    val values = IndexedSeq(available, information, impaired, unavailable)
  }

  /**
   * <p>The capacity information for instances launched onto the Dedicated Host.</p>
   */
  @js.native
  trait AvailableCapacity extends js.Object {
    var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList]
    var AvailableVCpus: js.UndefOr[Int]
  }

  object AvailableCapacity {
    def apply(
      AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.undefined,
      AvailableVCpus: js.UndefOr[Int] = js.undefined): AvailableCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailableInstanceCapacity" -> AvailableInstanceCapacity.map { x => x.asInstanceOf[js.Any] },
        "AvailableVCpus" -> AvailableVCpus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailableCapacity]
    }
  }

  object BatchStateEnum {
    val submitted = "submitted"
    val active = "active"
    val cancelled = "cancelled"
    val failed = "failed"
    val cancelled_running = "cancelled_running"
    val cancelled_terminating = "cancelled_terminating"
    val modifying = "modifying"

    val values = IndexedSeq(submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying)
  }

  @js.native
  trait BlobAttributeValue extends js.Object {
    var Value: js.UndefOr[Blob]
  }

  object BlobAttributeValue {
    def apply(
      Value: js.UndefOr[Blob] = js.undefined): BlobAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlobAttributeValue]
    }
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsBlockDevice]
    var NoDevice: js.UndefOr[String]
  }

  object BlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsBlockDevice] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined): BlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "VirtualName" -> VirtualName.map { x => x.asInstanceOf[js.Any] },
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] },
        "NoDevice" -> NoDevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlockDeviceMapping]
    }
  }

  /**
   * <p>Contains the parameters for BundleInstance.</p>
   */
  @js.native
  trait BundleInstanceRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Storage: js.UndefOr[Storage]
    var DryRun: js.UndefOr[Boolean]
  }

  object BundleInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Storage: js.UndefOr[Storage] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): BundleInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Storage" -> Storage.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleInstanceRequest]
    }
  }

  /**
   * <p>Contains the output of BundleInstance.</p>
   */
  @js.native
  trait BundleInstanceResult extends js.Object {
    var BundleTask: js.UndefOr[BundleTask]
  }

  object BundleInstanceResult {
    def apply(
      BundleTask: js.UndefOr[BundleTask] = js.undefined): BundleInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleTask" -> BundleTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleInstanceResult]
    }
  }

  /**
   * <p>Describes a bundle task.</p>
   */
  @js.native
  trait BundleTask extends js.Object {
    var Storage: js.UndefOr[Storage]
    var BundleId: js.UndefOr[String]
    var BundleTaskError: js.UndefOr[BundleTaskError]
    var StartTime: js.UndefOr[DateTime]
    var InstanceId: js.UndefOr[String]
    var State: js.UndefOr[BundleTaskState]
    var Progress: js.UndefOr[String]
    var UpdateTime: js.UndefOr[DateTime]
  }

  object BundleTask {
    def apply(
      Storage: js.UndefOr[Storage] = js.undefined,
      BundleId: js.UndefOr[String] = js.undefined,
      BundleTaskError: js.UndefOr[BundleTaskError] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[BundleTaskState] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      UpdateTime: js.UndefOr[DateTime] = js.undefined): BundleTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Storage" -> Storage.map { x => x.asInstanceOf[js.Any] },
        "BundleId" -> BundleId.map { x => x.asInstanceOf[js.Any] },
        "BundleTaskError" -> BundleTaskError.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "UpdateTime" -> UpdateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleTask]
    }
  }

  /**
   * <p>Describes an error for <a>BundleInstance</a>.</p>
   */
  @js.native
  trait BundleTaskError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object BundleTaskError {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): BundleTaskError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleTaskError]
    }
  }

  object BundleTaskStateEnum {
    val pending = "pending"
    val `waiting-for-shutdown` = "waiting-for-shutdown"
    val bundling = "bundling"
    val storing = "storing"
    val cancelling = "cancelling"
    val complete = "complete"
    val failed = "failed"

    val values = IndexedSeq(pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed)
  }

  /**
   * <p>Information about an address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP).</p>
   */
  @js.native
  trait ByoipCidr extends js.Object {
    var Cidr: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var State: js.UndefOr[ByoipCidrState]
  }

  object ByoipCidr {
    def apply(
      Cidr: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[ByoipCidrState] = js.undefined): ByoipCidr = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByoipCidr]
    }
  }

  object ByoipCidrStateEnum {
    val advertised = "advertised"
    val deprovisioned = "deprovisioned"
    val `failed-deprovision` = "failed-deprovision"
    val `failed-provision` = "failed-provision"
    val `pending-deprovision` = "pending-deprovision"
    val `pending-provision` = "pending-provision"
    val provisioned = "provisioned"

    val values = IndexedSeq(advertised, deprovisioned, `failed-deprovision`, `failed-provision`, `pending-deprovision`, `pending-provision`, provisioned)
  }

  object CancelBatchErrorCodeEnum {
    val fleetRequestIdDoesNotExist = "fleetRequestIdDoesNotExist"
    val fleetRequestIdMalformed = "fleetRequestIdMalformed"
    val fleetRequestNotInCancellableState = "fleetRequestNotInCancellableState"
    val unexpectedError = "unexpectedError"

    val values = IndexedSeq(fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
  }

  /**
   * <p>Contains the parameters for CancelBundleTask.</p>
   */
  @js.native
  trait CancelBundleTaskRequest extends js.Object {
    var BundleId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object CancelBundleTaskRequest {
    def apply(
      BundleId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CancelBundleTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelBundleTaskRequest]
    }
  }

  /**
   * <p>Contains the output of CancelBundleTask.</p>
   */
  @js.native
  trait CancelBundleTaskResult extends js.Object {
    var BundleTask: js.UndefOr[BundleTask]
  }

  object CancelBundleTaskResult {
    def apply(
      BundleTask: js.UndefOr[BundleTask] = js.undefined): CancelBundleTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleTask" -> BundleTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelBundleTaskResult]
    }
  }

  @js.native
  trait CancelCapacityReservationRequest extends js.Object {
    var CapacityReservationId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object CancelCapacityReservationRequest {
    def apply(
      CapacityReservationId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CancelCapacityReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationId" -> CapacityReservationId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCapacityReservationRequest]
    }
  }

  @js.native
  trait CancelCapacityReservationResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object CancelCapacityReservationResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): CancelCapacityReservationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCapacityReservationResult]
    }
  }

  /**
   * <p>Contains the parameters for CancelConversionTask.</p>
   */
  @js.native
  trait CancelConversionRequest extends js.Object {
    var ConversionTaskId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var ReasonMessage: js.UndefOr[String]
  }

  object CancelConversionRequest {
    def apply(
      ConversionTaskId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ReasonMessage: js.UndefOr[String] = js.undefined): CancelConversionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConversionTaskId" -> ConversionTaskId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ReasonMessage" -> ReasonMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelConversionRequest]
    }
  }

  /**
   * <p>Contains the parameters for CancelExportTask.</p>
   */
  @js.native
  trait CancelExportTaskRequest extends js.Object {
    var ExportTaskId: js.UndefOr[String]
  }

  object CancelExportTaskRequest {
    def apply(
      ExportTaskId: js.UndefOr[String] = js.undefined): CancelExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportTaskId" -> ExportTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelExportTaskRequest]
    }
  }

  /**
   * <p>Contains the parameters for CancelImportTask.</p>
   */
  @js.native
  trait CancelImportTaskRequest extends js.Object {
    var CancelReason: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var ImportTaskId: js.UndefOr[String]
  }

  object CancelImportTaskRequest {
    def apply(
      CancelReason: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined): CancelImportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CancelReason" -> CancelReason.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskId" -> ImportTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelImportTaskRequest]
    }
  }

  /**
   * <p>Contains the output for CancelImportTask.</p>
   */
  @js.native
  trait CancelImportTaskResult extends js.Object {
    var ImportTaskId: js.UndefOr[String]
    var PreviousState: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  object CancelImportTaskResult {
    def apply(
      ImportTaskId: js.UndefOr[String] = js.undefined,
      PreviousState: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined): CancelImportTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportTaskId" -> ImportTaskId.map { x => x.asInstanceOf[js.Any] },
        "PreviousState" -> PreviousState.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelImportTaskResult]
    }
  }

  /**
   * <p>Contains the parameters for CancelReservedInstancesListing.</p>
   */
  @js.native
  trait CancelReservedInstancesListingRequest extends js.Object {
    var ReservedInstancesListingId: js.UndefOr[String]
  }

  object CancelReservedInstancesListingRequest {
    def apply(
      ReservedInstancesListingId: js.UndefOr[String] = js.undefined): CancelReservedInstancesListingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesListingId" -> ReservedInstancesListingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelReservedInstancesListingRequest]
    }
  }

  /**
   * <p>Contains the output of CancelReservedInstancesListing.</p>
   */
  @js.native
  trait CancelReservedInstancesListingResult extends js.Object {
    var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList]
  }

  object CancelReservedInstancesListingResult {
    def apply(
      ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined): CancelReservedInstancesListingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesListings" -> ReservedInstancesListings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelReservedInstancesListingResult]
    }
  }

  /**
   * <p>Describes a Spot Fleet error.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsError extends js.Object {
    var Code: js.UndefOr[CancelBatchErrorCode]
    var Message: js.UndefOr[String]
  }

  object CancelSpotFleetRequestsError {
    def apply(
      Code: js.UndefOr[CancelBatchErrorCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): CancelSpotFleetRequestsError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsError]
    }
  }

  /**
   * <p>Describes a Spot Fleet request that was not successfully canceled.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsErrorItem extends js.Object {
    var Error: js.UndefOr[CancelSpotFleetRequestsError]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  object CancelSpotFleetRequestsErrorItem {
    def apply(
      Error: js.UndefOr[CancelSpotFleetRequestsError] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined): CancelSpotFleetRequestsErrorItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsErrorItem]
    }
  }

  /**
   * <p>Contains the parameters for CancelSpotFleetRequests.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var SpotFleetRequestIds: js.UndefOr[ValueStringList]
    var TerminateInstances: js.UndefOr[Boolean]
  }

  object CancelSpotFleetRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotFleetRequestIds: js.UndefOr[ValueStringList] = js.undefined,
      TerminateInstances: js.UndefOr[Boolean] = js.undefined): CancelSpotFleetRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestIds" -> SpotFleetRequestIds.map { x => x.asInstanceOf[js.Any] },
        "TerminateInstances" -> TerminateInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of CancelSpotFleetRequests.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsResponse extends js.Object {
    var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet]
    var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet]
  }

  object CancelSpotFleetRequestsResponse {
    def apply(
      SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.undefined,
      UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.undefined): CancelSpotFleetRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SuccessfulFleetRequests" -> SuccessfulFleetRequests.map { x => x.asInstanceOf[js.Any] },
        "UnsuccessfulFleetRequests" -> UnsuccessfulFleetRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsResponse]
    }
  }

  /**
   * <p>Describes a Spot Fleet request that was successfully canceled.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsSuccessItem extends js.Object {
    var CurrentSpotFleetRequestState: js.UndefOr[BatchState]
    var PreviousSpotFleetRequestState: js.UndefOr[BatchState]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  object CancelSpotFleetRequestsSuccessItem {
    def apply(
      CurrentSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined,
      PreviousSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined): CancelSpotFleetRequestsSuccessItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentSpotFleetRequestState" -> CurrentSpotFleetRequestState.map { x => x.asInstanceOf[js.Any] },
        "PreviousSpotFleetRequestState" -> PreviousSpotFleetRequestState.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsSuccessItem]
    }
  }

  object CancelSpotInstanceRequestStateEnum {
    val active = "active"
    val open = "open"
    val closed = "closed"
    val cancelled = "cancelled"
    val completed = "completed"

    val values = IndexedSeq(active, open, closed, cancelled, completed)
  }

  /**
   * <p>Contains the parameters for CancelSpotInstanceRequests.</p>
   */
  @js.native
  trait CancelSpotInstanceRequestsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList]
  }

  object CancelSpotInstanceRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList] = js.undefined): CancelSpotInstanceRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceRequestIds" -> SpotInstanceRequestIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotInstanceRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of CancelSpotInstanceRequests.</p>
   */
  @js.native
  trait CancelSpotInstanceRequestsResult extends js.Object {
    var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList]
  }

  object CancelSpotInstanceRequestsResult {
    def apply(
      CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.undefined): CancelSpotInstanceRequestsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CancelledSpotInstanceRequests" -> CancelledSpotInstanceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotInstanceRequestsResult]
    }
  }

  /**
   * <p>Describes a request to cancel a Spot Instance.</p>
   */
  @js.native
  trait CancelledSpotInstanceRequest extends js.Object {
    var SpotInstanceRequestId: js.UndefOr[String]
    var State: js.UndefOr[CancelSpotInstanceRequestState]
  }

  object CancelledSpotInstanceRequest {
    def apply(
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[CancelSpotInstanceRequestState] = js.undefined): CancelledSpotInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelledSpotInstanceRequest]
    }
  }

  /**
   * <p>Describes a Capacity Reservation.</p>
   */
  @js.native
  trait CapacityReservation extends js.Object {
    var EbsOptimized: js.UndefOr[Boolean]
    var InstanceMatchCriteria: js.UndefOr[InstanceMatchCriteria]
    var Tenancy: js.UndefOr[CapacityReservationTenancy]
    var EphemeralStorage: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform]
    var CreateDate: js.UndefOr[DateTime]
    var AvailableInstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[String]
    var CapacityReservationId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var EndDateType: js.UndefOr[EndDateType]
    var State: js.UndefOr[CapacityReservationState]
    var EndDate: js.UndefOr[DateTime]
    var TotalInstanceCount: js.UndefOr[Int]
  }

  object CapacityReservation {
    def apply(
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      InstanceMatchCriteria: js.UndefOr[InstanceMatchCriteria] = js.undefined,
      Tenancy: js.UndefOr[CapacityReservationTenancy] = js.undefined,
      EphemeralStorage: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      AvailableInstanceCount: js.UndefOr[Int] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      CapacityReservationId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      EndDateType: js.UndefOr[EndDateType] = js.undefined,
      State: js.UndefOr[CapacityReservationState] = js.undefined,
      EndDate: js.UndefOr[DateTime] = js.undefined,
      TotalInstanceCount: js.UndefOr[Int] = js.undefined): CapacityReservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "InstanceMatchCriteria" -> InstanceMatchCriteria.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "EphemeralStorage" -> EphemeralStorage.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstancePlatform" -> InstancePlatform.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "AvailableInstanceCount" -> AvailableInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationId" -> CapacityReservationId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "EndDateType" -> EndDateType.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "TotalInstanceCount" -> TotalInstanceCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CapacityReservation]
    }
  }

  object CapacityReservationInstancePlatformEnum {
    val `Linux/UNIX` = "Linux/UNIX"
    val `Red Hat Enterprise Linux` = "Red Hat Enterprise Linux"
    val `SUSE Linux` = "SUSE Linux"
    val Windows = "Windows"
    val `Windows with SQL Server` = "Windows with SQL Server"
    val `Windows with SQL Server Enterprise` = "Windows with SQL Server Enterprise"
    val `Windows with SQL Server Standard` = "Windows with SQL Server Standard"
    val `Windows with SQL Server Web` = "Windows with SQL Server Web"

    val values = IndexedSeq(`Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, Windows, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard`, `Windows with SQL Server Web`)
  }

  object CapacityReservationPreferenceEnum {
    val open = "open"
    val none = "none"

    val values = IndexedSeq(open, none)
  }

  /**
   * <p>Describes an instance's Capacity Reservation targeting option. You can specify only one option at a time. Use the <code>CapacityReservationPreference</code> parameter to configure the instance to run as an On-Demand Instance or to run in any <code>open</code> Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). Use the <code>CapacityReservationTarget</code> parameter to explicitly target a specific Capacity Reservation.</p>
   */
  @js.native
  trait CapacityReservationSpecification extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTarget]
  }

  object CapacityReservationSpecification {
    def apply(
      CapacityReservationPreference: js.UndefOr[CapacityReservationPreference] = js.undefined,
      CapacityReservationTarget: js.UndefOr[CapacityReservationTarget] = js.undefined): CapacityReservationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationPreference" -> CapacityReservationPreference.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationTarget" -> CapacityReservationTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CapacityReservationSpecification]
    }
  }

  /**
   * <p>Describes the instance's Capacity Reservation targeting preferences. The action returns the <code>capacityReservationPreference</code> response element if the instance is configured to run in On-Demand capacity, or if it is configured in run in any <code>open</code> Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). The action returns the <code>capacityReservationTarget</code> response element if the instance explicily targets a specific Capacity Reservation.</p>
   */
  @js.native
  trait CapacityReservationSpecificationResponse extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse]
  }

  object CapacityReservationSpecificationResponse {
    def apply(
      CapacityReservationPreference: js.UndefOr[CapacityReservationPreference] = js.undefined,
      CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse] = js.undefined): CapacityReservationSpecificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationPreference" -> CapacityReservationPreference.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationTarget" -> CapacityReservationTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CapacityReservationSpecificationResponse]
    }
  }

  object CapacityReservationStateEnum {
    val active = "active"
    val expired = "expired"
    val cancelled = "cancelled"
    val pending = "pending"
    val failed = "failed"

    val values = IndexedSeq(active, expired, cancelled, pending, failed)
  }

  /**
   * <p>Describes a target Capacity Reservation.</p>
   */
  @js.native
  trait CapacityReservationTarget extends js.Object {
    var CapacityReservationId: js.UndefOr[String]
  }

  object CapacityReservationTarget {
    def apply(
      CapacityReservationId: js.UndefOr[String] = js.undefined): CapacityReservationTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationId" -> CapacityReservationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CapacityReservationTarget]
    }
  }

  /**
   * <p>Describes a target Capacity Reservation.</p>
   */
  @js.native
  trait CapacityReservationTargetResponse extends js.Object {
    var CapacityReservationId: js.UndefOr[String]
  }

  object CapacityReservationTargetResponse {
    def apply(
      CapacityReservationId: js.UndefOr[String] = js.undefined): CapacityReservationTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationId" -> CapacityReservationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CapacityReservationTargetResponse]
    }
  }

  object CapacityReservationTenancyEnum {
    val default = "default"
    val dedicated = "dedicated"

    val values = IndexedSeq(default, dedicated)
  }

  /**
   * <p>Provides authorization for Amazon to bring a specific IP address range to a specific AWS account using bring your own IP addresses (BYOIP).</p>
   */
  @js.native
  trait CidrAuthorizationContext extends js.Object {
    var Message: js.UndefOr[String]
    var Signature: js.UndefOr[String]
  }

  object CidrAuthorizationContext {
    def apply(
      Message: js.UndefOr[String] = js.undefined,
      Signature: js.UndefOr[String] = js.undefined): CidrAuthorizationContext = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "Signature" -> Signature.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CidrAuthorizationContext]
    }
  }

  /**
   * <p>Describes an IPv4 CIDR block.</p>
   */
  @js.native
  trait CidrBlock extends js.Object {
    var CidrBlock: js.UndefOr[String]
  }

  object CidrBlock {
    def apply(
      CidrBlock: js.UndefOr[String] = js.undefined): CidrBlock = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CidrBlock]
    }
  }

  /**
   * <p>Describes the ClassicLink DNS support status of a VPC.</p>
   */
  @js.native
  trait ClassicLinkDnsSupport extends js.Object {
    var ClassicLinkDnsSupported: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object ClassicLinkDnsSupport {
    def apply(
      ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): ClassicLinkDnsSupport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClassicLinkDnsSupported" -> ClassicLinkDnsSupported.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassicLinkDnsSupport]
    }
  }

  /**
   * <p>Describes a linked EC2-Classic instance.</p>
   */
  @js.native
  trait ClassicLinkInstance extends js.Object {
    var Groups: js.UndefOr[GroupIdentifierList]
    var InstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  object ClassicLinkInstance {
    def apply(
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): ClassicLinkInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassicLinkInstance]
    }
  }

  /**
   * <p>Describes a Classic Load Balancer.</p>
   */
  @js.native
  trait ClassicLoadBalancer extends js.Object {
    var Name: js.UndefOr[String]
  }

  object ClassicLoadBalancer {
    def apply(
      Name: js.UndefOr[String] = js.undefined): ClassicLoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassicLoadBalancer]
    }
  }

  /**
   * <p>Describes the Classic Load Balancers to attach to a Spot Fleet. Spot Fleet registers the running Spot Instances with these Classic Load Balancers.</p>
   */
  @js.native
  trait ClassicLoadBalancersConfig extends js.Object {
    var ClassicLoadBalancers: js.UndefOr[ClassicLoadBalancers]
  }

  object ClassicLoadBalancersConfig {
    def apply(
      ClassicLoadBalancers: js.UndefOr[ClassicLoadBalancers] = js.undefined): ClassicLoadBalancersConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClassicLoadBalancers" -> ClassicLoadBalancers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassicLoadBalancersConfig]
    }
  }

  /**
   * <p>Describes the client-specific data.</p>
   */
  @js.native
  trait ClientData extends js.Object {
    var Comment: js.UndefOr[String]
    var UploadEnd: js.UndefOr[DateTime]
    var UploadSize: js.UndefOr[Double]
    var UploadStart: js.UndefOr[DateTime]
  }

  object ClientData {
    def apply(
      Comment: js.UndefOr[String] = js.undefined,
      UploadEnd: js.UndefOr[DateTime] = js.undefined,
      UploadSize: js.UndefOr[Double] = js.undefined,
      UploadStart: js.UndefOr[DateTime] = js.undefined): ClientData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "UploadEnd" -> UploadEnd.map { x => x.asInstanceOf[js.Any] },
        "UploadSize" -> UploadSize.map { x => x.asInstanceOf[js.Any] },
        "UploadStart" -> UploadStart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientData]
    }
  }

  /**
   * <p>Contains the parameters for ConfirmProductInstance.</p>
   */
  @js.native
  trait ConfirmProductInstanceRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var ProductCode: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object ConfirmProductInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      ProductCode: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ConfirmProductInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmProductInstanceRequest]
    }
  }

  /**
   * <p>Contains the output of ConfirmProductInstance.</p>
   */
  @js.native
  trait ConfirmProductInstanceResult extends js.Object {
    var OwnerId: js.UndefOr[String]
    var Return: js.UndefOr[Boolean]
  }

  object ConfirmProductInstanceResult {
    def apply(
      OwnerId: js.UndefOr[String] = js.undefined,
      Return: js.UndefOr[Boolean] = js.undefined): ConfirmProductInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmProductInstanceResult]
    }
  }

  /**
   * <p>Describes a connection notification for a VPC endpoint or VPC endpoint service.</p>
   */
  @js.native
  trait ConnectionNotification extends js.Object {
    var VpcEndpointId: js.UndefOr[String]
    var ConnectionEvents: js.UndefOr[ValueStringList]
    var ConnectionNotificationState: js.UndefOr[ConnectionNotificationState]
    var ConnectionNotificationId: js.UndefOr[String]
    var ConnectionNotificationType: js.UndefOr[ConnectionNotificationType]
    var ConnectionNotificationArn: js.UndefOr[String]
    var ServiceId: js.UndefOr[String]
  }

  object ConnectionNotification {
    def apply(
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined,
      ConnectionNotificationState: js.UndefOr[ConnectionNotificationState] = js.undefined,
      ConnectionNotificationId: js.UndefOr[String] = js.undefined,
      ConnectionNotificationType: js.UndefOr[ConnectionNotificationType] = js.undefined,
      ConnectionNotificationArn: js.UndefOr[String] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined): ConnectionNotification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcEndpointId" -> VpcEndpointId.map { x => x.asInstanceOf[js.Any] },
        "ConnectionEvents" -> ConnectionEvents.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationState" -> ConnectionNotificationState.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationId" -> ConnectionNotificationId.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationType" -> ConnectionNotificationType.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationArn" -> ConnectionNotificationArn.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionNotification]
    }
  }

  object ConnectionNotificationStateEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object ConnectionNotificationTypeEnum {
    val Topic = "Topic"

    val values = IndexedSeq(Topic)
  }

  object ContainerFormatEnum {
    val ova = "ova"

    val values = IndexedSeq(ova)
  }

  /**
   * <p>Describes a conversion task.</p>
   */
  @js.native
  trait ConversionTask extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var ImportVolume: js.UndefOr[ImportVolumeTaskDetails]
    var ExpirationTime: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var ConversionTaskId: js.UndefOr[String]
    var State: js.UndefOr[ConversionTaskState]
    var ImportInstance: js.UndefOr[ImportInstanceTaskDetails]
  }

  object ConversionTask {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ImportVolume: js.UndefOr[ImportVolumeTaskDetails] = js.undefined,
      ExpirationTime: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ConversionTaskId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[ConversionTaskState] = js.undefined,
      ImportInstance: js.UndefOr[ImportInstanceTaskDetails] = js.undefined): ConversionTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ImportVolume" -> ImportVolume.map { x => x.asInstanceOf[js.Any] },
        "ExpirationTime" -> ExpirationTime.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ConversionTaskId" -> ConversionTaskId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ImportInstance" -> ImportInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConversionTask]
    }
  }

  object ConversionTaskStateEnum {
    val active = "active"
    val cancelling = "cancelling"
    val cancelled = "cancelled"
    val completed = "completed"

    val values = IndexedSeq(active, cancelling, cancelled, completed)
  }

  @js.native
  trait CopyFpgaImageRequest extends js.Object {
    var SourceRegion: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var SourceFpgaImageId: js.UndefOr[String]
  }

  object CopyFpgaImageRequest {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SourceFpgaImageId: js.UndefOr[String] = js.undefined): CopyFpgaImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SourceFpgaImageId" -> SourceFpgaImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyFpgaImageRequest]
    }
  }

  @js.native
  trait CopyFpgaImageResult extends js.Object {
    var FpgaImageId: js.UndefOr[String]
  }

  object CopyFpgaImageResult {
    def apply(
      FpgaImageId: js.UndefOr[String] = js.undefined): CopyFpgaImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyFpgaImageResult]
    }
  }

  /**
   * <p>Contains the parameters for CopyImage.</p>
   */
  @js.native
  trait CopyImageRequest extends js.Object {
    var SourceRegion: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var SourceImageId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
  }

  object CopyImageRequest {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SourceImageId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined): CopyImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SourceImageId" -> SourceImageId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageRequest]
    }
  }

  /**
   * <p>Contains the output of CopyImage.</p>
   */
  @js.native
  trait CopyImageResult extends js.Object {
    var ImageId: js.UndefOr[String]
  }

  object CopyImageResult {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined): CopyImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageResult]
    }
  }

  /**
   * <p>Contains the parameters for CopySnapshot.</p>
   */
  @js.native
  trait CopySnapshotRequest extends js.Object {
    var SourceRegion: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var DestinationRegion: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var PresignedUrl: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var SourceSnapshotId: js.UndefOr[String]
  }

  object CopySnapshotRequest {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DestinationRegion: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      PresignedUrl: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      SourceSnapshotId: js.UndefOr[String] = js.undefined): CopySnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "DestinationRegion" -> DestinationRegion.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PresignedUrl" -> PresignedUrl.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "SourceSnapshotId" -> SourceSnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotRequest]
    }
  }

  /**
   * <p>Contains the output of CopySnapshot.</p>
   */
  @js.native
  trait CopySnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[String]
  }

  object CopySnapshotResult {
    def apply(
      SnapshotId: js.UndefOr[String] = js.undefined): CopySnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotResult]
    }
  }

  /**
   * <p>The CPU options for the instance.</p>
   */
  @js.native
  trait CpuOptions extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  object CpuOptions {
    def apply(
      CoreCount: js.UndefOr[Int] = js.undefined,
      ThreadsPerCore: js.UndefOr[Int] = js.undefined): CpuOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreCount" -> CoreCount.map { x => x.asInstanceOf[js.Any] },
        "ThreadsPerCore" -> ThreadsPerCore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CpuOptions]
    }
  }

  /**
   * <p>The CPU options for the instance. Both the core count and threads per core must be specified in the request.</p>
   */
  @js.native
  trait CpuOptionsRequest extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  object CpuOptionsRequest {
    def apply(
      CoreCount: js.UndefOr[Int] = js.undefined,
      ThreadsPerCore: js.UndefOr[Int] = js.undefined): CpuOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreCount" -> CoreCount.map { x => x.asInstanceOf[js.Any] },
        "ThreadsPerCore" -> ThreadsPerCore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CpuOptionsRequest]
    }
  }

  @js.native
  trait CreateCapacityReservationRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var EbsOptimized: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var InstanceMatchCriteria: js.UndefOr[InstanceMatchCriteria]
    var InstanceCount: js.UndefOr[Int]
    var Tenancy: js.UndefOr[CapacityReservationTenancy]
    var EphemeralStorage: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform]
    var InstanceType: js.UndefOr[String]
    var EndDateType: js.UndefOr[EndDateType]
    var EndDate: js.UndefOr[DateTime]
  }

  object CreateCapacityReservationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceMatchCriteria: js.UndefOr[InstanceMatchCriteria] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      Tenancy: js.UndefOr[CapacityReservationTenancy] = js.undefined,
      EphemeralStorage: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      EndDateType: js.UndefOr[EndDateType] = js.undefined,
      EndDate: js.UndefOr[DateTime] = js.undefined): CreateCapacityReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "InstanceMatchCriteria" -> InstanceMatchCriteria.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "EphemeralStorage" -> EphemeralStorage.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstancePlatform" -> InstancePlatform.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "EndDateType" -> EndDateType.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCapacityReservationRequest]
    }
  }

  @js.native
  trait CreateCapacityReservationResult extends js.Object {
    var CapacityReservation: js.UndefOr[CapacityReservation]
  }

  object CreateCapacityReservationResult {
    def apply(
      CapacityReservation: js.UndefOr[CapacityReservation] = js.undefined): CreateCapacityReservationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservation" -> CapacityReservation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCapacityReservationResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateCustomerGateway.</p>
   */
  @js.native
  trait CreateCustomerGatewayRequest extends js.Object {
    var BgpAsn: js.UndefOr[Int]
    var PublicIp: js.UndefOr[String]
    var Type: js.UndefOr[GatewayType]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateCustomerGatewayRequest {
    def apply(
      BgpAsn: js.UndefOr[Int] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateCustomerGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BgpAsn" -> BgpAsn.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomerGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of CreateCustomerGateway.</p>
   */
  @js.native
  trait CreateCustomerGatewayResult extends js.Object {
    var CustomerGateway: js.UndefOr[CustomerGateway]
  }

  object CreateCustomerGatewayResult {
    def apply(
      CustomerGateway: js.UndefOr[CustomerGateway] = js.undefined): CreateCustomerGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerGateway" -> CustomerGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomerGatewayResult]
    }
  }

  @js.native
  trait CreateDefaultSubnetRequest extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateDefaultSubnetRequest {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateDefaultSubnetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDefaultSubnetRequest]
    }
  }

  @js.native
  trait CreateDefaultSubnetResult extends js.Object {
    var Subnet: js.UndefOr[Subnet]
  }

  object CreateDefaultSubnetResult {
    def apply(
      Subnet: js.UndefOr[Subnet] = js.undefined): CreateDefaultSubnetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subnet" -> Subnet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDefaultSubnetResult]
    }
  }

  @js.native
  trait CreateDefaultVpcRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateDefaultVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateDefaultVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDefaultVpcRequest]
    }
  }

  @js.native
  trait CreateDefaultVpcResult extends js.Object {
    var Vpc: js.UndefOr[Vpc]
  }

  object CreateDefaultVpcResult {
    def apply(
      Vpc: js.UndefOr[Vpc] = js.undefined): CreateDefaultVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDefaultVpcResult]
    }
  }

  @js.native
  trait CreateDhcpOptionsRequest extends js.Object {
    var DhcpConfigurations: js.UndefOr[NewDhcpConfigurationList]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateDhcpOptionsRequest {
    def apply(
      DhcpConfigurations: js.UndefOr[NewDhcpConfigurationList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpConfigurations" -> DhcpConfigurations.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDhcpOptionsRequest]
    }
  }

  @js.native
  trait CreateDhcpOptionsResult extends js.Object {
    var DhcpOptions: js.UndefOr[DhcpOptions]
  }

  object CreateDhcpOptionsResult {
    def apply(
      DhcpOptions: js.UndefOr[DhcpOptions] = js.undefined): CreateDhcpOptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpOptions" -> DhcpOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDhcpOptionsResult]
    }
  }

  @js.native
  trait CreateEgressOnlyInternetGatewayRequest extends js.Object {
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object CreateEgressOnlyInternetGatewayRequest {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): CreateEgressOnlyInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEgressOnlyInternetGatewayRequest]
    }
  }

  @js.native
  trait CreateEgressOnlyInternetGatewayResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var EgressOnlyInternetGateway: js.UndefOr[EgressOnlyInternetGateway]
  }

  object CreateEgressOnlyInternetGatewayResult {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      EgressOnlyInternetGateway: js.UndefOr[EgressOnlyInternetGateway] = js.undefined): CreateEgressOnlyInternetGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGateway" -> EgressOnlyInternetGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEgressOnlyInternetGatewayResult]
    }
  }

  /**
   * <p>Describes the instances that could not be launched by the fleet.</p>
   */
  @js.native
  trait CreateFleetError extends js.Object {
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Lifecycle: js.UndefOr[InstanceLifecycle]
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
  }

  object CreateFleetError {
    def apply(
      LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined,
      Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): CreateFleetError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateAndOverrides" -> LaunchTemplateAndOverrides.map { x => x.asInstanceOf[js.Any] },
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetError]
    }
  }

  /**
   * <p>Describes the instances that were launched by the fleet.</p>
   */
  @js.native
  trait CreateFleetInstance extends js.Object {
    var Lifecycle: js.UndefOr[InstanceLifecycle]
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Platform: js.UndefOr[PlatformValues]
    var InstanceType: js.UndefOr[InstanceType]
    var InstanceIds: js.UndefOr[InstanceIdsSet]
  }

  object CreateFleetInstance {
    def apply(
      Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined,
      LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdsSet] = js.undefined): CreateFleetInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateAndOverrides" -> LaunchTemplateAndOverrides.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetInstance]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy]
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigListRequest]
    var SpotOptions: js.UndefOr[SpotOptionsRequest]
    var ClientToken: js.UndefOr[String]
    var ReplaceUnhealthyInstances: js.UndefOr[Boolean]
    var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecificationRequest]
    var ValidUntil: js.UndefOr[DateTime]
    var TerminateInstancesWithExpiration: js.UndefOr[Boolean]
    var OnDemandOptions: js.UndefOr[OnDemandOptionsRequest]
    var ValidFrom: js.UndefOr[DateTime]
    var Type: js.UndefOr[FleetType]
  }

  object CreateFleetRequest {
    def apply(
      ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined,
      LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigListRequest] = js.undefined,
      SpotOptions: js.UndefOr[SpotOptionsRequest] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined,
      TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecificationRequest] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
      OnDemandOptions: js.UndefOr[OnDemandOptionsRequest] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      Type: js.UndefOr[FleetType] = js.undefined): CreateFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateConfigs" -> LaunchTemplateConfigs.map { x => x.asInstanceOf[js.Any] },
        "SpotOptions" -> SpotOptions.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "ReplaceUnhealthyInstances" -> ReplaceUnhealthyInstances.map { x => x.asInstanceOf[js.Any] },
        "TargetCapacitySpecification" -> TargetCapacitySpecification.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "TerminateInstancesWithExpiration" -> TerminateInstancesWithExpiration.map { x => x.asInstanceOf[js.Any] },
        "OnDemandOptions" -> OnDemandOptions.map { x => x.asInstanceOf[js.Any] },
        "ValidFrom" -> ValidFrom.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResult extends js.Object {
    var FleetId: js.UndefOr[FleetIdentifier]
    var Errors: js.UndefOr[CreateFleetErrorsSet]
    var Instances: js.UndefOr[CreateFleetInstancesSet]
  }

  object CreateFleetResult {
    def apply(
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined,
      Errors: js.UndefOr[CreateFleetErrorsSet] = js.undefined,
      Instances: js.UndefOr[CreateFleetInstancesSet] = js.undefined): CreateFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "Errors" -> Errors.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetResult]
    }
  }

  @js.native
  trait CreateFlowLogsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var LogDestination: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var LogDestinationType: js.UndefOr[LogDestinationType]
    var LogGroupName: js.UndefOr[String]
    var ResourceIds: js.UndefOr[ValueStringList]
    var ResourceType: js.UndefOr[FlowLogsResourceType]
    var DeliverLogsPermissionArn: js.UndefOr[String]
    var TrafficType: js.UndefOr[TrafficType]
  }

  object CreateFlowLogsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LogDestination: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      LogDestinationType: js.UndefOr[LogDestinationType] = js.undefined,
      LogGroupName: js.UndefOr[String] = js.undefined,
      ResourceIds: js.UndefOr[ValueStringList] = js.undefined,
      ResourceType: js.UndefOr[FlowLogsResourceType] = js.undefined,
      DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined,
      TrafficType: js.UndefOr[TrafficType] = js.undefined): CreateFlowLogsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "LogDestination" -> LogDestination.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "LogDestinationType" -> LogDestinationType.map { x => x.asInstanceOf[js.Any] },
        "LogGroupName" -> LogGroupName.map { x => x.asInstanceOf[js.Any] },
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "DeliverLogsPermissionArn" -> DeliverLogsPermissionArn.map { x => x.asInstanceOf[js.Any] },
        "TrafficType" -> TrafficType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFlowLogsRequest]
    }
  }

  @js.native
  trait CreateFlowLogsResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var FlowLogIds: js.UndefOr[ValueStringList]
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object CreateFlowLogsResult {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      FlowLogIds: js.UndefOr[ValueStringList] = js.undefined,
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): CreateFlowLogsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "FlowLogIds" -> FlowLogIds.map { x => x.asInstanceOf[js.Any] },
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFlowLogsResult]
    }
  }

  @js.native
  trait CreateFpgaImageRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var InputStorageLocation: js.UndefOr[StorageLocation]
    var LogsStorageLocation: js.UndefOr[StorageLocation]
  }

  object CreateFpgaImageRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      InputStorageLocation: js.UndefOr[StorageLocation] = js.undefined,
      LogsStorageLocation: js.UndefOr[StorageLocation] = js.undefined): CreateFpgaImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InputStorageLocation" -> InputStorageLocation.map { x => x.asInstanceOf[js.Any] },
        "LogsStorageLocation" -> LogsStorageLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFpgaImageRequest]
    }
  }

  @js.native
  trait CreateFpgaImageResult extends js.Object {
    var FpgaImageId: js.UndefOr[String]
    var FpgaImageGlobalId: js.UndefOr[String]
  }

  object CreateFpgaImageResult {
    def apply(
      FpgaImageId: js.UndefOr[String] = js.undefined,
      FpgaImageGlobalId: js.UndefOr[String] = js.undefined): CreateFpgaImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageGlobalId" -> FpgaImageGlobalId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFpgaImageResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateImage.</p>
   */
  @js.native
  trait CreateImageRequest extends js.Object {
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList]
    var DryRun: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var NoReboot: js.UndefOr[Boolean]
  }

  object CreateImageRequest {
    def apply(
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NoReboot: js.UndefOr[Boolean] = js.undefined): CreateImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NoReboot" -> NoReboot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageRequest]
    }
  }

  /**
   * <p>Contains the output of CreateImage.</p>
   */
  @js.native
  trait CreateImageResult extends js.Object {
    var ImageId: js.UndefOr[String]
  }

  object CreateImageResult {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined): CreateImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateInstanceExportTask.</p>
   */
  @js.native
  trait CreateInstanceExportTaskRequest extends js.Object {
    var Description: js.UndefOr[String]
    var ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification]
    var InstanceId: js.UndefOr[String]
    var TargetEnvironment: js.UndefOr[ExportEnvironment]
  }

  object CreateInstanceExportTaskRequest {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      TargetEnvironment: js.UndefOr[ExportEnvironment] = js.undefined): CreateInstanceExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ExportToS3Task" -> ExportToS3Task.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "TargetEnvironment" -> TargetEnvironment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceExportTaskRequest]
    }
  }

  /**
   * <p>Contains the output for CreateInstanceExportTask.</p>
   */
  @js.native
  trait CreateInstanceExportTaskResult extends js.Object {
    var ExportTask: js.UndefOr[ExportTask]
  }

  object CreateInstanceExportTaskResult {
    def apply(
      ExportTask: js.UndefOr[ExportTask] = js.undefined): CreateInstanceExportTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportTask" -> ExportTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceExportTaskResult]
    }
  }

  @js.native
  trait CreateInternetGatewayRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInternetGatewayRequest]
    }
  }

  @js.native
  trait CreateInternetGatewayResult extends js.Object {
    var InternetGateway: js.UndefOr[InternetGateway]
  }

  object CreateInternetGatewayResult {
    def apply(
      InternetGateway: js.UndefOr[InternetGateway] = js.undefined): CreateInternetGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InternetGateway" -> InternetGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInternetGatewayResult]
    }
  }

  @js.native
  trait CreateKeyPairRequest extends js.Object {
    var KeyName: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateKeyPairRequest {
    def apply(
      KeyName: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyPairRequest]
    }
  }

  @js.native
  trait CreateLaunchTemplateRequest extends js.Object {
    var VersionDescription: js.UndefOr[VersionDescription]
    var DryRun: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var LaunchTemplateData: js.UndefOr[RequestLaunchTemplateData]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
  }

  object CreateLaunchTemplateRequest {
    def apply(
      VersionDescription: js.UndefOr[VersionDescription] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      LaunchTemplateData: js.UndefOr[RequestLaunchTemplateData] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined): CreateLaunchTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionDescription" -> VersionDescription.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateData" -> LaunchTemplateData.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLaunchTemplateRequest]
    }
  }

  @js.native
  trait CreateLaunchTemplateResult extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  object CreateLaunchTemplateResult {
    def apply(
      LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined): CreateLaunchTemplateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLaunchTemplateResult]
    }
  }

  @js.native
  trait CreateLaunchTemplateVersionRequest extends js.Object {
    var VersionDescription: js.UndefOr[VersionDescription]
    var DryRun: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var LaunchTemplateData: js.UndefOr[RequestLaunchTemplateData]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var LaunchTemplateId: js.UndefOr[String]
    var SourceVersion: js.UndefOr[String]
  }

  object CreateLaunchTemplateVersionRequest {
    def apply(
      VersionDescription: js.UndefOr[VersionDescription] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      LaunchTemplateData: js.UndefOr[RequestLaunchTemplateData] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      SourceVersion: js.UndefOr[String] = js.undefined): CreateLaunchTemplateVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionDescription" -> VersionDescription.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateData" -> LaunchTemplateData.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "SourceVersion" -> SourceVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLaunchTemplateVersionRequest]
    }
  }

  @js.native
  trait CreateLaunchTemplateVersionResult extends js.Object {
    var LaunchTemplateVersion: js.UndefOr[LaunchTemplateVersion]
  }

  object CreateLaunchTemplateVersionResult {
    def apply(
      LaunchTemplateVersion: js.UndefOr[LaunchTemplateVersion] = js.undefined): CreateLaunchTemplateVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateVersion" -> LaunchTemplateVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLaunchTemplateVersionResult]
    }
  }

  @js.native
  trait CreateNatGatewayRequest extends js.Object {
    var AllocationId: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object CreateNatGatewayRequest {
    def apply(
      AllocationId: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): CreateNatGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNatGatewayRequest]
    }
  }

  @js.native
  trait CreateNatGatewayResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var NatGateway: js.UndefOr[NatGateway]
  }

  object CreateNatGatewayResult {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      NatGateway: js.UndefOr[NatGateway] = js.undefined): CreateNatGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "NatGateway" -> NatGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNatGatewayResult]
    }
  }

  @js.native
  trait CreateNetworkAclEntryRequest extends js.Object {
    var Egress: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var Ipv6CidrBlock: js.UndefOr[String]
    var PortRange: js.UndefOr[PortRange]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var CidrBlock: js.UndefOr[String]
    var NetworkAclId: js.UndefOr[String]
    var RuleNumber: js.UndefOr[Int]
    var RuleAction: js.UndefOr[RuleAction]
    var Protocol: js.UndefOr[String]
  }

  object CreateNetworkAclEntryRequest {
    def apply(
      Egress: js.UndefOr[Boolean] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      PortRange: js.UndefOr[PortRange] = js.undefined,
      IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Int] = js.undefined,
      RuleAction: js.UndefOr[RuleAction] = js.undefined,
      Protocol: js.UndefOr[String] = js.undefined): CreateNetworkAclEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Egress" -> Egress.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "PortRange" -> PortRange.map { x => x.asInstanceOf[js.Any] },
        "IcmpTypeCode" -> IcmpTypeCode.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] },
        "RuleNumber" -> RuleNumber.map { x => x.asInstanceOf[js.Any] },
        "RuleAction" -> RuleAction.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkAclEntryRequest]
    }
  }

  @js.native
  trait CreateNetworkAclRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object CreateNetworkAclRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): CreateNetworkAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkAclRequest]
    }
  }

  @js.native
  trait CreateNetworkAclResult extends js.Object {
    var NetworkAcl: js.UndefOr[NetworkAcl]
  }

  object CreateNetworkAclResult {
    def apply(
      NetworkAcl: js.UndefOr[NetworkAcl] = js.undefined): CreateNetworkAclResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkAcl" -> NetworkAcl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkAclResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateNetworkInterfacePermission.</p>
   */
  @js.native
  trait CreateNetworkInterfacePermissionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var AwsAccountId: js.UndefOr[String]
    var Permission: js.UndefOr[InterfacePermissionType]
    var AwsService: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object CreateNetworkInterfacePermissionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AwsAccountId: js.UndefOr[String] = js.undefined,
      Permission: js.UndefOr[InterfacePermissionType] = js.undefined,
      AwsService: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): CreateNetworkInterfacePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "AwsAccountId" -> AwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "Permission" -> Permission.map { x => x.asInstanceOf[js.Any] },
        "AwsService" -> AwsService.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkInterfacePermissionRequest]
    }
  }

  /**
   * <p>Contains the output of CreateNetworkInterfacePermission.</p>
   */
  @js.native
  trait CreateNetworkInterfacePermissionResult extends js.Object {
    var InterfacePermission: js.UndefOr[NetworkInterfacePermission]
  }

  object CreateNetworkInterfacePermissionResult {
    def apply(
      InterfacePermission: js.UndefOr[NetworkInterfacePermission] = js.undefined): CreateNetworkInterfacePermissionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InterfacePermission" -> InterfacePermission.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkInterfacePermissionResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateNetworkInterface.</p>
   */
  @js.native
  trait CreateNetworkInterfaceRequest extends js.Object {
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var DryRun: js.UndefOr[Boolean]
    var PrivateIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[String]
  }

  object CreateNetworkInterfaceRequest {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Int] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): CreateNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the output of CreateNetworkInterface.</p>
   */
  @js.native
  trait CreateNetworkInterfaceResult extends js.Object {
    var NetworkInterface: js.UndefOr[NetworkInterface]
  }

  object CreateNetworkInterfaceResult {
    def apply(
      NetworkInterface: js.UndefOr[NetworkInterface] = js.undefined): CreateNetworkInterfaceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterface" -> NetworkInterface.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkInterfaceResult]
    }
  }

  /**
   * <p>Contains the parameters for CreatePlacementGroup.</p>
   */
  @js.native
  trait CreatePlacementGroupRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupName: js.UndefOr[String]
    var Strategy: js.UndefOr[PlacementStrategy]
  }

  object CreatePlacementGroupRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Strategy: js.UndefOr[PlacementStrategy] = js.undefined): CreatePlacementGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Strategy" -> Strategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlacementGroupRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateReservedInstancesListing.</p>
   */
  @js.native
  trait CreateReservedInstancesListingRequest extends js.Object {
    var ClientToken: js.UndefOr[String]
    var InstanceCount: js.UndefOr[Int]
    var PriceSchedules: js.UndefOr[PriceScheduleSpecificationList]
    var ReservedInstancesId: js.UndefOr[String]
  }

  object CreateReservedInstancesListingRequest {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      PriceSchedules: js.UndefOr[PriceScheduleSpecificationList] = js.undefined,
      ReservedInstancesId: js.UndefOr[String] = js.undefined): CreateReservedInstancesListingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "PriceSchedules" -> PriceSchedules.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReservedInstancesListingRequest]
    }
  }

  /**
   * <p>Contains the output of CreateReservedInstancesListing.</p>
   */
  @js.native
  trait CreateReservedInstancesListingResult extends js.Object {
    var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList]
  }

  object CreateReservedInstancesListingResult {
    def apply(
      ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined): CreateReservedInstancesListingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesListings" -> ReservedInstancesListings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReservedInstancesListingResult]
    }
  }

  @js.native
  trait CreateRouteRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var DestinationCidrBlock: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
    var NatGatewayId: js.UndefOr[String]
    var EgressOnlyInternetGatewayId: js.UndefOr[String]
    var RouteTableId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var GatewayId: js.UndefOr[String]
  }

  object CreateRouteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined): CreateRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] },
        "NatGatewayId" -> NatGatewayId.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteRequest]
    }
  }

  @js.native
  trait CreateRouteResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object CreateRouteResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): CreateRouteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteResult]
    }
  }

  @js.native
  trait CreateRouteTableRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object CreateRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): CreateRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteTableRequest]
    }
  }

  @js.native
  trait CreateRouteTableResult extends js.Object {
    var RouteTable: js.UndefOr[RouteTable]
  }

  object CreateRouteTableResult {
    def apply(
      RouteTable: js.UndefOr[RouteTable] = js.undefined): CreateRouteTableResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RouteTable" -> RouteTable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteTableResult]
    }
  }

  @js.native
  trait CreateSecurityGroupRequest extends js.Object {
    var Description: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateSecurityGroupRequest {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityGroupRequest]
    }
  }

  @js.native
  trait CreateSecurityGroupResult extends js.Object {
    var GroupId: js.UndefOr[String]
  }

  object CreateSecurityGroupResult {
    def apply(
      GroupId: js.UndefOr[String] = js.undefined): CreateSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityGroupResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateSnapshot.</p>
   */
  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var Description: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateSnapshotRequest {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateSpotDatafeedSubscription.</p>
   */
  @js.native
  trait CreateSpotDatafeedSubscriptionRequest extends js.Object {
    var Bucket: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Prefix: js.UndefOr[String]
  }

  object CreateSpotDatafeedSubscriptionRequest {
    def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined): CreateSpotDatafeedSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSpotDatafeedSubscriptionRequest]
    }
  }

  /**
   * <p>Contains the output of CreateSpotDatafeedSubscription.</p>
   */
  @js.native
  trait CreateSpotDatafeedSubscriptionResult extends js.Object {
    var SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription]
  }

  object CreateSpotDatafeedSubscriptionResult {
    def apply(
      SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription] = js.undefined): CreateSpotDatafeedSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotDatafeedSubscription" -> SpotDatafeedSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSpotDatafeedSubscriptionResult]
    }
  }

  @js.native
  trait CreateSubnetRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Ipv6CidrBlock: js.UndefOr[String]
    var CidrBlock: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object CreateSubnetRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): CreateSubnetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubnetRequest]
    }
  }

  @js.native
  trait CreateSubnetResult extends js.Object {
    var Subnet: js.UndefOr[Subnet]
  }

  object CreateSubnetResult {
    def apply(
      Subnet: js.UndefOr[Subnet] = js.undefined): CreateSubnetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subnet" -> Subnet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubnetResult]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Resources: js.UndefOr[ResourceIdList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTagsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Resources: js.UndefOr[ResourceIdList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  /**
   * <p>Describes the user or group to be added or removed from the permissions for a volume.</p>
   */
  @js.native
  trait CreateVolumePermission extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  object CreateVolumePermission {
    def apply(
      Group: js.UndefOr[PermissionGroup] = js.undefined,
      UserId: js.UndefOr[String] = js.undefined): CreateVolumePermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVolumePermission]
    }
  }

  /**
   * <p>Describes modifications to the permissions for a volume.</p>
   */
  @js.native
  trait CreateVolumePermissionModifications extends js.Object {
    var Add: js.UndefOr[CreateVolumePermissionList]
    var Remove: js.UndefOr[CreateVolumePermissionList]
  }

  object CreateVolumePermissionModifications {
    def apply(
      Add: js.UndefOr[CreateVolumePermissionList] = js.undefined,
      Remove: js.UndefOr[CreateVolumePermissionList] = js.undefined): CreateVolumePermissionModifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Add" -> Add.map { x => x.asInstanceOf[js.Any] },
        "Remove" -> Remove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVolumePermissionModifications]
    }
  }

  /**
   * <p>Contains the parameters for CreateVolume.</p>
   */
  @js.native
  trait CreateVolumeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VolumeType: js.UndefOr[VolumeType]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var Size: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
  }

  object CreateVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined,
      Size: js.UndefOr[Int] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined): CreateVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVolumeRequest]
    }
  }

  @js.native
  trait CreateVpcEndpointConnectionNotificationRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcEndpointId: js.UndefOr[String]
    var ConnectionEvents: js.UndefOr[ValueStringList]
    var ClientToken: js.UndefOr[String]
    var ConnectionNotificationArn: js.UndefOr[String]
    var ServiceId: js.UndefOr[String]
  }

  object CreateVpcEndpointConnectionNotificationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      ConnectionNotificationArn: js.UndefOr[String] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined): CreateVpcEndpointConnectionNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointId" -> VpcEndpointId.map { x => x.asInstanceOf[js.Any] },
        "ConnectionEvents" -> ConnectionEvents.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationArn" -> ConnectionNotificationArn.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointConnectionNotificationRequest]
    }
  }

  @js.native
  trait CreateVpcEndpointConnectionNotificationResult extends js.Object {
    var ConnectionNotification: js.UndefOr[ConnectionNotification]
    var ClientToken: js.UndefOr[String]
  }

  object CreateVpcEndpointConnectionNotificationResult {
    def apply(
      ConnectionNotification: js.UndefOr[ConnectionNotification] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined): CreateVpcEndpointConnectionNotificationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionNotification" -> ConnectionNotification.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointConnectionNotificationResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpcEndpoint.</p>
   */
  @js.native
  trait CreateVpcEndpointRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ServiceName: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var PolicyDocument: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[ValueStringList]
    var RouteTableIds: js.UndefOr[ValueStringList]
    var VpcEndpointType: js.UndefOr[VpcEndpointType]
    var SubnetIds: js.UndefOr[ValueStringList]
    var PrivateDnsEnabled: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object CreateVpcEndpointRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceName: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      PolicyDocument: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined,
      RouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      VpcEndpointType: js.UndefOr[VpcEndpointType] = js.undefined,
      SubnetIds: js.UndefOr[ValueStringList] = js.undefined,
      PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): CreateVpcEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "RouteTableIds" -> RouteTableIds.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointType" -> VpcEndpointType.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsEnabled" -> PrivateDnsEnabled.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpcEndpoint.</p>
   */
  @js.native
  trait CreateVpcEndpointResult extends js.Object {
    var VpcEndpoint: js.UndefOr[VpcEndpoint]
    var ClientToken: js.UndefOr[String]
  }

  object CreateVpcEndpointResult {
    def apply(
      VpcEndpoint: js.UndefOr[VpcEndpoint] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined): CreateVpcEndpointResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcEndpoint" -> VpcEndpoint.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointResult]
    }
  }

  @js.native
  trait CreateVpcEndpointServiceConfigurationRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var AcceptanceRequired: js.UndefOr[Boolean]
    var NetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var ClientToken: js.UndefOr[String]
  }

  object CreateVpcEndpointServiceConfigurationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
      NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined): CreateVpcEndpointServiceConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "NetworkLoadBalancerArns" -> NetworkLoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
    }
  }

  @js.native
  trait CreateVpcEndpointServiceConfigurationResult extends js.Object {
    var ServiceConfiguration: js.UndefOr[ServiceConfiguration]
    var ClientToken: js.UndefOr[String]
  }

  object CreateVpcEndpointServiceConfigurationResult {
    def apply(
      ServiceConfiguration: js.UndefOr[ServiceConfiguration] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined): CreateVpcEndpointServiceConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceConfiguration" -> ServiceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
    }
  }

  @js.native
  trait CreateVpcPeeringConnectionRequest extends js.Object {
    var PeerRegion: js.UndefOr[String]
    var PeerVpcId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PeerOwnerId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object CreateVpcPeeringConnectionRequest {
    def apply(
      PeerRegion: js.UndefOr[String] = js.undefined,
      PeerVpcId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PeerOwnerId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): CreateVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PeerRegion" -> PeerRegion.map { x => x.asInstanceOf[js.Any] },
        "PeerVpcId" -> PeerVpcId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PeerOwnerId" -> PeerOwnerId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionRequest]
    }
  }

  @js.native
  trait CreateVpcPeeringConnectionResult extends js.Object {
    var VpcPeeringConnection: js.UndefOr[VpcPeeringConnection]
  }

  object CreateVpcPeeringConnectionResult {
    def apply(
      VpcPeeringConnection: js.UndefOr[VpcPeeringConnection] = js.undefined): CreateVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringConnection" -> VpcPeeringConnection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionResult]
    }
  }

  @js.native
  trait CreateVpcRequest extends js.Object {
    var CidrBlock: js.UndefOr[String]
    var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var InstanceTenancy: js.UndefOr[Tenancy]
  }

  object CreateVpcRequest {
    def apply(
      CidrBlock: js.UndefOr[String] = js.undefined,
      AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined): CreateVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "AmazonProvidedIpv6CidrBlock" -> AmazonProvidedIpv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceTenancy" -> InstanceTenancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcRequest]
    }
  }

  @js.native
  trait CreateVpcResult extends js.Object {
    var Vpc: js.UndefOr[Vpc]
  }

  object CreateVpcResult {
    def apply(
      Vpc: js.UndefOr[Vpc] = js.undefined): CreateVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpnConnection.</p>
   */
  @js.native
  trait CreateVpnConnectionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var CustomerGatewayId: js.UndefOr[String]
    var Options: js.UndefOr[VpnConnectionOptionsSpecification]
    var VpnGatewayId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object CreateVpnConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): CreateVpnConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "CustomerGatewayId" -> CustomerGatewayId.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "VpnGatewayId" -> VpnGatewayId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnConnectionRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpnConnection.</p>
   */
  @js.native
  trait CreateVpnConnectionResult extends js.Object {
    var VpnConnection: js.UndefOr[VpnConnection]
  }

  object CreateVpnConnectionResult {
    def apply(
      VpnConnection: js.UndefOr[VpnConnection] = js.undefined): CreateVpnConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpnConnection" -> VpnConnection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnConnectionResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpnConnectionRoute.</p>
   */
  @js.native
  trait CreateVpnConnectionRouteRequest extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var VpnConnectionId: js.UndefOr[String]
  }

  object CreateVpnConnectionRouteRequest {
    def apply(
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpnConnectionId: js.UndefOr[String] = js.undefined): CreateVpnConnectionRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "VpnConnectionId" -> VpnConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnConnectionRouteRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpnGateway.</p>
   */
  @js.native
  trait CreateVpnGatewayRequest extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Type: js.UndefOr[GatewayType]
    var AmazonSideAsn: js.UndefOr[Double]
    var DryRun: js.UndefOr[Boolean]
  }

  object CreateVpnGatewayRequest {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined,
      AmazonSideAsn: js.UndefOr[Double] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): CreateVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "AmazonSideAsn" -> AmazonSideAsn.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpnGateway.</p>
   */
  @js.native
  trait CreateVpnGatewayResult extends js.Object {
    var VpnGateway: js.UndefOr[VpnGateway]
  }

  object CreateVpnGatewayResult {
    def apply(
      VpnGateway: js.UndefOr[VpnGateway] = js.undefined): CreateVpnGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpnGateway" -> VpnGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnGatewayResult]
    }
  }

  /**
   * <p>Describes the credit option for CPU usage of a T2 or T3 instance.</p>
   */
  @js.native
  trait CreditSpecification extends js.Object {
    var CpuCredits: js.UndefOr[String]
  }

  object CreditSpecification {
    def apply(
      CpuCredits: js.UndefOr[String] = js.undefined): CreditSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CpuCredits" -> CpuCredits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreditSpecification]
    }
  }

  /**
   * <p>The credit option for CPU usage of a T2 or T3 instance.</p>
   */
  @js.native
  trait CreditSpecificationRequest extends js.Object {
    var CpuCredits: js.UndefOr[String]
  }

  object CreditSpecificationRequest {
    def apply(
      CpuCredits: js.UndefOr[String] = js.undefined): CreditSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CpuCredits" -> CpuCredits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreditSpecificationRequest]
    }
  }

  object CurrencyCodeValuesEnum {
    val USD = "USD"

    val values = IndexedSeq(USD)
  }

  /**
   * <p>Describes a customer gateway.</p>
   */
  @js.native
  trait CustomerGateway extends js.Object {
    var BgpAsn: js.UndefOr[String]
    var CustomerGatewayId: js.UndefOr[String]
    var IpAddress: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var State: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object CustomerGateway {
    def apply(
      BgpAsn: js.UndefOr[String] = js.undefined,
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      IpAddress: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): CustomerGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BgpAsn" -> BgpAsn.map { x => x.asInstanceOf[js.Any] },
        "CustomerGatewayId" -> CustomerGatewayId.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerGateway]
    }
  }

  object DatafeedSubscriptionStateEnum {
    val Active = "Active"
    val Inactive = "Inactive"

    val values = IndexedSeq(Active, Inactive)
  }

  object DefaultTargetCapacityTypeEnum {
    val spot = "spot"
    val `on-demand` = "on-demand"

    val values = IndexedSeq(spot, `on-demand`)
  }

  /**
   * <p>Contains the parameters for DeleteCustomerGateway.</p>
   */
  @js.native
  trait DeleteCustomerGatewayRequest extends js.Object {
    var CustomerGatewayId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteCustomerGatewayRequest {
    def apply(
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteCustomerGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerGatewayId" -> CustomerGatewayId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomerGatewayRequest]
    }
  }

  @js.native
  trait DeleteDhcpOptionsRequest extends js.Object {
    var DhcpOptionsId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteDhcpOptionsRequest {
    def apply(
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpOptionsId" -> DhcpOptionsId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDhcpOptionsRequest]
    }
  }

  @js.native
  trait DeleteEgressOnlyInternetGatewayRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId]
  }

  object DeleteEgressOnlyInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId] = js.undefined): DeleteEgressOnlyInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEgressOnlyInternetGatewayRequest]
    }
  }

  @js.native
  trait DeleteEgressOnlyInternetGatewayResult extends js.Object {
    var ReturnCode: js.UndefOr[Boolean]
  }

  object DeleteEgressOnlyInternetGatewayResult {
    def apply(
      ReturnCode: js.UndefOr[Boolean] = js.undefined): DeleteEgressOnlyInternetGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReturnCode" -> ReturnCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
    }
  }

  /**
   * <p>Describes an EC2 Fleet error.</p>
   */
  @js.native
  trait DeleteFleetError extends js.Object {
    var Code: js.UndefOr[DeleteFleetErrorCode]
    var Message: js.UndefOr[String]
  }

  object DeleteFleetError {
    def apply(
      Code: js.UndefOr[DeleteFleetErrorCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): DeleteFleetError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetError]
    }
  }

  object DeleteFleetErrorCodeEnum {
    val fleetIdDoesNotExist = "fleetIdDoesNotExist"
    val fleetIdMalformed = "fleetIdMalformed"
    val fleetNotInDeletableState = "fleetNotInDeletableState"
    val unexpectedError = "unexpectedError"

    val values = IndexedSeq(fleetIdDoesNotExist, fleetIdMalformed, fleetNotInDeletableState, unexpectedError)
  }

  /**
   * <p>Describes an EC2 Fleet that was not successfully deleted.</p>
   */
  @js.native
  trait DeleteFleetErrorItem extends js.Object {
    var Error: js.UndefOr[DeleteFleetError]
    var FleetId: js.UndefOr[FleetIdentifier]
  }

  object DeleteFleetErrorItem {
    def apply(
      Error: js.UndefOr[DeleteFleetError] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined): DeleteFleetErrorItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetErrorItem]
    }
  }

  /**
   * <p>Describes an EC2 Fleet that was successfully deleted.</p>
   */
  @js.native
  trait DeleteFleetSuccessItem extends js.Object {
    var CurrentFleetState: js.UndefOr[FleetStateCode]
    var PreviousFleetState: js.UndefOr[FleetStateCode]
    var FleetId: js.UndefOr[FleetIdentifier]
  }

  object DeleteFleetSuccessItem {
    def apply(
      CurrentFleetState: js.UndefOr[FleetStateCode] = js.undefined,
      PreviousFleetState: js.UndefOr[FleetStateCode] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined): DeleteFleetSuccessItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentFleetState" -> CurrentFleetState.map { x => x.asInstanceOf[js.Any] },
        "PreviousFleetState" -> PreviousFleetState.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetSuccessItem]
    }
  }

  @js.native
  trait DeleteFleetsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var FleetIds: js.UndefOr[FleetIdSet]
    var TerminateInstances: js.UndefOr[Boolean]
  }

  object DeleteFleetsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      FleetIds: js.UndefOr[FleetIdSet] = js.undefined,
      TerminateInstances: js.UndefOr[Boolean] = js.undefined): DeleteFleetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "FleetIds" -> FleetIds.map { x => x.asInstanceOf[js.Any] },
        "TerminateInstances" -> TerminateInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetsRequest]
    }
  }

  @js.native
  trait DeleteFleetsResult extends js.Object {
    var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet]
    var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet]
  }

  object DeleteFleetsResult {
    def apply(
      SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet] = js.undefined,
      UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet] = js.undefined): DeleteFleetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SuccessfulFleetDeletions" -> SuccessfulFleetDeletions.map { x => x.asInstanceOf[js.Any] },
        "UnsuccessfulFleetDeletions" -> UnsuccessfulFleetDeletions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetsResult]
    }
  }

  @js.native
  trait DeleteFlowLogsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var FlowLogIds: js.UndefOr[ValueStringList]
  }

  object DeleteFlowLogsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      FlowLogIds: js.UndefOr[ValueStringList] = js.undefined): DeleteFlowLogsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "FlowLogIds" -> FlowLogIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFlowLogsRequest]
    }
  }

  @js.native
  trait DeleteFlowLogsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object DeleteFlowLogsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): DeleteFlowLogsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFlowLogsResult]
    }
  }

  @js.native
  trait DeleteFpgaImageRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var FpgaImageId: js.UndefOr[String]
  }

  object DeleteFpgaImageRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      FpgaImageId: js.UndefOr[String] = js.undefined): DeleteFpgaImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFpgaImageRequest]
    }
  }

  @js.native
  trait DeleteFpgaImageResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object DeleteFpgaImageResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): DeleteFpgaImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFpgaImageResult]
    }
  }

  @js.native
  trait DeleteInternetGatewayRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InternetGatewayId: js.UndefOr[String]
  }

  object DeleteInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined): DeleteInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InternetGatewayId" -> InternetGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInternetGatewayRequest]
    }
  }

  @js.native
  trait DeleteKeyPairRequest extends js.Object {
    var KeyName: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteKeyPairRequest {
    def apply(
      KeyName: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKeyPairRequest]
    }
  }

  @js.native
  trait DeleteLaunchTemplateRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
  }

  object DeleteLaunchTemplateRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined): DeleteLaunchTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLaunchTemplateRequest]
    }
  }

  @js.native
  trait DeleteLaunchTemplateResult extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  object DeleteLaunchTemplateResult {
    def apply(
      LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined): DeleteLaunchTemplateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLaunchTemplateResult]
    }
  }

  @js.native
  trait DeleteLaunchTemplateVersionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Versions: js.UndefOr[VersionStringList]
  }

  object DeleteLaunchTemplateVersionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      Versions: js.UndefOr[VersionStringList] = js.undefined): DeleteLaunchTemplateVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "Versions" -> Versions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLaunchTemplateVersionsRequest]
    }
  }

  /**
   * <p>Describes a launch template version that could not be deleted.</p>
   */
  @js.native
  trait DeleteLaunchTemplateVersionsResponseErrorItem extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[String]
    var VersionNumber: js.UndefOr[Double]
    var ResponseError: js.UndefOr[ResponseError]
  }

  object DeleteLaunchTemplateVersionsResponseErrorItem {
    def apply(
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[String] = js.undefined,
      VersionNumber: js.UndefOr[Double] = js.undefined,
      ResponseError: js.UndefOr[ResponseError] = js.undefined): DeleteLaunchTemplateVersionsResponseErrorItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] },
        "ResponseError" -> ResponseError.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLaunchTemplateVersionsResponseErrorItem]
    }
  }

  /**
   * <p>Describes a launch template version that was successfully deleted.</p>
   */
  @js.native
  trait DeleteLaunchTemplateVersionsResponseSuccessItem extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[String]
    var VersionNumber: js.UndefOr[Double]
  }

  object DeleteLaunchTemplateVersionsResponseSuccessItem {
    def apply(
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[String] = js.undefined,
      VersionNumber: js.UndefOr[Double] = js.undefined): DeleteLaunchTemplateVersionsResponseSuccessItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLaunchTemplateVersionsResponseSuccessItem]
    }
  }

  @js.native
  trait DeleteLaunchTemplateVersionsResult extends js.Object {
    var SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet]
    var UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet]
  }

  object DeleteLaunchTemplateVersionsResult {
    def apply(
      SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet] = js.undefined,
      UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet] = js.undefined): DeleteLaunchTemplateVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SuccessfullyDeletedLaunchTemplateVersions" -> SuccessfullyDeletedLaunchTemplateVersions.map { x => x.asInstanceOf[js.Any] },
        "UnsuccessfullyDeletedLaunchTemplateVersions" -> UnsuccessfullyDeletedLaunchTemplateVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLaunchTemplateVersionsResult]
    }
  }

  @js.native
  trait DeleteNatGatewayRequest extends js.Object {
    var NatGatewayId: js.UndefOr[String]
  }

  object DeleteNatGatewayRequest {
    def apply(
      NatGatewayId: js.UndefOr[String] = js.undefined): DeleteNatGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NatGatewayId" -> NatGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNatGatewayRequest]
    }
  }

  @js.native
  trait DeleteNatGatewayResult extends js.Object {
    var NatGatewayId: js.UndefOr[String]
  }

  object DeleteNatGatewayResult {
    def apply(
      NatGatewayId: js.UndefOr[String] = js.undefined): DeleteNatGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NatGatewayId" -> NatGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNatGatewayResult]
    }
  }

  @js.native
  trait DeleteNetworkAclEntryRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Egress: js.UndefOr[Boolean]
    var NetworkAclId: js.UndefOr[String]
    var RuleNumber: js.UndefOr[Int]
  }

  object DeleteNetworkAclEntryRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Egress: js.UndefOr[Boolean] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Int] = js.undefined): DeleteNetworkAclEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Egress" -> Egress.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] },
        "RuleNumber" -> RuleNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkAclEntryRequest]
    }
  }

  @js.native
  trait DeleteNetworkAclRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var NetworkAclId: js.UndefOr[String]
  }

  object DeleteNetworkAclRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined): DeleteNetworkAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkAclRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteNetworkInterfacePermission.</p>
   */
  @js.native
  trait DeleteNetworkInterfacePermissionRequest extends js.Object {
    var NetworkInterfacePermissionId: js.UndefOr[String]
    var Force: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteNetworkInterfacePermissionRequest {
    def apply(
      NetworkInterfacePermissionId: js.UndefOr[String] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteNetworkInterfacePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfacePermissionId" -> NetworkInterfacePermissionId.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkInterfacePermissionRequest]
    }
  }

  /**
   * <p>Contains the output for DeleteNetworkInterfacePermission.</p>
   */
  @js.native
  trait DeleteNetworkInterfacePermissionResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object DeleteNetworkInterfacePermissionResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): DeleteNetworkInterfacePermissionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkInterfacePermissionResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteNetworkInterface.</p>
   */
  @js.native
  trait DeleteNetworkInterfaceRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object DeleteNetworkInterfaceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): DeleteNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeletePlacementGroup.</p>
   */
  @js.native
  trait DeletePlacementGroupRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupName: js.UndefOr[String]
  }

  object DeletePlacementGroupRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined): DeletePlacementGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlacementGroupRequest]
    }
  }

  @js.native
  trait DeleteRouteRequest extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var RouteTableId: js.UndefOr[String]
  }

  object DeleteRouteRequest {
    def apply(
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined): DeleteRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRouteRequest]
    }
  }

  @js.native
  trait DeleteRouteTableRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var RouteTableId: js.UndefOr[String]
  }

  object DeleteRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined): DeleteRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRouteTableRequest]
    }
  }

  @js.native
  trait DeleteSecurityGroupRequest extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteSecurityGroupRequest {
    def apply(
      GroupId: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityGroupRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteSnapshot.</p>
   */
  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteSnapshotRequest {
    def apply(
      SnapshotId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteSpotDatafeedSubscription.</p>
   */
  @js.native
  trait DeleteSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteSpotDatafeedSubscriptionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteSpotDatafeedSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSpotDatafeedSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteSubnetRequest extends js.Object {
    var SubnetId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteSubnetRequest {
    def apply(
      SubnetId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteSubnetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubnetRequest]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Resources: js.UndefOr[ResourceIdList]
    var Tags: js.UndefOr[TagList]
  }

  object DeleteTagsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Resources: js.UndefOr[ResourceIdList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVolume.</p>
   */
  @js.native
  trait DeleteVolumeRequest extends js.Object {
    var VolumeId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteVolumeRequest {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeRequest]
    }
  }

  @js.native
  trait DeleteVpcEndpointConnectionNotificationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ConnectionNotificationIds: js.UndefOr[ValueStringList]
  }

  object DeleteVpcEndpointConnectionNotificationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ConnectionNotificationIds: js.UndefOr[ValueStringList] = js.undefined): DeleteVpcEndpointConnectionNotificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationIds" -> ConnectionNotificationIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointConnectionNotificationsRequest]
    }
  }

  @js.native
  trait DeleteVpcEndpointConnectionNotificationsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object DeleteVpcEndpointConnectionNotificationsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): DeleteVpcEndpointConnectionNotificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointConnectionNotificationsResult]
    }
  }

  @js.native
  trait DeleteVpcEndpointServiceConfigurationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ServiceIds: js.UndefOr[ValueStringList]
  }

  object DeleteVpcEndpointServiceConfigurationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceIds: js.UndefOr[ValueStringList] = js.undefined): DeleteVpcEndpointServiceConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ServiceIds" -> ServiceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointServiceConfigurationsRequest]
    }
  }

  @js.native
  trait DeleteVpcEndpointServiceConfigurationsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object DeleteVpcEndpointServiceConfigurationsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): DeleteVpcEndpointServiceConfigurationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointServiceConfigurationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpcEndpoints.</p>
   */
  @js.native
  trait DeleteVpcEndpointsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcEndpointIds: js.UndefOr[ValueStringList]
  }

  object DeleteVpcEndpointsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined): DeleteVpcEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointIds" -> VpcEndpointIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointsRequest]
    }
  }

  /**
   * <p>Contains the output of DeleteVpcEndpoints.</p>
   */
  @js.native
  trait DeleteVpcEndpointsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object DeleteVpcEndpointsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): DeleteVpcEndpointsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointsResult]
    }
  }

  @js.native
  trait DeleteVpcPeeringConnectionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  object DeleteVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined): DeleteVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionRequest]
    }
  }

  @js.native
  trait DeleteVpcPeeringConnectionResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object DeleteVpcPeeringConnectionResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): DeleteVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionResult]
    }
  }

  @js.native
  trait DeleteVpcRequest extends js.Object {
    var VpcId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteVpcRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpnConnection.</p>
   */
  @js.native
  trait DeleteVpnConnectionRequest extends js.Object {
    var VpnConnectionId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteVpnConnectionRequest {
    def apply(
      VpnConnectionId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpnConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpnConnectionId" -> VpnConnectionId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpnConnectionRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpnConnectionRoute.</p>
   */
  @js.native
  trait DeleteVpnConnectionRouteRequest extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var VpnConnectionId: js.UndefOr[String]
  }

  object DeleteVpnConnectionRouteRequest {
    def apply(
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpnConnectionId: js.UndefOr[String] = js.undefined): DeleteVpnConnectionRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "VpnConnectionId" -> VpnConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpnConnectionRouteRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpnGateway.</p>
   */
  @js.native
  trait DeleteVpnGatewayRequest extends js.Object {
    var VpnGatewayId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeleteVpnGatewayRequest {
    def apply(
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpnGatewayId" -> VpnGatewayId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpnGatewayRequest]
    }
  }

  @js.native
  trait DeprovisionByoipCidrRequest extends js.Object {
    var Cidr: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeprovisionByoipCidrRequest {
    def apply(
      Cidr: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeprovisionByoipCidrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprovisionByoipCidrRequest]
    }
  }

  @js.native
  trait DeprovisionByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object DeprovisionByoipCidrResult {
    def apply(
      ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined): DeprovisionByoipCidrResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByoipCidr" -> ByoipCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprovisionByoipCidrResult]
    }
  }

  /**
   * <p>Contains the parameters for DeregisterImage.</p>
   */
  @js.native
  trait DeregisterImageRequest extends js.Object {
    var ImageId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DeregisterImageRequest {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DeregisterImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterImageRequest]
    }
  }

  /**
   * <p>Contains the parameters for DescribeAccountAttributes.</p>
   */
  @js.native
  trait DescribeAccountAttributesRequest extends js.Object {
    var AttributeNames: js.UndefOr[AccountAttributeNameStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeAccountAttributesRequest {
    def apply(
      AttributeNames: js.UndefOr[AccountAttributeNameStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeAccountAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeAccountAttributes.</p>
   */
  @js.native
  trait DescribeAccountAttributesResult extends js.Object {
    var AccountAttributes: js.UndefOr[AccountAttributeList]
  }

  object DescribeAccountAttributesResult {
    def apply(
      AccountAttributes: js.UndefOr[AccountAttributeList] = js.undefined): DescribeAccountAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountAttributes" -> AccountAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesResult]
    }
  }

  @js.native
  trait DescribeAddressesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var PublicIps: js.UndefOr[PublicIpStringList]
    var AllocationIds: js.UndefOr[AllocationIdList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeAddressesRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      PublicIps: js.UndefOr[PublicIpStringList] = js.undefined,
      AllocationIds: js.UndefOr[AllocationIdList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "PublicIps" -> PublicIps.map { x => x.asInstanceOf[js.Any] },
        "AllocationIds" -> AllocationIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressesRequest]
    }
  }

  @js.native
  trait DescribeAddressesResult extends js.Object {
    var Addresses: js.UndefOr[AddressList]
  }

  object DescribeAddressesResult {
    def apply(
      Addresses: js.UndefOr[AddressList] = js.undefined): DescribeAddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Addresses" -> Addresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressesResult]
    }
  }

  @js.native
  trait DescribeAggregateIdFormatRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeAggregateIdFormatRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeAggregateIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAggregateIdFormatRequest]
    }
  }

  @js.native
  trait DescribeAggregateIdFormatResult extends js.Object {
    var UseLongIdsAggregated: js.UndefOr[Boolean]
    var Statuses: js.UndefOr[IdFormatList]
  }

  object DescribeAggregateIdFormatResult {
    def apply(
      UseLongIdsAggregated: js.UndefOr[Boolean] = js.undefined,
      Statuses: js.UndefOr[IdFormatList] = js.undefined): DescribeAggregateIdFormatResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UseLongIdsAggregated" -> UseLongIdsAggregated.map { x => x.asInstanceOf[js.Any] },
        "Statuses" -> Statuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAggregateIdFormatResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeAvailabilityZones.</p>
   */
  @js.native
  trait DescribeAvailabilityZonesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var ZoneNames: js.UndefOr[ZoneNameStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeAvailabilityZonesRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      ZoneNames: js.UndefOr[ZoneNameStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeAvailabilityZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ZoneNames" -> ZoneNames.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailabilityZonesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeAvailabiltyZones.</p>
   */
  @js.native
  trait DescribeAvailabilityZonesResult extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object DescribeAvailabilityZonesResult {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined): DescribeAvailabilityZonesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailabilityZonesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeBundleTasks.</p>
   */
  @js.native
  trait DescribeBundleTasksRequest extends js.Object {
    var BundleIds: js.UndefOr[BundleIdStringList]
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeBundleTasksRequest {
    def apply(
      BundleIds: js.UndefOr[BundleIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeBundleTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleIds" -> BundleIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBundleTasksRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeBundleTasks.</p>
   */
  @js.native
  trait DescribeBundleTasksResult extends js.Object {
    var BundleTasks: js.UndefOr[BundleTaskList]
  }

  object DescribeBundleTasksResult {
    def apply(
      BundleTasks: js.UndefOr[BundleTaskList] = js.undefined): DescribeBundleTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleTasks" -> BundleTasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBundleTasksResult]
    }
  }

  @js.native
  trait DescribeByoipCidrsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeByoipCidrsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeByoipCidrsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeByoipCidrsRequest]
    }
  }

  @js.native
  trait DescribeByoipCidrsResult extends js.Object {
    var ByoipCidrs: js.UndefOr[ByoipCidrSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeByoipCidrsResult {
    def apply(
      ByoipCidrs: js.UndefOr[ByoipCidrSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeByoipCidrsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByoipCidrs" -> ByoipCidrs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeByoipCidrsResult]
    }
  }

  @js.native
  trait DescribeCapacityReservationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var CapacityReservationIds: js.UndefOr[CapacityReservationIdSet]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeCapacityReservationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      CapacityReservationIds: js.UndefOr[CapacityReservationIdSet] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeCapacityReservationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationIds" -> CapacityReservationIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCapacityReservationsRequest]
    }
  }

  @js.native
  trait DescribeCapacityReservationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var CapacityReservations: js.UndefOr[CapacityReservationSet]
  }

  object DescribeCapacityReservationsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      CapacityReservations: js.UndefOr[CapacityReservationSet] = js.undefined): DescribeCapacityReservationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservations" -> CapacityReservations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCapacityReservationsResult]
    }
  }

  @js.native
  trait DescribeClassicLinkInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeClassicLinkInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeClassicLinkInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClassicLinkInstancesRequest]
    }
  }

  @js.native
  trait DescribeClassicLinkInstancesResult extends js.Object {
    var Instances: js.UndefOr[ClassicLinkInstanceList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeClassicLinkInstancesResult {
    def apply(
      Instances: js.UndefOr[ClassicLinkInstanceList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeClassicLinkInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClassicLinkInstancesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeConversionTasks.</p>
   */
  @js.native
  trait DescribeConversionTasksRequest extends js.Object {
    var ConversionTaskIds: js.UndefOr[ConversionIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeConversionTasksRequest {
    def apply(
      ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeConversionTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConversionTaskIds" -> ConversionTaskIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConversionTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeConversionTasks.</p>
   */
  @js.native
  trait DescribeConversionTasksResult extends js.Object {
    var ConversionTasks: js.UndefOr[DescribeConversionTaskList]
  }

  object DescribeConversionTasksResult {
    def apply(
      ConversionTasks: js.UndefOr[DescribeConversionTaskList] = js.undefined): DescribeConversionTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConversionTasks" -> ConversionTasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConversionTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeCustomerGateways.</p>
   */
  @js.native
  trait DescribeCustomerGatewaysRequest extends js.Object {
    var CustomerGatewayIds: js.UndefOr[CustomerGatewayIdStringList]
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeCustomerGatewaysRequest {
    def apply(
      CustomerGatewayIds: js.UndefOr[CustomerGatewayIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeCustomerGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerGatewayIds" -> CustomerGatewayIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCustomerGatewaysRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeCustomerGateways.</p>
   */
  @js.native
  trait DescribeCustomerGatewaysResult extends js.Object {
    var CustomerGateways: js.UndefOr[CustomerGatewayList]
  }

  object DescribeCustomerGatewaysResult {
    def apply(
      CustomerGateways: js.UndefOr[CustomerGatewayList] = js.undefined): DescribeCustomerGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerGateways" -> CustomerGateways.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCustomerGatewaysResult]
    }
  }

  @js.native
  trait DescribeDhcpOptionsRequest extends js.Object {
    var DhcpOptionsIds: js.UndefOr[DhcpOptionsIdStringList]
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeDhcpOptionsRequest {
    def apply(
      DhcpOptionsIds: js.UndefOr[DhcpOptionsIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpOptionsIds" -> DhcpOptionsIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDhcpOptionsRequest]
    }
  }

  @js.native
  trait DescribeDhcpOptionsResult extends js.Object {
    var DhcpOptions: js.UndefOr[DhcpOptionsList]
  }

  object DescribeDhcpOptionsResult {
    def apply(
      DhcpOptions: js.UndefOr[DhcpOptionsList] = js.undefined): DescribeDhcpOptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpOptions" -> DhcpOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDhcpOptionsResult]
    }
  }

  @js.native
  trait DescribeEgressOnlyInternetGatewaysRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var EgressOnlyInternetGatewayIds: js.UndefOr[EgressOnlyInternetGatewayIdList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEgressOnlyInternetGatewaysRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      EgressOnlyInternetGatewayIds: js.UndefOr[EgressOnlyInternetGatewayIdList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeEgressOnlyInternetGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGatewayIds" -> EgressOnlyInternetGatewayIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEgressOnlyInternetGatewaysRequest]
    }
  }

  @js.native
  trait DescribeEgressOnlyInternetGatewaysResult extends js.Object {
    var EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEgressOnlyInternetGatewaysResult {
    def apply(
      EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeEgressOnlyInternetGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EgressOnlyInternetGateways" -> EgressOnlyInternetGateways.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEgressOnlyInternetGatewaysResult]
    }
  }

  @js.native
  trait DescribeElasticGpusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var ElasticGpuIds: js.UndefOr[ElasticGpuIdSet]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeElasticGpusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      ElasticGpuIds: js.UndefOr[ElasticGpuIdSet] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeElasticGpusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuIds" -> ElasticGpuIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticGpusRequest]
    }
  }

  @js.native
  trait DescribeElasticGpusResult extends js.Object {
    var ElasticGpuSet: js.UndefOr[ElasticGpuSet]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeElasticGpusResult {
    def apply(
      ElasticGpuSet: js.UndefOr[ElasticGpuSet] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeElasticGpusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticGpuSet" -> ElasticGpuSet.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticGpusResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeExportTasks.</p>
   */
  @js.native
  trait DescribeExportTasksRequest extends js.Object {
    var ExportTaskIds: js.UndefOr[ExportTaskIdStringList]
  }

  object DescribeExportTasksRequest {
    def apply(
      ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.undefined): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportTaskIds" -> ExportTaskIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeExportTasks.</p>
   */
  @js.native
  trait DescribeExportTasksResult extends js.Object {
    var ExportTasks: js.UndefOr[ExportTaskList]
  }

  object DescribeExportTasksResult {
    def apply(
      ExportTasks: js.UndefOr[ExportTaskList] = js.undefined): DescribeExportTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportTasks" -> ExportTasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksResult]
    }
  }

  /**
   * <p>Describes the instances that could not be launched by the fleet.</p>
   */
  @js.native
  trait DescribeFleetError extends js.Object {
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Lifecycle: js.UndefOr[InstanceLifecycle]
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
  }

  object DescribeFleetError {
    def apply(
      LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined,
      Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): DescribeFleetError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateAndOverrides" -> LaunchTemplateAndOverrides.map { x => x.asInstanceOf[js.Any] },
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetError]
    }
  }

  @js.native
  trait DescribeFleetHistoryRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var EventType: js.UndefOr[FleetEventType]
    var StartTime: js.UndefOr[DateTime]
    var FleetId: js.UndefOr[FleetIdentifier]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetHistoryRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      EventType: js.UndefOr[FleetEventType] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFleetHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetHistoryRequest]
    }
  }

  @js.native
  trait DescribeFleetHistoryResult extends js.Object {
    var LastEvaluatedTime: js.UndefOr[DateTime]
    var HistoryRecords: js.UndefOr[HistoryRecordSet]
    var StartTime: js.UndefOr[DateTime]
    var FleetId: js.UndefOr[FleetIdentifier]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetHistoryResult {
    def apply(
      LastEvaluatedTime: js.UndefOr[DateTime] = js.undefined,
      HistoryRecords: js.UndefOr[HistoryRecordSet] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFleetHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastEvaluatedTime" -> LastEvaluatedTime.map { x => x.asInstanceOf[js.Any] },
        "HistoryRecords" -> HistoryRecords.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetHistoryResult]
    }
  }

  @js.native
  trait DescribeFleetInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var Filters: js.UndefOr[FilterList]
    var FleetId: js.UndefOr[FleetIdentifier]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFleetInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetInstancesRequest]
    }
  }

  @js.native
  trait DescribeFleetInstancesResult extends js.Object {
    var ActiveInstances: js.UndefOr[ActiveInstanceSet]
    var NextToken: js.UndefOr[String]
    var FleetId: js.UndefOr[FleetIdentifier]
  }

  object DescribeFleetInstancesResult {
    def apply(
      ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined): DescribeFleetInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActiveInstances" -> ActiveInstances.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetInstancesResult]
    }
  }

  /**
   * <p>Describes the instances that were launched by the fleet.</p>
   */
  @js.native
  trait DescribeFleetsInstances extends js.Object {
    var Lifecycle: js.UndefOr[InstanceLifecycle]
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Platform: js.UndefOr[PlatformValues]
    var InstanceType: js.UndefOr[InstanceType]
    var InstanceIds: js.UndefOr[InstanceIdsSet]
  }

  object DescribeFleetsInstances {
    def apply(
      Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined,
      LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdsSet] = js.undefined): DescribeFleetsInstances = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateAndOverrides" -> LaunchTemplateAndOverrides.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsInstances]
    }
  }

  @js.native
  trait DescribeFleetsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var FleetIds: js.UndefOr[FleetIdSet]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFleetsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      FleetIds: js.UndefOr[FleetIdSet] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFleetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "FleetIds" -> FleetIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsRequest]
    }
  }

  @js.native
  trait DescribeFleetsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Fleets: js.UndefOr[FleetSet]
  }

  object DescribeFleetsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      Fleets: js.UndefOr[FleetSet] = js.undefined): DescribeFleetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Fleets" -> Fleets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetsResult]
    }
  }

  @js.native
  trait DescribeFlowLogsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var FlowLogIds: js.UndefOr[ValueStringList]
    var MaxResults: js.UndefOr[Int]
    var Filter: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFlowLogsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      FlowLogIds: js.UndefOr[ValueStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFlowLogsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "FlowLogIds" -> FlowLogIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFlowLogsRequest]
    }
  }

  @js.native
  trait DescribeFlowLogsResult extends js.Object {
    var FlowLogs: js.UndefOr[FlowLogSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeFlowLogsResult {
    def apply(
      FlowLogs: js.UndefOr[FlowLogSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeFlowLogsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowLogs" -> FlowLogs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFlowLogsResult]
    }
  }

  @js.native
  trait DescribeFpgaImageAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var FpgaImageId: js.UndefOr[String]
    var Attribute: js.UndefOr[FpgaImageAttributeName]
  }

  object DescribeFpgaImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      FpgaImageId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[FpgaImageAttributeName] = js.undefined): DescribeFpgaImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFpgaImageAttributeRequest]
    }
  }

  @js.native
  trait DescribeFpgaImageAttributeResult extends js.Object {
    var FpgaImageAttribute: js.UndefOr[FpgaImageAttribute]
  }

  object DescribeFpgaImageAttributeResult {
    def apply(
      FpgaImageAttribute: js.UndefOr[FpgaImageAttribute] = js.undefined): DescribeFpgaImageAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FpgaImageAttribute" -> FpgaImageAttribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFpgaImageAttributeResult]
    }
  }

  @js.native
  trait DescribeFpgaImagesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var Owners: js.UndefOr[OwnerStringList]
    var FpgaImageIds: js.UndefOr[FpgaImageIdList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFpgaImagesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      Owners: js.UndefOr[OwnerStringList] = js.undefined,
      FpgaImageIds: js.UndefOr[FpgaImageIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeFpgaImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Owners" -> Owners.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageIds" -> FpgaImageIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFpgaImagesRequest]
    }
  }

  @js.native
  trait DescribeFpgaImagesResult extends js.Object {
    var FpgaImages: js.UndefOr[FpgaImageList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFpgaImagesResult {
    def apply(
      FpgaImages: js.UndefOr[FpgaImageList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeFpgaImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FpgaImages" -> FpgaImages.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFpgaImagesResult]
    }
  }

  @js.native
  trait DescribeHostReservationOfferingsRequest extends js.Object {
    var MaxDuration: js.UndefOr[Int]
    var MaxResults: js.UndefOr[Int]
    var OfferingId: js.UndefOr[String]
    var MinDuration: js.UndefOr[Int]
    var Filter: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeHostReservationOfferingsRequest {
    def apply(
      MaxDuration: js.UndefOr[Int] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined,
      MinDuration: js.UndefOr[Int] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeHostReservationOfferingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxDuration" -> MaxDuration.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] },
        "MinDuration" -> MinDuration.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationOfferingsRequest]
    }
  }

  @js.native
  trait DescribeHostReservationOfferingsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var OfferingSet: js.UndefOr[HostOfferingSet]
  }

  object DescribeHostReservationOfferingsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      OfferingSet: js.UndefOr[HostOfferingSet] = js.undefined): DescribeHostReservationOfferingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "OfferingSet" -> OfferingSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationOfferingsResult]
    }
  }

  @js.native
  trait DescribeHostReservationsRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var HostReservationIdSet: js.UndefOr[HostReservationIdSet]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeHostReservationsRequest {
    def apply(
      Filter: js.UndefOr[FilterList] = js.undefined,
      HostReservationIdSet: js.UndefOr[HostReservationIdSet] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeHostReservationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "HostReservationIdSet" -> HostReservationIdSet.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationsRequest]
    }
  }

  @js.native
  trait DescribeHostReservationsResult extends js.Object {
    var HostReservationSet: js.UndefOr[HostReservationSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeHostReservationsResult {
    def apply(
      HostReservationSet: js.UndefOr[HostReservationSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeHostReservationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostReservationSet" -> HostReservationSet.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationsResult]
    }
  }

  @js.native
  trait DescribeHostsRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var HostIds: js.UndefOr[RequestHostIdList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeHostsRequest {
    def apply(
      Filter: js.UndefOr[FilterList] = js.undefined,
      HostIds: js.UndefOr[RequestHostIdList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "HostIds" -> HostIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostsRequest]
    }
  }

  @js.native
  trait DescribeHostsResult extends js.Object {
    var Hosts: js.UndefOr[HostList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeHostsResult {
    def apply(
      Hosts: js.UndefOr[HostList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Hosts" -> Hosts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostsResult]
    }
  }

  @js.native
  trait DescribeIamInstanceProfileAssociationsRequest extends js.Object {
    var AssociationIds: js.UndefOr[AssociationIdList]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeIamInstanceProfileAssociationsRequest {
    def apply(
      AssociationIds: js.UndefOr[AssociationIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeIamInstanceProfileAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationIds" -> AssociationIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIamInstanceProfileAssociationsRequest]
    }
  }

  @js.native
  trait DescribeIamInstanceProfileAssociationsResult extends js.Object {
    var IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeIamInstanceProfileAssociationsResult {
    def apply(
      IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeIamInstanceProfileAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfileAssociations" -> IamInstanceProfileAssociations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeIdFormat.</p>
   */
  @js.native
  trait DescribeIdFormatRequest extends js.Object {
    var Resource: js.UndefOr[String]
  }

  object DescribeIdFormatRequest {
    def apply(
      Resource: js.UndefOr[String] = js.undefined): DescribeIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdFormatRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeIdFormat.</p>
   */
  @js.native
  trait DescribeIdFormatResult extends js.Object {
    var Statuses: js.UndefOr[IdFormatList]
  }

  object DescribeIdFormatResult {
    def apply(
      Statuses: js.UndefOr[IdFormatList] = js.undefined): DescribeIdFormatResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Statuses" -> Statuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdFormatResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeIdentityIdFormat.</p>
   */
  @js.native
  trait DescribeIdentityIdFormatRequest extends js.Object {
    var PrincipalArn: js.UndefOr[String]
    var Resource: js.UndefOr[String]
  }

  object DescribeIdentityIdFormatRequest {
    def apply(
      PrincipalArn: js.UndefOr[String] = js.undefined,
      Resource: js.UndefOr[String] = js.undefined): DescribeIdentityIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalArn" -> PrincipalArn.map { x => x.asInstanceOf[js.Any] },
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityIdFormatRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeIdentityIdFormat.</p>
   */
  @js.native
  trait DescribeIdentityIdFormatResult extends js.Object {
    var Statuses: js.UndefOr[IdFormatList]
  }

  object DescribeIdentityIdFormatResult {
    def apply(
      Statuses: js.UndefOr[IdFormatList] = js.undefined): DescribeIdentityIdFormatResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Statuses" -> Statuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityIdFormatResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImageAttribute.</p>
   */
  @js.native
  trait DescribeImageAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[ImageAttributeName]
    var ImageId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeImageAttributeRequest {
    def apply(
      Attribute: js.UndefOr[ImageAttributeName] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImageAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImages.</p>
   */
  @js.native
  trait DescribeImagesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Owners: js.UndefOr[OwnerStringList]
    var ImageIds: js.UndefOr[ImageIdStringList]
    var Filters: js.UndefOr[FilterList]
    var ExecutableUsers: js.UndefOr[ExecutableByStringList]
  }

  object DescribeImagesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Owners: js.UndefOr[OwnerStringList] = js.undefined,
      ImageIds: js.UndefOr[ImageIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ExecutableUsers: js.UndefOr[ExecutableByStringList] = js.undefined): DescribeImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Owners" -> Owners.map { x => x.asInstanceOf[js.Any] },
        "ImageIds" -> ImageIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ExecutableUsers" -> ExecutableUsers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeImages.</p>
   */
  @js.native
  trait DescribeImagesResult extends js.Object {
    var Images: js.UndefOr[ImageList]
  }

  object DescribeImagesResult {
    def apply(
      Images: js.UndefOr[ImageList] = js.undefined): DescribeImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Images" -> Images.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImportImageTasks.</p>
   */
  @js.native
  trait DescribeImportImageTasksRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var ImportTaskIds: js.UndefOr[ImportTaskIdList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImportImageTasksRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImportImageTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskIds" -> ImportTaskIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportImageTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeImportImageTasks.</p>
   */
  @js.native
  trait DescribeImportImageTasksResult extends js.Object {
    var ImportImageTasks: js.UndefOr[ImportImageTaskList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImportImageTasksResult {
    def apply(
      ImportImageTasks: js.UndefOr[ImportImageTaskList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImportImageTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportImageTasks" -> ImportImageTasks.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportImageTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImportSnapshotTasks.</p>
   */
  @js.native
  trait DescribeImportSnapshotTasksRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var ImportTaskIds: js.UndefOr[ImportTaskIdList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImportSnapshotTasksRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImportSnapshotTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskIds" -> ImportTaskIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportSnapshotTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeImportSnapshotTasks.</p>
   */
  @js.native
  trait DescribeImportSnapshotTasksResult extends js.Object {
    var ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeImportSnapshotTasksResult {
    def apply(
      ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeImportSnapshotTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportSnapshotTasks" -> ImportSnapshotTasks.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportSnapshotTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstanceAttribute.</p>
   */
  @js.native
  trait DescribeInstanceAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[InstanceAttributeName]
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
  }

  object DescribeInstanceAttributeRequest {
    def apply(
      Attribute: js.UndefOr[InstanceAttributeName] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): DescribeInstanceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceAttributeRequest]
    }
  }

  @js.native
  trait DescribeInstanceCreditSpecificationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeInstanceCreditSpecificationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeInstanceCreditSpecificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceCreditSpecificationsRequest]
    }
  }

  @js.native
  trait DescribeInstanceCreditSpecificationsResult extends js.Object {
    var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeInstanceCreditSpecificationsResult {
    def apply(
      InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeInstanceCreditSpecificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCreditSpecifications" -> InstanceCreditSpecifications.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceCreditSpecificationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstanceStatus.</p>
   */
  @js.native
  trait DescribeInstanceStatusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var IncludeAllInstances: js.UndefOr[Boolean]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeInstanceStatusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      IncludeAllInstances: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeInstanceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "IncludeAllInstances" -> IncludeAllInstances.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceStatusRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeInstanceStatus.</p>
   */
  @js.native
  trait DescribeInstanceStatusResult extends js.Object {
    var InstanceStatuses: js.UndefOr[InstanceStatusList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeInstanceStatusResult {
    def apply(
      InstanceStatuses: js.UndefOr[InstanceStatusList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeInstanceStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceStatuses" -> InstanceStatuses.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceStatusResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstances.</p>
   */
  @js.native
  trait DescribeInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeInstances.</p>
   */
  @js.native
  trait DescribeInstancesResult extends js.Object {
    var Reservations: js.UndefOr[ReservationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeInstancesResult {
    def apply(
      Reservations: js.UndefOr[ReservationList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reservations" -> Reservations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesResult]
    }
  }

  @js.native
  trait DescribeInternetGatewaysRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
    var InternetGatewayIds: js.UndefOr[ValueStringList]
  }

  object DescribeInternetGatewaysRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayIds: js.UndefOr[ValueStringList] = js.undefined): DescribeInternetGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InternetGatewayIds" -> InternetGatewayIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInternetGatewaysRequest]
    }
  }

  @js.native
  trait DescribeInternetGatewaysResult extends js.Object {
    var InternetGateways: js.UndefOr[InternetGatewayList]
  }

  object DescribeInternetGatewaysResult {
    def apply(
      InternetGateways: js.UndefOr[InternetGatewayList] = js.undefined): DescribeInternetGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InternetGateways" -> InternetGateways.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInternetGatewaysResult]
    }
  }

  @js.native
  trait DescribeKeyPairsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var KeyNames: js.UndefOr[KeyNameStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeKeyPairsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      KeyNames: js.UndefOr[KeyNameStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeKeyPairsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "KeyNames" -> KeyNames.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyPairsRequest]
    }
  }

  @js.native
  trait DescribeKeyPairsResult extends js.Object {
    var KeyPairs: js.UndefOr[KeyPairList]
  }

  object DescribeKeyPairsResult {
    def apply(
      KeyPairs: js.UndefOr[KeyPairList] = js.undefined): DescribeKeyPairsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyPairs" -> KeyPairs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyPairsResult]
    }
  }

  @js.native
  trait DescribeLaunchTemplateVersionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxVersion: js.UndefOr[String]
    var Versions: js.UndefOr[VersionStringList]
    var MaxResults: js.UndefOr[Int]
    var MinVersion: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var LaunchTemplateId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeLaunchTemplateVersionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxVersion: js.UndefOr[String] = js.undefined,
      Versions: js.UndefOr[VersionStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      MinVersion: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeLaunchTemplateVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxVersion" -> MaxVersion.map { x => x.asInstanceOf[js.Any] },
        "Versions" -> Versions.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "MinVersion" -> MinVersion.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLaunchTemplateVersionsRequest]
    }
  }

  @js.native
  trait DescribeLaunchTemplateVersionsResult extends js.Object {
    var LaunchTemplateVersions: js.UndefOr[LaunchTemplateVersionSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeLaunchTemplateVersionsResult {
    def apply(
      LaunchTemplateVersions: js.UndefOr[LaunchTemplateVersionSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeLaunchTemplateVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateVersions" -> LaunchTemplateVersions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLaunchTemplateVersionsResult]
    }
  }

  @js.native
  trait DescribeLaunchTemplatesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var LaunchTemplateIds: js.UndefOr[ValueStringList]
    var LaunchTemplateNames: js.UndefOr[LaunchTemplateNameStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeLaunchTemplatesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      LaunchTemplateIds: js.UndefOr[ValueStringList] = js.undefined,
      LaunchTemplateNames: js.UndefOr[LaunchTemplateNameStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeLaunchTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateIds" -> LaunchTemplateIds.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateNames" -> LaunchTemplateNames.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLaunchTemplatesRequest]
    }
  }

  @js.native
  trait DescribeLaunchTemplatesResult extends js.Object {
    var LaunchTemplates: js.UndefOr[LaunchTemplateSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeLaunchTemplatesResult {
    def apply(
      LaunchTemplates: js.UndefOr[LaunchTemplateSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeLaunchTemplatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplates" -> LaunchTemplates.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLaunchTemplatesResult]
    }
  }

  @js.native
  trait DescribeMovingAddressesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var PublicIps: js.UndefOr[ValueStringList]
    var MaxResults: js.UndefOr[Int]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeMovingAddressesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIps: js.UndefOr[ValueStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeMovingAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PublicIps" -> PublicIps.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMovingAddressesRequest]
    }
  }

  @js.native
  trait DescribeMovingAddressesResult extends js.Object {
    var MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeMovingAddressesResult {
    def apply(
      MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeMovingAddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MovingAddressStatuses" -> MovingAddressStatuses.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMovingAddressesResult]
    }
  }

  @js.native
  trait DescribeNatGatewaysRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NatGatewayIds: js.UndefOr[ValueStringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeNatGatewaysRequest {
    def apply(
      Filter: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NatGatewayIds: js.UndefOr[ValueStringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeNatGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NatGatewayIds" -> NatGatewayIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNatGatewaysRequest]
    }
  }

  @js.native
  trait DescribeNatGatewaysResult extends js.Object {
    var NatGateways: js.UndefOr[NatGatewayList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeNatGatewaysResult {
    def apply(
      NatGateways: js.UndefOr[NatGatewayList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeNatGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NatGateways" -> NatGateways.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNatGatewaysResult]
    }
  }

  @js.native
  trait DescribeNetworkAclsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
    var NetworkAclIds: js.UndefOr[ValueStringList]
  }

  object DescribeNetworkAclsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkAclIds: js.UndefOr[ValueStringList] = js.undefined): DescribeNetworkAclsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclIds" -> NetworkAclIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkAclsRequest]
    }
  }

  @js.native
  trait DescribeNetworkAclsResult extends js.Object {
    var NetworkAcls: js.UndefOr[NetworkAclList]
  }

  object DescribeNetworkAclsResult {
    def apply(
      NetworkAcls: js.UndefOr[NetworkAclList] = js.undefined): DescribeNetworkAclsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkAcls" -> NetworkAcls.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkAclsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait DescribeNetworkInterfaceAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[NetworkInterfaceAttribute]
    var DryRun: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object DescribeNetworkInterfaceAttributeRequest {
    def apply(
      Attribute: js.UndefOr[NetworkInterfaceAttribute] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): DescribeNetworkInterfaceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfaceAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait DescribeNetworkInterfaceAttributeResult extends js.Object {
    var Description: js.UndefOr[AttributeValue]
    var Groups: js.UndefOr[GroupIdentifierList]
    var Attachment: js.UndefOr[NetworkInterfaceAttachment]
    var NetworkInterfaceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
  }

  object DescribeNetworkInterfaceAttributeResult {
    def apply(
      Description: js.UndefOr[AttributeValue] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined): DescribeNetworkInterfaceAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Attachment" -> Attachment.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfaceAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNetworkInterfacePermissions.</p>
   */
  @js.native
  trait DescribeNetworkInterfacePermissionsRequest extends js.Object {
    var NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[Int]
  }

  object DescribeNetworkInterfacePermissionsRequest {
    def apply(
      NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined): DescribeNetworkInterfacePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfacePermissionIds" -> NetworkInterfacePermissionIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfacePermissionsRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeNetworkInterfacePermissions.</p>
   */
  @js.native
  trait DescribeNetworkInterfacePermissionsResult extends js.Object {
    var NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeNetworkInterfacePermissionsResult {
    def apply(
      NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeNetworkInterfacePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfacePermissions" -> NetworkInterfacePermissions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfacePermissionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNetworkInterfaces.</p>
   */
  @js.native
  trait DescribeNetworkInterfacesRequest extends js.Object {
    var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIdList]
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeNetworkInterfacesRequest {
    def apply(
      NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIdList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeNetworkInterfacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaceIds" -> NetworkInterfaceIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfacesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeNetworkInterfaces.</p>
   */
  @js.native
  trait DescribeNetworkInterfacesResult extends js.Object {
    var NetworkInterfaces: js.UndefOr[NetworkInterfaceList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeNetworkInterfacesResult {
    def apply(
      NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeNetworkInterfacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfacesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribePlacementGroups.</p>
   */
  @js.native
  trait DescribePlacementGroupsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
    var GroupNames: js.UndefOr[PlacementGroupStringList]
  }

  object DescribePlacementGroupsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupNames: js.UndefOr[PlacementGroupStringList] = js.undefined): DescribePlacementGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "GroupNames" -> GroupNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlacementGroupsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribePlacementGroups.</p>
   */
  @js.native
  trait DescribePlacementGroupsResult extends js.Object {
    var PlacementGroups: js.UndefOr[PlacementGroupList]
  }

  object DescribePlacementGroupsResult {
    def apply(
      PlacementGroups: js.UndefOr[PlacementGroupList] = js.undefined): DescribePlacementGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlacementGroups" -> PlacementGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlacementGroupsResult]
    }
  }

  @js.native
  trait DescribePrefixListsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var PrefixListIds: js.UndefOr[ValueStringList]
    var MaxResults: js.UndefOr[Int]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribePrefixListsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PrefixListIds: js.UndefOr[ValueStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribePrefixListsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PrefixListIds" -> PrefixListIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePrefixListsRequest]
    }
  }

  @js.native
  trait DescribePrefixListsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var PrefixLists: js.UndefOr[PrefixListSet]
  }

  object DescribePrefixListsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      PrefixLists: js.UndefOr[PrefixListSet] = js.undefined): DescribePrefixListsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PrefixLists" -> PrefixLists.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePrefixListsResult]
    }
  }

  @js.native
  trait DescribePrincipalIdFormatRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Resources: js.UndefOr[ResourceList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribePrincipalIdFormatRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Resources: js.UndefOr[ResourceList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribePrincipalIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePrincipalIdFormatRequest]
    }
  }

  @js.native
  trait DescribePrincipalIdFormatResult extends js.Object {
    var Principals: js.UndefOr[PrincipalIdFormatList]
    var NextToken: js.UndefOr[String]
  }

  object DescribePrincipalIdFormatResult {
    def apply(
      Principals: js.UndefOr[PrincipalIdFormatList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribePrincipalIdFormatResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Principals" -> Principals.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePrincipalIdFormatResult]
    }
  }

  @js.native
  trait DescribePublicIpv4PoolsRequest extends js.Object {
    var PoolIds: js.UndefOr[ValueStringList]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[PoolMaxResults]
  }

  object DescribePublicIpv4PoolsRequest {
    def apply(
      PoolIds: js.UndefOr[ValueStringList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[PoolMaxResults] = js.undefined): DescribePublicIpv4PoolsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolIds" -> PoolIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePublicIpv4PoolsRequest]
    }
  }

  @js.native
  trait DescribePublicIpv4PoolsResult extends js.Object {
    var PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribePublicIpv4PoolsResult {
    def apply(
      PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribePublicIpv4PoolsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicIpv4Pools" -> PublicIpv4Pools.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePublicIpv4PoolsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeRegions.</p>
   */
  @js.native
  trait DescribeRegionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var RegionNames: js.UndefOr[RegionNameStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeRegionsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      RegionNames: js.UndefOr[RegionNameStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeRegionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "RegionNames" -> RegionNames.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRegionsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeRegions.</p>
   */
  @js.native
  trait DescribeRegionsResult extends js.Object {
    var Regions: js.UndefOr[RegionList]
  }

  object DescribeRegionsResult {
    def apply(
      Regions: js.UndefOr[RegionList] = js.undefined): DescribeRegionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Regions" -> Regions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRegionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstancesListings.</p>
   */
  @js.native
  trait DescribeReservedInstancesListingsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var ReservedInstancesId: js.UndefOr[String]
    var ReservedInstancesListingId: js.UndefOr[String]
  }

  object DescribeReservedInstancesListingsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      ReservedInstancesListingId: js.UndefOr[String] = js.undefined): DescribeReservedInstancesListingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesListingId" -> ReservedInstancesListingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesListingsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeReservedInstancesListings.</p>
   */
  @js.native
  trait DescribeReservedInstancesListingsResult extends js.Object {
    var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList]
  }

  object DescribeReservedInstancesListingsResult {
    def apply(
      ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined): DescribeReservedInstancesListingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesListings" -> ReservedInstancesListings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesListingsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstancesModifications.</p>
   */
  @js.native
  trait DescribeReservedInstancesModificationsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var ReservedInstancesModificationIds: js.UndefOr[ReservedInstancesModificationIdStringList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeReservedInstancesModificationsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      ReservedInstancesModificationIds: js.UndefOr[ReservedInstancesModificationIdStringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeReservedInstancesModificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesModificationIds" -> ReservedInstancesModificationIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesModificationsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeReservedInstancesModifications.</p>
   */
  @js.native
  trait DescribeReservedInstancesModificationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList]
  }

  object DescribeReservedInstancesModificationsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.undefined): DescribeReservedInstancesModificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesModifications" -> ReservedInstancesModifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesModificationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstancesOfferings.</p>
   */
  @js.native
  trait DescribeReservedInstancesOfferingsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxDuration: js.UndefOr[Double]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var MaxInstanceCount: js.UndefOr[Int]
    var ReservedInstancesOfferingIds: js.UndefOr[ReservedInstancesOfferingIdStringList]
    var MaxResults: js.UndefOr[Int]
    var IncludeMarketplace: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var InstanceType: js.UndefOr[InstanceType]
    var MinDuration: js.UndefOr[Double]
    var Filters: js.UndefOr[FilterList]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var NextToken: js.UndefOr[String]
    var InstanceTenancy: js.UndefOr[Tenancy]
  }

  object DescribeReservedInstancesOfferingsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxDuration: js.UndefOr[Double] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      MaxInstanceCount: js.UndefOr[Int] = js.undefined,
      ReservedInstancesOfferingIds: js.UndefOr[ReservedInstancesOfferingIdStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      IncludeMarketplace: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      MinDuration: js.UndefOr[Double] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined): DescribeReservedInstancesOfferingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxDuration" -> MaxDuration.map { x => x.asInstanceOf[js.Any] },
        "OfferingClass" -> OfferingClass.map { x => x.asInstanceOf[js.Any] },
        "MaxInstanceCount" -> MaxInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesOfferingIds" -> ReservedInstancesOfferingIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "IncludeMarketplace" -> IncludeMarketplace.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "MinDuration" -> MinDuration.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "InstanceTenancy" -> InstanceTenancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesOfferingsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeReservedInstancesOfferings.</p>
   */
  @js.native
  trait DescribeReservedInstancesOfferingsResult extends js.Object {
    var ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeReservedInstancesOfferingsResult {
    def apply(
      ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeReservedInstancesOfferingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesOfferings" -> ReservedInstancesOfferings.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesOfferingsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstances.</p>
   */
  @js.native
  trait DescribeReservedInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var Filters: js.UndefOr[FilterList]
    var ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList]
  }

  object DescribeReservedInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList] = js.undefined): DescribeReservedInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "OfferingClass" -> OfferingClass.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesIds" -> ReservedInstancesIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeReservedInstances.</p>
   */
  @js.native
  trait DescribeReservedInstancesResult extends js.Object {
    var ReservedInstances: js.UndefOr[ReservedInstancesList]
  }

  object DescribeReservedInstancesResult {
    def apply(
      ReservedInstances: js.UndefOr[ReservedInstancesList] = js.undefined): DescribeReservedInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstances" -> ReservedInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesResult]
    }
  }

  @js.native
  trait DescribeRouteTablesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var RouteTableIds: js.UndefOr[ValueStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeRouteTablesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      RouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeRouteTablesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "RouteTableIds" -> RouteTableIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRouteTablesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeRouteTables.</p>
   */
  @js.native
  trait DescribeRouteTablesResult extends js.Object {
    var RouteTables: js.UndefOr[RouteTableList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeRouteTablesResult {
    def apply(
      RouteTables: js.UndefOr[RouteTableList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeRouteTablesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RouteTables" -> RouteTables.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRouteTablesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeScheduledInstanceAvailability.</p>
   */
  @js.native
  trait DescribeScheduledInstanceAvailabilityRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxSlotDurationInHours: js.UndefOr[Int]
    var MaxResults: js.UndefOr[Int]
    var MinSlotDurationInHours: js.UndefOr[Int]
    var FirstSlotStartTimeRange: js.UndefOr[SlotDateTimeRangeRequest]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
    var Recurrence: js.UndefOr[ScheduledInstanceRecurrenceRequest]
  }

  object DescribeScheduledInstanceAvailabilityRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxSlotDurationInHours: js.UndefOr[Int] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      MinSlotDurationInHours: js.UndefOr[Int] = js.undefined,
      FirstSlotStartTimeRange: js.UndefOr[SlotDateTimeRangeRequest] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Recurrence: js.UndefOr[ScheduledInstanceRecurrenceRequest] = js.undefined): DescribeScheduledInstanceAvailabilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxSlotDurationInHours" -> MaxSlotDurationInHours.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "MinSlotDurationInHours" -> MinSlotDurationInHours.map { x => x.asInstanceOf[js.Any] },
        "FirstSlotStartTimeRange" -> FirstSlotStartTimeRange.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstanceAvailabilityRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeScheduledInstanceAvailability.</p>
   */
  @js.native
  trait DescribeScheduledInstanceAvailabilityResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ScheduledInstanceAvailabilitySet: js.UndefOr[ScheduledInstanceAvailabilitySet]
  }

  object DescribeScheduledInstanceAvailabilityResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ScheduledInstanceAvailabilitySet: js.UndefOr[ScheduledInstanceAvailabilitySet] = js.undefined): DescribeScheduledInstanceAvailabilityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledInstanceAvailabilitySet" -> ScheduledInstanceAvailabilitySet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstanceAvailabilityResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeScheduledInstances.</p>
   */
  @js.native
  trait DescribeScheduledInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet]
    var MaxResults: js.UndefOr[Int]
    var SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeScheduledInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeScheduledInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ScheduledInstanceIds" -> ScheduledInstanceIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "SlotStartTimeRange" -> SlotStartTimeRange.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeScheduledInstances.</p>
   */
  @js.native
  trait DescribeScheduledInstancesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ScheduledInstanceSet: js.UndefOr[ScheduledInstanceSet]
  }

  object DescribeScheduledInstancesResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ScheduledInstanceSet: js.UndefOr[ScheduledInstanceSet] = js.undefined): DescribeScheduledInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledInstanceSet" -> ScheduledInstanceSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstancesResult]
    }
  }

  @js.native
  trait DescribeSecurityGroupReferencesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupId: js.UndefOr[GroupIds]
  }

  object DescribeSecurityGroupReferencesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupId: js.UndefOr[GroupIds] = js.undefined): DescribeSecurityGroupReferencesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupReferencesRequest]
    }
  }

  @js.native
  trait DescribeSecurityGroupReferencesResult extends js.Object {
    var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences]
  }

  object DescribeSecurityGroupReferencesResult {
    def apply(
      SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.undefined): DescribeSecurityGroupReferencesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupReferenceSet" -> SecurityGroupReferenceSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupReferencesResult]
    }
  }

  @js.native
  trait DescribeSecurityGroupsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var GroupNames: js.UndefOr[GroupNameStringList]
    var GroupIds: js.UndefOr[GroupIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSecurityGroupsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      GroupNames: js.UndefOr[GroupNameStringList] = js.undefined,
      GroupIds: js.UndefOr[GroupIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "GroupNames" -> GroupNames.map { x => x.asInstanceOf[js.Any] },
        "GroupIds" -> GroupIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupsRequest]
    }
  }

  @js.native
  trait DescribeSecurityGroupsResult extends js.Object {
    var SecurityGroups: js.UndefOr[SecurityGroupList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSecurityGroupsResult {
    def apply(
      SecurityGroups: js.UndefOr[SecurityGroupList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSecurityGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSnapshotAttribute.</p>
   */
  @js.native
  trait DescribeSnapshotAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[SnapshotAttributeName]
    var SnapshotId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeSnapshotAttributeRequest {
    def apply(
      Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeSnapshotAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSnapshotAttribute.</p>
   */
  @js.native
  trait DescribeSnapshotAttributeResult extends js.Object {
    var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var SnapshotId: js.UndefOr[String]
  }

  object DescribeSnapshotAttributeResult {
    def apply(
      CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined): DescribeSnapshotAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateVolumePermissions" -> CreateVolumePermissions.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSnapshots.</p>
   */
  @js.native
  trait DescribeSnapshotsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var OwnerIds: js.UndefOr[OwnerStringList]
    var MaxResults: js.UndefOr[Int]
    var RestorableByUserIds: js.UndefOr[RestorableByStringList]
    var SnapshotIds: js.UndefOr[SnapshotIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSnapshotsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      OwnerIds: js.UndefOr[OwnerStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      RestorableByUserIds: js.UndefOr[RestorableByStringList] = js.undefined,
      SnapshotIds: js.UndefOr[SnapshotIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "OwnerIds" -> OwnerIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "RestorableByUserIds" -> RestorableByUserIds.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIds" -> SnapshotIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSnapshots.</p>
   */
  @js.native
  trait DescribeSnapshotsResult extends js.Object {
    var Snapshots: js.UndefOr[SnapshotList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSnapshotsResult {
    def apply(
      Snapshots: js.UndefOr[SnapshotList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshots" -> Snapshots.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotDatafeedSubscription.</p>
   */
  @js.native
  trait DescribeSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeSpotDatafeedSubscriptionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeSpotDatafeedSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotDatafeedSubscriptionRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotDatafeedSubscription.</p>
   */
  @js.native
  trait DescribeSpotDatafeedSubscriptionResult extends js.Object {
    var SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription]
  }

  object DescribeSpotDatafeedSubscriptionResult {
    def apply(
      SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription] = js.undefined): DescribeSpotDatafeedSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotDatafeedSubscription" -> SpotDatafeedSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotDatafeedSubscriptionResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotFleetInstances.</p>
   */
  @js.native
  trait DescribeSpotFleetInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  object DescribeSpotFleetInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined): DescribeSpotFleetInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotFleetInstances.</p>
   */
  @js.native
  trait DescribeSpotFleetInstancesResponse extends js.Object {
    var ActiveInstances: js.UndefOr[ActiveInstanceSet]
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  object DescribeSpotFleetInstancesResponse {
    def apply(
      ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined): DescribeSpotFleetInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActiveInstances" -> ActiveInstances.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetInstancesResponse]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotFleetRequestHistory.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestHistoryRequest extends js.Object {
    var SpotFleetRequestId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var EventType: js.UndefOr[EventType]
    var StartTime: js.UndefOr[DateTime]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSpotFleetRequestHistoryRequest {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      EventType: js.UndefOr[EventType] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSpotFleetRequestHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestHistoryRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotFleetRequestHistory.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestHistoryResponse extends js.Object {
    var LastEvaluatedTime: js.UndefOr[DateTime]
    var SpotFleetRequestId: js.UndefOr[String]
    var HistoryRecords: js.UndefOr[HistoryRecords]
    var StartTime: js.UndefOr[DateTime]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSpotFleetRequestHistoryResponse {
    def apply(
      LastEvaluatedTime: js.UndefOr[DateTime] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      HistoryRecords: js.UndefOr[HistoryRecords] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSpotFleetRequestHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastEvaluatedTime" -> LastEvaluatedTime.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] },
        "HistoryRecords" -> HistoryRecords.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestHistoryResponse]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotFleetRequests.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestIds: js.UndefOr[ValueStringList]
  }

  object DescribeSpotFleetRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      SpotFleetRequestIds: js.UndefOr[ValueStringList] = js.undefined): DescribeSpotFleetRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestIds" -> SpotFleetRequestIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotFleetRequests.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet]
  }

  object DescribeSpotFleetRequestsResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet] = js.undefined): DescribeSpotFleetRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestConfigs" -> SpotFleetRequestConfigs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestsResponse]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotInstanceRequests.</p>
   */
  @js.native
  trait DescribeSpotInstanceRequestsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
    var SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList]
  }

  object DescribeSpotInstanceRequestsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList] = js.undefined): DescribeSpotInstanceRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceRequestIds" -> SpotInstanceRequestIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotInstanceRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotInstanceRequests.</p>
   */
  @js.native
  trait DescribeSpotInstanceRequestsResult extends js.Object {
    var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList]
  }

  object DescribeSpotInstanceRequestsResult {
    def apply(
      SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined): DescribeSpotInstanceRequestsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotInstanceRequests" -> SpotInstanceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotInstanceRequestsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotPriceHistory.</p>
   */
  @js.native
  trait DescribeSpotPriceHistoryRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InstanceTypes: js.UndefOr[InstanceTypeList]
    var MaxResults: js.UndefOr[Int]
    var StartTime: js.UndefOr[DateTime]
    var EndTime: js.UndefOr[DateTime]
    var AvailabilityZone: js.UndefOr[String]
    var ProductDescriptions: js.UndefOr[ProductDescriptionList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeSpotPriceHistoryRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceTypes: js.UndefOr[InstanceTypeList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ProductDescriptions: js.UndefOr[ProductDescriptionList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeSpotPriceHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceTypes" -> InstanceTypes.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ProductDescriptions" -> ProductDescriptions.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotPriceHistoryRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotPriceHistory.</p>
   */
  @js.native
  trait DescribeSpotPriceHistoryResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SpotPriceHistory: js.UndefOr[SpotPriceHistoryList]
  }

  object DescribeSpotPriceHistoryResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      SpotPriceHistory: js.UndefOr[SpotPriceHistoryList] = js.undefined): DescribeSpotPriceHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SpotPriceHistory" -> SpotPriceHistory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotPriceHistoryResult]
    }
  }

  @js.native
  trait DescribeStaleSecurityGroupsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var VpcId: js.UndefOr[String]
  }

  object DescribeStaleSecurityGroupsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DescribeStaleSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStaleSecurityGroupsRequest]
    }
  }

  @js.native
  trait DescribeStaleSecurityGroupsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var StaleSecurityGroupSet: js.UndefOr[StaleSecurityGroupSet]
  }

  object DescribeStaleSecurityGroupsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      StaleSecurityGroupSet: js.UndefOr[StaleSecurityGroupSet] = js.undefined): DescribeStaleSecurityGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StaleSecurityGroupSet" -> StaleSecurityGroupSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStaleSecurityGroupsResult]
    }
  }

  @js.native
  trait DescribeSubnetsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SubnetIds: js.UndefOr[SubnetIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeSubnetsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeSubnetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubnetsRequest]
    }
  }

  @js.native
  trait DescribeSubnetsResult extends js.Object {
    var Subnets: js.UndefOr[SubnetList]
  }

  object DescribeSubnetsResult {
    def apply(
      Subnets: js.UndefOr[SubnetList] = js.undefined): DescribeSubnetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubnetsResult]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeTagsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagDescriptionList]
  }

  object DescribeTagsResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagDescriptionList] = js.undefined): DescribeTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVolumeAttribute.</p>
   */
  @js.native
  trait DescribeVolumeAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[VolumeAttributeName]
    var VolumeId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeVolumeAttributeRequest {
    def apply(
      Attribute: js.UndefOr[VolumeAttributeName] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVolumeAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVolumeAttribute.</p>
   */
  @js.native
  trait DescribeVolumeAttributeResult extends js.Object {
    var AutoEnableIO: js.UndefOr[AttributeBooleanValue]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var VolumeId: js.UndefOr[String]
  }

  object DescribeVolumeAttributeResult {
    def apply(
      AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined): DescribeVolumeAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoEnableIO" -> AutoEnableIO.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVolumeStatus.</p>
   */
  @js.native
  trait DescribeVolumeStatusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var VolumeIds: js.UndefOr[VolumeIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVolumeStatusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVolumeStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "VolumeIds" -> VolumeIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeStatusRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVolumeStatus.</p>
   */
  @js.native
  trait DescribeVolumeStatusResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var VolumeStatuses: js.UndefOr[VolumeStatusList]
  }

  object DescribeVolumeStatusResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      VolumeStatuses: js.UndefOr[VolumeStatusList] = js.undefined): DescribeVolumeStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "VolumeStatuses" -> VolumeStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeStatusResult]
    }
  }

  @js.native
  trait DescribeVolumesModificationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var VolumeIds: js.UndefOr[VolumeIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVolumesModificationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVolumesModificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "VolumeIds" -> VolumeIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesModificationsRequest]
    }
  }

  @js.native
  trait DescribeVolumesModificationsResult extends js.Object {
    var VolumesModifications: js.UndefOr[VolumeModificationList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVolumesModificationsResult {
    def apply(
      VolumesModifications: js.UndefOr[VolumeModificationList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVolumesModificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumesModifications" -> VolumesModifications.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesModificationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVolumes.</p>
   */
  @js.native
  trait DescribeVolumesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var VolumeIds: js.UndefOr[VolumeIdStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVolumesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVolumesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "VolumeIds" -> VolumeIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVolumes.</p>
   */
  @js.native
  trait DescribeVolumesResult extends js.Object {
    var Volumes: js.UndefOr[VolumeList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVolumesResult {
    def apply(
      Volumes: js.UndefOr[VolumeList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVolumesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Volumes" -> Volumes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesResult]
    }
  }

  @js.native
  trait DescribeVpcAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[VpcAttributeName]
    var VpcId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeVpcAttributeRequest {
    def apply(
      Attribute: js.UndefOr[VpcAttributeName] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVpcAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcAttributeRequest]
    }
  }

  @js.native
  trait DescribeVpcAttributeResult extends js.Object {
    var VpcId: js.UndefOr[String]
    var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue]
    var EnableDnsSupport: js.UndefOr[AttributeBooleanValue]
  }

  object DescribeVpcAttributeResult {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.undefined,
      EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.undefined): DescribeVpcAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "EnableDnsHostnames" -> EnableDnsHostnames.map { x => x.asInstanceOf[js.Any] },
        "EnableDnsSupport" -> EnableDnsSupport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcAttributeResult]
    }
  }

  @js.native
  trait DescribeVpcClassicLinkDnsSupportRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var VpcIds: js.UndefOr[VpcClassicLinkIdList]
  }

  object DescribeVpcClassicLinkDnsSupportRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.undefined): DescribeVpcClassicLinkDnsSupportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "VpcIds" -> VpcIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
    }
  }

  @js.native
  trait DescribeVpcClassicLinkDnsSupportResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Vpcs: js.UndefOr[ClassicLinkDnsSupportList]
  }

  object DescribeVpcClassicLinkDnsSupportResult {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.undefined): DescribeVpcClassicLinkDnsSupportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Vpcs" -> Vpcs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
    }
  }

  @js.native
  trait DescribeVpcClassicLinkRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
    var VpcIds: js.UndefOr[VpcClassicLinkIdList]
  }

  object DescribeVpcClassicLinkRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.undefined): DescribeVpcClassicLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcIds" -> VpcIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkRequest]
    }
  }

  @js.native
  trait DescribeVpcClassicLinkResult extends js.Object {
    var Vpcs: js.UndefOr[VpcClassicLinkList]
  }

  object DescribeVpcClassicLinkResult {
    def apply(
      Vpcs: js.UndefOr[VpcClassicLinkList] = js.undefined): DescribeVpcClassicLinkResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Vpcs" -> Vpcs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkResult]
    }
  }

  @js.native
  trait DescribeVpcEndpointConnectionNotificationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var ConnectionNotificationId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointConnectionNotificationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      ConnectionNotificationId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointConnectionNotificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationId" -> ConnectionNotificationId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointConnectionNotificationsRequest]
    }
  }

  @js.native
  trait DescribeVpcEndpointConnectionNotificationsResult extends js.Object {
    var ConnectionNotificationSet: js.UndefOr[ConnectionNotificationSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointConnectionNotificationsResult {
    def apply(
      ConnectionNotificationSet: js.UndefOr[ConnectionNotificationSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointConnectionNotificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionNotificationSet" -> ConnectionNotificationSet.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointConnectionNotificationsResult]
    }
  }

  @js.native
  trait DescribeVpcEndpointConnectionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointConnectionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointConnectionsRequest]
    }
  }

  @js.native
  trait DescribeVpcEndpointConnectionsResult extends js.Object {
    var VpcEndpointConnections: js.UndefOr[VpcEndpointConnectionSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointConnectionsResult {
    def apply(
      VpcEndpointConnections: js.UndefOr[VpcEndpointConnectionSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcEndpointConnections" -> VpcEndpointConnections.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointConnectionsResult]
    }
  }

  @js.native
  trait DescribeVpcEndpointServiceConfigurationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ServiceIds: js.UndefOr[ValueStringList]
    var MaxResults: js.UndefOr[Int]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointServiceConfigurationsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceIds: js.UndefOr[ValueStringList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointServiceConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ServiceIds" -> ServiceIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServiceConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeVpcEndpointServiceConfigurationsResult extends js.Object {
    var ServiceConfigurations: js.UndefOr[ServiceConfigurationSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointServiceConfigurationsResult {
    def apply(
      ServiceConfigurations: js.UndefOr[ServiceConfigurationSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointServiceConfigurationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceConfigurations" -> ServiceConfigurations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServiceConfigurationsResult]
    }
  }

  @js.native
  trait DescribeVpcEndpointServicePermissionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var ServiceId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointServicePermissionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointServicePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServicePermissionsRequest]
    }
  }

  @js.native
  trait DescribeVpcEndpointServicePermissionsResult extends js.Object {
    var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointServicePermissionsResult {
    def apply(
      AllowedPrincipals: js.UndefOr[AllowedPrincipalSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointServicePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedPrincipals" -> AllowedPrincipals.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServicePermissionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcEndpointServices.</p>
   */
  @js.native
  trait DescribeVpcEndpointServicesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var ServiceNames: js.UndefOr[ValueStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointServicesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      ServiceNames: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ServiceNames" -> ServiceNames.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServicesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcEndpointServices.</p>
   */
  @js.native
  trait DescribeVpcEndpointServicesResult extends js.Object {
    var ServiceNames: js.UndefOr[ValueStringList]
    var ServiceDetails: js.UndefOr[ServiceDetailSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointServicesResult {
    def apply(
      ServiceNames: js.UndefOr[ValueStringList] = js.undefined,
      ServiceDetails: js.UndefOr[ServiceDetailSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointServicesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNames" -> ServiceNames.map { x => x.asInstanceOf[js.Any] },
        "ServiceDetails" -> ServiceDetails.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServicesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcEndpoints.</p>
   */
  @js.native
  trait DescribeVpcEndpointsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var VpcEndpointIds: js.UndefOr[ValueStringList]
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointIds" -> VpcEndpointIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcEndpoints.</p>
   */
  @js.native
  trait DescribeVpcEndpointsResult extends js.Object {
    var VpcEndpoints: js.UndefOr[VpcEndpointSet]
    var NextToken: js.UndefOr[String]
  }

  object DescribeVpcEndpointsResult {
    def apply(
      VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeVpcEndpointsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcEndpoints" -> VpcEndpoints.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointsResult]
    }
  }

  @js.native
  trait DescribeVpcPeeringConnectionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var DryRun: js.UndefOr[Boolean]
    var VpcPeeringConnectionIds: js.UndefOr[ValueStringList]
  }

  object DescribeVpcPeeringConnectionsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionIds: js.UndefOr[ValueStringList] = js.undefined): DescribeVpcPeeringConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionIds" -> VpcPeeringConnectionIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsRequest]
    }
  }

  @js.native
  trait DescribeVpcPeeringConnectionsResult extends js.Object {
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList]
  }

  object DescribeVpcPeeringConnectionsResult {
    def apply(
      VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined): DescribeVpcPeeringConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringConnections" -> VpcPeeringConnections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsResult]
    }
  }

  @js.native
  trait DescribeVpcsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var VpcIds: js.UndefOr[VpcIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeVpcsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      VpcIds: js.UndefOr[VpcIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVpcsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "VpcIds" -> VpcIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcsRequest]
    }
  }

  @js.native
  trait DescribeVpcsResult extends js.Object {
    var Vpcs: js.UndefOr[VpcList]
  }

  object DescribeVpcsResult {
    def apply(
      Vpcs: js.UndefOr[VpcList] = js.undefined): DescribeVpcsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Vpcs" -> Vpcs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpnConnections.</p>
   */
  @js.native
  trait DescribeVpnConnectionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeVpnConnectionsRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVpnConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "VpnConnectionIds" -> VpnConnectionIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnConnectionsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpnConnections.</p>
   */
  @js.native
  trait DescribeVpnConnectionsResult extends js.Object {
    var VpnConnections: js.UndefOr[VpnConnectionList]
  }

  object DescribeVpnConnectionsResult {
    def apply(
      VpnConnections: js.UndefOr[VpnConnectionList] = js.undefined): DescribeVpnConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpnConnections" -> VpnConnections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnConnectionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpnGateways.</p>
   */
  @js.native
  trait DescribeVpnGatewaysRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var VpnGatewayIds: js.UndefOr[VpnGatewayIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object DescribeVpnGatewaysRequest {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      VpnGatewayIds: js.UndefOr[VpnGatewayIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVpnGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "VpnGatewayIds" -> VpnGatewayIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnGatewaysRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpnGateways.</p>
   */
  @js.native
  trait DescribeVpnGatewaysResult extends js.Object {
    var VpnGateways: js.UndefOr[VpnGatewayList]
  }

  object DescribeVpnGatewaysResult {
    def apply(
      VpnGateways: js.UndefOr[VpnGatewayList] = js.undefined): DescribeVpnGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpnGateways" -> VpnGateways.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnGatewaysResult]
    }
  }

  @js.native
  trait DetachClassicLinkVpcRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DetachClassicLinkVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DetachClassicLinkVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachClassicLinkVpcRequest]
    }
  }

  @js.native
  trait DetachClassicLinkVpcResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object DetachClassicLinkVpcResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): DetachClassicLinkVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachClassicLinkVpcResult]
    }
  }

  @js.native
  trait DetachInternetGatewayRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InternetGatewayId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DetachInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DetachInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InternetGatewayId" -> InternetGatewayId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInternetGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for DetachNetworkInterface.</p>
   */
  @js.native
  trait DetachNetworkInterfaceRequest extends js.Object {
    var AttachmentId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
  }

  object DetachNetworkInterfaceRequest {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined): DetachNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachmentId" -> AttachmentId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the parameters for DetachVolume.</p>
   */
  @js.native
  trait DetachVolumeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
    var Device: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  object DetachVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined,
      Device: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): DetachVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] },
        "Device" -> Device.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachVolumeRequest]
    }
  }

  /**
   * <p>Contains the parameters for DetachVpnGateway.</p>
   */
  @js.native
  trait DetachVpnGatewayRequest extends js.Object {
    var VpcId: js.UndefOr[String]
    var VpnGatewayId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DetachVpnGatewayRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DetachVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "VpnGatewayId" -> VpnGatewayId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachVpnGatewayRequest]
    }
  }

  object DeviceTypeEnum {
    val ebs = "ebs"
    val `instance-store` = "instance-store"

    val values = IndexedSeq(ebs, `instance-store`)
  }

  /**
   * <p>Describes a DHCP configuration option.</p>
   */
  @js.native
  trait DhcpConfiguration extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[DhcpConfigurationValueList]
  }

  object DhcpConfiguration {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[DhcpConfigurationValueList] = js.undefined): DhcpConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DhcpConfiguration]
    }
  }

  /**
   * <p>Describes a set of DHCP options.</p>
   */
  @js.native
  trait DhcpOptions extends js.Object {
    var DhcpConfigurations: js.UndefOr[DhcpConfigurationList]
    var DhcpOptionsId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object DhcpOptions {
    def apply(
      DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.undefined,
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): DhcpOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpConfigurations" -> DhcpConfigurations.map { x => x.asInstanceOf[js.Any] },
        "DhcpOptionsId" -> DhcpOptionsId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DhcpOptions]
    }
  }

  /**
   * <p>Contains the parameters for DisableVgwRoutePropagation.</p>
   */
  @js.native
  trait DisableVgwRoutePropagationRequest extends js.Object {
    var GatewayId: js.UndefOr[String]
    var RouteTableId: js.UndefOr[String]
  }

  object DisableVgwRoutePropagationRequest {
    def apply(
      GatewayId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined): DisableVgwRoutePropagationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVgwRoutePropagationRequest]
    }
  }

  @js.native
  trait DisableVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcId: js.UndefOr[String]
  }

  object DisableVpcClassicLinkDnsSupportRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined): DisableVpcClassicLinkDnsSupportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
    }
  }

  @js.native
  trait DisableVpcClassicLinkDnsSupportResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object DisableVpcClassicLinkDnsSupportResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): DisableVpcClassicLinkDnsSupportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkDnsSupportResult]
    }
  }

  @js.native
  trait DisableVpcClassicLinkRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object DisableVpcClassicLinkRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DisableVpcClassicLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkRequest]
    }
  }

  @js.native
  trait DisableVpcClassicLinkResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object DisableVpcClassicLinkResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): DisableVpcClassicLinkResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkResult]
    }
  }

  @js.native
  trait DisassociateAddressRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DisassociateAddressRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DisassociateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateAddressRequest]
    }
  }

  @js.native
  trait DisassociateIamInstanceProfileRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
  }

  object DisassociateIamInstanceProfileRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined): DisassociateIamInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateIamInstanceProfileRequest]
    }
  }

  @js.native
  trait DisassociateIamInstanceProfileResult extends js.Object {
    var IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation]
  }

  object DisassociateIamInstanceProfileResult {
    def apply(
      IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation] = js.undefined): DisassociateIamInstanceProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfileAssociation" -> IamInstanceProfileAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateIamInstanceProfileResult]
    }
  }

  @js.native
  trait DisassociateRouteTableRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object DisassociateRouteTableRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): DisassociateRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateRouteTableRequest]
    }
  }

  @js.native
  trait DisassociateSubnetCidrBlockRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
  }

  object DisassociateSubnetCidrBlockRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined): DisassociateSubnetCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSubnetCidrBlockRequest]
    }
  }

  @js.native
  trait DisassociateSubnetCidrBlockResult extends js.Object {
    var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation]
    var SubnetId: js.UndefOr[String]
  }

  object DisassociateSubnetCidrBlockResult {
    def apply(
      Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): DisassociateSubnetCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSubnetCidrBlockResult]
    }
  }

  @js.native
  trait DisassociateVpcCidrBlockRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
  }

  object DisassociateVpcCidrBlockRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined): DisassociateVpcCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVpcCidrBlockRequest]
    }
  }

  @js.native
  trait DisassociateVpcCidrBlockResult extends js.Object {
    var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation]
    var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation]
    var VpcId: js.UndefOr[String]
  }

  object DisassociateVpcCidrBlockResult {
    def apply(
      Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.undefined,
      CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DisassociateVpcCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x.asInstanceOf[js.Any] },
        "CidrBlockAssociation" -> CidrBlockAssociation.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVpcCidrBlockResult]
    }
  }

  /**
   * <p>Describes a disk image.</p>
   */
  @js.native
  trait DiskImage extends js.Object {
    var Description: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDetail]
    var Volume: js.UndefOr[VolumeDetail]
  }

  object DiskImage {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDetail] = js.undefined,
      Volume: js.UndefOr[VolumeDetail] = js.undefined): DiskImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] },
        "Volume" -> Volume.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImage]
    }
  }

  /**
   * <p>Describes a disk image.</p>
   */
  @js.native
  trait DiskImageDescription extends js.Object {
    var Checksum: js.UndefOr[String]
    var Format: js.UndefOr[DiskImageFormat]
    var ImportManifestUrl: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  object DiskImageDescription {
    def apply(
      Checksum: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[DiskImageFormat] = js.undefined,
      ImportManifestUrl: js.UndefOr[String] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined): DiskImageDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Checksum" -> Checksum.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "ImportManifestUrl" -> ImportManifestUrl.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImageDescription]
    }
  }

  /**
   * <p>Describes a disk image.</p>
   */
  @js.native
  trait DiskImageDetail extends js.Object {
    var Bytes: js.UndefOr[Double]
    var Format: js.UndefOr[DiskImageFormat]
    var ImportManifestUrl: js.UndefOr[String]
  }

  object DiskImageDetail {
    def apply(
      Bytes: js.UndefOr[Double] = js.undefined,
      Format: js.UndefOr[DiskImageFormat] = js.undefined,
      ImportManifestUrl: js.UndefOr[String] = js.undefined): DiskImageDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bytes" -> Bytes.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "ImportManifestUrl" -> ImportManifestUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImageDetail]
    }
  }

  object DiskImageFormatEnum {
    val VMDK = "VMDK"
    val RAW = "RAW"
    val VHD = "VHD"

    val values = IndexedSeq(VMDK, RAW, VHD)
  }

  /**
   * <p>Describes a disk image volume.</p>
   */
  @js.native
  trait DiskImageVolumeDescription extends js.Object {
    var Id: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  object DiskImageVolumeDescription {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined): DiskImageVolumeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImageVolumeDescription]
    }
  }

  /**
   * <p>Describes a DNS entry.</p>
   */
  @js.native
  trait DnsEntry extends js.Object {
    var DnsName: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
  }

  object DnsEntry {
    def apply(
      DnsName: js.UndefOr[String] = js.undefined,
      HostedZoneId: js.UndefOr[String] = js.undefined): DnsEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DnsName" -> DnsName.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsEntry]
    }
  }

  object DomainTypeEnum {
    val vpc = "vpc"
    val standard = "standard"

    val values = IndexedSeq(vpc, standard)
  }

  /**
   * <p>Describes a block device for an EBS volume.</p>
   */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var SnapshotId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var VolumeSize: js.UndefOr[Int]
    var Iops: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
  }

  object EbsBlockDevice {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      VolumeSize: js.UndefOr[Int] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined): EbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDevice]
    }
  }

  /**
   * <p>Describes a parameter used to set up an EBS volume in a block device mapping.</p>
   */
  @js.native
  trait EbsInstanceBlockDevice extends js.Object {
    var AttachTime: js.UndefOr[DateTime]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Status: js.UndefOr[AttachmentStatus]
    var VolumeId: js.UndefOr[String]
  }

  object EbsInstanceBlockDevice {
    def apply(
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      Status: js.UndefOr[AttachmentStatus] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined): EbsInstanceBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachTime" -> AttachTime.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsInstanceBlockDevice]
    }
  }

  /**
   * <p>Describes information used to set up an EBS volume specified in a block device mapping.</p>
   */
  @js.native
  trait EbsInstanceBlockDeviceSpecification extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var VolumeId: js.UndefOr[String]
  }

  object EbsInstanceBlockDeviceSpecification {
    def apply(
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined): EbsInstanceBlockDeviceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsInstanceBlockDeviceSpecification]
    }
  }

  /**
   * <p>Describes an egress-only internet gateway.</p>
   */
  @js.native
  trait EgressOnlyInternetGateway extends js.Object {
    var Attachments: js.UndefOr[InternetGatewayAttachmentList]
    var EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId]
  }

  object EgressOnlyInternetGateway {
    def apply(
      Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId] = js.undefined): EgressOnlyInternetGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attachments" -> Attachments.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EgressOnlyInternetGateway]
    }
  }

  /**
   * <p>Describes the association between an instance and an Elastic GPU.</p>
   */
  @js.native
  trait ElasticGpuAssociation extends js.Object {
    var ElasticGpuId: js.UndefOr[String]
    var ElasticGpuAssociationId: js.UndefOr[String]
    var ElasticGpuAssociationState: js.UndefOr[String]
    var ElasticGpuAssociationTime: js.UndefOr[String]
  }

  object ElasticGpuAssociation {
    def apply(
      ElasticGpuId: js.UndefOr[String] = js.undefined,
      ElasticGpuAssociationId: js.UndefOr[String] = js.undefined,
      ElasticGpuAssociationState: js.UndefOr[String] = js.undefined,
      ElasticGpuAssociationTime: js.UndefOr[String] = js.undefined): ElasticGpuAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticGpuId" -> ElasticGpuId.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuAssociationId" -> ElasticGpuAssociationId.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuAssociationState" -> ElasticGpuAssociationState.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuAssociationTime" -> ElasticGpuAssociationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticGpuAssociation]
    }
  }

  /**
   * <p>Describes the status of an Elastic GPU.</p>
   */
  @js.native
  trait ElasticGpuHealth extends js.Object {
    var Status: js.UndefOr[ElasticGpuStatus]
  }

  object ElasticGpuHealth {
    def apply(
      Status: js.UndefOr[ElasticGpuStatus] = js.undefined): ElasticGpuHealth = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticGpuHealth]
    }
  }

  /**
   * <p>A specification for an Elastic GPU.</p>
   */
  @js.native
  trait ElasticGpuSpecification extends js.Object {
    var Type: js.UndefOr[String]
  }

  object ElasticGpuSpecification {
    def apply(
      Type: js.UndefOr[String] = js.undefined): ElasticGpuSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticGpuSpecification]
    }
  }

  /**
   * <p>Describes an elastic GPU.</p>
   */
  @js.native
  trait ElasticGpuSpecificationResponse extends js.Object {
    var Type: js.UndefOr[String]
  }

  object ElasticGpuSpecificationResponse {
    def apply(
      Type: js.UndefOr[String] = js.undefined): ElasticGpuSpecificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticGpuSpecificationResponse]
    }
  }

  object ElasticGpuStateEnum {
    val ATTACHED = "ATTACHED"

    val values = IndexedSeq(ATTACHED)
  }

  object ElasticGpuStatusEnum {
    val OK = "OK"
    val IMPAIRED = "IMPAIRED"

    val values = IndexedSeq(OK, IMPAIRED)
  }

  /**
   * <p>Describes an Elastic GPU.</p>
   */
  @js.native
  trait ElasticGpus extends js.Object {
    var ElasticGpuType: js.UndefOr[String]
    var ElasticGpuId: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var ElasticGpuState: js.UndefOr[ElasticGpuState]
    var ElasticGpuHealth: js.UndefOr[ElasticGpuHealth]
    var InstanceId: js.UndefOr[String]
  }

  object ElasticGpus {
    def apply(
      ElasticGpuType: js.UndefOr[String] = js.undefined,
      ElasticGpuId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ElasticGpuState: js.UndefOr[ElasticGpuState] = js.undefined,
      ElasticGpuHealth: js.UndefOr[ElasticGpuHealth] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): ElasticGpus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticGpuType" -> ElasticGpuType.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuId" -> ElasticGpuId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuState" -> ElasticGpuState.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuHealth" -> ElasticGpuHealth.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticGpus]
    }
  }

  /**
   * <p>Contains the parameters for EnableVgwRoutePropagation.</p>
   */
  @js.native
  trait EnableVgwRoutePropagationRequest extends js.Object {
    var GatewayId: js.UndefOr[String]
    var RouteTableId: js.UndefOr[String]
  }

  object EnableVgwRoutePropagationRequest {
    def apply(
      GatewayId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined): EnableVgwRoutePropagationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVgwRoutePropagationRequest]
    }
  }

  /**
   * <p>Contains the parameters for EnableVolumeIO.</p>
   */
  @js.native
  trait EnableVolumeIORequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VolumeId: js.UndefOr[String]
  }

  object EnableVolumeIORequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined): EnableVolumeIORequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVolumeIORequest]
    }
  }

  @js.native
  trait EnableVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcId: js.UndefOr[String]
  }

  object EnableVpcClassicLinkDnsSupportRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined): EnableVpcClassicLinkDnsSupportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkDnsSupportRequest]
    }
  }

  @js.native
  trait EnableVpcClassicLinkDnsSupportResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object EnableVpcClassicLinkDnsSupportResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): EnableVpcClassicLinkDnsSupportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkDnsSupportResult]
    }
  }

  @js.native
  trait EnableVpcClassicLinkRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object EnableVpcClassicLinkRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): EnableVpcClassicLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkRequest]
    }
  }

  @js.native
  trait EnableVpcClassicLinkResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object EnableVpcClassicLinkResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): EnableVpcClassicLinkResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkResult]
    }
  }

  object EndDateTypeEnum {
    val unlimited = "unlimited"
    val limited = "limited"

    val values = IndexedSeq(unlimited, limited)
  }

  object EventCodeEnum {
    val `instance-reboot` = "instance-reboot"
    val `system-reboot` = "system-reboot"
    val `system-maintenance` = "system-maintenance"
    val `instance-retirement` = "instance-retirement"
    val `instance-stop` = "instance-stop"

    val values = IndexedSeq(`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
  }

  /**
   * <p>Describes a Spot Fleet event.</p>
   */
  @js.native
  trait EventInformation extends js.Object {
    var EventDescription: js.UndefOr[String]
    var EventSubType: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  object EventInformation {
    def apply(
      EventDescription: js.UndefOr[String] = js.undefined,
      EventSubType: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): EventInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventDescription" -> EventDescription.map { x => x.asInstanceOf[js.Any] },
        "EventSubType" -> EventSubType.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventInformation]
    }
  }

  object EventTypeEnum {
    val instanceChange = "instanceChange"
    val fleetRequestChange = "fleetRequestChange"
    val error = "error"

    val values = IndexedSeq(instanceChange, fleetRequestChange, error)
  }

  object ExcessCapacityTerminationPolicyEnum {
    val noTermination = "noTermination"
    val default = "default"

    val values = IndexedSeq(noTermination, default)
  }

  object ExportEnvironmentEnum {
    val citrix = "citrix"
    val vmware = "vmware"
    val microsoft = "microsoft"

    val values = IndexedSeq(citrix, vmware, microsoft)
  }

  /**
   * <p>Describes an instance export task.</p>
   */
  @js.native
  trait ExportTask extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var ExportToS3Task: js.UndefOr[ExportToS3Task]
    var Description: js.UndefOr[String]
    var InstanceExportDetails: js.UndefOr[InstanceExportDetails]
    var State: js.UndefOr[ExportTaskState]
    var ExportTaskId: js.UndefOr[String]
  }

  object ExportTask {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ExportToS3Task: js.UndefOr[ExportToS3Task] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      InstanceExportDetails: js.UndefOr[InstanceExportDetails] = js.undefined,
      State: js.UndefOr[ExportTaskState] = js.undefined,
      ExportTaskId: js.UndefOr[String] = js.undefined): ExportTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ExportToS3Task" -> ExportToS3Task.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InstanceExportDetails" -> InstanceExportDetails.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ExportTaskId" -> ExportTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTask]
    }
  }

  object ExportTaskStateEnum {
    val active = "active"
    val cancelling = "cancelling"
    val cancelled = "cancelled"
    val completed = "completed"

    val values = IndexedSeq(active, cancelling, cancelled, completed)
  }

  /**
   * <p>Describes the format and location for an instance export task.</p>
   */
  @js.native
  trait ExportToS3Task extends js.Object {
    var ContainerFormat: js.UndefOr[ContainerFormat]
    var DiskImageFormat: js.UndefOr[DiskImageFormat]
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  object ExportToS3Task {
    def apply(
      ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined,
      DiskImageFormat: js.UndefOr[DiskImageFormat] = js.undefined,
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined): ExportToS3Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerFormat" -> ContainerFormat.map { x => x.asInstanceOf[js.Any] },
        "DiskImageFormat" -> DiskImageFormat.map { x => x.asInstanceOf[js.Any] },
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportToS3Task]
    }
  }

  /**
   * <p>Describes an instance export task.</p>
   */
  @js.native
  trait ExportToS3TaskSpecification extends js.Object {
    var ContainerFormat: js.UndefOr[ContainerFormat]
    var DiskImageFormat: js.UndefOr[DiskImageFormat]
    var S3Bucket: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
  }

  object ExportToS3TaskSpecification {
    def apply(
      ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined,
      DiskImageFormat: js.UndefOr[DiskImageFormat] = js.undefined,
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Prefix: js.UndefOr[String] = js.undefined): ExportToS3TaskSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerFormat" -> ContainerFormat.map { x => x.asInstanceOf[js.Any] },
        "DiskImageFormat" -> DiskImageFormat.map { x => x.asInstanceOf[js.Any] },
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "S3Prefix" -> S3Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportToS3TaskSpecification]
    }
  }

  /**
   * <p>A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs. The filters supported by a describe operation are documented with the describe operation. For example:</p> <ul> <li> <p> <a>DescribeAvailabilityZones</a> </p> </li> <li> <p> <a>DescribeImages</a> </p> </li> <li> <p> <a>DescribeInstances</a> </p> </li> <li> <p> <a>DescribeKeyPairs</a> </p> </li> <li> <p> <a>DescribeSecurityGroups</a> </p> </li> <li> <p> <a>DescribeSnapshots</a> </p> </li> <li> <p> <a>DescribeSubnets</a> </p> </li> <li> <p> <a>DescribeTags</a> </p> </li> <li> <p> <a>DescribeVolumes</a> </p> </li> <li> <p> <a>DescribeVpcs</a> </p> </li> </ul>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[String]
    var Values: js.UndefOr[ValueStringList]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[ValueStringList] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  object FleetActivityStatusEnum {
    val error = "error"
    val `pending-fulfillment` = "pending-fulfillment"
    val `pending-termination` = "pending-termination"
    val fulfilled = "fulfilled"

    val values = IndexedSeq(error, `pending-fulfillment`, `pending-termination`, fulfilled)
  }

  /**
   * <p>Describes an EC2 Fleet.</p>
   */
  @js.native
  trait FleetData extends js.Object {
    var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy]
    var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList]
    var SpotOptions: js.UndefOr[SpotOptions]
    var ClientToken: js.UndefOr[String]
    var ReplaceUnhealthyInstances: js.UndefOr[Boolean]
    var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecification]
    var ValidUntil: js.UndefOr[DateTime]
    var TerminateInstancesWithExpiration: js.UndefOr[Boolean]
    var OnDemandOptions: js.UndefOr[OnDemandOptions]
    var Instances: js.UndefOr[DescribeFleetsInstancesSet]
    var Errors: js.UndefOr[DescribeFleetsErrorSet]
    var Tags: js.UndefOr[TagList]
    var ActivityStatus: js.UndefOr[FleetActivityStatus]
    var ValidFrom: js.UndefOr[DateTime]
    var FleetState: js.UndefOr[FleetStateCode]
    var FulfilledCapacity: js.UndefOr[Double]
    var CreateTime: js.UndefOr[DateTime]
    var FleetId: js.UndefOr[FleetIdentifier]
    var FulfilledOnDemandCapacity: js.UndefOr[Double]
    var Type: js.UndefOr[FleetType]
  }

  object FleetData {
    def apply(
      ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined,
      LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList] = js.undefined,
      SpotOptions: js.UndefOr[SpotOptions] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined,
      TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecification] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
      OnDemandOptions: js.UndefOr[OnDemandOptions] = js.undefined,
      Instances: js.UndefOr[DescribeFleetsInstancesSet] = js.undefined,
      Errors: js.UndefOr[DescribeFleetsErrorSet] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ActivityStatus: js.UndefOr[FleetActivityStatus] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      FleetState: js.UndefOr[FleetStateCode] = js.undefined,
      FulfilledCapacity: js.UndefOr[Double] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined,
      FulfilledOnDemandCapacity: js.UndefOr[Double] = js.undefined,
      Type: js.UndefOr[FleetType] = js.undefined): FleetData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateConfigs" -> LaunchTemplateConfigs.map { x => x.asInstanceOf[js.Any] },
        "SpotOptions" -> SpotOptions.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "ReplaceUnhealthyInstances" -> ReplaceUnhealthyInstances.map { x => x.asInstanceOf[js.Any] },
        "TargetCapacitySpecification" -> TargetCapacitySpecification.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "TerminateInstancesWithExpiration" -> TerminateInstancesWithExpiration.map { x => x.asInstanceOf[js.Any] },
        "OnDemandOptions" -> OnDemandOptions.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "Errors" -> Errors.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ActivityStatus" -> ActivityStatus.map { x => x.asInstanceOf[js.Any] },
        "ValidFrom" -> ValidFrom.map { x => x.asInstanceOf[js.Any] },
        "FleetState" -> FleetState.map { x => x.asInstanceOf[js.Any] },
        "FulfilledCapacity" -> FulfilledCapacity.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "FulfilledOnDemandCapacity" -> FulfilledOnDemandCapacity.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetData]
    }
  }

  object FleetEventTypeEnum {
    val `instance-change` = "instance-change"
    val `fleet-change` = "fleet-change"
    val `service-error` = "service-error"

    val values = IndexedSeq(`instance-change`, `fleet-change`, `service-error`)
  }

  object FleetExcessCapacityTerminationPolicyEnum {
    val `no-termination` = "no-termination"
    val termination = "termination"

    val values = IndexedSeq(`no-termination`, termination)
  }

  /**
   * <p>Describes a launch template and overrides.</p>
   */
  @js.native
  trait FleetLaunchTemplateConfig extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification]
    var Overrides: js.UndefOr[FleetLaunchTemplateOverridesList]
  }

  object FleetLaunchTemplateConfig {
    def apply(
      LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined,
      Overrides: js.UndefOr[FleetLaunchTemplateOverridesList] = js.undefined): FleetLaunchTemplateConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateSpecification" -> LaunchTemplateSpecification.map { x => x.asInstanceOf[js.Any] },
        "Overrides" -> Overrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetLaunchTemplateConfig]
    }
  }

  /**
   * <p>Describes a launch template and overrides.</p>
   */
  @js.native
  trait FleetLaunchTemplateConfigRequest extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest]
    var Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest]
  }

  object FleetLaunchTemplateConfigRequest {
    def apply(
      LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest] = js.undefined,
      Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest] = js.undefined): FleetLaunchTemplateConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateSpecification" -> LaunchTemplateSpecification.map { x => x.asInstanceOf[js.Any] },
        "Overrides" -> Overrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetLaunchTemplateConfigRequest]
    }
  }

  /**
   * <p>Describes overrides for a launch template.</p>
   */
  @js.native
  trait FleetLaunchTemplateOverrides extends js.Object {
    var WeightedCapacity: js.UndefOr[Double]
    var Placement: js.UndefOr[PlacementResponse]
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Priority: js.UndefOr[Double]
    var MaxPrice: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object FleetLaunchTemplateOverrides {
    def apply(
      WeightedCapacity: js.UndefOr[Double] = js.undefined,
      Placement: js.UndefOr[PlacementResponse] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Priority: js.UndefOr[Double] = js.undefined,
      MaxPrice: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): FleetLaunchTemplateOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeightedCapacity" -> WeightedCapacity.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "MaxPrice" -> MaxPrice.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetLaunchTemplateOverrides]
    }
  }

  /**
   * <p>Describes overrides for a launch template.</p>
   */
  @js.native
  trait FleetLaunchTemplateOverridesRequest extends js.Object {
    var WeightedCapacity: js.UndefOr[Double]
    var Placement: js.UndefOr[Placement]
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Priority: js.UndefOr[Double]
    var MaxPrice: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object FleetLaunchTemplateOverridesRequest {
    def apply(
      WeightedCapacity: js.UndefOr[Double] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Priority: js.UndefOr[Double] = js.undefined,
      MaxPrice: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): FleetLaunchTemplateOverridesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeightedCapacity" -> WeightedCapacity.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "MaxPrice" -> MaxPrice.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetLaunchTemplateOverridesRequest]
    }
  }

  /**
   * <p>Describes a launch template.</p>
   */
  @js.native
  trait FleetLaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[String]
  }

  object FleetLaunchTemplateSpecification {
    def apply(
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      Version: js.UndefOr[String] = js.undefined): FleetLaunchTemplateSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetLaunchTemplateSpecification]
    }
  }

  /**
   * <p>The launch template to use. You must specify either the launch template ID or launch template name in the request. </p>
   */
  @js.native
  trait FleetLaunchTemplateSpecificationRequest extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[String]
  }

  object FleetLaunchTemplateSpecificationRequest {
    def apply(
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      Version: js.UndefOr[String] = js.undefined): FleetLaunchTemplateSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetLaunchTemplateSpecificationRequest]
    }
  }

  object FleetOnDemandAllocationStrategyEnum {
    val `lowest-price` = "lowest-price"
    val prioritized = "prioritized"

    val values = IndexedSeq(`lowest-price`, prioritized)
  }

  object FleetStateCodeEnum {
    val submitted = "submitted"
    val active = "active"
    val deleted = "deleted"
    val failed = "failed"
    val `deleted-running` = "deleted-running"
    val `deleted-terminating` = "deleted-terminating"
    val modifying = "modifying"

    val values = IndexedSeq(submitted, active, deleted, failed, `deleted-running`, `deleted-terminating`, modifying)
  }

  object FleetTypeEnum {
    val request = "request"
    val maintain = "maintain"
    val instant = "instant"

    val values = IndexedSeq(request, maintain, instant)
  }

  /**
   * <p>Describes a flow log.</p>
   */
  @js.native
  trait FlowLog extends js.Object {
    var FlowLogId: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var LogDestination: js.UndefOr[String]
    var LogDestinationType: js.UndefOr[LogDestinationType]
    var LogGroupName: js.UndefOr[String]
    var DeliverLogsPermissionArn: js.UndefOr[String]
    var DeliverLogsErrorMessage: js.UndefOr[String]
    var TrafficType: js.UndefOr[TrafficType]
    var FlowLogStatus: js.UndefOr[String]
    var CreationTime: js.UndefOr[DateTime]
    var DeliverLogsStatus: js.UndefOr[String]
  }

  object FlowLog {
    def apply(
      FlowLogId: js.UndefOr[String] = js.undefined,
      ResourceId: js.UndefOr[String] = js.undefined,
      LogDestination: js.UndefOr[String] = js.undefined,
      LogDestinationType: js.UndefOr[LogDestinationType] = js.undefined,
      LogGroupName: js.UndefOr[String] = js.undefined,
      DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined,
      DeliverLogsErrorMessage: js.UndefOr[String] = js.undefined,
      TrafficType: js.UndefOr[TrafficType] = js.undefined,
      FlowLogStatus: js.UndefOr[String] = js.undefined,
      CreationTime: js.UndefOr[DateTime] = js.undefined,
      DeliverLogsStatus: js.UndefOr[String] = js.undefined): FlowLog = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowLogId" -> FlowLogId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "LogDestination" -> LogDestination.map { x => x.asInstanceOf[js.Any] },
        "LogDestinationType" -> LogDestinationType.map { x => x.asInstanceOf[js.Any] },
        "LogGroupName" -> LogGroupName.map { x => x.asInstanceOf[js.Any] },
        "DeliverLogsPermissionArn" -> DeliverLogsPermissionArn.map { x => x.asInstanceOf[js.Any] },
        "DeliverLogsErrorMessage" -> DeliverLogsErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "TrafficType" -> TrafficType.map { x => x.asInstanceOf[js.Any] },
        "FlowLogStatus" -> FlowLogStatus.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "DeliverLogsStatus" -> DeliverLogsStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlowLog]
    }
  }

  object FlowLogsResourceTypeEnum {
    val VPC = "VPC"
    val Subnet = "Subnet"
    val NetworkInterface = "NetworkInterface"

    val values = IndexedSeq(VPC, Subnet, NetworkInterface)
  }

  /**
   * <p>Describes an Amazon FPGA image (AFI).</p>
   */
  @js.native
  trait FpgaImage extends js.Object {
    var OwnerAlias: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var FpgaImageId: js.UndefOr[String]
    var Public: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var ShellVersion: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var PciId: js.UndefOr[PciId]
    var CreateTime: js.UndefOr[DateTime]
    var State: js.UndefOr[FpgaImageState]
    var FpgaImageGlobalId: js.UndefOr[String]
    var UpdateTime: js.UndefOr[DateTime]
  }

  object FpgaImage {
    def apply(
      OwnerAlias: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      FpgaImageId: js.UndefOr[String] = js.undefined,
      Public: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      ShellVersion: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PciId: js.UndefOr[PciId] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[FpgaImageState] = js.undefined,
      FpgaImageGlobalId: js.UndefOr[String] = js.undefined,
      UpdateTime: js.UndefOr[DateTime] = js.undefined): FpgaImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerAlias" -> OwnerAlias.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] },
        "Public" -> Public.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "ShellVersion" -> ShellVersion.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "PciId" -> PciId.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageGlobalId" -> FpgaImageGlobalId.map { x => x.asInstanceOf[js.Any] },
        "UpdateTime" -> UpdateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FpgaImage]
    }
  }

  /**
   * <p>Describes an Amazon FPGA image (AFI) attribute.</p>
   */
  @js.native
  trait FpgaImageAttribute extends js.Object {
    var Name: js.UndefOr[String]
    var FpgaImageId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var LoadPermissions: js.UndefOr[LoadPermissionList]
  }

  object FpgaImageAttribute {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      FpgaImageId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      LoadPermissions: js.UndefOr[LoadPermissionList] = js.undefined): FpgaImageAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "LoadPermissions" -> LoadPermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FpgaImageAttribute]
    }
  }

  object FpgaImageAttributeNameEnum {
    val description = "description"
    val name = "name"
    val loadPermission = "loadPermission"
    val productCodes = "productCodes"

    val values = IndexedSeq(description, name, loadPermission, productCodes)
  }

  /**
   * <p>Describes the state of the bitstream generation process for an Amazon FPGA image (AFI).</p>
   */
  @js.native
  trait FpgaImageState extends js.Object {
    var Code: js.UndefOr[FpgaImageStateCode]
    var Message: js.UndefOr[String]
  }

  object FpgaImageState {
    def apply(
      Code: js.UndefOr[FpgaImageStateCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): FpgaImageState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FpgaImageState]
    }
  }

  object FpgaImageStateCodeEnum {
    val pending = "pending"
    val failed = "failed"
    val available = "available"
    val unavailable = "unavailable"

    val values = IndexedSeq(pending, failed, available, unavailable)
  }

  object GatewayTypeEnum {
    val `ipsec.1` = "ipsec.1"

    val values = IndexedSeq(`ipsec.1`)
  }

  /**
   * <p>Contains the parameters for GetConsoleOutput.</p>
   */
  @js.native
  trait GetConsoleOutputRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Latest: js.UndefOr[Boolean]
  }

  object GetConsoleOutputRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Latest: js.UndefOr[Boolean] = js.undefined): GetConsoleOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Latest" -> Latest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleOutputRequest]
    }
  }

  /**
   * <p>Contains the output of GetConsoleOutput.</p>
   */
  @js.native
  trait GetConsoleOutputResult extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Output: js.UndefOr[String]
    var Timestamp: js.UndefOr[DateTime]
  }

  object GetConsoleOutputResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Output: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined): GetConsoleOutputResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleOutputResult]
    }
  }

  /**
   * <p>Contains the parameters for the request.</p>
   */
  @js.native
  trait GetConsoleScreenshotRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var WakeUp: js.UndefOr[Boolean]
  }

  object GetConsoleScreenshotRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      WakeUp: js.UndefOr[Boolean] = js.undefined): GetConsoleScreenshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "WakeUp" -> WakeUp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleScreenshotRequest]
    }
  }

  /**
   * <p>Contains the output of the request.</p>
   */
  @js.native
  trait GetConsoleScreenshotResult extends js.Object {
    var ImageData: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  object GetConsoleScreenshotResult {
    def apply(
      ImageData: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): GetConsoleScreenshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageData" -> ImageData.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleScreenshotResult]
    }
  }

  @js.native
  trait GetHostReservationPurchasePreviewRequest extends js.Object {
    var HostIdSet: js.UndefOr[RequestHostIdSet]
    var OfferingId: js.UndefOr[String]
  }

  object GetHostReservationPurchasePreviewRequest {
    def apply(
      HostIdSet: js.UndefOr[RequestHostIdSet] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined): GetHostReservationPurchasePreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostIdSet" -> HostIdSet.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostReservationPurchasePreviewRequest]
    }
  }

  @js.native
  trait GetHostReservationPurchasePreviewResult extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Purchase: js.UndefOr[PurchaseSet]
    var TotalHourlyPrice: js.UndefOr[String]
    var TotalUpfrontPrice: js.UndefOr[String]
  }

  object GetHostReservationPurchasePreviewResult {
    def apply(
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Purchase: js.UndefOr[PurchaseSet] = js.undefined,
      TotalHourlyPrice: js.UndefOr[String] = js.undefined,
      TotalUpfrontPrice: js.UndefOr[String] = js.undefined): GetHostReservationPurchasePreviewResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Purchase" -> Purchase.map { x => x.asInstanceOf[js.Any] },
        "TotalHourlyPrice" -> TotalHourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "TotalUpfrontPrice" -> TotalUpfrontPrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostReservationPurchasePreviewResult]
    }
  }

  @js.native
  trait GetLaunchTemplateDataRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
  }

  object GetLaunchTemplateDataRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): GetLaunchTemplateDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLaunchTemplateDataRequest]
    }
  }

  @js.native
  trait GetLaunchTemplateDataResult extends js.Object {
    var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData]
  }

  object GetLaunchTemplateDataResult {
    def apply(
      LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.undefined): GetLaunchTemplateDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateData" -> LaunchTemplateData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLaunchTemplateDataResult]
    }
  }

  /**
   * <p>Contains the parameters for GetPasswordData.</p>
   */
  @js.native
  trait GetPasswordDataRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object GetPasswordDataRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): GetPasswordDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPasswordDataRequest]
    }
  }

  /**
   * <p>Contains the output of GetPasswordData.</p>
   */
  @js.native
  trait GetPasswordDataResult extends js.Object {
    var InstanceId: js.UndefOr[String]
    var PasswordData: js.UndefOr[String]
    var Timestamp: js.UndefOr[DateTime]
  }

  object GetPasswordDataResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      PasswordData: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined): GetPasswordDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "PasswordData" -> PasswordData.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPasswordDataResult]
    }
  }

  /**
   * <p>Contains the parameters for GetReservedInstanceExchangeQuote.</p>
   */
  @js.native
  trait GetReservedInstancesExchangeQuoteRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ReservedInstanceIds: js.UndefOr[ReservedInstanceIdSet]
    var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet]
  }

  object GetReservedInstancesExchangeQuoteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ReservedInstanceIds: js.UndefOr[ReservedInstanceIdSet] = js.undefined,
      TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.undefined): GetReservedInstancesExchangeQuoteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstanceIds" -> ReservedInstanceIds.map { x => x.asInstanceOf[js.Any] },
        "TargetConfigurations" -> TargetConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservedInstancesExchangeQuoteRequest]
    }
  }

  /**
   * <p>Contains the output of GetReservedInstancesExchangeQuote.</p>
   */
  @js.native
  trait GetReservedInstancesExchangeQuoteResult extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var TargetConfigurationValueRollup: js.UndefOr[ReservationValue]
    var ReservedInstanceValueRollup: js.UndefOr[ReservationValue]
    var ValidationFailureReason: js.UndefOr[String]
    var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet]
    var OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime]
    var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet]
    var PaymentDue: js.UndefOr[String]
    var IsValidExchange: js.UndefOr[Boolean]
  }

  object GetReservedInstancesExchangeQuoteResult {
    def apply(
      CurrencyCode: js.UndefOr[String] = js.undefined,
      TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.undefined,
      ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.undefined,
      ValidationFailureReason: js.UndefOr[String] = js.undefined,
      ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.undefined,
      OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime] = js.undefined,
      TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.undefined,
      PaymentDue: js.UndefOr[String] = js.undefined,
      IsValidExchange: js.UndefOr[Boolean] = js.undefined): GetReservedInstancesExchangeQuoteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "TargetConfigurationValueRollup" -> TargetConfigurationValueRollup.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstanceValueRollup" -> ReservedInstanceValueRollup.map { x => x.asInstanceOf[js.Any] },
        "ValidationFailureReason" -> ValidationFailureReason.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstanceValueSet" -> ReservedInstanceValueSet.map { x => x.asInstanceOf[js.Any] },
        "OutputReservedInstancesWillExpireAt" -> OutputReservedInstancesWillExpireAt.map { x => x.asInstanceOf[js.Any] },
        "TargetConfigurationValueSet" -> TargetConfigurationValueSet.map { x => x.asInstanceOf[js.Any] },
        "PaymentDue" -> PaymentDue.map { x => x.asInstanceOf[js.Any] },
        "IsValidExchange" -> IsValidExchange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservedInstancesExchangeQuoteResult]
    }
  }

  /**
   * <p>Describes a security group.</p>
   */
  @js.native
  trait GroupIdentifier extends js.Object {
    var GroupName: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
  }

  object GroupIdentifier {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined): GroupIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupIdentifier]
    }
  }

  /**
   * <p>Describes an event in the history of the Spot Fleet request.</p>
   */
  @js.native
  trait HistoryRecord extends js.Object {
    var EventInformation: js.UndefOr[EventInformation]
    var EventType: js.UndefOr[EventType]
    var Timestamp: js.UndefOr[DateTime]
  }

  object HistoryRecord {
    def apply(
      EventInformation: js.UndefOr[EventInformation] = js.undefined,
      EventType: js.UndefOr[EventType] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined): HistoryRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventInformation" -> EventInformation.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryRecord]
    }
  }

  /**
   * <p>Describes an event in the history of an EC2 Fleet.</p>
   */
  @js.native
  trait HistoryRecordEntry extends js.Object {
    var EventInformation: js.UndefOr[EventInformation]
    var EventType: js.UndefOr[FleetEventType]
    var Timestamp: js.UndefOr[DateTime]
  }

  object HistoryRecordEntry {
    def apply(
      EventInformation: js.UndefOr[EventInformation] = js.undefined,
      EventType: js.UndefOr[FleetEventType] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined): HistoryRecordEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventInformation" -> EventInformation.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryRecordEntry]
    }
  }

  /**
   * <p>Describes the properties of the Dedicated Host.</p>
   */
  @js.native
  trait Host extends js.Object {
    var HostReservationId: js.UndefOr[String]
    var AvailableCapacity: js.UndefOr[AvailableCapacity]
    var ClientToken: js.UndefOr[String]
    var ReleaseTime: js.UndefOr[DateTime]
    var HostProperties: js.UndefOr[HostProperties]
    var AvailabilityZone: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var Instances: js.UndefOr[HostInstanceList]
    var Tags: js.UndefOr[TagList]
    var State: js.UndefOr[AllocationState]
    var AllocationTime: js.UndefOr[DateTime]
    var AutoPlacement: js.UndefOr[AutoPlacement]
  }

  object Host {
    def apply(
      HostReservationId: js.UndefOr[String] = js.undefined,
      AvailableCapacity: js.UndefOr[AvailableCapacity] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      ReleaseTime: js.UndefOr[DateTime] = js.undefined,
      HostProperties: js.UndefOr[HostProperties] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined,
      Instances: js.UndefOr[HostInstanceList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      State: js.UndefOr[AllocationState] = js.undefined,
      AllocationTime: js.UndefOr[DateTime] = js.undefined,
      AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined): Host = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostReservationId" -> HostReservationId.map { x => x.asInstanceOf[js.Any] },
        "AvailableCapacity" -> AvailableCapacity.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "ReleaseTime" -> ReleaseTime.map { x => x.asInstanceOf[js.Any] },
        "HostProperties" -> HostProperties.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "HostId" -> HostId.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "AllocationTime" -> AllocationTime.map { x => x.asInstanceOf[js.Any] },
        "AutoPlacement" -> AutoPlacement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Host]
    }
  }

  /**
   * <p>Describes an instance running on a Dedicated Host.</p>
   */
  @js.native
  trait HostInstance extends js.Object {
    var InstanceId: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
  }

  object HostInstance {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined): HostInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostInstance]
    }
  }

  /**
   * <p>Details about the Dedicated Host Reservation offering.</p>
   */
  @js.native
  trait HostOffering extends js.Object {
    var PaymentOption: js.UndefOr[PaymentOption]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Int]
    var InstanceFamily: js.UndefOr[String]
    var UpfrontPrice: js.UndefOr[String]
    var HourlyPrice: js.UndefOr[String]
    var OfferingId: js.UndefOr[String]
  }

  object HostOffering {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      InstanceFamily: js.UndefOr[String] = js.undefined,
      UpfrontPrice: js.UndefOr[String] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined): HostOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "InstanceFamily" -> InstanceFamily.map { x => x.asInstanceOf[js.Any] },
        "UpfrontPrice" -> UpfrontPrice.map { x => x.asInstanceOf[js.Any] },
        "HourlyPrice" -> HourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostOffering]
    }
  }

  /**
   * <p>Describes properties of a Dedicated Host.</p>
   */
  @js.native
  trait HostProperties extends js.Object {
    var Cores: js.UndefOr[Int]
    var InstanceType: js.UndefOr[String]
    var Sockets: js.UndefOr[Int]
    var TotalVCpus: js.UndefOr[Int]
  }

  object HostProperties {
    def apply(
      Cores: js.UndefOr[Int] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      Sockets: js.UndefOr[Int] = js.undefined,
      TotalVCpus: js.UndefOr[Int] = js.undefined): HostProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cores" -> Cores.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Sockets" -> Sockets.map { x => x.asInstanceOf[js.Any] },
        "TotalVCpus" -> TotalVCpus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostProperties]
    }
  }

  /**
   * <p>Details about the Dedicated Host Reservation and associated Dedicated Hosts.</p>
   */
  @js.native
  trait HostReservation extends js.Object {
    var PaymentOption: js.UndefOr[PaymentOption]
    var HostReservationId: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Int]
    var InstanceFamily: js.UndefOr[String]
    var Start: js.UndefOr[DateTime]
    var UpfrontPrice: js.UndefOr[String]
    var HostIdSet: js.UndefOr[ResponseHostIdSet]
    var Count: js.UndefOr[Int]
    var HourlyPrice: js.UndefOr[String]
    var End: js.UndefOr[DateTime]
    var OfferingId: js.UndefOr[String]
    var State: js.UndefOr[ReservationState]
  }

  object HostReservation {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      HostReservationId: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      InstanceFamily: js.UndefOr[String] = js.undefined,
      Start: js.UndefOr[DateTime] = js.undefined,
      UpfrontPrice: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      End: js.UndefOr[DateTime] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[ReservationState] = js.undefined): HostReservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "HostReservationId" -> HostReservationId.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "InstanceFamily" -> InstanceFamily.map { x => x.asInstanceOf[js.Any] },
        "Start" -> Start.map { x => x.asInstanceOf[js.Any] },
        "UpfrontPrice" -> UpfrontPrice.map { x => x.asInstanceOf[js.Any] },
        "HostIdSet" -> HostIdSet.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "HourlyPrice" -> HourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "End" -> End.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostReservation]
    }
  }

  object HostTenancyEnum {
    val dedicated = "dedicated"
    val host = "host"

    val values = IndexedSeq(dedicated, host)
  }

  object HypervisorTypeEnum {
    val ovm = "ovm"
    val xen = "xen"

    val values = IndexedSeq(ovm, xen)
  }

  /**
   * <p>Describes an IAM instance profile.</p>
   */
  @js.native
  trait IamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
  }

  object IamInstanceProfile {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined): IamInstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IamInstanceProfile]
    }
  }

  /**
   * <p>Describes an association between an IAM instance profile and an instance.</p>
   */
  @js.native
  trait IamInstanceProfileAssociation extends js.Object {
    var Timestamp: js.UndefOr[DateTime]
    var InstanceId: js.UndefOr[String]
    var State: js.UndefOr[IamInstanceProfileAssociationState]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var AssociationId: js.UndefOr[String]
  }

  object IamInstanceProfileAssociation {
    def apply(
      Timestamp: js.UndefOr[DateTime] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[IamInstanceProfileAssociationState] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined): IamInstanceProfileAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IamInstanceProfileAssociation]
    }
  }

  object IamInstanceProfileAssociationStateEnum {
    val associating = "associating"
    val associated = "associated"
    val disassociating = "disassociating"
    val disassociated = "disassociated"

    val values = IndexedSeq(associating, associated, disassociating, disassociated)
  }

  /**
   * <p>Describes an IAM instance profile.</p>
   */
  @js.native
  trait IamInstanceProfileSpecification extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object IamInstanceProfileSpecification {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined): IamInstanceProfileSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IamInstanceProfileSpecification]
    }
  }

  /**
   * <p>Describes the ICMP type and code.</p>
   */
  @js.native
  trait IcmpTypeCode extends js.Object {
    var Code: js.UndefOr[Int]
    var Type: js.UndefOr[Int]
  }

  object IcmpTypeCode {
    def apply(
      Code: js.UndefOr[Int] = js.undefined,
      Type: js.UndefOr[Int] = js.undefined): IcmpTypeCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IcmpTypeCode]
    }
  }

  /**
   * <p>Describes the ID format for a resource.</p>
   */
  @js.native
  trait IdFormat extends js.Object {
    var Deadline: js.UndefOr[DateTime]
    var Resource: js.UndefOr[String]
    var UseLongIds: js.UndefOr[Boolean]
  }

  object IdFormat {
    def apply(
      Deadline: js.UndefOr[DateTime] = js.undefined,
      Resource: js.UndefOr[String] = js.undefined,
      UseLongIds: js.UndefOr[Boolean] = js.undefined): IdFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Deadline" -> Deadline.map { x => x.asInstanceOf[js.Any] },
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "UseLongIds" -> UseLongIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdFormat]
    }
  }

  /**
   * <p>Describes an image.</p>
   */
  @js.native
  trait Image extends js.Object {
    var CreationDate: js.UndefOr[String]
    var Architecture: js.UndefOr[ArchitectureValues]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var ImageId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var RootDeviceName: js.UndefOr[String]
    var Platform: js.UndefOr[PlatformValues]
    var Public: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var KernelId: js.UndefOr[String]
    var ImageType: js.UndefOr[ImageTypeValues]
    var EnaSupport: js.UndefOr[Boolean]
    var RootDeviceType: js.UndefOr[DeviceType]
    var OwnerId: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var Hypervisor: js.UndefOr[HypervisorType]
    var Tags: js.UndefOr[TagList]
    var ImageOwnerAlias: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[VirtualizationType]
    var StateReason: js.UndefOr[StateReason]
    var State: js.UndefOr[ImageState]
    var ImageLocation: js.UndefOr[String]
    var SriovNetSupport: js.UndefOr[String]
  }

  object Image {
    def apply(
      CreationDate: js.UndefOr[String] = js.undefined,
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RootDeviceName: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Public: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      ImageType: js.UndefOr[ImageTypeValues] = js.undefined,
      EnaSupport: js.UndefOr[Boolean] = js.undefined,
      RootDeviceType: js.UndefOr[DeviceType] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      Hypervisor: js.UndefOr[HypervisorType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ImageOwnerAlias: js.UndefOr[String] = js.undefined,
      VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined,
      StateReason: js.UndefOr[StateReason] = js.undefined,
      State: js.UndefOr[ImageState] = js.undefined,
      ImageLocation: js.UndefOr[String] = js.undefined,
      SriovNetSupport: js.UndefOr[String] = js.undefined): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RootDeviceName" -> RootDeviceName.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Public" -> Public.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "ImageType" -> ImageType.map { x => x.asInstanceOf[js.Any] },
        "EnaSupport" -> EnaSupport.map { x => x.asInstanceOf[js.Any] },
        "RootDeviceType" -> RootDeviceType.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "Hypervisor" -> Hypervisor.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ImageOwnerAlias" -> ImageOwnerAlias.map { x => x.asInstanceOf[js.Any] },
        "VirtualizationType" -> VirtualizationType.map { x => x.asInstanceOf[js.Any] },
        "StateReason" -> StateReason.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ImageLocation" -> ImageLocation.map { x => x.asInstanceOf[js.Any] },
        "SriovNetSupport" -> SriovNetSupport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  /**
   * <p>Describes an image attribute.</p>
   */
  @js.native
  trait ImageAttribute extends js.Object {
    var RamdiskId: js.UndefOr[AttributeValue]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var ImageId: js.UndefOr[String]
    var Description: js.UndefOr[AttributeValue]
    var KernelId: js.UndefOr[AttributeValue]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var LaunchPermissions: js.UndefOr[LaunchPermissionList]
    var SriovNetSupport: js.UndefOr[AttributeValue]
  }

  object ImageAttribute {
    def apply(
      RamdiskId: js.UndefOr[AttributeValue] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[AttributeValue] = js.undefined,
      KernelId: js.UndefOr[AttributeValue] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.undefined,
      SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined): ImageAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "LaunchPermissions" -> LaunchPermissions.map { x => x.asInstanceOf[js.Any] },
        "SriovNetSupport" -> SriovNetSupport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageAttribute]
    }
  }

  object ImageAttributeNameEnum {
    val description = "description"
    val kernel = "kernel"
    val ramdisk = "ramdisk"
    val launchPermission = "launchPermission"
    val productCodes = "productCodes"
    val blockDeviceMapping = "blockDeviceMapping"
    val sriovNetSupport = "sriovNetSupport"

    val values = IndexedSeq(description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport)
  }

  /**
   * <p>Describes the disk container object for an import image task.</p>
   */
  @js.native
  trait ImageDiskContainer extends js.Object {
    var Format: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucket]
    var DeviceName: js.UndefOr[String]
  }

  object ImageDiskContainer {
    def apply(
      Format: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucket] = js.undefined,
      DeviceName: js.UndefOr[String] = js.undefined): ImageDiskContainer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "UserBucket" -> UserBucket.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageDiskContainer]
    }
  }

  object ImageStateEnum {
    val pending = "pending"
    val available = "available"
    val invalid = "invalid"
    val deregistered = "deregistered"
    val transient = "transient"
    val failed = "failed"
    val error = "error"

    val values = IndexedSeq(pending, available, invalid, deregistered, transient, failed, error)
  }

  object ImageTypeValuesEnum {
    val machine = "machine"
    val kernel = "kernel"
    val ramdisk = "ramdisk"

    val values = IndexedSeq(machine, kernel, ramdisk)
  }

  /**
   * <p>Contains the parameters for ImportImage.</p>
   */
  @js.native
  trait ImportImageRequest extends js.Object {
    var Architecture: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LicenseType: js.UndefOr[String]
    var DiskContainers: js.UndefOr[ImageDiskContainerList]
    var Platform: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var ClientData: js.UndefOr[ClientData]
    var Hypervisor: js.UndefOr[String]
    var RoleName: js.UndefOr[String]
  }

  object ImportImageRequest {
    def apply(
      Architecture: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LicenseType: js.UndefOr[String] = js.undefined,
      DiskContainers: js.UndefOr[ImageDiskContainerList] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      ClientData: js.UndefOr[ClientData] = js.undefined,
      Hypervisor: js.UndefOr[String] = js.undefined,
      RoleName: js.UndefOr[String] = js.undefined): ImportImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "LicenseType" -> LicenseType.map { x => x.asInstanceOf[js.Any] },
        "DiskContainers" -> DiskContainers.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "ClientData" -> ClientData.map { x => x.asInstanceOf[js.Any] },
        "Hypervisor" -> Hypervisor.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportImageRequest]
    }
  }

  /**
   * <p>Contains the output for ImportImage.</p>
   */
  @js.native
  trait ImportImageResult extends js.Object {
    var Architecture: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var LicenseType: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var SnapshotDetails: js.UndefOr[SnapshotDetailList]
    var Encrypted: js.UndefOr[Boolean]
    var Hypervisor: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
  }

  object ImportImageResult {
    def apply(
      Architecture: js.UndefOr[String] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      LicenseType: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      Hypervisor: js.UndefOr[String] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined): ImportImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "LicenseType" -> LicenseType.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotDetails" -> SnapshotDetails.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "Hypervisor" -> Hypervisor.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskId" -> ImportTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportImageResult]
    }
  }

  /**
   * <p>Describes an import image task.</p>
   */
  @js.native
  trait ImportImageTask extends js.Object {
    var Architecture: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var LicenseType: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var SnapshotDetails: js.UndefOr[SnapshotDetailList]
    var Encrypted: js.UndefOr[Boolean]
    var Hypervisor: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
  }

  object ImportImageTask {
    def apply(
      Architecture: js.UndefOr[String] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      LicenseType: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      Hypervisor: js.UndefOr[String] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined): ImportImageTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "LicenseType" -> LicenseType.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotDetails" -> SnapshotDetails.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "Hypervisor" -> Hypervisor.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskId" -> ImportTaskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportImageTask]
    }
  }

  /**
   * <p>Describes the launch specification for VM import.</p>
   */
  @js.native
  trait ImportInstanceLaunchSpecification extends js.Object {
    var Architecture: js.UndefOr[ArchitectureValues]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var PrivateIpAddress: js.UndefOr[String]
    var Placement: js.UndefOr[Placement]
    var UserData: js.UndefOr[UserData]
    var GroupNames: js.UndefOr[SecurityGroupStringList]
    var InstanceType: js.UndefOr[InstanceType]
    var AdditionalInfo: js.UndefOr[String]
    var GroupIds: js.UndefOr[SecurityGroupIdStringList]
    var Monitoring: js.UndefOr[Boolean]
    var SubnetId: js.UndefOr[String]
  }

  object ImportInstanceLaunchSpecification {
    def apply(
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      UserData: js.UndefOr[UserData] = js.undefined,
      GroupNames: js.UndefOr[SecurityGroupStringList] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      Monitoring: js.UndefOr[Boolean] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): ImportInstanceLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "GroupNames" -> GroupNames.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AdditionalInfo" -> AdditionalInfo.map { x => x.asInstanceOf[js.Any] },
        "GroupIds" -> GroupIds.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceLaunchSpecification]
    }
  }

  /**
   * <p>Contains the parameters for ImportInstance.</p>
   */
  @js.native
  trait ImportInstanceRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Platform: js.UndefOr[PlatformValues]
    var Description: js.UndefOr[String]
    var DiskImages: js.UndefOr[DiskImageList]
    var LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification]
  }

  object ImportInstanceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DiskImages: js.UndefOr[DiskImageList] = js.undefined,
      LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification] = js.undefined): ImportInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DiskImages" -> DiskImages.map { x => x.asInstanceOf[js.Any] },
        "LaunchSpecification" -> LaunchSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceRequest]
    }
  }

  /**
   * <p>Contains the output for ImportInstance.</p>
   */
  @js.native
  trait ImportInstanceResult extends js.Object {
    var ConversionTask: js.UndefOr[ConversionTask]
  }

  object ImportInstanceResult {
    def apply(
      ConversionTask: js.UndefOr[ConversionTask] = js.undefined): ImportInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConversionTask" -> ConversionTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceResult]
    }
  }

  /**
   * <p>Describes an import instance task.</p>
   */
  @js.native
  trait ImportInstanceTaskDetails extends js.Object {
    var Description: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Platform: js.UndefOr[PlatformValues]
    var Volumes: js.UndefOr[ImportInstanceVolumeDetailSet]
  }

  object ImportInstanceTaskDetails {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Volumes: js.UndefOr[ImportInstanceVolumeDetailSet] = js.undefined): ImportInstanceTaskDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Volumes" -> Volumes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceTaskDetails]
    }
  }

  /**
   * <p>Describes an import volume task.</p>
   */
  @js.native
  trait ImportInstanceVolumeDetailItem extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var BytesConverted: js.UndefOr[Double]
    var Volume: js.UndefOr[DiskImageVolumeDescription]
    var Description: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDescription]
    var Status: js.UndefOr[String]
  }

  object ImportInstanceVolumeDetailItem {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      BytesConverted: js.UndefOr[Double] = js.undefined,
      Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDescription] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): ImportInstanceVolumeDetailItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "BytesConverted" -> BytesConverted.map { x => x.asInstanceOf[js.Any] },
        "Volume" -> Volume.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceVolumeDetailItem]
    }
  }

  @js.native
  trait ImportKeyPairRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var KeyName: js.UndefOr[String]
    var PublicKeyMaterial: js.UndefOr[Blob]
  }

  object ImportKeyPairRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      PublicKeyMaterial: js.UndefOr[Blob] = js.undefined): ImportKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "PublicKeyMaterial" -> PublicKeyMaterial.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairRequest]
    }
  }

  @js.native
  trait ImportKeyPairResult extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
  }

  object ImportKeyPairResult {
    def apply(
      KeyFingerprint: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined): ImportKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyFingerprint" -> KeyFingerprint.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairResult]
    }
  }

  /**
   * <p>Contains the parameters for ImportSnapshot.</p>
   */
  @js.native
  trait ImportSnapshotRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var DiskContainer: js.UndefOr[SnapshotDiskContainer]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var ClientData: js.UndefOr[ClientData]
    var RoleName: js.UndefOr[String]
  }

  object ImportSnapshotRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DiskContainer: js.UndefOr[SnapshotDiskContainer] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      ClientData: js.UndefOr[ClientData] = js.undefined,
      RoleName: js.UndefOr[String] = js.undefined): ImportSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "DiskContainer" -> DiskContainer.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "ClientData" -> ClientData.map { x => x.asInstanceOf[js.Any] },
        "RoleName" -> RoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSnapshotRequest]
    }
  }

  /**
   * <p>Contains the output for ImportSnapshot.</p>
   */
  @js.native
  trait ImportSnapshotResult extends js.Object {
    var Description: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
    var SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail]
  }

  object ImportSnapshotResult {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined,
      SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail] = js.undefined): ImportSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskId" -> ImportTaskId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotTaskDetail" -> SnapshotTaskDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSnapshotResult]
    }
  }

  /**
   * <p>Describes an import snapshot task.</p>
   */
  @js.native
  trait ImportSnapshotTask extends js.Object {
    var Description: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
    var SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail]
  }

  object ImportSnapshotTask {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined,
      SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail] = js.undefined): ImportSnapshotTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ImportTaskId" -> ImportTaskId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotTaskDetail" -> SnapshotTaskDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSnapshotTask]
    }
  }

  /**
   * <p>Contains the parameters for ImportVolume.</p>
   */
  @js.native
  trait ImportVolumeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Volume: js.UndefOr[VolumeDetail]
    var Description: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDetail]
  }

  object ImportVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Volume: js.UndefOr[VolumeDetail] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDetail] = js.undefined): ImportVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Volume" -> Volume.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportVolumeRequest]
    }
  }

  /**
   * <p>Contains the output for ImportVolume.</p>
   */
  @js.native
  trait ImportVolumeResult extends js.Object {
    var ConversionTask: js.UndefOr[ConversionTask]
  }

  object ImportVolumeResult {
    def apply(
      ConversionTask: js.UndefOr[ConversionTask] = js.undefined): ImportVolumeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConversionTask" -> ConversionTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportVolumeResult]
    }
  }

  /**
   * <p>Describes an import volume task.</p>
   */
  @js.native
  trait ImportVolumeTaskDetails extends js.Object {
    var BytesConverted: js.UndefOr[Double]
    var Volume: js.UndefOr[DiskImageVolumeDescription]
    var Description: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDescription]
  }

  object ImportVolumeTaskDetails {
    def apply(
      BytesConverted: js.UndefOr[Double] = js.undefined,
      Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDescription] = js.undefined): ImportVolumeTaskDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesConverted" -> BytesConverted.map { x => x.asInstanceOf[js.Any] },
        "Volume" -> Volume.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Image" -> Image.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportVolumeTaskDetails]
    }
  }

  /**
   * <p>Describes an instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var Architecture: js.UndefOr[ArchitectureValues]
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList]
    var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecificationResponse]
    var ImageId: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var RootDeviceName: js.UndefOr[String]
    var SpotInstanceRequestId: js.UndefOr[String]
    var AmiLaunchIndex: js.UndefOr[Int]
    var LaunchTime: js.UndefOr[DateTime]
    var EbsOptimized: js.UndefOr[Boolean]
    var Platform: js.UndefOr[PlatformValues]
    var Placement: js.UndefOr[Placement]
    var PrivateDnsName: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[GroupIdentifierList]
    var KernelId: js.UndefOr[String]
    var EnaSupport: js.UndefOr[Boolean]
    var ElasticGpuAssociations: js.UndefOr[ElasticGpuAssociationList]
    var RootDeviceType: js.UndefOr[DeviceType]
    var PublicIpAddress: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var KeyName: js.UndefOr[String]
    var Hypervisor: js.UndefOr[HypervisorType]
    var InstanceType: js.UndefOr[InstanceType]
    var CapacityReservationId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var PublicDnsName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var Monitoring: js.UndefOr[Monitoring]
    var VirtualizationType: js.UndefOr[VirtualizationType]
    var InstanceLifecycle: js.UndefOr[InstanceLifecycleType]
    var StateReason: js.UndefOr[StateReason]
    var SourceDestCheck: js.UndefOr[Boolean]
    var StateTransitionReason: js.UndefOr[String]
    var State: js.UndefOr[InstanceState]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var CpuOptions: js.UndefOr[CpuOptions]
    var SriovNetSupport: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object Instance {
    def apply(
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined,
      CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecificationResponse] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      RootDeviceName: js.UndefOr[String] = js.undefined,
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      AmiLaunchIndex: js.UndefOr[Int] = js.undefined,
      LaunchTime: js.UndefOr[DateTime] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      EnaSupport: js.UndefOr[Boolean] = js.undefined,
      ElasticGpuAssociations: js.UndefOr[ElasticGpuAssociationList] = js.undefined,
      RootDeviceType: js.UndefOr[DeviceType] = js.undefined,
      PublicIpAddress: js.UndefOr[String] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      Hypervisor: js.UndefOr[HypervisorType] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      CapacityReservationId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Monitoring: js.UndefOr[Monitoring] = js.undefined,
      VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined,
      InstanceLifecycle: js.UndefOr[InstanceLifecycleType] = js.undefined,
      StateReason: js.UndefOr[StateReason] = js.undefined,
      SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
      StateTransitionReason: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[InstanceState] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined,
      CpuOptions: js.UndefOr[CpuOptions] = js.undefined,
      SriovNetSupport: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationSpecification" -> CapacityReservationSpecification.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "RootDeviceName" -> RootDeviceName.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x.asInstanceOf[js.Any] },
        "AmiLaunchIndex" -> AmiLaunchIndex.map { x => x.asInstanceOf[js.Any] },
        "LaunchTime" -> LaunchTime.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "EnaSupport" -> EnaSupport.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuAssociations" -> ElasticGpuAssociations.map { x => x.asInstanceOf[js.Any] },
        "RootDeviceType" -> RootDeviceType.map { x => x.asInstanceOf[js.Any] },
        "PublicIpAddress" -> PublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "Hypervisor" -> Hypervisor.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationId" -> CapacityReservationId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "PublicDnsName" -> PublicDnsName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "VirtualizationType" -> VirtualizationType.map { x => x.asInstanceOf[js.Any] },
        "InstanceLifecycle" -> InstanceLifecycle.map { x => x.asInstanceOf[js.Any] },
        "StateReason" -> StateReason.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] },
        "StateTransitionReason" -> StateTransitionReason.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "CpuOptions" -> CpuOptions.map { x => x.asInstanceOf[js.Any] },
        "SriovNetSupport" -> SriovNetSupport.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Describes an instance attribute.</p>
   */
  @js.native
  trait InstanceAttribute extends js.Object {
    var RamdiskId: js.UndefOr[AttributeValue]
    var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue]
    var RootDeviceName: js.UndefOr[AttributeValue]
    var EbsOptimized: js.UndefOr[AttributeBooleanValue]
    var DisableApiTermination: js.UndefOr[AttributeBooleanValue]
    var UserData: js.UndefOr[AttributeValue]
    var KernelId: js.UndefOr[AttributeValue]
    var Groups: js.UndefOr[GroupIdentifierList]
    var EnaSupport: js.UndefOr[AttributeBooleanValue]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var InstanceType: js.UndefOr[AttributeValue]
    var InstanceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
    var SriovNetSupport: js.UndefOr[AttributeValue]
  }

  object InstanceAttribute {
    def apply(
      RamdiskId: js.UndefOr[AttributeValue] = js.undefined,
      BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined,
      RootDeviceName: js.UndefOr[AttributeValue] = js.undefined,
      EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined,
      DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined,
      UserData: js.UndefOr[AttributeValue] = js.undefined,
      KernelId: js.UndefOr[AttributeValue] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      InstanceType: js.UndefOr[AttributeValue] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined,
      SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined): InstanceAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x.asInstanceOf[js.Any] },
        "RootDeviceName" -> RootDeviceName.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "DisableApiTermination" -> DisableApiTermination.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "EnaSupport" -> EnaSupport.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] },
        "SriovNetSupport" -> SriovNetSupport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAttribute]
    }
  }

  object InstanceAttributeNameEnum {
    val instanceType = "instanceType"
    val kernel = "kernel"
    val ramdisk = "ramdisk"
    val userData = "userData"
    val disableApiTermination = "disableApiTermination"
    val instanceInitiatedShutdownBehavior = "instanceInitiatedShutdownBehavior"
    val rootDeviceName = "rootDeviceName"
    val blockDeviceMapping = "blockDeviceMapping"
    val productCodes = "productCodes"
    val sourceDestCheck = "sourceDestCheck"
    val groupSet = "groupSet"
    val ebsOptimized = "ebsOptimized"
    val sriovNetSupport = "sriovNetSupport"
    val enaSupport = "enaSupport"

    val values = IndexedSeq(instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized, sriovNetSupport, enaSupport)
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait InstanceBlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsInstanceBlockDevice]
  }

  object InstanceBlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsInstanceBlockDevice] = js.undefined): InstanceBlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceBlockDeviceMapping]
    }
  }

  /**
   * <p>Describes a block device mapping entry.</p>
   */
  @js.native
  trait InstanceBlockDeviceMappingSpecification extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  object InstanceBlockDeviceMappingSpecification {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined): InstanceBlockDeviceMappingSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] },
        "NoDevice" -> NoDevice.map { x => x.asInstanceOf[js.Any] },
        "VirtualName" -> VirtualName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceBlockDeviceMappingSpecification]
    }
  }

  /**
   * <p>Information about the instance type that the Dedicated Host supports.</p>
   */
  @js.native
  trait InstanceCapacity extends js.Object {
    var AvailableCapacity: js.UndefOr[Int]
    var InstanceType: js.UndefOr[String]
    var TotalCapacity: js.UndefOr[Int]
  }

  object InstanceCapacity {
    def apply(
      AvailableCapacity: js.UndefOr[Int] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      TotalCapacity: js.UndefOr[Int] = js.undefined): InstanceCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailableCapacity" -> AvailableCapacity.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "TotalCapacity" -> TotalCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCapacity]
    }
  }

  /**
   * <p>Describes a Reserved Instance listing state.</p>
   */
  @js.native
  trait InstanceCount extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var State: js.UndefOr[ListingState]
  }

  object InstanceCount {
    def apply(
      InstanceCount: js.UndefOr[Int] = js.undefined,
      State: js.UndefOr[ListingState] = js.undefined): InstanceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCount]
    }
  }

  /**
   * <p>Describes the credit option for CPU usage of a T2 or T3 instance. </p>
   */
  @js.native
  trait InstanceCreditSpecification extends js.Object {
    var InstanceId: js.UndefOr[String]
    var CpuCredits: js.UndefOr[String]
  }

  object InstanceCreditSpecification {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      CpuCredits: js.UndefOr[String] = js.undefined): InstanceCreditSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "CpuCredits" -> CpuCredits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCreditSpecification]
    }
  }

  /**
   * <p>Describes the credit option for CPU usage of a T2 or T3 instance.</p>
   */
  @js.native
  trait InstanceCreditSpecificationRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var CpuCredits: js.UndefOr[String]
  }

  object InstanceCreditSpecificationRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      CpuCredits: js.UndefOr[String] = js.undefined): InstanceCreditSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "CpuCredits" -> CpuCredits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCreditSpecificationRequest]
    }
  }

  /**
   * <p>Describes an instance to export.</p>
   */
  @js.native
  trait InstanceExportDetails extends js.Object {
    var InstanceId: js.UndefOr[String]
    var TargetEnvironment: js.UndefOr[ExportEnvironment]
  }

  object InstanceExportDetails {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      TargetEnvironment: js.UndefOr[ExportEnvironment] = js.undefined): InstanceExportDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "TargetEnvironment" -> TargetEnvironment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceExportDetails]
    }
  }

  object InstanceHealthStatusEnum {
    val healthy = "healthy"
    val unhealthy = "unhealthy"

    val values = IndexedSeq(healthy, unhealthy)
  }

  object InstanceInterruptionBehaviorEnum {
    val hibernate = "hibernate"
    val stop = "stop"
    val terminate = "terminate"

    val values = IndexedSeq(hibernate, stop, terminate)
  }

  /**
   * <p>Describes an IPv6 address.</p>
   */
  @js.native
  trait InstanceIpv6Address extends js.Object {
    var Ipv6Address: js.UndefOr[String]
  }

  object InstanceIpv6Address {
    def apply(
      Ipv6Address: js.UndefOr[String] = js.undefined): InstanceIpv6Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Address" -> Ipv6Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIpv6Address]
    }
  }

  /**
   * <p>Describes an IPv6 address.</p>
   */
  @js.native
  trait InstanceIpv6AddressRequest extends js.Object {
    var Ipv6Address: js.UndefOr[String]
  }

  object InstanceIpv6AddressRequest {
    def apply(
      Ipv6Address: js.UndefOr[String] = js.undefined): InstanceIpv6AddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Address" -> Ipv6Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIpv6AddressRequest]
    }
  }

  object InstanceLifecycleEnum {
    val spot = "spot"
    val `on-demand` = "on-demand"

    val values = IndexedSeq(spot, `on-demand`)
  }

  object InstanceLifecycleTypeEnum {
    val spot = "spot"
    val scheduled = "scheduled"

    val values = IndexedSeq(spot, scheduled)
  }

  /**
   * <p>Describes the market (purchasing) option for the instances.</p>
   */
  @js.native
  trait InstanceMarketOptionsRequest extends js.Object {
    var MarketType: js.UndefOr[MarketType]
    var SpotOptions: js.UndefOr[SpotMarketOptions]
  }

  object InstanceMarketOptionsRequest {
    def apply(
      MarketType: js.UndefOr[MarketType] = js.undefined,
      SpotOptions: js.UndefOr[SpotMarketOptions] = js.undefined): InstanceMarketOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MarketType" -> MarketType.map { x => x.asInstanceOf[js.Any] },
        "SpotOptions" -> SpotOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceMarketOptionsRequest]
    }
  }

  object InstanceMatchCriteriaEnum {
    val open = "open"
    val targeted = "targeted"

    val values = IndexedSeq(open, targeted)
  }

  /**
   * <p>Describes the monitoring of an instance.</p>
   */
  @js.native
  trait InstanceMonitoring extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Monitoring: js.UndefOr[Monitoring]
  }

  object InstanceMonitoring {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Monitoring: js.UndefOr[Monitoring] = js.undefined): InstanceMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceMonitoring]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait InstanceNetworkInterface extends js.Object {
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList]
    var Groups: js.UndefOr[GroupIdentifierList]
    var OwnerId: js.UndefOr[String]
    var Association: js.UndefOr[InstanceNetworkInterfaceAssociation]
    var Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment]
    var NetworkInterfaceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[Boolean]
    var MacAddress: js.UndefOr[String]
    var Status: js.UndefOr[NetworkInterfaceStatus]
    var VpcId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object InstanceNetworkInterface {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined,
      Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
      MacAddress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[NetworkInterfaceStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): InstanceNetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "Association" -> Association.map { x => x.asInstanceOf[js.Any] },
        "Attachment" -> Attachment.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] },
        "MacAddress" -> MacAddress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterface]
    }
  }

  /**
   * <p>Describes association information for an Elastic IP address (IPv4).</p>
   */
  @js.native
  trait InstanceNetworkInterfaceAssociation extends js.Object {
    var IpOwnerId: js.UndefOr[String]
    var PublicDnsName: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  object InstanceNetworkInterfaceAssociation {
    def apply(
      IpOwnerId: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined): InstanceNetworkInterfaceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpOwnerId" -> IpOwnerId.map { x => x.asInstanceOf[js.Any] },
        "PublicDnsName" -> PublicDnsName.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterfaceAssociation]
    }
  }

  /**
   * <p>Describes a network interface attachment.</p>
   */
  @js.native
  trait InstanceNetworkInterfaceAttachment extends js.Object {
    var AttachmentId: js.UndefOr[String]
    var DeviceIndex: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AttachTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[AttachmentStatus]
  }

  object InstanceNetworkInterfaceAttachment {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined,
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[AttachmentStatus] = js.undefined): InstanceNetworkInterfaceAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachmentId" -> AttachmentId.map { x => x.asInstanceOf[js.Any] },
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AttachTime" -> AttachTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterfaceAttachment]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait InstanceNetworkInterfaceSpecification extends js.Object {
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var PrivateIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var DeviceIndex: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[String]
  }

  object InstanceNetworkInterfaceSpecification {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Int] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): InstanceNetworkInterfaceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterfaceSpecification]
    }
  }

  /**
   * <p>Describes a private IPv4 address.</p>
   */
  @js.native
  trait InstancePrivateIpAddress extends js.Object {
    var Association: js.UndefOr[InstanceNetworkInterfaceAssociation]
    var Primary: js.UndefOr[Boolean]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  object InstancePrivateIpAddress {
    def apply(
      Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined,
      Primary: js.UndefOr[Boolean] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined): InstancePrivateIpAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Association" -> Association.map { x => x.asInstanceOf[js.Any] },
        "Primary" -> Primary.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePrivateIpAddress]
    }
  }

  /**
   * <p>Describes the current state of an instance.</p>
   */
  @js.native
  trait InstanceState extends js.Object {
    var Code: js.UndefOr[Int]
    var Name: js.UndefOr[InstanceStateName]
  }

  object InstanceState {
    def apply(
      Code: js.UndefOr[Int] = js.undefined,
      Name: js.UndefOr[InstanceStateName] = js.undefined): InstanceState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceState]
    }
  }

  /**
   * <p>Describes an instance state change.</p>
   */
  @js.native
  trait InstanceStateChange extends js.Object {
    var CurrentState: js.UndefOr[InstanceState]
    var InstanceId: js.UndefOr[String]
    var PreviousState: js.UndefOr[InstanceState]
  }

  object InstanceStateChange {
    def apply(
      CurrentState: js.UndefOr[InstanceState] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      PreviousState: js.UndefOr[InstanceState] = js.undefined): InstanceStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentState" -> CurrentState.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "PreviousState" -> PreviousState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStateChange]
    }
  }

  object InstanceStateNameEnum {
    val pending = "pending"
    val running = "running"
    val `shutting-down` = "shutting-down"
    val terminated = "terminated"
    val stopping = "stopping"
    val stopped = "stopped"

    val values = IndexedSeq(pending, running, `shutting-down`, terminated, stopping, stopped)
  }

  /**
   * <p>Describes the status of an instance.</p>
   */
  @js.native
  trait InstanceStatus extends js.Object {
    var InstanceStatus: js.UndefOr[InstanceStatusSummary]
    var InstanceState: js.UndefOr[InstanceState]
    var AvailabilityZone: js.UndefOr[String]
    var SystemStatus: js.UndefOr[InstanceStatusSummary]
    var Events: js.UndefOr[InstanceStatusEventList]
    var InstanceId: js.UndefOr[String]
  }

  object InstanceStatus {
    def apply(
      InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.undefined,
      InstanceState: js.UndefOr[InstanceState] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      SystemStatus: js.UndefOr[InstanceStatusSummary] = js.undefined,
      Events: js.UndefOr[InstanceStatusEventList] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): InstanceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceStatus" -> InstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "InstanceState" -> InstanceState.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SystemStatus" -> SystemStatus.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatus]
    }
  }

  /**
   * <p>Describes the instance status.</p>
   */
  @js.native
  trait InstanceStatusDetails extends js.Object {
    var ImpairedSince: js.UndefOr[DateTime]
    var Name: js.UndefOr[StatusName]
    var Status: js.UndefOr[StatusType]
  }

  object InstanceStatusDetails {
    def apply(
      ImpairedSince: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[StatusName] = js.undefined,
      Status: js.UndefOr[StatusType] = js.undefined): InstanceStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImpairedSince" -> ImpairedSince.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatusDetails]
    }
  }

  /**
   * <p>Describes a scheduled event for an instance.</p>
   */
  @js.native
  trait InstanceStatusEvent extends js.Object {
    var Code: js.UndefOr[EventCode]
    var Description: js.UndefOr[String]
    var NotAfter: js.UndefOr[DateTime]
    var NotBefore: js.UndefOr[DateTime]
  }

  object InstanceStatusEvent {
    def apply(
      Code: js.UndefOr[EventCode] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      NotAfter: js.UndefOr[DateTime] = js.undefined,
      NotBefore: js.UndefOr[DateTime] = js.undefined): InstanceStatusEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NotAfter" -> NotAfter.map { x => x.asInstanceOf[js.Any] },
        "NotBefore" -> NotBefore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatusEvent]
    }
  }

  /**
   * <p>Describes the status of an instance.</p>
   */
  @js.native
  trait InstanceStatusSummary extends js.Object {
    var Details: js.UndefOr[InstanceStatusDetailsList]
    var Status: js.UndefOr[SummaryStatus]
  }

  object InstanceStatusSummary {
    def apply(
      Details: js.UndefOr[InstanceStatusDetailsList] = js.undefined,
      Status: js.UndefOr[SummaryStatus] = js.undefined): InstanceStatusSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatusSummary]
    }
  }

  object InstanceTypeEnum {
    val `t1.micro` = "t1.micro"
    val `t2.nano` = "t2.nano"
    val `t2.micro` = "t2.micro"
    val `t2.small` = "t2.small"
    val `t2.medium` = "t2.medium"
    val `t2.large` = "t2.large"
    val `t2.xlarge` = "t2.xlarge"
    val `t2.2xlarge` = "t2.2xlarge"
    val `t3.nano` = "t3.nano"
    val `t3.micro` = "t3.micro"
    val `t3.small` = "t3.small"
    val `t3.medium` = "t3.medium"
    val `t3.large` = "t3.large"
    val `t3.xlarge` = "t3.xlarge"
    val `t3.2xlarge` = "t3.2xlarge"
    val `m1.small` = "m1.small"
    val `m1.medium` = "m1.medium"
    val `m1.large` = "m1.large"
    val `m1.xlarge` = "m1.xlarge"
    val `m3.medium` = "m3.medium"
    val `m3.large` = "m3.large"
    val `m3.xlarge` = "m3.xlarge"
    val `m3.2xlarge` = "m3.2xlarge"
    val `m4.large` = "m4.large"
    val `m4.xlarge` = "m4.xlarge"
    val `m4.2xlarge` = "m4.2xlarge"
    val `m4.4xlarge` = "m4.4xlarge"
    val `m4.10xlarge` = "m4.10xlarge"
    val `m4.16xlarge` = "m4.16xlarge"
    val `m2.xlarge` = "m2.xlarge"
    val `m2.2xlarge` = "m2.2xlarge"
    val `m2.4xlarge` = "m2.4xlarge"
    val `cr1.8xlarge` = "cr1.8xlarge"
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
    val `r5.large` = "r5.large"
    val `r5.xlarge` = "r5.xlarge"
    val `r5.2xlarge` = "r5.2xlarge"
    val `r5.4xlarge` = "r5.4xlarge"
    val `r5.8xlarge` = "r5.8xlarge"
    val `r5.12xlarge` = "r5.12xlarge"
    val `r5.16xlarge` = "r5.16xlarge"
    val `r5.24xlarge` = "r5.24xlarge"
    val `r5.metal` = "r5.metal"
    val `r5a.large` = "r5a.large"
    val `r5a.xlarge` = "r5a.xlarge"
    val `r5a.2xlarge` = "r5a.2xlarge"
    val `r5a.4xlarge` = "r5a.4xlarge"
    val `r5a.12xlarge` = "r5a.12xlarge"
    val `r5a.24xlarge` = "r5a.24xlarge"
    val `r5d.large` = "r5d.large"
    val `r5d.xlarge` = "r5d.xlarge"
    val `r5d.2xlarge` = "r5d.2xlarge"
    val `r5d.4xlarge` = "r5d.4xlarge"
    val `r5d.8xlarge` = "r5d.8xlarge"
    val `r5d.12xlarge` = "r5d.12xlarge"
    val `r5d.16xlarge` = "r5d.16xlarge"
    val `r5d.24xlarge` = "r5d.24xlarge"
    val `r5d.metal` = "r5d.metal"
    val `x1.16xlarge` = "x1.16xlarge"
    val `x1.32xlarge` = "x1.32xlarge"
    val `x1e.xlarge` = "x1e.xlarge"
    val `x1e.2xlarge` = "x1e.2xlarge"
    val `x1e.4xlarge` = "x1e.4xlarge"
    val `x1e.8xlarge` = "x1e.8xlarge"
    val `x1e.16xlarge` = "x1e.16xlarge"
    val `x1e.32xlarge` = "x1e.32xlarge"
    val `i2.xlarge` = "i2.xlarge"
    val `i2.2xlarge` = "i2.2xlarge"
    val `i2.4xlarge` = "i2.4xlarge"
    val `i2.8xlarge` = "i2.8xlarge"
    val `i3.large` = "i3.large"
    val `i3.xlarge` = "i3.xlarge"
    val `i3.2xlarge` = "i3.2xlarge"
    val `i3.4xlarge` = "i3.4xlarge"
    val `i3.8xlarge` = "i3.8xlarge"
    val `i3.16xlarge` = "i3.16xlarge"
    val `i3.metal` = "i3.metal"
    val `hi1.4xlarge` = "hi1.4xlarge"
    val `hs1.8xlarge` = "hs1.8xlarge"
    val `c1.medium` = "c1.medium"
    val `c1.xlarge` = "c1.xlarge"
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
    val `c5.large` = "c5.large"
    val `c5.xlarge` = "c5.xlarge"
    val `c5.2xlarge` = "c5.2xlarge"
    val `c5.4xlarge` = "c5.4xlarge"
    val `c5.9xlarge` = "c5.9xlarge"
    val `c5.18xlarge` = "c5.18xlarge"
    val `c5d.large` = "c5d.large"
    val `c5d.xlarge` = "c5d.xlarge"
    val `c5d.2xlarge` = "c5d.2xlarge"
    val `c5d.4xlarge` = "c5d.4xlarge"
    val `c5d.9xlarge` = "c5d.9xlarge"
    val `c5d.18xlarge` = "c5d.18xlarge"
    val `cc1.4xlarge` = "cc1.4xlarge"
    val `cc2.8xlarge` = "cc2.8xlarge"
    val `g2.2xlarge` = "g2.2xlarge"
    val `g2.8xlarge` = "g2.8xlarge"
    val `g3.4xlarge` = "g3.4xlarge"
    val `g3.8xlarge` = "g3.8xlarge"
    val `g3.16xlarge` = "g3.16xlarge"
    val `g3s.xlarge` = "g3s.xlarge"
    val `cg1.4xlarge` = "cg1.4xlarge"
    val `p2.xlarge` = "p2.xlarge"
    val `p2.8xlarge` = "p2.8xlarge"
    val `p2.16xlarge` = "p2.16xlarge"
    val `p3.2xlarge` = "p3.2xlarge"
    val `p3.8xlarge` = "p3.8xlarge"
    val `p3.16xlarge` = "p3.16xlarge"
    val `d2.xlarge` = "d2.xlarge"
    val `d2.2xlarge` = "d2.2xlarge"
    val `d2.4xlarge` = "d2.4xlarge"
    val `d2.8xlarge` = "d2.8xlarge"
    val `f1.2xlarge` = "f1.2xlarge"
    val `f1.4xlarge` = "f1.4xlarge"
    val `f1.16xlarge` = "f1.16xlarge"
    val `m5.large` = "m5.large"
    val `m5.xlarge` = "m5.xlarge"
    val `m5.2xlarge` = "m5.2xlarge"
    val `m5.4xlarge` = "m5.4xlarge"
    val `m5.12xlarge` = "m5.12xlarge"
    val `m5.24xlarge` = "m5.24xlarge"
    val `m5a.large` = "m5a.large"
    val `m5a.xlarge` = "m5a.xlarge"
    val `m5a.2xlarge` = "m5a.2xlarge"
    val `m5a.4xlarge` = "m5a.4xlarge"
    val `m5a.12xlarge` = "m5a.12xlarge"
    val `m5a.24xlarge` = "m5a.24xlarge"
    val `m5d.large` = "m5d.large"
    val `m5d.xlarge` = "m5d.xlarge"
    val `m5d.2xlarge` = "m5d.2xlarge"
    val `m5d.4xlarge` = "m5d.4xlarge"
    val `m5d.12xlarge` = "m5d.12xlarge"
    val `m5d.24xlarge` = "m5d.24xlarge"
    val `h1.2xlarge` = "h1.2xlarge"
    val `h1.4xlarge` = "h1.4xlarge"
    val `h1.8xlarge` = "h1.8xlarge"
    val `h1.16xlarge` = "h1.16xlarge"
    val `z1d.large` = "z1d.large"
    val `z1d.xlarge` = "z1d.xlarge"
    val `z1d.2xlarge` = "z1d.2xlarge"
    val `z1d.3xlarge` = "z1d.3xlarge"
    val `z1d.6xlarge` = "z1d.6xlarge"
    val `z1d.12xlarge` = "z1d.12xlarge"
    val `u-6tb1.metal` = "u-6tb1.metal"
    val `u-9tb1.metal` = "u-9tb1.metal"
    val `u-12tb1.metal` = "u-12tb1.metal"

    val values = IndexedSeq(`t1.micro`, `t2.nano`, `t2.micro`, `t2.small`, `t2.medium`, `t2.large`, `t2.xlarge`, `t2.2xlarge`, `t3.nano`, `t3.micro`, `t3.small`, `t3.medium`, `t3.large`, `t3.xlarge`, `t3.2xlarge`, `m1.small`, `m1.medium`, `m1.large`, `m1.xlarge`, `m3.medium`, `m3.large`, `m3.xlarge`, `m3.2xlarge`, `m4.large`, `m4.xlarge`, `m4.2xlarge`, `m4.4xlarge`, `m4.10xlarge`, `m4.16xlarge`, `m2.xlarge`, `m2.2xlarge`, `m2.4xlarge`, `cr1.8xlarge`, `r3.large`, `r3.xlarge`, `r3.2xlarge`, `r3.4xlarge`, `r3.8xlarge`, `r4.large`, `r4.xlarge`, `r4.2xlarge`, `r4.4xlarge`, `r4.8xlarge`, `r4.16xlarge`, `r5.large`, `r5.xlarge`, `r5.2xlarge`, `r5.4xlarge`, `r5.8xlarge`, `r5.12xlarge`, `r5.16xlarge`, `r5.24xlarge`, `r5.metal`, `r5a.large`, `r5a.xlarge`, `r5a.2xlarge`, `r5a.4xlarge`, `r5a.12xlarge`, `r5a.24xlarge`, `r5d.large`, `r5d.xlarge`, `r5d.2xlarge`, `r5d.4xlarge`, `r5d.8xlarge`, `r5d.12xlarge`, `r5d.16xlarge`, `r5d.24xlarge`, `r5d.metal`, `x1.16xlarge`, `x1.32xlarge`, `x1e.xlarge`, `x1e.2xlarge`, `x1e.4xlarge`, `x1e.8xlarge`, `x1e.16xlarge`, `x1e.32xlarge`, `i2.xlarge`, `i2.2xlarge`, `i2.4xlarge`, `i2.8xlarge`, `i3.large`, `i3.xlarge`, `i3.2xlarge`, `i3.4xlarge`, `i3.8xlarge`, `i3.16xlarge`, `i3.metal`, `hi1.4xlarge`, `hs1.8xlarge`, `c1.medium`, `c1.xlarge`, `c3.large`, `c3.xlarge`, `c3.2xlarge`, `c3.4xlarge`, `c3.8xlarge`, `c4.large`, `c4.xlarge`, `c4.2xlarge`, `c4.4xlarge`, `c4.8xlarge`, `c5.large`, `c5.xlarge`, `c5.2xlarge`, `c5.4xlarge`, `c5.9xlarge`, `c5.18xlarge`, `c5d.large`, `c5d.xlarge`, `c5d.2xlarge`, `c5d.4xlarge`, `c5d.9xlarge`, `c5d.18xlarge`, `cc1.4xlarge`, `cc2.8xlarge`, `g2.2xlarge`, `g2.8xlarge`, `g3.4xlarge`, `g3.8xlarge`, `g3.16xlarge`, `g3s.xlarge`, `cg1.4xlarge`, `p2.xlarge`, `p2.8xlarge`, `p2.16xlarge`, `p3.2xlarge`, `p3.8xlarge`, `p3.16xlarge`, `d2.xlarge`, `d2.2xlarge`, `d2.4xlarge`, `d2.8xlarge`, `f1.2xlarge`, `f1.4xlarge`, `f1.16xlarge`, `m5.large`, `m5.xlarge`, `m5.2xlarge`, `m5.4xlarge`, `m5.12xlarge`, `m5.24xlarge`, `m5a.large`, `m5a.xlarge`, `m5a.2xlarge`, `m5a.4xlarge`, `m5a.12xlarge`, `m5a.24xlarge`, `m5d.large`, `m5d.xlarge`, `m5d.2xlarge`, `m5d.4xlarge`, `m5d.12xlarge`, `m5d.24xlarge`, `h1.2xlarge`, `h1.4xlarge`, `h1.8xlarge`, `h1.16xlarge`, `z1d.large`, `z1d.xlarge`, `z1d.2xlarge`, `z1d.3xlarge`, `z1d.6xlarge`, `z1d.12xlarge`, `u-6tb1.metal`, `u-9tb1.metal`, `u-12tb1.metal`)
  }

  object InterfacePermissionTypeEnum {
    val `INSTANCE-ATTACH` = "INSTANCE-ATTACH"
    val `EIP-ASSOCIATE` = "EIP-ASSOCIATE"

    val values = IndexedSeq(`INSTANCE-ATTACH`, `EIP-ASSOCIATE`)
  }

  /**
   * <p>Describes an internet gateway.</p>
   */
  @js.native
  trait InternetGateway extends js.Object {
    var Attachments: js.UndefOr[InternetGatewayAttachmentList]
    var InternetGatewayId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object InternetGateway {
    def apply(
      Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): InternetGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attachments" -> Attachments.map { x => x.asInstanceOf[js.Any] },
        "InternetGatewayId" -> InternetGatewayId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InternetGateway]
    }
  }

  /**
   * <p>Describes the attachment of a VPC to an internet gateway or an egress-only internet gateway.</p>
   */
  @js.native
  trait InternetGatewayAttachment extends js.Object {
    var State: js.UndefOr[AttachmentStatus]
    var VpcId: js.UndefOr[String]
  }

  object InternetGatewayAttachment {
    def apply(
      State: js.UndefOr[AttachmentStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): InternetGatewayAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InternetGatewayAttachment]
    }
  }

  /**
   * <p>Describes a set of permissions for a security group rule.</p>
   */
  @js.native
  trait IpPermission extends js.Object {
    var PrefixListIds: js.UndefOr[PrefixListIdList]
    var UserIdGroupPairs: js.UndefOr[UserIdGroupPairList]
    var Ipv6Ranges: js.UndefOr[Ipv6RangeList]
    var IpRanges: js.UndefOr[IpRangeList]
    var ToPort: js.UndefOr[Int]
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
  }

  object IpPermission {
    def apply(
      PrefixListIds: js.UndefOr[PrefixListIdList] = js.undefined,
      UserIdGroupPairs: js.UndefOr[UserIdGroupPairList] = js.undefined,
      Ipv6Ranges: js.UndefOr[Ipv6RangeList] = js.undefined,
      IpRanges: js.UndefOr[IpRangeList] = js.undefined,
      ToPort: js.UndefOr[Int] = js.undefined,
      FromPort: js.UndefOr[Int] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined): IpPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrefixListIds" -> PrefixListIds.map { x => x.asInstanceOf[js.Any] },
        "UserIdGroupPairs" -> UserIdGroupPairs.map { x => x.asInstanceOf[js.Any] },
        "Ipv6Ranges" -> Ipv6Ranges.map { x => x.asInstanceOf[js.Any] },
        "IpRanges" -> IpRanges.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "IpProtocol" -> IpProtocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpPermission]
    }
  }

  /**
   * <p>Describes an IPv4 range.</p>
   */
  @js.native
  trait IpRange extends js.Object {
    var CidrIp: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object IpRange {
    def apply(
      CidrIp: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): IpRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpRange]
    }
  }

  /**
   * <p>Describes an IPv6 CIDR block.</p>
   */
  @js.native
  trait Ipv6CidrBlock extends js.Object {
    var Ipv6CidrBlock: js.UndefOr[String]
  }

  object Ipv6CidrBlock {
    def apply(
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined): Ipv6CidrBlock = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ipv6CidrBlock]
    }
  }

  /**
   * <p>[EC2-VPC only] Describes an IPv6 range.</p>
   */
  @js.native
  trait Ipv6Range extends js.Object {
    var CidrIpv6: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object Ipv6Range {
    def apply(
      CidrIpv6: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): Ipv6Range = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CidrIpv6" -> CidrIpv6.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ipv6Range]
    }
  }

  /**
   * <p>Describes a key pair.</p>
   */
  @js.native
  trait KeyPair extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var KeyMaterial: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
  }

  object KeyPair {
    def apply(
      KeyFingerprint: js.UndefOr[String] = js.undefined,
      KeyMaterial: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined): KeyPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyFingerprint" -> KeyFingerprint.map { x => x.asInstanceOf[js.Any] },
        "KeyMaterial" -> KeyMaterial.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPair]
    }
  }

  /**
   * <p>Describes a key pair.</p>
   */
  @js.native
  trait KeyPairInfo extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
  }

  object KeyPairInfo {
    def apply(
      KeyFingerprint: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined): KeyPairInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyFingerprint" -> KeyFingerprint.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPairInfo]
    }
  }

  /**
   * <p>Describes a launch permission.</p>
   */
  @js.native
  trait LaunchPermission extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  object LaunchPermission {
    def apply(
      Group: js.UndefOr[PermissionGroup] = js.undefined,
      UserId: js.UndefOr[String] = js.undefined): LaunchPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchPermission]
    }
  }

  /**
   * <p>Describes a launch permission modification.</p>
   */
  @js.native
  trait LaunchPermissionModifications extends js.Object {
    var Add: js.UndefOr[LaunchPermissionList]
    var Remove: js.UndefOr[LaunchPermissionList]
  }

  object LaunchPermissionModifications {
    def apply(
      Add: js.UndefOr[LaunchPermissionList] = js.undefined,
      Remove: js.UndefOr[LaunchPermissionList] = js.undefined): LaunchPermissionModifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Add" -> Add.map { x => x.asInstanceOf[js.Any] },
        "Remove" -> Remove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchPermissionModifications]
    }
  }

  /**
   * <p>Describes the launch specification for an instance.</p>
   */
  @js.native
  trait LaunchSpecification extends js.Object {
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var ImageId: js.UndefOr[String]
    var EbsOptimized: js.UndefOr[Boolean]
    var Placement: js.UndefOr[SpotPlacement]
    var UserData: js.UndefOr[String]
    var AddressingType: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[GroupIdentifierList]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var SubnetId: js.UndefOr[String]
  }

  object LaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[SpotPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      AddressingType: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): LaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "AddressingType" -> AddressingType.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchSpecification]
    }
  }

  /**
   * <p>Describes a launch template.</p>
   */
  @js.native
  trait LaunchTemplate extends js.Object {
    var CreatedBy: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var LatestVersionNumber: js.UndefOr[Double]
    var Tags: js.UndefOr[TagList]
    var CreateTime: js.UndefOr[DateTime]
    var LaunchTemplateId: js.UndefOr[String]
    var DefaultVersionNumber: js.UndefOr[Double]
  }

  object LaunchTemplate {
    def apply(
      CreatedBy: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      LatestVersionNumber: js.UndefOr[Double] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      DefaultVersionNumber: js.UndefOr[Double] = js.undefined): LaunchTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedBy" -> CreatedBy.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "LatestVersionNumber" -> LatestVersionNumber.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersionNumber" -> DefaultVersionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplate]
    }
  }

  /**
   * <p>Describes a launch template and overrides.</p>
   */
  @js.native
  trait LaunchTemplateAndOverridesResponse extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification]
    var Overrides: js.UndefOr[FleetLaunchTemplateOverrides]
  }

  object LaunchTemplateAndOverridesResponse {
    def apply(
      LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined,
      Overrides: js.UndefOr[FleetLaunchTemplateOverrides] = js.undefined): LaunchTemplateAndOverridesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateSpecification" -> LaunchTemplateSpecification.map { x => x.asInstanceOf[js.Any] },
        "Overrides" -> Overrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateAndOverridesResponse]
    }
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait LaunchTemplateBlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
    var Ebs: js.UndefOr[LaunchTemplateEbsBlockDevice]
    var NoDevice: js.UndefOr[String]
  }

  object LaunchTemplateBlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[LaunchTemplateEbsBlockDevice] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined): LaunchTemplateBlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "VirtualName" -> VirtualName.map { x => x.asInstanceOf[js.Any] },
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] },
        "NoDevice" -> NoDevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateBlockDeviceMapping]
    }
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait LaunchTemplateBlockDeviceMappingRequest extends js.Object {
    var DeviceName: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
    var Ebs: js.UndefOr[LaunchTemplateEbsBlockDeviceRequest]
    var NoDevice: js.UndefOr[String]
  }

  object LaunchTemplateBlockDeviceMappingRequest {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[LaunchTemplateEbsBlockDeviceRequest] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined): LaunchTemplateBlockDeviceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "VirtualName" -> VirtualName.map { x => x.asInstanceOf[js.Any] },
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] },
        "NoDevice" -> NoDevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateBlockDeviceMappingRequest]
    }
  }

  /**
   * <p>Describes an instance's Capacity Reservation targeting option. You can specify only one option at a time. Use the <code>CapacityReservationPreference</code> parameter to configure the instance to run in On-Demand capacity or to run in any <code>open</code> Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). Use the <code>CapacityReservationTarget</code> parameter to explicitly target a specific Capacity Reservation.</p>
   */
  @js.native
  trait LaunchTemplateCapacityReservationSpecificationRequest extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTarget]
  }

  object LaunchTemplateCapacityReservationSpecificationRequest {
    def apply(
      CapacityReservationPreference: js.UndefOr[CapacityReservationPreference] = js.undefined,
      CapacityReservationTarget: js.UndefOr[CapacityReservationTarget] = js.undefined): LaunchTemplateCapacityReservationSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationPreference" -> CapacityReservationPreference.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationTarget" -> CapacityReservationTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateCapacityReservationSpecificationRequest]
    }
  }

  /**
   * <p>Information about the Capacity Reservation targeting option.</p>
   */
  @js.native
  trait LaunchTemplateCapacityReservationSpecificationResponse extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse]
  }

  object LaunchTemplateCapacityReservationSpecificationResponse {
    def apply(
      CapacityReservationPreference: js.UndefOr[CapacityReservationPreference] = js.undefined,
      CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse] = js.undefined): LaunchTemplateCapacityReservationSpecificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityReservationPreference" -> CapacityReservationPreference.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationTarget" -> CapacityReservationTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateCapacityReservationSpecificationResponse]
    }
  }

  /**
   * <p>Describes a launch template and overrides.</p>
   */
  @js.native
  trait LaunchTemplateConfig extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification]
    var Overrides: js.UndefOr[LaunchTemplateOverridesList]
  }

  object LaunchTemplateConfig {
    def apply(
      LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined,
      Overrides: js.UndefOr[LaunchTemplateOverridesList] = js.undefined): LaunchTemplateConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateSpecification" -> LaunchTemplateSpecification.map { x => x.asInstanceOf[js.Any] },
        "Overrides" -> Overrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateConfig]
    }
  }

  /**
   * <p>The CPU options for the instance.</p>
   */
  @js.native
  trait LaunchTemplateCpuOptions extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  object LaunchTemplateCpuOptions {
    def apply(
      CoreCount: js.UndefOr[Int] = js.undefined,
      ThreadsPerCore: js.UndefOr[Int] = js.undefined): LaunchTemplateCpuOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreCount" -> CoreCount.map { x => x.asInstanceOf[js.Any] },
        "ThreadsPerCore" -> ThreadsPerCore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateCpuOptions]
    }
  }

  /**
   * <p>The CPU options for the instance. Both the core count and threads per core must be specified in the request.</p>
   */
  @js.native
  trait LaunchTemplateCpuOptionsRequest extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  object LaunchTemplateCpuOptionsRequest {
    def apply(
      CoreCount: js.UndefOr[Int] = js.undefined,
      ThreadsPerCore: js.UndefOr[Int] = js.undefined): LaunchTemplateCpuOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreCount" -> CoreCount.map { x => x.asInstanceOf[js.Any] },
        "ThreadsPerCore" -> ThreadsPerCore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateCpuOptionsRequest]
    }
  }

  /**
   * <p>Describes a block device for an EBS volume.</p>
   */
  @js.native
  trait LaunchTemplateEbsBlockDevice extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var SnapshotId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var VolumeSize: js.UndefOr[Int]
    var Iops: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
  }

  object LaunchTemplateEbsBlockDevice {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      VolumeSize: js.UndefOr[Int] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined): LaunchTemplateEbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateEbsBlockDevice]
    }
  }

  /**
   * <p>The parameters for a block device for an EBS volume.</p>
   */
  @js.native
  trait LaunchTemplateEbsBlockDeviceRequest extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var SnapshotId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var VolumeSize: js.UndefOr[Int]
    var Iops: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
  }

  object LaunchTemplateEbsBlockDeviceRequest {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      VolumeSize: js.UndefOr[Int] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined): LaunchTemplateEbsBlockDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateEbsBlockDeviceRequest]
    }
  }

  object LaunchTemplateErrorCodeEnum {
    val launchTemplateIdDoesNotExist = "launchTemplateIdDoesNotExist"
    val launchTemplateIdMalformed = "launchTemplateIdMalformed"
    val launchTemplateNameDoesNotExist = "launchTemplateNameDoesNotExist"
    val launchTemplateNameMalformed = "launchTemplateNameMalformed"
    val launchTemplateVersionDoesNotExist = "launchTemplateVersionDoesNotExist"
    val unexpectedError = "unexpectedError"

    val values = IndexedSeq(launchTemplateIdDoesNotExist, launchTemplateIdMalformed, launchTemplateNameDoesNotExist, launchTemplateNameMalformed, launchTemplateVersionDoesNotExist, unexpectedError)
  }

  /**
   * <p>Describes an IAM instance profile.</p>
   */
  @js.native
  trait LaunchTemplateIamInstanceProfileSpecification extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object LaunchTemplateIamInstanceProfileSpecification {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined): LaunchTemplateIamInstanceProfileSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateIamInstanceProfileSpecification]
    }
  }

  /**
   * <p>An IAM instance profile.</p>
   */
  @js.native
  trait LaunchTemplateIamInstanceProfileSpecificationRequest extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object LaunchTemplateIamInstanceProfileSpecificationRequest {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined): LaunchTemplateIamInstanceProfileSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateIamInstanceProfileSpecificationRequest]
    }
  }

  /**
   * <p>The market (purchasing) option for the instances.</p>
   */
  @js.native
  trait LaunchTemplateInstanceMarketOptions extends js.Object {
    var MarketType: js.UndefOr[MarketType]
    var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions]
  }

  object LaunchTemplateInstanceMarketOptions {
    def apply(
      MarketType: js.UndefOr[MarketType] = js.undefined,
      SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions] = js.undefined): LaunchTemplateInstanceMarketOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MarketType" -> MarketType.map { x => x.asInstanceOf[js.Any] },
        "SpotOptions" -> SpotOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateInstanceMarketOptions]
    }
  }

  /**
   * <p>The market (purchasing) option for the instances.</p>
   */
  @js.native
  trait LaunchTemplateInstanceMarketOptionsRequest extends js.Object {
    var MarketType: js.UndefOr[MarketType]
    var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptionsRequest]
  }

  object LaunchTemplateInstanceMarketOptionsRequest {
    def apply(
      MarketType: js.UndefOr[MarketType] = js.undefined,
      SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptionsRequest] = js.undefined): LaunchTemplateInstanceMarketOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MarketType" -> MarketType.map { x => x.asInstanceOf[js.Any] },
        "SpotOptions" -> SpotOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateInstanceMarketOptionsRequest]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait LaunchTemplateInstanceNetworkInterfaceSpecification extends js.Object {
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var PrivateIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Groups: js.UndefOr[GroupIdStringList]
    var DeviceIndex: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[String]
  }

  object LaunchTemplateInstanceNetworkInterfaceSpecification {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      Groups: js.UndefOr[GroupIdStringList] = js.undefined,
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Int] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): LaunchTemplateInstanceNetworkInterfaceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateInstanceNetworkInterfaceSpecification]
    }
  }

  /**
   * <p>The parameters for a network interface.</p>
   */
  @js.native
  trait LaunchTemplateInstanceNetworkInterfaceSpecificationRequest extends js.Object {
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressListRequest]
    var PrivateIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var DeviceIndex: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[String]
  }

  object LaunchTemplateInstanceNetworkInterfaceSpecificationRequest {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressListRequest] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Int] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): LaunchTemplateInstanceNetworkInterfaceSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]
    }
  }

  /**
   * <p>Describes overrides for a launch template.</p>
   */
  @js.native
  trait LaunchTemplateOverrides extends js.Object {
    var WeightedCapacity: js.UndefOr[Double]
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Priority: js.UndefOr[Double]
    var SpotPrice: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object LaunchTemplateOverrides {
    def apply(
      WeightedCapacity: js.UndefOr[Double] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Priority: js.UndefOr[Double] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): LaunchTemplateOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeightedCapacity" -> WeightedCapacity.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateOverrides]
    }
  }

  /**
   * <p>Describes the placement of an instance.</p>
   */
  @js.native
  trait LaunchTemplatePlacement extends js.Object {
    var GroupName: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
    var Affinity: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var SpreadDomain: js.UndefOr[String]
  }

  object LaunchTemplatePlacement {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[Tenancy] = js.undefined,
      Affinity: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined,
      SpreadDomain: js.UndefOr[String] = js.undefined): LaunchTemplatePlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "Affinity" -> Affinity.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "HostId" -> HostId.map { x => x.asInstanceOf[js.Any] },
        "SpreadDomain" -> SpreadDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplatePlacement]
    }
  }

  /**
   * <p>The placement for the instance.</p>
   */
  @js.native
  trait LaunchTemplatePlacementRequest extends js.Object {
    var GroupName: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
    var Affinity: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var SpreadDomain: js.UndefOr[String]
  }

  object LaunchTemplatePlacementRequest {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[Tenancy] = js.undefined,
      Affinity: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined,
      SpreadDomain: js.UndefOr[String] = js.undefined): LaunchTemplatePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "Affinity" -> Affinity.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "HostId" -> HostId.map { x => x.asInstanceOf[js.Any] },
        "SpreadDomain" -> SpreadDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplatePlacementRequest]
    }
  }

  /**
   * <p>The launch template to use. You must specify either the launch template ID or launch template name in the request, but not both.</p>
   */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object LaunchTemplateSpecification {
    def apply(
      LaunchTemplateId: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[String] = js.undefined,
      Version: js.UndefOr[String] = js.undefined): LaunchTemplateSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateSpecification]
    }
  }

  /**
   * <p>The options for Spot Instances.</p>
   */
  @js.native
  trait LaunchTemplateSpotMarketOptions extends js.Object {
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var SpotInstanceType: js.UndefOr[SpotInstanceType]
    var ValidUntil: js.UndefOr[DateTime]
    var MaxPrice: js.UndefOr[String]
    var BlockDurationMinutes: js.UndefOr[Int]
  }

  object LaunchTemplateSpotMarketOptions {
    def apply(
      InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined,
      SpotInstanceType: js.UndefOr[SpotInstanceType] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      MaxPrice: js.UndefOr[String] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Int] = js.undefined): LaunchTemplateSpotMarketOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceType" -> SpotInstanceType.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "MaxPrice" -> MaxPrice.map { x => x.asInstanceOf[js.Any] },
        "BlockDurationMinutes" -> BlockDurationMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateSpotMarketOptions]
    }
  }

  /**
   * <p>The options for Spot Instances.</p>
   */
  @js.native
  trait LaunchTemplateSpotMarketOptionsRequest extends js.Object {
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var SpotInstanceType: js.UndefOr[SpotInstanceType]
    var ValidUntil: js.UndefOr[DateTime]
    var MaxPrice: js.UndefOr[String]
    var BlockDurationMinutes: js.UndefOr[Int]
  }

  object LaunchTemplateSpotMarketOptionsRequest {
    def apply(
      InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined,
      SpotInstanceType: js.UndefOr[SpotInstanceType] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      MaxPrice: js.UndefOr[String] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Int] = js.undefined): LaunchTemplateSpotMarketOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceType" -> SpotInstanceType.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "MaxPrice" -> MaxPrice.map { x => x.asInstanceOf[js.Any] },
        "BlockDurationMinutes" -> BlockDurationMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateSpotMarketOptionsRequest]
    }
  }

  /**
   * <p>The tag specification for the launch template.</p>
   */
  @js.native
  trait LaunchTemplateTagSpecification extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object LaunchTemplateTagSpecification {
    def apply(
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): LaunchTemplateTagSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateTagSpecification]
    }
  }

  /**
   * <p>The tags specification for the launch template.</p>
   */
  @js.native
  trait LaunchTemplateTagSpecificationRequest extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object LaunchTemplateTagSpecificationRequest {
    def apply(
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): LaunchTemplateTagSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateTagSpecificationRequest]
    }
  }

  /**
   * <p>Describes a launch template version.</p>
   */
  @js.native
  trait LaunchTemplateVersion extends js.Object {
    var VersionDescription: js.UndefOr[VersionDescription]
    var CreatedBy: js.UndefOr[String]
    var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData]
    var VersionNumber: js.UndefOr[Double]
    var DefaultVersion: js.UndefOr[Boolean]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var CreateTime: js.UndefOr[DateTime]
    var LaunchTemplateId: js.UndefOr[String]
  }

  object LaunchTemplateVersion {
    def apply(
      VersionDescription: js.UndefOr[VersionDescription] = js.undefined,
      CreatedBy: js.UndefOr[String] = js.undefined,
      LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.undefined,
      VersionNumber: js.UndefOr[Double] = js.undefined,
      DefaultVersion: js.UndefOr[Boolean] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined): LaunchTemplateVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionDescription" -> VersionDescription.map { x => x.asInstanceOf[js.Any] },
        "CreatedBy" -> CreatedBy.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateData" -> LaunchTemplateData.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersion" -> DefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateVersion]
    }
  }

  /**
   * <p>Describes the monitoring for the instance.</p>
   */
  @js.native
  trait LaunchTemplatesMonitoring extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object LaunchTemplatesMonitoring {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined): LaunchTemplatesMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplatesMonitoring]
    }
  }

  /**
   * <p>Describes the monitoring for the instance.</p>
   */
  @js.native
  trait LaunchTemplatesMonitoringRequest extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object LaunchTemplatesMonitoringRequest {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined): LaunchTemplatesMonitoringRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplatesMonitoringRequest]
    }
  }

  object ListingStateEnum {
    val available = "available"
    val sold = "sold"
    val cancelled = "cancelled"
    val pending = "pending"

    val values = IndexedSeq(available, sold, cancelled, pending)
  }

  object ListingStatusEnum {
    val active = "active"
    val pending = "pending"
    val cancelled = "cancelled"
    val closed = "closed"

    val values = IndexedSeq(active, pending, cancelled, closed)
  }

  /**
   * <p>Describes the Classic Load Balancers and target groups to attach to a Spot Fleet request.</p>
   */
  @js.native
  trait LoadBalancersConfig extends js.Object {
    var ClassicLoadBalancersConfig: js.UndefOr[ClassicLoadBalancersConfig]
    var TargetGroupsConfig: js.UndefOr[TargetGroupsConfig]
  }

  object LoadBalancersConfig {
    def apply(
      ClassicLoadBalancersConfig: js.UndefOr[ClassicLoadBalancersConfig] = js.undefined,
      TargetGroupsConfig: js.UndefOr[TargetGroupsConfig] = js.undefined): LoadBalancersConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClassicLoadBalancersConfig" -> ClassicLoadBalancersConfig.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupsConfig" -> TargetGroupsConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancersConfig]
    }
  }

  /**
   * <p>Describes a load permission.</p>
   */
  @js.native
  trait LoadPermission extends js.Object {
    var UserId: js.UndefOr[String]
    var Group: js.UndefOr[PermissionGroup]
  }

  object LoadPermission {
    def apply(
      UserId: js.UndefOr[String] = js.undefined,
      Group: js.UndefOr[PermissionGroup] = js.undefined): LoadPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadPermission]
    }
  }

  /**
   * <p>Describes modifications to the load permissions of an Amazon FPGA image (AFI).</p>
   */
  @js.native
  trait LoadPermissionModifications extends js.Object {
    var Add: js.UndefOr[LoadPermissionListRequest]
    var Remove: js.UndefOr[LoadPermissionListRequest]
  }

  object LoadPermissionModifications {
    def apply(
      Add: js.UndefOr[LoadPermissionListRequest] = js.undefined,
      Remove: js.UndefOr[LoadPermissionListRequest] = js.undefined): LoadPermissionModifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Add" -> Add.map { x => x.asInstanceOf[js.Any] },
        "Remove" -> Remove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadPermissionModifications]
    }
  }

  /**
   * <p>Describes a load permission.</p>
   */
  @js.native
  trait LoadPermissionRequest extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  object LoadPermissionRequest {
    def apply(
      Group: js.UndefOr[PermissionGroup] = js.undefined,
      UserId: js.UndefOr[String] = js.undefined): LoadPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadPermissionRequest]
    }
  }

  object LogDestinationTypeEnum {
    val `cloud-watch-logs` = "cloud-watch-logs"
    val s3 = "s3"

    val values = IndexedSeq(`cloud-watch-logs`, s3)
  }

  object MarketTypeEnum {
    val spot = "spot"

    val values = IndexedSeq(spot)
  }

  @js.native
  trait ModifyCapacityReservationRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var InstanceCount: js.UndefOr[Int]
    var CapacityReservationId: js.UndefOr[String]
    var EndDateType: js.UndefOr[EndDateType]
    var EndDate: js.UndefOr[DateTime]
  }

  object ModifyCapacityReservationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      CapacityReservationId: js.UndefOr[String] = js.undefined,
      EndDateType: js.UndefOr[EndDateType] = js.undefined,
      EndDate: js.UndefOr[DateTime] = js.undefined): ModifyCapacityReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationId" -> CapacityReservationId.map { x => x.asInstanceOf[js.Any] },
        "EndDateType" -> EndDateType.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCapacityReservationRequest]
    }
  }

  @js.native
  trait ModifyCapacityReservationResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifyCapacityReservationResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifyCapacityReservationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCapacityReservationResult]
    }
  }

  @js.native
  trait ModifyFleetRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy]
    var FleetId: js.UndefOr[FleetIdentifier]
    var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecificationRequest]
  }

  object ModifyFleetRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined,
      FleetId: js.UndefOr[FleetIdentifier] = js.undefined,
      TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecificationRequest] = js.undefined): ModifyFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x.asInstanceOf[js.Any] },
        "FleetId" -> FleetId.map { x => x.asInstanceOf[js.Any] },
        "TargetCapacitySpecification" -> TargetCapacitySpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyFleetRequest]
    }
  }

  @js.native
  trait ModifyFleetResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifyFleetResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifyFleetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyFleetResult]
    }
  }

  @js.native
  trait ModifyFpgaImageAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var LoadPermission: js.UndefOr[LoadPermissionModifications]
    var Name: js.UndefOr[String]
    var UserGroups: js.UndefOr[UserGroupStringList]
    var FpgaImageId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var UserIds: js.UndefOr[UserIdStringList]
    var OperationType: js.UndefOr[OperationType]
    var ProductCodes: js.UndefOr[ProductCodeStringList]
    var Attribute: js.UndefOr[FpgaImageAttributeName]
  }

  object ModifyFpgaImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LoadPermission: js.UndefOr[LoadPermissionModifications] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      UserGroups: js.UndefOr[UserGroupStringList] = js.undefined,
      FpgaImageId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      UserIds: js.UndefOr[UserIdStringList] = js.undefined,
      OperationType: js.UndefOr[OperationType] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined,
      Attribute: js.UndefOr[FpgaImageAttributeName] = js.undefined): ModifyFpgaImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "LoadPermission" -> LoadPermission.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "UserGroups" -> UserGroups.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UserIds" -> UserIds.map { x => x.asInstanceOf[js.Any] },
        "OperationType" -> OperationType.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyFpgaImageAttributeRequest]
    }
  }

  @js.native
  trait ModifyFpgaImageAttributeResult extends js.Object {
    var FpgaImageAttribute: js.UndefOr[FpgaImageAttribute]
  }

  object ModifyFpgaImageAttributeResult {
    def apply(
      FpgaImageAttribute: js.UndefOr[FpgaImageAttribute] = js.undefined): ModifyFpgaImageAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FpgaImageAttribute" -> FpgaImageAttribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyFpgaImageAttributeResult]
    }
  }

  @js.native
  trait ModifyHostsRequest extends js.Object {
    var AutoPlacement: js.UndefOr[AutoPlacement]
    var HostIds: js.UndefOr[RequestHostIdList]
  }

  object ModifyHostsRequest {
    def apply(
      AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined,
      HostIds: js.UndefOr[RequestHostIdList] = js.undefined): ModifyHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoPlacement" -> AutoPlacement.map { x => x.asInstanceOf[js.Any] },
        "HostIds" -> HostIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHostsRequest]
    }
  }

  @js.native
  trait ModifyHostsResult extends js.Object {
    var Successful: js.UndefOr[ResponseHostIdList]
    var Unsuccessful: js.UndefOr[UnsuccessfulItemList]
  }

  object ModifyHostsResult {
    def apply(
      Successful: js.UndefOr[ResponseHostIdList] = js.undefined,
      Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.undefined): ModifyHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] },
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHostsResult]
    }
  }

  /**
   * <p>Contains the parameters of ModifyIdFormat.</p>
   */
  @js.native
  trait ModifyIdFormatRequest extends js.Object {
    var Resource: js.UndefOr[String]
    var UseLongIds: js.UndefOr[Boolean]
  }

  object ModifyIdFormatRequest {
    def apply(
      Resource: js.UndefOr[String] = js.undefined,
      UseLongIds: js.UndefOr[Boolean] = js.undefined): ModifyIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "UseLongIds" -> UseLongIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyIdFormatRequest]
    }
  }

  /**
   * <p>Contains the parameters of ModifyIdentityIdFormat.</p>
   */
  @js.native
  trait ModifyIdentityIdFormatRequest extends js.Object {
    var PrincipalArn: js.UndefOr[String]
    var Resource: js.UndefOr[String]
    var UseLongIds: js.UndefOr[Boolean]
  }

  object ModifyIdentityIdFormatRequest {
    def apply(
      PrincipalArn: js.UndefOr[String] = js.undefined,
      Resource: js.UndefOr[String] = js.undefined,
      UseLongIds: js.UndefOr[Boolean] = js.undefined): ModifyIdentityIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalArn" -> PrincipalArn.map { x => x.asInstanceOf[js.Any] },
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "UseLongIds" -> UseLongIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyIdentityIdFormatRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyImageAttribute.</p>
   */
  @js.native
  trait ModifyImageAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ImageId: js.UndefOr[String]
    var UserGroups: js.UndefOr[UserGroupStringList]
    var Description: js.UndefOr[AttributeValue]
    var UserIds: js.UndefOr[UserIdStringList]
    var Value: js.UndefOr[String]
    var LaunchPermission: js.UndefOr[LaunchPermissionModifications]
    var OperationType: js.UndefOr[OperationType]
    var ProductCodes: js.UndefOr[ProductCodeStringList]
    var Attribute: js.UndefOr[String]
  }

  object ModifyImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      UserGroups: js.UndefOr[UserGroupStringList] = js.undefined,
      Description: js.UndefOr[AttributeValue] = js.undefined,
      UserIds: js.UndefOr[UserIdStringList] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.undefined,
      OperationType: js.UndefOr[OperationType] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined,
      Attribute: js.UndefOr[String] = js.undefined): ModifyImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "UserGroups" -> UserGroups.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UserIds" -> UserIds.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "LaunchPermission" -> LaunchPermission.map { x => x.asInstanceOf[js.Any] },
        "OperationType" -> OperationType.map { x => x.asInstanceOf[js.Any] },
        "ProductCodes" -> ProductCodes.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyImageAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyInstanceAttribute.</p>
   */
  @js.native
  trait ModifyInstanceAttributeRequest extends js.Object {
    var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList]
    var DryRun: js.UndefOr[Boolean]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue]
    var EbsOptimized: js.UndefOr[AttributeBooleanValue]
    var DisableApiTermination: js.UndefOr[AttributeBooleanValue]
    var UserData: js.UndefOr[BlobAttributeValue]
    var Groups: js.UndefOr[GroupIdStringList]
    var Value: js.UndefOr[String]
    var EnaSupport: js.UndefOr[AttributeBooleanValue]
    var Ramdisk: js.UndefOr[AttributeValue]
    var InstanceType: js.UndefOr[AttributeValue]
    var InstanceId: js.UndefOr[String]
    var Kernel: js.UndefOr[AttributeValue]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
    var SriovNetSupport: js.UndefOr[AttributeValue]
    var Attribute: js.UndefOr[InstanceAttributeName]
  }

  object ModifyInstanceAttributeRequest {
    def apply(
      BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined,
      EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined,
      DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined,
      UserData: js.UndefOr[BlobAttributeValue] = js.undefined,
      Groups: js.UndefOr[GroupIdStringList] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      Ramdisk: js.UndefOr[AttributeValue] = js.undefined,
      InstanceType: js.UndefOr[AttributeValue] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Kernel: js.UndefOr[AttributeValue] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined,
      SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined,
      Attribute: js.UndefOr[InstanceAttributeName] = js.undefined): ModifyInstanceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "DisableApiTermination" -> DisableApiTermination.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "EnaSupport" -> EnaSupport.map { x => x.asInstanceOf[js.Any] },
        "Ramdisk" -> Ramdisk.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Kernel" -> Kernel.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] },
        "SriovNetSupport" -> SriovNetSupport.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceAttributeRequest]
    }
  }

  @js.native
  trait ModifyInstanceCapacityReservationAttributesRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecification]
    var DryRun: js.UndefOr[Boolean]
  }

  object ModifyInstanceCapacityReservationAttributesRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecification] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ModifyInstanceCapacityReservationAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationSpecification" -> CapacityReservationSpecification.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
    }
  }

  @js.native
  trait ModifyInstanceCapacityReservationAttributesResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifyInstanceCapacityReservationAttributesResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifyInstanceCapacityReservationAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceCapacityReservationAttributesResult]
    }
  }

  @js.native
  trait ModifyInstanceCreditSpecificationRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationListRequest]
  }

  object ModifyInstanceCreditSpecificationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationListRequest] = js.undefined): ModifyInstanceCreditSpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "InstanceCreditSpecifications" -> InstanceCreditSpecifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceCreditSpecificationRequest]
    }
  }

  @js.native
  trait ModifyInstanceCreditSpecificationResult extends js.Object {
    var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet]
    var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet]
  }

  object ModifyInstanceCreditSpecificationResult {
    def apply(
      SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.undefined,
      UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.undefined): ModifyInstanceCreditSpecificationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SuccessfulInstanceCreditSpecifications" -> SuccessfulInstanceCreditSpecifications.map { x => x.asInstanceOf[js.Any] },
        "UnsuccessfulInstanceCreditSpecifications" -> UnsuccessfulInstanceCreditSpecifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceCreditSpecificationResult]
    }
  }

  @js.native
  trait ModifyInstancePlacementRequest extends js.Object {
    var GroupName: js.UndefOr[String]
    var Tenancy: js.UndefOr[HostTenancy]
    var Affinity: js.UndefOr[Affinity]
    var HostId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  object ModifyInstancePlacementRequest {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[HostTenancy] = js.undefined,
      Affinity: js.UndefOr[Affinity] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): ModifyInstancePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "Affinity" -> Affinity.map { x => x.asInstanceOf[js.Any] },
        "HostId" -> HostId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstancePlacementRequest]
    }
  }

  @js.native
  trait ModifyInstancePlacementResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifyInstancePlacementResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifyInstancePlacementResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstancePlacementResult]
    }
  }

  @js.native
  trait ModifyLaunchTemplateRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var DefaultVersion: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var LaunchTemplateId: js.UndefOr[String]
  }

  object ModifyLaunchTemplateRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      DefaultVersion: js.UndefOr[String] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      LaunchTemplateId: js.UndefOr[String] = js.undefined): ModifyLaunchTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "DefaultVersion" -> DefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLaunchTemplateRequest]
    }
  }

  @js.native
  trait ModifyLaunchTemplateResult extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  object ModifyLaunchTemplateResult {
    def apply(
      LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined): ModifyLaunchTemplateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLaunchTemplateResult]
    }
  }

  /**
   * <p>Contains the parameters for ModifyNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait ModifyNetworkInterfaceAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Description: js.UndefOr[AttributeValue]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges]
    var NetworkInterfaceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
  }

  object ModifyNetworkInterfaceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[AttributeValue] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined): ModifyNetworkInterfaceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Attachment" -> Attachment.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyNetworkInterfaceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyReservedInstances.</p>
   */
  @js.native
  trait ModifyReservedInstancesRequest extends js.Object {
    var ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList]
    var ClientToken: js.UndefOr[String]
    var TargetConfigurations: js.UndefOr[ReservedInstancesConfigurationList]
  }

  object ModifyReservedInstancesRequest {
    def apply(
      ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      TargetConfigurations: js.UndefOr[ReservedInstancesConfigurationList] = js.undefined): ModifyReservedInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesIds" -> ReservedInstancesIds.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "TargetConfigurations" -> TargetConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReservedInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of ModifyReservedInstances.</p>
   */
  @js.native
  trait ModifyReservedInstancesResult extends js.Object {
    var ReservedInstancesModificationId: js.UndefOr[String]
  }

  object ModifyReservedInstancesResult {
    def apply(
      ReservedInstancesModificationId: js.UndefOr[String] = js.undefined): ModifyReservedInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesModificationId" -> ReservedInstancesModificationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReservedInstancesResult]
    }
  }

  /**
   * <p>Contains the parameters for ModifySnapshotAttribute.</p>
   */
  @js.native
  trait ModifySnapshotAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var SnapshotId: js.UndefOr[String]
    var UserIds: js.UndefOr[UserIdStringList]
    var GroupNames: js.UndefOr[GroupNameStringList]
    var OperationType: js.UndefOr[OperationType]
    var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications]
    var Attribute: js.UndefOr[SnapshotAttributeName]
  }

  object ModifySnapshotAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      UserIds: js.UndefOr[UserIdStringList] = js.undefined,
      GroupNames: js.UndefOr[GroupNameStringList] = js.undefined,
      OperationType: js.UndefOr[OperationType] = js.undefined,
      CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.undefined,
      Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined): ModifySnapshotAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "UserIds" -> UserIds.map { x => x.asInstanceOf[js.Any] },
        "GroupNames" -> GroupNames.map { x => x.asInstanceOf[js.Any] },
        "OperationType" -> OperationType.map { x => x.asInstanceOf[js.Any] },
        "CreateVolumePermission" -> CreateVolumePermission.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifySpotFleetRequest.</p>
   */
  @js.native
  trait ModifySpotFleetRequestRequest extends js.Object {
    var ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy]
    var SpotFleetRequestId: js.UndefOr[String]
    var TargetCapacity: js.UndefOr[Int]
  }

  object ModifySpotFleetRequestRequest {
    def apply(
      ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      TargetCapacity: js.UndefOr[Int] = js.undefined): ModifySpotFleetRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] },
        "TargetCapacity" -> TargetCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySpotFleetRequestRequest]
    }
  }

  /**
   * <p>Contains the output of ModifySpotFleetRequest.</p>
   */
  @js.native
  trait ModifySpotFleetRequestResponse extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifySpotFleetRequestResponse {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifySpotFleetRequestResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySpotFleetRequestResponse]
    }
  }

  @js.native
  trait ModifySubnetAttributeRequest extends js.Object {
    var AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue]
    var MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue]
    var SubnetId: js.UndefOr[String]
  }

  object ModifySubnetAttributeRequest {
    def apply(
      AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue] = js.undefined,
      MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): ModifySubnetAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignIpv6AddressOnCreation" -> AssignIpv6AddressOnCreation.map { x => x.asInstanceOf[js.Any] },
        "MapPublicIpOnLaunch" -> MapPublicIpOnLaunch.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySubnetAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyVolumeAttribute.</p>
   */
  @js.native
  trait ModifyVolumeAttributeRequest extends js.Object {
    var AutoEnableIO: js.UndefOr[AttributeBooleanValue]
    var VolumeId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object ModifyVolumeAttributeRequest {
    def apply(
      AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ModifyVolumeAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoEnableIO" -> AutoEnableIO.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVolumeAttributeRequest]
    }
  }

  @js.native
  trait ModifyVolumeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VolumeType: js.UndefOr[VolumeType]
    var Size: js.UndefOr[Int]
    var VolumeId: js.UndefOr[String]
    var Iops: js.UndefOr[Int]
  }

  object ModifyVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      Size: js.UndefOr[Int] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined): ModifyVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVolumeRequest]
    }
  }

  @js.native
  trait ModifyVolumeResult extends js.Object {
    var VolumeModification: js.UndefOr[VolumeModification]
  }

  object ModifyVolumeResult {
    def apply(
      VolumeModification: js.UndefOr[VolumeModification] = js.undefined): ModifyVolumeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeModification" -> VolumeModification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVolumeResult]
    }
  }

  @js.native
  trait ModifyVpcAttributeRequest extends js.Object {
    var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue]
    var EnableDnsSupport: js.UndefOr[AttributeBooleanValue]
    var VpcId: js.UndefOr[String]
  }

  object ModifyVpcAttributeRequest {
    def apply(
      EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.undefined,
      EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): ModifyVpcAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableDnsHostnames" -> EnableDnsHostnames.map { x => x.asInstanceOf[js.Any] },
        "EnableDnsSupport" -> EnableDnsSupport.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcAttributeRequest]
    }
  }

  @js.native
  trait ModifyVpcEndpointConnectionNotificationRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ConnectionNotificationId: js.UndefOr[String]
    var ConnectionNotificationArn: js.UndefOr[String]
    var ConnectionEvents: js.UndefOr[ValueStringList]
  }

  object ModifyVpcEndpointConnectionNotificationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ConnectionNotificationId: js.UndefOr[String] = js.undefined,
      ConnectionNotificationArn: js.UndefOr[String] = js.undefined,
      ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined): ModifyVpcEndpointConnectionNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationId" -> ConnectionNotificationId.map { x => x.asInstanceOf[js.Any] },
        "ConnectionNotificationArn" -> ConnectionNotificationArn.map { x => x.asInstanceOf[js.Any] },
        "ConnectionEvents" -> ConnectionEvents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointConnectionNotificationRequest]
    }
  }

  @js.native
  trait ModifyVpcEndpointConnectionNotificationResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object ModifyVpcEndpointConnectionNotificationResult {
    def apply(
      ReturnValue: js.UndefOr[Boolean] = js.undefined): ModifyVpcEndpointConnectionNotificationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReturnValue" -> ReturnValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointConnectionNotificationResult]
    }
  }

  /**
   * <p>Contains the parameters for ModifyVpcEndpoint.</p>
   */
  @js.native
  trait ModifyVpcEndpointRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcEndpointId: js.UndefOr[String]
    var PolicyDocument: js.UndefOr[String]
    var AddSubnetIds: js.UndefOr[ValueStringList]
    var AddSecurityGroupIds: js.UndefOr[ValueStringList]
    var ResetPolicy: js.UndefOr[Boolean]
    var RemoveSecurityGroupIds: js.UndefOr[ValueStringList]
    var RemoveRouteTableIds: js.UndefOr[ValueStringList]
    var RemoveSubnetIds: js.UndefOr[ValueStringList]
    var PrivateDnsEnabled: js.UndefOr[Boolean]
    var AddRouteTableIds: js.UndefOr[ValueStringList]
  }

  object ModifyVpcEndpointRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      PolicyDocument: js.UndefOr[String] = js.undefined,
      AddSubnetIds: js.UndefOr[ValueStringList] = js.undefined,
      AddSecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined,
      ResetPolicy: js.UndefOr[Boolean] = js.undefined,
      RemoveSecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined,
      RemoveRouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      RemoveSubnetIds: js.UndefOr[ValueStringList] = js.undefined,
      PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined,
      AddRouteTableIds: js.UndefOr[ValueStringList] = js.undefined): ModifyVpcEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointId" -> VpcEndpointId.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "AddSubnetIds" -> AddSubnetIds.map { x => x.asInstanceOf[js.Any] },
        "AddSecurityGroupIds" -> AddSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "ResetPolicy" -> ResetPolicy.map { x => x.asInstanceOf[js.Any] },
        "RemoveSecurityGroupIds" -> RemoveSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "RemoveRouteTableIds" -> RemoveRouteTableIds.map { x => x.asInstanceOf[js.Any] },
        "RemoveSubnetIds" -> RemoveSubnetIds.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsEnabled" -> PrivateDnsEnabled.map { x => x.asInstanceOf[js.Any] },
        "AddRouteTableIds" -> AddRouteTableIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointRequest]
    }
  }

  @js.native
  trait ModifyVpcEndpointResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifyVpcEndpointResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifyVpcEndpointResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointResult]
    }
  }

  @js.native
  trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
    var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var DryRun: js.UndefOr[Boolean]
    var AcceptanceRequired: js.UndefOr[Boolean]
    var ServiceId: js.UndefOr[String]
  }

  object ModifyVpcEndpointServiceConfigurationRequest {
    def apply(
      RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined,
      AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined): ModifyVpcEndpointServiceConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RemoveNetworkLoadBalancerArns" -> RemoveNetworkLoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "AddNetworkLoadBalancerArns" -> AddNetworkLoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
    }
  }

  @js.native
  trait ModifyVpcEndpointServiceConfigurationResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ModifyVpcEndpointServiceConfigurationResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ModifyVpcEndpointServiceConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointServiceConfigurationResult]
    }
  }

  @js.native
  trait ModifyVpcEndpointServicePermissionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ServiceId: js.UndefOr[String]
    var AddAllowedPrincipals: js.UndefOr[ValueStringList]
    var RemoveAllowedPrincipals: js.UndefOr[ValueStringList]
  }

  object ModifyVpcEndpointServicePermissionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined,
      AddAllowedPrincipals: js.UndefOr[ValueStringList] = js.undefined,
      RemoveAllowedPrincipals: js.UndefOr[ValueStringList] = js.undefined): ModifyVpcEndpointServicePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "AddAllowedPrincipals" -> AddAllowedPrincipals.map { x => x.asInstanceOf[js.Any] },
        "RemoveAllowedPrincipals" -> RemoveAllowedPrincipals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointServicePermissionsRequest]
    }
  }

  @js.native
  trait ModifyVpcEndpointServicePermissionsResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object ModifyVpcEndpointServicePermissionsResult {
    def apply(
      ReturnValue: js.UndefOr[Boolean] = js.undefined): ModifyVpcEndpointServicePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReturnValue" -> ReturnValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointServicePermissionsResult]
    }
  }

  @js.native
  trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
    var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest]
    var DryRun: js.UndefOr[Boolean]
    var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  object ModifyVpcPeeringConnectionOptionsRequest {
    def apply(
      AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined): ModifyVpcPeeringConnectionOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccepterPeeringConnectionOptions" -> AccepterPeeringConnectionOptions.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "RequesterPeeringConnectionOptions" -> RequesterPeeringConnectionOptions.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
    }
  }

  @js.native
  trait ModifyVpcPeeringConnectionOptionsResult extends js.Object {
    var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions]
    var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions]
  }

  object ModifyVpcPeeringConnectionOptionsResult {
    def apply(
      AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined,
      RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined): ModifyVpcPeeringConnectionOptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccepterPeeringConnectionOptions" -> AccepterPeeringConnectionOptions.map { x => x.asInstanceOf[js.Any] },
        "RequesterPeeringConnectionOptions" -> RequesterPeeringConnectionOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
    }
  }

  @js.native
  trait ModifyVpcTenancyRequest extends js.Object {
    var VpcId: js.UndefOr[String]
    var InstanceTenancy: js.UndefOr[VpcTenancy]
    var DryRun: js.UndefOr[Boolean]
  }

  object ModifyVpcTenancyRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      InstanceTenancy: js.UndefOr[VpcTenancy] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ModifyVpcTenancyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "InstanceTenancy" -> InstanceTenancy.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcTenancyRequest]
    }
  }

  @js.native
  trait ModifyVpcTenancyResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  object ModifyVpcTenancyResult {
    def apply(
      ReturnValue: js.UndefOr[Boolean] = js.undefined): ModifyVpcTenancyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReturnValue" -> ReturnValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcTenancyResult]
    }
  }

  /**
   * <p>Contains the parameters for MonitorInstances.</p>
   */
  @js.native
  trait MonitorInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object MonitorInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): MonitorInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitorInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of MonitorInstances.</p>
   */
  @js.native
  trait MonitorInstancesResult extends js.Object {
    var InstanceMonitorings: js.UndefOr[InstanceMonitoringList]
  }

  object MonitorInstancesResult {
    def apply(
      InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined): MonitorInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceMonitorings" -> InstanceMonitorings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitorInstancesResult]
    }
  }

  /**
   * <p>Describes the monitoring of an instance.</p>
   */
  @js.native
  trait Monitoring extends js.Object {
    var State: js.UndefOr[MonitoringState]
  }

  object Monitoring {
    def apply(
      State: js.UndefOr[MonitoringState] = js.undefined): Monitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Monitoring]
    }
  }

  object MonitoringStateEnum {
    val disabled = "disabled"
    val disabling = "disabling"
    val enabled = "enabled"
    val pending = "pending"

    val values = IndexedSeq(disabled, disabling, enabled, pending)
  }

  @js.native
  trait MoveAddressToVpcRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var PublicIp: js.UndefOr[String]
  }

  object MoveAddressToVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined): MoveAddressToVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MoveAddressToVpcRequest]
    }
  }

  @js.native
  trait MoveAddressToVpcResult extends js.Object {
    var AllocationId: js.UndefOr[String]
    var Status: js.UndefOr[Status]
  }

  object MoveAddressToVpcResult {
    def apply(
      AllocationId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): MoveAddressToVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MoveAddressToVpcResult]
    }
  }

  object MoveStatusEnum {
    val movingToVpc = "movingToVpc"
    val restoringToClassic = "restoringToClassic"

    val values = IndexedSeq(movingToVpc, restoringToClassic)
  }

  /**
   * <p>Describes the status of a moving Elastic IP address.</p>
   */
  @js.native
  trait MovingAddressStatus extends js.Object {
    var MoveStatus: js.UndefOr[MoveStatus]
    var PublicIp: js.UndefOr[String]
  }

  object MovingAddressStatus {
    def apply(
      MoveStatus: js.UndefOr[MoveStatus] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined): MovingAddressStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MoveStatus" -> MoveStatus.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MovingAddressStatus]
    }
  }

  /**
   * <p>Describes a NAT gateway.</p>
   */
  @js.native
  trait NatGateway extends js.Object {
    var FailureMessage: js.UndefOr[String]
    var FailureCode: js.UndefOr[String]
    var DeleteTime: js.UndefOr[DateTime]
    var NatGatewayId: js.UndefOr[String]
    var NatGatewayAddresses: js.UndefOr[NatGatewayAddressList]
    var ProvisionedBandwidth: js.UndefOr[ProvisionedBandwidth]
    var Tags: js.UndefOr[TagList]
    var CreateTime: js.UndefOr[DateTime]
    var State: js.UndefOr[NatGatewayState]
    var VpcId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object NatGateway {
    def apply(
      FailureMessage: js.UndefOr[String] = js.undefined,
      FailureCode: js.UndefOr[String] = js.undefined,
      DeleteTime: js.UndefOr[DateTime] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      NatGatewayAddresses: js.UndefOr[NatGatewayAddressList] = js.undefined,
      ProvisionedBandwidth: js.UndefOr[ProvisionedBandwidth] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[NatGatewayState] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): NatGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "FailureCode" -> FailureCode.map { x => x.asInstanceOf[js.Any] },
        "DeleteTime" -> DeleteTime.map { x => x.asInstanceOf[js.Any] },
        "NatGatewayId" -> NatGatewayId.map { x => x.asInstanceOf[js.Any] },
        "NatGatewayAddresses" -> NatGatewayAddresses.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedBandwidth" -> ProvisionedBandwidth.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NatGateway]
    }
  }

  /**
   * <p>Describes the IP addresses and network interface associated with a NAT gateway.</p>
   */
  @js.native
  trait NatGatewayAddress extends js.Object {
    var AllocationId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateIp: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  object NatGatewayAddress {
    def apply(
      AllocationId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      PrivateIp: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined): NatGatewayAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "PrivateIp" -> PrivateIp.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NatGatewayAddress]
    }
  }

  object NatGatewayStateEnum {
    val pending = "pending"
    val failed = "failed"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, failed, available, deleting, deleted)
  }

  /**
   * <p>Describes a network ACL.</p>
   */
  @js.native
  trait NetworkAcl extends js.Object {
    var Associations: js.UndefOr[NetworkAclAssociationList]
    var Entries: js.UndefOr[NetworkAclEntryList]
    var NetworkAclId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var IsDefault: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  object NetworkAcl {
    def apply(
      Associations: js.UndefOr[NetworkAclAssociationList] = js.undefined,
      Entries: js.UndefOr[NetworkAclEntryList] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      IsDefault: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): NetworkAcl = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Associations" -> Associations.map { x => x.asInstanceOf[js.Any] },
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAcl]
    }
  }

  /**
   * <p>Describes an association between a network ACL and a subnet.</p>
   */
  @js.native
  trait NetworkAclAssociation extends js.Object {
    var NetworkAclAssociationId: js.UndefOr[String]
    var NetworkAclId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object NetworkAclAssociation {
    def apply(
      NetworkAclAssociationId: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): NetworkAclAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkAclAssociationId" -> NetworkAclAssociationId.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAclAssociation]
    }
  }

  /**
   * <p>Describes an entry in a network ACL.</p>
   */
  @js.native
  trait NetworkAclEntry extends js.Object {
    var Egress: js.UndefOr[Boolean]
    var Ipv6CidrBlock: js.UndefOr[String]
    var PortRange: js.UndefOr[PortRange]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var CidrBlock: js.UndefOr[String]
    var RuleNumber: js.UndefOr[Int]
    var RuleAction: js.UndefOr[RuleAction]
    var Protocol: js.UndefOr[String]
  }

  object NetworkAclEntry {
    def apply(
      Egress: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      PortRange: js.UndefOr[PortRange] = js.undefined,
      IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Int] = js.undefined,
      RuleAction: js.UndefOr[RuleAction] = js.undefined,
      Protocol: js.UndefOr[String] = js.undefined): NetworkAclEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Egress" -> Egress.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "PortRange" -> PortRange.map { x => x.asInstanceOf[js.Any] },
        "IcmpTypeCode" -> IcmpTypeCode.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "RuleNumber" -> RuleNumber.map { x => x.asInstanceOf[js.Any] },
        "RuleAction" -> RuleAction.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAclEntry]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList]
    var InterfaceType: js.UndefOr[NetworkInterfaceType]
    var PrivateIpAddress: js.UndefOr[String]
    var RequesterId: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var TagSet: js.UndefOr[TagList]
    var Description: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList]
    var Groups: js.UndefOr[GroupIdentifierList]
    var RequesterManaged: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Association: js.UndefOr[NetworkInterfaceAssociation]
    var Attachment: js.UndefOr[NetworkInterfaceAttachment]
    var NetworkInterfaceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[Boolean]
    var MacAddress: js.UndefOr[String]
    var Status: js.UndefOr[NetworkInterfaceStatus]
    var VpcId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object NetworkInterface {
    def apply(
      Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList] = js.undefined,
      InterfaceType: js.UndefOr[NetworkInterfaceType] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      RequesterId: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      TagSet: js.UndefOr[TagList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      RequesterManaged: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined,
      Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
      MacAddress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[NetworkInterfaceStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "InterfaceType" -> InterfaceType.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "RequesterId" -> RequesterId.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "TagSet" -> TagSet.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "RequesterManaged" -> RequesterManaged.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "Association" -> Association.map { x => x.asInstanceOf[js.Any] },
        "Attachment" -> Attachment.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] },
        "MacAddress" -> MacAddress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  /**
   * <p>Describes association information for an Elastic IP address (IPv4 only).</p>
   */
  @js.native
  trait NetworkInterfaceAssociation extends js.Object {
    var PublicIp: js.UndefOr[String]
    var AllocationId: js.UndefOr[String]
    var IpOwnerId: js.UndefOr[String]
    var PublicDnsName: js.UndefOr[String]
    var AssociationId: js.UndefOr[String]
  }

  object NetworkInterfaceAssociation {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      IpOwnerId: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined): NetworkInterfaceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "IpOwnerId" -> IpOwnerId.map { x => x.asInstanceOf[js.Any] },
        "PublicDnsName" -> PublicDnsName.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceAssociation]
    }
  }

  /**
   * <p>Describes a network interface attachment.</p>
   */
  @js.native
  trait NetworkInterfaceAttachment extends js.Object {
    var InstanceOwnerId: js.UndefOr[String]
    var AttachmentId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var DeviceIndex: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AttachTime: js.UndefOr[DateTime]
    var Status: js.UndefOr[AttachmentStatus]
  }

  object NetworkInterfaceAttachment {
    def apply(
      InstanceOwnerId: js.UndefOr[String] = js.undefined,
      AttachmentId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[AttachmentStatus] = js.undefined): NetworkInterfaceAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceOwnerId" -> InstanceOwnerId.map { x => x.asInstanceOf[js.Any] },
        "AttachmentId" -> AttachmentId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AttachTime" -> AttachTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceAttachment]
    }
  }

  /**
   * <p>Describes an attachment change.</p>
   */
  @js.native
  trait NetworkInterfaceAttachmentChanges extends js.Object {
    var AttachmentId: js.UndefOr[String]
    var DeleteOnTermination: js.UndefOr[Boolean]
  }

  object NetworkInterfaceAttachmentChanges {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined): NetworkInterfaceAttachmentChanges = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachmentId" -> AttachmentId.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceAttachmentChanges]
    }
  }

  object NetworkInterfaceAttributeEnum {
    val description = "description"
    val groupSet = "groupSet"
    val sourceDestCheck = "sourceDestCheck"
    val attachment = "attachment"

    val values = IndexedSeq(description, groupSet, sourceDestCheck, attachment)
  }

  /**
   * <p>Describes an IPv6 address associated with a network interface.</p>
   */
  @js.native
  trait NetworkInterfaceIpv6Address extends js.Object {
    var Ipv6Address: js.UndefOr[String]
  }

  object NetworkInterfaceIpv6Address {
    def apply(
      Ipv6Address: js.UndefOr[String] = js.undefined): NetworkInterfaceIpv6Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Address" -> Ipv6Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceIpv6Address]
    }
  }

  /**
   * <p>Describes a permission for a network interface.</p>
   */
  @js.native
  trait NetworkInterfacePermission extends js.Object {
    var PermissionState: js.UndefOr[NetworkInterfacePermissionState]
    var AwsAccountId: js.UndefOr[String]
    var NetworkInterfacePermissionId: js.UndefOr[String]
    var Permission: js.UndefOr[InterfacePermissionType]
    var AwsService: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object NetworkInterfacePermission {
    def apply(
      PermissionState: js.UndefOr[NetworkInterfacePermissionState] = js.undefined,
      AwsAccountId: js.UndefOr[String] = js.undefined,
      NetworkInterfacePermissionId: js.UndefOr[String] = js.undefined,
      Permission: js.UndefOr[InterfacePermissionType] = js.undefined,
      AwsService: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): NetworkInterfacePermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PermissionState" -> PermissionState.map { x => x.asInstanceOf[js.Any] },
        "AwsAccountId" -> AwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfacePermissionId" -> NetworkInterfacePermissionId.map { x => x.asInstanceOf[js.Any] },
        "Permission" -> Permission.map { x => x.asInstanceOf[js.Any] },
        "AwsService" -> AwsService.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfacePermission]
    }
  }

  /**
   * <p>Describes the state of a network interface permission.</p>
   */
  @js.native
  trait NetworkInterfacePermissionState extends js.Object {
    var State: js.UndefOr[NetworkInterfacePermissionStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  object NetworkInterfacePermissionState {
    def apply(
      State: js.UndefOr[NetworkInterfacePermissionStateCode] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined): NetworkInterfacePermissionState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfacePermissionState]
    }
  }

  object NetworkInterfacePermissionStateCodeEnum {
    val pending = "pending"
    val granted = "granted"
    val revoking = "revoking"
    val revoked = "revoked"

    val values = IndexedSeq(pending, granted, revoking, revoked)
  }

  /**
   * <p>Describes the private IPv4 address of a network interface.</p>
   */
  @js.native
  trait NetworkInterfacePrivateIpAddress extends js.Object {
    var Association: js.UndefOr[NetworkInterfaceAssociation]
    var Primary: js.UndefOr[Boolean]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  object NetworkInterfacePrivateIpAddress {
    def apply(
      Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined,
      Primary: js.UndefOr[Boolean] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined): NetworkInterfacePrivateIpAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Association" -> Association.map { x => x.asInstanceOf[js.Any] },
        "Primary" -> Primary.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfacePrivateIpAddress]
    }
  }

  object NetworkInterfaceStatusEnum {
    val available = "available"
    val associated = "associated"
    val attaching = "attaching"
    val `in-use` = "in-use"
    val detaching = "detaching"

    val values = IndexedSeq(available, associated, attaching, `in-use`, detaching)
  }

  object NetworkInterfaceTypeEnum {
    val interface = "interface"
    val natGateway = "natGateway"

    val values = IndexedSeq(interface, natGateway)
  }

  @js.native
  trait NewDhcpConfiguration extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[ValueStringList]
  }

  object NewDhcpConfiguration {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[ValueStringList] = js.undefined): NewDhcpConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewDhcpConfiguration]
    }
  }

  object OfferingClassTypeEnum {
    val standard = "standard"
    val convertible = "convertible"

    val values = IndexedSeq(standard, convertible)
  }

  object OfferingTypeValuesEnum {
    val `Heavy Utilization` = "Heavy Utilization"
    val `Medium Utilization` = "Medium Utilization"
    val `Light Utilization` = "Light Utilization"
    val `No Upfront` = "No Upfront"
    val `Partial Upfront` = "Partial Upfront"
    val `All Upfront` = "All Upfront"

    val values = IndexedSeq(`Heavy Utilization`, `Medium Utilization`, `Light Utilization`, `No Upfront`, `Partial Upfront`, `All Upfront`)
  }

  object OnDemandAllocationStrategyEnum {
    val lowestPrice = "lowestPrice"
    val prioritized = "prioritized"

    val values = IndexedSeq(lowestPrice, prioritized)
  }

  /**
   * <p>The allocation strategy of On-Demand Instances in an EC2 Fleet.</p>
   */
  @js.native
  trait OnDemandOptions extends js.Object {
    var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy]
    var SingleInstanceType: js.UndefOr[Boolean]
    var MinTargetCapacity: js.UndefOr[Int]
  }

  object OnDemandOptions {
    def apply(
      AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy] = js.undefined,
      SingleInstanceType: js.UndefOr[Boolean] = js.undefined,
      MinTargetCapacity: js.UndefOr[Int] = js.undefined): OnDemandOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationStrategy" -> AllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "SingleInstanceType" -> SingleInstanceType.map { x => x.asInstanceOf[js.Any] },
        "MinTargetCapacity" -> MinTargetCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OnDemandOptions]
    }
  }

  /**
   * <p>The allocation strategy of On-Demand Instances in an EC2 Fleet.</p>
   */
  @js.native
  trait OnDemandOptionsRequest extends js.Object {
    var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy]
    var SingleInstanceType: js.UndefOr[Boolean]
    var MinTargetCapacity: js.UndefOr[Int]
  }

  object OnDemandOptionsRequest {
    def apply(
      AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy] = js.undefined,
      SingleInstanceType: js.UndefOr[Boolean] = js.undefined,
      MinTargetCapacity: js.UndefOr[Int] = js.undefined): OnDemandOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationStrategy" -> AllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "SingleInstanceType" -> SingleInstanceType.map { x => x.asInstanceOf[js.Any] },
        "MinTargetCapacity" -> MinTargetCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OnDemandOptionsRequest]
    }
  }

  object OperationTypeEnum {
    val add = "add"
    val remove = "remove"

    val values = IndexedSeq(add, remove)
  }

  object PaymentOptionEnum {
    val AllUpfront = "AllUpfront"
    val PartialUpfront = "PartialUpfront"
    val NoUpfront = "NoUpfront"

    val values = IndexedSeq(AllUpfront, PartialUpfront, NoUpfront)
  }

  /**
   * <p>Describes the data that identifies an Amazon FPGA image (AFI) on the PCI bus.</p>
   */
  @js.native
  trait PciId extends js.Object {
    var DeviceId: js.UndefOr[String]
    var VendorId: js.UndefOr[String]
    var SubsystemId: js.UndefOr[String]
    var SubsystemVendorId: js.UndefOr[String]
  }

  object PciId {
    def apply(
      DeviceId: js.UndefOr[String] = js.undefined,
      VendorId: js.UndefOr[String] = js.undefined,
      SubsystemId: js.UndefOr[String] = js.undefined,
      SubsystemVendorId: js.UndefOr[String] = js.undefined): PciId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceId" -> DeviceId.map { x => x.asInstanceOf[js.Any] },
        "VendorId" -> VendorId.map { x => x.asInstanceOf[js.Any] },
        "SubsystemId" -> SubsystemId.map { x => x.asInstanceOf[js.Any] },
        "SubsystemVendorId" -> SubsystemVendorId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PciId]
    }
  }

  /**
   * <p>Describes the VPC peering connection options.</p>
   */
  @js.native
  trait PeeringConnectionOptions extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  object PeeringConnectionOptions {
    def apply(
      AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined): PeeringConnectionOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowDnsResolutionFromRemoteVpc" -> AllowDnsResolutionFromRemoteVpc.map { x => x.asInstanceOf[js.Any] },
        "AllowEgressFromLocalClassicLinkToRemoteVpc" -> AllowEgressFromLocalClassicLinkToRemoteVpc.map { x => x.asInstanceOf[js.Any] },
        "AllowEgressFromLocalVpcToRemoteClassicLink" -> AllowEgressFromLocalVpcToRemoteClassicLink.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeeringConnectionOptions]
    }
  }

  /**
   * <p>The VPC peering connection options.</p>
   */
  @js.native
  trait PeeringConnectionOptionsRequest extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  object PeeringConnectionOptionsRequest {
    def apply(
      AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined): PeeringConnectionOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowDnsResolutionFromRemoteVpc" -> AllowDnsResolutionFromRemoteVpc.map { x => x.asInstanceOf[js.Any] },
        "AllowEgressFromLocalClassicLinkToRemoteVpc" -> AllowEgressFromLocalClassicLinkToRemoteVpc.map { x => x.asInstanceOf[js.Any] },
        "AllowEgressFromLocalVpcToRemoteClassicLink" -> AllowEgressFromLocalVpcToRemoteClassicLink.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeeringConnectionOptionsRequest]
    }
  }

  object PermissionGroupEnum {
    val all = "all"

    val values = IndexedSeq(all)
  }

  /**
   * <p>Describes the placement of an instance.</p>
   */
  @js.native
  trait Placement extends js.Object {
    var GroupName: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
    var Affinity: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var SpreadDomain: js.UndefOr[String]
  }

  object Placement {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[Tenancy] = js.undefined,
      Affinity: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined,
      SpreadDomain: js.UndefOr[String] = js.undefined): Placement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] },
        "Affinity" -> Affinity.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "HostId" -> HostId.map { x => x.asInstanceOf[js.Any] },
        "SpreadDomain" -> SpreadDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Placement]
    }
  }

  /**
   * <p>Describes a placement group.</p>
   */
  @js.native
  trait PlacementGroup extends js.Object {
    var GroupName: js.UndefOr[String]
    var State: js.UndefOr[PlacementGroupState]
    var Strategy: js.UndefOr[PlacementStrategy]
  }

  object PlacementGroup {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[PlacementGroupState] = js.undefined,
      Strategy: js.UndefOr[PlacementStrategy] = js.undefined): PlacementGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Strategy" -> Strategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementGroup]
    }
  }

  object PlacementGroupStateEnum {
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, available, deleting, deleted)
  }

  /**
   * <p>Describes the placement of an instance.</p>
   */
  @js.native
  trait PlacementResponse extends js.Object {
    var GroupName: js.UndefOr[String]
  }

  object PlacementResponse {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined): PlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementResponse]
    }
  }

  object PlacementStrategyEnum {
    val cluster = "cluster"
    val spread = "spread"

    val values = IndexedSeq(cluster, spread)
  }

  object PlatformValuesEnum {
    val Windows = "Windows"

    val values = IndexedSeq(Windows)
  }

  /**
   * <p>Describes a range of ports.</p>
   */
  @js.native
  trait PortRange extends js.Object {
    var From: js.UndefOr[Int]
    var To: js.UndefOr[Int]
  }

  object PortRange {
    def apply(
      From: js.UndefOr[Int] = js.undefined,
      To: js.UndefOr[Int] = js.undefined): PortRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "From" -> From.map { x => x.asInstanceOf[js.Any] },
        "To" -> To.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortRange]
    }
  }

  /**
   * <p>Describes prefixes for AWS services.</p>
   */
  @js.native
  trait PrefixList extends js.Object {
    var Cidrs: js.UndefOr[ValueStringList]
    var PrefixListId: js.UndefOr[String]
    var PrefixListName: js.UndefOr[String]
  }

  object PrefixList {
    def apply(
      Cidrs: js.UndefOr[ValueStringList] = js.undefined,
      PrefixListId: js.UndefOr[String] = js.undefined,
      PrefixListName: js.UndefOr[String] = js.undefined): PrefixList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidrs" -> Cidrs.map { x => x.asInstanceOf[js.Any] },
        "PrefixListId" -> PrefixListId.map { x => x.asInstanceOf[js.Any] },
        "PrefixListName" -> PrefixListName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrefixList]
    }
  }

  /**
   * <p>Describes a prefix list ID.</p>
   */
  @js.native
  trait PrefixListId extends js.Object {
    var Description: js.UndefOr[String]
    var PrefixListId: js.UndefOr[String]
  }

  object PrefixListId {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      PrefixListId: js.UndefOr[String] = js.undefined): PrefixListId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PrefixListId" -> PrefixListId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrefixListId]
    }
  }

  /**
   * <p>Describes the price for a Reserved Instance.</p>
   */
  @js.native
  trait PriceSchedule extends js.Object {
    var Active: js.UndefOr[Boolean]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Price: js.UndefOr[Double]
    var Term: js.UndefOr[Double]
  }

  object PriceSchedule {
    def apply(
      Active: js.UndefOr[Boolean] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Price: js.UndefOr[Double] = js.undefined,
      Term: js.UndefOr[Double] = js.undefined): PriceSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Price" -> Price.map { x => x.asInstanceOf[js.Any] },
        "Term" -> Term.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PriceSchedule]
    }
  }

  /**
   * <p>Describes the price for a Reserved Instance.</p>
   */
  @js.native
  trait PriceScheduleSpecification extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Price: js.UndefOr[Double]
    var Term: js.UndefOr[Double]
  }

  object PriceScheduleSpecification {
    def apply(
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Price: js.UndefOr[Double] = js.undefined,
      Term: js.UndefOr[Double] = js.undefined): PriceScheduleSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Price" -> Price.map { x => x.asInstanceOf[js.Any] },
        "Term" -> Term.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PriceScheduleSpecification]
    }
  }

  /**
   * <p>Describes a Reserved Instance offering.</p>
   */
  @js.native
  trait PricingDetail extends js.Object {
    var Count: js.UndefOr[Int]
    var Price: js.UndefOr[Double]
  }

  object PricingDetail {
    def apply(
      Count: js.UndefOr[Int] = js.undefined,
      Price: js.UndefOr[Double] = js.undefined): PricingDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "Price" -> Price.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PricingDetail]
    }
  }

  /**
   * <p>PrincipalIdFormat description</p>
   */
  @js.native
  trait PrincipalIdFormat extends js.Object {
    var Arn: js.UndefOr[String]
    var Statuses: js.UndefOr[IdFormatList]
  }

  object PrincipalIdFormat {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Statuses: js.UndefOr[IdFormatList] = js.undefined): PrincipalIdFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Statuses" -> Statuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrincipalIdFormat]
    }
  }

  object PrincipalTypeEnum {
    val All = "All"
    val Service = "Service"
    val OrganizationUnit = "OrganizationUnit"
    val Account = "Account"
    val User = "User"
    val Role = "Role"

    val values = IndexedSeq(All, Service, OrganizationUnit, Account, User, Role)
  }

  /**
   * <p>Describes a secondary private IPv4 address for a network interface.</p>
   */
  @js.native
  trait PrivateIpAddressSpecification extends js.Object {
    var Primary: js.UndefOr[Boolean]
    var PrivateIpAddress: js.UndefOr[String]
  }

  object PrivateIpAddressSpecification {
    def apply(
      Primary: js.UndefOr[Boolean] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined): PrivateIpAddressSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Primary" -> Primary.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrivateIpAddressSpecification]
    }
  }

  /**
   * <p>Describes a product code.</p>
   */
  @js.native
  trait ProductCode extends js.Object {
    var ProductCodeId: js.UndefOr[String]
    var ProductCodeType: js.UndefOr[ProductCodeValues]
  }

  object ProductCode {
    def apply(
      ProductCodeId: js.UndefOr[String] = js.undefined,
      ProductCodeType: js.UndefOr[ProductCodeValues] = js.undefined): ProductCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductCodeId" -> ProductCodeId.map { x => x.asInstanceOf[js.Any] },
        "ProductCodeType" -> ProductCodeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductCode]
    }
  }

  object ProductCodeValuesEnum {
    val devpay = "devpay"
    val marketplace = "marketplace"

    val values = IndexedSeq(devpay, marketplace)
  }

  /**
   * <p>Describes a virtual private gateway propagating route.</p>
   */
  @js.native
  trait PropagatingVgw extends js.Object {
    var GatewayId: js.UndefOr[String]
  }

  object PropagatingVgw {
    def apply(
      GatewayId: js.UndefOr[String] = js.undefined): PropagatingVgw = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropagatingVgw]
    }
  }

  @js.native
  trait ProvisionByoipCidrRequest extends js.Object {
    var Cidr: js.UndefOr[String]
    var CidrAuthorizationContext: js.UndefOr[CidrAuthorizationContext]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object ProvisionByoipCidrRequest {
    def apply(
      Cidr: js.UndefOr[String] = js.undefined,
      CidrAuthorizationContext: js.UndefOr[CidrAuthorizationContext] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ProvisionByoipCidrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] },
        "CidrAuthorizationContext" -> CidrAuthorizationContext.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionByoipCidrRequest]
    }
  }

  @js.native
  trait ProvisionByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object ProvisionByoipCidrResult {
    def apply(
      ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined): ProvisionByoipCidrResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByoipCidr" -> ByoipCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionByoipCidrResult]
    }
  }

  /**
   * <p>Reserved. If you need to sustain traffic greater than the <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>, contact us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.</p>
   */
  @js.native
  trait ProvisionedBandwidth extends js.Object {
    var RequestTime: js.UndefOr[DateTime]
    var Provisioned: js.UndefOr[String]
    var ProvisionTime: js.UndefOr[DateTime]
    var Requested: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ProvisionedBandwidth {
    def apply(
      RequestTime: js.UndefOr[DateTime] = js.undefined,
      Provisioned: js.UndefOr[String] = js.undefined,
      ProvisionTime: js.UndefOr[DateTime] = js.undefined,
      Requested: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): ProvisionedBandwidth = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestTime" -> RequestTime.map { x => x.asInstanceOf[js.Any] },
        "Provisioned" -> Provisioned.map { x => x.asInstanceOf[js.Any] },
        "ProvisionTime" -> ProvisionTime.map { x => x.asInstanceOf[js.Any] },
        "Requested" -> Requested.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedBandwidth]
    }
  }

  /**
   * <p>Describes an address pool.</p>
   */
  @js.native
  trait PublicIpv4Pool extends js.Object {
    var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet]
    var TotalAvailableAddressCount: js.UndefOr[Int]
    var Description: js.UndefOr[String]
    var TotalAddressCount: js.UndefOr[Int]
    var PoolId: js.UndefOr[String]
  }

  object PublicIpv4Pool {
    def apply(
      PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet] = js.undefined,
      TotalAvailableAddressCount: js.UndefOr[Int] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      TotalAddressCount: js.UndefOr[Int] = js.undefined,
      PoolId: js.UndefOr[String] = js.undefined): PublicIpv4Pool = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolAddressRanges" -> PoolAddressRanges.map { x => x.asInstanceOf[js.Any] },
        "TotalAvailableAddressCount" -> TotalAvailableAddressCount.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "TotalAddressCount" -> TotalAddressCount.map { x => x.asInstanceOf[js.Any] },
        "PoolId" -> PoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicIpv4Pool]
    }
  }

  /**
   * <p>Describes an address range of an IPv4 address pool.</p>
   */
  @js.native
  trait PublicIpv4PoolRange extends js.Object {
    var FirstAddress: js.UndefOr[String]
    var LastAddress: js.UndefOr[String]
    var AddressCount: js.UndefOr[Int]
    var AvailableAddressCount: js.UndefOr[Int]
  }

  object PublicIpv4PoolRange {
    def apply(
      FirstAddress: js.UndefOr[String] = js.undefined,
      LastAddress: js.UndefOr[String] = js.undefined,
      AddressCount: js.UndefOr[Int] = js.undefined,
      AvailableAddressCount: js.UndefOr[Int] = js.undefined): PublicIpv4PoolRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FirstAddress" -> FirstAddress.map { x => x.asInstanceOf[js.Any] },
        "LastAddress" -> LastAddress.map { x => x.asInstanceOf[js.Any] },
        "AddressCount" -> AddressCount.map { x => x.asInstanceOf[js.Any] },
        "AvailableAddressCount" -> AvailableAddressCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicIpv4PoolRange]
    }
  }

  /**
   * <p>Describes the result of the purchase.</p>
   */
  @js.native
  trait Purchase extends js.Object {
    var PaymentOption: js.UndefOr[PaymentOption]
    var HostReservationId: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Int]
    var InstanceFamily: js.UndefOr[String]
    var UpfrontPrice: js.UndefOr[String]
    var HostIdSet: js.UndefOr[ResponseHostIdSet]
    var HourlyPrice: js.UndefOr[String]
  }

  object Purchase {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      HostReservationId: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      InstanceFamily: js.UndefOr[String] = js.undefined,
      UpfrontPrice: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined): Purchase = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "HostReservationId" -> HostReservationId.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "InstanceFamily" -> InstanceFamily.map { x => x.asInstanceOf[js.Any] },
        "UpfrontPrice" -> UpfrontPrice.map { x => x.asInstanceOf[js.Any] },
        "HostIdSet" -> HostIdSet.map { x => x.asInstanceOf[js.Any] },
        "HourlyPrice" -> HourlyPrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Purchase]
    }
  }

  @js.native
  trait PurchaseHostReservationRequest extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var ClientToken: js.UndefOr[String]
    var HostIdSet: js.UndefOr[RequestHostIdSet]
    var OfferingId: js.UndefOr[String]
    var LimitPrice: js.UndefOr[String]
  }

  object PurchaseHostReservationRequest {
    def apply(
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[RequestHostIdSet] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined,
      LimitPrice: js.UndefOr[String] = js.undefined): PurchaseHostReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "HostIdSet" -> HostIdSet.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] },
        "LimitPrice" -> LimitPrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseHostReservationRequest]
    }
  }

  @js.native
  trait PurchaseHostReservationResult extends js.Object {
    var Purchase: js.UndefOr[PurchaseSet]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var TotalUpfrontPrice: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var TotalHourlyPrice: js.UndefOr[String]
  }

  object PurchaseHostReservationResult {
    def apply(
      Purchase: js.UndefOr[PurchaseSet] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      TotalUpfrontPrice: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      TotalHourlyPrice: js.UndefOr[String] = js.undefined): PurchaseHostReservationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Purchase" -> Purchase.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "TotalUpfrontPrice" -> TotalUpfrontPrice.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "TotalHourlyPrice" -> TotalHourlyPrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseHostReservationResult]
    }
  }

  /**
   * <p>Describes a request to purchase Scheduled Instances.</p>
   */
  @js.native
  trait PurchaseRequest extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var PurchaseToken: js.UndefOr[String]
  }

  object PurchaseRequest {
    def apply(
      InstanceCount: js.UndefOr[Int] = js.undefined,
      PurchaseToken: js.UndefOr[String] = js.undefined): PurchaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "PurchaseToken" -> PurchaseToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseRequest]
    }
  }

  /**
   * <p>Contains the parameters for PurchaseReservedInstancesOffering.</p>
   */
  @js.native
  trait PurchaseReservedInstancesOfferingRequest extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var ReservedInstancesOfferingId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LimitPrice: js.UndefOr[ReservedInstanceLimitPrice]
  }

  object PurchaseReservedInstancesOfferingRequest {
    def apply(
      InstanceCount: js.UndefOr[Int] = js.undefined,
      ReservedInstancesOfferingId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LimitPrice: js.UndefOr[ReservedInstanceLimitPrice] = js.undefined): PurchaseReservedInstancesOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesOfferingId" -> ReservedInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "LimitPrice" -> LimitPrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedInstancesOfferingRequest]
    }
  }

  /**
   * <p>Contains the output of PurchaseReservedInstancesOffering.</p>
   */
  @js.native
  trait PurchaseReservedInstancesOfferingResult extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
  }

  object PurchaseReservedInstancesOfferingResult {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined): PurchaseReservedInstancesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedInstancesOfferingResult]
    }
  }

  /**
   * <p>Contains the parameters for PurchaseScheduledInstances.</p>
   */
  @js.native
  trait PurchaseScheduledInstancesRequest extends js.Object {
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PurchaseRequests: js.UndefOr[PurchaseRequestSet]
  }

  object PurchaseScheduledInstancesRequest {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PurchaseRequests: js.UndefOr[PurchaseRequestSet] = js.undefined): PurchaseScheduledInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PurchaseRequests" -> PurchaseRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseScheduledInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of PurchaseScheduledInstances.</p>
   */
  @js.native
  trait PurchaseScheduledInstancesResult extends js.Object {
    var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet]
  }

  object PurchaseScheduledInstancesResult {
    def apply(
      ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.undefined): PurchaseScheduledInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduledInstanceSet" -> ScheduledInstanceSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseScheduledInstancesResult]
    }
  }

  object RIProductDescriptionEnum {
    val `Linux/UNIX` = "Linux/UNIX"
    val `Linux/UNIX (Amazon VPC)` = "Linux/UNIX (Amazon VPC)"
    val Windows = "Windows"
    val `Windows (Amazon VPC)` = "Windows (Amazon VPC)"

    val values = IndexedSeq(`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`)
  }

  /**
   * <p>Contains the parameters for RebootInstances.</p>
   */
  @js.native
  trait RebootInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object RebootInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): RebootInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstancesRequest]
    }
  }

  /**
   * <p>Describes a recurring charge.</p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var Amount: js.UndefOr[Double]
    var Frequency: js.UndefOr[RecurringChargeFrequency]
  }

  object RecurringCharge {
    def apply(
      Amount: js.UndefOr[Double] = js.undefined,
      Frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Amount" -> Amount.map { x => x.asInstanceOf[js.Any] },
        "Frequency" -> Frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  object RecurringChargeFrequencyEnum {
    val Hourly = "Hourly"

    val values = IndexedSeq(Hourly)
  }

  /**
   * <p>Describes a region.</p>
   */
  @js.native
  trait Region extends js.Object {
    var Endpoint: js.UndefOr[String]
    var RegionName: js.UndefOr[String]
  }

  object Region {
    def apply(
      Endpoint: js.UndefOr[String] = js.undefined,
      RegionName: js.UndefOr[String] = js.undefined): Region = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Region]
    }
  }

  /**
   * <p>Contains the parameters for RegisterImage.</p>
   */
  @js.native
  trait RegisterImageRequest extends js.Object {
    var Architecture: js.UndefOr[ArchitectureValues]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList]
    var DryRun: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var RootDeviceName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KernelId: js.UndefOr[String]
    var BillingProducts: js.UndefOr[BillingProductList]
    var EnaSupport: js.UndefOr[Boolean]
    var VirtualizationType: js.UndefOr[String]
    var ImageLocation: js.UndefOr[String]
    var SriovNetSupport: js.UndefOr[String]
  }

  object RegisterImageRequest {
    def apply(
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RootDeviceName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      BillingProducts: js.UndefOr[BillingProductList] = js.undefined,
      EnaSupport: js.UndefOr[Boolean] = js.undefined,
      VirtualizationType: js.UndefOr[String] = js.undefined,
      ImageLocation: js.UndefOr[String] = js.undefined,
      SriovNetSupport: js.UndefOr[String] = js.undefined): RegisterImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Architecture" -> Architecture.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RootDeviceName" -> RootDeviceName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "BillingProducts" -> BillingProducts.map { x => x.asInstanceOf[js.Any] },
        "EnaSupport" -> EnaSupport.map { x => x.asInstanceOf[js.Any] },
        "VirtualizationType" -> VirtualizationType.map { x => x.asInstanceOf[js.Any] },
        "ImageLocation" -> ImageLocation.map { x => x.asInstanceOf[js.Any] },
        "SriovNetSupport" -> SriovNetSupport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterImageRequest]
    }
  }

  /**
   * <p>Contains the output of RegisterImage.</p>
   */
  @js.native
  trait RegisterImageResult extends js.Object {
    var ImageId: js.UndefOr[String]
  }

  object RegisterImageResult {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined): RegisterImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterImageResult]
    }
  }

  @js.native
  trait RejectVpcEndpointConnectionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ServiceId: js.UndefOr[String]
    var VpcEndpointIds: js.UndefOr[ValueStringList]
  }

  object RejectVpcEndpointConnectionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined,
      VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined): RejectVpcEndpointConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointIds" -> VpcEndpointIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectVpcEndpointConnectionsRequest]
    }
  }

  @js.native
  trait RejectVpcEndpointConnectionsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  object RejectVpcEndpointConnectionsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined): RejectVpcEndpointConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectVpcEndpointConnectionsResult]
    }
  }

  @js.native
  trait RejectVpcPeeringConnectionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  object RejectVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined): RejectVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectVpcPeeringConnectionRequest]
    }
  }

  @js.native
  trait RejectVpcPeeringConnectionResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object RejectVpcPeeringConnectionResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): RejectVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectVpcPeeringConnectionResult]
    }
  }

  @js.native
  trait ReleaseAddressRequest extends js.Object {
    var AllocationId: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object ReleaseAddressRequest {
    def apply(
      AllocationId: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ReleaseAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseAddressRequest]
    }
  }

  @js.native
  trait ReleaseHostsRequest extends js.Object {
    var HostIds: js.UndefOr[RequestHostIdList]
  }

  object ReleaseHostsRequest {
    def apply(
      HostIds: js.UndefOr[RequestHostIdList] = js.undefined): ReleaseHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostIds" -> HostIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseHostsRequest]
    }
  }

  @js.native
  trait ReleaseHostsResult extends js.Object {
    var Successful: js.UndefOr[ResponseHostIdList]
    var Unsuccessful: js.UndefOr[UnsuccessfulItemList]
  }

  object ReleaseHostsResult {
    def apply(
      Successful: js.UndefOr[ResponseHostIdList] = js.undefined,
      Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.undefined): ReleaseHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] },
        "Unsuccessful" -> Unsuccessful.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseHostsResult]
    }
  }

  @js.native
  trait ReplaceIamInstanceProfileAssociationRequest extends js.Object {
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var AssociationId: js.UndefOr[String]
  }

  object ReplaceIamInstanceProfileAssociationRequest {
    def apply(
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined): ReplaceIamInstanceProfileAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceIamInstanceProfileAssociationRequest]
    }
  }

  @js.native
  trait ReplaceIamInstanceProfileAssociationResult extends js.Object {
    var IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation]
  }

  object ReplaceIamInstanceProfileAssociationResult {
    def apply(
      IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation] = js.undefined): ReplaceIamInstanceProfileAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfileAssociation" -> IamInstanceProfileAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceIamInstanceProfileAssociationResult]
    }
  }

  @js.native
  trait ReplaceNetworkAclAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var NetworkAclId: js.UndefOr[String]
  }

  object ReplaceNetworkAclAssociationRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined): ReplaceNetworkAclAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceNetworkAclAssociationRequest]
    }
  }

  @js.native
  trait ReplaceNetworkAclAssociationResult extends js.Object {
    var NewAssociationId: js.UndefOr[String]
  }

  object ReplaceNetworkAclAssociationResult {
    def apply(
      NewAssociationId: js.UndefOr[String] = js.undefined): ReplaceNetworkAclAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewAssociationId" -> NewAssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceNetworkAclAssociationResult]
    }
  }

  @js.native
  trait ReplaceNetworkAclEntryRequest extends js.Object {
    var Egress: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var Ipv6CidrBlock: js.UndefOr[String]
    var PortRange: js.UndefOr[PortRange]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var CidrBlock: js.UndefOr[String]
    var NetworkAclId: js.UndefOr[String]
    var RuleNumber: js.UndefOr[Int]
    var RuleAction: js.UndefOr[RuleAction]
    var Protocol: js.UndefOr[String]
  }

  object ReplaceNetworkAclEntryRequest {
    def apply(
      Egress: js.UndefOr[Boolean] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      PortRange: js.UndefOr[PortRange] = js.undefined,
      IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Int] = js.undefined,
      RuleAction: js.UndefOr[RuleAction] = js.undefined,
      Protocol: js.UndefOr[String] = js.undefined): ReplaceNetworkAclEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Egress" -> Egress.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "PortRange" -> PortRange.map { x => x.asInstanceOf[js.Any] },
        "IcmpTypeCode" -> IcmpTypeCode.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "NetworkAclId" -> NetworkAclId.map { x => x.asInstanceOf[js.Any] },
        "RuleNumber" -> RuleNumber.map { x => x.asInstanceOf[js.Any] },
        "RuleAction" -> RuleAction.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceNetworkAclEntryRequest]
    }
  }

  @js.native
  trait ReplaceRouteRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var DestinationCidrBlock: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
    var NatGatewayId: js.UndefOr[String]
    var EgressOnlyInternetGatewayId: js.UndefOr[String]
    var RouteTableId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var GatewayId: js.UndefOr[String]
  }

  object ReplaceRouteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined): ReplaceRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] },
        "NatGatewayId" -> NatGatewayId.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceRouteRequest]
    }
  }

  @js.native
  trait ReplaceRouteTableAssociationRequest extends js.Object {
    var AssociationId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var RouteTableId: js.UndefOr[String]
  }

  object ReplaceRouteTableAssociationRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined): ReplaceRouteTableAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceRouteTableAssociationRequest]
    }
  }

  @js.native
  trait ReplaceRouteTableAssociationResult extends js.Object {
    var NewAssociationId: js.UndefOr[String]
  }

  object ReplaceRouteTableAssociationResult {
    def apply(
      NewAssociationId: js.UndefOr[String] = js.undefined): ReplaceRouteTableAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewAssociationId" -> NewAssociationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceRouteTableAssociationResult]
    }
  }

  object ReportInstanceReasonCodesEnum {
    val `instance-stuck-in-state` = "instance-stuck-in-state"
    val unresponsive = "unresponsive"
    val `not-accepting-credentials` = "not-accepting-credentials"
    val `password-not-available` = "password-not-available"
    val `performance-network` = "performance-network"
    val `performance-instance-store` = "performance-instance-store"
    val `performance-ebs-volume` = "performance-ebs-volume"
    val `performance-other` = "performance-other"
    val other = "other"

    val values = IndexedSeq(`instance-stuck-in-state`, unresponsive, `not-accepting-credentials`, `password-not-available`, `performance-network`, `performance-instance-store`, `performance-ebs-volume`, `performance-other`, other)
  }

  /**
   * <p>Contains the parameters for ReportInstanceStatus.</p>
   */
  @js.native
  trait ReportInstanceStatusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var StartTime: js.UndefOr[DateTime]
    var EndTime: js.UndefOr[DateTime]
    var Instances: js.UndefOr[InstanceIdStringList]
    var Status: js.UndefOr[ReportStatusType]
    var ReasonCodes: js.UndefOr[ReasonCodesList]
  }

  object ReportInstanceStatusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      Instances: js.UndefOr[InstanceIdStringList] = js.undefined,
      Status: js.UndefOr[ReportStatusType] = js.undefined,
      ReasonCodes: js.UndefOr[ReasonCodesList] = js.undefined): ReportInstanceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "ReasonCodes" -> ReasonCodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportInstanceStatusRequest]
    }
  }

  object ReportStatusTypeEnum {
    val ok = "ok"
    val impaired = "impaired"

    val values = IndexedSeq(ok, impaired)
  }

  /**
   * <p>The information to include in the launch template.</p>
   */
  @js.native
  trait RequestLaunchTemplateData extends js.Object {
    var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList]
    var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList]
    var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest]
    var CreditSpecification: js.UndefOr[CreditSpecificationRequest]
    var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList]
    var ImageId: js.UndefOr[String]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var EbsOptimized: js.UndefOr[Boolean]
    var Placement: js.UndefOr[LaunchTemplatePlacementRequest]
    var RamDiskId: js.UndefOr[String]
    var DisableApiTermination: js.UndefOr[Boolean]
    var UserData: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[SecurityGroupStringList]
    var KernelId: js.UndefOr[String]
    var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList]
    var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest]
    var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest]
    var CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest]
  }

  object RequestLaunchTemplateData {
    def apply(
      NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList] = js.undefined,
      BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList] = js.undefined,
      CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest] = js.undefined,
      CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined,
      TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[LaunchTemplatePlacementRequest] = js.undefined,
      RamDiskId: js.UndefOr[String] = js.undefined,
      DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest] = js.undefined,
      IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest] = js.undefined,
      CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest] = js.undefined): RequestLaunchTemplateData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationSpecification" -> CapacityReservationSpecification.map { x => x.asInstanceOf[js.Any] },
        "CreditSpecification" -> CreditSpecification.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "RamDiskId" -> RamDiskId.map { x => x.asInstanceOf[js.Any] },
        "DisableApiTermination" -> DisableApiTermination.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "InstanceMarketOptions" -> InstanceMarketOptions.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuSpecifications" -> ElasticGpuSpecifications.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "CpuOptions" -> CpuOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestLaunchTemplateData]
    }
  }

  /**
   * <p>Contains the parameters for RequestSpotFleet.</p>
   */
  @js.native
  trait RequestSpotFleetRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData]
  }

  object RequestSpotFleetRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.undefined): RequestSpotFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestConfig" -> SpotFleetRequestConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotFleetRequest]
    }
  }

  /**
   * <p>Contains the output of RequestSpotFleet.</p>
   */
  @js.native
  trait RequestSpotFleetResponse extends js.Object {
    var SpotFleetRequestId: js.UndefOr[String]
  }

  object RequestSpotFleetResponse {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined): RequestSpotFleetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotFleetResponse]
    }
  }

  /**
   * <p>Contains the parameters for RequestSpotInstances.</p>
   */
  @js.native
  trait RequestSpotInstancesRequest extends js.Object {
    var LaunchGroup: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var AvailabilityZoneGroup: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var InstanceCount: js.UndefOr[Int]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var ValidUntil: js.UndefOr[DateTime]
    var ValidFrom: js.UndefOr[DateTime]
    var SpotPrice: js.UndefOr[String]
    var BlockDurationMinutes: js.UndefOr[Int]
    var LaunchSpecification: js.UndefOr[RequestSpotLaunchSpecification]
    var Type: js.UndefOr[SpotInstanceType]
  }

  object RequestSpotInstancesRequest {
    def apply(
      LaunchGroup: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZoneGroup: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Int] = js.undefined,
      LaunchSpecification: js.UndefOr[RequestSpotLaunchSpecification] = js.undefined,
      Type: js.UndefOr[SpotInstanceType] = js.undefined): RequestSpotInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchGroup" -> LaunchGroup.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZoneGroup" -> AvailabilityZoneGroup.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "ValidFrom" -> ValidFrom.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "BlockDurationMinutes" -> BlockDurationMinutes.map { x => x.asInstanceOf[js.Any] },
        "LaunchSpecification" -> LaunchSpecification.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of RequestSpotInstances.</p>
   */
  @js.native
  trait RequestSpotInstancesResult extends js.Object {
    var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList]
  }

  object RequestSpotInstancesResult {
    def apply(
      SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined): RequestSpotInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotInstanceRequests" -> SpotInstanceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotInstancesResult]
    }
  }

  /**
   * <p>Describes the launch specification for an instance.</p>
   */
  @js.native
  trait RequestSpotLaunchSpecification extends js.Object {
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var ImageId: js.UndefOr[String]
    var EbsOptimized: js.UndefOr[Boolean]
    var Placement: js.UndefOr[SpotPlacement]
    var UserData: js.UndefOr[String]
    var AddressingType: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[ValueStringList]
    var KernelId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[ValueStringList]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var SubnetId: js.UndefOr[String]
  }

  object RequestSpotLaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[SpotPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      AddressingType: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[ValueStringList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): RequestSpotLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "AddressingType" -> AddressingType.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotLaunchSpecification]
    }
  }

  /**
   * <p>Describes a reservation.</p>
   */
  @js.native
  trait Reservation extends js.Object {
    var RequesterId: js.UndefOr[String]
    var Groups: js.UndefOr[GroupIdentifierList]
    var OwnerId: js.UndefOr[String]
    var Instances: js.UndefOr[InstanceList]
    var ReservationId: js.UndefOr[String]
  }

  object Reservation {
    def apply(
      RequesterId: js.UndefOr[String] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Instances: js.UndefOr[InstanceList] = js.undefined,
      ReservationId: js.UndefOr[String] = js.undefined): Reservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterId" -> RequesterId.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "ReservationId" -> ReservationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Reservation]
    }
  }

  object ReservationStateEnum {
    val `payment-pending` = "payment-pending"
    val `payment-failed` = "payment-failed"
    val active = "active"
    val retired = "retired"

    val values = IndexedSeq(`payment-pending`, `payment-failed`, active, retired)
  }

  /**
   * <p>The cost associated with the Reserved Instance.</p>
   */
  @js.native
  trait ReservationValue extends js.Object {
    var HourlyPrice: js.UndefOr[String]
    var RemainingTotalValue: js.UndefOr[String]
    var RemainingUpfrontValue: js.UndefOr[String]
  }

  object ReservationValue {
    def apply(
      HourlyPrice: js.UndefOr[String] = js.undefined,
      RemainingTotalValue: js.UndefOr[String] = js.undefined,
      RemainingUpfrontValue: js.UndefOr[String] = js.undefined): ReservationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HourlyPrice" -> HourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "RemainingTotalValue" -> RemainingTotalValue.map { x => x.asInstanceOf[js.Any] },
        "RemainingUpfrontValue" -> RemainingUpfrontValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationValue]
    }
  }

  /**
   * <p>Describes the limit price of a Reserved Instance offering.</p>
   */
  @js.native
  trait ReservedInstanceLimitPrice extends js.Object {
    var Amount: js.UndefOr[Double]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
  }

  object ReservedInstanceLimitPrice {
    def apply(
      Amount: js.UndefOr[Double] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined): ReservedInstanceLimitPrice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Amount" -> Amount.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstanceLimitPrice]
    }
  }

  /**
   * <p>The total value of the Convertible Reserved Instance.</p>
   */
  @js.native
  trait ReservedInstanceReservationValue extends js.Object {
    var ReservationValue: js.UndefOr[ReservationValue]
    var ReservedInstanceId: js.UndefOr[String]
  }

  object ReservedInstanceReservationValue {
    def apply(
      ReservationValue: js.UndefOr[ReservationValue] = js.undefined,
      ReservedInstanceId: js.UndefOr[String] = js.undefined): ReservedInstanceReservationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservationValue" -> ReservationValue.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstanceId" -> ReservedInstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstanceReservationValue]
    }
  }

  object ReservedInstanceStateEnum {
    val `payment-pending` = "payment-pending"
    val active = "active"
    val `payment-failed` = "payment-failed"
    val retired = "retired"

    val values = IndexedSeq(`payment-pending`, active, `payment-failed`, retired)
  }

  /**
   * <p>Describes a Reserved Instance.</p>
   */
  @js.native
  trait ReservedInstances extends js.Object {
    var Scope: js.UndefOr[scope]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Double]
    var FixedPrice: js.UndefOr[Float]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var RecurringCharges: js.UndefOr[RecurringChargesList]
    var InstanceCount: js.UndefOr[Int]
    var Start: js.UndefOr[DateTime]
    var AvailabilityZone: js.UndefOr[String]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var UsagePrice: js.UndefOr[Float]
    var InstanceType: js.UndefOr[InstanceType]
    var End: js.UndefOr[DateTime]
    var Tags: js.UndefOr[TagList]
    var State: js.UndefOr[ReservedInstanceState]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var ReservedInstancesId: js.UndefOr[String]
    var InstanceTenancy: js.UndefOr[Tenancy]
  }

  object ReservedInstances {
    def apply(
      Scope: js.UndefOr[scope] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Double] = js.undefined,
      FixedPrice: js.UndefOr[Float] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargesList] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      Start: js.UndefOr[DateTime] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      UsagePrice: js.UndefOr[Float] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      End: js.UndefOr[DateTime] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      State: js.UndefOr[ReservedInstanceState] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined): ReservedInstances = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "OfferingClass" -> OfferingClass.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "Start" -> Start.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "End" -> End.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] },
        "InstanceTenancy" -> InstanceTenancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstances]
    }
  }

  /**
   * <p>Describes the configuration settings for the modified Reserved Instances.</p>
   */
  @js.native
  trait ReservedInstancesConfiguration extends js.Object {
    var Scope: js.UndefOr[scope]
    var Platform: js.UndefOr[String]
    var InstanceCount: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
  }

  object ReservedInstancesConfiguration {
    def apply(
      Scope: js.UndefOr[scope] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined): ReservedInstancesConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesConfiguration]
    }
  }

  /**
   * <p>Describes the ID of a Reserved Instance.</p>
   */
  @js.native
  trait ReservedInstancesId extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
  }

  object ReservedInstancesId {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined): ReservedInstancesId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesId]
    }
  }

  /**
   * <p>Describes a Reserved Instance listing.</p>
   */
  @js.native
  trait ReservedInstancesListing extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var PriceSchedules: js.UndefOr[PriceScheduleList]
    var UpdateDate: js.UndefOr[DateTime]
    var InstanceCounts: js.UndefOr[InstanceCountList]
    var CreateDate: js.UndefOr[DateTime]
    var Tags: js.UndefOr[TagList]
    var ReservedInstancesListingId: js.UndefOr[String]
    var ReservedInstancesId: js.UndefOr[String]
    var Status: js.UndefOr[ListingStatus]
  }

  object ReservedInstancesListing {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      PriceSchedules: js.UndefOr[PriceScheduleList] = js.undefined,
      UpdateDate: js.UndefOr[DateTime] = js.undefined,
      InstanceCounts: js.UndefOr[InstanceCountList] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ReservedInstancesListingId: js.UndefOr[String] = js.undefined,
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[ListingStatus] = js.undefined): ReservedInstancesListing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "PriceSchedules" -> PriceSchedules.map { x => x.asInstanceOf[js.Any] },
        "UpdateDate" -> UpdateDate.map { x => x.asInstanceOf[js.Any] },
        "InstanceCounts" -> InstanceCounts.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesListingId" -> ReservedInstancesListingId.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesListing]
    }
  }

  /**
   * <p>Describes a Reserved Instance modification.</p>
   */
  @js.native
  trait ReservedInstancesModification extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var UpdateDate: js.UndefOr[DateTime]
    var CreateDate: js.UndefOr[DateTime]
    var EffectiveDate: js.UndefOr[DateTime]
    var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList]
    var ReservedInstancesModificationId: js.UndefOr[String]
    var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds]
    var Status: js.UndefOr[String]
  }

  object ReservedInstancesModification {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      UpdateDate: js.UndefOr[DateTime] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      EffectiveDate: js.UndefOr[DateTime] = js.undefined,
      ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.undefined,
      ReservedInstancesModificationId: js.UndefOr[String] = js.undefined,
      ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): ReservedInstancesModification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "UpdateDate" -> UpdateDate.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "EffectiveDate" -> EffectiveDate.map { x => x.asInstanceOf[js.Any] },
        "ModificationResults" -> ModificationResults.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesModificationId" -> ReservedInstancesModificationId.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesIds" -> ReservedInstancesIds.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesModification]
    }
  }

  /**
   * <p>Describes the modification request/s.</p>
   */
  @js.native
  trait ReservedInstancesModificationResult extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
    var TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration]
  }

  object ReservedInstancesModificationResult {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration] = js.undefined): ReservedInstancesModificationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedInstancesId" -> ReservedInstancesId.map { x => x.asInstanceOf[js.Any] },
        "TargetConfiguration" -> TargetConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesModificationResult]
    }
  }

  /**
   * <p>Describes a Reserved Instance offering.</p>
   */
  @js.native
  trait ReservedInstancesOffering extends js.Object {
    var Scope: js.UndefOr[scope]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Double]
    var FixedPrice: js.UndefOr[Float]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var RecurringCharges: js.UndefOr[RecurringChargesList]
    var AvailabilityZone: js.UndefOr[String]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var PricingDetails: js.UndefOr[PricingDetailsList]
    var UsagePrice: js.UndefOr[Float]
    var InstanceType: js.UndefOr[InstanceType]
    var ReservedInstancesOfferingId: js.UndefOr[String]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var Marketplace: js.UndefOr[Boolean]
    var InstanceTenancy: js.UndefOr[Tenancy]
  }

  object ReservedInstancesOffering {
    def apply(
      Scope: js.UndefOr[scope] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Double] = js.undefined,
      FixedPrice: js.UndefOr[Float] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargesList] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      PricingDetails: js.UndefOr[PricingDetailsList] = js.undefined,
      UsagePrice: js.UndefOr[Float] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      ReservedInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      Marketplace: js.UndefOr[Boolean] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined): ReservedInstancesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "OfferingClass" -> OfferingClass.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "PricingDetails" -> PricingDetails.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "ReservedInstancesOfferingId" -> ReservedInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "Marketplace" -> Marketplace.map { x => x.asInstanceOf[js.Any] },
        "InstanceTenancy" -> InstanceTenancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesOffering]
    }
  }

  object ResetFpgaImageAttributeNameEnum {
    val loadPermission = "loadPermission"

    val values = IndexedSeq(loadPermission)
  }

  @js.native
  trait ResetFpgaImageAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var FpgaImageId: js.UndefOr[String]
    var Attribute: js.UndefOr[ResetFpgaImageAttributeName]
  }

  object ResetFpgaImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      FpgaImageId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[ResetFpgaImageAttributeName] = js.undefined): ResetFpgaImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "FpgaImageId" -> FpgaImageId.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetFpgaImageAttributeRequest]
    }
  }

  @js.native
  trait ResetFpgaImageAttributeResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object ResetFpgaImageAttributeResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): ResetFpgaImageAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetFpgaImageAttributeResult]
    }
  }

  object ResetImageAttributeNameEnum {
    val launchPermission = "launchPermission"

    val values = IndexedSeq(launchPermission)
  }

  /**
   * <p>Contains the parameters for ResetImageAttribute.</p>
   */
  @js.native
  trait ResetImageAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[ResetImageAttributeName]
    var ImageId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object ResetImageAttributeRequest {
    def apply(
      Attribute: js.UndefOr[ResetImageAttributeName] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ResetImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetImageAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ResetInstanceAttribute.</p>
   */
  @js.native
  trait ResetInstanceAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[InstanceAttributeName]
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
  }

  object ResetInstanceAttributeRequest {
    def apply(
      Attribute: js.UndefOr[InstanceAttributeName] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined): ResetInstanceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetInstanceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ResetNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait ResetNetworkInterfaceAttributeRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[String]
  }

  object ResetNetworkInterfaceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[String] = js.undefined): ResetNetworkInterfaceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SourceDestCheck" -> SourceDestCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetNetworkInterfaceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ResetSnapshotAttribute.</p>
   */
  @js.native
  trait ResetSnapshotAttributeRequest extends js.Object {
    var Attribute: js.UndefOr[SnapshotAttributeName]
    var SnapshotId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object ResetSnapshotAttributeRequest {
    def apply(
      Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): ResetSnapshotAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetSnapshotAttributeRequest]
    }
  }

  object ResourceTypeEnum {
    val `customer-gateway` = "customer-gateway"
    val `dedicated-host` = "dedicated-host"
    val `dhcp-options` = "dhcp-options"
    val image = "image"
    val instance = "instance"
    val `internet-gateway` = "internet-gateway"
    val `network-acl` = "network-acl"
    val `network-interface` = "network-interface"
    val `reserved-instances` = "reserved-instances"
    val `route-table` = "route-table"
    val snapshot = "snapshot"
    val `spot-instances-request` = "spot-instances-request"
    val subnet = "subnet"
    val `security-group` = "security-group"
    val volume = "volume"
    val vpc = "vpc"
    val `vpn-connection` = "vpn-connection"
    val `vpn-gateway` = "vpn-gateway"

    val values = IndexedSeq(`customer-gateway`, `dedicated-host`, `dhcp-options`, image, instance, `internet-gateway`, `network-acl`, `network-interface`, `reserved-instances`, `route-table`, snapshot, `spot-instances-request`, subnet, `security-group`, volume, vpc, `vpn-connection`, `vpn-gateway`)
  }

  /**
   * <p>Describes the error that's returned when you cannot delete a launch template version.</p>
   */
  @js.native
  trait ResponseError extends js.Object {
    var Code: js.UndefOr[LaunchTemplateErrorCode]
    var Message: js.UndefOr[String]
  }

  object ResponseError {
    def apply(
      Code: js.UndefOr[LaunchTemplateErrorCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): ResponseError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseError]
    }
  }

  /**
   * <p>The information for a launch template. </p>
   */
  @js.native
  trait ResponseLaunchTemplateData extends js.Object {
    var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList]
    var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList]
    var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse]
    var CreditSpecification: js.UndefOr[CreditSpecification]
    var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList]
    var ImageId: js.UndefOr[String]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var EbsOptimized: js.UndefOr[Boolean]
    var Placement: js.UndefOr[LaunchTemplatePlacement]
    var RamDiskId: js.UndefOr[String]
    var DisableApiTermination: js.UndefOr[Boolean]
    var UserData: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[ValueStringList]
    var KernelId: js.UndefOr[String]
    var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions]
    var SecurityGroupIds: js.UndefOr[ValueStringList]
    var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Monitoring: js.UndefOr[LaunchTemplatesMonitoring]
    var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification]
    var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions]
  }

  object ResponseLaunchTemplateData {
    def apply(
      NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList] = js.undefined,
      BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList] = js.undefined,
      CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse] = js.undefined,
      CreditSpecification: js.UndefOr[CreditSpecification] = js.undefined,
      TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[LaunchTemplatePlacement] = js.undefined,
      RamDiskId: js.UndefOr[String] = js.undefined,
      DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[ValueStringList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions] = js.undefined,
      SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined,
      ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[LaunchTemplatesMonitoring] = js.undefined,
      IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification] = js.undefined,
      CpuOptions: js.UndefOr[LaunchTemplateCpuOptions] = js.undefined): ResponseLaunchTemplateData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationSpecification" -> CapacityReservationSpecification.map { x => x.asInstanceOf[js.Any] },
        "CreditSpecification" -> CreditSpecification.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "RamDiskId" -> RamDiskId.map { x => x.asInstanceOf[js.Any] },
        "DisableApiTermination" -> DisableApiTermination.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "InstanceMarketOptions" -> InstanceMarketOptions.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuSpecifications" -> ElasticGpuSpecifications.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "CpuOptions" -> CpuOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseLaunchTemplateData]
    }
  }

  @js.native
  trait RestoreAddressToClassicRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var PublicIp: js.UndefOr[String]
  }

  object RestoreAddressToClassicRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined): RestoreAddressToClassicRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreAddressToClassicRequest]
    }
  }

  @js.native
  trait RestoreAddressToClassicResult extends js.Object {
    var PublicIp: js.UndefOr[String]
    var Status: js.UndefOr[Status]
  }

  object RestoreAddressToClassicResult {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): RestoreAddressToClassicResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicIp" -> PublicIp.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreAddressToClassicResult]
    }
  }

  @js.native
  trait RevokeSecurityGroupEgressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var CidrIp: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var SourceSecurityGroupName: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeSecurityGroupEgressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Int] = js.undefined,
      FromPort: js.UndefOr[Int] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeSecurityGroupEgressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "IpProtocol" -> IpProtocol.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSecurityGroupEgressRequest]
    }
  }

  @js.native
  trait RevokeSecurityGroupIngressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var CidrIp: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var SourceSecurityGroupName: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeSecurityGroupIngressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Int] = js.undefined,
      FromPort: js.UndefOr[Int] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeSecurityGroupIngressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "CidrIp" -> CidrIp.map { x => x.asInstanceOf[js.Any] },
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "IpProtocol" -> IpProtocol.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSecurityGroupIngressRequest]
    }
  }

  /**
   * <p>Describes a route in a route table.</p>
   */
  @js.native
  trait Route extends js.Object {
    var InstanceOwnerId: js.UndefOr[String]
    var DestinationCidrBlock: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
    var DestinationPrefixListId: js.UndefOr[String]
    var NatGatewayId: js.UndefOr[String]
    var Origin: js.UndefOr[RouteOrigin]
    var EgressOnlyInternetGatewayId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var State: js.UndefOr[RouteState]
    var GatewayId: js.UndefOr[String]
  }

  object Route {
    def apply(
      InstanceOwnerId: js.UndefOr[String] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      DestinationPrefixListId: js.UndefOr[String] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      Origin: js.UndefOr[RouteOrigin] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[RouteState] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined): Route = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceOwnerId" -> InstanceOwnerId.map { x => x.asInstanceOf[js.Any] },
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] },
        "DestinationPrefixListId" -> DestinationPrefixListId.map { x => x.asInstanceOf[js.Any] },
        "NatGatewayId" -> NatGatewayId.map { x => x.asInstanceOf[js.Any] },
        "Origin" -> Origin.map { x => x.asInstanceOf[js.Any] },
        "EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Route]
    }
  }

  object RouteOriginEnum {
    val CreateRouteTable = "CreateRouteTable"
    val CreateRoute = "CreateRoute"
    val EnableVgwRoutePropagation = "EnableVgwRoutePropagation"

    val values = IndexedSeq(CreateRouteTable, CreateRoute, EnableVgwRoutePropagation)
  }

  object RouteStateEnum {
    val active = "active"
    val blackhole = "blackhole"

    val values = IndexedSeq(active, blackhole)
  }

  /**
   * <p>Describes a route table.</p>
   */
  @js.native
  trait RouteTable extends js.Object {
    var Associations: js.UndefOr[RouteTableAssociationList]
    var RouteTableId: js.UndefOr[String]
    var Routes: js.UndefOr[RouteList]
    var Tags: js.UndefOr[TagList]
    var PropagatingVgws: js.UndefOr[PropagatingVgwList]
    var VpcId: js.UndefOr[String]
  }

  object RouteTable {
    def apply(
      Associations: js.UndefOr[RouteTableAssociationList] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      Routes: js.UndefOr[RouteList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PropagatingVgws: js.UndefOr[PropagatingVgwList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): RouteTable = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Associations" -> Associations.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] },
        "Routes" -> Routes.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "PropagatingVgws" -> PropagatingVgws.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteTable]
    }
  }

  /**
   * <p>Describes an association between a route table and a subnet.</p>
   */
  @js.native
  trait RouteTableAssociation extends js.Object {
    var Main: js.UndefOr[Boolean]
    var RouteTableAssociationId: js.UndefOr[String]
    var RouteTableId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object RouteTableAssociation {
    def apply(
      Main: js.UndefOr[Boolean] = js.undefined,
      RouteTableAssociationId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): RouteTableAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Main" -> Main.map { x => x.asInstanceOf[js.Any] },
        "RouteTableAssociationId" -> RouteTableAssociationId.map { x => x.asInstanceOf[js.Any] },
        "RouteTableId" -> RouteTableId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteTableAssociation]
    }
  }

  object RuleActionEnum {
    val allow = "allow"
    val deny = "deny"

    val values = IndexedSeq(allow, deny)
  }

  /**
   * <p>Describes the monitoring of an instance.</p>
   */
  @js.native
  trait RunInstancesMonitoringEnabled extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object RunInstancesMonitoringEnabled {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined): RunInstancesMonitoringEnabled = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunInstancesMonitoringEnabled]
    }
  }

  /**
   * <p>Contains the parameters for RunInstances.</p>
   */
  @js.native
  trait RunInstancesRequest extends js.Object {
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList]
    var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecification]
    var DryRun: js.UndefOr[Boolean]
    var CreditSpecification: js.UndefOr[CreditSpecificationRequest]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var ImageId: js.UndefOr[String]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var PrivateIpAddress: js.UndefOr[String]
    var EbsOptimized: js.UndefOr[Boolean]
    var ElasticGpuSpecification: js.UndefOr[ElasticGpuSpecifications]
    var Placement: js.UndefOr[Placement]
    var ClientToken: js.UndefOr[String]
    var DisableApiTermination: js.UndefOr[Boolean]
    var UserData: js.UndefOr[String]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var SecurityGroups: js.UndefOr[SecurityGroupStringList]
    var Ipv6AddressCount: js.UndefOr[Int]
    var MinCount: js.UndefOr[Int]
    var KernelId: js.UndefOr[String]
    var InstanceMarketOptions: js.UndefOr[InstanceMarketOptionsRequest]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList]
    var MaxCount: js.UndefOr[Int]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var AdditionalInfo: js.UndefOr[String]
    var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var CpuOptions: js.UndefOr[CpuOptionsRequest]
    var SubnetId: js.UndefOr[String]
  }

  object RunInstancesRequest {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined,
      CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecification] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined,
      TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      ElasticGpuSpecification: js.UndefOr[ElasticGpuSpecifications] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      MinCount: js.UndefOr[Int] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      InstanceMarketOptions: js.UndefOr[InstanceMarketOptionsRequest] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      MaxCount: js.UndefOr[Int] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      CpuOptions: js.UndefOr[CpuOptionsRequest] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): RunInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "CapacityReservationSpecification" -> CapacityReservationSpecification.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "CreditSpecification" -> CreditSpecification.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "ElasticGpuSpecification" -> ElasticGpuSpecification.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "DisableApiTermination" -> DisableApiTermination.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "MinCount" -> MinCount.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "InstanceMarketOptions" -> InstanceMarketOptions.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "MaxCount" -> MaxCount.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AdditionalInfo" -> AdditionalInfo.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "CpuOptions" -> CpuOptions.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunInstancesRequest]
    }
  }

  /**
   * <p>Contains the parameters for RunScheduledInstances.</p>
   */
  @js.native
  trait RunScheduledInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var InstanceCount: js.UndefOr[Int]
    var ScheduledInstanceId: js.UndefOr[String]
    var LaunchSpecification: js.UndefOr[ScheduledInstancesLaunchSpecification]
  }

  object RunScheduledInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      ScheduledInstanceId: js.UndefOr[String] = js.undefined,
      LaunchSpecification: js.UndefOr[ScheduledInstancesLaunchSpecification] = js.undefined): RunScheduledInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "ScheduledInstanceId" -> ScheduledInstanceId.map { x => x.asInstanceOf[js.Any] },
        "LaunchSpecification" -> LaunchSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunScheduledInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of RunScheduledInstances.</p>
   */
  @js.native
  trait RunScheduledInstancesResult extends js.Object {
    var InstanceIdSet: js.UndefOr[InstanceIdSet]
  }

  object RunScheduledInstancesResult {
    def apply(
      InstanceIdSet: js.UndefOr[InstanceIdSet] = js.undefined): RunScheduledInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIdSet" -> InstanceIdSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunScheduledInstancesResult]
    }
  }

  /**
   * <p>Describes the storage parameters for S3 and S3 buckets for an instance store-backed AMI.</p>
   */
  @js.native
  trait S3Storage extends js.Object {
    var Bucket: js.UndefOr[String]
    var UploadPolicySignature: js.UndefOr[String]
    var AWSAccessKeyId: js.UndefOr[String]
    var UploadPolicy: js.UndefOr[Blob]
    var Prefix: js.UndefOr[String]
  }

  object S3Storage {
    def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      UploadPolicySignature: js.UndefOr[String] = js.undefined,
      AWSAccessKeyId: js.UndefOr[String] = js.undefined,
      UploadPolicy: js.UndefOr[Blob] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined): S3Storage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "UploadPolicySignature" -> UploadPolicySignature.map { x => x.asInstanceOf[js.Any] },
        "AWSAccessKeyId" -> AWSAccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "UploadPolicy" -> UploadPolicy.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Storage]
    }
  }

  /**
   * <p>Describes a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstance extends js.Object {
    var TermEndDate: js.UndefOr[DateTime]
    var SlotDurationInHours: js.UndefOr[Int]
    var Platform: js.UndefOr[String]
    var NextSlotStartTime: js.UndefOr[DateTime]
    var TotalScheduledInstanceHours: js.UndefOr[Int]
    var InstanceCount: js.UndefOr[Int]
    var TermStartDate: js.UndefOr[DateTime]
    var AvailabilityZone: js.UndefOr[String]
    var NetworkPlatform: js.UndefOr[String]
    var CreateDate: js.UndefOr[DateTime]
    var HourlyPrice: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var ScheduledInstanceId: js.UndefOr[String]
    var PreviousSlotEndTime: js.UndefOr[DateTime]
    var Recurrence: js.UndefOr[ScheduledInstanceRecurrence]
  }

  object ScheduledInstance {
    def apply(
      TermEndDate: js.UndefOr[DateTime] = js.undefined,
      SlotDurationInHours: js.UndefOr[Int] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      NextSlotStartTime: js.UndefOr[DateTime] = js.undefined,
      TotalScheduledInstanceHours: js.UndefOr[Int] = js.undefined,
      InstanceCount: js.UndefOr[Int] = js.undefined,
      TermStartDate: js.UndefOr[DateTime] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      NetworkPlatform: js.UndefOr[String] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      ScheduledInstanceId: js.UndefOr[String] = js.undefined,
      PreviousSlotEndTime: js.UndefOr[DateTime] = js.undefined,
      Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined): ScheduledInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TermEndDate" -> TermEndDate.map { x => x.asInstanceOf[js.Any] },
        "SlotDurationInHours" -> SlotDurationInHours.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "NextSlotStartTime" -> NextSlotStartTime.map { x => x.asInstanceOf[js.Any] },
        "TotalScheduledInstanceHours" -> TotalScheduledInstanceHours.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "TermStartDate" -> TermStartDate.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "NetworkPlatform" -> NetworkPlatform.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "HourlyPrice" -> HourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "ScheduledInstanceId" -> ScheduledInstanceId.map { x => x.asInstanceOf[js.Any] },
        "PreviousSlotEndTime" -> PreviousSlotEndTime.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstance]
    }
  }

  /**
   * <p>Describes a schedule that is available for your Scheduled Instances.</p>
   */
  @js.native
  trait ScheduledInstanceAvailability extends js.Object {
    var PurchaseToken: js.UndefOr[String]
    var SlotDurationInHours: js.UndefOr[Int]
    var Platform: js.UndefOr[String]
    var MaxTermDurationInDays: js.UndefOr[Int]
    var FirstSlotStartTime: js.UndefOr[DateTime]
    var TotalScheduledInstanceHours: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[String]
    var NetworkPlatform: js.UndefOr[String]
    var HourlyPrice: js.UndefOr[String]
    var AvailableInstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[String]
    var MinTermDurationInDays: js.UndefOr[Int]
    var Recurrence: js.UndefOr[ScheduledInstanceRecurrence]
  }

  object ScheduledInstanceAvailability {
    def apply(
      PurchaseToken: js.UndefOr[String] = js.undefined,
      SlotDurationInHours: js.UndefOr[Int] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      MaxTermDurationInDays: js.UndefOr[Int] = js.undefined,
      FirstSlotStartTime: js.UndefOr[DateTime] = js.undefined,
      TotalScheduledInstanceHours: js.UndefOr[Int] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      NetworkPlatform: js.UndefOr[String] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      AvailableInstanceCount: js.UndefOr[Int] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      MinTermDurationInDays: js.UndefOr[Int] = js.undefined,
      Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined): ScheduledInstanceAvailability = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PurchaseToken" -> PurchaseToken.map { x => x.asInstanceOf[js.Any] },
        "SlotDurationInHours" -> SlotDurationInHours.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "MaxTermDurationInDays" -> MaxTermDurationInDays.map { x => x.asInstanceOf[js.Any] },
        "FirstSlotStartTime" -> FirstSlotStartTime.map { x => x.asInstanceOf[js.Any] },
        "TotalScheduledInstanceHours" -> TotalScheduledInstanceHours.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "NetworkPlatform" -> NetworkPlatform.map { x => x.asInstanceOf[js.Any] },
        "HourlyPrice" -> HourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "AvailableInstanceCount" -> AvailableInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "MinTermDurationInDays" -> MinTermDurationInDays.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstanceAvailability]
    }
  }

  /**
   * <p>Describes the recurring schedule for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstanceRecurrence extends js.Object {
    var OccurrenceDaySet: js.UndefOr[OccurrenceDaySet]
    var Interval: js.UndefOr[Int]
    var OccurrenceRelativeToEnd: js.UndefOr[Boolean]
    var OccurrenceUnit: js.UndefOr[String]
    var Frequency: js.UndefOr[String]
  }

  object ScheduledInstanceRecurrence {
    def apply(
      OccurrenceDaySet: js.UndefOr[OccurrenceDaySet] = js.undefined,
      Interval: js.UndefOr[Int] = js.undefined,
      OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined,
      OccurrenceUnit: js.UndefOr[String] = js.undefined,
      Frequency: js.UndefOr[String] = js.undefined): ScheduledInstanceRecurrence = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OccurrenceDaySet" -> OccurrenceDaySet.map { x => x.asInstanceOf[js.Any] },
        "Interval" -> Interval.map { x => x.asInstanceOf[js.Any] },
        "OccurrenceRelativeToEnd" -> OccurrenceRelativeToEnd.map { x => x.asInstanceOf[js.Any] },
        "OccurrenceUnit" -> OccurrenceUnit.map { x => x.asInstanceOf[js.Any] },
        "Frequency" -> Frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstanceRecurrence]
    }
  }

  /**
   * <p>Describes the recurring schedule for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstanceRecurrenceRequest extends js.Object {
    var Interval: js.UndefOr[Int]
    var OccurrenceRelativeToEnd: js.UndefOr[Boolean]
    var OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet]
    var OccurrenceUnit: js.UndefOr[String]
    var Frequency: js.UndefOr[String]
  }

  object ScheduledInstanceRecurrenceRequest {
    def apply(
      Interval: js.UndefOr[Int] = js.undefined,
      OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined,
      OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet] = js.undefined,
      OccurrenceUnit: js.UndefOr[String] = js.undefined,
      Frequency: js.UndefOr[String] = js.undefined): ScheduledInstanceRecurrenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Interval" -> Interval.map { x => x.asInstanceOf[js.Any] },
        "OccurrenceRelativeToEnd" -> OccurrenceRelativeToEnd.map { x => x.asInstanceOf[js.Any] },
        "OccurrenceDays" -> OccurrenceDays.map { x => x.asInstanceOf[js.Any] },
        "OccurrenceUnit" -> OccurrenceUnit.map { x => x.asInstanceOf[js.Any] },
        "Frequency" -> Frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstanceRecurrenceRequest]
    }
  }

  /**
   * <p>Describes a block device mapping for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesBlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[ScheduledInstancesEbs]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  object ScheduledInstancesBlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[ScheduledInstancesEbs] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined): ScheduledInstancesBlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] },
        "NoDevice" -> NoDevice.map { x => x.asInstanceOf[js.Any] },
        "VirtualName" -> VirtualName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesBlockDeviceMapping]
    }
  }

  /**
   * <p>Describes an EBS volume for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesEbs extends js.Object {
    var VolumeType: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var VolumeSize: js.UndefOr[Int]
    var Iops: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
  }

  object ScheduledInstancesEbs {
    def apply(
      VolumeType: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      VolumeSize: js.UndefOr[Int] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined): ScheduledInstancesEbs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesEbs]
    }
  }

  /**
   * <p>Describes an IAM instance profile for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesIamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object ScheduledInstancesIamInstanceProfile {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined): ScheduledInstancesIamInstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesIamInstanceProfile]
    }
  }

  /**
   * <p>Describes an IPv6 address.</p>
   */
  @js.native
  trait ScheduledInstancesIpv6Address extends js.Object {
    var Ipv6Address: js.UndefOr[Ipv6Address]
  }

  object ScheduledInstancesIpv6Address {
    def apply(
      Ipv6Address: js.UndefOr[Ipv6Address] = js.undefined): ScheduledInstancesIpv6Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Address" -> Ipv6Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesIpv6Address]
    }
  }

  /**
   * <p>Describes the launch specification for a Scheduled Instance.</p> <p>If you are launching the Scheduled Instance in EC2-VPC, you must specify the ID of the subnet. You can specify the subnet using either <code>SubnetId</code> or <code>NetworkInterface</code>.</p>
   */
  @js.native
  trait ScheduledInstancesLaunchSpecification extends js.Object {
    var NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet]
    var ImageId: js.UndefOr[String]
    var EbsOptimized: js.UndefOr[Boolean]
    var Placement: js.UndefOr[ScheduledInstancesPlacement]
    var UserData: js.UndefOr[String]
    var KernelId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var Monitoring: js.UndefOr[ScheduledInstancesMonitoring]
    var IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile]
    var SubnetId: js.UndefOr[String]
  }

  object ScheduledInstancesLaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[ScheduledInstancesPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      Monitoring: js.UndefOr[ScheduledInstancesMonitoring] = js.undefined,
      IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): ScheduledInstancesLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesLaunchSpecification]
    }
  }

  /**
   * <p>Describes whether monitoring is enabled for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesMonitoring extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object ScheduledInstancesMonitoring {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined): ScheduledInstancesMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesMonitoring]
    }
  }

  /**
   * <p>Describes a network interface for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesNetworkInterface extends js.Object {
    var Ipv6Addresses: js.UndefOr[ScheduledInstancesIpv6AddressList]
    var PrivateIpAddressConfigs: js.UndefOr[PrivateIpAddressConfigSet]
    var PrivateIpAddress: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Groups: js.UndefOr[ScheduledInstancesSecurityGroupIdSet]
    var DeviceIndex: js.UndefOr[Int]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[String]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[String]
  }

  object ScheduledInstancesNetworkInterface {
    def apply(
      Ipv6Addresses: js.UndefOr[ScheduledInstancesIpv6AddressList] = js.undefined,
      PrivateIpAddressConfigs: js.UndefOr[PrivateIpAddressConfigSet] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Int] = js.undefined,
      Groups: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.undefined,
      DeviceIndex: js.UndefOr[Int] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Int] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): ScheduledInstancesNetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddressConfigs" -> PrivateIpAddressConfigs.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Ipv6AddressCount" -> Ipv6AddressCount.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "DeviceIndex" -> DeviceIndex.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesNetworkInterface]
    }
  }

  /**
   * <p>Describes the placement for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesPlacement extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  object ScheduledInstancesPlacement {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined): ScheduledInstancesPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesPlacement]
    }
  }

  /**
   * <p>Describes a private IPv4 address for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
    var Primary: js.UndefOr[Boolean]
    var PrivateIpAddress: js.UndefOr[String]
  }

  object ScheduledInstancesPrivateIpAddressConfig {
    def apply(
      Primary: js.UndefOr[Boolean] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined): ScheduledInstancesPrivateIpAddressConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Primary" -> Primary.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddress" -> PrivateIpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
    }
  }

  /**
   * <p>Describes a security group</p>
   */
  @js.native
  trait SecurityGroup extends js.Object {
    var IpPermissions: js.UndefOr[IpPermissionList]
    var GroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var IpPermissionsEgress: js.UndefOr[IpPermissionList]
    var OwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  object SecurityGroup {
    def apply(
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      IpPermissionsEgress: js.UndefOr[IpPermissionList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "IpPermissionsEgress" -> IpPermissionsEgress.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroup]
    }
  }

  /**
   * <p>Describes a security group.</p>
   */
  @js.native
  trait SecurityGroupIdentifier extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  object SecurityGroupIdentifier {
    def apply(
      GroupId: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined): SecurityGroupIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroupIdentifier]
    }
  }

  /**
   * <p>Describes a VPC with a security group that references your security group.</p>
   */
  @js.native
  trait SecurityGroupReference extends js.Object {
    var GroupId: js.UndefOr[String]
    var ReferencingVpcId: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  object SecurityGroupReference {
    def apply(
      GroupId: js.UndefOr[String] = js.undefined,
      ReferencingVpcId: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined): SecurityGroupReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "ReferencingVpcId" -> ReferencingVpcId.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroupReference]
    }
  }

  /**
   * <p>Describes a service configuration for a VPC endpoint service.</p>
   */
  @js.native
  trait ServiceConfiguration extends js.Object {
    var ServiceName: js.UndefOr[String]
    var AcceptanceRequired: js.UndefOr[Boolean]
    var NetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var BaseEndpointDnsNames: js.UndefOr[ValueStringList]
    var PrivateDnsName: js.UndefOr[String]
    var ServiceType: js.UndefOr[ServiceTypeDetailSet]
    var ServiceState: js.UndefOr[ServiceState]
    var ServiceId: js.UndefOr[String]
    var AvailabilityZones: js.UndefOr[ValueStringList]
  }

  object ServiceConfiguration {
    def apply(
      ServiceName: js.UndefOr[String] = js.undefined,
      AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
      NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined,
      BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.undefined,
      ServiceState: js.UndefOr[ServiceState] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined): ServiceConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "NetworkLoadBalancerArns" -> NetworkLoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "BaseEndpointDnsNames" -> BaseEndpointDnsNames.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] },
        "ServiceState" -> ServiceState.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceConfiguration]
    }
  }

  /**
   * <p>Describes a VPC endpoint service.</p>
   */
  @js.native
  trait ServiceDetail extends js.Object {
    var ServiceName: js.UndefOr[String]
    var AcceptanceRequired: js.UndefOr[Boolean]
    var BaseEndpointDnsNames: js.UndefOr[ValueStringList]
    var PrivateDnsName: js.UndefOr[String]
    var VpcEndpointPolicySupported: js.UndefOr[Boolean]
    var ServiceType: js.UndefOr[ServiceTypeDetailSet]
    var Owner: js.UndefOr[String]
    var AvailabilityZones: js.UndefOr[ValueStringList]
  }

  object ServiceDetail {
    def apply(
      ServiceName: js.UndefOr[String] = js.undefined,
      AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
      BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.undefined,
      ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.undefined,
      Owner: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined): ServiceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "AcceptanceRequired" -> AcceptanceRequired.map { x => x.asInstanceOf[js.Any] },
        "BaseEndpointDnsNames" -> BaseEndpointDnsNames.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsName" -> PrivateDnsName.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointPolicySupported" -> VpcEndpointPolicySupported.map { x => x.asInstanceOf[js.Any] },
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceDetail]
    }
  }

  object ServiceStateEnum {
    val Pending = "Pending"
    val Available = "Available"
    val Deleting = "Deleting"
    val Deleted = "Deleted"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, Available, Deleting, Deleted, Failed)
  }

  object ServiceTypeEnum {
    val Interface = "Interface"
    val Gateway = "Gateway"

    val values = IndexedSeq(Interface, Gateway)
  }

  /**
   * <p>Describes the type of service for a VPC endpoint.</p>
   */
  @js.native
  trait ServiceTypeDetail extends js.Object {
    var ServiceType: js.UndefOr[ServiceType]
  }

  object ServiceTypeDetail {
    def apply(
      ServiceType: js.UndefOr[ServiceType] = js.undefined): ServiceTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceTypeDetail]
    }
  }

  object ShutdownBehaviorEnum {
    val stop = "stop"
    val terminate = "terminate"

    val values = IndexedSeq(stop, terminate)
  }

  /**
   * <p>Describes the time period for a Scheduled Instance to start its first schedule. The time period must span less than one day.</p>
   */
  @js.native
  trait SlotDateTimeRangeRequest extends js.Object {
    var EarliestTime: js.UndefOr[DateTime]
    var LatestTime: js.UndefOr[DateTime]
  }

  object SlotDateTimeRangeRequest {
    def apply(
      EarliestTime: js.UndefOr[DateTime] = js.undefined,
      LatestTime: js.UndefOr[DateTime] = js.undefined): SlotDateTimeRangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EarliestTime" -> EarliestTime.map { x => x.asInstanceOf[js.Any] },
        "LatestTime" -> LatestTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SlotDateTimeRangeRequest]
    }
  }

  /**
   * <p>Describes the time period for a Scheduled Instance to start its first schedule.</p>
   */
  @js.native
  trait SlotStartTimeRangeRequest extends js.Object {
    var EarliestTime: js.UndefOr[DateTime]
    var LatestTime: js.UndefOr[DateTime]
  }

  object SlotStartTimeRangeRequest {
    def apply(
      EarliestTime: js.UndefOr[DateTime] = js.undefined,
      LatestTime: js.UndefOr[DateTime] = js.undefined): SlotStartTimeRangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EarliestTime" -> EarliestTime.map { x => x.asInstanceOf[js.Any] },
        "LatestTime" -> LatestTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SlotStartTimeRangeRequest]
    }
  }

  /**
   * <p>Describes a snapshot.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var OwnerAlias: js.UndefOr[String]
    var DataEncryptionKeyId: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var StartTime: js.UndefOr[DateTime]
    var Encrypted: js.UndefOr[Boolean]
    var OwnerId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
    var Tags: js.UndefOr[TagList]
    var StateMessage: js.UndefOr[String]
    var State: js.UndefOr[SnapshotState]
    var Progress: js.UndefOr[String]
  }

  object Snapshot {
    def apply(
      OwnerAlias: js.UndefOr[String] = js.undefined,
      DataEncryptionKeyId: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      VolumeSize: js.UndefOr[Int] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      StateMessage: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[SnapshotState] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerAlias" -> OwnerAlias.map { x => x.asInstanceOf[js.Any] },
        "DataEncryptionKeyId" -> DataEncryptionKeyId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "StateMessage" -> StateMessage.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  object SnapshotAttributeNameEnum {
    val productCodes = "productCodes"
    val createVolumePermission = "createVolumePermission"

    val values = IndexedSeq(productCodes, createVolumePermission)
  }

  /**
   * <p>Describes the snapshot created from the imported disk.</p>
   */
  @js.native
  trait SnapshotDetail extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var Format: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DiskImageSize: js.UndefOr[Double]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucketDetails]
    var DeviceName: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SnapshotDetail {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DiskImageSize: js.UndefOr[Double] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucketDetails] = js.undefined,
      DeviceName: js.UndefOr[String] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): SnapshotDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DiskImageSize" -> DiskImageSize.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "UserBucket" -> UserBucket.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotDetail]
    }
  }

  /**
   * <p>The disk container object for the import snapshot request.</p>
   */
  @js.native
  trait SnapshotDiskContainer extends js.Object {
    var Description: js.UndefOr[String]
    var Format: js.UndefOr[String]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucket]
  }

  object SnapshotDiskContainer {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[String] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucket] = js.undefined): SnapshotDiskContainer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "UserBucket" -> UserBucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotDiskContainer]
    }
  }

  object SnapshotStateEnum {
    val pending = "pending"
    val completed = "completed"
    val error = "error"

    val values = IndexedSeq(pending, completed, error)
  }

  /**
   * <p>Details about the import snapshot task.</p>
   */
  @js.native
  trait SnapshotTaskDetail extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var Format: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var DiskImageSize: js.UndefOr[Double]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucketDetails]
    var Progress: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SnapshotTaskDetail {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      DiskImageSize: js.UndefOr[Double] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucketDetails] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): SnapshotTaskDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "DiskImageSize" -> DiskImageSize.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "UserBucket" -> UserBucket.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotTaskDetail]
    }
  }

  object SpotAllocationStrategyEnum {
    val `lowest-price` = "lowest-price"
    val diversified = "diversified"

    val values = IndexedSeq(`lowest-price`, diversified)
  }

  /**
   * <p>Describes the data feed for a Spot Instance.</p>
   */
  @js.native
  trait SpotDatafeedSubscription extends js.Object {
    var Bucket: js.UndefOr[String]
    var Fault: js.UndefOr[SpotInstanceStateFault]
    var OwnerId: js.UndefOr[String]
    var Prefix: js.UndefOr[String]
    var State: js.UndefOr[DatafeedSubscriptionState]
  }

  object SpotDatafeedSubscription {
    def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[DatafeedSubscriptionState] = js.undefined): SpotDatafeedSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Fault" -> Fault.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotDatafeedSubscription]
    }
  }

  /**
   * <p>Describes the launch specification for one or more Spot Instances.</p>
   */
  @js.native
  trait SpotFleetLaunchSpecification extends js.Object {
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var RamdiskId: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var TagSpecifications: js.UndefOr[SpotFleetTagSpecificationList]
    var ImageId: js.UndefOr[String]
    var WeightedCapacity: js.UndefOr[Double]
    var EbsOptimized: js.UndefOr[Boolean]
    var Placement: js.UndefOr[SpotPlacement]
    var UserData: js.UndefOr[String]
    var AddressingType: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[GroupIdentifierList]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Monitoring: js.UndefOr[SpotFleetMonitoring]
    var SpotPrice: js.UndefOr[String]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var SubnetId: js.UndefOr[String]
  }

  object SpotFleetLaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      TagSpecifications: js.UndefOr[SpotFleetTagSpecificationList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      WeightedCapacity: js.UndefOr[Double] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[SpotPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      AddressingType: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[SpotFleetMonitoring] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): SpotFleetLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaces" -> NetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "TagSpecifications" -> TagSpecifications.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "WeightedCapacity" -> WeightedCapacity.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "Placement" -> Placement.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] },
        "AddressingType" -> AddressingType.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Monitoring" -> Monitoring.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetLaunchSpecification]
    }
  }

  /**
   * <p>Describes whether monitoring is enabled.</p>
   */
  @js.native
  trait SpotFleetMonitoring extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object SpotFleetMonitoring {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined): SpotFleetMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetMonitoring]
    }
  }

  /**
   * <p>Describes a Spot Fleet request.</p>
   */
  @js.native
  trait SpotFleetRequestConfig extends js.Object {
    var SpotFleetRequestId: js.UndefOr[String]
    var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData]
    var SpotFleetRequestState: js.UndefOr[BatchState]
    var ActivityStatus: js.UndefOr[ActivityStatus]
    var CreateTime: js.UndefOr[DateTime]
  }

  object SpotFleetRequestConfig {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.undefined,
      SpotFleetRequestState: js.UndefOr[BatchState] = js.undefined,
      ActivityStatus: js.UndefOr[ActivityStatus] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined): SpotFleetRequestConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpotFleetRequestId" -> SpotFleetRequestId.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestConfig" -> SpotFleetRequestConfig.map { x => x.asInstanceOf[js.Any] },
        "SpotFleetRequestState" -> SpotFleetRequestState.map { x => x.asInstanceOf[js.Any] },
        "ActivityStatus" -> ActivityStatus.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetRequestConfig]
    }
  }

  /**
   * <p>Describes the configuration of a Spot Fleet request.</p>
   */
  @js.native
  trait SpotFleetRequestConfigData extends js.Object {
    var ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy]
    var IamFleetRole: js.UndefOr[String]
    var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var ClientToken: js.UndefOr[String]
    var ReplaceUnhealthyInstances: js.UndefOr[Boolean]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var OnDemandAllocationStrategy: js.UndefOr[OnDemandAllocationStrategy]
    var LaunchSpecifications: js.UndefOr[LaunchSpecsList]
    var ValidUntil: js.UndefOr[DateTime]
    var TerminateInstancesWithExpiration: js.UndefOr[Boolean]
    var LoadBalancersConfig: js.UndefOr[LoadBalancersConfig]
    var AllocationStrategy: js.UndefOr[AllocationStrategy]
    var ValidFrom: js.UndefOr[DateTime]
    var SpotPrice: js.UndefOr[String]
    var OnDemandFulfilledCapacity: js.UndefOr[Double]
    var FulfilledCapacity: js.UndefOr[Double]
    var InstancePoolsToUseCount: js.UndefOr[Int]
    var TargetCapacity: js.UndefOr[Int]
    var Type: js.UndefOr[FleetType]
  }

  object SpotFleetRequestConfigData {
    def apply(
      ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy] = js.undefined,
      IamFleetRole: js.UndefOr[String] = js.undefined,
      LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.undefined,
      OnDemandTargetCapacity: js.UndefOr[Int] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined,
      InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined,
      OnDemandAllocationStrategy: js.UndefOr[OnDemandAllocationStrategy] = js.undefined,
      LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
      LoadBalancersConfig: js.UndefOr[LoadBalancersConfig] = js.undefined,
      AllocationStrategy: js.UndefOr[AllocationStrategy] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      OnDemandFulfilledCapacity: js.UndefOr[Double] = js.undefined,
      FulfilledCapacity: js.UndefOr[Double] = js.undefined,
      InstancePoolsToUseCount: js.UndefOr[Int] = js.undefined,
      TargetCapacity: js.UndefOr[Int] = js.undefined,
      Type: js.UndefOr[FleetType] = js.undefined): SpotFleetRequestConfigData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x.asInstanceOf[js.Any] },
        "IamFleetRole" -> IamFleetRole.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateConfigs" -> LaunchTemplateConfigs.map { x => x.asInstanceOf[js.Any] },
        "OnDemandTargetCapacity" -> OnDemandTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "ReplaceUnhealthyInstances" -> ReplaceUnhealthyInstances.map { x => x.asInstanceOf[js.Any] },
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "OnDemandAllocationStrategy" -> OnDemandAllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "LaunchSpecifications" -> LaunchSpecifications.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "TerminateInstancesWithExpiration" -> TerminateInstancesWithExpiration.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancersConfig" -> LoadBalancersConfig.map { x => x.asInstanceOf[js.Any] },
        "AllocationStrategy" -> AllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "ValidFrom" -> ValidFrom.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "OnDemandFulfilledCapacity" -> OnDemandFulfilledCapacity.map { x => x.asInstanceOf[js.Any] },
        "FulfilledCapacity" -> FulfilledCapacity.map { x => x.asInstanceOf[js.Any] },
        "InstancePoolsToUseCount" -> InstancePoolsToUseCount.map { x => x.asInstanceOf[js.Any] },
        "TargetCapacity" -> TargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetRequestConfigData]
    }
  }

  /**
   * <p>The tags for a Spot Fleet resource.</p>
   */
  @js.native
  trait SpotFleetTagSpecification extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object SpotFleetTagSpecification {
    def apply(
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): SpotFleetTagSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetTagSpecification]
    }
  }

  object SpotInstanceInterruptionBehaviorEnum {
    val hibernate = "hibernate"
    val stop = "stop"
    val terminate = "terminate"

    val values = IndexedSeq(hibernate, stop, terminate)
  }

  /**
   * <p>Describes a Spot Instance request.</p>
   */
  @js.native
  trait SpotInstanceRequest extends js.Object {
    var LaunchGroup: js.UndefOr[String]
    var Fault: js.UndefOr[SpotInstanceStateFault]
    var AvailabilityZoneGroup: js.UndefOr[String]
    var SpotInstanceRequestId: js.UndefOr[String]
    var LaunchedAvailabilityZone: js.UndefOr[String]
    var ActualBlockHourlyPrice: js.UndefOr[String]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var ValidUntil: js.UndefOr[DateTime]
    var InstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var ValidFrom: js.UndefOr[DateTime]
    var SpotPrice: js.UndefOr[String]
    var CreateTime: js.UndefOr[DateTime]
    var State: js.UndefOr[SpotInstanceState]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var BlockDurationMinutes: js.UndefOr[Int]
    var LaunchSpecification: js.UndefOr[LaunchSpecification]
    var Status: js.UndefOr[SpotInstanceStatus]
    var Type: js.UndefOr[SpotInstanceType]
  }

  object SpotInstanceRequest {
    def apply(
      LaunchGroup: js.UndefOr[String] = js.undefined,
      Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined,
      AvailabilityZoneGroup: js.UndefOr[String] = js.undefined,
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      LaunchedAvailabilityZone: js.UndefOr[String] = js.undefined,
      ActualBlockHourlyPrice: js.UndefOr[String] = js.undefined,
      InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[SpotInstanceState] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Int] = js.undefined,
      LaunchSpecification: js.UndefOr[LaunchSpecification] = js.undefined,
      Status: js.UndefOr[SpotInstanceStatus] = js.undefined,
      Type: js.UndefOr[SpotInstanceType] = js.undefined): SpotInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchGroup" -> LaunchGroup.map { x => x.asInstanceOf[js.Any] },
        "Fault" -> Fault.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZoneGroup" -> AvailabilityZoneGroup.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x.asInstanceOf[js.Any] },
        "LaunchedAvailabilityZone" -> LaunchedAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ActualBlockHourlyPrice" -> ActualBlockHourlyPrice.map { x => x.asInstanceOf[js.Any] },
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ValidFrom" -> ValidFrom.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "BlockDurationMinutes" -> BlockDurationMinutes.map { x => x.asInstanceOf[js.Any] },
        "LaunchSpecification" -> LaunchSpecification.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotInstanceRequest]
    }
  }

  object SpotInstanceStateEnum {
    val open = "open"
    val active = "active"
    val closed = "closed"
    val cancelled = "cancelled"
    val failed = "failed"

    val values = IndexedSeq(open, active, closed, cancelled, failed)
  }

  /**
   * <p>Describes a Spot Instance state change.</p>
   */
  @js.native
  trait SpotInstanceStateFault extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object SpotInstanceStateFault {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): SpotInstanceStateFault = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotInstanceStateFault]
    }
  }

  /**
   * <p>Describes the status of a Spot Instance request.</p>
   */
  @js.native
  trait SpotInstanceStatus extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var UpdateTime: js.UndefOr[DateTime]
  }

  object SpotInstanceStatus {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      UpdateTime: js.UndefOr[DateTime] = js.undefined): SpotInstanceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "UpdateTime" -> UpdateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotInstanceStatus]
    }
  }

  object SpotInstanceTypeEnum {
    val `one-time` = "one-time"
    val persistent = "persistent"

    val values = IndexedSeq(`one-time`, persistent)
  }

  /**
   * <p>The options for Spot Instances.</p>
   */
  @js.native
  trait SpotMarketOptions extends js.Object {
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var SpotInstanceType: js.UndefOr[SpotInstanceType]
    var ValidUntil: js.UndefOr[DateTime]
    var MaxPrice: js.UndefOr[String]
    var BlockDurationMinutes: js.UndefOr[Int]
  }

  object SpotMarketOptions {
    def apply(
      InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined,
      SpotInstanceType: js.UndefOr[SpotInstanceType] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      MaxPrice: js.UndefOr[String] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Int] = js.undefined): SpotMarketOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "SpotInstanceType" -> SpotInstanceType.map { x => x.asInstanceOf[js.Any] },
        "ValidUntil" -> ValidUntil.map { x => x.asInstanceOf[js.Any] },
        "MaxPrice" -> MaxPrice.map { x => x.asInstanceOf[js.Any] },
        "BlockDurationMinutes" -> BlockDurationMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotMarketOptions]
    }
  }

  /**
   * <p>Describes the configuration of Spot Instances in an EC2 Fleet.</p>
   */
  @js.native
  trait SpotOptions extends js.Object {
    var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior]
    var SingleInstanceType: js.UndefOr[Boolean]
    var AllocationStrategy: js.UndefOr[SpotAllocationStrategy]
    var MinTargetCapacity: js.UndefOr[Int]
    var InstancePoolsToUseCount: js.UndefOr[Int]
  }

  object SpotOptions {
    def apply(
      InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.undefined,
      SingleInstanceType: js.UndefOr[Boolean] = js.undefined,
      AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.undefined,
      MinTargetCapacity: js.UndefOr[Int] = js.undefined,
      InstancePoolsToUseCount: js.UndefOr[Int] = js.undefined): SpotOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "SingleInstanceType" -> SingleInstanceType.map { x => x.asInstanceOf[js.Any] },
        "AllocationStrategy" -> AllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "MinTargetCapacity" -> MinTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "InstancePoolsToUseCount" -> InstancePoolsToUseCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotOptions]
    }
  }

  /**
   * <p>Describes the configuration of Spot Instances in an EC2 Fleet request.</p>
   */
  @js.native
  trait SpotOptionsRequest extends js.Object {
    var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior]
    var SingleInstanceType: js.UndefOr[Boolean]
    var AllocationStrategy: js.UndefOr[SpotAllocationStrategy]
    var MinTargetCapacity: js.UndefOr[Int]
    var InstancePoolsToUseCount: js.UndefOr[Int]
  }

  object SpotOptionsRequest {
    def apply(
      InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.undefined,
      SingleInstanceType: js.UndefOr[Boolean] = js.undefined,
      AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.undefined,
      MinTargetCapacity: js.UndefOr[Int] = js.undefined,
      InstancePoolsToUseCount: js.UndefOr[Int] = js.undefined): SpotOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceInterruptionBehavior" -> InstanceInterruptionBehavior.map { x => x.asInstanceOf[js.Any] },
        "SingleInstanceType" -> SingleInstanceType.map { x => x.asInstanceOf[js.Any] },
        "AllocationStrategy" -> AllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "MinTargetCapacity" -> MinTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "InstancePoolsToUseCount" -> InstancePoolsToUseCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotOptionsRequest]
    }
  }

  /**
   * <p>Describes Spot Instance placement.</p>
   */
  @js.native
  trait SpotPlacement extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
  }

  object SpotPlacement {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[Tenancy] = js.undefined): SpotPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Tenancy" -> Tenancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotPlacement]
    }
  }

  /**
   * <p>Describes the maximum price per hour that you are willing to pay for a Spot Instance.</p>
   */
  @js.native
  trait SpotPrice extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Timestamp: js.UndefOr[DateTime]
    var SpotPrice: js.UndefOr[String]
    var ProductDescription: js.UndefOr[RIProductDescription]
  }

  object SpotPrice {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined): SpotPrice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotPrice]
    }
  }

  /**
   * <p>Describes a stale rule in a security group.</p>
   */
  @js.native
  trait StaleIpPermission extends js.Object {
    var PrefixListIds: js.UndefOr[PrefixListIdSet]
    var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet]
    var IpRanges: js.UndefOr[IpRanges]
    var ToPort: js.UndefOr[Int]
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
  }

  object StaleIpPermission {
    def apply(
      PrefixListIds: js.UndefOr[PrefixListIdSet] = js.undefined,
      UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.undefined,
      IpRanges: js.UndefOr[IpRanges] = js.undefined,
      ToPort: js.UndefOr[Int] = js.undefined,
      FromPort: js.UndefOr[Int] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined): StaleIpPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrefixListIds" -> PrefixListIds.map { x => x.asInstanceOf[js.Any] },
        "UserIdGroupPairs" -> UserIdGroupPairs.map { x => x.asInstanceOf[js.Any] },
        "IpRanges" -> IpRanges.map { x => x.asInstanceOf[js.Any] },
        "ToPort" -> ToPort.map { x => x.asInstanceOf[js.Any] },
        "FromPort" -> FromPort.map { x => x.asInstanceOf[js.Any] },
        "IpProtocol" -> IpProtocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaleIpPermission]
    }
  }

  /**
   * <p>Describes a stale security group (a security group that contains stale rules).</p>
   */
  @js.native
  trait StaleSecurityGroup extends js.Object {
    var GroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet]
    var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet]
    var VpcId: js.UndefOr[String]
  }

  object StaleSecurityGroup {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.undefined,
      StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): StaleSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "StaleIpPermissionsEgress" -> StaleIpPermissionsEgress.map { x => x.asInstanceOf[js.Any] },
        "StaleIpPermissions" -> StaleIpPermissions.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaleSecurityGroup]
    }
  }

  /**
   * <p>Contains the parameters for StartInstances.</p>
   */
  @js.native
  trait StartInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var AdditionalInfo: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object StartInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): StartInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "AdditionalInfo" -> AdditionalInfo.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of StartInstances.</p>
   */
  @js.native
  trait StartInstancesResult extends js.Object {
    var StartingInstances: js.UndefOr[InstanceStateChangeList]
  }

  object StartInstancesResult {
    def apply(
      StartingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined): StartInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartingInstances" -> StartingInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstancesResult]
    }
  }

  object StateEnum {
    val PendingAcceptance = "PendingAcceptance"
    val Pending = "Pending"
    val Available = "Available"
    val Deleting = "Deleting"
    val Deleted = "Deleted"
    val Rejected = "Rejected"
    val Failed = "Failed"
    val Expired = "Expired"

    val values = IndexedSeq(PendingAcceptance, Pending, Available, Deleting, Deleted, Rejected, Failed, Expired)
  }

  /**
   * <p>Describes a state change.</p>
   */
  @js.native
  trait StateReason extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object StateReason {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): StateReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateReason]
    }
  }

  object StatusEnum {
    val MoveInProgress = "MoveInProgress"
    val InVpc = "InVpc"
    val InClassic = "InClassic"

    val values = IndexedSeq(MoveInProgress, InVpc, InClassic)
  }

  object StatusNameEnum {
    val reachability = "reachability"

    val values = IndexedSeq(reachability)
  }

  object StatusTypeEnum {
    val passed = "passed"
    val failed = "failed"
    val `insufficient-data` = "insufficient-data"
    val initializing = "initializing"

    val values = IndexedSeq(passed, failed, `insufficient-data`, initializing)
  }

  /**
   * <p>Contains the parameters for StopInstances.</p>
   */
  @js.native
  trait StopInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
  }

  object StopInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined): StopInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of StopInstances.</p>
   */
  @js.native
  trait StopInstancesResult extends js.Object {
    var StoppingInstances: js.UndefOr[InstanceStateChangeList]
  }

  object StopInstancesResult {
    def apply(
      StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined): StopInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StoppingInstances" -> StoppingInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstancesResult]
    }
  }

  /**
   * <p>Describes the storage location for an instance store-backed AMI.</p>
   */
  @js.native
  trait Storage extends js.Object {
    var S3: js.UndefOr[S3Storage]
  }

  object Storage {
    def apply(
      S3: js.UndefOr[S3Storage] = js.undefined): Storage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3" -> S3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Storage]
    }
  }

  /**
   * <p>Describes a storage location in Amazon S3.</p>
   */
  @js.native
  trait StorageLocation extends js.Object {
    var Bucket: js.UndefOr[String]
    var Key: js.UndefOr[String]
  }

  object StorageLocation {
    def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined): StorageLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageLocation]
    }
  }

  /**
   * <p>Describes a subnet.</p>
   */
  @js.native
  trait Subnet extends js.Object {
    var CidrBlock: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet]
    var Tags: js.UndefOr[TagList]
    var AssignIpv6AddressOnCreation: js.UndefOr[Boolean]
    var DefaultForAz: js.UndefOr[Boolean]
    var AvailableIpAddressCount: js.UndefOr[Int]
    var MapPublicIpOnLaunch: js.UndefOr[Boolean]
    var State: js.UndefOr[SubnetState]
    var VpcId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  object Subnet {
    def apply(
      CidrBlock: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined,
      DefaultForAz: js.UndefOr[Boolean] = js.undefined,
      AvailableIpAddressCount: js.UndefOr[Int] = js.undefined,
      MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined,
      State: js.UndefOr[SubnetState] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlockAssociationSet" -> Ipv6CidrBlockAssociationSet.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "AssignIpv6AddressOnCreation" -> AssignIpv6AddressOnCreation.map { x => x.asInstanceOf[js.Any] },
        "DefaultForAz" -> DefaultForAz.map { x => x.asInstanceOf[js.Any] },
        "AvailableIpAddressCount" -> AvailableIpAddressCount.map { x => x.asInstanceOf[js.Any] },
        "MapPublicIpOnLaunch" -> MapPublicIpOnLaunch.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p>Describes the state of a CIDR block.</p>
   */
  @js.native
  trait SubnetCidrBlockState extends js.Object {
    var State: js.UndefOr[SubnetCidrBlockStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  object SubnetCidrBlockState {
    def apply(
      State: js.UndefOr[SubnetCidrBlockStateCode] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined): SubnetCidrBlockState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetCidrBlockState]
    }
  }

  object SubnetCidrBlockStateCodeEnum {
    val associating = "associating"
    val associated = "associated"
    val disassociating = "disassociating"
    val disassociated = "disassociated"
    val failing = "failing"
    val failed = "failed"

    val values = IndexedSeq(associating, associated, disassociating, disassociated, failing, failed)
  }

  /**
   * <p>Describes an IPv6 CIDR block associated with a subnet.</p>
   */
  @js.native
  trait SubnetIpv6CidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var Ipv6CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockState: js.UndefOr[SubnetCidrBlockState]
  }

  object SubnetIpv6CidrBlockAssociation {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockState: js.UndefOr[SubnetCidrBlockState] = js.undefined): SubnetIpv6CidrBlockAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlockState" -> Ipv6CidrBlockState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetIpv6CidrBlockAssociation]
    }
  }

  object SubnetStateEnum {
    val pending = "pending"
    val available = "available"

    val values = IndexedSeq(pending, available)
  }

  /**
   * <p>Describes the T2 or T3 instance whose credit option for CPU usage was successfully modified.</p>
   */
  @js.native
  trait SuccessfulInstanceCreditSpecificationItem extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  object SuccessfulInstanceCreditSpecificationItem {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined): SuccessfulInstanceCreditSpecificationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuccessfulInstanceCreditSpecificationItem]
    }
  }

  object SummaryStatusEnum {
    val ok = "ok"
    val impaired = "impaired"
    val `insufficient-data` = "insufficient-data"
    val `not-applicable` = "not-applicable"
    val initializing = "initializing"

    val values = IndexedSeq(ok, impaired, `insufficient-data`, `not-applicable`, initializing)
  }

  /**
   * <p>Describes a tag.</p>
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
   * <p>Describes a tag.</p>
   */
  @js.native
  trait TagDescription extends js.Object {
    var Key: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
    var Value: js.UndefOr[String]
  }

  object TagDescription {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      ResourceId: js.UndefOr[String] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  /**
   * <p>The tags to apply to a resource when the resource is being created.</p>
   */
  @js.native
  trait TagSpecification extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object TagSpecification {
    def apply(
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagSpecification]
    }
  }

  /**
   * <p>The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.</p>
   */
  @js.native
  trait TargetCapacitySpecification extends js.Object {
    var TotalTargetCapacity: js.UndefOr[Int]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var SpotTargetCapacity: js.UndefOr[Int]
    var DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType]
  }

  object TargetCapacitySpecification {
    def apply(
      TotalTargetCapacity: js.UndefOr[Int] = js.undefined,
      OnDemandTargetCapacity: js.UndefOr[Int] = js.undefined,
      SpotTargetCapacity: js.UndefOr[Int] = js.undefined,
      DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType] = js.undefined): TargetCapacitySpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalTargetCapacity" -> TotalTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "OnDemandTargetCapacity" -> OnDemandTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "SpotTargetCapacity" -> SpotTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "DefaultTargetCapacityType" -> DefaultTargetCapacityType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetCapacitySpecification]
    }
  }

  /**
   * <p>The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.</p>
   */
  @js.native
  trait TargetCapacitySpecificationRequest extends js.Object {
    var TotalTargetCapacity: js.UndefOr[Int]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var SpotTargetCapacity: js.UndefOr[Int]
    var DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType]
  }

  object TargetCapacitySpecificationRequest {
    def apply(
      TotalTargetCapacity: js.UndefOr[Int] = js.undefined,
      OnDemandTargetCapacity: js.UndefOr[Int] = js.undefined,
      SpotTargetCapacity: js.UndefOr[Int] = js.undefined,
      DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType] = js.undefined): TargetCapacitySpecificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalTargetCapacity" -> TotalTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "OnDemandTargetCapacity" -> OnDemandTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "SpotTargetCapacity" -> SpotTargetCapacity.map { x => x.asInstanceOf[js.Any] },
        "DefaultTargetCapacityType" -> DefaultTargetCapacityType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetCapacitySpecificationRequest]
    }
  }

  /**
   * <p>Information about the Convertible Reserved Instance offering.</p>
   */
  @js.native
  trait TargetConfiguration extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var OfferingId: js.UndefOr[String]
  }

  object TargetConfiguration {
    def apply(
      InstanceCount: js.UndefOr[Int] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined): TargetConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetConfiguration]
    }
  }

  /**
   * <p>Details about the target configuration.</p>
   */
  @js.native
  trait TargetConfigurationRequest extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var OfferingId: js.UndefOr[String]
  }

  object TargetConfigurationRequest {
    def apply(
      InstanceCount: js.UndefOr[Int] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined): TargetConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "OfferingId" -> OfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetConfigurationRequest]
    }
  }

  /**
   * <p>Describes a load balancer target group.</p>
   */
  @js.native
  trait TargetGroup extends js.Object {
    var Arn: js.UndefOr[String]
  }

  object TargetGroup {
    def apply(
      Arn: js.UndefOr[String] = js.undefined): TargetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroup]
    }
  }

  /**
   * <p>Describes the target groups to attach to a Spot Fleet. Spot Fleet registers the running Spot Instances with these target groups.</p>
   */
  @js.native
  trait TargetGroupsConfig extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  object TargetGroupsConfig {
    def apply(
      TargetGroups: js.UndefOr[TargetGroups] = js.undefined): TargetGroupsConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroups" -> TargetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroupsConfig]
    }
  }

  /**
   * <p>The total value of the new Convertible Reserved Instances.</p>
   */
  @js.native
  trait TargetReservationValue extends js.Object {
    var ReservationValue: js.UndefOr[ReservationValue]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
  }

  object TargetReservationValue {
    def apply(
      ReservationValue: js.UndefOr[ReservationValue] = js.undefined,
      TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined): TargetReservationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservationValue" -> ReservationValue.map { x => x.asInstanceOf[js.Any] },
        "TargetConfiguration" -> TargetConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetReservationValue]
    }
  }

  object TelemetryStatusEnum {
    val UP = "UP"
    val DOWN = "DOWN"

    val values = IndexedSeq(UP, DOWN)
  }

  object TenancyEnum {
    val default = "default"
    val dedicated = "dedicated"
    val host = "host"

    val values = IndexedSeq(default, dedicated, host)
  }

  /**
   * <p>Contains the parameters for TerminateInstances.</p>
   */
  @js.native
  trait TerminateInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object TerminateInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): TerminateInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of TerminateInstances.</p>
   */
  @js.native
  trait TerminateInstancesResult extends js.Object {
    var TerminatingInstances: js.UndefOr[InstanceStateChangeList]
  }

  object TerminateInstancesResult {
    def apply(
      TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined): TerminateInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminatingInstances" -> TerminatingInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateInstancesResult]
    }
  }

  object TrafficTypeEnum {
    val ACCEPT = "ACCEPT"
    val REJECT = "REJECT"
    val ALL = "ALL"

    val values = IndexedSeq(ACCEPT, REJECT, ALL)
  }

  @js.native
  trait UnassignIpv6AddressesRequest extends js.Object {
    var Ipv6Addresses: js.UndefOr[Ipv6AddressList]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  object UnassignIpv6AddressesRequest {
    def apply(
      Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined): UnassignIpv6AddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignIpv6AddressesRequest]
    }
  }

  @js.native
  trait UnassignIpv6AddressesResult extends js.Object {
    var NetworkInterfaceId: js.UndefOr[String]
    var UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList]
  }

  object UnassignIpv6AddressesResult {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined): UnassignIpv6AddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "UnassignedIpv6Addresses" -> UnassignedIpv6Addresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignIpv6AddressesResult]
    }
  }

  /**
   * <p>Contains the parameters for UnassignPrivateIpAddresses.</p>
   */
  @js.native
  trait UnassignPrivateIpAddressesRequest extends js.Object {
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList]
  }

  object UnassignPrivateIpAddressesRequest {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined): UnassignPrivateIpAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignPrivateIpAddressesRequest]
    }
  }

  /**
   * <p>Contains the parameters for UnmonitorInstances.</p>
   */
  @js.native
  trait UnmonitorInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  object UnmonitorInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): UnmonitorInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnmonitorInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of UnmonitorInstances.</p>
   */
  @js.native
  trait UnmonitorInstancesResult extends js.Object {
    var InstanceMonitorings: js.UndefOr[InstanceMonitoringList]
  }

  object UnmonitorInstancesResult {
    def apply(
      InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined): UnmonitorInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceMonitorings" -> InstanceMonitorings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnmonitorInstancesResult]
    }
  }

  object UnsuccessfulInstanceCreditSpecificationErrorCodeEnum {
    val `InvalidInstanceID.Malformed` = "InvalidInstanceID.Malformed"
    val `InvalidInstanceID.NotFound` = "InvalidInstanceID.NotFound"
    val IncorrectInstanceState = "IncorrectInstanceState"
    val `InstanceCreditSpecification.NotSupported` = "InstanceCreditSpecification.NotSupported"

    val values = IndexedSeq(`InvalidInstanceID.Malformed`, `InvalidInstanceID.NotFound`, IncorrectInstanceState, `InstanceCreditSpecification.NotSupported`)
  }

  /**
   * <p>Describes the T2 or T3 instance whose credit option for CPU usage was not modified.</p>
   */
  @js.native
  trait UnsuccessfulInstanceCreditSpecificationItem extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError]
  }

  object UnsuccessfulInstanceCreditSpecificationItem {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError] = js.undefined): UnsuccessfulInstanceCreditSpecificationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsuccessfulInstanceCreditSpecificationItem]
    }
  }

  /**
   * <p>Information about the error for the T2 or T3 instance whose credit option for CPU usage was not modified.</p>
   */
  @js.native
  trait UnsuccessfulInstanceCreditSpecificationItemError extends js.Object {
    var Code: js.UndefOr[UnsuccessfulInstanceCreditSpecificationErrorCode]
    var Message: js.UndefOr[String]
  }

  object UnsuccessfulInstanceCreditSpecificationItemError {
    def apply(
      Code: js.UndefOr[UnsuccessfulInstanceCreditSpecificationErrorCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): UnsuccessfulInstanceCreditSpecificationItemError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsuccessfulInstanceCreditSpecificationItemError]
    }
  }

  /**
   * <p>Information about items that were not successfully processed in a batch call.</p>
   */
  @js.native
  trait UnsuccessfulItem extends js.Object {
    var Error: js.UndefOr[UnsuccessfulItemError]
    var ResourceId: js.UndefOr[String]
  }

  object UnsuccessfulItem {
    def apply(
      Error: js.UndefOr[UnsuccessfulItemError] = js.undefined,
      ResourceId: js.UndefOr[String] = js.undefined): UnsuccessfulItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsuccessfulItem]
    }
  }

  /**
   * <p>Information about the error that occurred. For more information about errors, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.</p>
   */
  @js.native
  trait UnsuccessfulItemError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object UnsuccessfulItemError {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): UnsuccessfulItemError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsuccessfulItemError]
    }
  }

  @js.native
  trait UpdateSecurityGroupRuleDescriptionsEgressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
  }

  object UpdateSecurityGroupRuleDescriptionsEgressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined): UpdateSecurityGroupRuleDescriptionsEgressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityGroupRuleDescriptionsEgressRequest]
    }
  }

  @js.native
  trait UpdateSecurityGroupRuleDescriptionsEgressResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object UpdateSecurityGroupRuleDescriptionsEgressResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): UpdateSecurityGroupRuleDescriptionsEgressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityGroupRuleDescriptionsEgressResult]
    }
  }

  @js.native
  trait UpdateSecurityGroupRuleDescriptionsIngressRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
  }

  object UpdateSecurityGroupRuleDescriptionsIngressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined): UpdateSecurityGroupRuleDescriptionsIngressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "IpPermissions" -> IpPermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityGroupRuleDescriptionsIngressRequest]
    }
  }

  @js.native
  trait UpdateSecurityGroupRuleDescriptionsIngressResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  object UpdateSecurityGroupRuleDescriptionsIngressResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined): UpdateSecurityGroupRuleDescriptionsIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Return" -> Return.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityGroupRuleDescriptionsIngressResult]
    }
  }

  /**
   * <p>Describes the S3 bucket for the disk image.</p>
   */
  @js.native
  trait UserBucket extends js.Object {
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  object UserBucket {
    def apply(
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined): UserBucket = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserBucket]
    }
  }

  /**
   * <p>Describes the S3 bucket for the disk image.</p>
   */
  @js.native
  trait UserBucketDetails extends js.Object {
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  object UserBucketDetails {
    def apply(
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined): UserBucketDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserBucketDetails]
    }
  }

  /**
   * <p>Describes the user data for an instance.</p>
   */
  @js.native
  trait UserData extends js.Object {
    var Data: js.UndefOr[String]
  }

  object UserData {
    def apply(
      Data: js.UndefOr[String] = js.undefined): UserData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserData]
    }
  }

  /**
   * <p>Describes a security group and AWS account ID pair.</p>
   */
  @js.native
  trait UserIdGroupPair extends js.Object {
    var VpcPeeringConnectionId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var PeeringStatus: js.UndefOr[String]
    var UserId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object UserIdGroupPair {
    def apply(
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      PeeringStatus: js.UndefOr[String] = js.undefined,
      UserId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): UserIdGroupPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] },
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "PeeringStatus" -> PeeringStatus.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserIdGroupPair]
    }
  }

  /**
   * <p>Describes telemetry for a VPN tunnel.</p>
   */
  @js.native
  trait VgwTelemetry extends js.Object {
    var StatusMessage: js.UndefOr[String]
    var AcceptedRouteCount: js.UndefOr[Int]
    var LastStatusChange: js.UndefOr[DateTime]
    var OutsideIpAddress: js.UndefOr[String]
    var Status: js.UndefOr[TelemetryStatus]
  }

  object VgwTelemetry {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      AcceptedRouteCount: js.UndefOr[Int] = js.undefined,
      LastStatusChange: js.UndefOr[DateTime] = js.undefined,
      OutsideIpAddress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[TelemetryStatus] = js.undefined): VgwTelemetry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "AcceptedRouteCount" -> AcceptedRouteCount.map { x => x.asInstanceOf[js.Any] },
        "LastStatusChange" -> LastStatusChange.map { x => x.asInstanceOf[js.Any] },
        "OutsideIpAddress" -> OutsideIpAddress.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VgwTelemetry]
    }
  }

  object VirtualizationTypeEnum {
    val hvm = "hvm"
    val paravirtual = "paravirtual"

    val values = IndexedSeq(hvm, paravirtual)
  }

  /**
   * <p>Describes a volume.</p>
   */
  @js.native
  trait Volume extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var Attachments: js.UndefOr[VolumeAttachmentList]
    var Size: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var Tags: js.UndefOr[TagList]
    var CreateTime: js.UndefOr[DateTime]
    var State: js.UndefOr[VolumeState]
  }

  object Volume {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      Attachments: js.UndefOr[VolumeAttachmentList] = js.undefined,
      Size: js.UndefOr[Int] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      Iops: js.UndefOr[Int] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[VolumeState] = js.undefined): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "Attachments" -> Attachments.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "CreateTime" -> CreateTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }

  /**
   * <p>Describes volume attachment details.</p>
   */
  @js.native
  trait VolumeAttachment extends js.Object {
    var Device: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var AttachTime: js.UndefOr[DateTime]
    var State: js.UndefOr[VolumeAttachmentState]
  }

  object VolumeAttachment {
    def apply(
      Device: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[VolumeAttachmentState] = js.undefined): VolumeAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "AttachTime" -> AttachTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeAttachment]
    }
  }

  object VolumeAttachmentStateEnum {
    val attaching = "attaching"
    val attached = "attached"
    val detaching = "detaching"
    val detached = "detached"
    val busy = "busy"

    val values = IndexedSeq(attaching, attached, detaching, detached, busy)
  }

  object VolumeAttributeNameEnum {
    val autoEnableIO = "autoEnableIO"
    val productCodes = "productCodes"

    val values = IndexedSeq(autoEnableIO, productCodes)
  }

  /**
   * <p>Describes an EBS volume.</p>
   */
  @js.native
  trait VolumeDetail extends js.Object {
    var Size: js.UndefOr[Double]
  }

  object VolumeDetail {
    def apply(
      Size: js.UndefOr[Double] = js.undefined): VolumeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeDetail]
    }
  }

  /**
   * <p>Describes the modification status of an EBS volume.</p> <p>If the volume has never been modified, some element values will be null.</p>
   */
  @js.native
  trait VolumeModification extends js.Object {
    var OriginalSize: js.UndefOr[Int]
    var StatusMessage: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var TargetVolumeType: js.UndefOr[VolumeType]
    var StartTime: js.UndefOr[DateTime]
    var EndTime: js.UndefOr[DateTime]
    var TargetIops: js.UndefOr[Int]
    var TargetSize: js.UndefOr[Int]
    var ModificationState: js.UndefOr[VolumeModificationState]
    var Progress: js.UndefOr[Double]
    var OriginalVolumeType: js.UndefOr[VolumeType]
    var OriginalIops: js.UndefOr[Int]
  }

  object VolumeModification {
    def apply(
      OriginalSize: js.UndefOr[Int] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      TargetVolumeType: js.UndefOr[VolumeType] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      TargetIops: js.UndefOr[Int] = js.undefined,
      TargetSize: js.UndefOr[Int] = js.undefined,
      ModificationState: js.UndefOr[VolumeModificationState] = js.undefined,
      Progress: js.UndefOr[Double] = js.undefined,
      OriginalVolumeType: js.UndefOr[VolumeType] = js.undefined,
      OriginalIops: js.UndefOr[Int] = js.undefined): VolumeModification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OriginalSize" -> OriginalSize.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "TargetVolumeType" -> TargetVolumeType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "TargetIops" -> TargetIops.map { x => x.asInstanceOf[js.Any] },
        "TargetSize" -> TargetSize.map { x => x.asInstanceOf[js.Any] },
        "ModificationState" -> ModificationState.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "OriginalVolumeType" -> OriginalVolumeType.map { x => x.asInstanceOf[js.Any] },
        "OriginalIops" -> OriginalIops.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeModification]
    }
  }

  object VolumeModificationStateEnum {
    val modifying = "modifying"
    val optimizing = "optimizing"
    val completed = "completed"
    val failed = "failed"

    val values = IndexedSeq(modifying, optimizing, completed, failed)
  }

  object VolumeStateEnum {
    val creating = "creating"
    val available = "available"
    val `in-use` = "in-use"
    val deleting = "deleting"
    val deleted = "deleted"
    val error = "error"

    val values = IndexedSeq(creating, available, `in-use`, deleting, deleted, error)
  }

  /**
   * <p>Describes a volume status operation code.</p>
   */
  @js.native
  trait VolumeStatusAction extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var EventType: js.UndefOr[String]
  }

  object VolumeStatusAction {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      EventType: js.UndefOr[String] = js.undefined): VolumeStatusAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusAction]
    }
  }

  /**
   * <p>Describes a volume status.</p>
   */
  @js.native
  trait VolumeStatusDetails extends js.Object {
    var Name: js.UndefOr[VolumeStatusName]
    var Status: js.UndefOr[String]
  }

  object VolumeStatusDetails {
    def apply(
      Name: js.UndefOr[VolumeStatusName] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): VolumeStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusDetails]
    }
  }

  /**
   * <p>Describes a volume status event.</p>
   */
  @js.native
  trait VolumeStatusEvent extends js.Object {
    var NotBefore: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var EventType: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var NotAfter: js.UndefOr[DateTime]
  }

  object VolumeStatusEvent {
    def apply(
      NotBefore: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EventType: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      NotAfter: js.UndefOr[DateTime] = js.undefined): VolumeStatusEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotBefore" -> NotBefore.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "NotAfter" -> NotAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusEvent]
    }
  }

  /**
   * <p>Describes the status of a volume.</p>
   */
  @js.native
  trait VolumeStatusInfo extends js.Object {
    var Details: js.UndefOr[VolumeStatusDetailsList]
    var Status: js.UndefOr[VolumeStatusInfoStatus]
  }

  object VolumeStatusInfo {
    def apply(
      Details: js.UndefOr[VolumeStatusDetailsList] = js.undefined,
      Status: js.UndefOr[VolumeStatusInfoStatus] = js.undefined): VolumeStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusInfo]
    }
  }

  object VolumeStatusInfoStatusEnum {
    val ok = "ok"
    val impaired = "impaired"
    val `insufficient-data` = "insufficient-data"

    val values = IndexedSeq(ok, impaired, `insufficient-data`)
  }

  /**
   * <p>Describes the volume status.</p>
   */
  @js.native
  trait VolumeStatusItem extends js.Object {
    var VolumeId: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var VolumeStatus: js.UndefOr[VolumeStatusInfo]
    var Events: js.UndefOr[VolumeStatusEventsList]
    var Actions: js.UndefOr[VolumeStatusActionsList]
  }

  object VolumeStatusItem {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.undefined,
      Events: js.UndefOr[VolumeStatusEventsList] = js.undefined,
      Actions: js.UndefOr[VolumeStatusActionsList] = js.undefined): VolumeStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "VolumeStatus" -> VolumeStatus.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusItem]
    }
  }

  object VolumeStatusNameEnum {
    val `io-enabled` = "io-enabled"
    val `io-performance` = "io-performance"

    val values = IndexedSeq(`io-enabled`, `io-performance`)
  }

  object VolumeTypeEnum {
    val standard = "standard"
    val io1 = "io1"
    val gp2 = "gp2"
    val sc1 = "sc1"
    val st1 = "st1"

    val values = IndexedSeq(standard, io1, gp2, sc1, st1)
  }

  /**
   * <p>Describes a VPC.</p>
   */
  @js.native
  trait Vpc extends js.Object {
    var DhcpOptionsId: js.UndefOr[String]
    var CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet]
    var Tags: js.UndefOr[TagList]
    var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet]
    var State: js.UndefOr[VpcState]
    var IsDefault: js.UndefOr[Boolean]
    var InstanceTenancy: js.UndefOr[Tenancy]
    var VpcId: js.UndefOr[String]
  }

  object Vpc {
    def apply(
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet] = js.undefined,
      State: js.UndefOr[VpcState] = js.undefined,
      IsDefault: js.UndefOr[Boolean] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): Vpc = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DhcpOptionsId" -> DhcpOptionsId.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlockAssociationSet" -> Ipv6CidrBlockAssociationSet.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "CidrBlockAssociationSet" -> CidrBlockAssociationSet.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] },
        "InstanceTenancy" -> InstanceTenancy.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Vpc]
    }
  }

  /**
   * <p>Describes an attachment between a virtual private gateway and a VPC.</p>
   */
  @js.native
  trait VpcAttachment extends js.Object {
    var State: js.UndefOr[AttachmentStatus]
    var VpcId: js.UndefOr[String]
  }

  object VpcAttachment {
    def apply(
      State: js.UndefOr[AttachmentStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): VpcAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcAttachment]
    }
  }

  object VpcAttributeNameEnum {
    val enableDnsSupport = "enableDnsSupport"
    val enableDnsHostnames = "enableDnsHostnames"

    val values = IndexedSeq(enableDnsSupport, enableDnsHostnames)
  }

  /**
   * <p>Describes an IPv4 CIDR block associated with a VPC.</p>
   */
  @js.native
  trait VpcCidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var CidrBlock: js.UndefOr[String]
    var CidrBlockState: js.UndefOr[VpcCidrBlockState]
  }

  object VpcCidrBlockAssociation {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.undefined): VpcCidrBlockAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "CidrBlockState" -> CidrBlockState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcCidrBlockAssociation]
    }
  }

  /**
   * <p>Describes the state of a CIDR block.</p>
   */
  @js.native
  trait VpcCidrBlockState extends js.Object {
    var State: js.UndefOr[VpcCidrBlockStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  object VpcCidrBlockState {
    def apply(
      State: js.UndefOr[VpcCidrBlockStateCode] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined): VpcCidrBlockState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcCidrBlockState]
    }
  }

  object VpcCidrBlockStateCodeEnum {
    val associating = "associating"
    val associated = "associated"
    val disassociating = "disassociating"
    val disassociated = "disassociated"
    val failing = "failing"
    val failed = "failed"

    val values = IndexedSeq(associating, associated, disassociating, disassociated, failing, failed)
  }

  /**
   * <p>Describes whether a VPC is enabled for ClassicLink.</p>
   */
  @js.native
  trait VpcClassicLink extends js.Object {
    var ClassicLinkEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  object VpcClassicLink {
    def apply(
      ClassicLinkEnabled: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): VpcClassicLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClassicLinkEnabled" -> ClassicLinkEnabled.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcClassicLink]
    }
  }

  /**
   * <p>Describes a VPC endpoint.</p>
   */
  @js.native
  trait VpcEndpoint extends js.Object {
    var NetworkInterfaceIds: js.UndefOr[ValueStringList]
    var ServiceName: js.UndefOr[String]
    var VpcEndpointId: js.UndefOr[String]
    var PolicyDocument: js.UndefOr[String]
    var Groups: js.UndefOr[GroupIdentifierSet]
    var RouteTableIds: js.UndefOr[ValueStringList]
    var VpcEndpointType: js.UndefOr[VpcEndpointType]
    var DnsEntries: js.UndefOr[DnsEntrySet]
    var CreationTimestamp: js.UndefOr[DateTime]
    var SubnetIds: js.UndefOr[ValueStringList]
    var PrivateDnsEnabled: js.UndefOr[Boolean]
    var State: js.UndefOr[State]
    var VpcId: js.UndefOr[String]
  }

  object VpcEndpoint {
    def apply(
      NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.undefined,
      ServiceName: js.UndefOr[String] = js.undefined,
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      PolicyDocument: js.UndefOr[String] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierSet] = js.undefined,
      RouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      VpcEndpointType: js.UndefOr[VpcEndpointType] = js.undefined,
      DnsEntries: js.UndefOr[DnsEntrySet] = js.undefined,
      CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
      SubnetIds: js.UndefOr[ValueStringList] = js.undefined,
      PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined,
      State: js.UndefOr[State] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): VpcEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkInterfaceIds" -> NetworkInterfaceIds.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointId" -> VpcEndpointId.map { x => x.asInstanceOf[js.Any] },
        "PolicyDocument" -> PolicyDocument.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "RouteTableIds" -> RouteTableIds.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointType" -> VpcEndpointType.map { x => x.asInstanceOf[js.Any] },
        "DnsEntries" -> DnsEntries.map { x => x.asInstanceOf[js.Any] },
        "CreationTimestamp" -> CreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "PrivateDnsEnabled" -> PrivateDnsEnabled.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcEndpoint]
    }
  }

  /**
   * <p>Describes a VPC endpoint connection to a service.</p>
   */
  @js.native
  trait VpcEndpointConnection extends js.Object {
    var VpcEndpointId: js.UndefOr[String]
    var VpcEndpointState: js.UndefOr[State]
    var CreationTimestamp: js.UndefOr[DateTime]
    var ServiceId: js.UndefOr[String]
    var VpcEndpointOwner: js.UndefOr[String]
  }

  object VpcEndpointConnection {
    def apply(
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      VpcEndpointState: js.UndefOr[State] = js.undefined,
      CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
      ServiceId: js.UndefOr[String] = js.undefined,
      VpcEndpointOwner: js.UndefOr[String] = js.undefined): VpcEndpointConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcEndpointId" -> VpcEndpointId.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointState" -> VpcEndpointState.map { x => x.asInstanceOf[js.Any] },
        "CreationTimestamp" -> CreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "VpcEndpointOwner" -> VpcEndpointOwner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcEndpointConnection]
    }
  }

  object VpcEndpointTypeEnum {
    val Interface = "Interface"
    val Gateway = "Gateway"

    val values = IndexedSeq(Interface, Gateway)
  }

  /**
   * <p>Describes an IPv6 CIDR block associated with a VPC.</p>
   */
  @js.native
  trait VpcIpv6CidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var Ipv6CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState]
  }

  object VpcIpv6CidrBlockAssociation {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.undefined): VpcIpv6CidrBlockAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationId" -> AssociationId.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlockState" -> Ipv6CidrBlockState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcIpv6CidrBlockAssociation]
    }
  }

  /**
   * <p>Describes a VPC peering connection.</p>
   */
  @js.native
  trait VpcPeeringConnection extends js.Object {
    var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo]
    var VpcPeeringConnectionId: js.UndefOr[String]
    var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo]
    var ExpirationTime: js.UndefOr[DateTime]
    var Tags: js.UndefOr[TagList]
    var Status: js.UndefOr[VpcPeeringConnectionStateReason]
  }

  object VpcPeeringConnection {
    def apply(
      AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined,
      ExpirationTime: js.UndefOr[DateTime] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.undefined): VpcPeeringConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccepterVpcInfo" -> AccepterVpcInfo.map { x => x.asInstanceOf[js.Any] },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x.asInstanceOf[js.Any] },
        "RequesterVpcInfo" -> RequesterVpcInfo.map { x => x.asInstanceOf[js.Any] },
        "ExpirationTime" -> ExpirationTime.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnection]
    }
  }

  /**
   * <p>Describes the VPC peering connection options.</p>
   */
  @js.native
  trait VpcPeeringConnectionOptionsDescription extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  object VpcPeeringConnectionOptionsDescription {
    def apply(
      AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined): VpcPeeringConnectionOptionsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowDnsResolutionFromRemoteVpc" -> AllowDnsResolutionFromRemoteVpc.map { x => x.asInstanceOf[js.Any] },
        "AllowEgressFromLocalClassicLinkToRemoteVpc" -> AllowEgressFromLocalClassicLinkToRemoteVpc.map { x => x.asInstanceOf[js.Any] },
        "AllowEgressFromLocalVpcToRemoteClassicLink" -> AllowEgressFromLocalVpcToRemoteClassicLink.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionOptionsDescription]
    }
  }

  /**
   * <p>Describes the status of a VPC peering connection.</p>
   */
  @js.native
  trait VpcPeeringConnectionStateReason extends js.Object {
    var Code: js.UndefOr[VpcPeeringConnectionStateReasonCode]
    var Message: js.UndefOr[String]
  }

  object VpcPeeringConnectionStateReason {
    def apply(
      Code: js.UndefOr[VpcPeeringConnectionStateReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): VpcPeeringConnectionStateReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionStateReason]
    }
  }

  object VpcPeeringConnectionStateReasonCodeEnum {
    val `initiating-request` = "initiating-request"
    val `pending-acceptance` = "pending-acceptance"
    val active = "active"
    val deleted = "deleted"
    val rejected = "rejected"
    val failed = "failed"
    val expired = "expired"
    val provisioning = "provisioning"
    val deleting = "deleting"

    val values = IndexedSeq(`initiating-request`, `pending-acceptance`, active, deleted, rejected, failed, expired, provisioning, deleting)
  }

  /**
   * <p>Describes a VPC in a VPC peering connection.</p>
   */
  @js.native
  trait VpcPeeringConnectionVpcInfo extends js.Object {
    var Region: js.UndefOr[String]
    var CidrBlock: js.UndefOr[String]
    var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription]
    var OwnerId: js.UndefOr[String]
    var CidrBlockSet: js.UndefOr[CidrBlockSet]
    var Ipv6CidrBlockSet: js.UndefOr[Ipv6CidrBlockSet]
    var VpcId: js.UndefOr[String]
  }

  object VpcPeeringConnectionVpcInfo {
    def apply(
      Region: js.UndefOr[String] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      CidrBlockSet: js.UndefOr[CidrBlockSet] = js.undefined,
      Ipv6CidrBlockSet: js.UndefOr[Ipv6CidrBlockSet] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): VpcPeeringConnectionVpcInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "CidrBlock" -> CidrBlock.map { x => x.asInstanceOf[js.Any] },
        "PeeringOptions" -> PeeringOptions.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "CidrBlockSet" -> CidrBlockSet.map { x => x.asInstanceOf[js.Any] },
        "Ipv6CidrBlockSet" -> Ipv6CidrBlockSet.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionVpcInfo]
    }
  }

  object VpcStateEnum {
    val pending = "pending"
    val available = "available"

    val values = IndexedSeq(pending, available)
  }

  object VpcTenancyEnum {
    val default = "default"

    val values = IndexedSeq(default)
  }

  /**
   * <p>Describes a VPN connection.</p>
   */
  @js.native
  trait VpnConnection extends js.Object {
    var Category: js.UndefOr[String]
    var CustomerGatewayId: js.UndefOr[String]
    var VpnConnectionId: js.UndefOr[String]
    var VgwTelemetry: js.UndefOr[VgwTelemetryList]
    var Routes: js.UndefOr[VpnStaticRouteList]
    var Tags: js.UndefOr[TagList]
    var Options: js.UndefOr[VpnConnectionOptions]
    var VpnGatewayId: js.UndefOr[String]
    var State: js.UndefOr[VpnState]
    var CustomerGatewayConfiguration: js.UndefOr[String]
    var Type: js.UndefOr[GatewayType]
  }

  object VpnConnection {
    def apply(
      Category: js.UndefOr[String] = js.undefined,
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      VpnConnectionId: js.UndefOr[String] = js.undefined,
      VgwTelemetry: js.UndefOr[VgwTelemetryList] = js.undefined,
      Routes: js.UndefOr[VpnStaticRouteList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Options: js.UndefOr[VpnConnectionOptions] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[VpnState] = js.undefined,
      CustomerGatewayConfiguration: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined): VpnConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "CustomerGatewayId" -> CustomerGatewayId.map { x => x.asInstanceOf[js.Any] },
        "VpnConnectionId" -> VpnConnectionId.map { x => x.asInstanceOf[js.Any] },
        "VgwTelemetry" -> VgwTelemetry.map { x => x.asInstanceOf[js.Any] },
        "Routes" -> Routes.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "VpnGatewayId" -> VpnGatewayId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "CustomerGatewayConfiguration" -> CustomerGatewayConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnConnection]
    }
  }

  /**
   * <p>Describes VPN connection options.</p>
   */
  @js.native
  trait VpnConnectionOptions extends js.Object {
    var StaticRoutesOnly: js.UndefOr[Boolean]
  }

  object VpnConnectionOptions {
    def apply(
      StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined): VpnConnectionOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StaticRoutesOnly" -> StaticRoutesOnly.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnConnectionOptions]
    }
  }

  /**
   * <p>Describes VPN connection options.</p>
   */
  @js.native
  trait VpnConnectionOptionsSpecification extends js.Object {
    var StaticRoutesOnly: js.UndefOr[Boolean]
    var TunnelOptions: js.UndefOr[TunnelOptionsList]
  }

  object VpnConnectionOptionsSpecification {
    def apply(
      StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined,
      TunnelOptions: js.UndefOr[TunnelOptionsList] = js.undefined): VpnConnectionOptionsSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StaticRoutesOnly" -> StaticRoutesOnly.map { x => x.asInstanceOf[js.Any] },
        "TunnelOptions" -> TunnelOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnConnectionOptionsSpecification]
    }
  }

  /**
   * <p>Describes a virtual private gateway.</p>
   */
  @js.native
  trait VpnGateway extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var AmazonSideAsn: js.UndefOr[Double]
    var Tags: js.UndefOr[TagList]
    var VpnGatewayId: js.UndefOr[String]
    var State: js.UndefOr[VpnState]
    var VpcAttachments: js.UndefOr[VpcAttachmentList]
    var Type: js.UndefOr[GatewayType]
  }

  object VpnGateway {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AmazonSideAsn: js.UndefOr[Double] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[VpnState] = js.undefined,
      VpcAttachments: js.UndefOr[VpcAttachmentList] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined): VpnGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AmazonSideAsn" -> AmazonSideAsn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpnGatewayId" -> VpnGatewayId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "VpcAttachments" -> VpcAttachments.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnGateway]
    }
  }

  object VpnStateEnum {
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, available, deleting, deleted)
  }

  /**
   * <p>Describes a static route for a VPN connection.</p>
   */
  @js.native
  trait VpnStaticRoute extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var Source: js.UndefOr[VpnStaticRouteSource]
    var State: js.UndefOr[VpnState]
  }

  object VpnStaticRoute {
    def apply(
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[VpnStaticRouteSource] = js.undefined,
      State: js.UndefOr[VpnState] = js.undefined): VpnStaticRoute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationCidrBlock" -> DestinationCidrBlock.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnStaticRoute]
    }
  }

  object VpnStaticRouteSourceEnum {
    val Static = "Static"

    val values = IndexedSeq(Static)
  }

  /**
   * <p>The tunnel options for a VPN connection.</p>
   */
  @js.native
  trait VpnTunnelOptionsSpecification extends js.Object {
    var TunnelInsideCidr: js.UndefOr[String]
    var PreSharedKey: js.UndefOr[String]
  }

  object VpnTunnelOptionsSpecification {
    def apply(
      TunnelInsideCidr: js.UndefOr[String] = js.undefined,
      PreSharedKey: js.UndefOr[String] = js.undefined): VpnTunnelOptionsSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TunnelInsideCidr" -> TunnelInsideCidr.map { x => x.asInstanceOf[js.Any] },
        "PreSharedKey" -> PreSharedKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnTunnelOptionsSpecification]
    }
  }

  @js.native
  trait WithdrawByoipCidrRequest extends js.Object {
    var Cidr: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  object WithdrawByoipCidrRequest {
    def apply(
      Cidr: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined): WithdrawByoipCidrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WithdrawByoipCidrRequest]
    }
  }

  @js.native
  trait WithdrawByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object WithdrawByoipCidrResult {
    def apply(
      ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined): WithdrawByoipCidrResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByoipCidr" -> ByoipCidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WithdrawByoipCidrResult]
    }
  }

  object scopeEnum {
    val `Availability Zone` = "Availability Zone"
    val Region = "Region"

    val values = IndexedSeq(`Availability Zone`, Region)
  }
}
