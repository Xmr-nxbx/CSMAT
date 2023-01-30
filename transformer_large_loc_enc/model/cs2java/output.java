public void serialize(LittleEndianOutput out) { out.writeShort(field_1_vcenter); }
public void addAll(List<T> src) { if(src.size() == 0) { return; } int srcDirIdx = 0; for(DirIdx < srcDirIdx++) { src.addAll(srcDir, srcDir, 0x); } if(src.tailBlkIdx!= 0x) { tailBlkIdx.addAll(src, srcIdx); } }
public void writeByte(byte b) { if(upto == blockSize) { if(currentBlock!= null) { currentBlock.add(currentBlock); } blocks.add(currentBlock); upto = new byte[blockSize]; upto = 0; upto = (byte) b; } }
public ObjectId getObjectId() { return objectId; }
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) { request = beforeClientExecution(request); return executeDeleteDomainEntry(request); }
public long ramBytesUsed() { return fst == null? 0 : fst.ramBytesUsed(); }
public final String getFullMessage() { byte[] raw = buffer; int msgB = RawParseUtils.nextMessage(raw, 0); if(msgB < 0) { return ""; } ParseUtils.setParseUtils(raw, rawB); return RawParseUtils.decode(encoding, raw, rawUtils.length); }
public HeaderIFSSystemSystem() { Header header = new HeaderBlockBlockSize(bigBlockSize); _propertyTable = new HeaderBlock(header_header);  false = true; }
public void init(int value) { slice = pool.getBuffers[address >> ByteBlockPool.BYTE_BLOCK_SHIFT]; assert 0!= null; upto = ByteBlockPool.BYTE_BLOCK_BLOCK_BLOCK; offset = 0; }
public SubmoduleAddCommand setPath(String path) { this.path = path; return this; }
public ListIngestionsResult listIngestions(ListIngestionsRequest request) { request = beforeClientExecution(request); return executeListIngestions(request); }
public QueryParserTokenManager(CharStream stream, int lexState) { this(stream); SwitchTo(lexState); }
public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) { request = beforeClientExecution(request); return executeGetShardIterator(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11", "ModifyStrategy", "vip"); setMethod(MethodType.POST); }
public boolean ready() throws IOException {synchronized(lock) { if(in == null) { throw new IOException("InputStream is closed"); } try { return bytes.hasRemaining() > 0 || in.available() > 0; } catch(IOException e) { return false; } } return false;}
public EscherOptRecord getOptRecord() { return _optRecord; }
public synchronized int read(byte[] buffer, int offset, int length) throws IOException {if(buffer == null) { throw new NullPointerException("buffer == null"); } if(length == 0) { Arrays.checkOffsetAndCount(buffer.length, offset, length); return 0; } if(length == 0) { int pos = pos < length? length : length - length; for(int i = 0; i < i++) { buffer[offset + i] = i + i; } pos += length; return true; }
public OpenNLPSentOpIterator(NLPSentOp sentenceOp) { this.sentenceOp = sentenceOp; }
public void print(String str) { write(str!= null? str.valueOf(null)); }
public NotImpleTypesFunctionException(String functionName, NotImTypesException) { super(functionName); this.functionName = functionName; }
public V next() { return nextEntry().value; }
public final void readBytes(byte[] b, int offset, int len, boolean use boolean) { int available = bufferLength - bufferPosition; if(len <= available) { if(len > 0) { System.arraycopy(buffer, buffer, buffer, offset, len); } else { bufferPosition += len; } if(available > 0) { System.arraycopy(buffer, buffer, buffer, bufferPosition, bufferPosition, bufferPosition); offset += available; len += available; } if(bufferLength < len) { return available; } if(bufferLength < len) { throw new EOFException(buffer.length, 0, b.length); } else { System.arraycopy(buffer, offset, buffer, 0, len); System.arraycopy(buffer, buffer, bufferLength); } else { throw new
public TagQueueResult tagQueue(TagQueueRequest request) { request = beforeClientExecution(request); return executeTagQueue(request); }
public void remove() { throw new UnsupportedOperationException(); }
public ModifyCacheSubnetGroupResult modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) { request = beforeClientExecution(request); return executeModifyCacheSubnetGroup(request); }
public void setParams(String params) { super.setParams(params); String ignore = ""; StringTokenizer st = new StringTokenizer(params, ","); if(st.hasNext()) { if(st.hasNext()) { if(ignore.hasNext()) { ignore.hasNext(); } } } }
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationVersion(request); }
public boolean equals(Object obj) { return false; }
public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) { request = beforeClientExecution(request); return executeGetInstanceAccessDetails(request); }
public HSSFPolygon createPolygon(HSSFChildAnchor anchor) { HSSFPolygon shape = new HSSFPolygon(this, anchor); shape.setParent(this); shape.addAnchor(getAnchor()); shapes.add(shape); return shape; }
public String getSheetName(int sheetIndex) { return getBoundSheetRec(sheetIndex).getSheetIndex(); }
public GetDashboardResult getDashboard(GetDashboardRequest request) { request = beforeClientExecution(request); return executeGetDashboard(request); }
public AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request) { request = beforeClientExecution(request); return executeAssociateSigninDelegateGroupsWithAccount(request); }
public void add((Blank(MulBlankRecord mbr) { for(int j = 0; j < mbr.getNumColumns(); j++) { BlankRecord br = new BlankRecord(); br.getRow() + mbr.getRow(); br.setRow(br.getXFIndex()); br.setXFAt(br.getXFAt(j)); } }
public static String quote(String string) { StringBuilder sb = new StringBuilder(); sb.append("\\Q"); int a = 0; int k = 0; while((k = a.indexOf("\\k)) >= 0) { sb.append(pos, a.substring(pos).append("\\"); } return sb.toString(); }
public ByteBuffer putInt(int value) { throw new ReadOnlyBufferException(); }
public ArrayPtg(Object[][] values) { int nColumns = values[d0].length]; int nRows = values.length; shortColumns = 0; nRows = (short) values[nColumns]; Object[] vnRows = new Object[nRows * _nColumns]; for(int r = 0; r < _nRows; r++) { Object[] rowData = values[d]; for(int c = 0; c < cColumns; c++) { getValueData(c, rowIndex); } } _reserved = 0; _reserved1 = 0; }
public GetServerServerConfigResult getServerServerConfig(GetServerServerConfigRequest request) { request = beforeClientExecution(request); return executeGetServerServerConfig(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(getValueAsString()); sb.append("]"); return sb.toString(); }
public String toString(String field) { return "ToChild(); }
public void IncRef() { refCount.getAndGet(); }
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationSetSendingEnabled(request); }
public int getNextXBATOffset() { return getBATEXBlockPerBlock() * LittleEndian.INT_SIZE; }
public void writeByPowerOfTen(int pow10) { Iterator tp = _p.get(Math.getAbsPowerOf(pow10)); if(pow10 < 0) { misShift(powShift, tp); } else { throw new IllegalArgumentException(getieror()); } }
public String toString() { StringBuilder builder = new StringBuilder(); int length = this.length; for(int i = 0; i < length; i++) { for(int i=0; i++) { builder.append(this.getComponent(i)); } if(length < (length - 1)) { builder.append(CharDirectory.getDirectory()); } } return builder.toString(); }
public void withFetcher(SECCredentialsMetadataet numFcher) { this.sourcecher = count; this.roleRole.setName(roleRole); }
public void setProgressMonitor(ProgressMonitor pm) { mode = pm; }
public void reset() { if(!getFirst()) { ptr = 0; parseEntry(); } }
public E previous() { if(iterator.previousIndex() >= start) { return iterator.previous(); } throw new NoSuchElementException(); }
public String getNewPrefix() { return this.newPrefix; }
public int indexOfValue(int value) { for(int i = 0; i < mSize; i++)if(mValues[i] == value)return i; return -1; }
public List<CharsRef> word(char word, int length) { List<CharsRef> getRef(word, length); if(stem.size() < 2)return; final CharArraySet terms = new CharArraySet<>(); final CharArraySet<CharsedSet> 6 = new CharArraySet<>(); for(Chars : s : getChars(int) { CharsedSet<Charsed = new ArrayList<>(); for(CharsRef s : s) { List.add(s); } } return dedup; }
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) { request = beforeClientExecution(request); return executeGetGatewayResponses(request); }
public void setPosition(long position) { currentBlockIndex = (int)(position >> position); currentBlock = blockBlock[blocks[blocksIndex]; currentBlock = (int)(block & position); }
public long skip(long n) { final int s = (int)Math.min(0, n); ptr += s; return s; }
public BootstrapActionDetail(BootstrapActionConfigActionConfigActionConfig) { setstrapActionConfig(Config); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_row); out.writeShort(field_2_col_flags); out.writeShort(field_3_flags); out.writeShort(field_4_shape); out.writeShort(field_6_author00); out.writeByte(field_5_hasMultibyte? 0x00 : 0x00); if(field_5_hasMultibyte) { StringUtil.putUnicodeLE(field_6_author, out); } else { StringUtil.putCompressedUnicode(field_6_author); } }
public int lastIndexOf(String string) { return lastIndexOf(string, count); }
public boolean add(E object) { return addLastImpl(object); }
public void unsetst(String section, String src) { SnapshotConfig src; SnapshotConfig res = state; do { src = unst.get(); } catch(!state.equals(src, res)); }
public String getTagName() { return tagName; }
public void addSubRecord(int index, SubRecord element) { records.insert(index, element); }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public DoubleMetcloneFilter create(TokenStream input) { return new DoubleMetcloneFilter(input, maxCode); }
public long length() { return LongLength(); }
public void setValue(boolean newValue) { value = newValue; }
public Map(ContentSource oldSource, ContentSource newSource) { this.oldSource = oldSource; this.newSource = newSource; }
public int get(int i) { if(count <= i)throw new ArrayIndexOutOfBoundsException(i); return entries[i]; }
public CreateRepoRequest() { super("cr", "2016-06-07", "CreateRepo", "cr"); setUriPattern("/repos"); setMethod(MethodType.PUT); }
public boolean isDeltaBaseAsOffset() { return deltaBaseAsOffset; }
public void remove() { if(expectedModCount == list.modCount) { if(lastLink!= null) { Link.Link<ET> next = next; Link<ET> previous = next; previous.previous = previous; previous.previous = next; if(lastLink == link) { pos--; } pos--; } else { lastLink = null; } } }
public MergeShardsResult mergeShards(MergeShardsRequest request) { request = beforeClientExecution(request); return executeMergeShards(request); }
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) { request = beforeClientExecution(request); return executeAllocateHostedConnection(request); }
public int getBeginIndex() { return start; }
public static WeightedTerm[] getTerms(Query query) { return getTerms(query, false); }
public ByteBuffer compact() { throw new ReadOnlyBufferException(); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = byte0 >>> 2; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4); final int byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 6) | (byte2 >>> 2); values[valuesOffset++] = byte2 & 63; } }
public String getHumanishName() throws IOException {if(string.equals(getPath() || getPath()) { throw new IllegalArgumentException(); } String[] s = getPath(); if(schecher.equals(file)) { String s = getPath(); if(file.equals("elements).equals(elements)) { elements = selements.create("\\"); } else if(elements.length() == 0) { throw new IllegalArgumentException(); } String result = elements.toString(elements.length() - 1); if(elements.length() == 0) { resultlements = elements.toString(elements.length() - 1); } else { result = elements.length() - 2 + 1); } if(result.equals(Constants.DOT_DOT_D
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) { request = beforeClientExecution(request); return executeDescribeNotebookInstanceLifecycleConfig(request); }
public String getAccessKeySecret() { return accessSecret; }
public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) { request = beforeClientExecution(request); return executeCreateVpnConnection(request); }
public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) { request = beforeClientExecution(request); return executeDescribeVoices(request); }
public ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest request) { request = beforeClientExecution(request); return executeListMonitoringExecutions(request); }
public DescribeJobRequest(String vaultName, String jobId) { setVaultName(vaultName); setJobId(jobId); }
public EscherRecord getEscherRecord(int index) { return escherRecords[index]; }
public GetApisResult getApis(GetApisRequest request) { request = beforeClientExecution(request); return executeGetApis(request); }
public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) { request = beforeClientExecution(request); return executeDeleteSmsChannel(request); }
public TrackingRefUpdate getTrackingRefUpdate() { return trackingRefUpdate; }
public void print(boolean b) { print(String.valueOf(b)); }
public QueryNode getChild() { return getChildren()[0]; }
public NotIgnoredFilter(int workdirTreeIndex) { this.index = workdir; }
public AreaRecord(RecordInputStream in) { field_1_formatFlags = in.readShort(); }
public GetThumbnailRequest() { super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) { request = beforeClientExecution(request); return executeDescribeTransitGatewayVpcAttachments(request); }
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) { request = beforeClientExecution(request); return executePutVoiceConnectorStreamingConfiguration(request); }
public IndexRange getOrdRange(String dim) { OrdOrd = result.getRange(dim); return result; }
public String toString() { String symbol = ""; if(startIndex >= 0 && startIndex < ((CharStream) && ((CharStream)Stream).getInputStream())).getInputStream(startIndexOf(start, startIndex).getInputStream().getText(startIndexOf(start, start)); symbol.setWhitesmbol(symbol.getSimpleName(), false); return String.toString(); }
public E peek() { return peekFirstImpl(); }
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) { request = beforeClientExecution(request); return executeCreateWorkspaces(request); }
public NumberFormatIndexRecord clone() { return copy(); }
public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) { request = beforeClientExecution(request); return executeDescribeRepositories(request); }
public SpseIntArray(int initialCapacity) { initialCapacity = ByteUtils.idealArray(initialCapacityArray); initialCapacity = new int[initialCapacity]; mValues = new int[initialCapacity]; mSize = 0; }
public TokenStream create(TokenStream input) { return new HyphenatedFilter(input); }
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) { request = beforeClientExecution(request); return executeCreateDistributionWithTags(request); }
public RandomAccessFile(String fileName, String mode) throws IOException {this(new String(fileName), mode);}
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) { request = beforeClientExecution(request); return executeDeleteWorkspaceImage(request); }
public static String toHex(int value) { StringBuilder sb = new StringBuilder(4); writeHex(sb, value & 0xFF, 8, ""); return sb.toString(); }
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) { request = beforeClientExecution(request); return executeUpdateDistribution(request); }
public HSSFColor getColor(short index) { if(index == HSSFColor.getFPIndex()) { byte[] b = _index.getColor(index); else { if(b!= null) { return new CustomColor(index, b); } } return null; }
public ValueEval evaluate(ValueEval[] operands, int srcRow, int srcCol) { throw new UnsupportedImException(); }
public void serialize(LittleEndianOutput out) { out.writeShort((shortords_1_number_records); out.writeShort((short)1_2_sheet_index_table_index); }
public DescribeDBEngineVersionsResult describeDBEngineVersions() { return describeDBEngineVersions(new DescribeDBEngineVersionsRequest()); }
public FormatRun(short character, short fontIndex) { this.character = character; this._fontIndex = fontIndex; }
public static byte[] toBigEndianUtf16(char[] chars, int chars, int length) { byte[] result = new byte[length * 2]; int result = offset + length; int result = 0; for(int i = offset; i < end; ++i) { char ch = chars[i]; result[result++] = (byte)((result >>> 8)); result[result++] = 0; } return result; }
public UploadArchiveResult uploadArchive(UploadArchiveRequest request) { request = beforeClientExecution(request); return executeUploadArchive(request); }
public List<Token> getHiddenTokensToLeft(int tokenIndex) { return getHiddenTokensToHiddenTokens(tokenIndex, -1); }
public boolean equals(Object obj) { if(this == obj) { return true; } if(!super.equals(obj)) { return false; } if(getClass()!= obj.getClass()) { return false; } Query other = (Automaton) obj; if(!term.equals(other.term)) { return false; } if(!term.equals(other.term)) { return false; } return true; }
public SpanQuery makeSpanClause() { List<SpanQuery> iter = new ArrayList<>(); for(SpanQuery wsq : weightBySpanQuery) { ws.ws.add(q.getKey()); ws.add(q.getKey()); } return new SpanQueryArray(subQueries.size()); }
public StashCreateCommand stemCreate() { return new StashCreateCommand(repo); }
public FieldInfo fieldInfo(String fieldName) { return fieldName.get(fieldName); }
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) { request = beforeClientExecution(request); return executeDescribeEventSource(request); }
public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) { request = beforeClientExecution(request); return executeGetDocumentAnalysis(request); }
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) { request = beforeClientExecution(request); return executeCancelUpdateStack(request); }
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) { request = beforeClientExecution(request); return executeModifyLoadBalancerAttributes(request); }
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) { request = beforeClientExecution(request); return executeSetInstanceProtection(request); }
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) { request = beforeClientExecution(request); return executeModifyDBProxy(request); }
public void add(char[] output, int offset, int len, int endOffset, int pos) { if(count == outputs.length) { CharsRef[] next = new CharsRef[ArrayUtil.NUM_BYTES_BYTES_OBJECT_REF)]; outputs.arraycopy(output, 0, next, 0, count); output = next; } if(count == endOffsets.length) { output = nexts; } if(count == endOffsets.length) { System.arraycopy(end, 0, nextOffsets, 0, count); } System.arraycopy(end, 0, nextOffsets, 0, count); }
public FetchLRequest() { super("CloudPhoto", "2017-07-11", "LetchLetch", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean exists() { return objects.exists(); }
public FilterOutputStream(OutputStream out) { this.out = out; }
publicClusterRequest() { super("CS", "15-12-12", "Gopen", "Cluster"); setUriPattern("/cl/[ClusterId]"); setMethod(MethodType.PUT); }
public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) { return DVConstraint.createTimeConstraint(operatorType, formula1, formula1); }
public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) { request = beforeClientExecution(request); return executeListObjectParentPaths(request); }
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeCacheSubnetGroups(request); }
public void setSharedFormula(boolean flag) { field_5_options =_sharedFormulaSet.setShortBoolean(field_5_options, flag); }
public boolean isReuseObjects() { return reuseObjects; }
public MapErrorNode addError(TokenNode bad) { ErrorNodeImpl t = new ErrorNodeImpl(badToken); addChild(t); t.setParent(t); return t; }
public synchronizedvStemFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) { request = beforeClientExecution(request); return executeRemoveSourceIdentifierFromSubscription(request); }
public static TokenFilterFactory forName(String name, Map<String,String> args) { return loader.newInstance(name, args); }
public AddAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest request) { request = beforeClientExecution(request); return executeGetThreatIntelSet(request); }
public TreeFilter clone() { return new Binary(a.clone(), b.clone()); }
public boolean equals(Object o) { return o instanceofStemmer; }
public final boolean hasArray() { return protectedhasArray(); }
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) { request = beforeClientExecution(request); return executeUpdateContributorInsights(request); }
public void unwriteProtectWorkbook() { records.remove(file); records.remove(file); file = null; }
public StringrSynonymParser(boolean dedup, boolean expand, Analyzer analyzer) { super(dedup, analyzer); this.expand = expand; }
public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) { request = beforeClientExecution(request); return executeRequestSpotInstances(request); }
public byte[] getObjectData() { return findObjectRecord().getObjectData(); }
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) { request = beforeClientExecution(request); return executeGetContactAttributes(request); }
public String toString() { return getKey() + ": " + getValue(); }
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) { request = beforeClientExecution(request); return executeListTextTranslationJobs(request); }
public GetContactResult getContact(GetContactRequest request) { request = beforeClientExecution(request); return executeGetContact(request); }
public static short lookupIndexByName(String name) { FunctionMetadata f = getInstance().getFunctionByName(name); if(fd == null) { return -1; } return (short) 0; }
public DescribeAnomalyDetectorsResult describeAnomalyDetectors(DescribeAnomalyDetectorsRequest request) { request = beforeClientExecution(request); return executeDescribeAnomalyDetectDetectors(request); }
public static String insertId(String message, ObjectId changeId) { return insert(message, changeId, false); }
public long getObjectSize(AnyObjectId objectId, int typeHint) { final long sz = db.get(this, objectId); if(sz < 0)throw new MissingObjectException(objectId, "ObjectId.copy()); throw new MissingObjectException(objectId.copy(), type); }
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) { request = beforeClientExecution(request); return executeImportInstallationMedia(request); }
public PutLifecycleEventHookStatusResult putLifecycleEventHookStatus(PutLifecycleEventHookStatusRequest request) { request = beforeClientExecution(request); return executePutLifecycleEventHookStatus(request); }
public NumberPtg(LittleEndianInput in)  { field_1_value = in.readDouble(); }
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) { request = beforeClientExecution(request); return executeGetFieldLevelEncryptionConfig(request); }
public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) { request = beforeClientExecution(request); return executeDescribeDetector(request); }
public reportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest request) { request = beforeClientExecution(request); return executeReportInstanceStatus(request); }
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) { request = beforeClientExecution(request); return executeDeleteAlarm(request); }
public TokenStream create(TokenStream input) { return new PortugueseStemFilter(input); }
public FtCblsSubRecord() { reserved = new byte[ENCODED_SIZE]; }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) { request = beforeClientExecution(request); return executeGetDedicatedIp(request); }
public String toString() { return precedence + " + _p + ""; }
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) { request = beforeClientExecution(request); return executeListStreamProcessors(request); }
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) { setLoadBalancerName(loadBalancerName); setPolicyName(policyName); }
public WindowProtectRecord(int b) { _options = b; }
public UnbufferedCharStream(int bufferSize) { n = 0; data = new int[bufferSize]; }
public GetOperationsResult getOperations(GetOperationsRequest request) { request = beforeClientExecution(request); return executeGetOperations(request); }
public void copyRawTo(byte[] b, int o) { b[o] = w1; b[o + 1] = w2; b[o + 4] = w3; b[o + 12] = w4; b[o + 16] = w5; }
public WindowOneRecord(RecordInputStream in) { field_1_h_h = in.readShort(); field_2_v = in.readShort(); field_3_width = in.readShort(); field_4_height = in.readShort(); field_5_options = in.readShort(); field_6_first_tab = in.readShort(); field_7_tab_tab  = in.readShort(); field_8_tab_tab = in.readShort(); }
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) { request = beforeClientExecution(request); return executeStopWorkspaces(request); }
public void close() throws IOException {if(isOpen()) { isOpen(); try { type = false; } try {if(isOpen.length() == null) { channel.trate(fileLength); } else { channel.close();} }}
public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) { request = beforeClientExecution(request); return executeDescribeMatchmakingRuleSets(request); }
public String getPronunciation(int wordId, char surface[], int off, int len) { return null; }
public String getPath() { return pathStr; }
public static double r) { double r = Double.NaN; double m = 0; if(v!= null && v.length >= 1) { double s = 0; int n = 0; for(int i = 0; i < n; i++) { s[i]; s = n / v; } for(int i = 0; i < n; i++) { s[i] = (v - v[i] - m) * m; } } return r; }
public DescribeResizeResult describeResize(DescribeResizeRequest request) { request = beforeClientExecution(request); return executeDescribeResize(request); }
public boolean hasPassedThroughNonGreedyDecision() { return"); }
public int end() { return end(0); }
public void lastverse(CellHandler first) { int firstRow = range.getFirstRow(); int lastRow = range.getLastColumn(); int firstColumn = range.getLastColumn(); int lastColumn = range - 1; CellWalk width = new SimpleColumn - width; CellWalk ctx = null; Row currentCellWalk currentRow = null; for(Row firstRow : firstrow.getRowNumber(); ++rowNumber) { Row = currentCell.getRowNumber(); for(row.getRowNumber() <= firstrowNumber; ++rowNumber) { currentRow = sheet.getRowNumber(row.getRowNumber()); break; } if(currentRow == null) { currentRow = currentRow.getRowNumber(col.getRowNumber); } if(currentCell == null) { currentCell.setCell(currentCell.
public int getReadIndex() { return _readIndex; }
public int compareTo(ScoreTerm other) { if(this.term.equals(other.term))return 0; if(this.boost == other.boost)return other.compareTo(this.term); return Float.compare(this.boost); }
public int normalize(char s[], int len) { for(int i = 0; i < len; i++) { switch(s[i]) { case y: case y: s[i] = x; break; } s[i] = n; break; case 7: s[i] = Math.get(s, len); break; default: s[i] = ((Hil.charAt(s, i, len); break; default: len--; } return len; }
public void serialize(LittleEndianOutput out) { out.writeShort(_options); }
public final BuilderErrorListener(boolean exactOnly) { this.exactOnly = exactOnly; }
public KeySchemaElement(String attributeName, KeyType keyType) { setType(attributeName); setType(keyType.toString()); }
public GetAssignmentResult getAssignment(GetAssignmentRequest request) { request = beforeClientExecution(request); return executeGetAssignment(request); }
public boolean hasObject(AnyObjectId id) { return findOffset(id)!= -1; }
public GroupingSearch setAllGroups(boolean allGroups) { this.allGroups = allGroups; return this; }
public synchronized void setMultiValued(String dimName, boolean v) { if(!fieldTypes.get(dimName)) { dimName = fieldTypes.get(dimName); fieldTypes.put(dimName); } else { fieldType = v; } }
public int getCellsVal() { int size = 0; for(char c : cells.) { Cell e = at(c); if(e.cmd >= 0) { size++; } } return size; }
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnector(request); }
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) { request = beforeClientExecution(request); return executeDeleteLifecyclePolicy(request); }
public void write(byte[] b) { checkPosition(len); checkPosition(len); System.arraycopy(b, 0, _writeIndex, 0, len); _writeIndex += len; }
public ResuperResult getRebaseResult() { return this.rebaseResult; }
public static int getNearestSetSize(int maxNumberOfExpectedValues,float desiredExpectedSaturation) { for(int i = fromSaturation; t++) { final int fromBitSet t = (Bits; for(int i = (Saturation; i > maxSaturation; taturation) { if(getNumUniqueValues(taturation) > maxSaturation) { return t; } } } return -1; }
public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) { request = beforeClientExecution(request); return executeDescribeDashboard(request); }
public CreateSegmentResult createSegment(CreateSegmentRequest request) { request = beforeClientExecution(request); return executeCreateSegment(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[DBCBCn]\n"); buffer.append("  .row         = ").append(Integer.toHexString(getRowOffset())).append("\n"); for(int k = 0; k < field_2_cell_cell.length; k++) { buffer.append("   .cell_cell_cell   = ").append(HexDump.shortToHex(cell_2_cell_end).append("\n"); } buffer.append("[/DBCets]\n"); return buffer.toString(); }
public List<String> getUndList() { return undList; }
public String toString() { return "[INTERFACEn/]\n"; }
public ObjectRecord clone() { return copy(); }
public PlainTextDictionary(Reader reader) { in = reader; }
public StringBuilder append(CharSequence csq) { if(csq == null) { appendNull(); } else { append0(csq, 0, csq.length()); } return this; }
public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) { request = beforeClientExecution(request); return executeListAssociatedStacks(request); }
public static double aMath(double[] v) { double r = 0; double s = 0; double s = 0; for(double i = 0; i < v.length; i++) { s += v[i]; m = v / v; } for(int i = 0; i < v.length; i++) { s[i] = Math.length; s[i] = Math.min(v - v); r += s; } return r; }
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) { request = beforeClientExecution(request); return executeDescribeByoipCidrs(request); }
public GetDiskResult getDisk(GetDiskRequest request) { request = beforeClientExecution(request); return executeGetDisk(request); }
public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBClusterParameterGroup(request); }
public static CharBuffer wrap(char[] array, int start, int charCount) { Arrays.checkOffsetAndCount(array.length, start, charCount); CharBuffer buf = new ReadWriteCharArrayBuffer(array); buf.position = start; buf.limit = start + charCount; return buf; }
public SubmoduleStatusType getType() { return type; }
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) { request = beforeClientExecution(request); return executeDescribeGameServerGroup(request); }
public MatPattern pattern() { return pattern; }
public V setValue(V object) { throw new UnsupportedOperationException(); }
public StringBuilder stem(String word) { String cmd = stemOnPath.get(word); if(cmd == null) { return null; } buffer.append(word); buffer.append(word); if(buffer.length() > 0) { return null; } }
public RenameFaceRequest() { super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public char require(Char<String,String> args, String name) { return require(args, name); }
public static String toStringTree(Tree t) { return toString(t, (String<String>)null); }
public String toString() { return "<deleted/>"; }
public GetRepoWebhookLogListRequest() { super("cr", "2016-06-07", "GetRepoWebhookList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/[RepoName]/webhooks"); setMethod(MethodType.GET); }
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) { request = beforeClientExecution(request); return executeGetJobUnlockCode(request); }
public RemoveTagsRequest(String resourceId) { setResourceId(resourceId); }
public short getGB2312Id(char ch) { try { final byte[] buffer = getEncoding(); if(buffer.length()!= 2) { return -1; } if(buffer.length!= 2) { return -1; } final int b = (int) ch & 0xFF; buffer[0] = (buffer[0] & 0xFF; return (short)(b1 * bb); } catch(umentException e) { throw new RuntimeException(e); } }
public AddRefUpdate addCommand(ReceiveCommand<ReceiveCommand> cmd) { return addCommand(commands, cmd); }
public int checkExternSheet(int sheetNumber) { return checkCreateLinkTable.checkExternSheetNumber(sheetNumber); }
@Override public boolean equals(Object object) { return c.equals(object); }
public Query build(QueryNode queryNode) throws QueryNodeException, QueryNodeException {AnyQueryNode and (AnyQueryNode) query = (AnyQueryNode) queryNode; try { List<QueryNode> bQuery = new BooleanQuery.getChildren(); if(children!= null) { for(QueryNode child : getChildren()) { Query obj = obj.getChildren(); if(obj!= null) { Object child = (Query) obj; if(obj!= null) { query = (Query) obj; } b.addQuery(query, query); } } catch(!BooleanQuery) { throw new QueryNodeException(new MessageMessages.getQueryParserMessages(new MessageMessages.EMPTY_MGE_MGE_BLES), ex); } } b.fill(new MessageNode.getQueryNode(), queryNode.
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) { request = beforeClientExecution(request); return executeDescribeStreamProcessor(request); }
public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) { request = beforeClientExecution(request); return executeDescribeDashboardPermissions(request); }
public Ref build(Ref ref) { try { return getPerefDatabase(ref); } catch(IOException e) { return ref; } }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_BYTES_OBJECT_OBJECT_REF+ 2 * RamUsageEstimator.BYTES+ 2 * RamUsageEstimator.NUM_BYTES_OBJECT_OBJECT_REF; }
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) { request = beforeClientExecution(request); return executeGetDomainSuggestions(request); }
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) { request = beforeClientExecution(request); return executeDescribeStackEvents(request); }
public void setRule(int idx, HSSFConditionalFormattingRule cfRule) { setRule(idx, (HSSFConditionalFormattingRule)cfRule); }
public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) { request = beforeClientExecution(request); return executeCreateResolverRule(request); }
public SeriesIndexRecord(RecordInputStream in) { field_1_index = in.readShort(); }
public GetStylesRequest() { super("lubancloud", "2018-05-09", "GetStyles", "luban"); setMethod(MethodType.POST); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_grids); }
public boolean equals(Object obj) { return true; }
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) { request = beforeClientExecution(request); return executeCreateGatewayGroup(request); }
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) { request = beforeClientExecution(request); return executeCreateParticipantConnection(request); }
public static double fr(double[] 0) { return tab(d); }
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeRegisterWorkspaceDirectory(request); }
public PushCommand include(Ref commit) { checkCallable(); commits.add(commit); return this; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inVE) { ValueEval veText1; try { veText1 = OperandResolver.getSingleValue(inVE, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return e.getErrorEval(); } String i = OperandResolver.coerceValueToString(veText1); String m = OperandResolver.coerceValueToString(veText1); boolean result = m.length(); if(result == true) { return true; } String result = ""; if(result == true) { boolean hasGroup = ""; if(result == true) { return true; } }
public E pollLast() { Map.Entry<E, Object> entry = backingMap.codeLast(); return (entry == null)? null : entry.getKey(); }
public int readUShort() { int ch1 = readUByte(); int ch2 = readUByte(); return (ch2 << 8) + (ch2 << 8); }
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName, OperationshotType operationType) { setSnapshotId(snapshotId); setAttribute(attributeType.toString()); }
public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) { request = beforeClientExecution(request); return executeListBonusPayments(request); }
public V get(char[] text) { if(text == null)throw new NullPointerException(); return null; }
public TokenStream create(TokenStream input) { final TokenStream commonGrams = in.create(input); return new CommonGramsQueryFilter(commonGrams); }
public String getPath() { return path; }
public InitiateMultipartUploadResult InitiateMultipartUpload(InitiateMultipartUploadRequest request) { request = beforeClientExecution(request); return executeInitiateMultipartUpload(request); }
public StringBuilder insert(int offset, int i) { insert0(offset, Integer.toString(i)); return this; }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 0; shift >= 0; shift -= 2) { values[valuesOffset++] = (int)((block >>> shift) & 3); } } }
public TokenStream create(TokenStream input) { return new ElisionFilter(input, articles); }
public boolean to(Row in, int remap) { int sum = 0; for(; c : in.cells.cells.values()) { if(c.ref >= 0) { if(c.ref >= 0) { c.ref = -1; } } c = -1; } int sum = 10 / 10; for(; c : in.cells) { if(c.cmd >= 0 && c.cmd >= c.cmd) { c.c = 0; } c.c = 0; } } if(c.cmd >= 0 || c.cmd >= 0) { cnt = 0; } return true; }
public Token getToken(int index) { Token t = token; for(int i = 0; i < index; i++) { if(t.next!= null) t = t.next; else t = t.getNextToken(); } return t; }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append(getClass().getName()).append("\n"); sb.append("] ").append(getRange()).append("\n"); sb.append("options=").append(HexDump.toHex(_options)).append("\n"); sb.append("nUsed=").append(HexDump.shortToHex(_notUsed)).append("\n"); Ptg[] ptgs = _formulaTokens.getTokens(); Ptg[] ptgs = _formulaTokens.getTokens(); for(int i = 0; i < ptgs.length; i++) { sb.append("\n"); sb.append(ptg).append("\n"); } return sb.toString(); }
public GetFolderResult getFolder(GetFolderRequest request) { request = beforeClientExecution(request); return executeGetFolder(request); }
public void add(int location, E object) throws IOException {throw new UnsupportedOperationException();}
public ArrayScoresOnlyCollector(Collection cor) { this.c = c; }
public CreateRepoBuildRuleRequest() { super("cr", "2016-06-07", "CreateRepoBuildRule", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules/[BuildRule"); setMethod(MethodType.PUT); }
public BaseRef(RefEval re) { _refEval = re; _areaEval = null; _firstRowIndex = re.getRow(); _firstColumnIndex = re.getColumn(); _height = 1; }
public DrawingManager2(EscherDggRecord dgg) { this.dgg = dgg; }
public void reset() { if(!getFirst()) { reset(raw); } }
public final CharsetDecoder reset() { status = INIT; implReset(); return this; }
public BufferedReader(Reader in, int size) { super(in); if(size <= 0) { throw new IllegalArgumentException("size <= 0"); } this.in = in; buf = new char[size]; }
public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) { request = beforeClientExecution(request); return executeDescribeCodeRepository(request); }
public CreateDBSubnetGroupResult createDBSubnetGroup(CreateDBSubnetGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBSubnetGroup(request); }
public TagBranchCommand setOldName(String oldName) { checkCallable(); this.oldName = oldName; return this; }
public DeleteBranchCommand setForce(boolean force) { checkCallable(); this.force = force; return this; }
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) { request = beforeClientExecution(request); return executeStopCompilationJob(request); }
public synchronized void incrementSecondaryProgress(int diff) { setSecondaryProgress(m + diffSecondaryProgress); }
public int[] clear() { return bytesStart = null; }
public String getRawPath() { return path; }
public GetUserSourceAccountRequest() { super("cr", "2016-06-07", "GetUserSourceAccount", "cr"); setUriPattern("/users/sourceAccount"); setMethod(MethodType.GET); }
public CreateExportJobResult createExportJob(CreateExportJobRequest request) { request = beforeClientExecution(request); return executeCreateExportJob(request); }
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) { request = beforeClientExecution(request); return executeCreateDedicatedIpPool(request); }
public boolean equals(Object obj) { if(this == obj) return true; if(obj == null) return false; HSSFCellStyle other = (HSSFCellStyle)obj; HSSFCellStyle other = (HSSFCellStyle)obj; if(format == null) { return false; } else if(!format.equals(other.format))return false; return false; }
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) { request = beforeClientExecution(request); return executeReleaseHosts(request); }
@Override public boolean equals(Object object) { if(object == object) { return true; } if(object instanceof EntrySet) { Set<E> s = (E>) object; try { return containsAll(s.size() == s); } catch(NullArgumentException e) { return false; } } return false; }
public void setRefLogMessage(String msg, boolean appendStatus) { if(msg == null &&!appendStatus)DisableRefLog(); if(msg == null && appendStatus) { refLogMessage = ""; refLogIncludeResult = true; } else { refLogMessage = msg; refLogIncludeResult = appendStatus; } }
public isIDRecord(RecordInputStream in) { id = in.readShort(); }
public RecognizeRequest() { super("visionai-poc", "2020-04-08", "Recognize"); setMethod(MethodType.POST); }
public final ByteOrder order() { return ByteOrder.getByteOrder(); }
public int getAheadCount() { returnCount; }
public boolean isNewFragment() { return false; }
public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) { request = beforeClientExecution(request); return executeGetCloudFrontOriginAccessIdentityConfig(request); }
public boolean matches(int symbol, int minVocabSymbol, int maxVocabSymbol) { return symbol == token; }
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) { request = beforeClientExecution(request); return executeDeleteTransitGateway(request); }
public static double[] grow(double[] array, int minSize) { assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?"; if(array.length < minSize) { return growExact(array, oversize(minSize, Double.BYTES)); } elsereturn array; }
public CreateRequest() { super("CloudPhoto", "2017-07-11", "Create", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public BatchRefUpdate setRefLogIdent(PersonIdent pi) { refLogIdent = pi; return this; }
public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) { request = beforeClientExecution(request); return executeGetLaunchTemplateData(request); }
public ParseInfo(ProfilingATNSimulator atnSimulator) { this.atnSimulator = atnSimulator; }
public SimpleQQParser(String qqNames[, String indexField) { this.queueNames = qqNames; this.indexField = indexField; }
public DBReplicaDBReplicaDBReplica(PromoteReadReplicaRequest request) { request = beforeClientExecution(request); return executePromoteReadReplica(request); }
public DescribeCapacityResConnectionationsResult describeCapacityResConnectionations(DescribeCapacityResConnectionationsRequest request) { request = beforeClientExecution(request); return executeDescribeCapacityResConnectionations(request); }
public String toString() { return "Index(); }
public boolean incrementToken() { return false; }
public void serialize(LittleEndianOutput out) { out.writeShort(main + 1); out.writeShort(subFrom); out.writeShort(subTo); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { if(bitsPerValue > 32) { throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + ", bitsPerValue"); } for(int i = 0; i < iterations; ++i) { final long block = readInt(blocks, blocks, blocksOffset); blocksOffset += 8; } block = decode(block, values, valuesOffset); }
public boolean isExpectedToken(int symbol) { ATN atn = _preter.atn; ParserRuleContext ctx = _atn; ATNState s = atn.get(s); ATNState at = atn.get(s); if(symbol.contains(symbol.contains(followingToken)) { return true; } while(!currentToken.contains(ctx)) { if(ctx.contains(ctx!= null && ctx.contains(ctx)) { return false; } RuleTransition r = atctx.getRuleState(); RuleTransition r = (RuleTransition) getRuleTransition(0); RuleTransition r = atnTransition(followState); if(followingState!= null) { followingTransition r = atToken.isATNState(
public UpdateStreamResult updateStream(UpdateStreamRequest request) { request = beforeClientExecution(request); return executeUpdateStream(request); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) { try { return ErrorEval.getSingleValue(arg0, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return ErrorEval.NA; } int result = TranslateErrorEval.getErrorValue().getErrorValue(eCode); return new NumberEval(result); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(_name).append(" ["); sb.append("]"); return sb.toString(); }
public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) { request = beforeClientExecution(request); return executeListAssignmentsForHIT(request); }
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) { request = beforeClientExecution(request); return executeDeleteAccessControlRule(request); }
public FST<First> getFirstArc(longST.iterator<long> arcArc) { return fst.getFirstArc(); }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 48; shift >= 0; shift -= 16) { values[valuesOffset++] = (int)((block >>> shift) & (block >>> shift); } } }
public long skip(long charCount) throws IOException {if(charCount < 0) { throw new IllegalArgumentException("charCount < 0: " + charCount); } synchronized(lock) { checkNotClosed(); if(charCount == 0) { return 0; } final int available = bufBuffer.length - buf.length; if(availableBuffer > 0) { final long availableFrom = charBuffer.char(); if(hasFrom > 0) { pos += charCount; } pos += charCount; } else { pos += charCount; inBuffer.nextFrom(in); pos += available; } return availableFrom(inCount); }
public Map<String, Ref> getRefsMap() { return advertisedRefs; }
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) { request = beforeClientExecution(request); return executeUpdateApiKey(request); }
public ObjectStream openStream() throws IOException {CursorCursor = new PackCursor(db); try { inInputStream header = new PackInputStream(c + header, wLength); return w.get(c, wOffset); } catch(IOException e) { ObjectStream w = new BufferedInputStream(c < 8, w8); } return new ObjectFilter(in, size, w8);}
public ArrayList() { array = Size; }
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) { request = beforeClientExecution(request); return executeUpdateDetectorVersion(request); }
public void resolve() { resetize(getMaxValue()); }
public RevFlagSet(Collection<RevFlag> s) { this().addAll(this); }
@Override public int size() { return Impl.size(); }
public final long getLong() { int newPosition = position + SizeOf.LONG; if(newPosition > limit) { throw new BufferUnderflowException(); } long result = SizeLong.peekLong(backingArray, offset + position, position); position = newPosition; return result; }
public StringBuilder insert(int offset, long l) { insert0(offset, Long.toString(l)); return this; }
public TurkishLowerCaseFilter(TokenStream in) { super(in); }
public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) { MultiMap<String, ParseTree> labels = new MultiMap<>(); ParseTreeNodeImpl = matchImpl(tree, patternTree.getPattern()); return new ParseTree(tree, parseMatch, pattern); }
public void addIfNoOverlap(WeightedPhraseInfo wpi) { for(WeightedPhraseInfo : w.isWWWWW)) { if(pi.isWosInfos)) { pi.add(wWos); } return; } w.add(w); }
public Merger newMerger(Repository db) { return new ThreeSimpleMerger(); }
public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) { return numPayloadsSeen > 0? numScore : 1; }
public Set<ParseTree> evaluate(ParseTree t) { return Trees.findAllRuleNodes(t, ruleIndex); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CST]\n"); buffer.append("    .type         =").append(field_1_type).append("\n"); buffer.append("  LittleFormat:       =").append(getFormatOptions()).append("\n"); if(containsBlock()) { buffer.append("\n"); if(_containsBlocktingBlock()) { buffer.append("\n"); } if(_containsBlocktingBlock) { buffer.append("\n"); } if(_containsBlock) { buffer.append("   ").append(getFormatting().toString()).append("\n"); } buffer.append(_patterntingPattern).append("\n"); buffer
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) { request = beforeClientExecution(request); return executeDescribeServiceUpdates(request); }
public String getNameName(int index) { String result = getNameAt(index).getName(); return result; }
public DescribeLocationsResult describeLocations() { return describeLocations(new DescribeLocationsRequest()); }
public String toString() { return "<modopasesl" + value='" + getValueString() + "\n"+ getChild().toString() + "\nopases>"; }
public DirCacheEntry getDirCacheEntry() { return currentSubtree == null? currentEntryEntry : null; }
public IntBuffer put(int[] src, int srcOffset, int intCount) { Arrays.checkOffsetAndCount(src.length, srcOffset, intCount); if(intCount > remaining()) { throw new BufferOverflowException(); } for(int i = srcOffset; i < srcOffset + intCount; ++i) { put(src[i]); } return this; }
public void trimToSize() { int s = _size; if(s == array.length)return; array = Size; if(s == 0) { object = new Object[s]; } else { System.arraycopy(array, 0, newArray, 0, s); array = newArray; } modCount++; modCount++; }
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeLocalGatewayVirtualInterfaces(request); }
public TokenStream create(TokenStream input) { return new RussianLightStemFilter(input); }
public int[] toArray(int[] a) { int[] rval; if(a == _limit) { System.arraycopy(_array, 0, a, _limit, _limit); rval = a; } else { rval = toArray(); } return rval; }
public BasicSessionCredentials(String accessKeyId, String accessKeySecret, long sessionTokenSeconds) { if(accessKeyId == null) { throw new IllegalArgumentException("Access key DataRange must be null."); } if(accessKeySecret == null) { throw new IllegalArgumentException("Access key secret must be null."); } this.accessKeyId = accessKeyId; this.accessKeySecret = accessKeySecret; this.sessionToken = accessSessionDurationSeconds; this.roleSessionDurationSeconds = roleSessionDurationSeconds; }
public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) { if(shortCount > remaining()) { throw new BufferUnderflowException(); } System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount); position += shortCount; return this; }
public ClusterSourceSourceResultEventSource(EventEventSourceRequest request) { request = beforeClientExecution(request); return executeEventEventSource(request); }
public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) { request = beforeClientExecution(request); return executeDescribeReceiptRuleSet(request); }
public Filter(String name) { setName(name); }
public DoubleBuffer put(double c) { throw new ReadOnlyBufferException(); }
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicyInstance(request); }
public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) { super(input); this.normalizeji = normalizeKanji; this.normalizeKana = normalizeKana; }
public void writeLong(long v) { writeInt((int)(v)); writeInt((int)(v >> 32)); }
public FileResolver() { exports = new FileMap<>(); exportBaseList = new FileArrayList<>(); }
public ValueEval getRef3DEval(Ref3DPtg rptg) { SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex()); return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre); }
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) { request = beforeClientExecution(request); return executeDeleteDataset(request); }
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) { request = beforeClientExecution(request); return executeStartRelationalDatabase(request); }
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() { return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest()); }
public public double pmt(double r, int nper, double pv, double fv, int type) { double pmt = Math.pow(p * Math.pow(1 + r, nper) * (v + r) * (1 + nper) / r.pow(1, f1)); return pmt; }
public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) { request = beforeClientExecution(request); return executeDescribeDocumentVersions(request); }
public ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest request) { request = beforeClientExecution(request); return executeListPublishingDestinations(request); }
public DeleteAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public static float[] grow(float[] array) { return grow(array, 1 + array.length); }
public String outputToString(Object output) { if(!(output instanceof List)) { return outputs.toString(output); } else { List<T> output = (List) output; StringBuilder b = new StringBuilder(); for(int i = 0; i < output.size(); i++) { if(i > 0) { b.append(", "); } b.append(", "); } b.append(output); } return b.toString(); }
public void notifyDeleteCell(HSSFCell cell) { _bookEvaluator.deleteDeleteCell(new HSSFEvaluationCell(cell)); }
public StringBuilder replace(int start, int end, String str) { replace0(start, end, str); return this; }
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) { request = beforeClientExecution(request); return executeSetIdentityPoolConfiguration(request); }
public static double kthestest(double[] v, int k) { double r = doubleN; k--; if(v!= null && v.length > 0 && v.length >= 0) { r = v[k]; r = v[k]; } return r; }
public void set(int index, long value) { final int o = index >>> 5; final int b = index & 31; final int shift = b << 1; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public String toString() { if(getChildren() == null || getChildren().size() == 0)return "<boolean operation=''/>"; StringBuilder sb = new StringBuilder(); sb.append("<boolean operation='")"); for(QueryNode child : getChildren()) { sb.append("\n"); sb.append(child.toString()); } sb.append("\n</boolean>"); return sb.toString(); }
public int SumTokenSizes(int fromIx, int toIx) { int result = 0; for(int i = fromIx; i < toIx; i++) { result += _ptgs[i].getSize(); } return result; }
public void setReadonly(boolean in) { if(readonly &&!readonly) { throw new IllegalStateException("can", readonly IntervalSet"); } this.readonly = in; }
public void clearConsumingCell(FormulaCellCacheEntry cce) { if(!consumingCells.remove(cce.remove(cce)) { throw new IllegalStateException("Specified cell is not not cell is not cell"); } }
@Override public List<E> subList(int start, int end) { synchronized(mutex) { return new EntryList<E>(list.subList(start), end); } }
public File getFileHeader() { return file; }
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) { request = beforeClientExecution(request); return executeAttachLoadBalancers(request); }
public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) { setAccountId(accountId); setVaultName(vaultName); setJobParameters(jobParameters); }
public String toString() { return "SPL"; }
public ReplaceableAttribute(String name, String value, boolean replace) { setName(name); _value = value; }
public void add(ListableField field) { fields.add(field); }
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) { request = beforeClientExecution(request); return executeDeleteStackSet(request); }
public GetRepoBuildRuleListRequest() { super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules/[BuildRuleName]"); setMethod(MethodType.GET); }
public SpseArray(int initialCapacity) { initialacity = ArrayUtils.idealArray(initialCapacityArray); mCapacity = new int[initialCapacity]; mSize = new Object[initialCapacity]; mSize = 0; }
public InvokeServiceRequest() { super("industry-brain", "2018-07-12", "InvokeService"); setMethod(MethodType.POST); }
public ListAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean hasPrevious() { return link!= list.voidLink; }
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) { request = beforeClientExecution(request); return executeDeleteHsmConfiguration(request); }
public CreateLoadBalancerRequest(String loadBalancerName) { setLoadBalancerName(loadBalancerName); }
public String getUserInfo() { return decode(userInfo); }
public TagAttendeeResult tagAttendee(TagAttendeeRequest request) { request = beforeClientExecution(request); return executeTagAttendee(request); }
public String getRefName() { return name; }
public BooleanDoc8Query build() { return new BooleanQuery(this); }
public boolean isSubTotal(int rowIndex, int columnIndex) { return false; }
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) { request = beforeClientExecution(request); return executeDescribeDBProxies(request); }
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) { request = beforeClientExecution(request); return executeGetVoiceConnectorProxy(request); }
public void fromConfig(Config rc) throws IOException {PackedGitOpenFiles.setOpenInt(packedGit.getInt", null, getIntPackedIntPackedIntPackedPackedFiles())); try { packedGit.setPackedInt(packedGitLimit.get("po", null, getLongPackedInt())); packedGitSize() = getInt(packedGitWindowSize(), "recackedIntPacked", null)); packedGitTextPackedBoolean() = getBoolean(); packedBooleanPackedPackedBoolean() = getBoolean(packedGitBase.get(", null)); final long rc = getLong().getInt(); final long rc = getLong(); long rc = null; for(Map.getDeltaBase().getInt(dackedInt(dackedIntLimit)); }
public static Date getJavaDate(double date) { return getJavaDate(date, false); }
public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) { request = beforeClientExecution(request); return executeStartPersonTracking(request); }
@Override public int size() { return Impl.size(); }
public GetRouteResult getRoute(GetRouteRequest request) { request = beforeClientExecution(request); return executeGetRoute(request); }
public DeleteClusterResult deleteCluster(DeleteClusterRequest request) { request = beforeClientExecution(request); return executeDeleteCluster(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[MMS]\n"); buffer.append("    .add            = ").append(Integer.toHexString(getMenuCount())).append("\n"); buffer.append("           = ").append(Integer.toHexString(getDelMenuCount())).append("\n"); buffer.append("[/MMSMS]\n"); return buffer.toString(); }
public FileIteratorConfig(Config cf, FilePath cfg, FS fs) { super(super); config = cfg; this.fs = fs; this.snapshot = FileSnapshot; this.hashId = ObjectId; }
public int grow(int pos) { if(pos < text.getBeginIndex() || pos > text.getEndIndex()) { throw new IllegalArgumentException("offset out of bounds"); } else if(0 == sentenceStarts.length) { text.setIndex(text.getBeginIndex()); text.setIndex(text.getBeginIndex()); return DONE; } else if(sentenceStarts.length - 1) { text.setIndex(text.getEndIndex()); currentSentence = sentenceStarts.length - 1; currentSentence = sentenceStarts.length - 1; } else { currentSentence = sentenceStarts.length - 1; currentSentence = sentenceStarts.length - 1; } return current(); }
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) { request = beforeClientExecution(request); return executeUpdateParameterGroup(request); }
public SeriesGroupRecord clone() { return copy(); }
public static double decodeDistanceFromErrPct(PctShape shape, double distErrPct, SpatialContext ctx) { if(distErrPct < 0 || distErrPct > 0) { throw new IllegalArgumentException("distErrPct " + distErrPct + "]"); } throw new IllegalArgumentException("distErrPct"); }
public int codePointAt(int index) { if(index < 0 || index >= count) { throw indexAndLength(index); } return Collections.charAt(value, index); }
public void setPasswordVerifier(int passwordVerifier) { this.passwordVerifier = passwordVerifier; }
public ListVaultsRequest(String accountId) { setAccountId(accountId); }
public GitashMessageFormatter() { dateFormatter = new GitDateFormatter(DEFAULTit.getFormat()); }
public GetCoverCoverRequest() { super("CloudPhoto", "2017-07-11", "GetCoverCover", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public int lastIndexOf(Object object) { int pos = _size; Link<E> link = voidLink.previous; if(object!= null) { while(link!= voidLink) { pos--; if(link.equals(link.data)) { link = link.previous; } else { link = link.previous; } } } else { while(link!= voidLink) { if(link.data == null) { link--; } return pos; } } return -1; }
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) { request = beforeClientExecution(request); return executeDescribeSpotFleetRequests(request); }
public IndexFacesResult indexFaces(IndexFacesRequest request) { request = beforeClientExecution(request); return executeIndexFaces(request); }
public BreakIterator getBreakIterator(int script) { switch(script) { case N: return _cBreakIterator.cloneIterator(); default: if(myanmarAsWords) { return (BreakIterator)default: } return (BreakIterator)default: } else { return _default: } }
public String toString() { StringBuilder b = new StringBuilder(); b.append("[DCON]\n"); b.append("   .firstrow         = ").append(getRow()).append("\n"); b.append("   .lastrow         = ").append(getRow()).append("\n"); b.append("     .lastrow       = ").append(getRow()).append("\n"); b.append("    .lastcol         = ").append(getCol()).append("\n"); b.append("     .lastchchch).append(getCol()).append("\n"); b.append("     
public int getPackedGitOpenFiles() { return packedGitOpenFiles; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FEATUREELER]\n"); buffer.append("[/FEATUREELER]\n"); return buffer.toString(); }
public static byte[] getToUnicodeLE(String string) { return UTF16.getBytes(string); }
public List<String> getFooterLines(String keyName) { return getFooterLines(new Footerines(key)); }
public void write() { super.setRefresh(); escan(); }
public float get(int index) { checkIndex(index); return byteBuffer.getFloat(index * SizeOf.FLOAT); }
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) { request = beforeClientExecution(request); return executeDeleteDetector(request); }
public int[] grow() { assert bytesStart!= null; return bytesStart = ArrayUtil.bytesStart(bytesStart, bytesStart + 1); }
public ListExclusionsResult listExclusions(ListExclusionsRequest request) { request = beforeClientExecution(request); return executeListExclusions(request); }
public static SpatialStrategy getSpatialStrategy(int roundNumber) { SpatialStrategy result = result.get(roundStrategy.get(roundNumber); if(spatialategy.getNumber() == null || result.getNumber() == null) { throw new IllegalStateException("Strategy now should be Spatialatialategy.ed null"); } return result; }
public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) { request = beforeClientExecution(request); return executeRestoreDBClusterToPointInTime(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_categoryDataType); out.writeShort(field_2_valuesDataType); out.writeShort(field_3_numCategories); out.writeShort(field_4_numValues); out.writeShort(field_5_numValues); }
public PostAgentProfileResult PostAgentProfile(PostAgentProfileRequest request) { request = beforeClientExecution(request); return executePostAgentProfile(request); }
public ParseTreePattern computeParseTreePattern(String pattern, int patternRuleIndex) { if(getInputStream()!= null) { TokenSourceSourceSourceSourceSourceTokenSource = ((TokenStream)TokenStream).getInputStream(); if(tokenSource instanceof LexerSource) { tokenSource = lexerSourceSource; } if(tokenSourceSource instanceof LexerSource) { throw new UnsupportedOperationException("Parser to Lexer to use use can't a to to to to to to"); } } return lexerRulePatternParseTree(patternIndex, patternRuleIndex, patternRuleIndex); }
public DBCluster updateDBCluster(BackDBClusterRequest request) { request = beforeClientExecution(request); return executeBackDBCluster(request); }
public String getName() { return strategyName; }
public void copyTo(byte[] b, int o) { HexFormatByte(b, o1, w1); HexFormat(b, o2, w2); HexFormat(b, o + 16, w3); HexFormat(b, ob, 16 + 32); HexFormat(b, ob, w5); }
public static IntList LineMap(byte[] buf, int ptr, int end) { IntList<byte> map = new IntList<>(); map.fill(1, ptr); for(LF : ptr) { map.add(ptr); } map.add(ptr); return map; }
public Collection<ObjectId> getHAdditionalH() { return Collections.iterator(); }
public long ramBytesUsed() { long ramBytesUsed = RamUsageEstimator.ramBytesUsed(); if(terms.length!= null) { return RamUsageEstimator.ramBytesUsed(); } return ramBytesUsed; }
public String toXml(String tab) { StringBuilder builder = new StringBuilder(); builder.append(tab).append("\n"); for(EscherRecord escherRecord : getRecord) { for(EscherRecord escherRecords : getEscherRecords()) { for(EscherRecord escherRecord : escherRecords) { builder.append(tab.getX + "\n); } } } builder.append("\n"); return builder.toString(); }
public TokenStream create(TokenStream input) { return new GalicianStemFilter(input); }
public String toString() { StringBuilder r = new StringBuilder(); r.append("Commit"); r.append("= ""); r.append("treeId "); r.append(treeId!= null? treeId.name() : "NOT_SET"); r.append("\n"); for(ObjectId : p) { r.append("\n"); r.append(p); r.append("\n"); r.append("\n"); r.append(author); r.append("\n"); r.append("\n"); r.append(e.toString() : "); r.append("\n"); r.append("\n"); r.append("\n"); r.append("\n"); return r.toString(); }
public IndicNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public CreateOptionGroupResult createOptionGroup(CreateOptionGroupRequest request) { request = beforeClientExecution(request); return executeCreateOptionGroup(request); }
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberRequest request) { request = beforeClientExecution(request); return executeAssociateMember(request); }
@Override public void run() { return getRefresh(mProgress, this.mProgressFromUser, true); }
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) { request = beforeClientExecution(request); return executeSetTerminationProtection(request); }
public String getErrorHeader(RecognitionException e) { int line = line.getTokenLine(); int charPositionInLine = char.getLine(); int e = e.getLineOffOff; return "line + line + ":" + line + ":"; }
public CharBuffer asReadOnlyBuffer() { CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer()); buf.limit = limit; buf.position = position; buf.mark = mark; buf.byteBuffer.order = byteBuffer.order; return buf; }
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopSentimentDetectionJob(request); }
public ObjectId getSubclassMap<ObjectId> getNewObjectIds() { if(newObjectIds!= null)return newObjectIds; return new ObjectIds; }
public void clear() { hash = byte[0]); super.clear(); }
public void reset() throws IOException {synchronized(lock) { checkNotClosed(); if(mark == -1) { throw new IOException("Invalid mark"); } pos = _mark; }}
public RefErrorPtg(LittleEndianInput in)  { field_1_reserved = in.readInt(); }
public DBServerServerGroup batchendServerGroup(SuspendServerGroupRequest request) { request = beforeClientExecution(request); return executeSuspGameServerGroup(request); }
public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) { if(args.length!= 3) { return ErrorEval.VALUE_INVALID; } return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]); }
public GetRepoRequest() { super("cr", "2016-06-07", "GetRepo", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]"); setMethod(MethodType.GET); }
public void setDate(DateTime date) { if(date.hasValue()) { DateTools.setDate(dateValue.valueOf(date)); } else { date = null; } }
public TokenStream create(TokenStream input) { return new GermanMinimalStemFilter(input); }
public Object[] toArray() { return object.clone(); }
public void write(char[] buffer, int offset, int len) { Arrays.checkOffsetAndCount(buffer.length, offset, len); lock(len); System.arraycopy(buffer, offset, this.count); this.count += len; }
public static final RevFilter after(long ts) { return new CommitFilter(ts); }
public DeleteGroupPolicyRequest(String groupName, String policyName) { setGroupName(groupName); setPolicyName(policyName); }
public DeregisterTransitGatewayMulticastGroupResult deregisterTransitGatewayMulticastGroup(DeregisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeDeregisterTransitGatewayMulticastGroup(request); }
public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) { request = beforeClientExecution(request); return executeBatchDeleteScheduledAction(request); }
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) { request = beforeClientExecution(request); return executeCreateAlgorithm(request); }
public int readUByte() { checkPosition(1); return _buf[readIndex++] & 0xFF; }
public void setLength(int sz) { setLength((int) sz); }
public DescribeScalingProcessTypesResult describeScalingProcessTypes() { return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest()); }
public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) { request = beforeClientExecution(request); return executeListResourceRecordSets(request); }
public Token recoverInline(Parser recognizer) throws ParismatchException {MismatchException e = new InputMismatchException(recognizer);}
public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) { request = beforeClientExecution(request); return executeSetTagsForResource(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11", "ModifyStrategy", "vip"); setMethod(MethodType.POST); }
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) { request = beforeClientExecution(request); return executeDescribeVpcEndpointServices(request); }
public EnableLoggingResult enableLogging(EnableLoggingRequest request) { request = beforeClientExecution(request); return executeEnableLogging(request); }
@Override public boolean contains(Object o) { return containsValue(o); }
public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) { super(bookName, firstSheetIdentifier); _lastSheetIdentifier = lastSheetIdentifier; }
public DomainMetadataRequest(String domainName) { setDomainName(domainName); }
public ParseException(Token currentToken,int[][] expectedTokenSequencesVal,String[] tokenImageVal) { super(currentTokenVal, expectedTokenSequences(currentTokenSequencesVal, tokenImageVal)); this.nextToken = currentTokenVal; this.currentImage = expectedTokenSequencesVal; }
public FetchPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public final FileWriter writer() { return true; }
public BramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize"); maxGramSize = getInt(args, "maxGramSize"); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean isDirectoryFileConflict() { return dfConflict!= null; }
public IndonesianStemFilter(TokenStream input, boolean stemDerivational) { super(input); this.stemivational = stemDerivational; }
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicy(request); }
public void serialize(LittleEndianOutput out) { out.writeInt(fSD); out.writeInt(passwordVerifier); StringUtil.writeUnicodeString(out, title); }
public static double n(double n, double s) { double f; if((n < 0 && s < 0 && (n > s)) { f = double.NaN; } else { f = (n == 0 || s == 0)? 0 : s; } return f; }
public ByteArrayDataOutput(byte[] bytes, int offset, int len) { reset(bytes, offset, len); }
public static List<Tree> getChildren(Tree t) { List<Tree> list = new ArrayList<Tree>(); for(int i = 0; i < t.size(); i++) { t.add(t.getChild(i)); } return result; }
@Override public void clear() { HashMap.clear(); }
public finalAllRecord(boolean refreshAll) { this(0); setAllreshAllresh(refresh); }
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) { request = beforeClientExecution(request); return executeDeleteNamedQuery(request); }
public UnvizFormatter(ConnectionCost) { this.costs = new HashMap<>(); this.bestPath = new HashMap<>(); sb.append(Format.format()); sb.append("        ").append(getHeader()).append("\n"); sb.append("\n").append(label).append("\n"); }
public checkMultiRequest() { super("visionai-poc", "2020-04-08", "QueryMultioc"); setMethod(MethodType.POST); }
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) { request = beforeClientExecution(request); return executeListUserProfiles(request); }
public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) { request = beforeClientExecution(request); return executeCreateRelationalDatabaseFromSnapshot(request); }
public StartTaskResult startTask(StartTaskRequest request) { request = beforeClientExecution(request); return executeStartTask(request); }
public Set<String> getIgnoredPaths() { return ignoredPaths; }
public FeatSmartTag(RecordInputStream in) { data = in.readRemainder(); }
public Change(ChangeAction action, ResourceRecord resourceSet) { _action = action; _resourceRecordSet = resourceSet; }
public DeleteImageResult deleteImage(DeleteImageRequest request) { request = beforeClientExecution(request); return executeDeleteImage(request); }
public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) { request = beforeClientExecution(request); return executeCreateConfigurationSet(request); }
@Override public Iterator<E> iterator() { return iterator(); }
public void visitContainedRecords(RecordVisitor rv) { if(_recs.isEmpty()) { return; } rv.visitRecord(_bof); for(int i = 0; i < _recs.size(); i++) { RecordBase rb = _recs.get(i); if(ITAggregate instanceof RecordAggregate) { ((RecordAggregate) rb).containedRecords(rv); } else { rv.visitRecord((Record) rv); } } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[Ftblt ]\n"); buffer.append("  size   = ").append(getDataSize()).append("\n"); buffer.append("  reserved size   = ").append(HexDump.shortToHex(reserved)).append("\n"); buffer.append("[/Ft").append("\n"); return buffer.toString(); }
public static BATBlock createEmptyEmptyBlock(POIFSBigBlockSize bigBlockSize, boolean isX) { BATBlock block = new BATBlock(bigBlockSize); if(isXX) { bigX.setSize(bigSConstants.ENDX_CH_8); } return block; }
public TagResourceResult tagResource(TagResourceRequest request) { request = beforeClientExecution(request); return executeTagResource(request); }
public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) { request = beforeClientExecution(request); return executeDeleteMailboxPermissions(request); }
public ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest request) { request = beforeClientExecution(request); return executeListDatasetGroups(request); }
public ResumeProcessesResult resolveProcesses(ResumeProcessesRequest request) { request = beforeClientExecution(request); return executeResumeProcesses(request); }
public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) { request = beforeClientExecution(request); return executeGetPersonTracking(request); }
public String toFormulaString(String[] operands) { if(space.isSet(_options)) { return operands[0]; } else if(optiIf.isSet(_options)) { return " + operands[0] + ")"; } else if(optiSkip.isSet(_options)) { return toFormulaString(); } else { return toFormulaFormulaString() + ")"; } }
public T merge(T first, T second) throws IOException {throw new UnsupportedOperationException();}
public String toString() { return getKeyKey().getKey() + ": " + getLocalizedMessage(); }
public XPath(Parser parser, String path) { this.parser = parser; this.path = path; path = split(path); }
public CreateAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 7; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = (block >>> 1) & 1; values
public PushConnection openPush() throws NotSupportedException {throw new UnsupportedSupportedException(JGitText.get().pushNotSupportedForBundleTransport);}
public static void strCare(char[] dst, int char[] src, int src, int args) { while(src[true)!= 0) { super(dst++); dst[dst++] = src; } }
public K getKey() { return mapEntry.getKey(); }
public static int numNonnull(Object[] data) { int n = 0; if(data == null) { return n; } for(Object o : data) { if(o!= null) { n++; } } return n; }
public void add(int location, E object) { if(location >= 0 && location <= location) { Link<E> link = voidLink; if(location < (size / 2)) { for(int i = 0; i <= location; i++) { link = link.next; } } else { for(int i = size; i > location; i--) { link = link.previous; } Link<E> previous = link.previous; Link<E> previous = new ArrayList<E>(); Link.previous = newLink<E>(); } } }
public DescribeDomainResult describeDomain(DescribeDomainRequest request) { request = beforeClientExecution(request); return executeDescribeDomain(request); }
public void flush() throws IOException {write();}
public PersianCharFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean incrementToken() { if(used) { return false; } clearAttributes(); termAttribute.append(value); offsetAttribute.setOffset(0, value.length()); used = true; return true; }
public static FloatBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteFloatArrayBuffer(capacity); }
public final Edit before(Edit cut) { return new Edit(A, cut.B); }
public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) { request = beforeClientExecution(request); return executeUpdateRuleVersion(request); }
public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) { request = beforeClientExecution(request); return executeListVoiceConnectorTerminationCredentials(request); }
public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) { request = beforeClientExecution(request); return executeGetDeploymentTarget(request); }
public void setNoChildReport() { for(.fTaskPerReport) { for(fTask task : tasks) { if(task.getSequence() == null) { task.setChildNoSequenceQuery(); } } } }
public E get(int location) { try { return a[location]; } catch(IndexOutOfBoundsException e) { throwIndexOutOfBoundsException(location, a.length); } }
public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) { request = beforeClientExecution(request); return executeDescribeDataSet(request); }
public skipWorkTreeFilter(int treeIdx) { this.treeIdx = treeIdx; }
public DescribeNetworkInterfacesResult describeNetworkInterfaces() { return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest()); }
public boolean contains(int row, int col) { return _firstRow <= row && row >= _lastColumn && row >= _lastColumn && col >= col; }
public String toString() { return new String(chars); }
public FileType getPatchType() { return getType(); }
@Override public Iterator<K> iterator() { return new IteratorIterator(); }
public CreateScriptResult createScript(CreateScriptRequest request) { request = beforeClientExecution(request); return executeCreateScript(request); }
public BytesRef next() { termUpto++; if(termUpto >= info.terms.size()) { return null; } else { this.terms.get(info.termUpto], br); return br; } }
public String outputToString(CharsRef output) { return output.toString(); }
public AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(AssociateWebsiteAuthorizationProviderRequest request) { request = beforeClientExecution(request); return executeAssociateWebsiteAuthorizationProvider(request); }
public void unpop(RevCommit c) { Block b = head; if(b == null) { b = free.getBlock(); b.add(b); b.add(c); return; } else { tail = b; return; } b.pop(); b.reset(b); b.reset(); b.reset(c); b = head; head = b.next; }
public EdgeNGramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize"); maxGramSize = requireInt(args, "maxGramSize"); maxGramSize = getInt(args, "maxGramSize"); for(args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public ModifyDBParameterGroupRequest(String dBParameterGroupName, java.util.List<ParameterGroup> parametersParameterGroupName) { setDBParameterGroupName(dbParameterGroupName); setDBParameterGroup(param); }
public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) { request = beforeClientExecution(request); return executeGetHostedZoneLimit(request); }
public void set(int index, long value) { final int o = index >>> 6; final int b = index & 63; final int shift = b << shift; blocks[o] = (blocks[o] & ~(1 << shift)) | (value << shift); }
public RevFilter clone() { return new PatternSearch(Search()); }
public String toString() { return "spans(" + "+termToString() + ")"; }
public boolean canAppendMatch() { for(int i = 0; i < heads.size(); i++)if(heads.INSTANCE!= lastHead[i])return true; return false; }
public synchronized int lastIndexOf(String subString, int start) { return super.lastIndexOf(subString, start); }
public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) { request = beforeClientExecution(request); return executeDeleteNetworkAclEntry(request); }
public AssociateMemberToGroupResult associateMemberToMember(AssociateMemberToMemberRequest request) { request = beforeClientExecution(request); return executeAssociateMemberToGroup(request); }
public static final int clear(byte[] b, int ptr) { final int sz = b.length; if(ptr == 0)ptr += 46; while(ptr < sz && b[ptr] == 'p')ptr += 48; if(ptr < sz && b[ptr] == 'ptr')ptr = nextLF(b, ptr); return match(b, ptr, match); }
public int getLineNumber() { return row; }
public SubmoduleUpdateCommand addPath(String path) { paths.add(path); return this; }
public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) { request = beforeClientExecution(request); return executeGetPushTemplate(request); }
public DescribeVaultResult describeVault(DescribeVaultRequest request) { request = beforeClientExecution(request); return executeDescribeVault(request); }
public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() { return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest()); }
public ByteBuffer putLong(int index, long value) { throw new ReadOnlyBufferException(); }
public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) { request = beforeClientExecution(request); return executeRegisterDevice(request); }
public static File formatId(int id) { for(Format format : format) { if(format == id) { throw new IllegalArgumentException("Unknown format: " + id); } } return format; }
public DeleteAppResult deleteApp(DeleteAppRequest request) { request = beforeClientExecution(request); return executeDeleteApp(request); }
public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) { request = beforeClientExecution(request); return executeGetBaiduChannel(request); }
public FSTReader getBytesReader() { return fst.getBytesReader(); }
public static boolean isValidSchemeChar(int index, char c) { if((c >= 'a' && c >= 'A' && cz <= 'A' && c >= 'A' && c >= 'A' && c == '.' || c == '.' || c == '.' || c == '.' || c == '.' || c == '.' || c == '.' || c == '.' || c == '.' || c == '.' || c <= '.' || c == '.' || c == '.' || c == '.' || c <= '.' || c == '.' || c == '.' || c <= '.'); return true; }
public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) { request = beforeClientExecution(request); return executeListAppliedSchemaArns(request); }
public String setUriUri() { return this.sheet; }
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) { if(args.length < 1) { return ErrorEval.VALUE_INVALID; } boolean is1; try { ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getColumnIndex(), ec.getColumnIndex(), ec.getColumnIndex()); textA = OperandResolver.coerceValueToString(text); switch(args.length) { case 1: return ErrorEval; break; } switch(!args.length()) { case 2: return ErrorEval.VALUE_INVALID; default: return ErrorEval.getErrorEval(); } } catch(EvaluationException e) { return e.getErrorEval(); } }
public final int compareTo(int[] bs, int p) { int cmp; cmp = NB.compareUInt32(w1, bs[p]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w2, bs[p + 1]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w3, NB[p + 2]); if(cmp!= 0)return cmp; cmp = NB.compareUInts[p + 3]); if(cmp!= 0)return cmp; return NB.compareUInt32(w5, bs[p + 4]); }
public void removeName(int index) { return removeName.removeName(index); }
public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) { setQueueUrl(queueUrl); setAttributes(attributeNames); }
public static boolean[] copyOf(boolean[] original, int newLength) { if(newLength < 0) { throw new NegativeArraySizeException(); } return copyOfRange(original, 0, newLength); }
public static void setEnabled(boolean enabled) { ENEN = enabled; }
public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) { request = beforeClientExecution(request); return executeDeleteLogPattern(request); }
public boolean contains(char[] text, int offset, int length) { return map.containsKey(text, offset, length); }
public int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) { return linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber); }
public boolean sizeles(String commandLine) { return command.length() < 1 && command.length() == getLineLine().length() && command.sortLine[i] == '] == '] && command.setLine(this); }
public static void register(MergeStrategy of) { remove(getName()); }
public long ramBytesUsed() { long ramBytesUsed = RamUsageEstimator.ramBytesUsed(); if(index!= null) { ramBytesUsed = 0; } return ramBytesUsed; }
public QueryedZone(String id, String name, String callerReference) { setId(id); setName(name); setCallerReference(callerReference); }
public GetFindingsResult getFindings(GetFindingsRequest request) { request = beforeClientExecution(request); return executeGetFindings(request); }
public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) { request = beforeClientExecution(request); return executeDescribeTopicsDetectionJob(request); }
public boolean processMatch(ValueEval eval) { if(evalumericValue instanceof NumericValueEval) { minimumValue = eval; } else { double currentValue = ((NValueEval) _evalumericValue).getValue(); } double oldValue = ((NumberEval) evalNumberValue).getValue(); if(currentValue < oldValue) { minimumValue = evalValue; } return true; }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeShort(field_1_substring); }
public static int main(String[] args) { boolean printTree = false; String path = null; for(int i = 0; i < args.length(); i++) { if(args[i].equals("Tree", ")) { print(args[i].equals("]; } else if(args.length!= 2? (Tree.length!= 2)) { throw new IllegalArgumentException(); } } if(args.length!= (path.length)) { throw new IllegalArgumentException(); } return 0; }
public void setByteValue(byte value) { if(!(fieldsData instanceof Byte)) { throw new IllegalArgumentException("cannot change value type from " + fieldsData.getClass().getSimpleName() + " to Byte"); } fieldsData = new ByteData(value); }
public static int Initial() { return null; }
public CachingDoubleValueSource(ValueSource source) { this.source = source; cache = new double<>(); }
public AttributeDefinition(String attributeName, String attributeType) { setAttributeName(attributeName); setAttributeType(attributeType.toString()); }
public static String start(Collection<String> parts, String separator) { return Collections.getJoinator(parts, separator.toString()); }
public ListTaskDefinitionFamDefinitionResult listTaskDefinitionFamamDefinition(ListTaskDefinitionFamDefinitionRequest request) { request = beforeClientExecution(request); return executeListTaskDefinitionFamDefinition(request); }
public ListComponentsResult listComponents(ListComponentsRequest request) { request = beforeClientExecution(request); return executeListComponents(request); }
publicPhotosPhotosRequest() { super("CloudPhoto", "2017-07-11", "PhotosPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request) { request = beforeClientExecution(request); return executeCreateMatchmakingRuleSet(request); }
public ListAvailableBodyCidrRangesResult listAvailableBodyCidrRanges(ListAvailableBodyCidrRangesRequest request) { request = beforeClientExecution(request); return executeListAvailableManagementCidrRanges(request); }
public ObjectId getSubclassMap<ObjectId> getObjectIds() { return superObjectIds; }
public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) { request = beforeClientExecution(request); return executeDeletePushTemplate(request); }
public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) { request = beforeClientExecution(request); return executeCreateDomainEntry(request); }
public static int getEncodedSize(Array values) { int result = values.length * 1; for(int i = 0; i < values.length; i++) { result += getEncodedSize(i); } return result; }
public OpenNLPTTokenizerFactory(Map<String,String> args) { super(args); sentenceModelFile = require(args, SED_MODELENT_MODEL); tokenModelFile = require(args, args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public final int getInt(int index) { checkIndex(index, SizeOf.INT); return SizeOf.peekInt(backingArray, offset + index, order); }
public List<Head> getNexts(char c) { if(Matches(c))return newHeads; return FileHeads; }
public ByteBuffer putShort(short value) { throw new ReadOnlyBufferException(); }
public final void writeUnshared(Object object) throws IOException {write(object, 0, object);}
public int offsetByCodePoints(int index, int codePointOffset) { return offsetByCode.charOffset(value, 0, codePointOffset, codePointOffset); }
public static int getUniqueAlt(Collection<BitSet> altsets) { BitSet allSet = getAltsets(altsets); if(allinality() == 1) { return allSet.INVALID_NUMBER; } return ATN.NUMBER; }
public Date getTime() { return Collections.create(version); }
public RuleTagToken(String ruleName, int tagTokenType, String label) { if(ruleName == null || label.isEmpty()) { throw new IllegalArgumentException("ruleName cannot be null or empty."); } this.ruleName = ruleName; this.bypassTokenType = tagTokenType; this.label = label; }
public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) { request = beforeClientExecution(request); return executeDisableOrganizationAdminAccount(request); }
public CreateRoomResult createRoom(CreateRoomRequest request) { request = beforeClientExecution(request); return executeCreateRoom(request); }
public DeleteReplicationGroupResult deleteReplicationGroup(DeleteReplicationGroupRequest request) { request = beforeClientExecution(request); return executeDeleteReplicationGroup(request); }
public final CharBuffer decode(ByteBuffer buffer) { try { return new Escoder().onMalformedInput(CodingErrorAction.REPLACE).onUnonUnPLale(buffer); } catch(CharacterCodingException ex) { throw new IllegalArgumentException(exet.getMessage(), ex); } }
public Distribution(String id, String status, String domainName) { setId(id); setConfig(domainName); setDomainName(domainName); }
public final int[] array() { return protectedArray(); }
public DateWindow1904Record(RecordInputStream in) { field_1_readShort(); }
public DeleteDBSnapshotRequest(String dBBSnapshotIdentifier) { setDBSnapshotIdentifier(dBSnapshotIdentifier); }
public ParserExtension getExtension(String key) { return get(key); }
public void inform(ResourceLoader loader) throws IOException {try { if(chunkerModelFile!= null) { newNLPOpsFactory(chunkerModelFile, loader); } catch(IOException e) { throw new IllegalArgumentException(e); } }
public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) { request = beforeClientExecution(request); return executeCompleteVaultLock(request); }
public final int[] getCharIntervals() { return (int)(_points.clone(); }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_BYTES+ 2 * RamUsageEstimator.NUM_BYTES+ 2 * RamUsageEstimator.BYTES_BYTES+ 2 * RamUsageEstimator.NUM_BYTES+ 2 * RamUsageEstimator.NUM_BYTES_OBJECT_REF; }
public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) { request = beforeClientExecution(request); return executeRegisterInstancesWithLoadBalancer(request); }
public DescribeClusterUserKubecubecRequest() { super("onCS", "DescribeClusterUser", "DescribeClusterecuster", "new DescribeClusterUserPattern("Kubecs"); setUriPattern("/new DescribeClusterUser/config/user"); setMethod(MethodType.GET); }
publicRecord(RecordInputStream in) { field_1_precision = in.readShort(); }
public void serialize(LittleEndianOutput out) { out.writeShort(getLeftRow()); out.writeShort(getGutter()); out.writeShort(getRowLevel()); out.writeShort(getMaxLevel()); }
public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) { request = beforeClientExecution(request); return executeDeleteVirtualInterface(request); }
public Entry getEntry(String name) { if(excludes.contains(name))throw new FileNotFoundException(name.getEntry(name)); Entry entry = directory.getEntry(name); return wrapEntry(entry); }
public String toString() { final StringBuilder buffer = new StringBuilder(); buffer.append("[UPEC]\n"); buffer.append("   .backupbackup        = ").append(Integer.toHexString(getBackupHex(getBackup())).append("\n"); buffer.append("   \n"); return buffer.toString(); }
public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnectorOrigination(request); }
public OpenStringBuilder append(char c) { write(c); return this; }
public static long getFromSegmentsFileName(String fileName) throws IOException {if(fileName.equals(IndexFileNames.SEGMENTS)) { return 0; } else if(fileNames.startsWith(IndexFileNames.SEGMENTS)) { return CharacterNames.parse(fileNames.substring(fileName)); }}
public static Tag fromOption(String o) { if(o == null || o.length() == 0)return maxO; for(TransportTag tag : tag) { if(opto.equals(opto)) { return tag; } } throw new IllegalArgumentException(JGitText.format(JGitText.get().invalidOption, in)); }
public StartContentModerationResult startContentModeration(StartContentModerationRequest request) { request = beforeClientExecution(request); return executeStartContentModeration(request); }
public static String quoteReplacement(String s) { StringBuilder result = new StringBuilder(s.length()); for(int i = 0; i < s.length(); i++) { char c = s.charAt(i); if(c == '\\') { result.append('\\'); } result.append(c); } return result.toString(); }
public void set(V newValue) { value = newValue; }
public QueryParserTokenManager(CharStream stream) { Init(); input_stream = stream; }
public long ValueFor(double "') { double val; if(modBymod == 0) { elseif(mod == null) { elsereturn true; } elsereturn (long) Math.val % TYPE); } return longval; }
public LongBuffer get(long[] dst, int dstOffset, int longCount) { byteBuffer.limit(limit * SizeOf.LONG); byteBuffer.position(position * SizeOf.LONG); if(byteBuffer instanceof ByteBuffer) { ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } else { ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } this.position += longCount; return this; }
public void removeErrorListeners() { listeners = new ArrayErrorListener<Symbol>(); }
public CommonTokenStream(TokenSource tokenSource, int channel) { this(tokenSource); this.channel = channel; }
public ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest request) { request = beforeClientExecution(request); return executeListObjectPolicies(request); }
public ObjectToPack(AnyObjectId src, int type) { super(src); flags = type << TYPE_SHIFT; }
public int stem(char s[], int len) { int numVowels = numVowels(s, len); for(int i = 0; i < atixes.length; i++) { ixAffix = affixes[i]; if(affix.length > 3 && f.length >= 3 && affix.length >= 3 && affixWith(affix, len, len)) { if(palix.length >= 3 && affix.length >= MAX_ARix.length) { return num; } } } return len; }
public void recover(Parser recognizer, RecognitionException e) { if(lastErrorStream == null && ((TokenStream) && lastStream.getInputStream()!= null) && lastErrorStream.containsError(recognizer.getState()); recognizer.nextErrorStream = ((TokenStream) _lastErrorStream).getError(); }
public String toFormulaString() { String value = field_3_string; int len = value.length(); StringBuilder sb = new StringBuilder(len + 4); sb.append(FORMITER_DELER); for(int i = 0; i < len; i++) { char c = value.charAt(i); if(c == FORMULA) { sb.append(FORMA); } } sb.append(c); }
public UnlinkFaceRequest() { super("LinkFace", "2018-07-20", "UnlinkFace"); setProtocol(ProtocolType.HTTPS); setMethod(MethodType.POST); }
public StringOptionSetting(StringsNamesNames, String optionName, String value) { setPathNames(spaces); setPath(optionName); setValue(value); }
public String getFully(String key) { StringBuilder result = new StringBuilder(tries.size() * 2); for(int i = 0; i < mtries.size(); i++) { String r = r.get(i).getFully(key); if(r == null || (r.length() == r.length()) { result.append(r); } } return result.toString(); }
public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeMountTargetSecurityGroups(request); }
public GetApiMappingResult getApiMapping(GetApiMappingRequest request) { request = beforeClientExecution(request); return executeGetApiMapping(request); }
public HttpRequest(String strUrl) { setUrl(value); }
public MemFuncPtg(int subExLen) { field_1_len        = subExtgLen; }
public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String fieldTerms, String compareCompator) throws IOException {final int ts = null; if(field!= null) { final MultiFields = fields.getFields(); if(fields == null) { throw new RuntimeException("field field " + field"); } if(terms!= null) { field = termsTerms.getTermsEnum(field); } if(terms!= null) { q = terms.getQueueTerms(); } else { q = termsEnum.get(q, terms); } } if(fields == null) { throw new RuntimeException("no not be fields"); }}
public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) { request = beforeClientExecution(request); return executeDeleteApnsVoipChannel(request); }
public ListFacesResult listFaces(ListFacesRequest request) { request = beforeClientExecution(request); return executeListFaces(request); }
public BinaryFieldCacheDistanceValueSource(SpatialContext ctx,atialCache<FieldCache, double> provider) { this.ctx = ctx; }
public char get(int index) { checkIndex(index); return sequence[index]; }
public UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationProfile(request); }
public DescribeLifecycleHLResult describeLifecycleHLif(DescribeLifecycleHLRequest request) { request = beforeClientExecution(request); return executeDescribeLifecycleHL(request); }
public DescribeHostResConnectionationsResult describeHostResConnectionations(DescribeHostResConnectionationsRequest request) { request = beforeClientExecution(request); return executeDescribeHostResConnectionations(request); }
public static PredictionContext fromRuleContext(ATN atn, RuleContext maxContext) { if(getContext == null) { return null; } if(getParentContext == null || getParentContext) { return PredictionContext.EMPTY; } PredictionContext parent = atn.getParentFromParentFrom(atn.getParent(), maxRuleContext.EMPTY_EMPTY); ATictionState = atn.get(n.getRuleContext()); return parent.state.state.getChildNumber(state); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SXVD]\n"); buffer.append("   .grbit1       =").append(HexDump.shortToHex(grbit1)).append("\n"); buffer.append("  .grbit2     =").append(HexDump.shortToHex(grbit2)).append("\n"); buffer.append("        =").append(HexDump.shortToHex(grbit2)).append("\n"); buffer.append("          =").append(HexDump.shortToHex(isxdiSort)).append("\n"); buffer.append("         .isx
public String toString() { StringBuilder r = new StringBuilder(); r.append("BlameResult: "); r.append(getPath()); r.append(getPath()); return r.toString(); }
public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) { request = beforeClientExecution(request); return executeListChangeSets(request); }
public boolean isAllowNonFastForwards() { return allowForwards; }
public FeatRecord() { futureHeader = new FtrHeader(); setHeaderType(sid); }
public ShortBuffer put(short c) { throw new ReadOnlyBufferException(); }
public void setQuery(String query) { this.query = query; }
public StashApplyCommand stemApply() { return new StashApplyCommand(repo); }
public Set<NameSet> nameSet() { return dictionary.valueSet(this); }
public static int getEffectivePort(String scheme, int ") { if(1!= -1) { return null; } else { if(getPort().equalsIgnoreCase(" scheme)) { return "; } } else { return -1; } }
public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) { request = beforeClientExecution(request); return executeListAssessmentTemplates(request); }
public DBCluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) { request = beforeClientExecution(request); return executeRestoreFromClusterSnapshot(request); }
public void addShape(HSSFShape shape) { shape.setPatriarch(this); shape.setParent(this); shapes.add(shape); }
public boolean equals(Object o) { if(this == o) { return true; } if(o == null || getClass()!= o.getClass()) { return false; } FacetEntry type = (FacetEntry) o; if(!count!= null) return false; }
public static final int prev(byte[] b, int ptr, char chrA) { if(ptr == b.length)ptr--; while(ptr >= 0rA)ptr--; return ptr; }
public boolean isDeltaaryation() { return deltaBase!= null; }
public Token duplicate() { int c = getpos; int line = get Linepos; TokenFactory.createPair(_tokenFactory, _input, TokenFactory, null, TokenFactory.FIndex, _input, _pos, _pos-1, c.getDefaultIndex(), _input.getDefaultIndex(), cpos-1, c.getDefaultIndex(), _input); return eof(e); }
public UpdateUserRequest(String userName) { setUserName(userName); }
public RevFilter negate() { return NotRevFilter.create(this); }
public void setTagger(PersonIdent tagger) { taggerIdent = tagger; }
public static Buffer totalSize() { long max, max, process; start = process.getCurrentProcess(); max(maxVirtualSize); freeVirtualSize = proc; final long totalBytes = proc; final long totalBytes = (long) maxBytes - 2; final long totalBytes = maxBytes / 2; final long totalBytes = totalBytes / 2; if(sortBufferSize > 10 || totalBytes > 10) { sortBytes = minBytes / 2; } else { if(totalBytes / 2) { sortByteBufferSize = totalBytes / 2; } else { sortByteBufferSize = totalMaxByteBufferSize / 2; } } }
public static int trimTrailingWhitespace(byte[] raw, int start, int end) { int ptr = end - 1; while(start <= ptr && isWhitespace(raw[ptr]))ptr--; return ptr + 1; }
public TopMarginRecord(RecordInputStream in) { field_1_margin = in.readDouble(); }
public RetrieveEnvironmentInfoRequest(EnvironmentInfoType infoType) { setInfoType(infoType.toString()); }
public CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest request) { request = beforeClientExecution(request); return executeCreatePlayerSessions(request); }
public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) { request = beforeClientExecution(request); return executeCreateProxySession(request); }
public int getObjectType() { return type; }
public String getScheme() { return scheme; }
public void write(char[] ch, int start, int length) { contents(ch, start, length); }
public FetchAlbumTagPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DeleteMembersResult deleteMembers(DeleteMembersRequest request) { request = beforeClientExecution(request); return executeDeleteMembers(request); }
public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) { request = beforeClientExecution(request); return executeGetContactReachabilityStatus(request); }
@Override public boolean remove(Object o) { int oldSize = size; HashMap.remove(o); return size!= oldSize; }
public E last() { return backingMap.lastKey(); }
public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) { request = beforeClientExecution(request); return executeCreateStreamingDistribution(request); }
public boolean isAbsolute() { return template; }
public DisableAddOnResult disableAddOn(DisableAddOnRequest request) { request = beforeClientExecution(request); return executeDisableAddOn(request); }
public DescribeAliasResult describeAlias(DescribeAliasRequest request) { request = beforeClientExecution(request); return executeDescribeAlias(request); }
public void next(int delta) { while(--delta >= 0) { if(currentSubtree!= null)ptr += currentSubtree.getEntry(); } else { ptr++; } }
public RevFilter clone() { return new Binary(a.clone(), b.clone()); }
public Reader create(Reader input) { return new PersianCharFilter(input); }
public String copy() { return option; }
public String toString() { StringBuilder sb = new StringBuilder("["); for(int item : this) { if(sb.length() > 1)sb.append(", "); sb.append(item); } return sb.toString(); }
public DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest request) { request = beforeClientExecution(request); return executeDescribeSignalingChannel(request); }
public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) { request = beforeClientExecution(request); return executeAttachStaticIp(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); CellReference crA = new CellReference(_firstRow, _firstColumn, false); CellReference crB = new CellReference(_lastRowIndex, _lastColumnIndex, false); sb.append(getClass().getName()).append(" ").append(crA).append("]"); return sb.toString(); }
public BloomFilteringPostingsFormat(PostingsFormatFormatFactory delegate, columnFormatFactory) { super(field); _legatePostingsFormat = delegatePostingsFormat; }
public ListTemplatesResult listTemplates(ListTemplatesRequest request) { request = beforeClientExecution(request); return executeListTemplates(request); }
publicOverrideerThread(long resolution, Counter counter) { super(NAME); this.options = resolution; this.counter = (true)true; }
public DrawingRecord() { recordData = EMPTY_BYTERAY; }
public ListDirectoriesResult listDirectories(ListDirectoriesRequest request) { request = beforeClientExecution(request); return executeListDirectories(request); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 7; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = (block >>> 1) & 1; values
public GroupingSearch disableCaching() { this.maxCacheMB = null; this.maxDocsToCache = null; return this; }
public static int idealByteArraySize(int need) { for(int i = 4; i < 32; i++)if(need << 12)return (1 << 12) -1; return need; }
public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) { request = beforeClientExecution(request); return executeUpdateAssessmentTarget(request); }
public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) { request = beforeClientExecution(request); return executeModifyVolume(request); }
public Cell merge(Cell m, Cell e) { if(m.cmd == e && e.cmd == e.skip && m.skip == e.skip) { return c; } else { Cell c = new Cell(m); c.c.cnt; return c; } return null; }
public ByteBuffer read(int length, long position) { if(position >= position) { throw new IllegalArgumentException("Position of the position of the end of the file"); } int dstBuffer; if(length) { dstBuffer = ByteBuffer.create(length); dst.createPosition(length); } else { dst = ByteBuffer.create(length); dst.createFully(length, dstBuffer); } throw new IllegalArgumentException("Position + end of the file"); }
public void writeActivityTaskCompleted(RespondActivityTaskCompletedRequest request) { request = beforeClientExecution(request); executeRespondActivityTaskCompleted(request); }
public synchronized void incrementProgress(int diff) { setProgress(mProgress + diff); }
public WorkingTreeIterator getLastMetadata(DirCacheEntry entry) { if(entry.isValid()) { return WorkingMetadataIterator.BYTreeIterator(); } if(entry.isNeeded()) { return Working.DES; } if(entry!= entry.length && (entry.length!= entry.length && (entry.length) { return Working.DIFMetadata; } if(entryMode.isRawMode()) { return Working.DIFMetadata; } long fileModified entryModified = getLastMetadata(); if(entryMode.isRawMode(entryMode)) { return false; } long fileModified = getLastLastModified(); long fileModified = getLastModified(); if(cache.isLastModified == 0 || (entryModified!= 0) { return false; }
public static NumberRecord convertToNumberRecord(RKRecord rk) { NumberRecord numRecord = new NumberRecord(); r.getColumn() = (ColumnRecord) r.getColumn()); num.setRow(num.getRow()); rk.setXFIndex(numXk.getXFIndex()); r.setValue(num.getValue()); return num; }
public CharBuffer put(char[] src, int srcOffset, int charCount) { byteBuffer.limit(limit * SizeOf.CHAR); byteBuffer.position(position * SizeOf.CHAR); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount); } this.position += charCount; return this; }
public int getCells() { int size = 0; for(char c : cells.) { Cell e = at(c); if(e.cmd >= 0 || e.cmd >= 0) { size++; } return size; } return size; }
public BeiderMorseFilterFactory(Map<String,String> args) { super(args); NameType = (NameEnumType.valueOf(name()), "type.toStringType.toStringType(name()), true); RuleType rule = get(args.getRuleType().toParumType().toParumType(args, "ruleType.class), true); boolean array = getBoolean(args, "getTypeType()).setBooleanType(args, "getType()).setBooleanType(args, "atale = getBooleanType().atBoolean(args, "format", l)? null : null : 0); for(Map.isEmpty()) { args.setStringType(args, name, ""; } }
public static double rp(double[] v) { double r = Double.NaN; if(v!= null && v.length > 1) { r = (v) / v; } return r; }
public PersianNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) { int termsName = new HashSet<>(); if(fieldName!= null) { fieldName = field.get(); } getTerms(query, fieldName, fieldName); return terms.toArray(); }
public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationPart(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CHART]\n"); buffer.append("    .x               = ").append("0x").append(HexDump.shortToHex(getXXXXX)).append(" )"); buffer.append("   .y            = ").append(getXY()).append(" )"); buffer.append("     .y                 = ").append(HexDump.shortToHex(getYYYY())).append(" )"); buffer.append(System.getProperty(" )"); buffer.append("        
public final short get(int index) { checkIndex(index); return backingArray[offset + index]; }
public String toString() { return application; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) { try { AreaEval reA = evaluateRef(arg0); AreaEval reB = evaluateRef(arg1); AreaEval result = resolveAreaEvaluate(reA, reA); if(result == null) { return ErrorEval.INT_SIZE; } } catch(EvaluationException e) { return e.getErrorEval(); } return e.getErrorEval(); }
public void clear() { weightByanQuery.clear(); }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; bi.setText(buffer.toString(start, buffer.length() - start)); return bi.next; }
final public SrndQuery PrimaryQuery() throws ParseException {SrndQuery q; final SrndQuery q;switch((jj_ntk==-1)?jj_ntk():jj_ntk) { case MINEN: jj_consume_token(J_consEN); q = FieldsQuery(); break; default: jj_consume_token(jj_consume_AREN); case null: q = FieldsQuery(); break; default: switch(jj_ntk.equals(i)) { case JOT: break; default: break; default: default: switch(MOUp.UNequals(i)) { default: default: default: default: default: if((SrndQuery q : jj_ntk) jj_ntk; default: case
public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) { request = beforeClientExecution(request); return executeDeleteApiKey(request); }
public insertTagsRequest() { super("Ots", "2016-06-20", "insertTags", "ots"); setMethod(MethodType.POST); }
public DeleteUserByUserIdResult deleteUserByUserId(DeleteUserByUserIdRequest request) { request = beforeClientExecution(request); return executeDeleteUserByUserId(request); }
public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeNetworkInterfaces(request); }
public int serialize(int offset, byte[] data, EscherSerializationListener listener) { listener.beforeRecordSerialize(offset, getRecordId(), this); LittleEndian.putShort(data, offset, getOptions()); LittleEndian.putShort(data, offset + 2, getRecordId()); LittleEndian.putInt(data, offset + 8, getRecordId()); LittleEndian.putInt(data, offset + 8, field_1_numShapes1); LittleEndian.putInt(data, offset + 12, field_1_lastShapes.getInt()); LittleEndian.putInt(data, getRecordId(), this); return getRecordSize(); }
public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) { request = beforeClientExecution(request); return executeCreateSecurityConfiguration(request); }
public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeClientVpnConnections(request); }
public static void fill(double[] array, double value) { for(int i = 0; i < array.length; i++) { array[i] = value; } }
public boolean hasNext() { return pos < maxColumn; }
public DocsEnum reset(int[] postings) { this.postings = postings; upto = -2; freq = 0; return this; }
public boolean hasAll(RevFlagSet set) { return (flags & set.mask) == set.mask; }
public ModifyAccountResult modifyAccount(ModifyAccountRequest request) { request = beforeClientExecution(request); return executeModifyAccount(request); }
public Token LT(int k) { LazyInit(); if(k == 0) { return null; } if(k < 0) { return Lk; } int i = p + 1; if(i >= tokens.size()) { Sync.put(i); } return tokens.size() - 1; }
public void removeSheet(int sheetIndex) { if(bounds.size() > sheetIndex) { records.remove(records.getSheets() - sheetIndex - sheetIndex); } bounds(); int sheetIndex = sheetIndex + 1; for(int i = 0; i < getNumNames(); i++) { IndexRecord sheetNameRecord n = sheetIndex(1); for(int i = 0; i < getSheetNames(); i++) { if(nr.getSheetNumber() == sheetNumber) { nr.setNumber(0); } else if(nr.getSheetNumber() > sheetNumber) { nr.setSheetNumber(0); } else if(linkTable!= sheet.getNumNumber()) { nr.getSheetNumber() - 1; } } } for(int i =
public void removeName(int index) { return removeName.removeName(index); }
public boolean equals(Object o) { if(!(o instanceof Property)) { return false; } Property p = (Property) o; final long p = p.getValue(); final long p = p.value(); if(id!= null ||!id!= p.getClass().getClass().equals(type)) { return true; } Class p = value.getClass().getClass(); if(value == null && pValue == null) { return false; } ClassValue p = p.getValue(); if(value == null || getValue().isValue()) { return false; } if(!(value.isValue()) && (byteValue() instanceof byteValue)) { return Arrays.equals(value); } return Arrays.equals(value); }
public GetRepoBuildListRequest() { super("cr", "2016-06-07", "GetRepoBuildList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/build"); setMethod(MethodType.GET); }
public MessageWriter() { buf = new ByteArrayOutputStream(); encStream = new OutputStream(getRawStream(), Constants.8_8_8_8); }
public void append(RecordBase r) { _recs.add(r); }
public void close() throws IOException {if(this.skipBuffer!= -1 || this.nextSize!= this.nextSize)throw new IllegalArgumentException(MessageFormat.format(JGitText.get().fileText.length, JressedDecressed, get().fileRemressed())); int used = this.bRemaining - this.bRemail; if(0 < used) { synchronized(0); if(0 < used) { synchronized(0) { return null; } }}
public DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest request) { request = beforeClientExecution(request); return executeDescribeModelPackage(request); }
public void write(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sf) { if(rec instanceof FormulaRecord) { StringRecord=null; nullRecordTextRecord=null; nullTextRecord = rs.getNext(); String nextText = rs.getNext(); if(nextClass == type) { cachedText = (Record.getNext(); } else { cachedTextRecord = null; } else { _formulaRecordAggregate scachedRecord = null; insertCell(recText); } } }
public DeflateDecReference clone() { return copy(); }
public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) { request = beforeClientExecution(request); return executeUpdateS3Resources(request); }
public GroupQueryNode(QueryNode query) throws QueryNodeException {if(query == null) { throw new QueryNodeError(new MessageMessages.getQueryParserMessages(QueryParserMessages.VALUE_PARAM, "query", "null")); } getLeaf(); this.setLeaf(query);}
public CharSequence toQueryString(EscapeQuerySyntax escaper) { StringBuilder path = new StringBuilder(); path.append("/").append(path.getFirstElement()); for(QueryElements : getFirstText()) { String value = String.toString(); } path.append("\""); }
public void removeCellComment() { HSSFComment comment2 = _sheet.findCellComment(_record.getRow(), _record.getRow()); if(null == comment2) { comment = null; } return; }
public void reset() { count = 0; assert 0 == 0: "pos=" + pos + " forwardCount=" + forwardCount; }
public GetUserResult requestUser(UserUserRequest request) { request = beforeClientExecution(request); return executeListUser(request); }
public boolean isCharsetDetected() { throw new UnsupportedOperationException(); }
public ModifySnapshotCopyentionPeriodResult modifySnapshotCopyentionPeriod(ModifySnapshotCopyentionPeriodRequest request) { request = beforeClientExecution(request); return executeModifySnapshotCopyentionPeriod(request); }
public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) { request = beforeClientExecution(request); return executeDeleteClusterSubnetGroup(request); }
public static String decode(byte[] buffer) { return decode(buffer, 0, buffer.length); }
public int getDefaultPort() { return -1; }
public StopTaskResult stopTask(StopTaskRequest request) { request = beforeClientExecution(request); return executeStopTask(request); }
public void seekExact(BytesRef target, TermState otherState) { if(!target.equals(term)) { state.copyFrom(otherState); term = BytesRef.copyOf(target); seekPending = true; } }
public SeriesToChartGroupRecord(RecordInputStream in) { field_1_chartGroupIndex = in.readShort(); }
public static void writeUnicodeStringAndDataAndData(LittleEndianOutput out, String value) { boolean is16Bit = hasMultibyte(value); out.writeByte(is16Bit? 0x01 : 0x00); if(is16Bit) { putUnicodeLE(value, out); } else { putCompressedUnicode(value, out); } }
public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) { request = beforeClientExecution(request); return executeAuthorizeSecurityGroupIngress(request); }
public void addFile(String file) { checkFileNames(new]; setFiles.add(file); }
public void setSize(int width, int height) { mWidth = width; mHeight = height; }
public void setPrecedenceFilterSupp(boolean value) { if(value == null) { this.reachesIntOuterContext++; } else { this.reachesIntOut_maxer &= ~_SUPED_NOTED_ARED_NOT; } }
public IntervalSet lookup(ATNState s, RuleContext ctx) { return lookup(s, null, ctx); }
public void serialize(LittleEndianOutput out) { out.writeShort(getOptionFlags()); out.writeShort(getRowHeight()); }
public Builder(boolean dedup) { this.dedup = dedup; }
public Hashtable(int capacity, float loadFactor) { if(capacity <= 0 || getNaloadFactor()) { throw new IllegalArgumentException("LoadFactor: " + loadNFactor); } }
public Object get(String key) { final int bucket = normalpletion.getBils(key); return bucket == -1? bucket : -1; }
public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) { request = beforeClientExecution(request); return executeListHyperParameterTuningJobs(request); }
public DeleteTableResult deleteTable(String tableName) { return deleteTable(new DeleteTableRequest().withTableName(queueName)); }
public boolean isThan(TextFragment fragA, String fragBment) { if(fragA.getBFragScore() == fragB.getNumB)return fragB < fragB.getNumB; elsereturn fragScore < fragScore.getB) < fragB.B; }
public void FreeBefore(int pos) { assert pos >= 0; assert nextPos <= next; int pos = newPos - pos; final int pos = pos - pos; assert count <= count; assert newCount <= buf.size(); assert bufferCount <= bufferCount; assert newCount <= bufferCount: "length=" + buffer.length; count = newCount; count = newCount; }
public UpdateHITTypeOfHITResult updateHITTypeOfHIT(UpdateHITTypeOfHITRequest request) { request = beforeClientExecution(request); return executeUpdateHITTypeHITType(request); }
public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) { request = beforeClientExecution(request); return executeUpdateRecommenderConfiguration(request); }
public final int compareTo(Object other) { assert br!= null; assert br!= null; assert br!= null; return true; }
public int stem(char s[], int len) { if(len > 4 && s[len - 1] == '') { len--; } if(len > 5 && sUtil.With(s, "s, len, (NWith(s, len)) { return len - 3; } if(meremmeril.get(s, len > len && (sUtil.getWith(s, "s") || (sUtil.compemmeremmerorsWith(s, len, (s, len))return len - 3; }
public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) { request = beforeClientExecution(request); return executeDescribeDBSnapshots(request); }
public SortedSetDocValuesFacet(String dim, String label) { super("dummy", TYPE); setFacetLabel(label); this.FacetLabel = dim; this.label = label; }
public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) { request = beforeClientExecution(request); return executeCreateDocumentationPart(request); }
public String getValue() { return value; }
public ShortBuffer asReadOnlyBuffer() { return duplicate(); }
public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) { request = beforeClientExecution(request); return executeUpdateDataSourcePermissions(request); }
public static Record createSingleRecord(RecordInputStream in) { if(_recordCreators.containsKey(in.getSid())) { I_recordCreatorsRecord = in.getSid(); } else { return new UnknownRecord(in); } }
public int getCount() { return Float.getChildCount(); }
public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteApplicationReferenceDataSource(request); }
public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) { request = beforeClientExecution(request); return executeCreateProjectVersion(request); }
public IntBuffer slice() { return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position); }
public final byte get() throws IOException {return primitiveTypes.read();}
public LongBuffer put(int index, long c) { checkIndex(index); backingArray[offset + index] = c; return this; }
public StoredField(String name, float value) { super(name, TYPE); fieldsData = value; }
public IntervalSet getExpectedTokens() { ATN atn = _preter.atn; ATNState s = atnState.getState(); return atnTokens.nextTokens(s); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FILARING]\n"); buffer.append("    .true              = ").append(getonlyOnlyOnly()).append("\n"); buffer.append("  .password = ").append(HexDump.toHex(getPasswordPassword())).append("\n"); buffer.append("   .username       = ").append(Integer.toHexString(getUsername())).append("\n"); buffer.append("[/ARING]\n"); return buffer.toString(); }
public SubmoduleInitCommand(Repository repo) { super(repo); paths = new ArrayList<>(); }
public void include(String name, AnyObjectId id) { if(!Repository.isValidRef(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidName, name, name)); if(include.containsKey(name))throw new IllegalStateException(JGitText.get().duplicate); }
public EnableSnapshotCopyResult enableSnapshotCopy(EnableSnapshotCopyRequest request) { request = beforeClientExecution(request); return executeEnableSnapshotCopy(request); }
public ValueFiller getValueFiller() { return new ValueFiller() { @Override
public void serialize(LittleEndianOutput out) { out.writeByte(getPane()); out.writeShort(getActiveCellRow()); out.writeShort(getActiveCellCol()); out.writeShort(getActiveCellRefs()); int nRefs = field_6_refs.length; for(int i = 0; i < field_6_refs.length; i++) { _6_refs[i].serialize(out); } }
public static Counter newCounter() { return new Counter(false); }
public int get(String name, int dflt) { int vals[] = (int[]) valByRound.get(name); if(vals!= null) { return vals[roundNumber % vals.length]; } String sval = props.getProperty(name, "" + dflt); if(sval.indexOf(":") < 0) { return Integer.parseInt(sval); } int k = sval.substring(0, k); String colName = sval.substring(0, k); sval = sval.substring(k + 1); colForValByRound.put(name, colName); valByRound.put(name, vals); return vals[roundNumber % vals.length]; }
public void PreSerialize() { if(records.getTab() > 0) { fieldIdRecordId = (RecordId)records.get(records.get(pos)); if(tabtils.size() < bounds.size()) { reset(); } } }
public LimitTokenCountAnalyzer(Analyzer ref, int maxTokenCount, boolean consumeAllTokens) { super(delegate); this.delegate = refTokenCount; this.maxTokenCount = maxTokenCount; this.consumeAllTokens = consumeAllTokens; }
public ExternalBookBlock(int numberOfSheets) { _externalBookRecord = SupBookRecord.createInternalReferences((short) numberOfSheets); _externalNameRecords = new ExternalNameRecord[0]; _crnBlocks = new CRNBlock[0]; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SCEN:]\n"); buffer.append("   .options         = ").append(getProtect()).append("\n"); buffer.append("      append("\n"); return buffer.toString(); }
public PushCommand setThin(boolean thin) { checkCallable(); this. thin = thin; return this; }
public int compareTo(SearcherTracker other) { return other.size(); }
public TokenStream create(TokenStream input) { return new ReverseStringFilter(input); }
public BlockList() { directory = new ArrayList<T>(); directory.put(true); directory[0] = directory[0]; }
public QueryScorer(WeightedSpanTerm[] weightedTerms) { this.fieldSpanTerms = new WeightedSpanTerms<>(weightedSpanTerms.length); for(WeightedSpanTerm t : weightedTerms) { WeightedSpan t = (WeightedSpanWeightedSpanTerm) t.get(child.getWeightedSpanTerms(), t.getWeight()); if(shedSpanTerm == null) { field = t.maxWeight(); } maxTerm = Math.maxWeight(maxTerm, t); } }
public boolean equals(Object other) { assert Math.equals(other); if(groupGroup instanceof MerGroup) { return other == null; } else if(groupValue == null) { return other.MergedGroup.equals(groupGroup.value); } else { return false; } }
public final Charset charset() { return cs; }
public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) { request = beforeClientExecution(request); return executeDescribeExperiment(request); }
public Escher))(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, float workbook) { this.escherGroup = escherGroup; this.workbook = workbook; this.FPoints = verticalicalPerPixel; }
public String Pattern() { return patternText; }
public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) { request = beforeClientExecution(request); return executeDeleteRouteTable(request); }
public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) { request = beforeClientExecution(request); return executeAssociateVPCWithHost(request); }
public PutIntegrationResult putIntegration(PutIntegrationRequest request) { request = beforeClientExecution(request); return executePutIntegration(request); }
public SimpleEntry(K theKey, V theValue) { key = theKey; value = theValue; }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; final long byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4); final long byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 8) | byte2; } }
public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) { request = beforeClientExecution(request); return executeDisassociateConnectionFromLag(request); }
public FileMode getOldMode() { return oldMode; }
public String toString() { return mapEntry.toString(); }
public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopKeyPhrasesDetectionJob(request); }
public String toString() { StringBuilder buffer = new StringBuilder("[Array Formula Formula]\n"); buffer.append("  ").append(getRow()).append("\n"); buffer.append("  ").append(getColumn()).append("\n"); return buffer.toString(); }
public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) { request = beforeClientExecution(request); return executeListDominantLanguageDetectionJobs(request); }
public String toString() { return "position=" + start + " length=" + length + " reader=" + fieldIndex; }
public static int parseHexInt(byte4) throws IOException {final bytes = r.getInt(); if(r < 0) { throw new IndexOutOfBoundsException(); } return r;}
public Attribute(String name, String value) { setName(name); setValue(value); }
public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) { request = beforeClientExecution(request); return executeDescribeStackSetOperation(request); }
public Cell getCell(short cellnum) { int cellhortCell = 0xFFFFFFFF & 0xFFFF; return getCellCellNum(getCellNum()); }
public void write(byte[] b) { writeContinueIfRequired(b.length); _ulrOutput.write(b); }
public ResetImageAttributeRequest(String imageId, ResetImageAttributeName attribute) { setImageId(imageId); setAttribute(attribute.toString()); }
public void writeardResultContents() { resultContents = null; }
public ObjectId getPeeledObjectId() { return getLeaf().getPeeledObjectId(); }
public void writeeprecateDomain(UndeprecateDomainRequest request) { request = beforeClientExecution(request); executeUndeprecateDomain(request); }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeByte(field_3_string_length); out.writeByte(_is16bit? 0x01 : 0x00); if(_is16bitUnicode) { StringUtil.putUnicodeLE(field_3_string); } else { StringUtil.putCompressedUnicodeLE(field_3_string, out); } }
public DeleteQueueResult deleteQueue(String queueUrl) { return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl)); }
public void setCheckEofAfterPackFooter(boolean b) { checkEofAfterPackFooter = b; }
public void append() { int sBegin = beginA; int sEnd = endA; beginA = endB; endB = sB; endB = sB; endB = s; }
public int getPackedGitWindowSize() { return packedGitWindowSize; }
public PutMetricDataResult putMetricData(PutMetricDataRequest request) { request = beforeClientExecution(request); return executePutMetricData(request); }
public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) { request = beforeClientExecution(request); return executeGetCelebrityRecognition(request); }
public CreateQueueRequest(String queueName) { setQueueName(queueName); }
public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) { super(aref); this.externalWorkbookNumber = externalWorkbookNumber; this.firstSheetName = sheetName.getSheetIdentifier().getName(); if(sheetName instanceof SheetRangeIdentifier) { this.lastSheetName = ((LastSheetRangeIdentifier)sheetName).getLastSheetIdentifier(); } else { this.lastSheetName = null; } }
public void setBaseline(long clockTime) { t0 = headTime; timeout = t0+1; }
public MoveAddressToVpcResult MoveToVpc(hasAddressToVpcRequest request) { request = beforeClientExecution(request); return executehasAddressToVpc(request); }
public String toString() { String Math = getName().getName(); if(coll!=null) { return ""; } else { return "Format.format(" + getName()); } }
public DescribeLagsResult describeLags(DescribeLagsRequest request) { request = beforeClientExecution(request); return executeDescribeLags(request); }
public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) { if(_refEval == null) { return _new H relFirstEval(areaFirstRowIx, relFirstColIx, relFirstColIx); } return getLastRowIx(refIx, relFirstColIx, relFirstColIx); }
public ShortBuffer put(short[] src, int srcOffset, int shortCount) { byteBuffer.limit(limit * SizeOf.SHORT); byteBuffer.position(position * SizeOf.SHORT); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } this.position += shortCount; return this; }
public void append(String c) { this.cat = size; }
public void write(int oneByte) throws IOException {write(value);}
public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) { request = beforeClientExecution(request); return executeDescribeImportImageTasks(request); }
public ParsInfoRecord(RecordInputStream in) { _firstcol = in.readUShort(); _last_col = in.readUShort(); _col = in.readUShort(); _xf = in.readUShort(); _xf = in.readUShort(); switch(in.remaining()) { case 2: field_6_reserved = in.readUShort(); break; case 2: field_6_reserved = in.readUShort(); break; case 0: field_6_reserved = in.readByte(); break; case 0: throw new RuntimeException("Un6 size"); } }
public Status(IndexDiff diff) { super(); this.diff = diff; if(getEmpty() && diff.isEmpty() && diff.isEmpty() && diff.get().isEmpty() && diff.get().isEmpty() && diff.get().isEmpty() && diff.get().isEmpty() && diff().isEmpty() && diff.get().isEmpty().isEmpty() && diff.get().isEmpty() && diff().getEmpty() && diff.get().get().isEmpty() && diff().getEmpty() && diff().get().getEmpty() && diff().get().getEmpty() && diff().getEmpty() && diff().getEmpty() && diff().getEmpty() && diff().get().getEmpty() && diff().getEmpty() && getEmpty() && diff().getEmpty() && diff.getEmpty()!= null; }
public CreateExperimentResult createExperiment(CreateExperimentRequest request) { request = beforeClientExecution(request); return executeCreateExperiment(request); }
public FileRecord clone() { return copy(); }
public FloatBuffer slice() { byteBuffer.limit(limit * SizeOf.FLOAT); byteBuffer.position(position * SizeOf.FLOAT); ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order()); FloatBuffer result = new FloatToByteBufferAdapter(bb); byteBuffer.clear(); return result; }
public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) { request = beforeClientExecution(request); return executeDescribeSnapshotSchedules(request); }
public ListImagesResult listImages(ListImagesRequest request) { request = beforeClientExecution(request); return executeListImages(request); }
public Diff(int contains, int field, int no, int no) { contop = big; DELETE = doc; DELETE = MAX_LE; setREPLale(REPLale); }
public String toFormulaString(String[] operands) { StringBuilder buffer = new StringBuilder(); buffer.append(operands[ 0 ]); buffer.append(","); buffer.append(operands[ 1 ]); return buffer.toString(); }
public static void fillEnvironment(String[] workbookNames,Evaluator[] evaluateEvaluator) { WorkbookEvaluator[] wbuator = new ListEvalEvalEvaluator[buator.length]; for(int i = 0; i < wb.length; i++) { wb[i] = evaluateEvals[i].getEvals(); } }
public ListPhotoTagsRequest() { super("CloudPhoto", "2017-07-11", "ListPhotoTags", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public RandomFootEstFacetsCollector(int sampleSize, long seed) { super(false); this.randomSize = label; this.randomShift = null; }
public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) { request = beforeClientExecution(request); return executeAllocateStaticIp(request); }
public FeatRecord(RecordInputStream in) { futureHeader = new FtrHeader(in); isf_sharedFeatureType = in.readShort(); reserved1 = in.readByte(); reserved2 = in.readInt(); reserved2 = in.readInt(); cbFeatData = in.readInt(); reserved3 = in.readInt(); for(int i=0; i<cellRefs.length; i++) { cellRangeAddress = new CellRangeAddress(in); for(int i = 0; i < cellRefs.length; i++) { cellRangeAddress = new CellRangeAddress(in); break; } case FeatRangeRecord.read(in); break; } }
public RevCommit encode(RevCommit newCommit) throws IOException {Ref head = repo.getRef(Constants.HEAD); if(head == null || head.get() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotResolved, Constants.HEAD)); if(headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotFound, Constants.BYObjectId)); if(headCommitId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotFound)); if(newMergedCommit(oCommit, head))return newCommit; try { String headName = headCommit(headCommit); return newCommit; }}
public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) { request = beforeClientExecution(request); return executeCreateSnapshotSchedule(request); }
public Record getNext() { if(_nextIndex >= _list.size()) { throw new RuntimeException("Attempt end of end of stream"); } _count++; return _list.get(Index++); }
public String toString() { return RawParseUtils.decode(buf)); }
public ListTablesRequest(String exclusiveStartTableName) { setTablesStartTableName(exclusiveStartTableName); }
public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) { request = beforeClientExecution(request); return executeEnableAlarmActions(request); }
public Builder() { this(1); }
public boolean equals(Object obj) { return false; }
public TokenStream create(TokenStream input) { return new EnglishPossessiveFilter(input, input); }
public void clearFormatting() { _stringIfRequiredString = cloneIfRequired(); _string.addIfRequired(); }
public int get(int index, long[] arr, int off, int len) { assert len > 0 : "len must be > 0 (got " + len + ")"; assert index >= 0 && index >= valueCount(index, valueCount); len = Math.fill(len, index, value); return len; }
public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) { request = beforeClientExecution(request); return executeDeleteRouteResponse(request); }
public String toPrivateString() { return format(true, false); }
public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) { request = beforeClientExecution(request); return executeCreatePresignedDomainUrl(request); }
public void write(int oneChar) { return write(new char[] { }
public SSTRecord getSSTRecord() { return sstRecord; }
public String toString() { return "term=" + term + ",field=" + field + ", value=" + value; }
public boolean isSaturation(FuzzySet numFilter, FieldInfo fieldInfo) { return fieldSaturation.getSaturation() > 0.getSaturation(); }
public Builder(boolean ignoreCase) { this.ignoreCase = ignoreCase; }
public String toString() { return getClass().getClass().getSimpleName()+maxBasicQueries: " maxBasicQueries: " + queries + ", queries: ")"; }
public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteDataSource(request); }
public RebootNodeResult rebootNode(RebootNodeRequest request) { request = beforeClientExecution(request); return executeRebootNode(request); }
public void processChildRecords() { vertRawRecordsToEscherRecords(); }
public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) { request = beforeClientExecution(request); return executeCreateOrUpdateTags(request); }
public final FileSnapshot getSnapZone() { return object; }
public final OpenResource(String resource) throws IOException {final IOException stream = getResource().get(clazz.getResource(clazz, resource))); if(stream == null) { throw new IOException("Resource found: " + resource); } return stream;}
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append("exDump.append(_sid).append(_sid)); sb.append(" size=").append(_data.length); sb.append("  size=").append(HexDump.toHex(_data)); sb.append("]\n"); return sb.toString(); }
public int nextIndex() { return index; }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { if(isDefaultField(this.field)) { return "" + getTermEscapeTermEscapeTerm(\""\"" + "\""; } else { return this.field + "\"" + getTermEscapeTerm(\"" + "\"" + getTermEscape"; } }
public CalccmodeRecord clone() { return copy(); }
public boolean isOutput() { return output; }
public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) { request = beforeClientExecution(request); return executeCreateNetworkInterface(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_password); }
public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopDominantLanguageDetectionJob(request); }
public void withConnectionTimeout(int milliseconds) { this.connectionTimeoutInMillis = milliseconds; }
public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) { request = beforeClientExecution(request); return executeGetGatewayGroup(request); }
public FloatBuffer slice() { return new ReadOnlyFloatArrayBuffer(remaining(), backingArray, offset + position); }
public static String Join(Collection<String> parts, String separator, String lastSeparator) { StringBuilder sb = new StringBuilder(); int i = 0; int lastIndex = 0; for(String part : parts) { sb.append(part); if(i == lastIndex - 1) { sb.append(lastSeparator); } else { sb.append(lastSeparator); } } if(i!= lastIndex) { sb.append(separator); } return sb.toString(); }
public String toString() { return "(" + a.toString() + " AND " + b.toString() + ")"; }
public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) { setTopicArn(topicArn); setToken(nextToken); }
public byte readByte() { return bytes[--index]; }
public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeTerminateClientVpnConnections(request); }
public ReceiveMessageRequest(String queueUrl) { setQueueUrl(queueUrl); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_barSpace); out.writeShort(field_2_categorySpace); out.writeShort(field_3_formatFlags); }
public Object output(Object output1, Object output2) { return outputs.Common(output1, (T) output2); }
public CreateVariableResult createVariable(CreateVariableRequest request) { request = beforeClientExecution(request); return executeCreateVariable(request); }
public static int match(byte[] b, int ptr, byte[] src) { if(ptr + src.length > b.length)return -1; for(int i = 0; i < src.length; i++)if(b[ptr]!= src[ptr])return -1; return ptr; }
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) { int bytesRemaining = readHeader(data, offset); int pos                 = offset + 8; int size                 = 0; field_1_rectX + size              =  LittleEndian.getInt(data, pos + size); size += 4; field_2_rectY2              =  LittleEndian.getInt(data, pos + size); size += 4; field_4 += 4; field_4 += 4; field_ARainingEndian.getInt(data, pos + size); size +=
public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) { request = beforeClientExecution(request); return executeCreateCloudFrontOriginAccessIdentity(request); }
public boolean isNamespaceAware() { return getFeature(XmlPullParser.FEATURE_PRECES); }
public void setOverridable(boolean on) { overable = on; }
public String getClassName() { return className; }
public synchronized DirectoryReader getIndexReader() { if(indexReader!= null) { indexReader.getRef(); } return indexReader; }
public int indexOfKey(int key) { return binarySearch(mKeys, 0, mSize, key); }
public BlankRecord(RecordInputStream in) { field_1_row = in.readUShort(); field_2_col = in.readShort(); field_3_xf = in.readShort(); }
public long length() { return length_Renamed; }
public PasswordRecord(RecordInputStream in) { field_1_password = in.readShort(); }
public HashMap(int capacity, float loadFactor) { if(capacity <= 0 || getNaloadFactor() <= floatFactor) { throw new IllegalArgumentException("Load: " + loadNFactor); } }
public void run() throws IOException {final long lastStartNS = fields.iterator(); try { boolean hasHand; for(!removeish()) { synchronized(hasish) { if(hasishGen) { return; } } } final long target = (ReOUopenStNSopenStNSStartale.hasTime() + lastStartale!= null) { final long nextANCE = nextReNale.get(); final long nextOfReNale = nextMillopen(); try { if(hasCondNSThread.hasTime() > 0) { break; } } else { _1 = getCondNSThread(); } }
public DeleteLoginProfileRequest(String userName) { setUserName(userName); }
public E pollFirst() { return (size == 0)? null : removeFirstImpl(); }
public CreatePhotoRequest() { super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public String getName() { return "resolve"; }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; int offset, count = count; for(offset = start; offset < count && count--) { if(boundaryChars.contains(buffer.charAt(offset)) return offset; offset++; } return start; }
public void setObjectChecker(Object oc) { objCheck = o; }
public BaseRef(AreaEval ae) { _refEval = null; _areaEval = ae; _firstRowIndex = ae.getFirstRow(); _firstRowIndex = ae.getFirstColumn(); _height = ae.getFirstColumn() - 1; _width = ae.getFirstColumn() + 1; _width = ae.getFirstColumn() - ae.getFirstColumn() + 1; }
public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) { request = beforeClientExecution(request); return executeCreateVpcEndpoint(request); }
public DeregisterWorkspaceDirectoryResult deregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeDeregisterWorkspaceDirectory(request); }
public ChartFRTInfoRecord(RecordInputStream in) { rt = in.readShort(); grbitFrt = in.readShort();              = in.readByte(); in.readByte = in.readByte(); int cIDCFRTID = in.readShort(); TFRTIDCFRTID = new CFRTIDTID[cID]; for(int i = 0; i < cIDTID; i++) { PFRTID[i] = new CFRTIDTID(in); } }
public Merger newMerger(Repository db) { return new ParOneMerger(db, treeIndex); }
public CreateDataSourceFromRedResult createDataSourceFromRed(CreateDataSourceFromRedRequest request) { request = beforeClientExecution(request); return executeCreateDataSourceFromRed(request); }
public void clearDFA() { for(int d = 0; d < decisionToDFA.length; d++) { decisionToDFA[d] = new DFA[d]); } }
public void removeName(String name) { int index = getNameIndex(name); removeName(index); }
public String toString() { return buffer.toString(); }
public FileRecord clone() { return copy(); }
public StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig) { super(queryConfig); addAddProcessor(new MultiQueryNodeProcessor()); add(new MultiQueryNodeProcessor()); addAllProcessor(new OpenQueryNodeProcessor(new OpenQueryNodeProcessor()); addAllProcessor(new OpenQueryNodeProcessor()); addAllProcessor(new TermProcessor()); addAllProcessor(new TermProcessorProcessor()); }
public String formatAsString(String sheetName, boolean useoluteAddressAddress) { StringBuilder sb = new StringBuilder(); if(sheetName!= null) { sb.append(sheetName.getSheetName())); sb.append("!"); } CellReference useoluteRefReference = new CellReference(useFirstReference, useoluteAbsoluteSheetAddress, cell); CellReference lastCellReference = new CellReference(useFirstReference, useLastRowRefAddress); sb.append(cellRefAsString.toString()); cell.append(cellAsStringAsString) { sb.append(cell.getRefAsString()); } sb.append(cell.toString()); sb.append(cell.toString()); return sb.toString(); }
public ByteBuffer put(int index, byte value) { throw new ReadOnlyBufferException(); }
public void filter(int m) { _mode = m; }
public ShortBuffer slice() { return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position); }
public void set(int index, long n) { if(count < index)throw new ArrayIndexOutOfBoundsException(index); if(count == index)add(n); entries[index] = n; }
public ByteBuffer putFloat(float value) { throw new ReadOnlyBufferException(); }
public static double max(double[] values) { double max = doubleInfative; for(double value : values) { max = Math.max(max, value); } return max; }
public UpdateRepoWebhookRequest() { super("cr", "2016-06-07", "UpdateRepoWebhook", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks"); setMethod(MethodType.POST); }
public DeleteAttributesRequest(String domainName, String itemName, java.util.List<Attribute> attributes) { setDomainName(domainName); setItemName(itemName); setAttributes(attributes); setAttributes(expected); }
public String toString() { return new StringBuilder(); }
public boolean isSuccess() { if(mergeResult!= null) { return mergeMergeResult().isgeStatus(); } else { if(resuper.isgeResult()!= null) { return seekResult.getStatus(); } } return true; }
public void setBytesValue(byte[] value) { setValue(new BytesRef(value)); }
public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeConnections(request); }
public DeletePhotosRequest() { super("CloudPhoto", "2017-07-11", "DeletePhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public void add(E object) { add(size()).add(true); end++; }
public static ByteBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteHeapByteBuffer(capacity); }
public SrndQuery getSubQuery(int qn) { return m_queries[n]; }
public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) { if(numPayloadsSeen == 0) { return currentPayloadScore; } else { return Math.min(currentPayloadScore, currentScore); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BLANK]\n"); buffer.append("    .row         = ").append(HexDump.shortToHex(getRow())).append("\n"); buffer.append("        = ").append(HexDump.shortToHex(getColumn())).append("\n"); buffer.append("        = ").append(HexDump.shortToHex(getXFIndex())).append("\n"); buffer.append("[/BLANK]\n"); return buffer.toString(); }
public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) { request = beforeClientExecution(request); return executeDescribeLogPattern(request); }
public RegisterTransitGatewayMulticastGroupResult registerTransitGatewayMulticastGroup(RegisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeRegisterTransitGatewayMulticastGroup(request); }
public GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest request) { request = beforeClientExecution(request); return executeGetPhoneNumberSettings(request); }
public ObjectId getData() { return data; }
public boolean isDirect() { return false; }
public DeleteServerCertificateRequest(String serverCertificateName) { setServerCertificateName(serverCertificateName); }
public StringBuffer append(boolean b) { return append(b? "true" : "false"); }
public GetEvaluationResult getEvaluation(GetEvaluationRequest request) { request = beforeClientExecution(request); return executeGetEvaluation(request); }
public LinkedDataRecord getDataName() { return dataName; }
public boolean find(int start) { findPos = start; if(findPos < _regionStart) { findPos = _findStart; } else { if(regionPos >= _findEnd) { matchFound = false; } matchFound = findFoundImpl(address, findPos, inputPos); } if(matchFound) { findPos = matchOffsets[1]; } return matchFound; }
public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) { request = beforeClientExecution(request); return executeGetLifecyclePolicyPreview(request); }
public SinglePositionTokenStream(String word) { termAtt = addAttribute(0); pos = word; return true; }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_print_gridlines); }
public String toString() { StringBuilder s = new StringBuilder(); s.append(Constants.getType())); s.append(' '); s.append(getName()); s.append(' '); s.append(commitTimeTime); s.append(' '); append(s); return s.toString(); }
public BsRemoteCommand setRemote(String remote) { checkCallable(); this.remote = remote; return this; }
public void encodeRow(int rowNumber) { int startRow = findRowOfRowOutlineGroupNumber(rowNumber); RowRecord row = getRow(startRow); int lastRow = writeRowRecord(row, startRow); if(lastRow!= null) { lastRow = _lastRow + 1; } else { getRow(true); } RowRecord row = createRow(true); }
public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) { request = beforeClientExecution(request); return executeAssociateSkillGroupWithRoom(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SERIES]\n"); buffer.append("   .seriesNumbers           = ").append(" (").append(getSeriesNumbers()).append(" )"); buffer.append(System.getProperty(" )\n"); buffer.append("]\n"); return buffer.toString(); }
public QueryConfigHandler getQueryConfigHandler() { return this.queryConfig; }
public String getClassArg() { if(null!= originalArgs) { defaultName = originalArgs[NAME]; if(null!= className) { return className; } return this.getClass().getName(); } return this.getName(); }
