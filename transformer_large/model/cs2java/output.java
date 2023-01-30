public void serialize(LittleEndianOutput out) { out.writeShort(field_1_vcenter); }
public void addAll(UtitUtil.List<Til) { if(src.size() == 0)return; int srcDirIdx = 0; for(; srcDirIdx < srcDir.length; srcDirIdx++) { addAll(src[values], 0x, srcDir); } addAll(src, srcIdx, 0x); }
public void writeByte(byte b) { if(values.blockSize ==blockSize) { if(currentBlock!= null) { getBlock(currentBlock); getBlock(currentBlock); } block = new byte[blockSize]; getBlock(); } byteo = 0; }
public ObjectId getObjectId() { return objectId; }
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) { request = beforeClientExecution(request); return executeDeleteDomainEntry(request); }
public long ramBytesUsed() { return fst == null? 0 : fst.ramBytesUsed(); }
public final String getFullMessage() { byte[] raw = buffer; int msgB = RawParseUtils.parseMessage(raw, 0); if(msgB < 0) { return ""; } return RawParseUtils.decode(raw, raw.length); }
public CIFSSystemSystem() { HeaderBlock header = new HeaderBlockBlock(getBlockSize()); _header = new ArrayList<>(); _docTable                                                                                                                                                                     
public void init(int slice) { pool.checkBuffers[address >>> ByteBlockPool.BYTE_SIZE]; assert slice!= null; upto = ByteBlock & ByteBlockPool.BYTE_SIZE; assert offset < ByteBlock; assert slice.0; }
public SubmoduleAddCommand setPath(String path) { this.path = path; return this; }
public ListIngestionsResult listIngestions(ListIngestionsRequest request) { request = beforeClientExecution(request); return executeListIngestions(request); }
public QueryParserTokenManager(CharStream stream, int lexState) { this(stream); SwitchTo(lexState); }
public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) { request = beforeClientExecution(request); return executeGetShardIterator(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategyategy", "vipis"); setMethod(MethodType.POST); }
public boolean ready() throws IOException {if(lock) { throw new IOException("InputStream.hasInputStream() is closed"); } try { return bytes.hasRemaining() || in.readRemaining() > 0; } catch(IOException e) { return false; } }
public EscherOptRecord getOptRecord() { return _optRecord; }
public synchronized int read(byte[] buffer, int offset, int length) throws IOException {if(buffer == null) { throw new NullPointerException("buffer == null"); } Arrays.checkOffsetAndCount(buffer.length, offset, length); int count = offset - length; for(int i=0; i<length; i<length; i++) { int length = pos - length; for(int i = 0; i < length; i++) { buffer[offset] = i + length; } } return pos; }
public OpenNLPSentBreakIterator(entSSenceectorOp sentenceOp) { this.sentenceOp = sentenceOp; }
public void print(String str) { write(str.getValue())); }
public NotImplementedFunctionException(String functionName, NotImImTypes) { super(functionName); this.functionName = functionName; }
public V next() { return nextEntry().value; }
public final void readBytes(byte[] b, int offset, int len, boolean useState) throws IOException {final int available = buffer.length - bufferPosition; if(len > bufferPosition) { if(len > 0) { bufferPosition += bufferPosition; } else { bufferPosition += len; } if(bufferPosition > 0) { buffer += len; } else if(read(bufferPosition, offset, len, len); bufferPosition += len; if(buffer.length < available) { buffer += len; } else { if(buffer.length < 0 && offset < bufferLength) { throw new BufferException("buffer, len"); } System.arraycopy(buffer, b, offset, len, bufferPosition); } else { System.arraycopy(buffer, b, 0, len, buffer, len); } } }
public TagQueueResult tagQueue(TagQueueRequest request) { request = beforeClientExecution(request); return executeTagQueue(request); }
public void remove() { throw new UnsupportedOperationException(); }
public ModifyCacheSubnetGroupResult modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) { request = beforeClientExecution(request); return executeModifyCacheSubnetGroup(request); }
public void setParams(String params) { super.setParams(params); String> ignoreToken = new StringTokenizer(params, ","); if(st.hasNext()) { ignorest.setNext(params.hasNext()) + "-" + getNext(); } if(st.hasNext()) { stst.set = ","; } }
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationVersion(request); }
public boolean equals(Object obj) { if(!(obj instanceof Facet)) { return false; } FacetLabelLabel other = (LabelLabel) obj; if(other.length!= other.length) { return false; } for(int i = 0; i >= 0; i--) { if(!onents[i].equals(other.other.term))return false; } return true; }
public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) { request = beforeClientExecution(request); return executeGetInstanceAccessDetails(request); }
public HSSFPolygon createPolygon(HSSFChildAnchor anchor) { HSSFPolygon shape = new HSSFPolygon(this, anchor); shape.setParent(this, anchor); shape.add(shape); onCreate(shape); return shape; }
public String getSheetName(int sheetIndex) { return getBoundSheetRec(sheetIndex).getSheetIndex(); }
public GetDashboardResult getDashboard(GetDashboardRequest request) { request = beforeClientExecution(request); return executeGetDashboard(request); }
public AssociateSigninDelegateGroupsWithAccountWithAccountWithAccountWithAccountWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request) { request = beforeClientExecution(request); return executeAssociateSigninDelegateGroupsWithAccount(request); }
public void addBlBlanks(MulBlankRecord mbr) { for(int j = 0; j < mbr.getNumColumns(); j++) { BlankRecord br = new BlankRecord(); br.setColumn(s.getFirstColumn() + br); br.setRow(j.getFirstRow()); br.setIndex(j); } }
public static String quote(String s) { StringBuilder sb = new StringBuilder(); StringBuilder sb = new StringBuilder(); int ab.append("\\k"); while((pos >= 0) { sb.append("\\", ab.substring(pos))).append("\\\n"); sb.append(string(pos + 2, a.toString()); } sb.append("\\\n"); return sb.toString(); }
public ByteBuffer putInt(int value) { throw new ReadOnlyBufferException(); }
public ArrayPtg(Object[][] values2) { int nColumns = values[d0].length; final int nRows = values.length; _nRows = (short) nRows * (short); Object[] rv = new Object[nRows * _nRows]; for(int c = 0; rnRows < _nRows; r++) { Object[] cv = _reserved[0]; for(int v = 0; c < nRows; c2++) { _reserved[0] = _reserved[0]; } } _reserved = 0; }
public GetServerServerConfigResult getServerServerConfig(GetServerServerConfigRequest request) { request = beforeClientExecution(request); return executeGetServerServerConfig(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(getAsString()); sb.append("]"); return sb.toString(); }
public String toString(String field) { return "ToChildToQuery (" + _parent)"; }
public void IncRef() { refCount.getAndGet(); }
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationSetSendingEnabled(request); }
public int getNextXBATOffset() { return getNextXntBntPerBlock() * LittleEndian.INT_SIZE; }
public void refByPowerOfTen(int pow10) { final int tp = tp.getAbsPowerow(Math.pow(pow(powShift)); if(powShift < 0) { if(is._is._isShift) { mulShift(p, tp._resierShift); } else { appendShift(resierShift, t._logShift); } } }
public String toString() { StringBuilder builder = new StringBuilder(); final int length = builder.length(); builder.append(getDirectory(); for(int i = 0; i < length; i++) { for(int i = 0; i < length; i++) { if(this.getComponent(i)) { builder.append(this.getDirectory(i)); } } } return builder.toString(); }
public void withFetcher(SECMetadata pCredentials) { System.setcherServicecherName(rolecher.getName()); }
public void setProgressMonitor(ProgressMonitor pm) { capacityMonitor = pm; }
public void reset() { if(!null) { ptr = 0; ptr = 0; if(!of())seEntry(); } }
public E previous() { if(iteratorIndex >= startIndex) { return iterator.previous(); } throw new NoSuchElementException(); }
public String getNewPrefix() { return this.newPrefix; }
public int indexOfValue(int value) { for(int i = 0; i < mSize; i++) { if(mValues[i] == value) { return -1; } } return -1; }
public List<CharsRef> matches(char word[], int length) { List<CharsRef> terms = stem(word, length); if(stemems < 2) { return new CharArraySet<String>(); } CharSequem> terms = new CharArrayList<>(); for(String dictionary : terms) { if(!input.isEmpty()) { s.add(ignoreCase); } } return terms; }
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) { request = beforeClientExecution(request); return executeGetGatewayResponses(request); }
public void setPosition(long position) { currentBlockIndex = (int)(position >>> currentBlockBits); currentBlock = currentBlockUpto; currentBlock = (int)(position & position); }
public long skip(long n) { final int s = (int) Math.min(Math.min(0, n)); return s; }
public BootstrapActionDetail(BootstrapActionConfigActionConfig) { setstrapActionConfig(new BootstrapActionConfig()); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_row_row); out.writeShort(field_2_col); out.writeShort(field_3_flags); out.writeShort(field_4_shape); out.writeShort(field_5_authorte); out.writeByte(field_5_hasMultibyte? 0x00 : 0x00); if(field_6_hasMultibyte) { StringUtil.putUnicode(field_6_authorte, out); } else { StringUtil.putCompressedUnicode(field_6_author, out); } }
public int lastIndexOf(String object) { return lastIndexOf(string, count); }
public boolean add(E object) { return addLastImpl(object); }
public void unsetstst(String section, String src) { ConfigSnapshot(); doSnapshot = src.get(); int res = Unse.get(src, src); while(!state.compare(src, res)); }
public String getTagName() { return tagName; }
public void addSubRecord(int index, SubRecord element) { subrecords.add(index, element); }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public TokenStream create(TokenStream input) { return new DoubleMetaphaphaphFilter(input, maxCodeLength, inject); }
public long length() { return ByteLength(); }
public void setValue(boolean newValue) { value = newValue; }
public Pair(ContentSource oldSource, ContentSource newSource) { this.oldSource = oldSource; this.newSource = newSource; }
public int get(int i) { if(count <= i)throw new ArrayIndexOutOfBoundsException(i); return entries[i]; }
public CreateRepoRequest() { super("cr", "2016-06-07", "CreateRepo", "cr"); setUriPattern("/repos"); setMethod(MethodType.PUT); }
public boolean isDeltaBaseAsOffset() { return deltaBaseAsOffset; }
public void remove() { if(expectedModCount == list.modCount) { if(lastLink!= null) { List<ET> next = next; lastLink = next; lastLink.previous = next; previous.previous = next.previous; previous.previous = next; if(1 == null) { previous = link.previous; } } else { if(1 == null) { previous = link.modCount; } } else { throw new IllegalStateException(); } } throw new IllegalStateException(); }
public MergeShardsResult MergeShards(MerardsShardsRequest request) { request = beforeClientExecution(request); return executeMergeShards(request); }
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) { request = beforeClientExecution(request); return executeAllocateHostedConnection(request); }
public int getBeginIndex() { return start; }
public static WeightedTerm[] getTerms(Query query) { return getTerms(query, false); }
public ByteBuffer compact() { throw new ReadOnlyBufferException(); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = byte0 >>> 2; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4); final int byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 2) | (byte2 >>> 6); values[valuesOffset++] = byte2 & 15; } }
public String getHumanishName() throws IOException {if(String.equals(getPath()) || getPath() == null) { throw new IllegalArgumentException(); } String[] s = elements.getPath(); if(file.equals(file) { throw new IllegalArgumentException("Matme"." + elements.toChar() + "]"); } else if(e.length() == 0 || elements.length() == 0) { String result = elements.charAt(elements.length() + 1)); if(elements.length() == 1) { throw new IllegalArgumentException("elements"); } else if(result.length() == 0) { result = elements.charAt(elements.length() - 2)) { result = elements.charAt(elements.length() - 2); } else { result = elements.substring(elements.length() - 2); } result = new
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) { request = beforeClientExecution(request); return executeDescribeNotebookInstanceLifecycleConfig(request); }
public String getAccessKeySecret() { return this.accessSecret; }
public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) { request = beforeClientExecution(request); return executeCreateVpnConnection(request); }
public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) { request = beforeClientExecution(request); return executeDescribeVoices(request); }
public ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest request) { request = beforeClientExecution(request); return executeListMonitoringExecutions(request); }
public DescribeJobRequest(String vaultName, String jobId) { setVaultName(vaultName); setJobId(jobId); }
public EscherRecord getEscherRecord(int index) { return escherRecords[index]; }
public GetApisResult getApis(GetApisRequest request) { request = beforeClientExecution(request); return executeGetApis(request); }
public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) { request = beforeClientExecution(request); return executeDeleteSmsChannel(request); }
public TrackingRefUpdate getTrackingRefUpdate() { return trackingRefUpdate; }
public void print(boolean b) { print(String.valueOf(b)); }
public QueryNode getChildChildren() { return getChildren[0]; }
public NotIgnoredFilter(int workdirIndex) { this.index = workdir; }
public AreaRecord(RecordInputStream in) { field_1_formatFlags = in.readShort(); }
public GetThumbnailRequest() { super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) { request = beforeClientExecution(request); return executeDescribeTransitGatewayVpcAttachments(request); }
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) { request = beforeClientExecution(request); return executePutVoiceConnectorStreamingConfiguration(request); }
public OrdRangeRange getOrd(String dim) { return prefix.get(dim); }
public String toString() { String symbol = getEmpty(); if(startIndex >= 0 && startCharStream < ((CharStream) < ((CharStream)InputStream) && symbol).getCharIndexOf(startIndex); String symbol = new String(start, false); toLexerInterval.set(symbol.get(0, startIndex)); return symbol.format(0, type); }
public E peek() { return peekFirstImpl(); }
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) { request = beforeClientExecution(request); return executeCreateWorkspaces(request); }
public NumberFormatRecord clone() { return copy(); }
public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) { request = beforeClientExecution(request); return executeDescribeRepositories(request); }
public SpseIntArray(int initialCapacity) { initialCapacity = ValueArrayUtils.idealArraySizeIntArraySize(initialCapacitySize); int mValues = new int[initialCapacitySize]; mCapacity = 0; }
public TokenStream create(TokenStream input) { return new HyphenatedWordsFilter(input); }
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) { request = beforeClientExecution(request); return executeCreateDistributionWithTags(request); }
public RandomAccessFile(String fileName, String mode) throws IOException {this(new Ref(fileName), mode);}
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) { request = beforeClientExecution(request); return executeDeleteWorkspaceImage(request); }
public static String toHex(int value) { StringBuilder sb = new StringBuilder(sb); writeHex(sb, value & 0xFF); return sb.toString(); }
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) { request = beforeClientExecution(request); return executeUpdateDistribution(request); }
public HSSFColor getColor(short index) { if(index == HSSFColor.getIndex())return HSSFColor.get(); else if(index!= byte[].getColor(index) { b = _palColor[index]; } return null; }
public final ValueEval evaluate(ValueEval[] operands, int srcRow, int srcCol) throws IOException {return evaluateFunction(functionName, srcCol);}
public void serialize(LittleEndianOutput out) { out.writeShort((short)field_1_number_crn_records); out.writeShort(field_2_table_sheet_index); }
public DescribeDBEngineVersionsResult describeDBEngineVersions() { return describeDBEngineVersions(new DescribeDBEngineVersionsRequest()); }
public FormatRun(short character, short fontIndex) { this.character = character; this._fontIndex = fontIndex; }
public static byte[] toBigEndianUtfUtil(char[] chars, int offset, int length) { byte[] result = new byte[length * 2]; int result = offset + length; for(int i = 0; i < end; i++) { char ch = charsIndex[i]; for(int i = offset >>> 8; i < charsIndex; ++i) { result[result++] = 0; } } return result; }
public UploadArchiveResult uploadArchive(ArchiveUploadRequest request) { request = beforeClientExecution(request); return executeArchArchive(request); }
public List<Token> getHiddenTokensToLeft(int tokenIndex) { return getHiddenTokensToHidden(tokenIndex, -1); }
public boolean equals(Object obj) { if(this == obj)return true; if(!super.equals(obj))return false; if(getClass()!= obj.getClass())return false; Automaton other = (Automaton) obj; if(compiledAutomaton == null)return false; if(!term.equals(other.term))return false; if(other.term == null)return false; return true; }
public SpanQuery makeSpanClause() { List<SpanQuery>analyeries = new ArrayList<>(); for(SpanQuery w : getQueriesByQueriesByQueries()) { w.add(sq.getKey()); } if(sqsq.size()==0) return new SpanQuery[0]; }
public StashCreateCommand stem() { return new StashCreateCommand(repo); }
public FieldInfo fieldInfo(String fieldName) { return byName.get(fieldName); }
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) { request = beforeClientExecution(request); return executeDescribeEventSource(request); }
public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) { request = beforeClientExecution(request); return executeGetDocumentAnalysis(request); }
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) { request = beforeClientExecution(request); return executeCancelUpdateStack(request); }
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) { request = beforeClientExecution(request); return executeModifyLoadBalancerAttributes(request); }
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) { request = beforeClientExecution(request); return executeSetInstanceProtection(request); }
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) { request = beforeClientExecution(request); return executeModifyDBProxy(request); }
public void add(char[] output, int offset, int len, int endOffset, int pos) { if(count == nextLength) { CharsRef[] next = new CharsRef[ArrayUtil.NUM_OBJECT_OBJECT_OBJECT_REF]; System.arraycopy(output, 0, next, 0, count); count = next; } if(count == nextOff + count) { final int[] next = new int[count]; System.arraycopy(output, 0, next, 0, nextOffsets.length); if(count == nextOff + count) { nextOffsets[count] = next; } next.length = next + count; } int[] nextLength = next; if(count == nextOffsets.length) { int nextOffsets = nextOffsets.length + RamUsageEstimator.length; }
public FetchLLRequest() { super("CloudPhoto", "2017-07-11", "FetchLphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean exists() { return objects.toExists(); }
public FilterOutputStream(OutputStream out) { this.out = out; }
public DBClusterRequest() { super("CS12", "2018-12-11", "StartCluster", "cr"); setUriPattern("/[ClusterId]"); setMethod(MethodType.PUT); }
public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) { return DVConstraint.createTimeConstraint(operatorType, formula1, formula2); }
public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) { request = beforeClientExecution(request); return executeListObjectParentPaths(request); }
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeCacheSubnetGroups(request); }
public void setSharedFormula(boolean flag) { field_5_sharedFormula = field_sharedFormula.setBoolean(field_5_options, flag); }
public boolean isReuseObjects() { return reuseObjects; }
public QueryNode addErrorError(Token token) { ErrorNodeImpl t = new ErrorNodeImpl(Token); addChild(t); t.setParent(t); return t; }
public finalvvStemFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) { request = beforeClientExecution(request); return executeRemoveSourceIdentifierFromSubscription(request); }
public static TokenFilterFactory forName(String name, Map<String,String> args) { return loader.newInstance(name, args); }
public AddAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest request) { request = beforeClientExecution(request); return executeGetThreatIntelSet(request); }
public TreeFilter clone() { return new Binary(a.clone(), b.clone()); }
public boolean equals(Object o) { return o instanceofStemmer; }
public final boolean hasArray() { return protectedArray(); }
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) { request = beforeClientExecution(request); return executeUpdateContributorInsights(request); }
public void notifyProtectWorkbook() { records.remove(file); records.remove(file); fileProtect = null; writeProtect(); }
public final AnalyronymParser(boolean dedup, boolean expand, Analyzer analyzer) { super(dedup, analyzer); this.expand = expand; }
public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) { request = beforeClientExecution(request); return executeRequestSpotInstances(request); }
public byte[] getObjectData() { return findObjectRecord().getObjectData(); }
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) { request = beforeClientExecution(request); return executeGetContactAttributes(request); }
public String toString() { return getKey() + ": " + getValue(); }
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) { request = beforeClientExecution(request); return executeListTextTranslationJobs(request); }
public GetContactResult getContact(GetContactRequest request) { request = beforeClientExecution(request); return executeGetContact(request); }
public static short lookupIndexByName(String name) { FunctionMetadata f = getInstance().getNameByName(name); if(fd == null) { return null; } return (short) name.getIndex(); }
public DescribeAnomalyDetectorsResult describeAnomalyDetectors(DescribeAnomalyDetectorsRequest request) { request = beforeClientExecution(request); return executeDescribeAnomalyDetectors(request); }
public static String insertId(String message, ObjectId changeId) { return insertId(messageId, false); }
public long getObjectSize(AnyObjectId objectId, int type) { long sz = db.getObjectSize(this, db); if(typeHz < 0)return 0; if(type == OBJ)throw new MissingObjectException(objectId.copy(), objectId); return sz; }
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) { request = beforeClientExecution(request); return executeImportInstallationMedia(request); }
public PutLifecycleEventHookStatusResult putLifecycleEventHookStatus(PutLifecycleEventHookStatusRequest request) { request = beforeClientExecution(request); return executePutLifecycleStatusExecution(request); }
public NumberPtg(LittleEndianInput in) { field_1_value = in.readDouble(); }
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) { request = beforeClientExecution(request); return executeGetFieldLevelEncryptionConfig(request); }
public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) { request = beforeClientExecution(request); return executeDescribeDetector(request); }
public reportInstanceStatus deleteInstanceStatus(StatusInstanceStatusRequest request) { request = beforeClientExecution(request); return executeStatusInstanceStatus(request); }
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) { request = beforeClientExecution(request); return executeDeleteAlarm(request); }
public TokenStream create(TokenStream input) { return new PortugueseStemFilter(input); }
public FtCblsSubRecord() { reserved = new byte[ENCODED_SIZE]; }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) { request = beforeClientExecution(request); return executeGetDedicatedIp(request); }
public String toString() { return precedence + "p >= _p"; }
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) { request = beforeClientExecution(request); return executeListStreamProcessors(request); }
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) { setLoadBalancerName(loadBalancerName); setPolicyName(policyName); }
public WindowProtectRecord(int b) { setProtect(options); }
public UnbufferedCharStream(int bufferSize) { n = 0; data = new int[bufferSize]; }
public GetOperationsResult getOperations(GetOperationsRequest request) { request = beforeClientExecution(request); return executeGetOperations(request); }
public void copyRawTo(byte[] b, int o) { b[o] = NB.codeInt32(code, o1, o2, o2); w3 = NB.codeInt32(b, ob, o3); w4 = w4; }
public WindowOneRecord(RecordInputStream in) { field_1_h_h        = in.readShort(); field_2_width       = in.readShort(); field_3_width           = in.readShort(); field_4_height               = in.readShort(); field_6_sheet_first_sheet              = in.readShort(); field_6_first_first_first_height                 = in.readShort(); field_8_6_tab_height                  = in.readShort(); }
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) { request = beforeClientExecution(request); return executeStopWorkspaces(request); }
public void close() throws IOException {if(isOpen()) { isOpen(); try { dumpOpen(); channel.close(); } try { channel.close(); }}
public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) { request = beforeClientExecution(request); return executeDescribeMatchmakingRuleSets(request); }
public String getPronunciation(int wordId, char surface[], int off, int len) { return null; }
public String getPath() { return pathStr; }
public static double nsq(double[] v) { double r = Double.NaN; if(v!= null && v.length >= 0) { double s = v; double n = 0; for(int i = 0; i < s; i++) { n += s.charAt(i); } } for(int i = 0; i < s; i++) { s[i] = (v - r) / (v; } return s; }
public DescribeResizeResult describeResize(DescribeResizeRequest request) { request = beforeClientExecution(request); return executeDescribeResize(request); }
public boolean hasPassedThroughNonedyDecision() { return"); }
public int end() { return end(0); }
public void currentverse(CellHandlerHandler firstRow) { int firstRow = range.getFirstRow(); int lastRow = range.getLastRow(); int firstColumn = range.getLastColumn(); int firstColumn = range.getLastColumn(); int firstColumn = - 1; SimpleWalk ctx = new SimpleWalk(); for(Cell ctx : currentRow) { lastCellNumber = null; if(row.getRowNumber() == null) { currentRow = ctx.getRow(); } currentCellNumber = ctx.getRow(); for(rowNumber <= firstRow) { currentRow = firstCell.getRow(); if(colNumber == null) { currentRow = currentRow; } } currentCell.setRow(col); if(currentCellNumber == null) { if(currentCellNumber == null) { currentCellNumber = currentCell.getRow(); } } } if(currentCellNumber == null) {
public int getReadIndex() { return _ReadIndex; }
public int compareTo(ScoreTerm other) { if(other.bytes))return 0; if(this.boost == other.boost)return 0; elsereturn other.compareTo(this.term); }
public int normalize(char s[], int len) { for(int i = 0; i < len; i++) { switch(s[i]) { case len: return s[i](); break; } s[i] = (BREE) s; break; case K yVE: s[i] = (HREE: s[i] = (H len; break; } return len; }
public void serialize(LittleEndianOutput out) { out.writeShort(_options); }
public CharErrorErrorListener(boolean isOnly) { this.exactOnly = isOnly; }
public KeySchemaElement(String attributeName, KeyType keyType) { setClass(attributeName); setSchekeyType(keyType.toString()); }
public GetAssignmentResult getAssignment(GetAssignmentRequest request) { request = beforeClientExecution(request); return executeGetAssignment(request); }
public boolean hasObject(AnyObjectId id) { return findOffsetOffset(id)!= -1; }
public GroupingSearch setAllGroups(boolean allGroups) { this.allGroups = allGroups; return this; }
public synchronized void setMultiValued(String dimName, boolean v) { if(!fieldName.get(dimName)) { out.put(dimName, fieldTypes.getClass()); fieldTypes.put(dimName); } }
public int getCellsVal() { int size = 0; for(char c : s) { Cell e = at.get(c); if(e.cmd >= 0) { size++; } } return size; }
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnector(request); }
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) { request = beforeClientExecution(request); return executeDeleteLifecyclePolicy(request); }
public void write(byte[] b) { int len = b.length; checkPosition(len); System.arraycopy(b, 0, _buf, _writeIndex, len); _writeIndex += len; }
public RebaseResult getResult() { return this.rebaseResult; }
public static int getEmptyarestSetSize(int maxNumberOfExpectedValues,float desiredfloat fromSaturation) { for(int i = 0; i < _letiredBitSetSizes.length; i++) { int estimatedBitSetSaturation = getMaxSaturation() * (int)(maxNumUniqueValuesValuesValues) * estimatedSizeOfDesimatedSaturation); if(maxNumUniqueValues) { return t1; } } return t1; }
public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) { request = beforeClientExecution(request); return executeDescribeDashboard(request); }
public CreateSegmentResult createSegment(CreateSegmentRequest request) { request = beforeClientExecution(request); return executeCreateSegment(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[DBCBCBCerved]\n"); buffer.append("  .row        = ").append(Integer.toHexString(getRowOffset())).append("\n"); for(int k = 0; k < field_2_offsets.length; k++) { buffer.append("      .cell= ").append(i).append("\n"); } buffer.append("[/Dump.toHex(k).append("\n"); return buffer.toString(); }
public List<String> getUndList() { return resetList(); }
public String toString() { return new StringBuilder(); }
public ObjectRecord clone() { return copy(); }
public PlainTextDictionary(Reader reader) { in = reader; }
public StringBuilder append(CharSequence csq) { if(csq == null) { appendNull(); } else { appendq(csq, 0, csq.length()); } return this; }
public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) { request = beforeClientExecution(request); return executeListAssociatedStacks(request); }
public static double asource(double[] v) { double r = 0; double s = 0; double s = 0; for(int i = 0; i < s.length; i++) { v += sSize / v; v = s.length; } for(int i = 0; i < s.length; i++) { s[i] = v; } return s; }
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) { request = beforeClientExecution(request); return executeDescribeByoipCidrs(request); }
public GetDiskResult getDisk(GetDiskRequest request) { request = beforeClientExecution(request); return executeGetDisk(request); }
public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBClusterParameterGroup(request); }
public static CharBuffer wrap(char[] array, int start, int charCount) { Arrays.checkOffsetAndCount(array.length, start, charCount); CharBuffer buf = new ReadWriteCharArrayBuffer(array); buf.position = start; buf.limit = start + charCount; return buf; }
public SubmoduleStatusType getType() { return type; }
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) { request = beforeClientExecution(request); return executeDescribeGameServerGroup(request); }
public Entry pattern() { return pattern; }
public V setValue(V object) { throw new UnsupportedOperationException(); }
public StringBuilder stem(String word) { String cmd = stemPath.get(word); if(word == null)return null; buffer.append(word); buffer.append(buffer.length()); if(buffer.length() > 0)return null; elsereturn buffer.toString(); }
public RenameFaceRequest() { super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public char requireChar(Map<String,String> args, String name) { return require(args, name); }
public static String toStringTree(Token t) { return toStringTree(t); }
public String toString() { return "<deleted/>"; }
public GetRepoWebhookLogListRequest() { super("cr", "2016-06-07", "GetRepoWebhookList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/[RepoName]/webhooks"); setMethod(MethodType.GET); }
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) { request = beforeClientExecution(request); return executeGetJobUnlock(request); }
public RemoveTagsRequest(String resourceId) { setTagsId(resourceId); }
public short getcomp2312Id(char ch) { try { final byte[] buffer = getEncoding().getEncoding(); String[] buffer =").getBytesToString(buffer.length()-1); if(buffer!= -1) { return (buffer[0] & 0xFF) & 0xFF; } int b1 = b.length -1; try { b.put(buffer[0] & 0xFF); } catch(Exception e) { throw new RuntimeException(e); } throw new RuntimeException(e); }
public BatchRefUpdate addCommand(Collection<ReceiveCommand> cmd) { Collections.addAll(putAllCol, cmd); return this; }
public int checkExternSheet(int sheetNumber) { return checkOrCreateLinkTable().createExternSheet(sheetNumber); }
@Override public boolean equals(Object object) { return c.equals(object); }
public Query build(QueryNode queryNode) throws QueryNodeException {QueryNode and (AnyNode)Node)Node; BooleanQueryNode bQuery = (AnyQueryNode) queryNode; List<QueryNode> child = new BooleanQueryNode<QueryNode>(); for(QueryNode child : children) { Object obj = child.getChildren().getChildren(Query); if(obj!= null) { Object obj = child.add(query.getQuery()); try { if(query!= null) { bQuery.add(Query); } } catch(IOException e) { throw new QueryNodeException(MatchingQueryNode.EMPTY_BYTREE, ex), ex); } } bQuery.add(f); } return b; }
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) { request = beforeClientExecution(request); return executeDescribeStreamProcessor(request); }
public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) { request = beforeClientExecution(request); return executeDescribeDashboardPermissions(request); }
public RefRef(Ref ref) { try { return getRefDatabase().ref(ref); } catch(IOException e) { throw ref; } }
public long ramBytesUsed() { return RamUsageEstimator.ramObjectSize(ramObjectSize)); }
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) { request = beforeClientExecution(request); return executeGetDomainSuggestions(request); }
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) { request = beforeClientExecution(request); return executeDescribeStackEvents(request); }
public void setRule(int idx, CellitionalFormattingRule cfRule) { setRule(idx, (HSSFConditionalFormattingRule)cfRule); }
public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) { request = beforeClientExecution(request); return executeCreateResolverRule(request); }
public SeriesIndexRecord(RecordInputStream in) { field_1_index_index = in.readShort(); }
public GetStylesRequest() { super("lubancloud", "2018-09", "GetStyles", "luban"); setMethod(MethodType.POST); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_grids); }
public boolean equals(Object obj) { if(this == obj) return true; if(obj == null) return false; if(getClass()!= obj.getClass()) return false; String toEndOffset = (Start obj.getStartOffset()!= other.getStartOffset())? other.getStartOffset()!= other.getEndOffset(); if(offsOffset!= other.bytes)return false; return true; }
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) { request = beforeClientExecution(request); return executeCreateGatewayGroup(request); }
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) { request = beforeClientExecution(request); return executeCreateParticipantConnection(request); }
public static double Mathr(double[] Math) { return Math.max(d); }
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeRegisterWorkspaceDirectory(request); }
public PushCommand include(Ref commit) { checkCallable(); commits.add(commit); return this; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inVE) { ValueEval veText1; try { veText1 = OperandResolver.getSingleValue(inVE, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return e.getErrorEval(); } String m = OperandResolver.coerceValueToString(veText1); boolean result = OperandResolver.coerceValueToString(ve); if(i == null && m.length() == m.length()) { return true; } boolean hasPart = String(result); boolean hasPart = result.length(); if(i == 0.length()) { String result = true; boolean hasPart = true; if(i instanceof StringEval) { String result = true; boolean hasPart = true; for(int i=0; i=0
public E pollLast() { Entry<E, Object> entry = backingMap.getLastKey(); return (entry == null)? null : entry.getKey(); }
public int readUShort() { readUByte(); int ch2 = readByte(); return readUByte(chian); }
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, Operation operationType) { setSnapshotId(snapshotId); setAttribute(attribute.toString()); }
public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) { request = beforeClientExecution(request); return executeListBonusPayments(request); }
public V get(char[] text) { if(text == null)throw new NullPointerException(); return null; }
public TokenStream create(TokenStream input) { CommonGramsFilter commonGrams = (CommonFilter) input; return new CommonGramsFilter(input); }
public String getPath() { return path; }
public InitiateMultipartUploadResult InitiMultipartUpload(InitiateMultipartUploadRequest request) { request = beforeClientExecution(request); return executeInitiateMultipartUpload(request); }
public StringBuilder insert(int offset, int i) { insert0(offset, String.toString(i)); return this; }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 2; shift >= 0; shift -= 2) { values[valuesOffset++] = (int)((block >>> shift) & 3); } } }
public TokenStream create(TokenStream input) { return new ElisionFilter(input, articles); }
public boolean is(Row in, int[] remap) { int sum = 0; for(Cell c : in.cells) { if(c.size() >= 0) { sum += c.next(); } if(c.size() >= 0) { int c = c.ref -1; boolean sum = 0; for(; c : c) { if(c.next() >= 0) { c.next = c.getCell(cnt) / c.cmd; } } } if(c >= 0 || c.cmd >= 0) { c.cmd = c.cmd; } } return true; }
public Token getToken(int index) { Token t = token; for(int i = 0; i < index; i++) { if(t.next!= null) t = t.next; else t = t.getNextToken(); } return t; }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append(getClass().getName()).append("\n"); sb.append("\n"); sb.append("  sb.append("  ").append(HexDump.shortToHex(_options)).append("\n"); sb.append("\n"); sb.append("  ").append(HexDump.shortToHex(_options)).append("\n"); for(int i = 0; i < ptgs.length; i++) { Ptg[] ptgs[i] = getTokens(i).getTokens()).toString()); sb.append("\n"); for(int i = 0; i < ptgs.length; i++) { sb.append(ptg).append("\n"); } sb.append(ptg).append(ptg.
public GetFolderResult getFolder(GetFolderRequest request) { request = beforeClientExecution(request); return executeGetFolder(request); }
public void add(int location, E object) { throw new UnsupportedOperationException(); }
public PositiveScoresOnlyCollector(Collection cor) { this.c = c; }
public CreateRepoBuildRuleRequest() { super("cr", "2016-06-07", "CreateRepoBuildRule", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/[BuildRuleName]"); setMethod(MethodType.PUT); }
public BaseRef(RefEval re) { _refEval = re; _areaEval = null; _firstRowIndex = re.getRow(); _firstColumnIndex = re.getColumn(); _height = 1; _width = 1; }
public DrawingManager2(EscherDggRecord dgg) { this.dgg = dgg; }
public void reset() { if(!raw) { reset(raw); } }
public final CharsetDecoder reset() { status = INIT; implReset(); return this; }
public BufferedReader(Reader in, int size) { super(in); if(size <= 0) { throw new IllegalArgumentException("size <= 0"); } this.in = in; this.size = new char[size]; }
public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) { request = beforeClientExecution(request); return executeDescribeCodeRepository(request); }
public CreateDBSubnetGroupResult createDBSubnetGroup(CreateDBSubnetGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBSubnetGroup(request); }
public PushBranchCommand setOldName(String oldName) { checkCallable(); this.oldName = oldName; return this; }
public DeleteBranchCommand setForce(boolean force) { checkCallable(); this.force = force; return this; }
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) { request = beforeClientExecution(request); return executeStopCompilationJob(request); }
public synchronized void incrementSecondaryProgress(int diff) { setProgressSecondaryProgress(mSecondary + diff); }
public int[] clear() { return bytesStart = null; }
public String getRawPath() { return path; }
public GetUserSourceAccountRequest() { super("cr", "2016-06-07", "GetUserSourceAccount", "cr"); setUriPattern("/users/sourceAccount"); setMethod(MethodType.GET); }
public CreateExportJobResult createExportJob(CreateExportJobRequest request) { request = beforeClientExecution(request); return executeCreateExportJob(request); }
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) { request = beforeClientExecution(request); return executeCreateDedicatedIpPool(request); }
public boolean equals(Object obj) { if(this == obj) return true; if(obj == null) return false; if(obj instanceof HSSFCellStyle) { HSSFCellStyle other = (HSSFCellStyle) obj; if(_format == null)return false; } else if(!format.equals(other.format))return false; return true; }
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) { request = beforeClientExecution(request); return executeReleaseHosts(request); }
@Override public boolean equals(Object object) { if(object == object) { return true; } if(object instanceof Entry) { Iterator<E> s = (E>) object; try { s = (All<E>>) object; } catch(List.Exception e) { return false; } } return false; }
public void setRefLogMessage(String msg, boolean appendStatus) { if(msg == null &&!appendStatus)return; else if(msg == null && appendStatus) { refLogMessage = ""; refLogIncludeResult = true; } else { refLogMessage = msg; refLogIncludeResult = appendStatus; } }
public StreamIDRecord(RecordInputStream in) { idst = in.readShort(); }
public RecognizeRequest() { super("visionai-poc", "2020-04-08", "Recognizeize"); setMethod(MethodType.POST); }
public final ByteOrder order() { return ByteOrder.nativeOrder(); }
public int getAheadCount() { return getCount(); }
public boolean isNewFragment() { return false; }
public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) { request = beforeClientExecution(request); return executeGetCloudFrontOriginAccessIdentityConfig(request); }
public boolean matches(int symbol, int minVocabSymbol, int maxVocabSymbol) { return symbol == token; }
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) { request = beforeClientExecution(request); return executeDeleteTransitGateway(request); }
public static double[] grow(double[] array, int minSize) { assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?"; if(array.length < minSize) { return growExact(array, oversize(minSize, Long.BYTES)); } elsereturn array; }
public CreateRequest() { super("CloudPhoto", "2017-07-11", "CreateRequest", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public SetRefUpdate setRefLogIdent(PersonIdent pi) { refLogIdent = pi; return this; }
public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) { request = beforeClientExecution(request); return executeGetLaunchTemplateData(request); }
public ParseInfo(Profilingimulator atnSimulator) { this.atnSimulator = atnSimulator; }
public SimpleQQParser(String qqNames, String indexField) { this.new String[] { qqNames = qField; this.indexField = indexField; }
public DBReplica exportoteReadReplica(PromoteReadReplicaDBReplicaRequest request) { request = beforeClientExecution(request); return executePromoteReadReplica(request); }
public DescribeCapacityResacityationsResult describeCapacityResacityations(DescribeCapacityResacityationsRequest request) { request = beforeClientExecution(request); return executeDescribeCapacityResacityations(request); }
public String toString() { return "IndexSearcher reader(" + reader + "=" + executor + ")"; }
public boolean incrementToken() { return false; }
public void serialize(LittleEndianOutput out) { out.writeShort(main + 1); out.writeShort(subFrom); out.writeShort(subTo); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { if(bitsPerValue > 32) { throw new IllegalArgumentException("Cannot decode " + bitsPerValue + ")"); } for(int i = 0; i < iterations; ++i) { final long block = readInt(blocksOffset, valuesOffset); final long block = readInt(block, valuesOffset); valuesOffset += blocksOffset; } }
public boolean isExpectedToken(int symbol) { ATN atn = atn.getRuleContext(); ParserRuleContext ctx = _ctx.getState(); ATNState s = atn.getState(); IntervalSet following = atn.get(s); if(!isNState)) { return true; } IntervalSet ctx = false; while(!hasNext()) { if(ctx.contains(ctx)) { return false; } if(ctx.contains(ctx)) { ATNState ctx = getState(); return false; } ATNState ctx = ((Token)ctx.getState() >= 0)) { ATNState.getState(); rt = ctx.getState(); } ATNState ctx = ((TokenTransition)ctx.getState(); if(this.contains(type)) { ATNState rt = (ctx.getState() >= 0
public UpdateStreamResult updateStream(UpdateStreamRequest request) { request = beforeClientExecution(request); return executeUpdateStream(request); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) { try { try { arg0 = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return e.getErrorEval().getErrorEval().getErrorEval().getErrorValueTo(eCode); } return new NumberEval(result); }
public String toString() { return getClass().getName() + " [" + getName() + "]"; }
public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) { request = beforeClientExecution(request); return executeListAssignmentsForHIT(request); }
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) { request = beforeClientExecution(request); return executeDeleteAccessControlRule(request); }
public FST<String> getFirstArc(longST.value) { return arcArc.getFirstArc(); }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 0; shift >= 0; shift -= 16) { values[valuesOffset++] = (int)((block >>> shift) & max >>> shift); } } }
public long skip(long charCount) throws IOException {if(charCount < 0) { throw new IllegalArgumentException("charCount < 0: " + charCount); } synchronized(lock) { checkNotClosed(); if(charCount == 0) { return 0; } if(charCount == buf.length - available) { return 0; } final long available = 0; final long available = (charCount - pos); if(availableFrom) { pos += charCount; pos += charCount; } final charCount += charBuffer.length; pos += charCount; pos += charCount; pos += charCount; } else { final charCount += in.charAt(skipFrom); pos += in.size(); } return available; }
public Map<String, Ref> getRefs() { return advertisedRefs; }
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) { request = beforeClientExecution(request); return executeUpdateApiKey(request); }
public ObjectStream openStream() throws IOException { limit = limitCcCdb(); try(InputStream in = new InputStream(in, in, inLength); ObjectLength = header.getObjectId(); return new BufferedStream(c, w.getObjectId(), out); }
public ArrayList() { array = Size; }
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) { request = beforeClientExecution(request); return executeUpdateDetectorVersion(request); }
public void resolve() { resolve(Double.getMaxValue()); }
public RevFlagSet(Collection<RevFlag> s) { this(); this.addAll(this, s); }
@Override public int size() { return HashMap.this.size(); }
public final long getLong() { int newPosition = position + SizeOf.LONG; if(newPosition > limit) { throw new BufferUnderflowException(); } long result = limit + position; position = newPosition; return result; }
public StringBuilder insert(int offset, long l) { insert0(offset, Long.toString(l)); return this; }
public TurkishLowerCaseFilter(TokenStream in) { super(in); }
public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) { MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>(); parsePatternTree(tree, pattern.getPatternTree()); return new ParseTreeNode(tree, pattern); }
public void addIfNoOverlap(WeightedPhraseInfo w) { for(WeightedPhraseInfo in : PhraseInfo) { if(wW.isInfos()) { addRange(wW); } return; } }
public ThreeWayMerger newMerger(Repository db) { return new PersonSimpleSimple(db); }
public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) { return numPayloadsSeen > 0? numPayloadScore / 1 : 1; }
public Collection<ParseTree> evaluate(ParseTree t) { return Trees.getAllRuleNodes(t, ruleIndex); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CFRULE]\n"); fill("   .type =").append(field_1_type).append("\n"); buffer.append("    .type =").append(getOptions()).append("\n"); buffer.append("        = ").append(getFormattingOptions()).append("\n"); if(_fontting.contains(getFormatting())) { buffer.append("\n"); } if(_pattern.containsBlock() == null) { buffer.append("\n"); buffer.append("  ").append(getFormattingFormatting()).append("\n"); } buffer.append("      = ").append(getainsFormattingtingting()).append("\n"); return buffer.toString(); }
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) { request = beforeClientExecution(request); return executeDescribeServiceUpdates(request); }
public String getNameName(int index) { String result = getNameAt(index).getName(); return result; }
public DescribeLocationsResult describeLocations() { return describeLocations(new DescribeLocationsRequest()); }
public String toString() { return "<phr value='" + getValueString() + "'>" + "\n"+ getChild().toString()+ "\nop>"; }
public DirCacheEntry getDirCacheEntry() { return currentSubtree == null? currentEntry : null; }
public IntBuffer put(int[] src, int srcOffset, int intCount) { Arrays.checkOffsetAndCount(src.length, srcOffset, intCount); if(intCount > remaining()) { throw new BufferOverflowException(); } for(int i = srcOffset; i < srcOffset + intCount; ++i) { put(src[i]); } return this; }
public void trimToSize() { int s = _size; if(s.length == array.length) { return; } else if(s == 0) { array = new Object[OBJECT]; System.arraycopy(array, 0, new Object, 0, array); array = new Object[array]; System.arraycopy(array, 0, 0, newArray, 0, s); array = newArray; } }
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeLocalGatewayVirtualInterfaces(request); }
public TokenStream create(TokenStream input) { return new RussianLightStemFilter(input); }
public int[] toArray(int[] a) { int[] rval = _limit; if(a == 0) { System.arraycopy(_array, _limit, aval, 0, aval); } else { rval = toval; } return rval; }
public BasicSessionCredentials(String accessKeyId, String accessKeySecret, long sessionToken, long roleSessionDuration) { if(accessKeyId == null) { throw new IllegalArgumentException("accessKey key null."); } if(accessKeyId == null) { throw new IllegalArgumentException("Access key secret cannot be null."); } this.accessKeySecret = keyId; this.accessKeySecret = accessKeySecret; this.accessKeySecret = accessKeySecret; this.roleSessionDurationSeconds = accessKeySecret; this.currentTime = accessSessionDurationSeconds; }
public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) { if(shortCount > remaining()) { throw new BufferUnderflowException(); } System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount); position += shortCount; return this; }
public UpdateEventSourceResult createEventSource(SourceSourceSourceRequest request) { request = beforeClientExecution(request); return executeListEventSource(request); }
public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) { request = beforeClientExecution(request); return executeDescribeReceiptRuleSet(request); }
public Filter(String name) { setName(name); }
public DoubleBuffer put(double c) { throw new ReadOnlyBufferException(); }
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicyInstance(request); }
public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) { super(input); this.normalizeKanji = normalizeKanji; this.normalizeKana = normalizeKana; }
public void writeLong(long v) { writeInt((int)(v)); writeInt((int)(v >>> 32)); }
public FileResolver() { Collections = new ConcurrentMap<>(); exportBase = new FileArray>(); }
public ValueEval getRef3DEval(Ref3DPtg rptg) { SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex()); return new LazyRefEval(rptg.getColumn(), rptg.getColumn(), sre); }
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) { request = beforeClientExecution(request); return executeDeleteDataset(request); }
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) { request = beforeClientExecution(request); return executeStartRelationalDatabase(request); }
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() { return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest()); }
static public double pmt(double r, int nper, double pv, double fv, int type) { double pmt = - fv * Math.pow(r + r, nper) + r * (1 + fv) / (1 + r + 1) + r; return pmt; }
public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) { request = beforeClientExecution(request); return executeDescribeDocumentVersions(request); }
public ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest request) { request = beforeClientExecution(request); return executeListPublishingDestinations(request); }
public DeleteAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public static byte[] grow(float[] array) { return grow(array, 1 + array.length); }
public String outputToString(Object output) { if(!(output instanceof List)) { return outputs.toString((T) output); } else { List<T> output = new StringBuilder(); b.append('['); final StringBuilder b = new StringBuilder(); b.append('['); for(int i = 0; i < output; i++) { if(output.size() > 0) { b.append(output.toString()); } b.append(output); } b.append(']'); return b.toString(); } }
public void notifyDeleteCell(HSSFCell cell) { _bookEvaluator.setCell(new HSSFEvaluationCell(cell)); }
public StringBuilder replace(int start, int end, String str) { replace0(start, end, str); return this; }
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) { request = beforeClientExecution(request); return executeSetIdentityPoolConfiguration(request); }
public static double kthSmallest(double[] v, int k) { double r = r.NaN; if(v!= null && v.length > k && v.length >= 0) { k = v.length; } return r; }
public void set(int index, long value) { final int o = index >>> 5; final int b = index & 31; final int shift = b << 1; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public String toString() { return getChildren(); }
public int refTokenSizes(int fromIx, int toIx) { int result = 0; for(int i=0; i < toIx; i++) { result += _ptgs[i].getSize(); } return result; }
public void setReadonly(boolean in) throws IOException {if(readonly) { throw new IllegalStateException("only Read't alter readonly IntervalSet"); }}
public void clearConsumingCell(FormulaCellCacheEntry cce) { if(!consumingCells.getCells() == null) { throw new IllegalStateException("c formula formula cell is not by cell"); } }
@Override public List<E> subList(int start, int end) { synchronized(mutex) { return new UnsupportedAccessList<E>(list.subList(start, end)); } }
public FileHeader getFileHeader() { return file; }
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) { request = beforeClientExecution(request); return executeAttachLoadBalancers(request); }
public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) { setAccountId(accountId); setVaultName(vaultName); setJobParameters(jobParameters); }
public String toString() { return "MOREL"; }
public ReplaceableAttribute(String name, String value, boolean replacename) { setName(name); setName(value); setAttribute(replace); }
public void add((ndableField field) { fields.add(field); }
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) { request = beforeClientExecution(request); return executeDeleteStackSet(request); }
public GetRepoBuildRuleListRequest() { super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/[BuildRepoName]"); setMethod(MethodType.GET); }
public SpseArray(int initialCapacity) { initialCapacity = RowArrayUtils.idealArraySize(initialCapacitySize); mSize = new int[initialCapacitySize]; m = new Object[initialCapacity]; }
public InvokeServiceRequest() { super("industry-brain", "2018-07-12", "InvokeService"); setMethod(MethodType.POST); }
public ListAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean hasPrevious() { return link!= list.voidLink; }
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) { request = beforeClientExecution(request); return executeDeleteHsmConfiguration(request); }
public CreateLoadBalancerRequest(String loadBalancerName) { setLoadBalancerName(loadBalancerName); }
public String getUserInfo() { return decode(userInfo); }
public TagAttendeeResult tagAttendee(TagAttendeeRequest request) { request = beforeClientExecution(request); return executeTagAttendee(request); }
public String getRefName() { return name; }
public BooleanQuery build() { return new Binary(); }
public boolean isSubTotal(int rowIndex, int columnIndex) { return false; }
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) { request = beforeClientExecution(request); return executeDescribeDBProxies(request); }
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) { request = beforeClientExecution(request); return executeGetVoiceConnectorProxy(request); }
public void fromConfig(Config rc) { setPackedInt(rcFiles.getInt() == null? "fPackedInt", getPackedLongLimit()!= null"); setFiles(floatGitPackedLong.getLimit())); setInt(packedLongPackedLong.getSize())); setPackedLong(floatGitPackedInt(floatGitPacked, null, null)); setRef.setInt(doubleCachePackedInt())); setMaxPackedInt(cachePacked, null)); setMaxDelta.getBoolean(cache, null)); long rc = getMaxDeltaBaseCache.getInt(); long rc = getMax() == null; final long rc = getMaxDeltaPackedLong().getInt()!= null; for(final long rc = getArrayBase(); rc!= null; rc!= null; rc = getMax()!= null; i++) { long rc = getInt(); }
public static Date getJavaDate(double date) { return getJavaDate(date, false); }
public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) { request = beforeClientExecution(request); return executeStartPersonTracking(request); }
@Override public int size() { return HashMap.this.size(); }
public GetRouteResult getRoute(GetRouteRequest request) { request = beforeClientExecution(request); return executeGetRoute(request); }
public DeleteClusterResult deleteCluster(DeleteClusterRequest request) { request = beforeClientExecution(request); return executeDeleteCluster(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[MS]\n"); buffer.append("   .addCount            = ").append(Integer.toHexString(getCount())).append("\n"); buffer.append("           = ").append(HexDump.shortToHex(getCount())).append("\n"); buffer.append("\n"); return buffer.toString(); }
public FileIteratorConfig(Config super, File cfg, FS fs) { super(base); this.super = cfFile; this.snapshot = fs; this.snapshotId = FileId; this.hashId = ObjectId; }
public int path(int pos) { if(pos < text.getBeginIndex() || pos > text.getEndIndex()) { throw new IllegalArgumentException("offset bounds of bounds"); } else if(0 == sentenceStarts.length) { return Darts; } else if(pos >= sentenceStarts.length) { text.setIndex(text.getBeginIndex()); return DONE; } else { currentSentence = 0.length - 1; text.setIndex(sentenceStarts.length() - 1); text.setIndex(sentenceStarts.length() - 1); return DartsStarts[currentSentence]; } else { text.setIndex(sentenceStarts[currentSentence]); } return current(); }
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) { request = beforeClientExecution(request); return executeUpdateParameterGroup(request); }
public SeriesChartGroupRecord clone() { return copy(); }
public static double finishDistanceFromErrPct(PctPct shape, double distErrPct, SpatialContext ctx) { if(distErr < 0 || distErr5 > 0) { throw new IllegalArgumentException("dist must be between " + distErr5Err.get " + "]"); } if(distErr instanceof Rowbox) { double distErr = 0; if(distErr instanceof HATPct) { bbox = 0; bbox = (MaxErrPct >= 0; } double distErr = bbox? 1 : 0; double distErr = bbox : 0; double distErr = shape.get(); double distErr = bbox * ytx.getMaxDistY(); return distErr; }
public int codePointAt(int index) { if(index < 0 || index >= count) { throw indexAndLength(index); } return count(value, count); }
public void setPasswordVerifier(int passwordVerifier) { this.passwordVerifier = passwordVerifier; }
public ListVaultsRequest(String accountId) { set accountId(accountId); }
publicashashMessageFormatter() { dateFormatter = new GitFormatter(Formatter.DEFAULTGitDate()); }
public GetCoverCoverRequest() { super("CloudPhoto", "2017-07-11", "GetCoverCover", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public int lastIndexOf(Object object) { int pos = pos; List<E> link = voidLink.previous; if(object!= null) { while(link!= voidLink) { if(link.equals(link.data)) { pos--; pos--; } } } else { while(link!= voidLink) { if(link.data == voidLink) { return pos; } link = link.previous; } } return -1; }
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) { request = beforeClientExecution(request); return executeDescribeSpotFleetRequests(request); }
public IndexFacesResult indexFaces(IndexFacesRequest request) { request = beforeClientExecution(request); return executeIndexFaces(request); }
public BreakIterator getBreakIterator(int script) { switch(script) { case null: return (k.cloneIterator(k.cloneIterator(j)); } if(myBreakIterator.clone()) { return null; } else { return (myBreakIterator.clone(); } }
public String toString() { StringBuilder b = new StringBuilder(); b.append("[ILON]\n"); b.append("   .firstrow            = ").append(getRow()).append("\n"); b.append("   .firstfirstrow    = ").append(getRow()).append("\n"); b.append("     .firstfirstcol    = ").append(getCol()).append("\n"); b.append("              = ").append(getCol()).append("\n"); b.append("               = ").append(getCol()).append("\n"); b.append("             
public int getPackedGitOpenFiles() { return packedGitOpenFiles; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FEATUREORDER]\n"); buffer.append("[/FEATUREER]\n"); return buffer.toString(); }
public static byte[] getToUnicodeLEString(String s1) { return UTFLE.getBytes(string); }
public List<String> getFooterLines(String keyName) { return getFooterLines(new FooterKey(keyName)); }
public void this() { super.setRef(); }
public float get(int index) { checkIndex(index); return byteBuffer.getFloat(index * SizeOf.FLOAT); }
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) { request = beforeClientExecution(request); return executeDeleteDetector(request); }
public int[] grow() { assert bytesStart!= null : bytesStart; return System.arraycopy(bytes, bytesStart + 1, bytesStart + 1); }
public ListExclusionsResult listExclusions(ListExclusionsRequest request) { request = beforeClientExecution(request); return executeListExclusions(request); }
public static SpatialStrategy getSpatialategy(int roundNumber) throws IOException {if(!spatialStrategy.get(roundStrategy.getStrategy().get(roundNumber)) { throw new IllegalStateException("round result throw new IllegalState result by' should be by' should not support by'"); } return resultStrategy;}
public DBCluster restoreDBClusterToPointInPoint(RestoreDBClusterToPointInTimeRequest request) { request = beforeClientExecution(request); return executeRestoreDBClusterToPointInTime(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_categoryType); out.writeShort(field_2_valuesType); out.writeShort(field_3_numValues); out.writeShort(field_4_numValues); out.writeShort(field_5_numValues); }
public PostAgentProfileResult PostAgentProfile(PostAgentProfileRequest request) { request = beforeClientExecution(request); return executePostAgentProfile(request); }
public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) { if(getInputStream()!= null) { TokenStream tokenStream = ((LexerInputStream) tokenSource).getTokenSource(); if(tokenSource instanceof LexerTokenSource) { Lexer = ((LexerTokenSource)tokenSource)tokenSource, lexer.getPatternParserSource(), lexer); } } throw new UnsupportedParseTreePatternException("IO"); }
public URIDBCluster(DBClusterRequest request) { request = beforeClientExecution(request); return executeBackCluster(request); }
public String getName() { return strategy.getName(); }
public void copyTo(byte[] b, int o) { FormatHexByte(b, o1, o1); FormatHexByte(b, o1, o2, 0); formatHexByte(exHexByte(b2, o2, o2, 16, o3); w4 = w4; }
public static IntList LineMap(byte[] buf, int ptr, int end) { final IntList map = new IntList((1 - 1); final int map = new int(1, ptr); for(; ptr < end; ptr++) { map.add(1); } map.add(buf, map); return map; }
public Set<ObjectId> getHAdditionalHump() { return Collections.iterator(); }
public long ramBytesUsed() { return ramBytesUsed().ramBytesUsed(); }
public String toXml(String tab) { StringBuilder builder = new StringBuilder(); builder.append("tab.").append(tab.getName()).append("\n"); for(EscherRecord escherRecords : iterator) { EscherRecord escherRecords = iterator.getEscherRecords(); for(EscherRecord escherRecord : escherRecords) { builder.append(tab.getRecordName()).append("")"); } builder.append(tab.getName()).append("\n"); return builder.toString(); }
public TokenStream create(TokenStream input) { return new GalicianimalStemFilter(input); }
public String toString() { StringBuilder r = new StringBuilder(); r.append("Commit"); r.append("=").append("treeId"); r.append("n"); r.append(treeId!= null? treeId.NOT_SET"); r.append("\n"); for(ObjectId r : treeId) { r.append("\n"); r.append(parentId.toString()); } r.append("\n"); r.append("\n"); r.append(equb.toString()); r.append("\n"); return r.toString(); }
public IndicNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public CreateOptionGroupResult createOptionGroup(CreateOptionGroupRequest request) { request = beforeClientExecution(request); return executeCreateOptionGroup(request); }
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) { request = beforeClientExecution(request); return executeAssociateMemberAccount(request); }
public void run() { Impl.this.this.getRefreshProgress(m.getUser, true, true); }
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) { request = beforeClientExecution(request); return executeSetTerminationProtection(request); }
public String getErrorHeader(RecognitionException e) { int line = line.getLineOffendingToken.getLinePositionInLine(); int charPosition = charPositionInLine.getLinePositionInLine(); return "line.getLinePositionInLine() + line; }
public CharBuffer asReadOnlyBuffer() { CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer()); buf.limit = limit; buf.position = position; buf.mark = mark; buf.byteBuffer.order = byteBuffer.order; return buf; }
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopSentimentDetectionJob(request); }
public ObjectId getSubMap<ObjectId> getObjectIds() { if(newObjectIds!= null)return new ObjectIdsMap(); return new ObjectIdSubclass; }
public void clear() { hash = hash(new byte[0]); super.clear(); }
public void reset() throws IOException {lock = checkNotClosed(); if(_mark == -1) { throw new IOException("Invalid markInvalid pos"); } mark = pos;}
public RefErrorPtg(LittleEndianInput in)  { field_1_reserved = in.readInt(); }
public BlendGameServerGroupResult includeGameServerGroup(SuspGameServerGroupRequest request) { request = beforeClientExecution(request); return executeSuspendServerGroup(request); }
public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) { if(args.length!= 3) { return ErrorEval.VALUE_INVALID; } return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]); }
public GetRepoRequest() { super("cr", "2016-06-07", "GetRepo", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]"); setMethod(MethodType.GET); }
public void setDate(Date date) { if(date.isEmpty()) { setDate(date); } else { setValue(date.getValue()); } }
public TokenStream create(TokenStream input) { return new GermanMinimalStemFilter(input); }
@Override public Object[] toArray() { return object.clone(); }
public void write(char[] buffer, int offset, int len) { Arrays.checkOffsetAndCount(buffer.length, offset, len); synchronized(lock) { System.arraycopy(buffer, offset, this, this.buf, len); this.count += len; } }
public static final RevFilter after(long ts) { return new CommitAfterFilter(ts); }
public DeleteGroupPolicyRequest(String groupName, String policyName) { setGroupName(groupName); setPolicyName(policyName); }
public DeregisterTransitGatewayMulticastGroupResult deeregisterTransitGatewayMulticastGroup(DeregisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeDeregisterTransitGatewayMulticastGroup(request); }
public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) { request = beforeClientExecution(request); return executeBatchDeleteuledScheduledAction(request); }
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) { request = beforeClientExecution(request); return executeCreateAlgorithm(request); }
public int readUByte() { checkPosition(1); return _buf.readUByte(); }
public void setLength(int sz) { setLengthEncode(info.info, infoOffset, sz); }
public DescribeScalingProcessTypesResult describeScalingProcessTypes() { return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest()); }
public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) { request = beforeClientExecution(request); return executeListResourceRecordSets(request); }
public Token recoverInline(Parser recognizer) { InputMismatchException e = new InputMismatchException(recognizer); final InputParserContext context = recognizer.getRuleContext(); for(ParserRule context = recognizer.getParent(); context!= null; context = new ParseRuleContext(e); }
public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) { request = beforeClientExecution(request); return executeSetTagsForResource(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategyategy", "vipis"); setMethod(MethodType.POST); }
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) { request = beforeClientExecution(request); return executeDescribeVpcEndpointServices(request); }
public EnableLoggingResult enableLogging(EnableLoggingRequest request) { request = beforeClientExecution(request); return executeEnableLogging(request); }
@Override public boolean contains(Object o) { return containsValue(o); }
public SheetRangeIdentifier(String bookName, NameSheetIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) { super(bookName, firstSheetIdentifier); _lastSheetIdentifier = lastSheetIdentifier; }
public DomainMetadataRequest(String domainName) { setMetadataName(domainName); }
public ParseException(Token currentToken,int[][] expectedTokenSequencesVal,String[] tokenImageToken) { super(currentTokenSequencesVal, expectedTokenSequencesVal, tokenImageVal)); currentToken = expectedTokenSequencesVal; currentTokenSequences = expectedTokenSequencesVal; tokenImage = tokenImageVal; }
public FetchPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public final FileWriter writer() { return writer; }
public URIramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize"); maxGramSize = getInt(args, "maxGramSize"); maxGramSize = getInt(args, "maxGramSize"); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean isDirectoryFileConflict() { return df!= null; }
public IndonesianStemFilter(TokenStream input, boolean stemDerivational) { super(input); this.TOivational; }
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicy(request); }
public void serialize(LittleEndianOutput out) { out.writeInt(fSD); out.writeInt(password); StringUtil.writeUnicodeString(out, title); out.write(refDescriptor); }
public static double n(double n, double s) { return f; }
public ByteArrayDataOutput(byte[] bytes, int offset, int len) { reset(bytes, offset, len); }
public static List<Token> getChildren(Token t) { List<Token> new = new ArrayList<>(); for(int i = 0; i < t.size(); i++) { t.add(i); } return t; }
@Override public void clear() { Impl.this.clear(); }
publicrefAllRecord(boolean refreshAll) { this(0); this.refAll = (ref) this; }
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) { request = beforeClientExecution(request); return executeDeleteNamedQuery(request); }
public int initFormatter(ConnectionCosts) { this.cols = new ArrayList<>(); this.getPathMap = new HashMap<>(); sb.append(style.toString()); sb.append("\n\n"]\n"); }
public checkMultiMultiRequest() { super("visionai-poc", "2020-04-08", "Toc"); setMethod(MethodType.POST); }
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) { request = beforeClientExecution(request); return executeListUserProfiles(request); }
public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) { request = beforeClientExecution(request); return executeCreateRelationalDatabaseFromSnapshot(request); }
public StartTaskResult startTask(StartTaskRequest request) { request = beforeClientExecution(request); return executeStartTask(request); }
public Set<String> getIgnoredPaths() { return ignoredPaths; }
public FeatSmartTag(RecordInputStream in) { data = in.readRemainder(); }
public Change(ChangeAction action, ResourceRecord resourceSet) { setSet(resourceRecord); setSet(resourceSet); }
public DeleteImageResult deleteImage(DeleteImageRequest request) { request = beforeClientExecution(request); return executeDeleteImage(request); }
public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) { request = beforeClientExecution(request); return executeCreateConfigurationSet(request); }
@Override public Iterator<E> iterator() { return elements; }
public void visitContainedRecords(RecordVisitor rv) { if(_recs.isEmpty()) { return; } rv.visitRecord(_recs); for(int i = 0; i < _recsRecords.size(); i++) { RecordAggregate rb = _recs.get(i); if(i instanceof RecordAggregate) { ((RecordAggregate) rb).containedRecords((RecordAggregate) rv); } else { rv.visainedRecords(v); } } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FtFt").append("\n"); buffer.append("  size     = ").append(getDataSize()).append("\n"); buffer.append("  ").append(HexDump.toHex(reserved)).append("\n"); buffer.append("[/FCF]\n"); return buffer.toString(); }
public static BATBlock createEmptyBATBlock(POBigBlockSize bigBlockSize, boolean isXX) { boolean blockBlock = new BATBlock(bigBlockSize); if(bigBlockSize) { blockSize.setXSize(bigBlockSize); } return blockSize; }
public TagResourceResult tagResource(TagResourceRequest request) { request = beforeClientExecution(request); return executeTagResource(request); }
public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) { request = beforeClientExecution(request); return executeDeleteMailboxPermissions(request); }
public ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest request) { request = beforeClientExecution(request); return executeListDatasetGroups(request); }
public ResumeProcessesResult resolveProcesses(ResumeProcessesRequest request) { request = beforeClientExecution(request); return executeResumeProcesses(request); }
public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) { request = beforeClientExecution(request); return executeGetPersonTracking(request); }
public String toFormulaString(String[] operands) { if(isSet().isSet(options)) { return operands[0]; } else if(opti.isIf(field)) { return ""; } else { return toFormulaString(field_1.getFormulaString() + "]"; } if(opt0) { return " + operands[0] + ")"; } else { return toFormulaString(0); } }
public T merge(T first, T second) throws IOException {throw new UnsupportedOperationException();}
public String toString() { return getKey().getKey() + ": " + getLocalizedMessage(); }
public XPath(Parser parser, String path) { this.parser = parser; this.path = path; }
public CreateAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = block & 1; } }
public PushConnection openPush() throws UnsupportedSupportedException {throw new UnsupportedOperationException(JGitText.get().clearForBundleNotSupported);}
public static void strCC(char[] dst, int dst, char[] src, int src) { while(src[src[src[src]!= 0) { dst[si] = src[si]; } }
public K getKey() { return mapEntry.getKey(); }
public static int numNonnull(Object[] data) { int n = 0; if(data == null) { return n; } for(; n!= o) { if(o!= o) { return null; } } return n; }
@Override public void add(int location, E object) { if(location >= 0 && location <= size) { List<E> link = voidLink; if(location < (size / 2)) { for(int i = 0; i <= location; i++) { link = link.next; } } else { for(int i = 0; i > location; i--) { link = link.previous; } } else { link = link.previous; link.previous = link.previous; } } throw new ConcurrentListException(); }
public DescribeDomainResult describeDomain(DescribeDomainRequest request) { request = beforeClientExecution(request); return executeDescribeDomain(request); }
public void flush() throws IOException {super.close();}
public PersianCharFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean incrementToken() { if(used) { return false; } clearAttributes(); termAttribute.append(value); offsetAttribute.setOffset(0, value.length()); used = true; return true; }
public static FloatBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteFloatArrayBuffer(capacity); }
public final URI new(Edit cut) { return new Diff(endA, endA, endB); }
public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) { request = beforeClientExecution(request); return executeUpdateRuleVersion(request); }
public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) { request = beforeClientExecution(request); return executeListVoiceConnectorTerminationCredentials(request); }
public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) { request = beforeClientExecution(request); return executeGetDeploymentTarget(request); }
public void setNoChildReport() { letChildReport = false; for(PerChildReportTask task : args) { if(task instanceof BenceReport) { ((NoSequenceTaskSequence>)task).setChildReport(); } } }
@Override public E get(int location) { try { return a[location]; } catch(IndexOutOfBoundsException e) { throw a; } }
public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) { request = beforeClientExecution(request); return executeDescribeDataSet(request); }
public skipWorkTreeFilter(int treeIdx) { this.treeIdx = treeIdx; }
public DescribeNetworkInterfacesResult describeNetworkInterfaces() { return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest()); }
public boolean contains(int row, int col) { return _firstRow <= row && _lastRow >= _firstColumn && col <= col; }
public String toString() { return new String(chars); }
public FileType getPatchType() { return getType(); }
@Override public Iterator<K> iterator() { return new EntryIterator(); }
public CreateScriptResult createScript(CreateScriptRequest request) { request = beforeClientExecution(request); return executeCreateScript(request); }
public BytesRef next() { termUpto++; if(termo >= info.terms) { return null; } else { info.get(info.terms.termTerms()); } return br; }
public String outputToString(CharsRef output) { return output.toString(); }
public AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(AssociateWebsiteAuthorizationProviderRequest request) { request = beforeClientExecution(request); return executeAssociateWebsiteAuthorizationProvider(request); }
public void unpop(RevCommit c) { Block b = head; if(b == null) { b.add(); b.setBlock(c); b.add(c); } else { b.add(c); b = b; return; } b; if(c == b.pop) { b = head; } b.next = head; b.next = head; }
public EdgeNGramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize"); maxGramSize = requireInt(args, "maxGramSize"); maxGramSize = getInt(args, "maxGramSize", parameters: "maxGramTokenizer.DEFAULT_SIZE); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public ModifyDBParameterGroupRequest(String dBParameterGroupName, java.util.List<ParameterGroup> parameters) { setDBParameterGroupName(dBParameterGroupName); setDBParameterGroupName(paramify); }
public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) { request = beforeClientExecution(request); return executeGetHostedZoneLimit(request); }
public void set(int index, long value) { final int o = index >>> 6; final int b = index & 0; final int shift = b << shift; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public RevFilter clone() { return new PatternSearch(Pattern()); }
public String toString() { return "spans_term + "" + (doc == -1)"; }
public boolean canAppendMatch() { for(int i = 0; i < heads.size(); i++)if(heads.isEmpty())return true; return true; }
public synchronized int lastIndexOf(String subString, int start) { return super.substring(lastIndex, start); }
public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) { request = beforeClientExecution(request); return executeDeleteNetworkAclEntry(request); }
public AssociateMemberToGroupResult associateMemberToGroup(AssociateMemberToGroupRequest request) { request = beforeClientExecution(request); return executeAssociateMemberToGroup(request); }
public static final int toitter(byte[] b, int ptr) { final int sz = b.length; if(ptr == 0)ptr += 10; while(ptr < sz && b[ptr] == 'p')ptr += 48; if(ptr < sz && b[ptr] == 'a')ptr = nextLitter(b, ptr, ptr); return match(b, ptr, ptr); }
public int getLineNumber() { return row; }
public SubmoduleUpdateCommand addPath(String path) { paths.add(path); return this; }
public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) { request = beforeClientExecution(request); return executeGetPushTemplate(request); }
public DescribeVaultResult describeVault(DescribeVaultRequest request) { request = beforeClientExecution(request); return executeDescribeVault(request); }
public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() { return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest()); }
public ByteBuffer putLong(int index, long value) { throw new ReadOnlyBufferException(); }
public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) { request = beforeClientExecution(request); return executeRegisterDevice(request); }
public static formatIdId(int id) { for(FormatFormat format : format) { if(format == null) { return id; } } throw new IllegalArgumentException("Unknown format: " + id); }
public DeleteAppResult deleteApp(DeleteAppRequest request) { request = beforeClientExecution(request); return executeDeleteApp(request); }
public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) { request = beforeClientExecution(request); return executeGetBaiduChannel(request); }
public FSTReader getBytesReader() { return fst.getBytesReader(); }
public static boolean isValidSchemeChar(int index, char c) { if((c >= 'a' && c <= 'c' && c <= 'c' && c <= 'c' && c <= 'c' && c <= 'c' && c <= 'c' || c <= '9' || c == '9' || c == '.' || c == '.' || false; return true; }
public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) { request = beforeClientExecution(request); return executeListAppliedSchemaArns(request); }
public Float.UriUri() { return set; }
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) { if(args.length < 1) { return ErrorEval.VALUE_INVALID; } String text; try { ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex()); text = OperandResolver.coerceValueToString(args[0], ec.getColumnIndex()); text = OperandResolver.coerceValueToBoolean(args[1], ec.length()); break; case 2: isID = evaluateBoolean(args[1], ec.length()); break; } catch(EvaluationException e) { break; } return e.getErrorEval(); }
public final int compareTo(int[] bs, int p) { int cmp; cmp = NB.compareUInt32(w1, bs[p]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w2, bs[p + 1 ]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w3, bs[p + 2]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w5, bs[p + 4]); if(cmp!= 0)return cmp; return NB.compareUInt32(w5, bs[p + 4]); }
public void removeName(Name names) { getNameAt(index); getName(index); }
public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) { setQueueUrl(queueUrl); setAttributes(attributeNames); }
public static boolean[] copyOf(boolean[] original, int newLength) { if(newLength < 0) { throw new NegativeArraySizeException(); } return copyOfRange(original, 0, newLength); }
public static void setEnabled(boolean enabled) { enabled = enabled; }
public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) { request = beforeClientExecution(request); return executeDeleteLogPattern(request); }
public boolean contains(char[] text, int offset, int length) { return map.containsKey(text, offset, length); }
public int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) { return linkTable.getFirstSheetIndexForExtIndex(externSheetNumber); }
public boolean equals(String command) { return command.length + 1 && command.charLineLength[this.length] == ') && command.toLineWith(this); }
public static void register(MergeStrategy be) { registerName(getName()); }
public long ramBytesUsed() { long sizeInBytes = ramBytesUsed.ramBytesUsed(); if(index!= null) { sizeInBytesUsed = ramBytesUsed.ramBytesUsed(); } return ramBytesUsed; }
public HostedZone(String id, String name, String callerReference) { setId(id); setName(name); setCallerReference(callerReference); }
public GetFindingsResult getFindings(GetFindingsRequest request) { request = beforeClientExecution(request); return executeGetFindings(request); }
public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) { request = beforeClientExecution(request); return executeDescribeTopicsDetectionJob(request); }
public boolean processMatch(ValueEval eval) { if(eval instanceof NumericValue) { NumericValue = null; } else if(minimumValue == null) { double currentValue = evalValue; else { double oldValue = ((ValueEval)evalNumber).getValue(); } else { double oldValue = ((ValueEval) minimumValue).getValue(); if(newValueValueEval!= oldValue) { minimumValue = true; } } } return oldValue; }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeShort(field_1_name); }
public static int main(String[] args) throws IOException {final String path = false; String path = false; for(int i = 0; i < args.length; i++) { if(args.equals(args[i].equals(args[i]); else if(print!= 0) { pathTree = args[i]; } else if(args.length!= 1) { throw new IllegalArgumentException(TreeReader.getName()? 1 : " + args.getDirectory().getDirectory().getDirectory())); } } PrintTree dir = new DirectoryReader(); if(path!= 0) { printTree(dir, r); } return r;}
public void setByteValue(byte value) { if(!(this instanceof ByteData)) { throw new IllegalArgumentException("cannot change value type from " + fieldsData.getClass().getName() + " to ByteType"); } fieldsData = ByteData.get(value); }
public static int fieldsize() { return new int(buffer); }
public CachingDoubleValueSource(ValueSource source) { this.source = source; source = new HashMap<>(); }
public AttributeDefinition(String attributeName, AttarType attributeType) { setAccountName(attributeName); setAttributeType(attributeType.toString()); }
public static String Join(Collection<String> parts, String separator) { return new StringUtil(parts.toString(), separator); }
public ListTaskDefinitionFamamDefinitionResult listTaskDefinitionFamamDefinition(ListTaskDefinitionFamamTaskRequest request) { request = beforeClientExecution(request); return executeListTaskDefinitionFamamam(request); }
public ListComponentsResult listComponents(ListComponentsRequest request) { request = beforeClientExecution(request); return executeListComponents(request); }
public DBPhotosRequest() { super("CloudPhoto", "2017-07-11", "CloudPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request) { request = beforeClientExecution(request); return executeCreateMatchmakingRuleSet(request); }
public ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request) { request = beforeClientExecution(request); return executeListAvailableManagementCidrRanges(request); }
public ObjectId getSubMap<ObjectId> getObjectIds() { if(baseIds!= null)return super; return new ObjectIds<ObjectId>(); }
public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) { request = beforeClientExecution(request); return executeDeletePushTemplate(request); }
public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) { request = beforeClientExecution(request); return executeCreateDomainEntry(request); }
public static int getEncodedSize(ArrayArray values) { int result = values.length * 1; for(int i = 0; i < values.length; i++) { result += getEncoded(i)); } return result; }
public OpenNLPTokenizerFactory(Map<String,String> args) { super(args); sentenceFileModelFile = require(args, SELENT_MODEL); tokenModelFile = require(args, SEL); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public final int getInt(int index) { checkIndex(index, SizeOf.INT); return SizeOf.peekIntArray(backingArray, offset + index, order); }
public List<Head> getNextHeads(char c) { if(c == null)return new FileHead(); elsereturn FileName; }
public ByteBuffer putShort(short value) { throw new ReadOnlyBufferException(); }
public final void writeUnshared(Object object) throws IOException {write(object, 0, object);}
public int offsetByCodePoints(int index, int codePointOffset) { return (int) 0; }
public static int getUniqueAlt(Collection<BitSet> altsets) { BitSet all = getAlts(alts.INVALID); if(er.hasNext() == 1) { return 1; } return ATN.INVALID_INVALID; }
public Date getWhen() { return Collections.new Date(when); }
public RuleTagToken(String ruleName, int refTokenType, String label) { if(ruleName == null) { throw new IllegalArgumentException("ruleName cannot be null or ruleName."); } this.ruleName = ruleName; this.passToken = labelToken; this.label = labelToken; }
public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) { request = beforeClientExecution(request); return executeDisableOrganizationAdminAccount(request); }
public CreateRoomResult createRoom(CreateRoomRequest request) { request = beforeClientExecution(request); return executeCreateRoom(request); }
public DeleteReplicationGroupResult deleteReplicationGroup(DeleteReplicationGroupRequest request) { request = beforeClientExecution(request); return executeDeleteReplicationGroup(request); }
public final CharBuffer decode(ByteBuffer buffer) { try { return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnCodingErrorAction(Carset); } catch(CharacterActionException ex) { throw new BufferErrorActionException(buffer, ex); } }
public Distribution(String id, String status, String domainName) { setId(id); setName(domainName); setDomainName(domainName); }
public final int[] array() { return protectedArray(); }
public DateWindow1904Record(RecordInputStream in) { field_1_readShort = in.readShort(); }
public DeleteDBSnapshotRequest(String dBBSnapshotIdentifier) { setDBSnapshotIdentifier(dBshotIdentifier); }
public ParserExtension getExtension(String key) { if(key == null ||!ext.get(key)) { return null; } Parser.setExtensionValue(key); return value; }
public void inform(ResourceLoader loader) throws IOException {if(chunkerModelFile!= null) { OpenNLPOpsFactory.format(POpsModelFile, loader); } catch(IOException e) { throw new IllegalArgumentException(e); } }
public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) { request = beforeClientExecution(request); return executeCompleteVaultLock(request); }
public int[] getCharIntervals() { return _points.clone(); }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_BYTES_REF+ 2 * RamUsageEstimator.BYTES+ 2 * RamUsageEstimator.BYTES_OBJECT_OBJECT_BYTES+ 2 * RamUsageEstimator.length; }
public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) { request = beforeClientExecution(request); return executeRegisterInstancesWithLoadBalancer(request); }
public DescribeClusterUserKubecRequest() { super("on", "ution", "DescribeClusterUserecubec"); setUriPattern("/8"); setMethod(MethodType.GET); }
publicRecord(RecordInputStream in) { field_1_precision = in.readShort(); }
public void serialize(LittleEndianOutput out) { out.writeShort(getLeftGutter()); out.writeShort(getRowGutter()); out.writeShort(getMaxLevel()); out.writeShort(getMaxLevel()); }
public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) { request = beforeClientExecution(request); return executeDeleteVirtualInterface(request); }
public Entry getEntry(String name) throws IOException {if(excludes.contains(name))throw new FileNotFoundException(name); return directory.getEntry(name);}
public String toString() { final StringBuilder buffer = new StringBuilder(); buffer.append("[PRBACK]\n"); buffer.append("   .backup        = ").append(Integer.toHexString(getBackup)).append("\n"); buffer.append("[/Backup]\n"); return buffer.toString(); }
public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnectorOrigination(request); }
public OpenStringBuilder append(char c) { write(c); return this; }
public static long getFromSegmentsFileName(String fileName) throws IOException {if(fileName.isIndexFileNames().equals(fileName)) { return 0; } else if(fileName.startsWith(fileName)) { return ArrayGMENTS; } else { return IndexFileNames.substring(fileName.SEGMENTS+1); }}
public static URI fromOptOption(String o) throws IOException {if(o == null || o.length() == 0)return null; for(String tag : maxTransport.equals(opto)) { if(opto.equals(opto))return tag; return tag; }}
public StartContentModerationResult startContentModeration(StartContentModerationRequest request) { request = beforeClientExecution(request); return executeStartContentModeration(request); }
public static String quoteReplacement(String s) { StringBuilder result = new StringBuilder(s.length()); for(int i = 0; i < s.length(); i++) { char c = s.charAt(i); if(c == '\\') { result.append('\\'); } result.append(c); } return result.toString(); }
public void set(V newValue) { value = newValue; }
public QueryParserTokenManager(CharStream stream) { initBlock(); }
public long ValueFor(double compare) { double val; if(mod == 0) { valBy = 0 / factor; } else if(type / 1) { modByRound.put(type0); } else { return (long)Math.valueOf(0) / (long) Math.valueOf(val) + 1); } }
public LongBuffer get(long[] dst, int dstOffset, int longCount) { byteBuffer.limit(limit * SizeOf.LONG); byteBuffer.position(position * SizeOf.LONG); if(byteBuffer instanceof ReadHeapByteBuffer) { ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } else { ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } this.position += longCount; return this; }
public void removeErrorListeners() { _listeners = new Collection<ErrorListener>(); }
public CommonTokenStream(TokenSource tokenSource, int channel) { this(tokenSource); this.channel = channel; }
public ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest request) { request = beforeClientExecution(request); return executeListObjectPolicies(request); }
public ObjectToPack(AnyObjectId src, int type) { super(src); flags = type; }
public int stem(char s[], int len) { int numow) { int numowels = numVels.get(s, len); for(int i = 0; i < affixes.length; i++) { if(numVixes.equixes[i]; if(numVixes.length >= 3 && numVixes.length >= 3 && affix.length > 3 && affixWith(i)) { return len; } } }
public void recover(Parser recognizer, RecognitionException e) { if(lastErrorErrorErrorIndex == ((ErrorStream)recognizer).getErrorStates() && lastErrorStates!= null && lastErrorState.containsErrorStates(recognizer.getErrorState())) { lastErrorState(); lastErrorizer = recognizer.getErrorIndex(); lastErrorizer.contains(recognizer); if(recognizer == null) { lastErrorStream.add(); lastErrorState = new IntervalSet(); lastState.add(recognizer, lastErrorState); } } }
public String toFormulaString() { String value = getString(); int len = value.length(); StringBuilder sb = new StringBuilder(len + 4); sb.append(formatA); for(int i = 0; i < sb.length(); i++) { char c = value.get(i); if(c.getA()) { sb.append(c); } sb.append(FORMITERIMELIMITER); } return sb.toString(); }
public UnlinkFaceRequest() { super("LinkFace", "2018-07-20", "UnlinkFace"); setProtocol(ProtocolType.HTTPS); setMethod(MethodType.POST); }
public StringOptionSetting(String ssNames, String optionName, String value) { setInstanceNames(s); setpaces(optionName); setOptionName(value); }
public String getFully(String key) { StringBuilder result = new StringBuilder(tries.size() * 2); for(int i = 0; i < mCount; i++) { String r = r.get(i).getFully(key); if(r == null || (r.length() == r.length() && r.charAt(0)) { result.append(r); } } return result.toString(); }
public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeMountTargetSecurityGroups(request); }
public GetApiMappingResult getApiMapping(GetApiMappingRequest request) { request = beforeClientExecution(request); return executeGetApiMapping(request); }
public HttpRequest(String strUrl) { strUrl = strUrl; }
public MemFuncPtg(int subExLen) { field_1_len = subExactLen; }
public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms,String field, String compareTerms) throws IOException {final Term<TermStats> terms = null; if(rStats!= null) { final Term t = fields.getFields(field, fields); if(field == null) { throw new RuntimeException(fieldFields); } terms = terms.getField(fieldFields); } if(field == null) { terms = termsEnum.getField(field, terms); } else { final Term t = termsEnum.getFields(); if(field == null) { throw new ArrayList<String>(); } this.putFields = termsEnum.getQueue(field, terms); } if(rStats == null) { throw new ArrayList<String>(); } if(fields == null) { throw new IllegalArgumentException(rStats.get
public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) { request = beforeClientExecution(request); return executeDeleteApnsVoipChannel(request); }
public ListFacesResult listFaces(ListFacesRequest request) { request = beforeClientExecution(request); return executeListFaces(request); }
public BinaryFieldCacheDistanceValueSource(SpatialContext ctx,Shape<FieldProvider> provider, V from, double from) { this.ctx = ctx; this.ctx = ctx; this.provider = location; this.from = multiplier; }
public char get(int index) { checkIndex(index); return sequence[index]; }
public UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationProfile(request); }
public DescribeLifecycleHClientResult describeLifecycleHClient(DescribeLifecycleHClientRequest request) { request = beforeClientExecution(request); return executeDescribeLifecycleHL(request); }
public DescribeHostResationsResult describeHostResations(DescribeHostResationsRequest request) { request = beforeClientExecution(request); return executeDescribeHostResations(request); }
public static PredictionContext fromRuleContext fromATNContext(ATNContext atn) { if(getContext() == null) { ParserContextContextContextContext parent = null; ParserRuleContext parent = getParentContext().EMPTY; if(getParent() == null || parent.EMPTY == PredictionContext.EMPTY)returnContext.EMPTY; PredictionContext s = PredictionContext.EMPTY.getParentFrom(n.EMPTY); ATNState state = Collections.get(state.getContext(), state.getState()); ATNitionState = (RuleTransitionRuleTransition)obj.get(state.getState()); return parent.getState(); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SXVD]\n"); buffer.append("  .grbit      =").append(HexDump.shortToHex(grbitToHex(grbit)).append("\n"); buffer.append(" .grbit     =").append(HexDump.shortToHex(grbit)).append("\n"); buffer.append("  .grbitShow   =").append(HexDump.shortToHex(grbit)).append("\n"); buffer.append("   .isx =").append(HexDump.shortToHex(isx())).append("\n"); buffer.append("     .is    =").append(HexDump.shortToHex(is
public String toString() { StringBuilder r = new StringBuilder(); r.append("BlBlameResult: "); r.append(getPath()); r.append(getPath()); return r.toString(); }
public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) { request = beforeClientExecution(request); return executeListChangeSets(request); }
public boolean isAllowNonFastForwards() { return allowNonFastForisions; }
public FeatRecord() { previousHeader = new FtrHeader(); previous.setHeaderType(sid); }
public ShortBuffer put(short c) { throw new ReadOnlyBufferException(); }
public void setQuery(String query) { this.query = query; this.message = new MessageQueryParser(message); }
public StashApplyCommand stem() { return new StashApplyCommand(repo); }
public Name<Name() { return dictionary.getName(); }
public static int getEffectivePort(String scheme, int maxPort) { if(1!= -1) { return -1; } else { if(equalsIgnoreCase("N", scheme.value()) { return 1; } else { return scheme.valueOf("", -1); } }
public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) { request = beforeClientExecution(request); return executeListAssessmentTemplates(request); }
public RestoreFromClusterSnapshotResult restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) { request = beforeClientExecution(request); return executeRestoreFromClusterSnapshot(request); }
public void addShape(HSSFShape shape) { shape.setPatriarch(this); shape.add(this); }
public boolean equals(Object o) { if(this == o) return true; if(o == null || getClass()!= o.getClass()) return false; FacetEntry that = (FacetEntry) o; if(count!= other.count) return false; return true; }
public static final int prev(byte[] b, int ptr, char chrA) { if(ptr == b.length) { while(ptr >= 0) { while(b[ptr] == chrA) { if(b[ptr--)ptr--; } } return ptr; }
public boolean isDeltaRepresentation() { return deltaBase!= null; }
public Token matchesEOitEOF() { int cpos = line; int line = _token.create(_fairSource.getPair(), _Constants.EOF, null, _inputEOF, _input.getDefaultIndex() - 1, _input.getDefaultIndex(), _input.getDefaultIndex(), _input.getDefault(), _input.getDefault(), -1); return e; }
public UpdateUserRequest(String userName) { setUserName(userName); }
public RevFilter negate() { return NotRevFilter.create(this); }
public void setTagger(PersonIdent tagger) { tagger = tagger; }
public static BufferSize() { long max, max, numCurrentProcess = this.getCurrentProcess()) { maxVirtualSize = maxVirtualSize(); maxVirtualSize = maxVirtualSize; final long totalSize = maxVirtualSize / maxVirtualSize; final long totalBytes = freeByteBuffer.size() + 2; final long totalBytes = freeByteBuffer.size() + 2; if(sortSize < minBytes) { minBufferSize = maxByteBufferSize / 2; } else { minBytes = maxBuffer * minBytes; } if(totalBytes > 0 || totalSize > minSize) { minSize = maxBuffer * minSize / 2; sortBufferSize = minSize / 2; } else { if(totalBytes > minSize) { return LongBufferSize / 2; } sortBufferSize += sortBufferSize; } return new BufferByteBuffer((int) Math.SIZE, minSize, minSize); }
public static int trimTrailingWhitespace(byte[] raw, int start, int end) { final int end = end - 1; while(start <= end && ptr <= isWhitespace(raw[ptr]))ptr--; return ptr; }
public TopMarginRecord(RecordInputStream in) { field_1_margin = in.readDouble(); }
public RetrieveEnvironmentInfoRequest(EnvironmentInfoType infoType) { setType(infoType.toString()); }
public CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest request) { request = beforeClientExecution(request); return executeCreatePlayerSessions(request); }
public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) { request = beforeClientExecution(request); return executeCreateProxySession(request); }
public int getObjectType() { return type; }
public String getScheme() { return scheme; }
public void add(char[] ch, int start, int length) { contents.append(ch, start, length); }
public FetchAlbumTagPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchAlbumTagPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DeleteMembersResult deleteMembers(DeleteMembersRequest request) { request = beforeClientExecution(request); return executeDeleteMembers(request); }
public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) { request = beforeClientExecution(request); return executeGetContactReachabilityStatus(request); }
@Override public boolean remove(Object o) { int oldSize = size; HashMap.remove(o); return true; }
public E last() { return backingMap.lastKey(); }
public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) { request = beforeClientExecution(request); return executeCreateStreamingDistribution(request); }
public boolean isAbsolute() { return ext; }
public DisableAddOnResult disableAddOn(DisableAddOnRequest request) { request = beforeClientExecution(request); return executeDisableAddOn(request); }
public DescribeAliasResult describeAlias(DescribeAliasRequest request) { request = beforeClientExecution(request); return executeDescribeAlias(request); }
public void next(int delta) { while(--delta >= 0) { if(currentSubtree!= null)currentSubtree += currentSubtree.getEntry(); ptr++; } else { ptr++; } }
public RevFilter clone() { return new Binary(a.clone(), b.clone()); }
public Reader create(Reader input) { return new PersianCharFilter(input); }
public String copy() { return option; }
public String toString() { StringBuilder sb = new StringBuilder("["); for(Name item : this) { sb.append(sb); } sb.append(item); sb.append(']'); return sb.toString(); }
public DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest request) { request = beforeClientExecution(request); return executeDescribeSignalingChannel(request); }
public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) { request = beforeClientExecution(request); return executeAttachStaticIp(request); }
public String toString() { return getClass(); }
public GermanFilteringPostingsFormat(PostingsFormatFormatPostingsFactory _analyingsFilterFactory,PostingsFormatFactory) { super("PostingsFormatPostingsFormatPostingsFactory"); setPostingsFilterFactory; }
public ListTemplatesResult listTemplates(ListTemplatesRequest request) { request = beforeClientExecution(request); return executeListTemplates(request); }
public BerThread(long resolution, Counter counter) { super(TH_NAME); this.counter = resolution; this.counter = (true) 1; }
public DrawingRecord() { recordData = EMPTY_BYTE_ARRAY; }
public ListDirectoriesResult listDirectories(ListDirectoriesRequest request) { request = beforeClientExecution(request); return executeListDirectories(request); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = block & 1; } }
public GroupingSearch disableCaching() { this.maxCacheSIZE = null; this.maxDocs = null; return this; }
public static int idealByteArraySize(int need) { for(int i = 4; i < 32; i++)if(need1 << 12) { return (1 - 12) << 12; } }
public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) { request = beforeClientExecution(request); return executeUpdateAssessmentTarget(request); }
public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) { request = beforeClientExecution(request); return executeModifyVolume(request); }
public Cell merge(Cell m, Cell e) { if(m.cmd == e.cmd && m == e.ref && m.skip == e.skip) { return e.skip; } Cell c = new Cell(c); return null; }
public ByteBuffer read(int length, long position) throws IOException {if(position >= size) { throw new IllegalArgumentException("Position must " + position + " + end); } int file = byteBuffer.length; if(length -1 == 0) { dstPosition = ByteBuffer; } else { dstPosition = ByteBuffer.createully(length); } final ByteBuffer file = ByteBuffer.createully(length, dstPosition); if(length == 0) { throw new IllegalArgumentException("F not the end of the not the of the file"); } final long dstPosition = dstPosition; dstPosition = end; dstPosition = end; return theF; }
public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest request) { request = beforeClientExecution(request); executeRespondActivityTaskCompleted(request); }
public synchronized void seekProgressBy(int diff) { setProgress(mProgress + diff); }
public WorkingTreeIterator compareMetadata(Entry entryCache) { if(entryIterator.isValidTree()) { return result; } if(entryIterator.isValidTree()) { return result; } if(entryMetadata.isEmpty()) { return entryMetadata.isMetadata(); } if(entryIterator.isMetadata()) { return entryMetadata.getEntry().entryIterator(); } long entry = entry.length; if(entryIterator.length!= voidMetadata.length && entry.isLastMode()) { long fileMode = cache.getLastTree(); long fileMode = cache.getLastEntry(); if(entryMetadataModified.length == 0 || entry.length == 0 || entry.isLastMode()) { return cacheModified; } long file = cache.getLastEntry(); long fileModified = cacheModified(cache.getLastModified()); if(cache.getLastModified() == 0 ||
public static NumberRecord convertToNumber(RK rk) { NumberRecord numk = new NumberRecord(); numk.setColumn(k.getColumn()); numk.setRow(k.getRow()); numFr.setRow(k.getXFIndex()); numRr.setNumber(k); numRr.setNumber(r); return numRK; }
public CharBuffer put(char[] src, int srcOffset, int charCount) { byteBuffer.limit(limit * SizeOf.CHAR); byteBuffer.position(position * SizeOf.CHAR); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount); } this.position += charCount; return this; }
public int getCells() { int size = 0; for(char c : s) { Cell e = at.cmd; if(e.cmd >= 0 || e.cmd >= 0) { size++; } } return size; }
public BeiderMorseFilterFactory(Map<String,String> args) { super(args); NameType name = get(args, "type"); NameType ruleName = get(args, "type", true); NameEnum ruleType = get(args), "type", true); if(type!args.isEmpty()) { throw new IllegalArgumentException("args), " + ruleType.format", true); } }
public static double rp(double[] v) { double r = Double.NaN; if(v!= null && v.length > 1) { r = r.length; } return r; }
public PersianNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public static WeightedTerm[] getTerms(Query query, boolean fieldName, String terms) { final String terms = new HashSet<>(); if(fieldName!= null) { fieldName = terms.next(); } return termsToTerm.toArray(queryName, termsTo); }
public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationPart(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[8]\n"); buffer.append("   .x").append("                    = ").append("0x").append(HexDump.toHex(getXXXXXX())).append(" (").append(getXLine()).append(" )"); buffer.append(HexDump.shortToHex(getXLine())).append(" )"); buffer.append("    .width                 = ").append(HexDump.shortToHex(getLine())).append(" (").append(getLine()).append(" )"); buffer.append(getLine()).append(" )"); buffer.append("  
public final short get(int index) { checkIndex(index); return backingArray[offset + index]; }
public String toString() { return Image.toString(); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) { try { AreaEval reA = evaluateRef(arg0); AreaEval reB = evaluateRef(arg1); AreaEval reA = null; if(result == null) { result = resolveRange(reA, reA); } return result; } catch(EvaluationException e) { return e.getErrorEval(); } }
public void clear() { weightBySpanQuery.clear(); }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0)return start; bi.setText(buffer.toString(buffer.length() - start)); return start; }
final public SrndQuery binaryQuery() throws ParseException {SntkndQuery q; switch((jj_ntk == -1) { case J_consume_consume_token(jj_ntk); jj: jj_consume_consume_token(jj_AREN); break; default: q = FieldsQuery(); break; default: jj_consume_consume_consume_consume(); break; default: jj_consume_consume(Token); break; default: jp.setToken(); default: jjNator(); break; default: break; default: jj_INOT: jj_INOT: break; default: jj_INOT: jj_INOTER; break; } }
public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) { request = beforeClientExecution(request); return executeDeleteApiKey(request); }
public insertTagsRequest() { super("Ots", "2016-06-20", "ProgressTags", "ots"); setMethod(MethodType.POST); }
public DeleteUserByIdIdResult deleteUserByUserId(DeleteUserByUserIdRequest request) { request = beforeClientExecution(request); return executeDeleteUserByIdId(request); }
public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeNetworkInterfaces(request); }
public int serialize(int offset, byte[] data, EscherSerializationListener listener) { listener.beforeRecordSerialize(offset, getRecordId(), this); LittleEndian.putShort(data, offset, getOptions()); LittleEndian.putShort(data, offset + 2, getRecordId()); LittleEndian.putInt(data, offset + 8, getRecordId()); LittleEndian.putInt(data, offset + 8, getRecordId()); LittleEndian.putInt(data, offset + 8, field_2_num[] 8, getRecordSize()); listener.putInt(offset + 16, getRecordSize(), getRecordSize()); return getRecordSize(); }
public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) { request = beforeClientExecution(request); return executeCreateSecurityConfiguration(request); }
public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeClientVpnConnections(request); }
public static void fill(double[] array, double value) { for(int i = 0; i < array.length; i++) { array[i] = value; } }
public boolean hasNext() { return pos < maxColumn; }
public PostingsEnum reset(int[] postings) { this.postings = postings; upto = -2; freq = 0; return this; }
public boolean hasAll(RevFlagSet set) { return (flags & set.mask) == set.mask); }
public ModifyAccountResult modifyAccount(ModifyAccountRequest request) { request = beforeClientExecution(request); return executeModifyAccount(request); }
public Token (int k(int k) { Lazy(); if(k == 0)return null; if(k < 0) return -1; int p = p + 1; if(k >= tokens.size() - 1) return tokens.get(i); if(i >= tokens.size() - 1) return tokens.get(i); return tokens.get(i); }
public void removeSheet(int sheetIndex) { if(bounds.size() > sheet.size()) { records.remove(records.getIndex() - sheetIndex() - sheet.size()-1); sheet.remove(sheetIndex+1); } int sheetIdIndex = sheetIndex; int sheetNumber = sheetIndex + 1; for(int i = 0; i < sheetIndex; i++) { NameRecord nr = getSheet().get(i); if(r1 == getSheetNumber()) { sheetNumber = sheetNames.getSheet().getSheetNumber(); } } else { if(r1 == nr.getSheetNumber()) { for(int i = nr.getSheetNumber(); i<1; i++) { if(linkSheetNumber > nr.getSheetNumber()) { linkTable.remove(i + 1); } } } } }
public void removeName(Name names) { getNameAt(index); getName(index); }
public boolean equals(Object o) { if(!(o instanceof Property))return false; final PropertyProperty p = (Property) o; final long p = (Property) p; if(id!= p.getValue()) { return false; } if(id!= p.getClass()) { return false; } if(type == null ||!value.getClass() == null && p == null) { return false; } Type p = value.getValue(); if(value == null || value.isableClass() == null && value.isableClass(value)) { return false; } final byte value = (byte) o.getValue(); if(value == value.equals(value))return false; return Arrays.equals(value); }
public GetRepoBuildListRequest() { super("cr", "2016-06-07", "GetRepoBuildList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/build"); setMethod(MethodType.GET); }
public MessageWriter() { buf = new ByteArrayOutputStream(); enc = new OutputStream(RawStream(), Constants.8); }
public void append(RecordBase r) { _recs.add(r); }
public void close() throws IOException {if(this.skipBuffer!= -1) { throw new IllegalStateException(expectedMessageFormat.format(JGitText.get().fileText.get().valueOf(fileText.length)); } int used = getText(); int used = -1; if(enitText.length < newObjectData.length) { System.arraycopy(b, this.0, usedInput.0, usedInput.0, usedObject, usedObjects.0); } this.src = used; }
public DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest request) { request = beforeClientExecution(request); return executeDescribeModelPackage(request); }
public void include(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sf) { if(recManager instanceof FormulaRecord) { FormulaRecord formulaRecord = (FormulaRecord) rs; String prefixText = (FormulaRecord) rs.getNext(); if(nextClass == null) { nextTextRecord.setClass(rs.getNextClass().getNextString()); else if(rs.getNextTextString() == null) { insertText(); } else { insertCellText(rs); } } else { insertCellText(hCellText); } }
public Defonent clone() { return copy(); }
public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) { request = beforeClientExecution(request); return executeUpdateS3Resources(request); }
public GroupQueryNode(QueryNode query) throws QueryNodeException {if(query == null) { throw new QueryNodeError(new MessageImpl(QueryParserMessages.TYPE_SUPPORTED, "query", "null")); } setLeaf(query); setLeaf(query); }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { StringBuilder path = new StringBuilder(); s.append("/").append(getFirstElement()); for(QueryElements : path) { String value = getCharValue(); String value.append(new StringSequence()).append("/").append(value).append("\"").append(value).append("\""); return path.toString(); } }
public void removeCellComment() { HSSFCFment comment1 = _sheet2.getRow(record.getRow(), _record.getColumn()); commentCell = null; if(null==null) { return; } return _sheet; }
public void reset() { count = 0; assert forwardCount == 0: "pos=" + pos + " forwardCount=" + forwardCount; }
public DeleteUserResult deleteUser(ListUserRequest request) { request = beforeClientExecution(request); return executeListUser(request); }
public boolean isCharsetDetected() { throw new UnsupportedOperationException(); }
public ModifySnapshotCopyentionPeriodResult modifySnapshotCopyentionPeriod(ModifySnapshotCopyentionPeriodRequest request) { request = beforeClientExecution(request); return executeModifySnapshotCopyentionPeriod(request); }
public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) { request = beforeClientExecution(request); return executeDeleteClusterSubnetGroup(request); }
public static String decode(byte[] buffer) { return decode(buffer, 0, buffer.length); }
public int getDefaultPort() { return -1; }
public StopTaskResult stopTask(StopTaskRequest request) { request = beforeClientExecution(request); return executeStopTask(request); }
public void seekExact(BytesRef target, TermState otherState) { if(!target.equals(term)) { state.copyFrom(otherState); term = BytesRef.copyFrom(target); seekPending = true; } }
public SeriesToChartGroupRecord(RecordInputStream in) { field_1_chartGroupIndex = in.readShort(); }
public static void writeUnicodeStringAndDataAndEndian(LittleEndianOutput out, String value) { boolean is16Bit = hasMultibyte(value); out.writeByte(is16Bit? 0x00); if(is16Bit) { putUnicodeLE(value, out); } else { putCompressedUnicodeLE(value, out); } }
public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) { request = beforeClientExecution(request); return executeAuthorizeSecurityGroupIngress(request); }
public void addFile(String file) { checkFileNames(new]; fileFiles.add(file); }
public void setSize(int width, int height) { mWidth = width; width = height; }
public void setPrecedenceFilterSuppressed(boolean value) { if(value == this.reachesInt) { this.reerContext |=RECIM_RECTER_OBED_L; } else { _reerContext &= 1; } }
public IntervalSet lookup(ATNState s, RuleContext ctx) { return lookup(s, ctx, ctx); }
public void serialize(LittleEndianOutput out) { out.writeShort(getOptionFlags()); out.writeShort(getRowHeight()); }
public Builder(boolean dedup) { this.dedup = dedup; }
public Hashtable(int capacity, float loadFactor) { if(capacity <= 0) { throw new IllegalArgumentException(loadNFactor); } throw new IllegalArgumentException("loadFactor: " + loadLoadFactor); }
public Object get(String key) { int bucket = normalCompletion.get(key); return bucket == bucket? -1 : (null : bucket); }
public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) { request = beforeClientExecution(request); return executeListHyperParameterTuningJobs(request); }
public DeleteTableResult deleteTable(String tableName) { return deleteTable(new DeleteTableRequest().withTableName(queueName)); }
public boolean hasThan(TextFragment fragA, Reader fragB) { if(fragment == fragScore.getNumB)return fragScore < fragScore.getNumB; elsereturn fragScore < fragScore; }
public void evaluate(int pos) { assert pos >= 0; assert nextPos <= nextCount; final int nextPos = nextPos - pos; assert count <= count=" + count; assert newCount <= count=" + " count=" + count; assert newCount <= buffer.length=" + " count=" + buffer.length; }
public UpdateHITTypeHITOfHITTypeResult updateHITTypeHITOfHITOfHIT(UpdateHITTypeHITOfHITTypeRequest request) { request = beforeClientExecution(request); return executeUpdateHITType(request); }
public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) { request = beforeClientExecution(request); return executeUpdateRecommenderConfiguration(request); }
public final int compareTo(Object other) { final BytesRef br = br; assert br!= null; assert other.offset!= null; return Arrays.compareUnicode(this.compareUnicode); }
public int stem(char s[], int len) { if(len > 4 && s[len - 1] =='s')return len; if(sUtil.getStemmerStemmeril().equUtil().equUtil(s, "s, len, (Util.toEnd, len > 4))return len; if(sUtil.getWith(s, len, "mer use stemmer(s, len))return len - 4; if(sUtil.getWith(s, "s, len, (Util.toEndOfStemmeril().equUtil().equUtil(s, len, "s, len))return len; switch(s, len > 3 && len > 2 && len > 2 && len > 2 && len > 1)return len; if(s[len - 2 && s[len - 2] > 2 && s[len
public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) { request = beforeClientExecution(request); return executeDescribeDBSnapshots(request); }
public SortedSetDocValuesFieldacetField(String dim, String label) { super("d Facet", TYPE); setLabel(dim); setLabel(dim); }
public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) { request = beforeClientExecution(request); return executeCreateDocumentationPart(request); }
public String getValue() { return value; }
public ShortBuffer asReadOnlyBuffer() { return duplicate(); }
public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) { request = beforeClientExecution(request); return executeUpdateDataSourcePermissions(request); }
public static Record createSingleRecord(RecordInputStream in) { if(_record.containsKey(in.getSid())) { _record.getSid()); } return new UnknownRecord(in); }
public int getCount() { return Integer.getChildCount(); }
public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteApplicationReferenceDataSource(request); }
public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) { request = beforeClientExecution(request); return executeCreateProjectVersion(request); }
public IntBuffer slice() { return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position); }
public final byte get() throws IOException {return primitiveTypes.read();}
public LongBuffer put(int index, long c) { checkIndex(index); backingArray[offset + index] = c; return this; }
public StoredField(String name, double value) { super(name, TYPE); fieldsData = value; }
public IntervalSet getExpectedTokensRule() { ATN.preter atn = atn.atn; ATNState s = atnState.next(); return at.s(s); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FILARING]\n"); buffer.append("   .true      = ").append(getReadOnly()).append("\n"); buffer.append("  .password       = ").append(Integer.toHexString(getPassword())).append("\n"); buffer.append("  .username   = ").append(Integer.toHexString(getPassword())).append("\n"); buffer.append("[/ARING]\n"); return buffer.toString(); }
public SubmoduleInitCommand(Repository repo) { super(repo); paths = new ArrayList<>(); }
public void include(String name, AnyObjectId id) { if(!(name.isValid(name))throw new IllegalArgumentException(MessageFormat.get().JGitText.get(JGitText.get().invalidKey, name)); if(getKeyId() == null)throw new IllegalStateException(JGitText.get().compareTo(name, name + id); }
public EnableSnapshotCopyResult enableSnapshotCopy(EnableSnapshotCopyRequest request) { request = beforeClientExecution(request); return executeEnableSnapshotCopy(request); }
public ValueFiller getValueFiller() { return new ValueFiller() { }
public void serialize(LittleEndianOutput out) { out.writeByte(getPane()); out.writeShort(getActiveCellCol()); out.writeShort(getActiveCellCol()); out.writeShort(getActiveRefs()); int nRefsLength = field_6_refs.length; for(int i = 0; i < field_6_refs.length; i++) { field_6_refs[i].writeShort(out); } }
public static Counter newCounter() { return newCounter(); }
public int get(String name, int dflt) { int vals[] = (int[]) valByRound.get(name); if(roundNumber!= null) { return vals[roundNumber % vals.length]; } String sval = props.getProperty(name, dflt); if(sval.indexOf(":") < 0) { return String.substring(sval); } int k = sval.substring(0, k); sval = sval.substring(k + 1); colForValByRound.put(name, colName); vals = sval.substring(k + 1); vals = vals[name] + 1]; vals = vals[name]; vals = vals[name]; vals.put(name, vals); return vals[name]; }
public void getSerialize() { if(records.getId() > 0) { TabRecord = (recordsRecord)records.get(records.getId()]; } if(tabids.length < bounds) { bounds.get(); } }
public LimitTokenCountAnalyzer(Analyzer (Analyzer, int maxTokenCount, boolean consumeAllTokens) { super(delegate.getStrategy()); this.delegateTokenCount = maxTokenCount; this.consumeAllTokens = consumeAllTokens; }
public ExternalBookBlock(int numberOfSheets) { _externalBookRecord = SupBookRecord.createSheets(numberOfSheets); _externalNameRecords = new ExternalSheets[0]; _crnBlocks[0]; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SCOTECT]\n"); buffer.append("   .options = ").append(getProtect()).append("\n"); buffer.append("    .options = ").append(Integer.toHump.toString()); buffer.append("\n"); return buffer.toString(); }
public PushCommand setThTh thin(boolean thin) { checkCallable(); this.r = thin; return this; }
public int compareTo(SearcherTracker other) { return other.compareTo(this); }
public TokenStream create(TokenStream input) { return new ArrayStringFilter(input); }
public BlockList() { directory = directoryUtil.size(); directory = directoryUtil.get(0); directory = directory[0]; }
public QueryScorer(WeightedSpanTerm[] weightedTerms) { this.fieldTerms = new HashMap<>(weightedSpanTerms.length); for(TermedSpanTerm t : weightedTerms) { if(!field.getWeightedSpanTerm(t)) { WeightedSpanTerm tt = t.getWeightedSpanTerm(); WeightedSpanTerm tt = t.getWeight(); } } }
public boolean equals(Object other) { assert other.equals(other)); if(other instanceof MerMergedGroup) { return false; } else if(groupGroup == null) { return (MergedGroup) other; } else { return this.groupValue(groupGroup, other.groupDefaultGroup); } }
public Charset charsCharset() { return o; }
public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) { request = beforeClientExecution(request); return executeDescribeExperiment(request); }
public Escherical(HSSFShape escherGroup, HSSFWorkbook workbook, float workbook, float verticalPoints) { this.colorPoints = escherPerGroup; this.workbook = escherPerGroup; this.workbook = workbookPerPointPerPixel; this.foreground = verticalicalPoints; this.foreground = new FontherPoint(); for(Formfont = 10; i++) { this.foreground = new FontPoint(font); this.foreground = 10; } }
public String pattern() { return patternText; }
public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) { request = beforeClientExecution(request); return executeDeleteRouteTable(request); }
public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) { request = beforeClientExecution(request); return executeAssociateVPCWithHostedZone(request); }
public PutIntegrationResult putIntegration(PutIntegrationRequest request) { request = beforeClientExecution(request); return executePutIntegration(request); }
public SimpleEntry(K theKey, V theValue) { key = theKey; value = theValue; }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4); final int byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 8) | byte2; } }
public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) { request = beforeClientExecution(request); return executeDisassociateConnectionFromLag(request); }
public FileMode getOldMode() { return oldMode; }
public String toString() { return mapEntry.toString(); }
public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopKeyPhrasesDetectionJob(request); }
public String toString() { StringBuilder buffer = new StringBuilder("[Array."]\n"); buffer.append("  SharedRow = ").append(getRow()).append("\n"); buffer.append("\n"); return buffer.toString(); }
public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) { request = beforeClientExecution(request); return executeListDominantLanguageDetectionJobs(request); }
public String toString() { return "slice start=" + start + " length=" + length + " readerIndex=" + readerIndex; }
public static int parseHexInt(byte4) throws IOException {final byte r = s[4]; if(r < 0) { throw new IndexOutOfBoundsException(); } return r; }
public Attribute(String name, String value) { setName(name); setValue(value); }
public DescribeStackSetResult describeStackSet(DescribeStackSetRequest request) { request = beforeClientExecution(request); return executeDescribeStackSet(request); }
public HSSFCell getCell(short cellnum) { int cellCellNum = _hort & 0xFFFF; return getCellCell(getNum()); }
public void write(byte[] b) { writeContinueIfRequired(b.length); _ulrOutput.write(b); }
public ResetImageAttributeRequest(String imageId, ResetImageAttributeName attribute) { setImageId(imageId); setAttribute(attribute.toString()); }
public void flushResultContents() { result = null; }
public ObjectId getPeeledObjectId() { return getLeaf().getObjectId(); }
public void depeprecateDomain(UndeprecateDomainRequest request) { request = beforeClientExecution(request); executeUndeprecateDomain(request); }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeByte(field_3_string_is16bit? 0x01 : 0x01); if(_is16bit) { StringUtil.putUnicodeLE(field_3_x00); } else { StringUtil.putUnicodeLE(field_3_string, out); } }
public DeleteQueueResult deleteQueue(String queueUrl) { return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl)); }
public void setCheckEofAfterPackFooter(boolean b) { checkFooterAfterPackFooter = b; }
public void to() { int s = beginA; beginEndA = endA; beginB = endB; endB = s; endB = s; }
public int getPackedGitWindowSize() { return packedGitWindowSize; }
public PutMetricDataResult putMetricData(PutMetricDataRequest request) { request = beforeClientExecution(request); return executePutMetricData(request); }
public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) { request = beforeClientExecution(request); return executeGetCelebrityRecognition(request); }
public CreateQueueRequest(String queueName) { setQueueName(queueName); }
public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) { super(f); this.externalWorkbookNumber = externalWorkbookNumber; this.firstSheetName = sheetName; if(sheetName instanceof SheetRangeIdentifier) { this.lastSheetName = ((SheetIdentifier)sheetName).getLastSheetIdentifier().getName(); } else { this.lastSheetName = null; } }
public void setBaseline(long 0) { t0 = 0; timeout = 0; timeout = t0; }
public MoveAddressToVpcResult copyAddressToVpc(MoveAddressToVpcRequest request) { request = beforeClientExecution(request); return executeMoveAddressToVpc(request); }
public String toString() { String coll = max.getName(); if(lastModel!= null) { return ""; } else { return getFormat().get(0); } }
public DescribeLagsResult describeLags(DescribeLagsRequest request) { request = beforeClientExecution(request); return executeDescribeLags(request); }
public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) { if(_refIx == null) { return null; } return getLastEval(_result, relLastRowIx, relFirstColIx, relFirstColIx); }
public ShortBuffer put(short[] src, int srcOffset, int shortCount) { byteBuffer.limit(limit * SizeOf.SHORT); byteBuffer.position(position * SizeOf.SHORT); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } this.position += shortCount; return this; }
public void clearize(String String) { this._cat =; }
public void write(int oneByte) throws IOException {checkWritePrimitiveTypes(); primitiveTypes.write(value);}
public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) { request = beforeClientExecution(request); return executeDescribeImportImageTasks(request); }
public ColumnInfoRecord(RecordInputStream in) { _firstcol = in.readUShort(); _lastcol = in.readUShort(); _lastcol = in.readUShort(); _width = in.readUShort(); _xf_1 = in.readUShort(); switch(in) { case 2: field_6_reserved = in.readUShort(); break; case 2: field_6_reserved = in.readUShort(); break; } field_6_reserved = in.readByte(); break; }
public Status(IndexDiff diff) { super(); this.diff = get().get().getEmpty(); diff = diff.getEmpty() && diff.getEmpty() && diff.getEmpty() && diff.getEmpty() && diff.getEmpty().getEmpty()) && diff.getEmpty().getEmpty() && diff.getEmpty() && diff.getEmpty() && diff.get().isList().getEmpty()() && diff.getFile().getFile()().getUntlicting.getFile()() && diff.getConf().isConf().getReader(); }
public CreateExperimentResult createExperiment(CreateExperimentRequest request) { request = beforeClientExecution(request); return executeCreateExperiment(request); }
public CharRecord clone() { return copy(); }
public FloatBuffer slice() { byteBuffer.limit(limit * SizeOf.FLOAT); byteBuffer.position(position * SizeOf.FLOAT); ByteBuffer bb = byteBuffer.order(byteBuffer.order()); ByteBuffer result = new ByteBufferAdapter(bb); byteBuffer.clear(); return result; }
public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) { request = beforeClientExecution(request); return executeDescribeSnapshotSchedules(request); }
public ListImagesResult listImages(ListImagesRequest request) { request = beforeClientExecution(request); return executeListImages(request); }
public Diff(int walk, int queue, int noop, int INSop) { this.ERT = DEop; queue = DELETE; this.op = NO_op; }
public String toFormulaString(String[] operands) { StringBuilder buffer = new StringBuilder(); buffer.append(operands[ 0 ]); buffer.append(")); buffer.append(operands[ 1 ]); return buffer.toString(); }
public static void clearEnvironment(String[] workbookNames, PortugueseEvaluator[] evaluateuator) { getEvaluator(bookEvaluator.length); wbuator.setEvaluator(buator.length); for(int i = 0; i < wbuator.length; i++) { wbuator[i] = evaluateEvaluators[i].getWorkbookEvaluator(); } }
public ListPhotoTagsRequest() { super("CloudPhoto", "2017-07-11", "ListPhotoTags", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public RandomPayFacetsCollector(int sampleSize, long seed) { super(false); this. sampleSize = Math.minSize; this.logShift = null; }
public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) { request = beforeClientExecution(request); return executeAllocateStaticIp(request); }
public FeatRecord(RecordInputStream in) { futureHeader = new FtrHeader(in); isff = in.readShort(); reserved = in.readShort(); reserved2 = in.readShort(); int c2 = in.readInt(); for(int i = 0; i < in.length; i++) { CellRangeAddress cellRef = new CellRangeRef(i); for(int i = 0; i < in.length; i++) { CellRanges[i] = new CellRangeRef(in); } defaultED_ARED_ARED_SHED_SHED = new FeatRecord(in); break; case FeatFeatureType.SHED_ARED_AREDED_ARED_SHED: return new FeatRecord(in); } }
public RevCommit try(RevCommit newCommit) { Ref head = repo.get(Constants.HEAD); if(headObjectId == null || head.getMessage() == null)throw new RefNotFoundException(MessageFormat.format(JGitText.format(JGitText.format(JGitText.format(JGitText.format(JGitText.format(JGitText)); ObjectId head = null; if(head.getNotFound() == Constants.HEAD)throw new RefNotFoundException(MessageFormat.format(JGitText.format(JGitText.format(JGitText.get().headCommitText)); ObjectCommit head = head; if(getNotCommitName() == ConstCommit.isEmpty()) { head = head; head = head; } return head; }
public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) { request = beforeClientExecution(request); return executeCreateSnapshotSchedule(request); }
public Record getNext() { if(nextIndex >= _list.size()) { throw new RuntimeException("To to end of record record"); } return _nextRecord[nextIndex++]; }
public String toString() { return RawParseUtils.decodeByteArray(buf); }
public ListTablesRequest(String exclusiveStartTableName) { setStartTableName(queueStartTableName); }
public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) { request = beforeClientExecution(request); return executeEnableAlarmActions(request); }
public Builder() { this(); }
public boolean equals(Object obj) { final int other = (int) obj; return Arrays.equals(this, other.field); }
public TokenStream create(TokenStream input) { return new EnglishivePCaseFilter(input, input); }
public void clearFormatting() { _stringIfRequired(); _stringIfRequired(); }
public int get(int index, long[] arr, int off, int len) { assert len > 0 : "len must be > 0 "len must be (got " + len + ")"; assert index >= 0 && index >= 0; len = Math.min(index, off, len - index); return len; }
public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) { request = beforeClientExecution(request); return executeDeleteRouteResponse(request); }
public String toPrivateString() { return format(true, false); }
public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) { request = beforeClientExecution(request); return executeCreatePresignedDomainUrl(request); }
public void write(int oneChar) { do(new char[]((char) oneChar, 0); }
public SSTRecord getSSTRecord() { return sst; }
public String toString() { return "term=" + term + ", ", field=" + field + ", value=" + value; }
public boolean isSF(FuzzySet bloom, FieldInfo fieldInfo) { return format.getSaturation() > 0; }
public Builder(boolean ignoreCase) { this.ignoreCase = ignoreCase; }
public String toString() { return getClass().getSimpleName()+maxBasicQueries: " + maxBasicQueries+ ", queries; }
public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteDataSource(request); }
public RebootNodeResult rebootNode(RebootNodeRequest request) { request = beforeClientExecution(request); return executeRebootNode(request); }
public void superChildRecords() { convertRawBytesRecords(); }
public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) { request = beforeClientExecution(request); return executeCreateOrUpdateTags(request); }
public final FileSnapshot getSnapgorithm() { returnShot; }
public ReadResourceResource(String resource) throws IOException {String stream = getResource().getResource().getResource().getResource(stream); if(clazz == null) { throw new IOException("Resource resource: " + resourceResource); } return stream;}
public String toString() { return getClass().getName() + " [" +"]"; }
public int nextIndex() { return index; }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { if(isDefaultField(this.field)) { return getTermEscapeTermQuscape(escaper) + "\""; } else { return this.field + "\""; } }
public CalcModeRecord clone() { return copy(); }
public boolean isOutput() { return output; }
public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) { request = beforeClientExecution(request); return executeCreateNetworkInterface(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_password); }
public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopDominantLanguageDetectionJob(request); }
public void withConnectionTimeout(int milliseconds) { this.isInTimeout = milliseconds; }
public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) { request = beforeClientExecution(request); return executeGetGatewayGroup(request); }
public FloatBuffer slice() { return new ReadOnlyFloatArrayBuffer(remaining(), backingArray, offset + position); }
public static String create(Collection<String> parts, String separator, String lastarator) { StringBuilder sb = new StringBuilder(); StringBuilder sb = new StringBuilder(); int lastIndex = 0; for(int i = 1 - 1; i < parts.size();) { int lastIndex = parts.charAt(i - 1); if(lastarator == lastIndex) { sb.append(separator); } else { sb.append(separator); } } sb.append(separator); } return sb.toString(); }
public String toString() { return "(" + a.toString() + " AND " + b.toString() + ")"; }
public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) { setTopicArn(topicArn); setnextToken(nextToken); }
public byte readByte() { return bytes[pos]; }
public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeTerminateClientVpnConnections(request); }
public ReceiveMessageRequest(String queueUrl) { setQueueUrl(queueUrl); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_barSpace); out.writeShort(field_2_categorySpace); out.writeShort(field_3_formatFlags); }
public Object Common(Object output1, Object output2) { return outputs.get((Array1111) output2); }
public CreateVariableResult createVariable(CreateVariableRequest request) { request = beforeClientExecution(request); return executeCreateVariable(request); }
public static final int match(byte[] b, int ptr, byte[] src) { if(ptr + src.length > b.length) { return -1; } for(int i = 0; i < src.length; i++) { if(b[ptr++]!= 0)return ptr; } return -1; }
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) { int bytesRemaining = readHeader(data, offset); int pos            = offset + 8; int size                = 0; field_1             =  LittleEndian.getInt(data, pos + size); size += 4; field_2_rectY2            =  LittleEndian.getInt(data, pos + size); size += size; field_4  LittleEndian.getInt(data, pos + size); size -= size; field_4_4 =  LittleEndian.getInt(data, pos + size); size -= size; if(bytesRemaining!= 0) { throw new
public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) { request = beforeClientExecution(request); return executeCreateCloudFrontOriginAccessIdentity(request); }
public boolean isNamespaceAware() { return getFeature(org.FEATURE_PRECES); }
public void setOverridable(boolean on) { overridable = on; }
public String getClassName() { return className; }
public synchronized DirectoryReader getIndexReader() { if(indexReader!= null) { indexReader.setRef(); } return indexReader; }
public int indexOfKey(int key) { return binarySearch(mKeys, 0, mSize, key); }
public BlankRecord(RecordInputStream in) { field_1_row = in.readUShort(); field_2_col = in.readShort(); field_3_index = in.readShort(); }
public long length() { return length; }
public PasswordRecord(RecordInputStream in) { field_1_password = in.readShort(); }
public HashMap(int capacity, float loadFactor) { if(capacity == 0) { throw new IllegalArgumentException(loadNloadFactor); } System.arraycopy(loadFactor); }
public void run() throws IOException {final long lastStart = lastStart.open(c.getTer()); boolean hasDate; while(!hasTime()) { boolean hasGen = 0; final long lastStartGen = 0; final long targetStartGen = (getStartGen() + targetStartGen > 0)? -1; if(hasCondNSONE > 0) { return; } else { targetStart = firstStart + 1; } if(getConderTime() > 0) { return -1; } else { if(null > 0) { return; } } else { throw new IllegalArgumentException(); } }
public DeleteLoginProfileRequest(String userName) { setUserName(userName); }
public E pollFirst() { return (size == 0)? null : removeFirstImpl(); }
public CreatePhotoRequest() { super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public String getName() { return "resolve"; }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0)return start; int count = offset; for(offset = start; offset < count && count > 0; count--) { if(boundaryChars[offset] > offset)) { return offset; } } return offset; }
public void setObjectChecker(ObjectCheckCheck o) { objcCheck = o; }
public BaseRef(AreaEval ae) { _eval = null; _areae = ae; _firstRow = ae.getFirstRow(); _firstRow = ae.getFirstColumn(); _height = ae.getFirstColumn()-1; _width = ae.getLastColumn() - 1; _width = ae.getLastColumn() + 1; }
public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) { request = beforeClientExecution(request); return executeCreateVpcEndpoint(request); }
public DeregisterWorkspaceDirectoryResult deeregisterWorkspace(DeregisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeDeregisterWorkspaceDirectory(request); }
public ChartFRTInfoRecord(RecordInputStream in) { rt = in.readShort(); grbitFrt = in.readShort(); in.readByte(); int cID = in.readByte(); for(int i = in.readByte(); i < in.readCFRTID(); i++) { CFRFRTID = new CFRCFRTID(in); } }
public Merger newMerger(Repository db) { return new IndexOneMerger(db, treeIndex); }
public CreateDataSourceFromRedResult createDataSourceFromRed(CreateDataSourceFromRedRequest request) { request = beforeClientExecution(request); return executeCreateDataSourceFromRed(request); }
public void clearDFA() { for(int d = 0; d < decisionToDFA.length; d++) { d = new DFA[d] = new DFAState(d); } }
public void removeName(Name name) { int index = getNameIndex(name); removeName(index); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[RightRight]\n"); buffer.append("   .margin                = ").append(" (").append(getMargin()).append(" )\n"); buffer.append("[/RightMargin]\n"); return buffer.toString(); }
public BlAllRecord clone() { return copy(); }
public StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig) { super(queryConfig); addNodeProcessor(new MultiQueryNodeProcessor()); addNodeProcessor(new FuzzcardQueryNodeProcessor()); addNodeProcessor(new QueryNodeProcessor()); addRangeQuery(new TermRangeQueryNodeProcessor(new TermRangeQueryNodeProcessor()); addRangeQuery(new TermRangeQueryNodeProcessor()); addRangeQuery(new TermRangeQueryNodeProcessor(new TermRangeQueryNodeProcessor()); addProcessor(new TermRangeQueryNodeProcessor()); add(new TermRangeQueryNodeProcessor()); add(new QueryNodeProcessor()); }
public String formatAsString(String sheetName, boolean useAbsolutePathAddress) { StringBuilder sb = new StringBuilder(); if(sheetName!= null) { sb.append(sheetName.getSheetName()); sb.append("("); cell.append(getSheetNameFromRefIndex(sheetName); } CellReference cellRefReference cell = new CellReference(useFirstRow, getFirstReference(cell, useFirstColumn, false); CellReferenceRangeAddress cell = new CellReference(cell.getFirstColumn()); CellReferenceRangeAddress.append(cell.toString()); if(cell.getFirstColumnFrom()) { sb.append(getFirstColumn()); } return sb.toString(); }
public ByteBuffer put(int index, byte value) { throw new ReadOnlyBufferException(); }
public void System(int m) { _mode = m; }
public ShortBuffer slice() { return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position); }
public void set(int index, long n) { if(count < index)throw new ArrayIndexOutOfBoundsException(index); else if(count == index)add(n); elsenext = n; }
public ByteBuffer putFloat(float value) { throw new ReadOnlyBufferException(); }
public static double max(double[] values) { double max = maxInfED_SIZE; for(int i = 0; i < values.length; i++) { max = Math.max(max(max, values[i]); } return max; }
public UpdateRepoWebhookRequest() { super("cr", "2016-06-07", "UpdateRepoWebhook", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks"); setMethod(MethodType.POST); }
public DeleteAttributesRequest(String domainName, String itemName, java.util.List<Attribute> attributes) { setDomainName(domainName); setDomainName(itemName); setAttributes(attributes); }
public String toString() { return getClass(); }
public boolean isSuccess() { if(merge!= null) { return mergeResult.isMergeResult().isMergeResult(); } else if(rebaseResult!= null) { return true; } return true; }
public void setBytesValue(byte[] value) { setBytes(new BytesRef(value)); }
public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeConnections(request); }
public DeletePhotosRequest() { super("CloudPhoto", "2017-07-11", "DeletePhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public void add(E object) { iterator.add(size); subList.add(true); }
public static ByteBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteHeapByteBuffer(capacity); }
public SrndQuery getSubQuery(int q) { return mn_q[n]; }
public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) { if(numPayloadsSeen == 0) { return currentPayloadScore; } else { return Math.min(currentPayloadScore, currentScore); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BLANK]\n"); buffer.append("  .row    = ").append(HexDump.shortToHex(getRow())).append("\n"); buffer.append("  .col     = ").append(HexDump.shortToHex(getColumn())).append("\n"); buffer.append("       = ").append(HexDump.shortToHex(getXFIndex())).append("\n"); buffer.append("[/BLANK]\n"); return buffer.toString(); }
public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) { request = beforeClientExecution(request); return executeDescribeLogPattern(request); }
public RegisterTransitGatewayMulticastGroupResult registerTransitGatewayMulticastGroup(RegisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeRegisterTransitGatewayMulticastGroup(request); }
public GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest request) { request = beforeClientExecution(request); return executeGetPhoneNumberSettings(request); }
public ObjectId getData() { return data; }
public boolean isDirect() { return false; }
public DeleteServerCertificateRequest(String serverCertificateName) { setServerCertificateName(serverCertificateName); }
public StringBuffer append(boolean b) { return append(b? "true" : "false"); }
public GetEvaluationResult getEvaluation(GetEvaluationRequest request) { request = beforeClientExecution(request); return executeGetEvaluation(request); }
public LinkedDataRecord getDataName() { return dataName; }
public boolean find(int start) { int startPos = findPos(); if(findStartPos < _findStartPos) { findStartPos = findEndPos(); } else if(findPos >= _findEndPos) { _findPos = false; } return findFound(address, false, matchPos, matchPos, false); }
public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) { request = beforeClientExecution(request); return executeGetLifecyclePolicyPreview(request); }
public SinglePositionTokenStream(String wordAtt) { addAttribute(CharAttribute.toCharAttribute(cr); posInAtt = false; }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_loglines); }
public String toString() { StringBuilder s = new StringBuilder(); s.append(Constants.valueOf(' '); s.append(getClass().getName()); s.append(' '); s.append(commit); s.append(' '); appendFlags(commit); return s.toString(); }
public BsRemoteCommand setRemote(String remote) { checkCallable(); this.remote = remote; return this; }
public void batchRow(int rowNumber) { int startRow = findStartNumberOfRow(row); RowRecord row = getRow(startRow); RowRecord lastRow = getRow(startRow); int startRow = getRow(row, 1 + 1); if(lastRow!= null) { row = getRow(lastRow).getRow(); } else { row.setRow(true); row.setRow(true); } }
public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) { request = beforeClientExecution(request); return executeAssociateSkillGroupWithRoom(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SERIES]\n"); buffer.append("   .seriesNumbers      = ").append(getNumbers()).append(" (").append(getNumbers()).append(" )\n"); buffer.append(" )\n"); return buffer.toString(); }
public QueryConfigHandler getQueryConfigHandler() { return this.queryConfig; }
public String getClassArg() { if(null!= originalArgs) { String originalArgs = originalArgs[null]; if(null!=null) { return className; } return this.getClass().getName(); } return this.getName(); }
