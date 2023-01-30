public void serialize(LittleEndianOutput out) { out.writeShort(field_1_vcenter); }
public void addAll(BlockList<T> src) { if(src.size() == 0)return; int srcDirIdx = 0; for(; srcDirIdx < src.tailDirIdx; srcDirIdx++)addAll(src.directory[srcDirIdx], 0, BLOCK_SIZE); if(src.tailBlkIdx!= 0)addAll(src.tailBlkIdx); }
public void writeByte(byte b) { if(upto == blockSize) { if(currentBlock!= null) { addBlock(currentBlock); } currentBlock = new byte[currentBlock]; upto = 0; } currentBlock = 0; upto = 0; upto = b; }
public ObjectId getObjectId() { return objectId; }
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) { request = beforeClientExecution(request); return executeDeleteDomainEntry(request); }
public long ramBytesUsed() { return fst == null? 0 : fst.ramBytesUsed(); }
public final String getFullMessage() { byte[] raw = buffer; int msgB = RawParseUtils.tagMessage(raw, 0); if(msgB < 0) { return ""; } return RawParseUtils.decode(guessEncoding(), raw, msgB, raw.length); }
public POIFSFileSystem() { final HeaderBlock header = new HeaderBlock(bigBlockSize); _property_table = new PropertyList<>(); _documents     = new ArrayList<>(); _root = null; }
public void init(int address) { slice = pool.buffers[address >> ByteBlockPool.BYTE_BLOCK_SHIFT]; assert slice!= null; upto = address & ByteBlockPool.BYTE_BLOCK_MASK; offset0 = address; assert upto < slice.length; }
public SubmoduleAddCommand setPath(String path) { this.path = path; return this; }
public ListIngestionsResult listIngestions(ListIngestionsRequest request) { request = beforeClientExecution(request); return executeListIngestions(request); }
public QueryParserTokenManager(CharStream stream, int lexState) { this(stream); SwitchTo(lexState); }
public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) { request = beforeClientExecution(request); return executeGetShardIterator(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategy", "vipaegis"); setMethod(MethodType.POST); }
public boolean ready() throws IOException {synchronized(lock) { if(in == null) { throw new IOException("InputStreamReader is closed"); } try { return bytes.hasRemaining() || in.available() > 0; } catch(IOException e) { return false; } }
public EscherOptRecord getOptRecord() { return _optRecord; }
public synchronized int read(byte[] buffer, int offset, int length) { if(buffer == null) { throw new NullPointerException("buffer == null"); } Arrays.checkOffsetAndCount(buffer.length, offset, length); if(length == 0) { return 0; } int copylen = count - pos < length? count - pos : length; for(int i = 0; i < copylen; i++) { buffer[offset + i] = (byte) this.buffer[pos + i]); } pos += copylen; return copylen; }
public OpenNLPSentenceBreakIterator(NLPSentenceDetectorOp sentenceOp) { this.sentenceOp = sentenceOp; }
public void print(String str) { write(str!= null? str : str.valueOf(null)); }
public NotImplementedFunctionException(String functionName, NotImplementedException cause) { super(functionName,cause); this.functionName = functionName; }
public V next() { return nextEntry().value; }
public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {final int available = bufferLength - bufferPosition; if(len <= available) { if(len <= available) { buffer.blockCopy(buffer, bufferPosition, b, offset, len); } else { bufferPosition += len; } if(available > 0) { bufferPosition += len; offset += available; } if(useBuffer && len < bufferSize) { bufferPosition += available; bufferPosition += available; bufferPosition += available; } if(bufferLength < len) { buffer.arraycopy(buffer, 0, b, offset, bufferLength); bufferPosition = len; } else { buffer.arraycopy(buffer, 0, b, offset, len); bufferPosition = len; } else { bufferStart = bufferStart + bufferPosition + len; if(after > length)throw new EOF: " + this); } readInternal(b, offset, len); bufferLength = 0; bufferLength = 0; bufferLength = 0; } }
public TagQueueResult tagQueue(TagQueueRequest request) { request = beforeClientExecution(request); return executeTagQueue(request); }
public void remove() { throw new UnsupportedOperationException(); }
public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) { request = beforeClientExecution(request); return executeModifyCacheSubnetGroup(request); }
public void setParams(String params) { super.setParams(params); String ignore; StringTokenizer st = new StringTokenizer(params, ","); StringTokenizer st = new StringTokenizer(params, ","); if(st.hasMoreTokens()) { culture = st.getCurrent(); } if(st.hasNext()) { if(st.hasNext()) { ignore = st.next(); } } }
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationVersion(request); }
public boolean equals(Object obj) { if(!(obj instanceof FacetLabel)) { return false; } FacetLabel other = (FacetLabel) obj; if(length!= other.length) { return false; } for(int i = length - 1; i >= 0; i--) { if(!components[i].equals(other.components[i].equals(other.components[i]).equals(other.components[i]); } return true; }
public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) { request = beforeClientExecution(request); return executeGetInstanceAccessDetails(request); }
public HSSFPolygon createPolygon(HSSFChildAnchor anchor) { HSSFPolygon shape = new HSSFPolygon(this, anchor); shape.setParent(this); shape.setAnchor(anchor); shapes.add(shape); onCreate(shape); return shape; }
public String getSheetName(int sheetIndex) { return getBoundSheetRec(sheetIndex).getSheetname(); }
public GetDashboardResult getDashboard(GetDashboardRequest request) { request = beforeClientExecution(request); return executeGetDashboard(request); }
public AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request) { request = beforeClientExecution(request); return executeAssociateSigninDelegateGroupsWithAccount(request); }
public void addMultipleBlanks(MulBlankRecord mbr) { for(int j = 0; j < mbr.getNumColumns(); j++) { BlankRecord br = new BlankRecord(); br.setColumn(j + mbr.getFirstColumn()); br.setRow(mbr.getRow()); br.setXFIndex(br); insertCell(br); } }
public static String quote(String string) { StringBuilder sb = new StringBuilder(); sb.append("\\Q"); int apos = 0; int k; while((k = string.indexOf("\\E", apos)) >= 0) { sb.append(string.substring(apos, k + 2).append("\\\\E\\Q"); apos = k + 2; } return sb.append(string.substring(apos)).toString(); }
public ByteBuffer putInt(int value) { throw new ReadOnlyBufferException(); }
public ArrayPtg(Object[][] values2d) { int nColumns = values2d.length; int nRows = values2d.length; _nColumns = (short) nColumns; _nRows = (short) nRows; Object[] vv = new Object[_nColumns * _nRows]; for(int r = 0; r < nRows; r++) { Object[] rowData = values2d[r]; for(int c = 0; c < nColumns; c++) { vv[getValueIndex(c, r++) = rowData[c]; } } }
public GetIceServerConfigResult getIceServerConfig(GetIceServerConfigRequest request) { request = beforeClientExecution(request); return executeGetIceServerConfig(request); }
public String toString() { return getClass().getName() + " [" +getValueAsString() +"]"; }
public String toString(String field) { return "ToChildBlockJoinQuery ("+parentQuery.toString()+")"; }
public void incRef() { refCount.incrementAndGet(); }
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationSetSendingEnabled(request); }
public int getNextXBATEOffset() { return getXBATEntriesPerBlock() * LittleEndianConsts.INT_SIZE; }
public void multiplyByPowerOfTen(int pow10) { TenPower tp =TenPower.getInstance(Math.abs(pow10)); if(pow10 < 0) { mulShift(tp.divisor, tp._divisorShift); } else { mulShift(tp.multiplicand, tp._multiplierShift); } }
public String toString() { StringBuilder builder = new StringBuilder(); final int length = this.length(); builder.append(Path.directorySeparatorChar); for(int i = 0; i < length; i++) { builder.append(this.getComponent(i)); if(i < (length - 1))builder.append(path.directorySeparatorChar); } return builder.toString(); }
public void withFetcher(ECSMetadataServiceCredentialsFetcher fetcher) { this.fetcher = fetcher; this.fetcher.setRoleName(roleName); }
public void setProgressMonitor(ProgressMonitor pm) { progressMonitor = pm; }
public void reset() { if(!first()) { ptr = 0; } if(!eof())parseEntry(); }
public E previous() { if(iterator.previousIndex() >= start) { return iterator.previous(); } throw new NoSuchElementException(); }
public String getNewPrefix() { return this.newPrefix; }
public int indexOfValue(int value) { for(int i = 0; i < mSize; i++)if(mValues[i] == value)return i; return -1; }
public List<CharsRef> uniqueStems(char word, int length) { List<CharsRef> stems = stem(word, length); if(stems.size() < 2)return stems; CharArraySet terms = new CharArraySet(stems.size() < 2) { return stems; } CharArraySet terms = new CharArraySet(stems); for(CharsRef s : stems) { if(!terms.contains(s)) { terms.add(s); } } return deduped; }
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) { request = beforeClientExecution(request); return executeGetGatewayResponses(request); }
public void setPosition(long position) { currentBlockIndex = (int)(position >> blockBits); currentBlock = blocks[currentBlockIndex]; currentBlock = (int)(position & blockMask); }
public long skip(long n) { int s = (int) Math.min(available(), Math.max(0, n)); ptr += s; return s; }
public BootstrapActionDetail(BootstrapActionConfig bootstrapActionConfig) { setBootstrapActionConfig(BootstrapActionConfig); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_row); out.writeShort(field_2_col); out.writeShort(field_3_flags); out.writeShort(field_4_shapeid); out.writeShort(field_6_author.length()); out.writeByte(field_5_author.length()); if(field_5_hasMultibyte) { StringUtil.putUnicodeLE(field_6_author, out); } else { StringUtil.putCompressedUnicode(field_6_author, out); } if(field_7_padding!= null) { out.writeByte(field_7_padding); } }
public int lastIndexOf(String string) { return lastIndexOf(string, count); }
public boolean add(E object) { return addLastImpl(object); }
public void unsetSection(String section, String subsection) { ConfigSnapshot src; ConfigSnapshot res; do { src = state.get(); res = unsetSection(src, section, sub); } while(!state.compareAndSet(src, res)); }
public String getTagName() { return tagName; }
public void addSubRecord(int index, SubRecord element) { subrecords.add(index, element); }
@Override public boolean remove(Object object) { synchronized(mutex) { return delegate().remove(object); } }
public DoubleMetaphoneFilter create(TokenStream input) { return new DoubleMetaphoneFilter(input, maxCodeLength, inject); }
public long length() { return inCoreLength(); }
public void setValue(boolean newValue) { value = newValue; }
public Pair(ContentSource oldSource, ContentSource newSource) { this.oldSource = oldSource; this.newSource = newSource; }
public int get(int i) { if(count <= i)throw new ArrayIndexOutOfBoundsException(i); return entries[i]; }
public CreateRepoRequest() { super("cr", "2016-06-07", "CreateRepo", "cr"); setUriPattern("/repos"); setMethod(MethodType.PUT); }
public boolean isDeltaBaseAsOffset() { return deltaBaseAsOffset; }
public void remove() { if(expectedModCount == list.modCount) { LinkedList.Link<ET> next = lastLink.next; Link<ET> previous = lastLink.next; Link<ET> previous = lastLink.previous; next.previous = previous; previous.next = next; if(lastLink == link) { pos--; } link = previous; expectedModCount++; list.size--; list.modCount++; } else { throw new ConcurrentModificationException(); } }
public MergeShardsResult mergeShards(MergeShardsRequest request) { request = beforeClientExecution(request); return executeMergeShards(request); }
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) { request = beforeClientExecution(request); return executeAllocateHostedConnection(request); }
public int getBeginIndex() { return start; }
public static final WeightedTerm[] getTerms(Query query) { return getTerms(query, false); }
public ByteBuffer compact() { throw new ReadOnlyBufferException(); }
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long byte0 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = byte0 >>> 2; final long byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4); final long byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 2) | (byte2 >>> 6); values[valuesOffset++] = byte2 & 63; } }
public String getHumanishName() { if(getPath()) || getPath() == null) { throw new IllegalArgumentException(); } String s = getPath(); String s = getPath(); if("file".equals(scheme) || LOCAL_FILE.matcher(s).matcher(s).matches()) { elements = s.split("/"); } else { elements = s.split("/"); } if(elements.length == 0) { throw new IllegalArgumentException(); } String result = elements[elements.length-1]; if(Constants.length == 0) { result = elements[elements.length-2]; } else { result = elements[elements.length-2]; } if(result.endsWith(Constants.DOT_GIT_EXT)) { result = result.substring(0, result.length() - Constants.length()); } return result; }
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) { request = beforeClientExecution(request); return executeDescribeNotebookInstanceLifecycleConfig(request); }
public String getAccessKeySecret() { return accessSecret; }
public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) { request = beforeClientExecution(request); return executeCreateVpnConnection(request); }
public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) { request = beforeClientExecution(request); return executeDescribeVoices(request); }
public ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest request) { request = beforeClientExecution(request); return executeListMonitoringExecutions(request); }
public DescribeJobRequest(String vaultName, String jobId) { setVaultName(vaultName); setJobId(jobId); }
public EscherRecord getEscherRecord(int index) { return escherRecords.get(index); }
public GetApisResult getApis(GetApisRequest request) { request = beforeClientExecution(request); return executeGetApis(request); }
public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) { request = beforeClientExecution(request); return executeDeleteSmsChannel(request); }
public TrackingRefUpdate getTrackingRefUpdate() { return trackingRefUpdate; }
public void print(boolean b) { print(String.valueOf(b)); }
public QueryNode getChild() { return getChildren()[0]; }
public NotIgnoredFilter(int workdirTreeIndex) { this.index = workdirTreeIndex; }
public AreaRecord(RecordInputStream in) { field_1_formatFlags = in.readShort(); }
public GetThumbnailRequest() { super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) { request = beforeClientExecution(request); return executeDescribeTransitGatewayVpcAttachments(request); }
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) { request = beforeClientExecution(request); return executePutVoiceConnectorStreamingConfiguration(request); }
public OrdRange getOrdRange(String dim) { return prefixToOrdRange.get(dim); }
public String toString() { String symbol = ""; if(startIndex >= 0 && startIndex < 0 && startIndex<CharStream.size()) { symbol = inputStream.getText(Interval.of(Interval.of(startIndex, startIndex)); symbol = Utils.escapeWhitespace(symbol.getName(), false); } return String.toString(); }
public E peek() { return peekFirstImpl(); }
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) { request = beforeClientExecution(request); return executeCreateWorkspaces(request); }
public NumberFormatIndexRecord clone() { return copy(); }
public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) { request = beforeClientExecution(request); return executeDescribeRepositories(request); }
public SparseIntArray(int initialCapacity) { initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity); mKeys = new int[initialCapacity]; mValues = new int[initialCapacity]; }
public TokenStream create(TokenStream input) { return new HyphenatedWordsFilter(input); }
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) { request = beforeClientExecution(request); return executeCreateDistributionWithTags(request); }
public RandomAccessFile(String fileName, String mode) throws IOException {this(new File(fileName), mode);}
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) { request = beforeClientExecution(request); return executeDeleteWorkspaceImage(request); }
public static String toHex(int value) { StringBuilder sb = new StringBuilder(4); writeHex(sb, value & 0xFFFFFFFFL, 8, ""); return sb.toString(); }
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) { request = beforeClientExecution(request); return executeUpdateDistribution(request); }
public HSSFColor getColor(short index) { if(index == HSSFColor.getIndex())return HSSFColor.getDefault(); byte[] b = _palomatic.getColor(index); if(b!= null) { return new CustomColor(index, b); } return null; }
public final ValueEval evaluate(ValueEval[] operands, int srcRow, int srcCol) { throw new NotImplementedFunctionException(functionName); }
public void serialize(LittleEndianOutput out) { out.writeShort((short)field_1_number_crn_records); out.writeShort((short)field_2_sheet_table_index); }
public DescribeDBEngineVersionsResult describeDBEngineVersions() { return describeDBEngineVersions(new DescribeDBEngineVersionsRequest()); }
public FormatRun(short character, short fontIndex) { _character = character; _fontIndex = fontIndex; }
public static byte[] toBigEndianUtf16Bytes(char[] chars, int offset, int length) { byte[] result = new byte[length * 2]; int end = offset + length; int resultIndex = 0; for(int i = offset; i < end; ++i) { char ch = chars.charAt(i); result[resultIndex++] = (byte)(ch >> 8)); } return result; }
public UploadArchiveResult uploadArchive(UploadArchiveRequest request) { request = beforeClientExecution(request); return executeUploadArchive(request); }
public List<Token> getHiddenTokensToLeft(int tokenIndex) { return getHiddenTokensToLeft(tokenIndex, -1); }
public boolean equals(Object obj) { if(this == obj)return true; if(!super.equals(obj))return false; if(getClass()!= obj.getClass())return false; AutomatonQuery other = (AutomatonQuery) obj; if(!compiled.equals(other.compiled))return false; if(term == null) { if(other.term!= null)return false; } else if(!term.equals(other.term))return false; return true; }
public SpanQuery makeSpanClause() { List<SpanQuery> spanQueries = new ArrayList<>(); List<SpanQuery> spanBySpanQuery = new ArrayList<>(); for(int wsq : weightBySpanQuery) { wsq.add(wsq.getKey()); spanQueries.add(wsq.getKey()); } if(spanQueries.size() == 1)return spanQueries.get(spanQueries.toArray(new SpanOrQuery[0]); elsereturn new SpanOrQuery(spanQueries.toArray(new SpanOrQuery[0]); }
public StashCreateCommand stashCreate() { return new StashCreateCommand(repo); }
public FieldInfo fieldInfo(String fieldName) { return byName.get(fieldName); }
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) { request = beforeClientExecution(request); return executeDescribeEventSource(request); }
public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) { request = beforeClientExecution(request); return executeGetDocumentAnalysis(request); }
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) { request = beforeClientExecution(request); return executeCancelUpdateStack(request); }
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) { request = beforeClientExecution(request); return executeModifyLoadBalancerAttributes(request); }
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) { request = beforeClientExecution(request); return executeSetInstanceProtection(request); }
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) { request = beforeClientExecution(request); return executeModifyDBProxy(request); }
public void add(char[] output, int offset, int len, int endOffset, int posLength) { if(count == outputs.length) { CharsRef[] next = new CharsRef[ArrayUtil.oversize(1+count, RamUsageEstimator.NUM_BYTES_OBJECT_REF)]; System.arraycopy(outputs, 0, next, next, 0, count); } if(count == endOffsets.length) { final int[] next = new int[ArrayUtil.oversize(1+count, Integer.BYTES_BYTES)]; System.arraycopy(endOffsets, 0, next, 0, count); endOffsets = next; } if(count == posLengths.length) { final int[] next = new int[ArrayUtil.oversize(1+count, Integer.BYTES_BYTES_OBJECT_INT32)]; System.arraycopy(posLengths, 0, next, 0, count); posLengths = next; } if(outputs[count] == null) { outputs[count] = endOffset; } outputs[count] = endOffset; }
public FetchLibrariesRequest() { super("CloudPhoto", "2017-07-11", "FetchLibraries", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean exists() { return objects.exists(); }
public FilterOutputStream(OutputStream out) { this.out = out; }
public ScaleClusterRequest() { super("CS", "2016-12-15", "ScaleCluster", "cs"); setUriPattern("/clusters/[ClusterId]"); setMethod(MethodType.PUT); }
public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) { return DVConstraint.createTimeConstraint(operatorType, formula1, formula2); }
public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) { request = beforeClientExecution(request); return executeListObjectParentPaths(request); }
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeCacheSubnetGroups(request); }
public void setSharedFormula(boolean flag) { field_5_options = sharedFormula.setShortBoolean(field_5_options, flag); }
public boolean isReuseObjects() { return reuseObjects; }
public ErrorNode addErrorNode(Token badToken) { ErrorNodeImpl t = new ErrorNodeImpl(badToken); addChild(t); t.setParent(this); return t; }
public LatvianStemFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) { request = beforeClientExecution(request); return executeRemoveSourceIdentifierFromSubscription(request); }
public static TokenFilterFactory forName(String name, Map<String,String> args) { return loader.newInstance(name, args); }
public AddAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest request) { request = beforeClientExecution(request); return executeGetThreatIntelSet(request); }
public TreeFilter clone() { return new Binary(a.clone(), b.clone()); }
public boolean equals(Object o) { return o instanceof ArmenianStemmer; }
public final boolean hasArray() { return protectedHasArray(); }
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) { request = beforeClientExecution(request); return executeUpdateContributorInsights(request); }
public void unwriteProtectWorkbook() { records.remove(fileCopy); records.remove(writeProtect); fileShare = null; writeProtect = null; }
public AnalyrSynonymParser(boolean dedup, boolean expand, Analyzer analyzer) { super(dedup, analyzer); this.expand = expand; }
public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) { request = beforeClientExecution(request); return executeRequestSpotInstances(request); }
public byte[] getObjectData() { return findObjectRecord().getObjectData(); }
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) { request = beforeClientExecution(request); return executeGetContactAttributes(request); }
public String toString() { return getKey() + ": " + getValue(); }
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) { request = beforeClientExecution(request); return executeListTextTranslationJobs(request); }
public GetContactMethodsResult getContactMethods(GetContactMethodsRequest request) { request = beforeClientExecution(request); return executeGetContactMethods(request); }
public static short lookupIndexByName(String name) { FunctionMetadata fd = getInstance().getFunctionByNameInternal(name); if(fd == null) { return -1; } return (short)fd.getIndex(); }
public DescribeAnomalyDetectorsResult describeAnomalyDetectors(DescribeAnomalyDetectorsRequest request) { request = beforeClientExecution(request); return executeDescribeAnomalyDetectors(request); }
public static String insertId(String message, ObjectId changeId) { return insertId(message, changeId, false); }
public long getObjectSize(AnyObjectId objectId, int typeHint)throws MissingObjectException {final long sz = db.getObjectSize(this, objectId); if(sz < 0)throw new MissingObjectException(objectId.copy(), OBJ_ANY)throw new MissingObjectException(objectId.copy(), typeHint); return sz;}
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) { request = beforeClientExecution(request); return executeImportInstallationMedia(request); }
public PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(PutLifecycleEventHookExecutionStatusRequest request) { request = beforeClientExecution(request); return executePutLifecycleEventHookExecution(request); }
public NumberPtg(LittleEndianInput in) { field_1_value = in.readDouble(); }
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) { request = beforeClientExecution(request); return executeGetFieldLevelEncryptionConfig(request); }
public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) { request = beforeClientExecution(request); return executeDescribeDetector(request); }
public ReportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest request) { request = beforeClientExecution(request); return executeReportInstanceStatus(request); }
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) { request = beforeClientExecution(request); return executeDeleteAlarm(request); }
public TokenStream create(TokenStream input) { return new PortugueseStemFilter(input); }
public FtCblsSubRecord() { reserved = new byte[ENCODED_SIZE]; }
@Override public boolean remove(Object object) { synchronized(mutex) { return delegate().remove(object); } }
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) { request = beforeClientExecution(request); return executeGetDedicatedIp(request); }
public String toString() { return precedence + " >= _p"; }
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) { request = beforeClientExecution(request); return executeListStreamProcessors(request); }
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) { setLoadBalancerName(loadBalancerName); setPolicyName(policyName); }
public WindowProtectRecord(boolean b) { _options = b; }
public UnbufferedCharStream(int bufferSize) { n = 0; data = new int[bufferSize]; }
public GetOperationsResult getOperations(GetOperationsRequest request) { request = beforeClientExecution(request); return executeGetOperations(request); }
public void copyRawTo(byte[] b, int o) { b[o] = w1; b[o + 4] = w2; b[o + 4] = w3; b[o + 8] = w4; b[o + 4] = w5; }
public WindowOneRecord(RecordInputStream in) { field_1_h_hold         = in.readShort(); field_2_v_hold       = in.readShort(); field_3_width       = in.readShort(); field_4_height       = in.readShort(); field_5_options            = in.readShort(); field_6_active_tab = in.readShort(); field_7_first_tab     = in.readShort(); field_8_num_tab_tab_tabs    = in.readShort(); field_9_tab_width_width_width_width_width_width_width_width_width    = in.readShort(); }
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) { request = beforeClientExecution(request); return executeStopWorkspaces(request); }
public void close() throws IOException {if(isOpen) { isOpen = false; try { dump(); } try { channel.truncate(fileLength); } catch(IOException e) { channel.close(); }}
public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) { request = beforeClientExecution(request); return executeDescribeMatchmakingRuleSets(request); }
public String getPronunciation(int wordId, char surface[], int off, int len) { return null; }
public String getPath() { return pathStr; }
public static double devsq(double[] v) { double r = Double.NaN; if(v!=null && v.length >= 1) { double m = 0; double s = v.length; int n = v.length; for(int i = 0; i < n; i++) { s += v[i]; } m = s / n; s += (v) * (v[i] - m); } r = (n == 1)? 0; }
public DescribeResizeResult describeResize(DescribeResizeRequest request) { request = beforeClientExecution(request); return executeDescribeResize(request); }
public boolean hasPassedThroughNonGreedyDecision() { return passedThroughNonGreedyDecision; }
public final int end() { return end(0); }
public void traverse(CellHandler handle) { int firstRow = range.getFirstRow(); int lastRow = range.getLastRow(); int lastColumn = range.getLastColumn(); int lastColumn = range.getLastColumn(); int width = range.getLastColumn(); int width = lastColumn - firstColumn + 1; Row currentRow = null; for(int ctx.rowNumber = firstRow; ctx.rowNumber <= lastRow; ++ctx.rowNumber) { currentRow = sheet.getRow(ctx.rowNumber); if(currentRow == null) { continue; } for(ctx.colNumber = firstColumn; ctx.colNumber <= lastColumn; ++ctx.colNumber) { currentCell = currentRow.getCell(ctx.colNumber); if(currentCell == null) { continue; } } if(currentCell == null) { currentCell = currentRow.getCell(ctx.colNumber()); if(currentCell == null) { continue; } } ctx.ordinalNumber =(ctx.rowNumber - firstRow) * width +(ctx.colNumber - firstColumn + 1); } }
public int getReadIndex() { return _readIndex; }
public int compareTo(ScoreTerm other) { if(term.bytesEquals(other.term))return 0; if(this.boost == other.boost)return other.term.compareTo(this.term); elsereturn Float.compare(this.boost, other.boost); }
public int normalize(char s[], int len) { for(int i = 0; i < len; i++)switch(s[i]) { case FORHE_YEH: case YEH_BARREE: s[i] = YEH; break; case HEH: s[i] = YEH; break; case HEH_YEH: s[i] = HEH; break; case HEH_ABOVE: s[i] = HEH; break; default: break; } return len; }
public void serialize(LittleEndianOutput out) { out.writeShort(_options); }
public DiagnosticErrorListener(boolean exactOnly) { this.exactOnly = exactOnly; }
public KeySchemaElement(String attributeName, KeyType keyType) { setAttributeName(attributeName); setKeyType(keyType.toString()); }
public GetAssignmentResult getAssignment(GetAssignmentRequest request) { request = beforeClientExecution(request); return executeGetAssignment(request); }
public boolean hasObject(AnyObjectId id) { return findOffset(id)!= -1; }
public GroupingSearch setAllGroups(boolean allGroups) { this.allGroups = allGroups; return this; }
public synchronized void setMultiValued(String dimName, boolean v) { DimConfig ft = fieldTypes.get(dimName); if(ft == null) { ft = new DimConfig(); fieldTypes.put(dimName, ft); } ft.MultiValued = v; }
public int getCellsVal() { Iterator<Character> i = cells.keySet().iterator(); int size = 0; for(; i.hasNext();) { Character c = i.next(); if(e.cmd >= 0) { size++; } } return size; }
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnector(request); }
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) { request = beforeClientExecution(request); return executeDeleteLifecyclePolicy(request); }
public void write(byte[] b) { int len = b.length; checkPosition(len); System.arraycopy(b, 0, _buf, _writeIndex, len); _writeIndex += len; }
public RebaseResult getRebaseResult() { return this.rebaseResult; }
public static int getNearestSetSize(int maxNumberOfValuesExpected,float desiredSaturation) { for(int i = 0; i < usableSizes.length; i++) { for(int iSetBitsAtDesiredSaturation = (int)(t*desiredSaturation); final int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t,numSetBitsAtDesiredSaturation) {  = estimatedNumUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation); } return -1; } }
public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) { request = beforeClientExecution(request); return executeDescribeDashboard(request); }
public CreateSegmentResult createSegment(CreateSegmentRequest request) { request = beforeClientExecution(request); return executeCreateSegment(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[DBCELL]\n"); buffer.append("   .rowoffset        = ").append(Integer.toHexString(getRowOffset())).append("\n"); for(int i = 0; i < field_2_cell_offsets.length; i++) { buffer.append("   .cell_").append(k).append(" = ").append(HexDump.shortToHex(field_2_cell_offsets[k])).append("\n"); } buffer.append("[/DBCell]\n"); return buffer.toString(); }
public List<String> getUndeletedList() { return undeletedList; }
public String toString() { return "[INTERFACEEND/]\n"; }
public DBCellRecord clone() { return copy(); }
public PlainTextDictionary(Reader reader) { in = reader; }
public StringBuilder append(CharSequence csq) { if(csq == null) { appendNull(); } else { append0(csq, 0, csq.length()); } return this; }
public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) { request = beforeClientExecution(request); return executeListAssociatedStacks(request); }
public static double avedev(double[] v) { double r = 0; double m = 0; double s = 0; for(int i = 0, iSize = v.length; i < iSize; i++) { s += v[i]; s += v.length; } m = s / v.length; for(int i = 0, iSize = v.length; i < iSize; i++) { s += Math.abs(v[i] - m); } r = s / v.length; return r; }
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) { request = beforeClientExecution(request); return executeDescribeByoipCidrs(request); }
public GetDiskResult getDisk(GetDiskRequest request) { request = beforeClientExecution(request); return executeGetDisk(request); }
public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBClusterParameterGroup(request); }
public static CharBuffer wrap(char[] array, int start, int charCount) { Arrays.checkOffsetAndCount(array.length, start, charCount); CharBuffer buf = new ReadWriteCharArrayBuffer(array); buf.position = start; buf.limit = start + charCount; return buf; }
public SubmoduleStatusType getType() { return type; }
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) { request = beforeClientExecution(request); return executeDescribeGameServerGroup(request); }
public final Pattern pattern() { return pattern; }
@Override public V setValue(V object) { throw new UnsupportedOperationException(); }
public StringBuilder stem(String word) { String cmd = stemmer.getLastOnPath(word); if(cmd == null)return null; buffer.length = 0; buffer.append(word); if(buffer.length() > 0)return buffer; elsereturn buffer; }
public RenameFaceRequest() { super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public char requireChar(Map<String,String> args, String name) { return require(args, name); }
public static String toStringTree(Tree t) { return toStringTree(t, (List<String>)null); }
public String toString() { return "<deleted/>"; }
public GetRepoWebhookLogListRequest() { super("cr", "2016-06-07", "GetRepoWebhookLogList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs"); setMethod(MethodType.GET); }
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) { request = beforeClientExecution(request); return executeGetJobUnlockCode(request); }
public RemoveTagsRequest(String resourceId) { setResourceId(resourceId); }
public short getGB2312Id(char ch) { try { byte[] buffer = Character.getEncoding("GB2312").getEncoding("GB2312"); if(buffer.length!= 2) { return -1; } int b0 = (buffer[0] & 0x0FF) - 161; int b1 = (buffer[1] & 0x0FF) - 161; return (short)(b0 * 94 + b1); } catch(IllegalArgumentException e) { throw new RuntimeException(e); } }
public BatchRefUpdate addCommand(Collection<ReceiveCommand> cmd) { commands.addAll(cmd); return this; }
public int checkExternSheet(int sheetNumber) { return getOrCreateLinkTable().checkExternSheet(sheetNumber); }
@Override public boolean equals(Object object) { return c.equals(object); }
public Query build(QueryNode queryNode) throws QueryNodeException {AnyQueryNode and = (AnyQueryNode) queryNode; BooleanQuery.Builder bQuery = new BooleanQuery.Builder(); List<QueryNode> children = new BooleanQueryNode.getChildren(); if(children!= null) { for(QueryNode child : children) { Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID); if(obj!= null) { Query query = (Query) obj; try { bQuery.add(query, BooleanClause.SHOULD); } } catch(TooManyClauses ex) { throw new QueryNodeException(new MessageImpl(QueryParserMessages.EMPTY_MESSAGE_MESSAGE), ex); } } } bQuery.setMinimumNumberShouldMatch(new MessageImpl(QueryParserMessages.EMPTY_MatchingElements());}
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) { request = beforeClientExecution(request); return executeDescribeStreamProcessor(request); }
public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) { request = beforeClientExecution(request); return executeDescribeDashboardPermissions(request); }
public Ref peel(Ref ref) { try { return getRefDatabase().peel(ref); } catch(IOException e) { return ref; } }
public long ramBytesUsed() { return RamUsageEstimator.alignObjectSize(RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ 2 * Integer.BYTES+ RamUsageEstimator.NUM_BYTES_OBJECT_REF) + RamUsageEstimator.sizeOf(blocks); }
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) { request = beforeClientExecution(request); return executeGetDomainSuggestions(request); }
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) { request = beforeClientExecution(request); return executeDescribeStackEvents(request); }
public void setRule(int idx, HSSFConditionalFormattingRule cfRule) { setRule(idx, (HSSFConditionalFormattingRule)cfRule); }
public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) { request = beforeClientExecution(request); return executeCreateResolverRule(request); }
public SeriesIndexRecord(RecordInputStream in) { field_1_index = in.readShort(); }
public GetStylesRequest() { super("lubancloud", "2018-05-09", "GetStyles", "luban"); setMethod(MethodType.POST); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_gridset_flag); }
public boolean equals(Object obj) { if(this == obj)return true; if(obj == null)return false; if(getClass()!= obj.getClass())return false; Toffs other = (Toffs) obj; if(startOffset!= other.getStartOffset())return false; if(endOffset!= other.endOffset)return false; return true; }
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) { request = beforeClientExecution(request); return executeCreateGatewayGroup(request); }
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) { request = beforeClientExecution(request); return executeCreateParticipantConnection(request); }
public static double irr(double[] income) { return irr(income, 0.1d); }
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeRegisterWorkspaceDirectory(request); }
public RevertCommand include(Ref commit) { checkCallable(); commits.add(commit); return this; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) { ValueEval veText1; try { veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return e.getErrorEval(); } return e.getErrorEval(); }
public E pollLast() { Map.Entry<E, Object> entry = backingMap.pollLastEntry(); return (entry == null)? null : entry.getKey(); }
public int readUShort() { int ch1 = readUByte(); int ch2 = readUByte(); return (ch2 << 8) + (ch1 << 0); }
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationType operationType) { setSnapshotId(snapshotId); setAttribute(attribute.toString()); setOperationType(operationType); }
public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) { request = beforeClientExecution(request); return executeListBonusPayments(request); }
public V get(Object o) { if(cs == null)throw new NullPointerException(); return null; }
public CommonGramsQuery create(TokenStream input) { CommonGramsFilter commonGrams = (CommonGramsFilter)super.create(input); return new CommonGramsQueryFilter(commonGrams); }
public String getPath() { return path; }
public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest request) { request = beforeClientExecution(request); return executeInitiateMultipartUpload(request); }
public StringBuilder insert(int offset, int i) { insert0(offset, Integer.toString(i)); return this; }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 62; shift >= 0; shift -= 2) { values[valuesOffset++] = (int)((block >>> shift) & 3); } } }
public TokenFilter create(TokenStream input) { return new ElisionFilter(input, articles); }
public boolean eat(Row in, int[] remap) { int sum = 0; for(Cell c : in.cells.values()) { int sum += c.cnt; if(c.ref >= 0) { sum += c.cnt; } if(remap[c.ref >= 0) { c.ref = -1; boolean live = false; for(Cell c : in.cells.values()) { if(c.cnt < frame && c.cmd >= 0) { c.cnt = 0; } } } return false; } }
final public Token getToken(int index) { Token t = token; for(int i = 0; i < index; i++) { if(t.next!= null) t = t.next; else t = t.next = token_source.getNextToken(); } return t; }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append(getClass().getName()).append(" [ARRAY]\n"); sb.append(" range=").append(getRange()).append("\n"); sb.append(" options=").append(HexDump.shortToHex(_options)).append("\n"); sb.append(" notUsed=").append(HexDump.intToHex(_field3notUsed)).append("\n"); sb.append(" formula:").append(HexDump.intToHex(_field3notUsed)).append("\n"); Ptg[] ptgs = _formula.getTokens(); for(Ptg ptg : ptgs) { sb.append(ptg).append(ptg.getRVAType()).append("\n"); } sb.append("]"); return sb.toString(); }
public GetFolderResult getFolder(GetFolderRequest request) { request = beforeClientExecution(request); return executeGetFolder(request); }
public void add(int location, E object) { throw new UnsupportedOperationException(); }
public PositiveScoresOnlyCollector(Collection c) { this.c = c; }
public CreateRepoBuildRuleRequest() { super("cr", "2016-06-07", "CreateRepoBuildRule", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules"); setMethod(MethodType.PUT); }
public BaseRef(RefEval re) { _refEval = re; _areaEval = null; _firstRowIndex = re.getRow(); _firstColumnIndex = re.getColumn(); _height = 1; _width = 1; }
public DrawingManager2(EscherDggRecord dgg) { this.dgg = dgg; }
public void reset() { if(!first()) { reset(raw); } }
public final CharsetDecoder reset() { status = INIT; implReset(); return this; }
public BufferedReader(Reader in, int size) { super(in); if(size <= 0) { throw new IllegalArgumentException("size <= 0"); } this.in = in; buf = new char[size]; }
public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) { request = beforeClientExecution(request); return executeDescribeCodeRepository(request); }
public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBSubnetGroup(request); }
public RenameBranchCommand setOldName(String oldName) { checkCallable(); this.oldName = oldName; return this; }
public DeleteBranchCommand setForce(boolean force) { checkCallable(); this.force = force; return this; }
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) { request = beforeClientExecution(request); return executeStopCompilationJob(request); }
public synchronized void incrementSecondaryProgressBy(int diff) { setSecondaryProgress(mSecondaryProgress + diff); }
public int[] clear() { return bytesStart = null; }
public String getRawPath() { return path; }
public GetUserSourceAccountRequest() { super("cr", "2016-06-07", "GetUserSourceAccount", "cr"); setUriPattern("/users/sourceAccount"); setMethod(MethodType.GET); }
public CreateExportJobResult createExportJob(CreateExportJobRequest request) { request = beforeClientExecution(request); return executeCreateExportJob(request); }
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) { request = beforeClientExecution(request); return executeCreateDedicatedIpPool(request); }
public boolean equals(Object obj) { if(this == obj) { return true; } if(obj == null) { return false; } if(obj instanceof HSSFCellStyle) { HSSFCellStyle other = (HSSFCellStyle) obj; if(_format == null) { return false; } else if(!_format.equals(other.format)) { return false; } return false; } return false; }
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) { request = beforeClientExecution(request); return executeReleaseHosts(request); }
@Override public boolean equals(Object object) { if(this == object) { return true; } if(object instanceof Set<?>) { Set<?> s = (Set<?>) object; try { return size() == s.size() && containsAll(s); } } catch(InvalidCastException e) { return false; } }
public void setRefLogMessage(String msg, boolean appendStatus) { if(msg == null &&!appendStatus)disableRefLog(); else if(msg == null && appendStatus) { refLogMessage = ""; refLogIncludeResult = true; } else { refLogMessage = msg; refLogIncludeResult = appendStatus; } }
public StreamIDRecord(RecordInputStream in) { idstm = in.readShort(); }
public RecognizeCarRequest() { super("visionai-poc", "2020-04-08", "RecognizeCar"); setMethod(MethodType.POST); }
public final ByteOrder order() { return ByteOrder.nativeOrder(); }
public int getAheadCount() { return aheadCount; }
public boolean isNewFragment() { return false; }
public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) { request = beforeClientExecution(request); return executeGetCloudFrontOriginAccessIdentityConfig(request); }
public boolean matches(int symbol, int minVocabSymbol, int maxVocabSymbol) { return token == symbol; }
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) { request = beforeClientExecution(request); return executeDeleteTransitGateway(request); }
public static double[] grow(double[] array, int minSize) { assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?"; if(array.length < minSize) { return growExact(array, oversize(minSize, Double.BYTES)); } elsereturn array; }
public CreateTransactionRequest() { super("CloudPhoto", "2017-07-11", "CreateTransaction", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public BatchRefUpdate setRefLogIdent(PersonIdent pi) { refLogIdent = pi; return this; }
public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) { request = beforeClientExecution(request); return executeGetLaunchTemplateData(request); }
public ParseInfo(ProfilingATNSimulator atnSimulator) { this.atnSimulator = atnSimulator; }
public SimpleQQParser(String qqNames, String indexField) { this(new String[] { qqName }, indexField); }
public DBInstance promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest request) { request = beforeClientExecution(request); return executePromoteReadReplicaDBCluster(request); }
public DescribeCapacityReservationsResult describeCapacityReservations(DescribeCapacityReservationsRequest request) { request = beforeClientExecution(request); return executeDescribeCapacityReservations(request); }
public String toString() { return "IndexSearcher(" + reader + "; executor=" + executor + ")"; }
public boolean incrementToken() { return false; }
public void serialize(LittleEndianOutput out) { out.writeShort(main + 1); out.writeShort(subFrom); out.writeShort(subTo); }
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) { if(bitsPerValue > 32) { throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + "-bits values into an int[]"); } for(int i = 0; i < iterations; ++i) { final long block = readLong(blocks, blocksOffset); blocksOffset += 8; valuesOffset = decode(block, values, valuesOffset); } }
public boolean isExpectedToken(int symbol) { ATN atn = getInterpreter().atn; ParserRuleContext ctx = _ctx; ATNState s = atn.states.nextTokens(s); IntervalSet following = atn.nextTokens(s); if(following.contains(symbol)) { return true; } while(!following.contains(Token.EPSILON)) { ATNState invokingState = atn.states.states.states[ctx.invokingState]; RuleTransition rt = (RuleTransition)invokingState.transition(0); if(following.contains(symbol)) { return true; } ctx = (ParserRuleTransition)ctx.parent; if(following.contains(symbol)) { return true; } } if(following.contains(Token.EPSILON) && symbol == Token.EOF) { return true; } return false; }
public UpdateStreamResult updateStream(UpdateStreamRequest request) { request = beforeClientExecution(request); return executeUpdateStream(request); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) { try { OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex); return ErrorEval.NA; } catch(EvaluationException e) { int result = TranslateErrorCodeToErrorTypeValue(e.getErrorEval().getErrorCode()); return new NumberEval(result); } }
public String toString() { return getClass().getName() + " [" +_index + " " +_name +"]"; }
public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) { request = beforeClientExecution(request); return executeListAssignmentsForHIT(request); }
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) { request = beforeClientExecution(request); return executeDeleteAccessControlRule(request); }
public Arc<Long> getFirstArc(Arc<Long> arc) { return fst.getFirstArc(arc); }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 48; shift >= 0; shift -= 16) { values[valuesOffset++] = (int)((block >>> shift) & 65535); } } }
public long skip(long charCount) throws IOException {if(charCount < 0) { throw new IllegalArgumentException("charCount < 0: " + charCount); } synchronized(lock) { checkNotClosed(); if(charCount == 0) { return 0; } long inSkipped; int availableFromBuffer = buf.length - pos; if(availableFromBuffer > 0) { long requiredFromBuffer = charCount - availableFromBuffer; if(requiredFromBuffer > 0) { pos += charCount - availableFromBuffer; return charCount; } pos += availableFromBuffer; } inSkipped = in.skip(requiredFromIn); } return inSkipped = in.skip(charCount);}
public Map<String, Ref> getRefsMap() { return advertisedRefs; }
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) { request = beforeClientExecution(request); return executeUpdateApiKey(request); }
public ObjectStream openStream() { WindowCursor wc = new WindowCursor(db); InputStream in; try { in = new PackInputStream(pack, objectOffset + headerLength, wc); } catch(IOException e) { return wc.open(getObjectId(), type).openStream(); } in = new BufferedInputStream(new InflaterInputStream(in, wc.inflater(), 8192),8192); return new Filter(type, size, in); }
public ArrayList() { array = EmptyArray.OBJECT; }
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) { request = beforeClientExecution(request); return executeUpdateDetectorVersion(request); }
public void resize() { resize(Double.MAX_VALUE); }
public RevFlagSet(Collection<RevFlag> s) { this(); this.addAll(s); }
@Override public int size() { return Impl.this.size(); }
public final long getLong() { int newPosition = position + SizeOf.LONG; if(newPosition > limit) { throw new BufferUnderflowException(); } long result = Memory.peekLong(backingArray, offset + position, order); position = newPosition; return result; }
public StringBuilder insert(int offset, long l) { insert0(offset, Long.toString(l)); return this; }
public TurkishLowerCaseFilter(TokenStream in) { super(in); }
public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) { MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>(); ParseTree mismatchedNode = matchImpl(tree, pattern.getPatternTree(), labels); return new ParseTreeMatch(tree, pattern, labels, mismatchedNode); }
public void addIfNoOverlap(WeightedPhraseInfo wpi) { for(WeightedPhraseInfo exists : getPhraseList())if(existWpi.isOffsetOverlap(wpi.getTermsInfos()); return; }
public ThreeWayMerger newMerger(Repository db) { return new InCoreMerger(db); }
public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) { return numPayloadsSeen > 0? (payloadScore / numPayloadsSeen) : 1; }
public Collection<ParseTree> evaluate(ParseTree t) { return Trees.findAllRuleNodes(t, ruleIndex); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CFRULE]\n"); buffer.append("   .condition_type     =").append(field_1_condition_type).append("\n"); buffer.append("     OPTION FLAGS=0x").append(Integer.toString()).append("\n"); if(getContainsFontFormattingBlock()) { buffer.append(_fontFormattingBlock) { buffer.append(_fontFormatting.toString()).append("\n"); } if(containsBorderFormattingBlock) { buffer.append(_borderFormatting.toString()).append("\n"); } if(getContainsPatternFormattingBlock()) { buffer.append("    Formula1 =").append(Arrays.toString(field_17_formula1.getTokens())).append("\n"); } buffer.append("    Formula 1 =").append(Arrays.toString(field_18_formula2.getTokens())).append("\n"); buffer.append("[/CFRULE]\n"); return buffer.toString(); }
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) { request = beforeClientExecution(request); return executeDescribeServiceUpdates(request); }
public String getNameName(int index) { String result = getNameAt(index).getNameName(); return result; }
public DescribeLocationsResult describeLocations() { return describeLocations(new DescribeLocationsRequest()); }
public String toString() { return "<phraseslop value='" + getValueString() + "'>" + "\n"+ getChild().toString() + "\n</phraseslop>"; }
public DirCacheEntry getDirCacheEntry() { return currentSubtree == null? currentEntry : null; }
public IntBuffer put(int[] src, int srcOffset, int intCount) { Arrays.checkOffsetAndCount(src.length, srcOffset, intCount); if(intCount > remaining()) { throw new BufferOverflowException(); } for(int i = srcOffset; i < srcOffset + intCount; ++i) { put(src[i]); } return this; }
public void trimToSize() { int s = size; if(s == array.length) { return; } if(s == 0) { array = EmptyArray.OBJECT; } else { Object[] newArray = new Object[s]; System.arraycopy(array, 0, newArray, 0, s); array = newArray; } modCount++; }
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeLocalGatewayVirtualInterfaces(request); }
public TokenStream create(TokenStream input) { return new RussianLightStemFilter(input); }
public int[] toArray(final int[] a) { int[] rval; if(a.length == _limit) { System.arraycopy(_array, 0, a, 0, _limit); rval = a; } else { rval = toArray(); } return rval; }
public BasicSessionCredentials(String accessKeyId, String accessKeySecret,String sessionToken, long roleSessionDurationSeconds = null; if(accessKeyId == null) { throw new IllegalArgumentException("Access key ID cannot be null."); } if(accessKeySecret == null) { throw new IllegalArgumentException("Access key secret cannot be null."); } this.accessKeyId = accessKeyId; this.accessKeySecret = accessKeySecret; this.sessionToken = roleSessionDurationSeconds; this.roleSessionDurationSeconds = roleSessionDurationSeconds; }
public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) { if(shortCount > remaining()) { throw new BufferUnderflowException(); } System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount); position += shortCount; return this; }
public ActivateEventSourceResultactivateEventSource(ActivateEventSourceRequest request) { request = beforeClientExecution(request); return executeActivateEventSource(request); }
public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) { request = beforeClientExecution(request); return executeDescribeReceiptRuleSet(request); }
public Filter(String name) { setName(name); }
public DoubleBuffer put(double c) { throw new ReadOnlyBufferException(); }
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicyInstance(request); }
public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) { super(input); this.normalizeKanji = normalizeKanji; this.normalizeKana = normalizeKana; buffer.reset(input); }
public void writeLong(long v) { writeInt((int)(v)); writeInt((int)(v >> 32)); }
public FileResolver() { exports = new ConcurrentHashMap<>(); exportBase = new CopyOnWriteArrayList<>(); }
public ValueEval getRef3DEval(Ref3DPtg rptg) { SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex()); return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre); }
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) { request = beforeClientExecution(request); return executeDeleteDataset(request); }
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) { request = beforeClientExecution(request); return executeStartRelationalDatabase(request); }
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() { return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest()); }
static public double pmt(double r, int nper, double pv, double fv, int type) { return -r * (pv * Math.pow(1 + r, nper) + fv) / ((1 + r * type) * (Math.pow(1 + r, nper) - 1)); }
public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) { request = beforeClientExecution(request); return executeDescribeDocumentVersions(request); }
public ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest request) { request = beforeClientExecution(request); return executeListPublishingDestinations(request); }
public DeleteAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public static byte[] grow(byte[] array) { return grow(array, 1 + array.length); }
public String outputToString(Object output) { if(!(output instanceof List)) { return outputs.outputToString((T) output); } else { List<List = (List) output; StringBuilder b = new StringBuilder(); b.append('['); for(int i = 0; i < outputList.size(); i++) { if(i > 0) { b.append(", "); } b.append(outputs.outputToString(outputList[i])); } b.append(']'); return b.toString(); } }
public void notifyDeleteCell(Cell cell) { _bookEvaluator.notifyDeleteCell(new HSSFEvaluationCell((HSSFCell)cell)); }
public StringBuilder replace(int start, int end, String str) { replace0(start, end, str); return this; }
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) { request = beforeClientExecution(request); return executeSetIdentityPoolConfiguration(request); }
public static double kthSmallest(double[] v, int k) { double r = Double.NaN; int k--; if(v!=null && v.length > index && index >= 0) { Arrays.sort(v); r = v[k]; } return r; }
public void set(int index, long value) { final int o = index >>> 5; final int b = index & 31; final int shift = b << 1; blocks[o] = (blocks[o] & ~(3L << shift)) | (value << shift); }
public String toString() { if(getChildren() == null || getChildren().size() == 0)return "<boolean operation='and'/>"; StringBuilder sb = new StringBuilder(); sb.append("<boolean operation='and'>"); for(QueryNode child : getChildren()) { sb.append("\n"); sb.append(child.toString()); } sb.append("\n</boolean>"); return sb.toString(); }
public int sumTokenSizes(int fromIx, int toIx) { int result = 0; for(int i = fromIx; i < toIx; i++) { result += _ptgs[i].getSize(); } return result; }
public void setReadonly(boolean readonly) throws IOException {if(this.readonly &&!readonly) throw new IllegalStateException("can't alter readonly IntervalSet");}
public void clearConsumingCell(FormulaCellCacheEntry cce) { if(!_consumingCells.remove(cce)) { throw new IllegalStateException("Specified formula cell is not consume by this cell"); } }
@Override public List<E> subList(int start, int end) { synchronized(mutex) { return new SynchronizedRandomAccessList<E>(list.subList(start, end), mutex); } }
public FileHeader getFileHeader() { return file; }
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) { request = beforeClientExecution(request); return executeAttachLoadBalancers(request); }
public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) { setAccountId(accountId); setVaultName(vaultName); setJobParameters(jobParameters); }
public String toString() { return "SPL"; }
public ReplaceableAttribute(String name, String value, boolean replace) { setName(name); setValue(value); setReplace = replace; }
public void add(IndexableField field) { fields.add(field); }
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) { request = beforeClientExecution(request); return executeDeleteStackSet(request); }
public GetRepoBuildRuleListRequest() { super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules"); setMethod(MethodType.GET); }
public SparseArray(int initialCapacity) { initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity); mKeys = new int[initialCapacity]; mValues = new Object[initialCapacity]; mSize = 0; }
public InvokeServiceRequest() { super("industry-brain", "2018-07-12", "InvokeService"); setMethod(MethodType.POST); }
public ListAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean hasPrevious() { return link!= list.voidLink; }
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) { request = beforeClientExecution(request); return executeDeleteHsmConfiguration(request); }
public CreateLoadBalancerRequest(String loadBalancerName) { setLoadBalancerName(loadBalancerName); }
public String getUserInfo() { return decode(userInfo); }
public TagAttendeeResult tagAttendee(TagAttendeeRequest request) { request = beforeClientExecution(request); return executeTagAttendee(request); }
public String getRefName() { return name; }
public BooleanQuery build() { return new BooleanQuery(minimumNumberShouldMatch, clauses.toArray(new BooleanClause[0])); }
public boolean isSubTotal(int rowIndex, int columnIndex) { return false; }
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) { request = beforeClientExecution(request); return executeDescribeDBProxies(request); }
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) { request = beforeClientExecution(request); return executeGetVoiceConnectorProxy(request); }
public void fromConfig(Config rc) { setPackedGitOpenFiles(rc); setPackedGitLimit(rc.getInt("core", null, "packedgitOpenFiles", getPackedGitLimit())); setPackedGitLimit(rc.getInt("core", null, "packedgitlimit", getPackedGitLimit())); setPackedGitWindowSize(rc.getInt("core", null, "packedgitwindowsize", getPackedGitWindowSize())); setPackedGitMMAP(rc.getBoolean("core", null, "packedgitmmap", isPackedGitWindowSize())); setDeltaBaseCacheLimit(rc.getInt("core", null, "deltap", getDeltaBaseCacheLimit())); long maxMem = rc.getLong("core", null, "streamfilethreshold", getStreamFileThreshold())); sft = Math.min(sft, maxMem, maxMem / 4); sft = Math.min(sft, maxMem, Integer.MAX_VALUE); sft = Math.min(sft, Integer.MAX_VALUE); }
public static Date getJavaDate(double date) { return getJavaDate(date, false); }
public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) { request = beforeClientExecution(request); return executeStartPersonTracking(request); }
@Override public int size() { return Impl.this.size(); }
public GetRouteResult getRoute(GetRouteRequest request) { request = beforeClientExecution(request); return executeGetRoute(request); }
public Cluster deleteCluster(DeleteClusterRequest request) { request = beforeClientExecution(request); return executeDeleteCluster(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[MMS]\n"); buffer.append("   .addMenu          = ").append(Integer.toHexString(getAddMenuCount())).append("\n"); buffer.append("   .delMenu        = ").append(Integer.toHexString(getDelMenuCount())).append("\n"); buffer.append("[/MMS]\n"); return buffer.toString(); }
public FileBasedConfig(Config base, File cfgLocation, FS fs) { super(base); configFile = cfgLocation; this.fs = fs; this.snapshot = FileSnapshot.DIRTY; this.hash = ObjectId.zeroId; }
public int following(int pos) { if(pos < text.getBeginIndex() || pos > text.getEndIndex()) { throw new IllegalArgumentException("offset out of bounds"); } else if(0 == sentenceStarts.length) { text.setIndex(text.getBeginIndex()); return DONE; } else if(pos >= sentenceStarts[sentenceStarts.length-1]) { text.setIndex(text.getEndIndex()); currentSentence = sentenceStarts.length - 1; return DONE; } else { currentSentence = (sentenceStarts.length - 1) / 2; moveToSentenceAt(pos, 0, sentenceStarts.length - 2); return current(); } }
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) { request = beforeClientExecution(request); return executeUpdateParameterGroup(request); }
public SeriesChartGroupIndexRecord clone() { return copy(); }
public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) { if(distErrPct < 0 || distErrPct > 0.5) { throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]", " distErrPct"); } if(distErrPct == 0 || shape instanceof Point) { return 0; } Rectangle bbox = shape.getBoundingBox(); final int ctr = bbox.getCenter(); double y = (cr.getY() >= 0? bbox.getMaxY() : bbox.getMinY(); double diagonalDist * distErrPct; return diagonalDist * distErrPct; }
public int codePointAt(int index) { if(index < 0 || index >= count) { throw indexAndLength(index); } return Character.codePointAt(value, index, count); }
public void setPasswordVerifier(int passwordVerifier) { this.passwordVerifier = passwordVerifier; }
public ListVaultsRequest(String accountId) { setAccountId(accountId); }
public SquashMessageFormatter() { dateFormatter = new GitDateFormatter(Locale.DEFAULT); }
public GetVoCoverRequest() { super("CloudPhoto", "2017-07-11", "GetVoCover", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public int lastIndexOf(Object object) { int pos = size; Link<E> link = voidLink.previous; if(object!= null) { while(link!= voidLink) { pos--; if(object.equals(link.data)) { return pos; } link = link.previous; } } else { while(link!= voidLink) { pos--; if(link.data == null) { return pos; } link = link.previous; } } return -1; }
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) { request = beforeClientExecution(request); return executeDescribeSpotFleetRequests(request); }
public IndexFacesResult indexFaces(IndexFacesRequest request) { request = beforeClientExecution(request); return executeIndexFaces(request); }
public BreakIterator getBreakIterator(int script) { switch(script) { case UScript. Japanese: return cjkBreakIterator.clone(); case UScript.myanmar: if(myanmarAsWords) { return defaultBreakIterator.clone(); } else { return (BreakIterator) defaultBreakIterator.clone(); } default: return (BreakIterator) defaultBreakIterator.clone(); } }
public String toString() { StringBuilder b = new StringBuilder(); b.append("[DCONREF]\n"); b.append("   .ref\n"); b.append("     .firstrow    = ").append(firstRow).append("\n"); b.append("       .lastrow    = ").append(lastRow).append("\n"); b.append("       .firstcol   = ").append(firstCol).append("\n"); b.append("     .lastcol      = ").append(lastCol).append("\n"); b.append("   .cch           = ").append(charCount).append("\n"); b.append("    .stFile\n"); b.append("              = ").append(getReadablePath()).append("\n"); b.append("      .r        = ").append(getReadablePath()).append("\n"); b.append("[/DCET]\n"); return sb.toString(); }
public int getPackedGitOpenFiles() { return packedGitOpenFiles; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FEATURE HEADER]\n"); buffer.append("[/FEATURE HEADER]\n"); return buffer.toString(); }
public static byte[] getToUnicodeLE(String string1) { return UTF16LE.getBytes(string1); }
public final List<String> getFooterLines(String keyName) { return getFooterLines(new FooterKey(keyName)); }
public void refresh() { super.refresh(); rescan(); }
public float get(int index) { checkIndex(index); return byteBuffer.getFloat(index * SizeOf.FLOAT); }
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) { request = beforeClientExecution(request); return executeDeleteDetector(request); }
public int[] grow() { assert bytesStart!= null; return bytesStart = ArrayUtil.grow(bytesStart, bytesStart.length + 1); }
public ListExclusionsResult listExclusions(ListExclusionsRequest request) { request = beforeClientExecution(request); return executeListExclusions(request); }
public static SpatialStrategy getSpatialStrategy(int roundNumber) { SpatialStrategy result; if(spatialStrategyCache.get(roundNumber)) { throw new IllegalStateException("Strategy should be init'ed by SpatialDocMaker by now"); } return result; }
public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) { request = beforeClientExecution(request); return executeRestoreDBClusterToPointInTime(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_categoryDataType); out.writeShort(field_2_valuesDataType); out.writeShort(field_3_numCategories); out.writeShort(field_4_numValues); out.writeShort(field_5_numBubbleValues); out.writeShort(field_6_numBubbleValues); }
public PostAgentProfileResult postAgentProfile(PostAgentProfileRequest request) { request = beforeClientExecution(request); return executePostAgentProfile(request); }
public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) { if((getInputStream()!= null) { TokenSource tokenSource = ((TokenStream) getInputStream().getTokenSource(); if(tokenSource instanceof Lexer) { Lexer lexer = (Lexer) tokenSource; return compileParseTreePattern(pattern, patternRuleIndex, lexer); } } throw new UnsupportedOperationException("Parser can't discover a lexer to use"); }
public DBCluster backupDBCluster(BacktrackDBClusterRequest request) { request = beforeClientExecution(request); return executeBacktrackDBCluster(request); }
public String getName() { return strategyName; }
public void copyTo(byte[] b, int o) { formatHexByte(b, o + 0, w1); formatHexByte(b, o + 8, w2); formatHexByte(b, o + 16, w3); formatHexByte(b,o + 24, w4); formatHexByte(b,o + 32, w5); }
public static IntList lineMap(byte[] buf, int ptr, int end) { IntList map = new IntList((end - ptr) / 36); map.fillTo(1, Integer.MIN_VALUE); for(; ptr < end; ptr = nextLF(buf, ptr)) { map.add(end); } return map; }
public Set<ObjectId> getAdditionalHaves() { return Collections.emptySet(); }
public long ramBytesUsed() { return TERMS_RAM_BYTES_USED + (fst!=null? fst.ramBytesUsed() : 0); }
public String toXml(String tab) { return new StringBuilder(); }
public TokenStream create(TokenStream input) { return new GalicianMinimalStemFilter(input); }
public String toString() { StringBuilder r = new StringBuilder(); r.append("Commit"); r.append("={\n"); r.append("tree "); r.append(treeId!= null? treeId.name() : "NOT_SET"); r.append("\n"); r.append("\n"); for(ObjectId p : parentIds) { r.append("\n"); r.append(p.name()); r.append("\n"); r.append("\n"); r.append(author!= null? author.toString() : "NOT_SET"); r.append("\n"); r.append(committer!= null? ch.toString() : "NOT_SET"); r.append("\n"); if(encoding!= null && encoding!= Constants.toString() : "NOT_SET"); r.append("\n"); r.append(message!= null? message : "); r.append(message!= null? message : "); r.append("\n"); } r.append("\n"); return r.toString(); }
public IndicNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public OptionGroup createOptionGroup(CreateOptionGroupRequest request) { request = beforeClientExecution(request); return executeCreateOptionGroup(request); }
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) { request = beforeClientExecution(request); return executeAssociateMemberAccount(request); }
public void run() { mRefreshProgress(mId, mProgress, mClient, true); mRefreshProgressRunnable = this; }
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) { request = beforeClientExecution(request); return executeSetTerminationProtection(request); }
public String getErrorHeader(RecognitionException e) { int line = e.getOffendingToken().getLine(); int charPositionInLine = e.getOffendingToken().getColumn(); return "line " + line + ":" + charPositionInLine; }
public CharBuffer asReadOnlyBuffer() { CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer()); buf.limit = limit; buf.position = position; buf.mark = mark; buf.byteBuffer.order = byteBuffer.order; return buf; }
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopSentimentDetectionJob(request); }
public ObjectIdSubclassMap<ObjectId> getNewObjectIds() { if(newObjectIds!= null) { return newObjectIds; } return new ObjectIdSubclass; }
public void clear() { hash = hash(new byte[0]); super.clear(); }
public void reset() throws IOException {synchronized(lock) { checkNotClosed(); if(_mark == -1) { throw new IOException("Invalid mark"); } pos = mark; }}
public RefErrorPtg(LittleEndianInput in)  { field_1_reserved = in.readInt(); }
public SuspendGameServerGroupResult suspendGameServerGroup(SuspendGameServerGroupRequest request) { request = beforeClientExecution(request); return executeSuspendGameServerGroup(request); }
public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) { if(args.length!= 3) { return ErrorEval.VALUE_INVALID; } return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]); }
public GetRepoRequest() { super("cr", "2016-06-07", "GetRepo", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]"); setMethod(MethodType.GET); }
public void setDate(Date date) { if(date.hasValue()) { setDate(DateUtil.date); } else { date = null; } }
public TokenStream create(TokenStream input) { return new GermanMinimalStemFilter(input); }
@Override public Object[] toArray() { return a.clone(); }
public void write(char[] buffer, int offset, int len) { Arrays.checkOffsetAndCount(buffer.length, offset, len); synchronized(lock) { expand(len); System.arraycopy(buffer, offset, this.buf, this.count, len); this.count += len; } }
public static final RevFilter after(long ts) { return new After(ts); }
public DeleteGroupPolicyRequest(String groupName, String policyName) { setGroupName(groupName); setPolicyName(policyName); }
public DeregisterTransitGatewayMulticastGroupMembersResult deregisterTransitGatewayMulticastGroupMembers(DeregisterTransitGatewayMulticastGroupMembersRequest request) { request = beforeClientExecution(request); return executeDeregisterTransitGatewayMulticastGroupMembers(request); }
public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) { request = beforeClientExecution(request); return executeBatchDeleteScheduledAction(request); }
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) { request = beforeClientExecution(request); return executeCreateAlgorithm(request); }
public int readUByte() { checkPosition(1); return (byte) & 0xFF; }
public void setLength(int sz) { setLength((int) sz); }
public DescribeScalingProcessTypesResult describeScalingProcessTypes() { return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest()); }
public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) { request = beforeClientExecution(request); return executeListResourceRecordSets(request); }
public Token recoverInline(Parser recognizer) { InputMismatchException e = new InputMismatchException(recognizer); for(ParserRuleContext context = recognizer.getContext(); context!= null; context = context.getParent()) { context.exception = e; } throw new ParseCancellationException(e); }
public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) { request = beforeClientExecution(request); return executeSetTagsForResource(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategy", "vipaegis"); setMethod(MethodType.POST); }
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) { request = beforeClientExecution(request); return executeDescribeVpcEndpointServices(request); }
public EnableLoggingResult enableLogging(EnableLoggingRequest request) { request = beforeClientExecution(request); return executeEnableLogging(request); }
@Override public boolean contains(Object o) { return Impl.this.containsValue(o); }
public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) { super(bookName, firstSheetIdentifier); _lastSheetIdentifier = lastSheetIdentifier; }
public DomainMetadataRequest(String domainName) { setDomainName(domainName); }
public ParseException(Token currentTokenVal,int[][] expectedTokenSequencesVal,String[] tokenImageVal) { super(initialise(currentTokenVal, expectedTokenSequencesVal, tokenImageVal)); currentToken = currentTokenVal; expectedTokenSequences = expectedTokenSequencesVal; tokenImage = tokenImageVal; }
public FetchPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public PrintWriter writer() { return writer; }
public NGramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = requireInt(args, "minGramSize"); maxGramSize = requireInt(args, "maxGramSize"); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean isDirectoryFileConflict() { return dfConflict!= null; }
public IndonesianStemFilter(TokenStream input, boolean stemDerivational) { super(input); this.stemDerivational = stemDerivational; }
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicy(request); }
public void serialize(LittleEndianOutput out) { out.writeInt(fSD); out.writeInt(passwordVerifier); StringUtil.writeUnicodeString(out, title); out.write(securityDescriptor); }
public static double floor(double n, double s) { if((n>0 && s<0) || s < 0) { return Double.NaN; } else { f = Double.NaN; } else { f = (n == 0 || s == 0)? 0 : Math.floor(n/s) * s; } return f; }
public ByteArrayDataOutput(byte[] bytes, int offset, int len) { reset(bytes, offset, len); }
public static List<Tree> getChildren(Tree t) { List<Tree> kids = new ArrayList<Tree>(); for(int i = 0; i < t.getChildCount(); i++) { children.add(t.getChild(i)); } return kids; }
@Override public void clear() { Impl.this.clear(); }
public RefreshAllRecord(boolean refreshAll) { this(0); setRefreshAll(refreshAll); }
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) { request = beforeClientExecution(request); return executeDeleteNamedQuery(request); }
public GraphvFormatter(ConnectionCosts costs) { this.costs = costs; this.bestPathMap = new HashMap<>(); sb.append("  init [style=invis]\n"); }
public CheckMultiAgentRequest() { super("visionai-poc", "2020-04-08", "CheckMultiAgent"); setMethod(MethodType.POST); }
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) { request = beforeClientExecution(request); return executeListUserProfiles(request); }
public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) { request = beforeClientExecution(request); return executeCreateRelationalDatabaseFromSnapshot(request); }
public StartTaskResult startTask(StartTaskRequest request) { request = beforeClientExecution(request); return executeStartTask(request); }
public Set<String> getIgnoredPaths() { return ignoredPaths; }
public FeatSmartTag(RecordInputStream in) { data = in.readRemainder(); }
public Change(ChangeAction action, ResourceRecordSetResourceSet) { setAction(action.toString()); setResourceRecordSet(resourceRecordSet); }
public DeleteImageResult deleteImage(DeleteImageRequest request) { request = beforeClientExecution(request); return executeDeleteImage(request); }
public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) { request = beforeClientExecution(request); return executeCreateConfigurationSet(request); }
@Override public Iterator<E> iterator() { return listIterator(0); }
public void visitContainedRecords(RecordVisitor rv) { if(_recs.isEmpty()) { return; } rv.visitRecord(_bofRec); for(int i = 0; i < _recs.size(); i++) { RecordBase rb = _recs.get(i); if(rb instanceof RecordAggregate) { ((RecordAggregate) rb).visitContainedRecords(rv); } else { rv.visitRecord((org.poi.instance); } } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FtCbls ]").append("\n"); buffer.append("  size    = ").append(getDataSize()).append("\n"); buffer.append("  reserved = ").append(HexDump.toHex(reserved)).append("\n"); buffer.append("[/FtCbls ]").append("\n"); return buffer.toString(); }
public static BATBlock createEmptyBATBlock(POIFSBigBlockSize bigBlockSize, boolean isXBAT) { BATBlock block = new BATBlock(bigBlockSize); if(isXBATBlockSize, POIFSConstants.END_OF_CHAIN); return block; }
public void tagResource(TagResourceRequest request) { request = beforeClientExecution(request); executeTagResource(request); }
public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) { request = beforeClientExecution(request); return executeDeleteMailboxPermissions(request); }
public ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest request) { request = beforeClientExecution(request); return executeListDatasetGroups(request); }
public ResumeProcessesResult resumeProcesses(ResumeProcessesRequest request) { request = beforeClientExecution(request); return executeResumeProcesses(request); }
public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) { request = beforeClientExecution(request); return executeGetPersonTracking(request); }
public String toFormulaString(String[] operands) { if(space.isSet(_options)) { return operands[0]; } else if(optiIf.isSet(_options)) { return toFormulaString() + "(" + operands[0] + ")"; } else if(optiSkip.isSet(_options)) { return toFormulaString() + operands[0]; } else { return toFormulaString() + operands[0]; } }
public T merge(T first, T second) { throw new UnsupportedOperationException(); }
public String toString() { return this.getKey() + ": " + getLocalizedMessage(); }
public XPath(Parser parser, String path) { this.parser = parser; this.path = path; elements = split(path); }
public CreateAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 3) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = block & 1; } }
public PushConnection openPush() throws NotSupportedException {throw new NotSupportedException(JGitText.get().pushIsNotSupportedForBundleTransport);}
public static void strcy(char[] dst, int di, char[] src, int si) { while(src[si]!= 0) { dst[di++] = src[si++]; } dst[di] = 0; }
public K getKey() { return mapEntry.getKey(); }
public static int numNonnull(Object[] data) { int n = 0; if(data == null) { return n; } for(Object o : data) { if(o!= null) { n++; } } return n; }
public void add(int location, E object) { if(location >= 0 && location <= size) { Link<E> link = voidLink; if(location < (size / 2)) { for(int i = 0; i <= location; i++) { link = link.next; } } else { for(int i = size; i > location; i--) { link = link.previous; } } Link<E> previous = link.previous; Link<E> newLink<E>(object, previous, link); previous.next = newLink; previous.previous = newLink; size++; modCount++; modCount++; } throw new IndexOutOfBoundsException(); }
public DomainDetail describeDomain(DescribeDomainRequest request) { request = beforeClientExecution(request); return executeDescribeDomain(request); }
public void flush() throws IOException {drain(); output.flush();}
public PersianCharFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean incrementToken() { if(used) { return false; } clearAttributes(); termAttribute.append(value); offsetAttribute.setOffset(0, value.length()); used = true; return true; }
public static FloatBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteFloatArrayBuffer(capacity); }
public final Edit after(Edit cut) { return new Edit(cut.endA, endA, cut.endB, endB); }
public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) { request = beforeClientExecution(request); return executeUpdateRuleVersion(request); }
public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) { request = beforeClientExecution(request); return executeListVoiceConnectorTerminationCredentials(request); }
public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) { request = beforeClientExecution(request); return executeGetDeploymentTarget(request); }
public void setNoChildReport() { letChildReport = false; for(PerfTask task : tasks) { if(task instanceof TaskSequence) { ((TaskSequence)task).setNoChildReport(); } } }
public E get(int location) { try { return a[location]; } catch(IndexOutOfBoundsException e) { throw ArrayList<E>(); } }
public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) { request = beforeClientExecution(request); return executeDescribeDataSet(request); }
public SkipWorkTreeFilter(int treeIdx) { this.treeIdx = treeIdx; }
public DescribeNetworkInterfacesResult describeNetworkInterfaces() { return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest()); }
public boolean contains(int row, int col) { return _firstRow <= row && _lastRow >= row && _firstColumn <= col && _firstColumn <= col; }
public String toString() { return new String(this.chars); }
public PatchType getPatchType() { return patchType; }
@Override public Iterator<K> iterator() { return new KeyIterator(); }
public CreateScriptResult createScript(CreateScriptRequest request) { request = beforeClientExecution(request); return executeCreateScript(request); }
public BytesRef next() { termUpto++; if(termUpto >= info.terms.size()) { return null; } else { info.terms.get(info.sortedTerms[termUpto], br); return br; } }
public String outputToString(CharsRef output) { return output.toString(); }
public AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(AssociateWebsiteAuthorizationProviderRequest request) { request = beforeClientExecution(request); return executeAssociateWebsiteAuthorizationProvider(request); }
public void unpop(RevCommit c) { Block b = head; if(b == null)b = free.newBlock(); b.resetToMiddle(); b.add(c); tail = b; tail = b; return; }
public EdgeNGramTokenizerFactory(Map<String, String> args) { super(args); minGramSize = requireInt(args, "minGramSize"); maxGramSize = requireInt(args, "maxGramSize"); preserveOriginal = getBoolean(args, "preserveOriginal", EdgeNGramTokenizer.DEFAULT_MAX_ORIGINAL); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public ModifyDBParameterGroupRequest(String dBParameterGroupName, java.util.List<Parameter> parameters) { setDBParameterGroupName(dBParameterGroupName); setParameterGroup(parameters); }
public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) { request = beforeClientExecution(request); return executeGetHostedZoneLimit(request); }
public void set(int index, long value) { final int o = index >>> 6; final int b = index & 63; final int shift = b << 0; blocks[o] = (blocks[o] & ~(1L << shift)) | (value << shift); }
public RevFilter clone() { return new PatternSearch(pattern()); }
public String toString() { return "Spans(" + term.toString() + ")@" + (doc == -1? "START" : (doc == MAX_VALUE)? "END" : doc + "-" + position); }
public boolean canAppendMatch() { for(int i = 0; i < heads.size(); i++)if(heads.isEmpty())return true; return false; }
public synchronized int lastIndexOf(String subString, int start) { return super.lastIndexOf(subString, start); }
public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) { request = beforeClientExecution(request); return executeDeleteNetworkAclEntry(request); }
public AssociateMemberToGroupResult associateMemberToGroup(AssociateMemberToGroupRequest request) { request = beforeClientExecution(request); return executeAssociateMemberToGroup(request); }
public static final int commit(byte[] b, int ptr) { final int sz = b.length; if(ptr == 0)ptr += 46; while(ptr < sz && b[ptr] == 'p')ptr += 48; if(ptr < sz && b[ptr] == 'a')ptr = nextLF(b, ptr); return match(b, ptr, commit); }
public int getLineNumber() { return row; }
public SubmoduleUpdateCommand addPath(String path) { paths.add(path); return this; }
public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) { request = beforeClientExecution(request); return executeGetPushTemplate(request); }
public DescribeVaultResult describeVault(DescribeVaultRequest request) { request = beforeClientExecution(request); return executeDescribeVault(request); }
public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() { return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest()); }
public ByteBuffer putLong(int index, long value) { throw new ReadOnlyBufferException(); }
public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) { request = beforeClientExecution(request); return executeRegisterDevice(request); }
public static Format byId(int id) { for(Format format : values()) { if(format.getId() == id) { return format; } } throw new IllegalArgumentException("Unknown format id: " + id); }
public DeleteAppResult deleteApp(DeleteAppRequest request) { request = beforeClientExecution(request); return executeDeleteApp(request); }
public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) { request = beforeClientExecution(request); return executeGetBaiduChannel(request); }
public BytesReader getBytesReader() { return fst.getBytesReader(); }
public static boolean isValidSchemeChar(int index, char c) { if((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= '9')return true; if(index > 0 && c <= '9')return true; if(index > '0' && c <= '9')return true; return false; }
public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) { request = beforeClientExecution(request); return executeListAppliedSchemaArns(request); }
public Long contentLength() { return this.contentLength; }
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) { if(args.length < 1) { return ErrorEval.VALUE_INVALID; } boolean isA1style; String text; try { ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex()); text = OperandResolver.coerceValueToString(ve); switch(args.length) { case 1: case 1: isA1style = true; break; case 2: isA1style = evaluateBooleanArg(args[1], ec); break; default: return ErrorEval.VALUE_INVALID; } } return evaluateIndirect(ec, text, isA1style); }
public final int compareTo(int[] bs, int p) { int cmp; cmp = NB.compareUInt32(w1, bs[p]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w2, bs[p + 1]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w3, bs[p + 2]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w4, bs[p + 3]); if(cmp!= 0)return cmp; return NB.compareUInt32(w5, bs[p + 4]); }
public void removeName(Name name) { int index = getNameIndex((HSSFName) name); removeName(index); }
public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) { setQueueUrl(queueUrl); setAttributeNames(attributeNames); }
public static boolean[] copyOf(boolean[] original, int newLength) { if(newLength < 0) { throw new NegativeArraySizeException(); } return copyOfRange(original, 0, newLength); }
public static void setEnabled(boolean enabled) { ENABLED = enabled; }
public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) { request = beforeClientExecution(request); return executeDeleteLogPattern(request); }
public boolean contains(char[] text, int off, int len) { return map.containsKey(text, offset, length); }
public int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) { return linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber); }
public boolean is(String commandLine) { return command.length() + 1 < commandLine.length() && commandLineLine.charAt(command.length) ==' && commandLine.startsWith(command); }
public static void register(MergeStrategy imp) { register(imp.getName(), imp); }
public long ramBytesUsed() { long bytesUsed = BASE_RAM_BYTES_USED; if(index!= null) { sizeInBytesUsed += index.ramBytesUsed(); } return sizeInBytesUsed; }
public HostedZone(String id, String name, String callerReference) { setId(id); setName(name); setCallerReference(callerReference); }
public GetFindingsResult getFindings(GetFindingsRequest request) { request = beforeClientExecution(request); return executeGetFindings(request); }
public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) { request = beforeClientExecution(request); return executeDescribeTopicsDetectionJob(request); }
public boolean processMatch(ValueEval eval) { if(eval instanceof NumericValueEval) { minimumValue = eval; } else { double currentValue = ((NumericValueEval) eval).getNumberValue(); double oldValue = ((NumericValueEval) eval).getNumberValue(); if(currentValue < oldValue) { minimumValue = eval; } } return true; }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeShort(field_1_len_ref_subexpression); }
public static int main(String[] args) throws IOException {boolean printTree = false; String path = null; for(int i = 0; i < args.length; i++) { if(args[i].equals("-printTree")) { printTree = true; } else if(args.length!= (printTree? 2 : 1))throw new IllegalArgumentException(); } if(args.length!= (printTree? 2 : 1)) { throw new IllegalArgumentException(); } } return 0;}
public void setByteValue(byte value) { if(!(fieldsData instanceof Byte)) { throw new IllegalArgumentException("cannot change value type from " + fieldsData.getClass().getSimpleName() + " to Byte"); } fieldsData = new Byte(value); }
public static int initialize() { return initialize(getDefaultSeed); }
public CachingDoubleValueSource(ValueSource source) { this.source = source; cache = new HashMap<>(); }
public AttributeDefinition(String attributeName, ScalarAttributeType attributeType) { setAttributeName(attributeName); setAttributeType(attributeType); }
public static String join(Collection<String> parts, String separator) { return StringUtils.join(parts, separator, separator); }
public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest request) { request = beforeClientExecution(request); return executeListTaskDefinitionFamilies(request); }
public ListComponentsResult listComponents(ListComponentsRequest request) { request = beforeClientExecution(request); return executeListComponents(request); }
public ActivatePhotosRequest() { super("CloudPhoto", "2017-07-11", "ActivatePhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request) { request = beforeClientExecution(request); return executeCreateMatchmakingRuleSet(request); }
public ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request) { request = beforeClientExecution(request); return executeListAvailableManagementCidrRanges(request); }
public ObjectIdSubclassMap<ObjectId> getBaseObjectIds() { if(superObjectIds!= null) { return baseObjectIds; } return new ObjectIdSubclass; }
public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) { request = beforeClientExecution(request); return executeDeletePushTemplate(request); }
public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) { request = beforeClientExecution(request); return executeCreateDomainEntry(request); }
public static int getEncodedSize(byte values) { int result = values.length * 1; for(int i = values.length; i < values.length; i++) { result += getEncodedSize(values.get(i)); } return result; }
public OpenNLPTokenizerFactory(Map<String,String> args) { super(args); sentenceModelFile = require(args, SENTENCE_MODEL); tokenizerModelFile = require(args, TOKENIZER_MODEL); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public final int getInt(int index) { checkIndex(index, SizeOf.INT); return Memory.peekInt(backingArray, offset + index, order); }
public List<Head> getNextHeads(char c) { if(matches(c)) { return newHeads; } else { return FileNameMatcher.EMPTY_HEAD_LIST; } }
public ByteBuffer putShort(short value) { throw new ReadOnlyBufferException(); }
public void writeUnshared(Object object) throws IOException {writeUnshared(object);}
public int offsetByCodePoints(int index, int codePointOffset) { return Character.offsetByCodePoints(value, 0, count, codePointOffset); }
public static int getUniqueAlt(Collection<BitSet> altsets) { BitSet all = getAlts(altsets); if(all.cardinality()==1) { return all.nextSetBit(0); } return ATN.INVALID_ALT_NUMBER; }
public Date getWhen() { return new Date(when); }
public RuleTagToken(String ruleName, int bypassTokenType, String label) { if(ruleName == null) { throw new IllegalArgumentException("ruleName cannot be null or empty."); } this.ruleName = ruleName; this.bypassTokenType = bypassTokenType; this.label = label; }
public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) { request = beforeClientExecution(request); return executeDisableOrganizationAdminAccount(request); }
public CreateRoomResult createRoom(CreateRoomRequest request) { request = beforeClientExecution(request); return executeCreateRoom(request); }
public ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest request) { request = beforeClientExecution(request); return executeDeleteReplicationGroup(request); }
public final CharBuffer decode(ByteBuffer buffer) { try { return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer); } catch(CharacterCodingException ex) { throw new Error(ex.getMessage(), ex); } }
public Distribution(String id, String status, String domainName) { setId(id); setStatus(status.toString()); setDomainName(domainName); }
public final float[] array() { return protectedArray(); }
public DateWindow1904Record(RecordInputStream in) { field_1_window = in.readShort(); }
public DeleteDBSnapshotRequest(String dBSnapshotIdentifier) { setDBSnapshotIdentifier(dBSnapshotIdentifier); }
public ParserExtension getExtension(String key) { if(key == null ||!extensions.get(key)); return null; }
public void inform(ResourceLoader loader) { try { if(chunkerModelFile!= null) { OpenNLPOpsFactory.getChunkerModel(chunkerModelFile, loader); } } catch(IOException e) { throw new IllegalArgumentException(e); } }
public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) { request = beforeClientExecution(request); return executeCompleteVaultLock(request); }
public int[] getCharIntervals() { return (int[])(Array) points.clone(); }
public long ramBytesUsed() { return docs.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ 2 * Integer.BYTES+ RamUsageEstimator.NUM_BYTES_OBJECT_REF; }
public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) { request = beforeClientExecution(request); return executeRegisterInstancesWithLoadBalancer(request); }
public DescribeClusterUserKubecRequest() { super("CS", "2016-12-15", "DescribeClusterUserKubeconConfig", "cs"); setUriPattern("/ks/[ClusterId]/user_config"); setMethod(MethodType.GET); }
public PrecisionRecord(RecordInputStream in) { field_1_precision = in.readShort(); }
public void serialize(LittleEndianOutput out) { out.writeShort(getLeftRowGutter()); out.writeShort(getTopColGutter()); out.writeShort(getRowLevelMax()); out.writeShort(getColLevelMax()); }
public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) { request = beforeClientExecution(request); return executeDeleteVirtualInterface(request); }
public Entry getEntry(String name) throws FileNotFoundException {if(excludes.contains(name))throw new FileNotFoundException(name); Entry entry = directory.getEntry(name); return wrapEntry(entry);}
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BACKUP]\n"); buffer.append("   .backupup = ").append(Integer.toHexString(getBackup())).append("\n"); buffer.append("[/BACKUP]\n"); return buffer.toString(); }
public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnectorOrigination(request); }
public Appendable append(char c) { write(c); return this; }
public static long generationFromSegmentsFileName(String fileName) throws IOException {if(fileName.equals(IndexFileNames.SEGMENTS)) { return 0; } else if(fileName.startsWith(IndexFileNames.SEGMENTS)) { return Number.parseLong(fileName); } else { throw new IllegalArgumentException("fileName \"" + fileName + "\" is not a segments file"); } }
public static TagOpt fromOption(String o) { if(o == null || o.length() == 0)return AUTO_FOLLOW; for(TagOpt tag : values())if(tagopt.getOption().equals(o))return tagopt; throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidTagOption,o)); }
public StartContentModerationResult startContentModeration(StartContentModerationRequest request) { request = beforeClientExecution(request); return executeStartContentModeration(request); }
public static String quoteReplacement(String s) { StringBuilder result = new StringBuilder(s.length()); for(int i = 0; i < s.length(); i++) { final char c = s.charAt(i); if(c == '\\' || c == '$') { result.append('\\'); } result.append(c); } return result.toString(); }
public void set(V newValue) { unsafe.putOrderedObject(this, valueOffset, newValue); }
public QueryParserTokenManager(CharStream stream) { initBlock(); input_stream = stream; }
public long valueFor(double elapsed) { if(modBy == 0)val = elapsed / factor; elseval = elapsed / factor; if(type == '0')return (long)Math.round(val); elsereturn (long)val; }
public LongBuffer get(long[] dst, int dstOffset, int longCount) { byteBuffer.limit(limit * SizeOf.LONG); byteBuffer.position(position * SizeOf.LONG); if(byteBuffer instanceof DirectByteBuffer) { ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } else { ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } this.position += longCount; return this; }
public void removeErrorListeners() { _listeners = new ANmbol[0]; }
public CommonTokenStream(TokenSource tokenSource, int channel) { this(tokenSource); this.channel = channel; }
public ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest request) { request = beforeClientExecution(request); return executeListObjectPolicies(request); }
public ObjectToPack(AnyObjectId src, int type) { super(src); flags = type << TYPE_SHIFT; }
public int stem(char s[], int len) { int numVowels_Renamed = numVowels(s, len); for(int i = 0; i < affixes.length; i++) { Affix affix = affixes[i]; if(numVowels_Renamedels.xc && len >= affix.length + 3 && endsWith(s, len, affix.length + 3 && len >= len; len -= affix.length; return len; } return len; }
public void recover(Parser recognizer, RecognitionException e) { if(lastErrorIndex == ((TokenStream) recognizer.getInputStream() && lastErrorStates!= null && lastErrorStates.getInputStream().consume(recognizer.getState)) { recognizer.consume(); } lastErrorIndex = recognizer.getInputStream().getIndex(); if(lastErrorStates == null) { lastErrorStates = new IntervalSet(); } lastErrorStates.add(recognizer.getState()); }
public String toFormulaString() { String value = field_3_string; int len = value.length(); StringBuilder sb = new StringBuilder(len + 4); sb.append(FORMULA_DELIMITER); for(int i = 0; i < len; i++) { char c = value.get(i); if(c == FORMULA_DELIMITER) { sb.append(FORMULA_DELIMITER); } sb.append(c); } sb.append(FORMULA_DELIMITER); return sb.toString(); }
public UnlinkFaceRequest() { super("LinkFace", "2018-07-20", "UnlinkFace"); setProtocol(ProtocolType.HTTPS); setMethod(MethodType.POST); }
publicConfigurationOptionSetting(String awsNamespace, String optionName, String value) { setAWsNamespace(awsNamespace); setOptionName(optionName); setValue(value); }
public String getFully(CharSequence key) { StringBuilder result = new StringBuilder(tries.size() * 2); for(int i = 0; i < tries.size(); i++) { String r = tries.get(i).getFully(key); if(r == null || (r.length() == 1 && r.charAt(0) == EOM)) { return result; } result.append(r); } return result.toString(); }
public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeMountTargetSecurityGroups(request); }
public GetApiMappingResult getApiMapping(GetApiMappingRequest request) { request = beforeClientExecution(request); return executeGetApiMapping(request); }
public HttpRequest(String strUrl) { setUrl(strUrl); setHeaders(headers); }
public MemFuncPtg(int subExprLen) { field_1_len_ref_subexpression = subExprLen; }
public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field,Comparator<TermStats> comparator> comparator> comparator = null; BytesRefStats<TermStats> comparator> comparator = MultiTermStats.getFields(reader); if(fields == null) { if(terms!= null) { throw new RuntimeException("field " + field + field + " not found"); } TermsEnum termsEnum = fields.getTerms(field); if(terms!= null) { TermsEnum termsEnum = new TermStats(numTerms, comparator.iterator(); tiq.fill(field, termsEnum); tiq.fill(field, termsEnum); for(String fieldName : fields) { throw new RuntimeException("no fields found for this index"); } } TermStats[] result = new TermStats[ti.size()]; for(String fieldName : fields) { ti q = new TermStats[ti.size()]; if(terms!= null) { tiq.fill(fieldName, terms); } int count = tqq.size()-1; while(tiq.size()!= 0) { throw new TermStats[count] = tqq.size()-1; } } }
public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) { request = beforeClientExecution(request); return executeDeleteApnsVoipChannel(request); }
public ListFacesResult listFaces(ListFacesRequest request) { request = beforeClientExecution(request); return executeListFaces(request); }
public ShapeFieldCacheDistanceValueSource(SpatialContext ctx,ShapeFieldCacheProvider<Point> provider, Point from, double multiplier) { this.ctx = ctx; this.from = from; this.provider = provider; this.multiplier = multiplier; }
public char get(int index) { checkIndex(index); return sequence[index]; }
public UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationProfile(request); }
public DescribeLifecycleHooksResult describeLifecycleHooks(DescribeLifecycleHooksRequest request) { request = beforeClientExecution(request); return executeDescribeLifecycleHooks(request); }
public DescribeHostReservationsResult describeHostReservations(DescribeHostReservationsRequest request) { request = beforeClientExecution(request); return executeDescribeHostReservations(request); }
public static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) { if(outerContext==null)outerContext.EMPTY; PredictionContext = ParserRuleContext.EMPTY; PredictionContext parent = PredictionContext.fromRuleContext(atn, outerContext.EMPTY) -> EMPTY; ATNState state = atn.states.states.get(atn, outerContext.getParent()); RuleTransition transition = (RuleTransition) state.transition(0); return parent.getChild(transition.stateNumber); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SXVDEX]\n"); buffer.append("   .grbit1 =").append(HexDump.intToHex(grbit1)).append("\n"); buffer.append("   .grbit2 =").append(HexDump.byteToHex(grbit2)).append("\n"); buffer.append("   .citmShow =").append(HexDump.byteToHex(cShow)).append("\n"); buffer.append("   .isxdiSort =").append(HexDump.shortToHex(isxdiSort())).append("\n"); buffer.append("   .isxdiShow =").append(HexDump.shortToHex(isxdiShow)).append("\n"); buffer.append("   .subName =").append(subName).append("\n"); buffer.append("[/SXVDEX]\n"); return buffer.toString(); }
public String toString() { final StringBuilder r = new StringBuilder(); r.append("BlameResult: "); r.append(getResultPath()); r.append(getResultPath()); return r.toString(); }
public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) { request = beforeClientExecution(request); return executeListChangeSets(request); }
public boolean isAllowNonFastForwards() { return allowNonFastForwards; }
public FeatRecord() { futureHeader = new FtrHeader(); futureHeader.setRecordType(sid); }
public ShortBuffer put(ShortBuffer buf) { throw new ReadOnlyBufferException(); }
public void setQuery(String query) { this.query = query; this.message = new Message(QueryParserMessages.INVALID_SYNTAX_PARSETAX_PARSE, query, ""); }
public StashApplyCommand stashApply() { return new StashApplyCommand(repo); }
public Set nameSet() { return Collections.unmodifiableSet(dictionary.values()); }
public static int getEffectivePort(String scheme, int specifiedPort) { if(definedPort!= -1)return specifiedPort; if(StringHelper.equalsIgnoreCase("http", scheme))return 80; elsereturn -1; }
public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) { request = beforeClientExecution(request); return executeListAssessmentTemplates(request); }
public RestoreFromClusterSnapshotResult restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) { request = beforeClientExecution(request); return executeRestoreFromClusterSnapshot(request); }
public void addShape(HSSFShape shape) { shape.setPatriarch(this.getPatriarch()); shape.setParent(this); shapes.add(shape); }
public boolean equals(Object o) { if(this == o) { return true; } if(o == null || getClass()!= o.getClass()) { return false; } FacetEntry that = (FacetEntry) o; if(count!= that.count) return false; if(!value.equals(that.value)) return false; return true; }
public static final int prev(byte[] b, int ptr, char chrA) { if(ptr == b.length)--ptr; while(ptr >= 0)if(b[ptr--] == chrA)return ptr; return ptr; }
public boolean isDeltaRepresentation() { return deltaBase!= null; }
public Token emitEOF() { int cpos = getColumn(); int line = getLine(); Token eof = _factory.create(_tokenFactorySourcePair, Token.EOF, null, Token.DEFAULT_INCHANNEL,_input.getIndex(),_input.getIndex() - 1, line, cpos); emit(eof); return eof; }
public UpdateUserRequest(String userName) { setUserName(userName); }
public RevFilter negate() { return NotRevFilter.create(this); }
public void setTagger(PersonIdent taggerIdent) { tagger = taggerIdent; }
public static BufferSize augment() throws BufferSizeException {long max, total, free); while(int proc = Process.getCurrentProcess()) { max = proc.getCurrentProcessMemorySize64(); total = proc.getVirtualMemorySize64(); free = proc.getPrivateMemorySize64(); long sortBufferByteSize = free / 2; long minBufferByteSize = MIN_BUFFER_MB * MB; if(sortBufferByteSize < minBufferSize) { final long minBufferSize = MIN_BUFFER_MB * MB; if(totalAvailableBytes / 2 > minBufferSizeBytes) { sortBufferByteSize = totalAvailableBytes / 2; } else { sortBufferByteSize = Math.max(ABSOL_MIN_SORT_BUFFER_BUFFER_BUFFER_BUFFER_SIZE, sortBufferByteSize); } } return new BufferSize(Math.min(Math.min(long)intSize, sortBufferByteSize);}
public static int trimTrailingWhitespace(byte[] raw, int start, int end) { int ptr = end - 1; while(start <= ptr && isWhitespace(raw[ptr]))ptr--; return ptr + 1; }
public TopMarginRecord(RecordInputStream in) { field_1_margin = in.readDouble(); }
public RetrieveEnvironmentInfoRequest(EnvironmentInfoType infoType) { setInfoType(infoType.toString()); }
public CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest request) { request = beforeClientExecution(request); return executeCreatePlayerSessions(request); }
public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) { request = beforeClientExecution(request); return executeCreateProxySession(request); }
public int getObjectType() { return type; }
public String getScheme() { return scheme; }
public void characters(char[] ch, int start, int length) { contents.append(ch, start, length); }
public FetchAlbumTagPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchAlbumTagPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DeleteMembersResult deleteMembers(DeleteMembersRequest request) { request = beforeClientExecution(request); return executeDeleteMembers(request); }
public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) { request = beforeClientExecution(request); return executeGetContactReachabilityStatus(request); }
public boolean remove(Object o) { int oldSize = size; HashMap.this.remove(o); return size!= oldSize; }
public E last() { return backingMap.lastKey(); }
public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) { request = beforeClientExecution(request); return executeCreateStreamingDistribution(request); }
public boolean isAbsolute() { return absolute; }
public DisableAddOnResult disableAddOn(DisableAddOnRequest request) { request = beforeClientExecution(request); return executeDisableAddOn(request); }
public DescribeAliasResult describeAlias(DescribeAliasRequest request) { request = beforeClientExecution(request); return executeDescribeAlias(request); }
public void next(int delta) { while(--delta >= 0) { if(currentSubtree!= null)ptr += currentSubtree.getEntrySpan(); } else if(currentSubtree!= null)ptr++; if(eof())break; parseEntry(); }
public TreeFilter clone() { return new Binary(a.clone(), b.clone()); }
public Reader create(Reader input) { return new PersianCharFilter(input); }
public String option() { return option; }
public String toString() { StringBuilder sb = new StringBuilder("["); for(Map.length() : this) { sb.append(", "); } sb.append(item); return sb.toString(); }
public DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest request) { request = beforeClientExecution(request); return executeDescribeSignalingChannel(request); }
public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) { request = beforeClientExecution(request); return executeAttachStaticIp(request); }
public String toString() { return new StringBuilder(64); }
public BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat, BloomFilterFactory bloomFilterFactory) { super(); this.delegatePostingsFormat = delegatePostingsFormat; this.bloomFilterFactory = bloomFilterFactory; }
public ListTemplatesResult listTemplates(ListTemplatesRequest request) { request = beforeClientExecution(request); return executeListTemplates(request); }
public TimerThread(long resolution, Counter counter) { super(THREAD_NAME); this.resolution = resolution; this.counter = counter; this.setBackground(true); }
public DrawingRecord() { recordData = EMPTY_BYTE_ARRAY; }
public ListDirectoriesResult listDirectories(ListDirectoriesRequest request) { request = beforeClientExecution(request); return executeListDirectories(request); }
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 3) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = block & 1; } }
public GroupingSearch disableCaching() { this.maxCacheRAMMB = null; this.maxDocsToCache = null; return this; }
public static int idealByteArraySize(int need) { for(int i = 4; i < 32; i++)if(need <= (1 << i) - 12)return (1 << i) - 12; }
public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) { request = beforeClientExecution(request); return executeUpdateAssessmentTarget(request); }
public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) { request = beforeClientExecution(request); return executeModifyVolume(request); }
public Cell merge(Cell m, Cell e) { if(m.cmd == e.cmd && m.ref == e.ref && m.skip == e.skip) { Cell c = new Cell(m); c.cnt += e.cnt; return c; } else { return null; } }
public ByteBuffer read(int length, long position) throws IOException {if(position >= length)throw new IllegalArgumentException("Position " + position + " past the end of the end of the file"); byteBuffer dst = -1; if(Writable) { dst = ByteBuffer.createBuffer(length); } fileStream.setPosition(position); if(dst == -1) { throw new IllegalArgumentException("Invalid theOUtils.readFully(fileStream, dst.getBuffer()); }}
public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest request) { request = beforeClientExecution(request); executeRespondActivityTaskCompleted(request); }
public synchronized void incrementProgressBy(int diff) { setProgress(mProgress + diff); }
public MetadataDiff compareMetadata(DirCacheEntry entry) throws IOException {if(entry.isAssumeValid()) { return Files.EQUAL; } if(entry.isUpdateNeeded()) { return DIFFER_BY_BY_METADATA; } if(entry.isUpdateNeeded()) { return DIFFER_BY_BY_METADATA; } if(!entry.length!= (int) { return DIFFER_BY_BY_METADATA; } long cacheLastModified = entry.getLastModified(); if(isModeDifferent(entry.getRawMode()!= (int) { return DIFModified = getEntryLastModified(); } long cacheLastModified = entry.getLastModified(); if(cacheLastModified % 1000 == 0 || fileLastModified % 1000 == 0) { cacheLastModified = cacheLastModified - cacheLastModified % 1000; fileLastModified = fileLastModified % 1000; if(fileLastModified) { fileLastModified = fileLastModified % 1000; } if(fileLastModified!= cacheLastModified) { return DIF; } else { return WorkingTreeDiff.EQUAD_BYTIMAL; } }
public static NumberRecord convertToNumberRecord(RKRecord rk) { NumberRecord num = new NumberRecord(); num.setColumn((rk.getColumn()); num.setRow(rk.getRow()); num.setXFIndex(rk.getXFIndex()); num.setValue(rk.getRKNumber()); return num; }
public CharBuffer put(char[] src, int srcOffset, int charCount) { byteBuffer.limit(limit * SizeOf.CHAR); byteBuffer.position(position * SizeOf.CHAR); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount); } this.position += charCount; return this; }
public int getCells() { Iterator<Character> i = cells.keySet().iterator(); for(; i.hasNext();) { Character c = i.next(); Cell e = at(c); if(e.cmd >= 0 || e.ref >= 0) { size++; } } return size; }
public BeiderMorseFilterFactory(Map<String,String> args) { super(args); NameType nameType = (NameType) Enum.parse(args, "nameType", NameType"); RuleType ruleType = (RuleType) Enum.valueOf(args, "ruleType", RuleType.APPROX.toString()), true); boolean concat = getBoolean(args, "concat", true); set<String> langs = new PhoneticEngine(args, "languageSet"); Set<String> langs = getSet(args, "languageSet"); if(!args.isEmpty()) { languageSet = new PhoneticEngine(args, "languageSet"); } if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public static double varp(double[] v) { double r = Double.NaN; if(v!=null && v.length > 1) { r =devsq(v) / v.length; } return r; }
public PersianNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public static final WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) { HashSet<WeightedTerm> terms = new HashSet<>(); if(fieldName!= null) { fieldName = fieldName.Intern(); } getTerms(query, terms,prohibited, fieldName); return terms.toArray(new Term[0]); }
public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationPart(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CHART]\n"); buffer.append("   .x                = ").append("0x").append(HexDump.toHex(getX())).append(" (").append(getX()).append(" )"); buffer.append(System.getProperty("line.separator")); buffer.append("  .y                       = ").append("0x").append("0x").append(HexDump.toHex(getY())).append(" (").append(getY()).append(" )"); buffer.append(System.getProperty("line.separator")); buffer.append("   .width                            = ").append("0x").append(HexDump.toHex(getWidth())).append(" (").append(getWidth()).append(" )"); buffer.append("  .height                             = ").append("0x").append("0x
public final short get(int index) { checkIndex(index); return backingArray[offset + index]; }
public String toString() { return image; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) { try { AreaEval reA = evaluateRef(arg0); AreaEval reB = evaluateRef(arg1); AreaEval result = resolveRange(reA, reB); if(result == null) { return ErrorEval.NULL_INTERSECTION; } return result; } catch(EvaluationException e) { return e.getErrorEval(); } }
public void clear() { weightBySpanQuery.clear(); }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; bi.setText(buffer.substring(start)); return bi.next() + start; }
final public SrndQuery PrimaryQuery() throws ParseException {SrndQuery q; SrndQuery q; switch((jj_ntk==-1)?jj_ntk():jj_ntk) { case LPAREN: jj_consume_token(LPAREN); jj_consume_token(RPAREN); break; case OR: jj_consume_token(RPAREN); break; case N: case N: q = PrefixOperatorQuery(); break; case QUOTED: case QUOTED: q = SimpleTerm(); break; case QUOTED: q = SimpleTerm(); break; default: jj_la1[1] = jj_gen; break; default: jj_consume_token(-1); throw new ParseException(); } throw new Error("Missing return statement in function");}
public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) { request = beforeClientExecution(request); return executeDeleteApiKey(request); }
public InsertTagsRequest() { super("Ots", "2016-06-20", "InsertTags", "ots"); setMethod(MethodType.POST); }
public DeleteUserByPrincipalIdResult deleteUserByPrincipalId(DeleteUserByPrincipalIdRequest request) { request = beforeClientExecution(request); return executeDeleteUserByPrincipalId(request); }
public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeNetworkInterfaces(request); }
public int serialize(int offset, byte[] data, EscherSerializationListener listener) { listener.beforeRecordSerialize(offset, getRecordId(), this); LittleEndian.putShort(data, offset, getOptions()); LittleEndian.putShort(data, offset + 2, getRecordId()); LittleEndian.putInt(data, offset + 4, getRecordId()); LittleEndian.putInt(data, offset + 8, field_1_numShapes); LittleEndian.putInt(data, offset + 12, field_2_lastMSOSPID); listener.afterRecordSerialize(offset + 16, getRecordId(), this); return getRecordSize(); }
public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) { request = beforeClientExecution(request); return executeCreateSecurityConfiguration(request); }
public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeClientVpnConnections(request); }
public static void fill(double[] array, double value) { for(int i = 0; i < array.length; i++) { array[i] = value; } }
public boolean hasNext() { return pos < maxColumn; }
public PostingsEnum reset(int[] postings) { this.postings = postings; upto = -2; freq_Renamed = 0; return this; }
public final boolean hasAll(RevFlagSet set) { return (flags & set.mask) == set.mask; }
public ModifyAccountResult modifyAccount(ModifyAccountRequest request) { request = beforeClientExecution(request); return executeModifyAccount(request); }
public Token LT(int k) { lazyInit(); if(k == 0) return null; if(k < 0) return LB(-k); int i = p + k - 1; sync(i); if(i >= tokens.size())return tokens[tokens.size()-1]; return tokens[i]; }
public void removeSheet(int sheetIndex) { if(boundsheets.size() > sheetIndex) { records.remove(records.getBspos() - (boundsheets.size() - 1) + sheetIndex); } int sheetNum1Based = sheetIndex + 1; for(int i = 0; i < getNumNames(); i++) { NameRecord nr = getNameRecord(i); if(nr.getSheetNumber() == sheetNum1Based) { nr.setSheetNumber(0); nr.setSheetNumber(nr.getSheetNumber() - 1); } else if(nr.getSheetNumber() > sheetNum1Based) { nr.setSheetNumber(nr.getSheetNumber() - 1); } } if(linkTable!= null) { for(int i = sheetIndex + 1; i < getSheets() + 1; i++) { linkTable.removeSheet(i); } } }
public void removeName(Name name) { int index = getNameIndex((HSSFName) name); removeName(index); }
public boolean equals(final Object o) { if(!(o instanceof Property)) { return false; } final Property p = (Property) o; final long pId = p.getID(); final long pId = p.getID(); if(id!= pId || (id!= 0 && pValue == null)return false; if(value == null && pValue == null)return false; Class valueClass = value.getClass(); if(valueClass.isAssignableFrom(pValueClass.isAssignableFrom(valueClass)) { return false; } if(!(valueClass.isAssignableFrom(valueClass)) { return false; } return Arrays.equals(pValue); }
public GetRepoBuildListRequest() { super("cr", "2016-06-07", "GetRepoBuildList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/build"); setMethod(MethodType.GET); }
public MessageWriter() { buf = new ByteArrayOutputStream(); enc = new OutputStreamWriter(getRawStream(),UTF_8); }
public void append(RecordBase r) { _recs.add(r); }
public void close() throws IOException {if(read(skipBuffer)!= -1 || this.actualSize!= this.expectedSize) { throw new CorruptObjectException(MessageFormat.format(JGitText.get().packfileCorruption,JGitText.get().unknownDecompressedLength)); } final int used = bAvail - 1; if(0 < used) { onObjectData(src, buf, p, used); use(used); } this.reset();}
public DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest request) { request = beforeClientExecution(request); return executeDescribeModelPackage(request); }
public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sf) { if(rec instanceof FormulaRecord) { FormulaRecord formulaRec = (FormulaRecord) rec; StringRecord cachedText = (FormulaRecord) rec; Class = rs.peekNextClass(); if(nextClass == StringRecord) { cachedText = (StringRecord) rs.getNext(); } else { cachedText = null; } else { insertCell(new FormulaRecordAggregate(formulaRec, cachedText, sfh)); } insertCell(rec); }
public DeflateDecompressor clone() { return copy(); }
public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) { request = beforeClientExecution(request); return executeUpdateS3Resources(request); }
public GroupQueryNode(QueryNode query) { if(query == null) { throw new QueryNodeError(new MessageImpl(QueryParserMessages.PARAMETER_VALUE_NOT_SUPPORTED, "query", "null")); } allocate(); setLeaf(false); add(query); }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { StringBuilder path = new StringBuilder(); path.append("/").append(getFirstPathElement()) { for(QueryText pathelement : getPathElements(1)) { String value = escaper.escape(new StringCharSequence(pathelement.getValue(), "); path.append("/\"").append(value).append("\""); } return path.toString(); }
public void removeCellComment() { HSSFComment comment2 = _sheet.findCellComment(_record.getRow(), _record.getColumn()); comment = null; if(null == comment2) { return; } _sheet.removeDrawingPatriarch().removeShape(comment2); }
public void reset() { count = 0; assert forwardCount == 0: "pos=" + pos + " forwardCount=" + forwardCount; }
public ActivateUserResultactivateUser(ActivateUserRequest request) { request = beforeClientExecution(request); return executeActivateUser(request); }
public boolean isCharsetDetected() { throw new UnsupportedOperationException(); }
public ModifySnapshotCopyRetentionPeriodResult modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest request) { request = beforeClientExecution(request); return executeModifySnapshotCopyRetentionPeriod(request); }
public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) { request = beforeClientExecution(request); return executeDeleteClusterSubnetGroup(request); }
public static String decode(byte[] buffer) { return decode(buffer, 0, buffer.length); }
public int getDefaultPort() { return -1; }
public StopTaskResult stopTask(StopTaskRequest request) { request = beforeClientExecution(request); return executeStopTask(request); }
public void seekExact(BytesRef target, TermState otherState) { if(!target.equals(term)) { state.copyFrom(otherState); term = BytesRef.deepCopyOf(target); seekPending = true; } }
public SeriesToChartGroupRecord(RecordInputStream in) { field_1_chartGroupIndex = in.readShort(); }
public static void writeUnicodeStringFlagAndData(LittleEndianOutput out, String value) { boolean is16Bit = hasMultibyte(value); out.writeByte(is16Bit? 0x01 : 0x00); if(is16Bit) { putUnicodeLE(value, out); } else { putCompressedUnicode(value, out); } }
public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) { request = beforeClientExecution(request); return executeAuthorizeSecurityGroupIngress(request); }
public void addFile(String file) { checkFileNames(new[] { file }); setFiles.add(file); }
public void setSize(int width, int height) { mWidth = width; mHeight = height; }
public void setPrecedenceFilterSuppressed(boolean value) { if(value) { this.reachesIntoOuterContext |=SUPPRESS_PRECEDENCE_FILTER; } else { this.reachesIntoOuterContext &= ~SUPPRESS_PRECEDENCE_FILTER; } }
public IntervalSet LOOK(ATNState s, RuleContext ctx) { return lookup(s, null, ctx); }
public void serialize(LittleEndianOutput out) { out.writeShort(getOptionFlags()); out.writeShort(getRowHeight()); }
public Builder(boolean dedup) { this.dedup = dedup; }
public Hashtable(int capacity, float loadFactor) { this(capacity); if(loadFactor <= 0 || Float.isNaN(loadFactor)) { throw new IllegalArgumentException("Load factor: " + loadFactor); } }
public Object get(CharSequence key) { int bucket = normalCompletion.getBucket(key); return bucket == -1? (long) null : bucket; }
public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) { request = beforeClientExecution(request); return executeListHyperParameterTuningJobs(request); }
public DeleteTableResult deleteTable(String tableName) { return deleteTable(new DeleteTableRequest().withTableName(tableName)); }
public boolean lessThan(TextFragment fragA, TextFragment fragB) { if(fragA.score == fragB.score)return fragA.getFragNum(); elsereturn fragA.score < fragB.score; }
public void freeBefore(int pos) { assert pos >= 0; assert pos <= nextPos; final int newCount = nextPos - pos; assert newCount <= count: "newCount=" + newCount + " count=" + count; assert newCount <= buffer.length: "newCount=" + newCount + " buf.length=" + buffer.length; count = newCount; }
public UpdateHITTypeOfHITResult updateHITTypeOfHIT(UpdateHITTypeOfHITRequest request) { request = beforeClientExecution(request); return executeUpdateHITTypeOfHIT(request); }
public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) { request = beforeClientExecution(request); return executeUpdateRecommenderConfiguration(request); }
public int compareTo(Object other) { return br!= null; }
public int stem(char s[], int len) { if(len > 4 && s[len-1] =='s')len--; if(len > 5 && (endsWith(s, len, "ene") || (StemmerUtil.endsWith(s, len, "ane") || useNONE; return len - 3; } if(len > 4 && (endsWith(s, len, "er") ||endsWith(s, len, "en") ||endsWith(s, len, "et") || useNONE; return len - 2; }
public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) { request = beforeClientExecution(request); return executeDescribeDBSnapshots(request); }
public SortedSetDocValuesFacetField(String dim, String label) { super("dummy", TYPE); FacetField.verifyLabel(label); FacetField.verifyLabel(dim); setDim(dim); }
public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) { request = beforeClientExecution(request); return executeCreateDocumentationPart(request); }
public String getValue() { return value; }
public ShortBuffer asReadOnlyBuffer() { return duplicate(); }
public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) { request = beforeClientExecution(request); return executeUpdateDataSourcePermissions(request); }
public static org.apache.poi.hssf.Record createSingleRecord(RecordInputStream in) { if(_recordCreatorsById.containsKey(in.getSid())) { return Collections.create(in); } else { return new UnknownRecord(in); } }
public int getCount() { return mTabLayout.getChildCount(); }
public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteApplicationReferenceDataSource(request); }
public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) { request = beforeClientExecution(request); return executeCreateProjectVersion(request); }
public IntBuffer slice() { return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position); }
public final byte get() throws IOException {return primitiveTypes.get();}
public LongBuffer put(int index, long c) { checkIndex(index); backingArray[offset + index] = c; return this; }
public StoredField(String name, double value) { super(name, TYPE); fieldsData = value; }
public IntervalSet getExpectedTokensWithinCurrentRule() { ATN atn = getInterpreter().atn; ATNState s = atn; return atn.nextTokens(s); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FILESHARING]\n"); buffer.append("   .readonly        = ").append(getReadOnly()).append("\n"); buffer.append("   .password     = ").append(HexDump.shortToHex(getPassword())).append("\n"); buffer.append("   .username     = ").append(getUsername()).append("\n"); buffer.append("[/FILESHARING]\n"); return buffer.toString(); }
public SubmoduleInitCommand(Repository repo) { super(repo); paths = new ArrayList<>(); }
public void include(String name, AnyObjectId id) throws IOException {if(!revalidRefName(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidRefName, name)); if(include.containsKey(name))throw new IllegalStateException(JGitText.get().duplicateRef + name); include.put(name, id.toObjectId());}
public EnableSnapshotCopyResult enableSnapshotCopy(EnableSnapshotCopyRequest request) { request = beforeClientExecution(request); return executeEnableSnapshotCopy(request); }
public ValueFiller getValueFiller() { return new ValueFiller() { private final MutableValueBool mval = new MutableValueBool(); @Override
public void serialize(LittleEndianOutput out) { out.writeByte(getPane()); out.writeShort(getActiveCellRow()); out.writeShort(getActiveCellCol()); out.writeShort(getActiveCellRef()); int nRefs = field_6_refs.length; for(int i = 0; i < field_6_refs.length; i++) { field_6_refs[i].serialize(out); } }
public static Counter newCounter() { return newCounter(false); }
public int get(String name, int dflt) { int vals[] = (int[]) valByRound.get(name); if(vals!= null) { return vals[roundNumber % vals.length]; } String sval = props.getProperty(name, "" + dflt); if(sval.indexOf(":") < 0) { return Integer.parseInt(sval); } int k = sval.indexOf(":"); String colName = sval.substring(0, k); sval = sval.substring(k + 1); colForValByRound.put(name, colName); vals = propToIntArray(sval); valByRound.put(name, vals); return vals[roundNumber % vals.length]; }
public void preSerialize() { if(records.getTabpos() > 0) { TabIdRecord fra = (TabIdRecord) records.get(records.getTabpos()); if(tir._tabids.length < boundsheets.size()) { fixTabIdRecord(); } } }
public LimitTokenCountAnalyzer(Analyzer delegate, int maxTokenCount, boolean consumeAllTokens) { super(delegate.getStrategy()); this.delegate = delegate; this.maxTokenCount = maxTokenCount; this.consumeAllTokens = consumeAllTokens; }
public ExternalBookBlock(int numberOfSheets) { _externalBookRecord = SupBookRecord.createInternalReferences((short)numberOfSheets); _externalNameRecords = new ExternalNameRecord[0]; _crnBlocks = new CRNBlock[0]; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SCENARIOPROTECT]\n"); buffer.append("   .options = ").append(HENARIOPROTECT]\n"); buffer.append("[/SCENARIOPROTECT]\n"); return buffer.toString(); }
public PushCommand setThin(boolean thin) { checkCallable(); this. thin = thin; return this; }
public int compareTo(SearcherTracker other) { return other.compareTo(recordTimeSec); }
public TokenStream create(TokenStream input) { return new ReverseStringFilter(input); }
public BlockList() { directory = BlockList.<T> newDirectory(256); directory[0] = BlockList.<T> newBlock(); tailBlock = directory[0]; }
public QueryScorer(WeightedSpanTerm[] weightedTerms) { this.fieldWeightedSpanTerms = new HashMap<>(); for(WeightedSpanTerm t : weightedTerms) { if(fieldWeightedSpanTerm == null) { final WeightedSpanTerm existingTerm = fieldWeightedSpanTerms.get(t.term); if(existingTerm == null) { fieldWeightedSpanTerms.put(t.term, t.getWeight()); maxTermWeight = Math.max(maxTermWeight, t.getWeight()); } } } skipInitExtractor = true; }
public boolean equals(Object other) { assert neverEquals(other); if(other instanceof MergedGroup) { if(groupValue == null) { return otherMergedGroup == null; } else { return otherMergedGroup == null; } } else { return groupValueIsValue; } }
public final Charset charset() { return cs; }
public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) { request = beforeClientExecution(request); return executeDescribeExperiment(request); }
public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook,Color forecolor, float verticalPointsPerPixel) { this.escherGroup = escher; this.workbook = workbook; this.verticalPointsPerPixel = verticalPointsPerPixel; this.verticalPixelsPerPixel = 1 / verticalPointsPerPixel; this.font = new Font("Arial", 10); }
public String pattern() { return patternText; }
public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) { request = beforeClientExecution(request); return executeDeleteRouteTable(request); }
public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) { request = beforeClientExecution(request); return executeAssociateVPCWithHostedZone(request); }
public PutIntegrationResult putIntegration(PutIntegrationRequest request) { request = beforeClientExecution(request); return executePutIntegration(request); }
public SimpleEntry(K theKey, V theValue) { key = theKey; value = theValue; }
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long byte0 = blocks[blocksOffset++] & 0xFF; final long byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4); final long byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 8) | byte2; } }
public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) { request = beforeClientExecution(request); return executeDisassociateConnectionFromLag(request); }
public FileMode getOldMode() { return oldMode; }
@Override public String toString() { return mapEntry.toString(); }
public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopKeyPhrasesDetectionJob(request); }
public String toString() { StringBuilder buffer = new StringBuilder("[Array Formula or Shared Formula]\n"); buffer.append("row = ").append(getRow()).append("\n"); buffer.append("col = ").append(getColumn()).append("\n"); return buffer.toString(); }
public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) { request = beforeClientExecution(request); return executeListDominantLanguageDetectionJobs(request); }
public String toString() { return "slice start=" + start + " length=" + length + " readerIndex=" + readerIndex; }
public static int parseHexInt4(byte digit) throws IOException {final int r = digits16[digit]; if(r < 0) { throw new IndexOutOfBoundsException(); } return r;}
public Attribute(String name, String value) { setName(name); setValue(value); }
public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) { request = beforeClientExecution(request); return executeDescribeStackSetOperation(request); }
public HSSFCell getCell(short cellnum) { int ushortCellNum = cellnum & 0x0000FFFF; return getCell(ushortCellNum); }
public void write(byte[] b) { writeContinueIfRequired(b.length); _ulrOutput.write(b); }
public ResetImageAttributeRequest(String imageId, ResetImageAttributeName attribute) { setImageId(imageId); setAttribute(attribute.toString()); }
public void discardResultContents() { resultContents = null; }
public ObjectId getPeeledObjectId() { return getLeaf().getPeeledObjectId(); }
public void undeprecateDomain(UndeprecateDomainRequest request) { request = beforeClientExecution(request); executeUndeprecateDomain(request); }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeByte(field_3_string.length()); out.writeByte(_is16bitUnicode? 0x01 : 0x00); if(_is16bitUnicode) { StringUtil.putUnicodeLE(field_3_string, out); } else { StringUtil.putCompressedUnicode(field_3_string, out); } }
public DeleteQueueResult deleteQueue(String queueUrl) { return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl)); }
public void setCheckEofAfterPackFooter(boolean b) { checkEofAfterPackFooter = b; }
public void swap() { int sBegin = beginA; int sEnd = endA; beginA = beginB; endA = endB; beginB = sBegin; endB = sEnd; }
public int getPackedGitWindowSize() { return packedGitWindowSize; }
public PutMetricDataResult putMetricData(PutMetricDataRequest request) { request = beforeClientExecution(request); return executePutMetricData(request); }
public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) { request = beforeClientExecution(request); return executeGetCelebrityRecognition(request); }
public CreateQueueRequest(String queueName) { setQueueName(queueName); }
public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) { super(arearef); this.externalWorkbookNumber = externalWorkbookNumber; this.firstSheetName = sheetName.getSheetIdentifier().getName(); if(sheetName instanceof SheetRangeIdentifier) { this.lastSheetName = ((SheetRangeIdentifier)sheetName).getLastSheetIdentifier().getName(); } else { this.lastSheetName = null; } }
public void setBaseline(long clockTime) { t0 = clockTime; timeout = t0 + ticksAllowed; }
public MoveAddressToVpcResult moveAddressToVpc(MoveAddressToVpcRequest request) { request = beforeClientExecution(request); return executeMoveAddressToVpc(request); }
public String toString() { String coll = collectionModel.getName(); if(coll!= null) { return "WM { } return String.toString(); } }
public DescribeLagsResult describeLags(DescribeLagsRequest request) { request = beforeClientExecution(request); return executeDescribeLags(request); }
public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) { if(_refEval == null) { return _areaEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx); } return _refEval.offset(relFirstRowIx, relLastRowIx, relLastColIx, relLastColIx); }
public ShortBuffer put(short[] src, int srcOffset, int shortCount) { byteBuffer.limit(limit * SizeOf.SHORT); byteBuffer.position(position * SizeOf.SHORT); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } this.position += shortCount; return this; }
public void initialize(String cat) { this._cat = cat; }
public void write(int oneByte) throws IOException {checkWritePrimitiveTypes(); primitiveTypes.write( oneByte);}
public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) { request = beforeClientExecution(request); return executeDescribeImportImageTasks(request); }
public ColumnInfoRecord(RecordInputStream in) { _first_col = in.readUShort(); _last_col = in.readUShort(); _col_col_width = in.readUShort(); _xf_index = in.readUShort(); _options = in.readUShort(); switch(in.remaining()) { case 2: field_6_reserved = in.readUShort(); break; case 1: field_6_reserved = in.readUShort(); break; case 0: field_6_reserved = 0; break; default: throw new RuntimeException("Unusual record size remaining= (" + in.remaining() + ")"); } }
public Status(IndexDiff diff) { super(); this.diff = diff; clean = diff.getAdded().isEmpty() && diff.getChanged().isEmpty() && diff.getMissing().isEmpty() && diff.getMissing().isEmpty() && diff.getMissing().isEmpty() && diff.getModified().isEmpty() && diff.getConflicting().isEmpty() && diff.getConflicting().isEmpty() && diff.getConflicting().isEmpty() && diff.getConflicting().isEmpty() && diff.getConflicting().isEmpty() == 0 && diff.getConflicting().isEmpty(); }
public CreateExperimentResult createExperiment(CreateExperimentRequest request) { request = beforeClientExecution(request); return executeCreateExperiment(request); }
public DBCellRecord clone() { return copy(); }
public FloatBuffer slice() { byteBuffer.limit(limit * SizeOf.FLOAT); byteBuffer.position(position * SizeOf.FLOAT); ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order()); FloatBuffer result = new FloatToByteBufferAdapter(bb); byteBuffer.clear(); return result; }
public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) { request = beforeClientExecution(request); return executeDescribeSnapshotSchedules(request); }
public ListImagesResult listImages(ListImagesRequest request) { request = beforeClientExecution(request); return executeListImages(request); }
public Diff(int ins, int del, int rel, int noop) { INSERT = ins; DELETE = del; REPLACE = rep; NOOP = noop; }
public String toFormulaString(String[] operands) { StringBuilder buffer = new StringBuilder(); buffer.append(operands[ 0 ]); buffer.append(","); buffer.append(operands[ 1 ]); return buffer.toString(); }
public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) { WorkbookEvaluator[] wbEvaluator = new WorkbookEvaluator[Evaluators.length]; for(int i = 0; i < wbEval.length; i++) { wbEvals[i] = evaluators[i]._evaluator; } CollatingWorkbookEnvironment.setup(workbookNames, wbEval); }
public ListPhotoTagsRequest() { super("CloudPhoto", "2017-07-11", "ListPhotoTags", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public RandomSamplingFacetsCollector(int sampleSize, long seed) { super(false); this.sampleSize = sampleSize; this.random = new XORShift64Random(seed); this.sampledDocs = null; }
public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) { request = beforeClientExecution(request); return executeAllocateStaticIp(request); }
public FeatRecord(RecordInputStream in) { futureHeader = new FtrHeader(in); isf_sharedFeatureType = in.readUShort(); reserved1 = in.readInt(); reserved1 = in.readInt(); int fref = in.readInt(); cbFeatData = in.readInt(); cbFeatData = new CellRangeAddress[cref]; for(int i = 0; i < cellRefs.length; i++) { cellRefs[i] = new CellRangeAddress(in); for(int i = 0; i < cellRefs.length; i++) { cellRefs[i] = new CellRangeAddress(in); break; case FeatHexDeatHdrRecord.SHAREDFEATURE: sharedFeature = new Feat(in); break; case FeatHdrRecord.SHAREC2(in); break; case FeatHdrRecord.SHAREC2(in); break; default: break; default: logger.log(POILogger.ERROR, "Unknown SharedFeature " + isFeat(in); break; default: break; } } }
public RevCommit tryFastForward(RevCommit newCommit) { Ref head = repo.getRef(Constants.HEAD); if(head == null || head.getObjectId() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD)); final ObjectId headId = head.getObjectId(); if(headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD)); final RevCommit headId = walk.format(JGitText.get().refNotResolved, HEAD)); if(walk.isMergedInto(newCommitText.isMergedInto(newCommit))return newCommit; final String headName = head.getTarget().getName(); if(head.isSymbolic(), headCommit))return newCommit; headName = head.getTarget().getName(); headName = head.getTarget().getName(); }
public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) { request = beforeClientExecution(request); return executeCreateSnapshotSchedule(request); }
public Record getNext() { if(_nextIndex >= _list.size()) { throw new RuntimeException("Attempt to read past end of record stream"); } _countRead++; return _list.get(_nextIndex++); }
public String toString() { return RawParseUtils.decode(buf.toByteArray()); }
public ListTablesRequest(String exclusiveStartTableName) { setExclusiveStartTableName(exclusiveStartTableName); }
public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) { request = beforeClientExecution(request); return executeEnableAlarmActions(request); }
public Builder() { this(16, 16); }
public boolean equals(Object obj) { if(!(obj instanceof State)) { return is_final int other = (State) obj; } return is_final int other.equals(this.labels, other.labels) &&referenceEquals(this.states, other.states); }
public TokenStream create(TokenStream input) { return new EnglishPossessiveFilter(input); }
public void clearFormatting() { _string = cloneStringIfRequired(); _string.clearFormatting(); addToSSTIfRequired(); }
public int get(int index, long[] arr, int off, int len) { assert len > 0 : "len must be > 0 (got " + len + ")"; assert index >= 0 && index < valueCount; len = Math.min(len, valueCount - index); Arrays.fill(arr, off, 0); return len; }
public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) { request = beforeClientExecution(request); return executeDeleteRouteResponse(request); }
public String toPrivateString() { return format(true, false); }
public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) { request = beforeClientExecution(request); return executeCreatePresignedDomainUrl(request); }
public void write(int oneChar) { doWrite(new char[1Char] oneChar }, 1); }
public SSTRecord getSSTRecord() { return sstRecord; }
public String toString() { return "term=" + term + ",field=" + field + ",value=" + value; }
public boolean isSaturated(FuzzySet bloomFilter, FieldInfo fieldInfo) { return bloomFilter.getSaturation() > 0.9f; }
public Builder(boolean dedup) { this.dedup = dedup; }
public String toString() { return getClass().getSimpleName()+ "(maxBasicQueries: " + maxBasicQueries+ ", queriesMade: " + queriesMade+ ")"; }
public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteDataSource(request); }
public RebootNodeResult rebootNode(RebootNodeRequest request) { request = beforeClientExecution(request); return executeRebootNode(request); }
public void processChildRecords() { convertRawBytesToEscherRecords(); }
public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) { request = beforeClientExecution(request); return executeCreateOrUpdateTags(request); }
public FileSnapshot getSnapShot() { return snapshotShot; }
public InputStream openResource(String resource) throws IOException {InputStream stream = this.findAndGetManifestResourceStream(clazz, resource); if(stream == null) { throw new IOException("Resource not found: " + resource); } return stream;}
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append("sid=").append(HexDump.shortToHex(_sid)); sb.append(" size=").append(_data.length); sb.append(" : ").append(HexDump.toHex(_data)); sb.append("]\n"); return sb.toString(); }
public int nextIndex() { return index; }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { if(isDefaultField(this.field)) { return "\"" + getTermEscapeQuoted(escaper) + "\""; } else { return this.field + ":" + getTermEscapeQuoted(escaper) + "\""; } }
public CalcModeRecord clone() { return copy(); }
public boolean isOutput() { return output; }
public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) { request = beforeClientExecution(request); return executeCreateNetworkInterface(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_password); }
public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopDominantLanguageDetectionJob(request); }
public synchronized void withConnectionTimeout(int milliseconds) { this.connectionTimeoutInMilliseconds = milliseconds; }
public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) { request = beforeClientExecution(request); return executeGetGatewayGroup(request); }
public FloatBuffer slice() { return new ReadOnlyFloatArrayBuffer(remaining(), backingArray, offset + position); }
public static String join(Collection<String> parts, String separator, String lastSeparator) { StringBuilder sb = new StringBuilder(); int i = 0; int lastIndex = parts.size() - 1; for(String part : parts) { sb.append(part); if(i == lastIndex - 1) { sb.append(lastSeparator); } else { if(i!= lastIndex - 1) { sb.append(separator); } } i++; } i++; return sb.toString(); }
public String toString() { return "(" + a.toString() + " AND " + b.toString() + ")"; }
public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) { setTopicArn(topicArn); setNextToken(nextToken); }
public byte readByte() { return bytes[pos--]; }
public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeTerminateClientVpnConnections(request); }
public ReceiveMessageRequest(String queueUrl) { setQueueUrl(queueUrl); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_barSpace); out.writeShort(field_2_categorySpace); out.writeShort(field_3_formatFlags); }
public Object common(Object output1, Object output2) { return outputs.common((T) output1, (T) output2); }
public CreateVariableResult createVariable(CreateVariableRequest request) { request = beforeClientExecution(request); return executeCreateVariable(request); }
public static final int match(byte[] b, int ptr, byte[] src) { if(ptr + src.length > b.length)return -1; for(int i = 0; i < src.length; i++, ptr++)if(b[ptr]!= src[i])return -1; return ptr; }
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) { int bytesRemaining = readHeader(data, offset); int pos            = offset + 8; int size             = 0; field_1_rectX1       =  LittleEndian.getInt(data, pos + size); size+=4; field_2_rectY1 =  LittleEndian.getInt(data, pos + size); size+=4; field_3_rectX2 =  LittleEndian.getInt(data, pos + size); size+=4; field_4_rectY2 =  LittleEndian.getInt(data, pos + size); size+=4; bytesRemaining -= size; if(bytesRemaining!= 0) { throw new RecordFormatException("Expected no remaining bytes but got " + bytesRemaining); } return 8 + size + bytesRemaining; }
public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) { request = beforeClientExecution(request); return executeCreateCloudFrontOriginAccessIdentity(request); }
public boolean isNamespaceAware() { return getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES); }
public void setOverridable(boolean on) { overridable = on; }
public String getClassName() { return className; }
public synchronized DirectoryReader getIndexReader() { if(indexReader!= null) { indexReader.incRef(); } return indexReader; }
public int indexOfKey(int key) { return binarySearch(mKeys, 0, mSize, key); }
public BlankRecord(RecordInputStream in) { field_1_row = in.readUShort(); field_2_col = in.readShort(); field_3_xf = in.readShort(); }
public long length() { return length; }
public PasswordRecord(RecordInputStream in) { field_1_password = in.readShort(); }
public HashMap(int capacity, float loadFactor) { this(capacity); if(loadFactor <= 0 || Float.isNaN(loadFactor)) { throw new IllegalArgumentException("Load factor: " + loadFactor); } }
public void run() throws IOException {final long lastReopenStartNS = System.currentStartNS; boolean hasWaitStartNS = System.currentStartNS + 1; synchronized(!finish) { boolean hasWait(); long nextReopenStartNS = lastReopenStartNS + (hasWait? targetMinStale? targetMinStale : targetMaxStale.nanoTime; long stopNS = nextReopenStartNS - System.nanoTime(); if(sleepNS > 0) { waitCond.waitOne(TimeSpan.fromMillisMillisMillis().currentTime()); } lastReopenStartNS = System.nanoTime(); } catch(InterruptedException ie) { throw new RuntimeException(e); } } refreshDone();}
public DeleteLoginProfileRequest(String userName) { setUserName(userName); }
public E pollFirst() { return (size == 0)? null : removeFirstImpl(); }
public CreatePhotoRequest() { super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public String getName() { return "resolve"; }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; int offset, count = maxScan; for(offset = start; offset < buffer.length && count > 0; count--) { if(boundaryChars.contains(buffer[offset])) return offset; offset++; } return start; }
public void setObjectChecker(ObjectChecker oc) { objCheck = oc; }
public BaseRef(AreaEval ae) { _refEval = null; _areaEval = ae; _firstRowIndex = ae.getFirstRow(); _firstColumnIndex = ae.getFirstColumn(); _height = ae.getLastRow() - ae.getFirstColumn() + 1; _width = ae.getLastColumn() - ae.getFirstColumn() + 1; }
public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) { request = beforeClientExecution(request); return executeCreateVpcEndpoint(request); }
public DeregisterWorkspaceDirectoryResult deregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeDeregisterWorkspaceDirectory(request); }
public ChartFRTInfoRecord(RecordInputStream in) { rt = in.readShort(); grbitFrt = in.readShort(); verOriginator = in.readByte(); verWriter = in.readByte(); int cFRTID = new CFRTID[cCFRTID]; for(int i = 0; i < cCFRTID; i++) { rgCFRTID = new CFRTID[i][i]]; } }
public ThreeWayMerger newMerger(Repository db) { return new OneSide(db, treeIndex); }
public CreateDataSourceFromRedshiftResult createDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest request) { request = beforeClientExecution(request); return executeCreateDataSourceFromRedshift(request); }
public void clearDFA() { for(int d = 0; d < decisionToDFA.length; d++) { decisionToDFA[d] = new DFA(atn.getDecisionState(d), d); } }
public void removeName(Name name) { int index = getNameIndex((HSSFName) name); removeName(index); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[RightMargin]\n"); buffer.append("   .margin               = ").append(" (").append(getMargin()).append(" )\n"); buffer.append("[/RightMargin]\n"); return buffer.toString(); }
public RefreshAllRecord clone() { return copy(); }
public StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig) { super(queryConfig); add(new WildcardQueryNodeProcessor()); add(new FuzzyQueryNodeProcessor()); add(new MatchAllDocsQueryNodeProcessor()); add(new MatchAllDocsQueryNodeProcessor()); add(new MatchAllDocsQueryNodeProcessor()); add(new TermRangeQueryNodeProcessor()); add(new TermRangeQueryNodeProcessor()); add(new TermRangeQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new BooleanQueryNodeProcessor()); add(new MultiChildOptimizationQueryNodeProcessor()); add(new MultiChildOptimizationQueryNodeProcessor()); add(new MultiTermProcessor()); add(new MultiTermProcessor()); add(new MultiTermProcessor()); add(new MultiTermProcessor()); add(new MultiTermProcessor()); add(new MultiTermProcessor()); }
public String formatAsString(String sheetName, boolean useAbsoluteAddress) { StringBuilder sb = new StringBuilder(); if(sheetName!= null) { sb.append(SheetNameFormatter.format(sheetName)); sb.append("!"); } CellReference cellRefFrom = new CellReference(getFirstRow(), getFirstColumn(),useAbsoluteAddress, useAbsoluteAddress, useAbsoluteAddress); CellReference cellRefTo = new CellReference(getLastColumn(),useAbsoluteAddress,useAbsoluteAddress,useAbsoluteAddress); if(!cellRefFrom.equals(cellRefToAbsoluteAddress)) { sb.append(':'); } return sb.toString(); }
public ByteBuffer put(int index, byte value) { throw new ReadOnlyBufferException(); }
public void mode(int m) { _mode = m; }
public ShortBuffer slice() { return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position); }
public void set(int index, long n) { if(count < index)throw new ArrayIndexOutOfBoundsException(index); else if(count == index)add(n); elseentries[index] = n; }
public ByteBuffer putFloat(float value) { throw new ReadOnlyBufferException(); }
public static double max(double[] values) { double max = Double.NegATIVE_INFINITY; for(double value : values) { max = Math.max(max, value); } return max; }
public UpdateRepoWebhookRequest() { super("cr", "2016-06-07", "UpdateRepoWebhook", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]"); setMethod(MethodType.POST); }
public DeleteAttributesRequest(String domainName, String itemName, java.util.List<Attribute> attributes, UpdateCondition expected) { setDomainName(domainName); setItemName(itemName); setAttributes(attributes); setExpected(expected); }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append("[SXPI]\n"); for(int i = 0; i < _fieldInfos.length; i++) { sb.append("   i.append(i).append("]="); _fieldInfos[i].append("]="); } sb.append("[/SXPI]\n"); return sb.toString(); }
public boolean isSuccessful() { if(mergeResult!= null) { return mergeResult.getMergeStatus().isSuccess(); } else if(rebaseResult!= null) { return rebaseResult.getStatus().isSuccess(); } return true; }
public void setBytesValue(byte[] value) { setBytesValue(new BytesRef(value)); }
public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeConnections(request); }
public DeletePhotosRequest() { super("CloudPhoto", "2017-07-11", "DeletePhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public void add(E object) { add(size(), object); subList.sizeChanged(true); end++; }
public static ByteBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteHeapByteBuffer(capacity); }
public SrndQuery getSubQuery(int qn) { return queries[qn]; }
public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) { if(numPayloadsSeen == 0) { return currentPayloadScore; } else { return Math.min(currentPayloadScore, currentScore); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BLANK]\n"); buffer.append("      = ").append(HexDump.shortToHex(getRow())).append("\n"); buffer.append("col     = ").append(HexDump.shortToHex(getColumn())).append("\n"); buffer.append("xf      = ").append(HexDump.shortToHex(getXFIndex())).append("\n"); buffer.append("[/BLANK]\n"); return buffer.toString(); }
public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) { request = beforeClientExecution(request); return executeDescribeLogPattern(request); }
public RegisterTransitGatewayMulticastGroupMembersResult registerTransitGatewayMulticastGroupMembers(RegisterTransitGatewayMulticastGroupMembersRequest request) { request = beforeClientExecution(request); return executeRegisterTransitGatewayMulticastGroupMembers(request); }
public GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest request) { request = beforeClientExecution(request); return executeGetPhoneNumberSettings(request); }
public ObjectId getData() { return data; }
public boolean isDirect() { return false; }
public DeleteServerCertificateRequest(String serverCertificateName) { setServerCertificateName(serverCertificateName); }
public StringBuffer append(int i) { IntegralToString.appendInt(this, i); return this; }
public GetEvaluationResult getEvaluation(GetEvaluationRequest request) { request = beforeClientExecution(request); return executeGetEvaluation(request); }
public LinkedDataRecord getDataName() { return dataName; }
public boolean find(int start) { findPos = start; if(findPos < regionStart) { findPos = regionStart; } else if(findPos >= regionStart) { matchFound = false; return false; } matchFound = findImpl(address, input, findPos, matchOffsets); if(matchFound) { findPos = matchOffsets[1]; } return matchFound; }
public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) { request = beforeClientExecution(request); return executeGetLifecyclePolicyPreview(request); }
public SinglePositionTokenStream(CharTermAttribute word) { termAtt = new SinglePosition(CharTermAttribute.class); this.word = word; returned = true; }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_print_gridlines); }
public String toString() { StringBuilder s = new StringBuilder(); s.append(Constants.typeString(getType())); s.append(' '); s.append(name()); s.append(' '); s.append(commitTime); s.append(' '); appendCoreFlags(s); return s.toString(); }
public LsRemoteCommand setRemote(String remote) { checkCallable(); this.remote = remote; return this; }
public void collapseRow(int rowNumber) { int startRow = findStartOfRowOutlineGroup(rowNumber); RowRecord rowRecord = getRow(startRow); int lastRow = writeHidden(rowRecord, startRow, true); if(getRow(lastRow+1)!= null) { getRow(lastRow + 1); } else { RowRecord row = createRow(lastRow + 1); row.setColapsed(true); insertRow(true); } }
public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) { request = beforeClientExecution(request); return executeAssociateSkillGroupWithRoom(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SERIESLIST]\n"); buffer.append("   .seriesNumbers        = ").append(" (").append(getSeriesNumbers()).append(" )"); buffer.append(System.getProperty("line.separator")); buffer.append("[/SERIESLIST]\n"); return buffer.toString(); }
public QueryConfigHandler getQueryConfigHandler() { return this.queryConfig; }
public String getClassArg() { if(null!= originalArgs) { final String className = originalArgs[CLASS_NAME]; if(null!= className) { return className; } } return getClass().getName(); }
