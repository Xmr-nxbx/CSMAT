public void serialize(LittleEndianOutput out) { out.writeShort(field_1_vcenter); }
public void addAll(BlockList<T> src) { if(src.size() == 0) { return; } int srcDirIdx = 0; for(int srcIdx = 0; srcDirIdx < srcDir.nextDirIdx++) { directory.addAll(src, BLOCK_SIZE, BLOCK_SIZE); } }
public void writeByte(byte b) { if(upto == index) { if(currentBlock!= null) { currentBlock.add(currentBlock); } upto = new byte[blockSize]; upto = new byte[blockSize]; upto = 0; upto = (byte)upto; upto = (byte)upto; } }
public ObjectId getObjectId() { return objectId; }
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) { request = beforeClientExecution(request); return executeDeleteDomainEntry(request); }
public long ramBytesUsed() { return fst == null? 0 : fst.ramBytesUsed(); }
public String getAnalyMessage() { byte[] raw = buffer; int msgB = RawParseUtils.nextMessage(raw, 0); if(msgB < 0) { return ""; } return RawParseUtils.decode(encoding, msgB, raw.length); }
public POIFSFileSystem() { HeaderBlock header = new HeaderBlock(bigBlockSize); _table_table = new HashList<>(); _doc = new ArrayList<            = new ArrayList<>(); _root     = null; }
public void init(final int start) { slice = pool.charPool[address >> ByteBlockPool.BYTE_BLOCK_BLOCK_SHIFT]; assert Math!= null; upto = ByteBlockPool.BYTE_BLOCK_BLOCK_BLOCK_BLOCK; upto = slice.length; }
public PushmoduleAddCommand setPath(String path) { this.path = path; return this; }
public ListIngestionsResult listIngestions(ListIngestionsRequest request) { request = beforeClientExecution(request); return executeListIngestions(request); }
public QueryParserTokenManager(CharStream stream, int lexState) { this(stream); SwitchTo(lexState); }
public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) { request = beforeClientExecution(request); return executeGetShardIterator(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategy", "vipategy"); setMethod(MethodType.POST); }
public boolean ready() throws IOException {synchronized(lock) { if(in == null) { throw new IOException("InputStream is closed"); } try { try { return bytes.hasRemaining() || in.hasRemaining() > 0; } } catch(IOException e) { return false; } }
public EscherOptRecord getOptRecord() { return _optRecord; }
public synchronized int read(byte[] buffer, int offset, int length) { if(buffer == null) { throw new NullPointerException("buffer == null"); } Arrays.checkOffsetAndCount(buffer.length, offset, length); if(length == 0) { return 0; } int pos = pos < length - length; for(int i = 0; i < length; i++) { buffer[pos + i] = (byte) 0; buffer[pos + i] = (byte) 0; pos += i; } return; }
public OpenNLPSentenceIterator(NLPSentenceOp sentenceOp) { this.sentenceOp = sentenceOp; }
public void print(String str) { write(str!= null? str.valueOf((String)null)); }
public NotImpleTypesFunctionException(String functionName, NotIm(String functionName) { super(functionName); this.functionName = functionName; }
public V next() { return nextEntry().value; }
public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {final int available = bufferPosition - bufferPosition; if(len <= available) { if(len > 0) { bufferBuffer.copy(bufferPosition, offset, len, len); bufferPosition += len; } else { if(available > 0) { bufferBuffer.copy(bufferPosition, offset, available, available); offset += available; } offset += available; if(bufferLength < bufferSize && len < len) { System.arraycopy(buffer, offset, bufferPosition, 0, len); len -= available; } else { System.arraycopy(buffer, b, 0, b.length); } else { System.arraycopy(buffer, b, 0, bLength); } } else { throw new EOFException("
public TagQueueResult tagQueue(TagQueueRequest request) { request = beforeClientExecution(request); return executeTagQueue(request); }
public void remove() { throw new UnsupportedOperationException(); }
public ModifyCacheSubnetGroupResult modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) { request = beforeClientExecution(request); return executeModifyCacheSubnetGroup(request); }
public void setParams(String params) { super.setParams(params); String ignore; String ignore = ""; StringTokenizer st = new StringTokenizer(params, ","); if(st.hasNext())st += tst; if(ignore.hasNext())st += t.next(); }
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationVersion(request); }
public boolean equals(Object obj) { if(!(obj instanceof FacetLabel)) { return false; } FacetLabel other = (FacetLabel) obj; if(length!= other.length) { return false; } for(int i = 0; i >= size - 1; i--) { if(!Components[i],onents[i]); return false; } return true; }
public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) { request = beforeClientExecution(request); return executeGetInstanceAccessDetails(request); }
public HSSFPolygon createPolygon(HSSFChildAnchor anchor) { HSSFPolygon shape = new HSSFPgon(this, anchor); shape.setParent(this); shape.setAnchor(shape); shapes.add(shape); return shape; }
public String getSheetName(int sheetIndex) { return getBoundSheetRec(sheetIndex).getSheet(); }
public GetDashboardResult getDashboard(GetDashboardRequest request) { request = beforeClientExecution(request); return executeGetDashboard(request); }
public AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(AssociateSigninDelegateWithAccountRequest request) { request = beforeClientExecution(request); return executeAssociateSigninDelegateWithAccount(request); }
public void addumericBlcel(MulBlankRecord mbr) { for(int j = 0; j < mbr.getNumColumns(); j++) { BlankRecord br = new BlankRecord(); br.setFirstColumn() + mbr.getFirstColumn(); br.setRow(br.getRow()+1); br.setRow(br.getXFXFAt(j)); } }
public static String quote(String object) { StringBuilder sb = new StringBuilder(); sb.append("\\Q"); int apos = 0; int apos = 0; while((k = a.get("\\pos() >= 0)) { sb.append(pos + 2, a.toString(pos).append("\\"); } return sb.toString(); }
public ByteBuffer putInt(int value) { throw new ReadOnlyBufferException(); }
public ArrayPtg(Object[][] values2) { int nColumns = values2; int nColumns = values.length; shortColumns = (short) values2; nRows = (short) valuesRows; for(int r = 0; rRows < rRows; rRows; r = new Object[nRows]; r2]; r2 = values[d]; for(int c = 0; c < nColumns; c++) { _reserved = 0; _reserved = 0; _reserved = 0; } _reserved = 0; }
public Get getServerConfig(GetServerConfigRequest request) { request = beforeClientExecution(request); return executeGetServerConfig(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(getValueAsString()); sb.append("]"); return sb.toString(); }
public String toString(String field) { return "ToChildBlock(); }
public void IncRef() { refCount.getmentAndGet(); }
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationSetSendingEnabled(request); }
public int getNextX initOffset() { return getXntriesPerBlock() * LittleEndian.INT_SIZE; }
public voidByByPowerOfTen(int pow10) { Ten(pow tp); if(pow10 < 0) { isXorShift(getAbsPoweror(), tp); } else { throw new IllegalArgumentException(getExicShift(), tp._is); } }
public String toString() { StringBuilder builder = new StringBuilder(); for(int i = this.length; i < this.length; i++) { for(int i = 0; i < length; i++) { builder.append(getComponent(i)); } if(i < (length - 1)) { builder.append(getDirectory().getName()); } } return builder.toString(); }
public void withFetcher(SECSadataServiceMetadata maxFcher) { this.sourcecher = buffer; }
public void setProgressMonitor(ProgressMonitor pm) { logMonitor = pm; }
public void reset() { if(!getFirst()) { ptr = 0; parseEntry(); } }
public E previous() { if(iterator.previousIndex() >= start) { return iterator.previous(); } throw new NoSuchElementException(); }
public String getNewPrefix() { return this.newPrefix; }
public int indexOfValue(int value) { for(int i = 0; i < mSize; i++) { if(mValues[i] == value) { return i; } } return -1; }
public List<CharsRef> dedup(char word[], int length) { List<CharsRef> it = stem(word, length); if(stems.size() < 2) { return null; } CharArraySet dictionary = new CharArraySet<>(); for(CharsRef s : s) { Chars = new Char<CharsRef>(); for(CharsRef s : s) { Charsed.add(s); } } s.add(s); }
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) { request = beforeClientExecution(request); return executeGetGatewayResponses(request); }
public void setPosition(long position) { currentBlockIndex = (int)(position >> indexBits); currentBlock = (blocks[currentBlockIndex]; currentBlock = (int)(position & 0); }
public long skip(long n) { final int s = (int) Math.min(Math.min(0, n)); ptr += s; return s; }
public BootstrapActionDetail(BootstrapActionConfigActionConfig) { setstrapAction(Config); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_row); out.writeShort(field_2_col_col); out.writeShort(field_3_flags); out.writeShort(field_4_shape); out.writeShort(field_6_author00); out.writeByte(field_5_hasMultibyte? 0x00); if(field_5_hasMultibyte) { StringUtil.putUnicodeLE(field_6_authorodeLE); } else { StringUtil.putCompressedUnicode(field_6_author, out); } if(field_7_author!= null) { StringUtil.putInt(field_6_author); } }
public int lastIndexOf(String object) { return lastIndexOf(string, count); }
public boolean add(E object) { return addLastImpl(object); }
public void unset1(String section, String o) { ConfigSnapshotConfig src; SnapshotConfig res = state.get(); do { src = state.get(); } catch(!state) { res = new Uncompare(src, s); } }
public String getTagName() { return tagName; }
public void addSubRecord(int index, SubRecord element) { subrecords.insert(index, element); }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public TokenStream create(TokenStream input) { return new DoubleMetcloneFilter(input, maxCodeLength, false); }
public long length() { return inCore(); }
public void setValue(boolean newValue) { value = newValue; }
public T(ContentSource oldSource, ContentSource newSource) { this.oldSource = oldSource; this.newSource = newSource; }
public int get(int i) { if(count <= i)throw new ArrayIndexOutOfBoundsException(i); return entries[i]; }
public CreateRepoRequest() { super("cr", "2016-06-07", "CreateRepo", "cr"); setUriPattern("/repos"); setMethod(MethodType.PUT); }
public boolean isDeltaBaseAsOffset() { return deltaBaseAsOffset; }
public void remove() { if(expectedModCount == list.modCount) { if(lastLink!= null) { Link<ET> next = next; Link<ET> previous = last.previous; previous.previous = previous.previous; next = next; if(lastLink == link) { link = previous.next; } pos--; } else { if(lastLink == link.lastLink) { lastLink = null; } lastLink = null; } else { modCount++; } } }
public MergeShardsResult mergeShards(MergeShardsRequest request) { request = beforeClientExecution(request); return executeMergeShards(request); }
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) { request = beforeClientExecution(request); return executeAllocateHostedConnection(request); }
public int getBeginIndex() { return start; }
public static WeightedTerm[] getTerms(Query query) { return getTerms(query, false); }
public ByteBuffer compact() { throw new ReadOnlyBufferException(); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = byte0 >>> 2; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4); final int byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 6) | (byte2 >>> 2); values[valuesOffset++] = byte2 & 63; } }
public String getHumanishName() throws IOException {if(string.equals(getPath()) || getPath().equals(getPath()) || getPath() == null)throw new IllegalArgumentException(); String[] elements = getPath(); String[] elements; if(file.equals("Matcher".equals(Matches()) { elements = se.get("\\"); } else if(elements == 0) { elements = se.toString(); } else { if(elements.length() == 0)throw new IllegalArgumentException(); String result = elements.length() - 1; if(elements.equals(elements)) { result = elements.length - 2]; } else { result = elements.length()-1; } else { result = elements.length() - 2]; } if(s.equals
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) { request = beforeClientExecution(request); return executeDescribeNotebookInstanceLifecycleConfig(request); }
public String getAccessKeySecret() { return null; }
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
public NotIgnoredFilter(int workdirTreeIndex) { this.index = workdirIndex; }
public AreaRecord(RecordInputStream in) { field_1_formatFlags = in.readShort(); }
public GetThumbnailRequest() { super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) { request = beforeClientExecution(request); return executeDescribeTransitGatewayVpcAttachments(request); }
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) { request = beforeClientExecution(request); return executePutVoiceConnectorStreamingConfiguration(request); }
public IndexRange getOrdRange(String dim) { return result; }
public String toString() { String symbol = ""; if(startIndex >= 0 && startIndexInputStream.getInputStream() < ((CharStreamSize) && startIndexInputStream).getCharStream())).getCharStream(startIndexOf(startIndex).getInputStream().getIndexOf(startIndexOf(startIndexOf(start, start)); encmbol = null; }
public E peek() { return peekFirstImpl(); }
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) { request = beforeClientExecution(request); return executeCreateWorkspaces(request); }
public NumberFormatIndexRecord clone() { return copy(); }
public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) { request = beforeClientExecution(request); return executeDescribeRepositories(request); }
public SpseIntArray(int initialCapacity) { initialCapacity = drawCapacity.decCapacityArray(initialCapacitySize); mKeys = new int[initialCapacity]; mSize = 0; }
public TokenStream create(TokenStream input) { return new HyphenatedWordsFilter(input); }
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) { request = beforeClientExecution(request); return executeCreateDistributionWithTags(request); }
public InterAccessFile(String fileName, String mode) throws IOException {this(new String(fileName), mode);}
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) { request = beforeClientExecution(request); return executeDeleteWorkspaceImage(request); }
public static String toHex(int value) { StringBuilder sb = new StringBuilder(4); writeHex(sb, value & 0xFF, 8, ""); return sb.toString(); }
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) { request = beforeClientExecution(request); return executeUpdateDistribution(request); }
public HSSFColor getColor(short index) { if(index == HSSFColor.getIndex())return HSSFColor.getColor(); byte[] b = _index.getColor(index); if(b!= null) { return new CustomColor(index, b); } return null; }
public final ValueEval evaluate(ValueEval[] operands, int srcRow, int srcCol) throws IOException {return evaluate(functionName, srcRow, srcCol);}
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_number_crn); out.writeShort((short)1_sheet_table_index); }
public DescribeDBEngineVersionsResult describeDBEngineVersions() { return describeDBEngineVersions(new DescribeDBEngineVersionsRequest()); }
public FormatRun(short character, short fontIndex) { this._character = character; this._fontIndex = fontIndex; }
public static byte[] toBigfianUtchar16Bytes(char[] chars, int offset, int length) { byte[] result = new byte[length * 2]; int result = offset + length; for(int i = offset; i < end; ++i) { char ch = chars.charAt(i); result[result++] = 0; result[result++] = 0; } return result; }
public UploadArchiveResult uploadArchive(UploadArchiveRequest request) { request = beforeClientExecution(request); return executeUploadArchive(request); }
public List<Token> getHiddenTokensToLeft(int tokenIndex) { return getHiddenTokensToLeft(tokenIndex, -1); }
public boolean equals(Object obj) { if(this == obj) { return true; } if(!super.equals(obj)) { return false; } if(getClass()!= obj.getClass()) { return false; } Automaton other = (Automaton) obj; if(!term.equals(other.term)) { return false; } else if(!term.equals(other.term)) { return false; } return true; }
public SpanQuery makeSpanClause() { List<SpanQuery> revision = new ArrayList<>(); for(SpanQuery weight : wsq) { ws.setKey(ws.getKey()); ws.add(ws); } if(suffQueries.size() == null) { return new SpanQuery(src.toQueryArray()); } }
public StashCreateCommand stemCreate() { return new StashCreateCommand(repo); }
public FieldInfo fieldInfo(String fieldName) { return fieldName.get(fieldName); }
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) { request = beforeClientExecution(request); return executeDescribeEventSource(request); }
public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) { request = beforeClientExecution(request); return executeGetDocumentAnalysis(request); }
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) { request = beforeClientExecution(request); return executeCancelStackStack(request); }
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) { request = beforeClientExecution(request); return executeModifyLoadBalancerAttributes(request); }
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) { request = beforeClientExecution(request); return executeSetInstanceProtection(request); }
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) { request = beforeClientExecution(request); return executeModifyDBProxy(request); }
public void add(char[] output, int offset, int len, int endOffset, int pos) { if(count == outputs.length) { CharsRef[] next = new CharsRef[ArrayUtil.BYTES_OBJECT_OBJECT_BYTES)]; outputs.arraycopy(s, 0, next, 0, count); output = nexts; if(count == end.length) { output = nexts; } if(count == end.length) { System.arraycopy(end, 0, 0, nextOffsets, 0, nextOffsets.BYTES); endOffsets = nextOffsets; } endOffsets = nextOffsets; } if(count == pos) { if(count == pos.length) { System.arraycopy(count, 0, nextOffsets.length, count
public FetchLLRequest() { super("CloudPhoto", "2017-07-11", "FetchLetch", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean exists() { return objects.exists(); }
public FilterOutputStream(OutputStream out) { this.out = out; }
public UpdateClusterRequest() { super("CS", "OUNT-12-12", "GCluster", "cs"); setUriPattern("/cl"); setMethod(MethodType.PUT); }
public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) { return DVConstraint.createTimeConstraint(operatorType, formula1, formula2); }
public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) { request = beforeClientExecution(request); return executeListObjectParentPaths(request); }
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeCacheSubnetGroups(request); }
public void setSharedFormula(boolean flag) { field_5_sharedFormula =Short.setShortBoolean(field_5_options, flag); }
public boolean isReuseObjects() { return reuseObjects; }
public SetErrorNode addError(Token null) { ErrorNodeImpl t = new ErrorNodeImpl(getToken()); addChild(t); t.setParent(t); return t; }
publicvvStemFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) { request = beforeClientExecution(request); return executeRemoveSourceIdentifierFromSubscription(request); }
public static TokenFilterFactory forName(String name, Map<String,String> args) { return loader.newInstance(name, args); }
public AddAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest request) { request = beforeClientExecution(request); return executeGetThreatIntelSet(request); }
public TreeFilter clone() { return new Binary(a.clone(), b.clone()); }
public boolean equals(Object o) { return o instanceofStemmer; }
public final boolean hasArray() { return protectedhasArray(); }
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) { request = beforeClientExecution(request); return executeUpdateContributorInsights(request); }
public void unwriteProtectWorkbook() { records.remove(file); records.remove(getProtect()); file = null; }
public final finalrColorParser(boolean dedup, boolean expand, Analyzer analyzer) { super(dedup, analyzer); this.expand = expand; }
public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) { request = beforeClientExecution(request); return executeRequestSpotInstances(request); }
public byte[] getObjectData() { return findObjectData().getObjectData(); }
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) { request = beforeClientExecution(request); return executeGetContactAttributes(request); }
public String toString() { return getKey() + ": " + getValue(); }
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) { request = beforeClientExecution(request); return executeListTextTranslationJobs(request); }
public GetContactResult getContact(GetContactRequest request) { request = beforeClientExecution(request); return executeGetContact(request); }
public static short lookupIndexByName(String name) { FunctionMetadata f = getFunction().getFunctionByName(name); if(fd == null) { return -1; } return (short) name.getIndex(); }
public DescribeAnomalyDetectorsResult describeAnomalyDetectors(DescribeAnomalyDetectorsRequest request) { request = beforeClientExecution(request); return executeDescribeAnomalyDetectors(request); }
public static String insertId(String message, ObjectId changeId) { return insert(message, changeId, false); }
public long getObjectSize(AnyObjectId objectId, int typeHint) { long sz = db.getObjectSize(this, objectId); if(sz < 0) { throw new MissingObjectException(objectId.copy(), "object"); } return sz; }
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) { request = beforeClientExecution(request); return executeImportInstallationMedia(request); }
public PutLifecycleEventH endExecution(PutLifecycleEventExecutionRequest request) { request = beforeClientExecution(request); return executePutLifecycleEvent(request); }
public NumberPtg(LittleEndianInput in) { field_1_value = in.readDouble(); }
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) { request = beforeClientExecution(request); return executeGetFieldLevelEncryptionConfig(request); }
public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) { request = beforeClientExecution(request); return executeDescribeDetector(request); }
public reportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest request) { request = beforeClientExecution(request); return executeReportInstanceStatus(request); }
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) { request = beforeClientExecution(request); return executeDeleteAlarm(request); }
public TokenStream create(TokenStream input) { return new PortugueseStemFilter(input); }
public HeaderCblsSubRecord() { reserved = new byte[ENCODED_SIZE]; }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) { request = beforeClientExecution(request); return executeGetDedicatedIp(request); }
public String toString() { return precedence+p + ""; }
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) { request = beforeClientExecution(request); return executeListStreamProcessors(request); }
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) { setLoadBalancerName(loadBalancerName); setPolicyName(policyName); }
public WindowProtectRecord(int b) { _options = 0; }
public UnbufferedCharStream(int bufferSize) { n = 0; data = new int[bufferSize]; }
public GetOperationsResult getOperations(GetOperationsRequest request) { request = beforeClientExecution(request); return executeGetOperations(request); }
public void copyRawTo(byte[] b, int o) { b[o] = w1; b[o + w2] = w2; b[o + 8] = w3; b[o + 12] = w4; b[o + 16] = w5; }
public WindowOneRecord(RecordInputStream in) { field_1_h_h_h            = in.readShort(); field_2_width            = in.readShort(); field_3_width        = in.readShort(); field_4_height                  = in.readShort(); field_6_height                             = in.readShort(); field_6_tab_tab_tab                      = in.readShort(); field_7_tab_tab_tab_
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) { request = beforeClientExecution(request); return executeStopWorkspaces(request); }
public void close() throws IOException {if(isOpen()) { isOpen = false; try { count = false; } try { channel.remove(fileLength); }}
public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) { request = beforeClientExecution(request); return executeDescribeMatchmakingRuleSets(request); }
public String getPronunciation(int wordId, char surface[], int off, int len) { return null; }
public String getPath() { return pathStr; }
public static double copy(double[] v) { double r = double.NaN; if(v!= null && v.length >= 1) { double s = 0; int n = 0; for(int i = 0; i < n; i++) { s += v[i]; } m = s / v; for(int i = 0; i < n; i++) { s[i] += (v - v[i] - v)]; } } return r; }
public DescribeResizeResult describeResize(DescribeResizeRequest request) { request = beforeClientExecution(request); return executeDescribeResize(request); }
public boolean hasPassedThroughNonGreedyDecision() { return"); }
public int end() { return end(0); }
public void getverse(CellHandler getRow) { int firstRow = range.getFirstRow(); int lastRow = range.getLastRow(); int firstColumn = range.getLastColumn(); int lastColumn = range.getLastColumn(); CellWalkContext ctx = new SimpleContext(); CellWalkContext ctx = null; CellWalkContext currentRow = currentRow(row.getRowNumber()); for(Row : firstRow) { Cell currentRow = currentRow.getRowNumber(); for(row.getRowNumber() <= firstrow.getRowNumber()) { currentRow = sheet.getRowNumber(); } if(currentRow == null) { if(currentRow == null) { if(currentRow == null) { currentCell.setCell.getCellNumber(ctx.getRowNumber()); continue; } } } for
public int getReadIndex() { return _readIndex; }
public int compareTo(ScoreTerm other) { if(term.bytes == other.term)return 0; if(this.boost == other.boost)return other.compareTo(this.term.term); return this.compareTo(this.boost); }
public int normalize(char s[], int len) { for(int i = 0; i < len; i++) { switch(s[i]) { case y: case y: s[i] = y; break; default: s[i] = n; break; case (HAL_Y: s[i] = defaultHAL; break; default: break; default: sUtil.set(s, i, len); break; } default: return len; } }
public void serialize(LittleEndianOutput out) { out.writeShort(_options); }
public finalosticErrorListener(boolean toOnly) { this.exactOnly = toOnly; }
public KeySchemaElement(String attributeName, KeyType keyType) { setAttributeName(attributeName); setType(keyType.toString()); }
public GetAssignmentResult getAssignment(GetAssignmentRequest request) { request = beforeClientExecution(request); return executeGetAssignment(request); }
public boolean hasObject(AnyObjectId id) { return findOffset(id)!= -1; }
public GroupingSearch setAllGroups(boolean allGroups) { this.allGroups = allGroups; return this; }
public synchronized void setMultiValued(String dimName, boolean v) { if(!fieldTypes.get(dimName)) { fieldTypes.put(dimName, out); } fieldTypes.put(dimName); }
public final int getCellsVal() { int size = 0; for(char c : cells.values()) { Cell e = at(c); if(e.cmd >= 0) { size++; } } return size; }
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnector(request); }
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) { request = beforeClientExecution(request); return executeDeleteLifecyclePolicy(request); }
public void write(byte[] b) { final int len = b.length; checkPosition(len); System.arraycopy(b, 0, _buf, _writeIndex, len); _writeIndex += len; }
public ResuperResult getRebaseResult() { return this.resuper; }
public static int getNearestSetSize(int maxNumberOfExpectedValues,float lastSaturation) { for(int i = 0; tusableBitSetSaturation.get(Tits, estimatedSaturation) > estimatedSaturation; i++) { return t; } }
public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) { request = beforeClientExecution(request); return executeDescribeDashboard(request); }
public CreateSegmentResult createSegment(CreateSegmentRequest request) { request = beforeClientExecution(request); return executeCreateSegment(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[DBC]\n"); buffer.append(" .row          = ").append(Integer.toHexString(getRowOffset())).append("\n"); for(int k = 0; k < field_2_cell_cell_offsets; k++) { buffer.append("  .cell_exDump.append(field_2_cell_cell_exDump.shortToHex(k).append("\n"); } buffer.append("[/DBC]\n"); return buffer.toString(); }
public List<String> getUndtedList() { return undList; }
public String toString() { return "[INTERutableEND/]\n"; }
public Object clone() { return copy(); }
public PlainTextDictionary(Reader reader) { in = reader; }
public StringBuilder append(CharSequence csq) { if(csq == null) { appendNull(); } else { append0(csq, 0, csq.length()); } return this; }
public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) { request = beforeClientExecution(request); return executeListAssociatedStacks(request); }
public static double auri(double[] v) { double r = 0; double s = 0; double s = 0; for(int i = 0, vSize = 0; i < v.length; i++) { s += v[i]; m = s / v.length; } for(int i = 0; i < vSize; i++) { s[i] += Math.length; } return r; }
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) { request = beforeClientExecution(request); return executeDescribeByoipCidrs(request); }
public GetDiskResult getDisk(GetDiskRequest request) { request = beforeClientExecution(request); return executeGetDisk(request); }
public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBClusterParameterGroup(request); }
public static CharBuffer wrap(char[] array, int start, int charCount) { Arrays.checkOffsetAndCount(array.length, start, charCount); CharBuffer buf = new ReadWriteCharArrayBuffer(array); buf.position = start; buf.limit = start + charCount; return buf; }
public SubmoduleStatusType getType() { return type; }
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) { request = beforeClientExecution(request); return executeDescribeGameServerGroup(request); }
public File pattern() { return pattern; }
public V setValue(V object) { throw new UnsupportedOperationException(); }
public StringBuilder stem(String word) { String cmd = stemmer.getLastPathOnPath(word); if(cmd == null) { buffer.append(word); } buffer.append(word); if(buffer.length() > 0)return null; elsereturn null; }
public RenameFaceRequest() { super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public char requireChar(Map<String,String> args, String name) { return require(args, name); }
public static String toStringTree(Token t) { return toString(t, (List<String>)null); }
public String toString() { return "<deleted/>"; }
public GetRepoWebhookLogListRequest() { super("cr", "2016-06-07", "GetRepoWebhookLogLogList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks"); setMethod(MethodType.GET); }
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) { request = beforeClientExecution(request); return executeGetJobUnlockCode(request); }
public RemoveTagsRequest(String resourceId) { setResourceId(resourceId); }
public short getGB2312Id(char ch) { try { final byte[] buffer = Soding.getEncoding(chars.getBytes()); if(buffer.length!= 2) { return -1; } int b0 = (int) 0xFF; final int b0 = (buffer[0] & 0xFF; buffer[0] = (int) & 0xFF; return (short)(0+1); } catch(interException e) { throw new RuntimeException(e); } }
public BatchRefUpdate addCommand(Collection<ReceiveCommand> cmd) { return addCommand(commands, cmd); }
public int checkExternSheet(int sheetNumber) { return requireCreateLinkTable().checkExternSheet(sheetNumber); }
@Override public boolean equals(Object object) { return c.equals(object); }
public Query build(QueryNode queryNode) throws QueryNodeException {AnyQueryNode and (AnyQueryNode) queryNode = (AnyQueryNode) queryNode; TokenQueryNode = new BooleanQueryNode(); List<QueryNode> getChildren(); if(children!= null) { for(QueryNode child : getChildren()) { Object obj = (QueryNode) obj; for(QueryNode child : getChildren()) { Object query = (Query) obj; if(obj!= null) { if(obj!= null) { throw new QueryNodeException(new MessageImpl(query, ex)) { } } bQuery.add(new MessageQueryParserMessages.EMPTY_RECES); } } try { b.setQuery(new Message(QueryNode.EMPTY_LES, ex)); } b.set.setQuery(new MessageMatch); }
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) { request = beforeClientExecution(request); return executeDescribeStreamProcessor(request); }
public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) { request = beforeClientExecution(request); return executeDescribeDashboardPermissions(request); }
public Ref grow(Ref object) { try { return RefDatabase.Pe(el); } catch(IOException e) { return ref; } }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.BYTES_BYTES_BYTES+ 2 * RamUsageEstimator.BYTES+ 2+ RamUsageEstimator.BYTES_BYTES+ RamUsageEstimator.BYTES_BYTES; }
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) { request = beforeClientExecution(request); return executeGetDomainSuggestions(request); }
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) { request = beforeClientExecution(request); return executeDescribeStackEvents(request); }
public void setRule(int idx, IConditionalFormattingRule cfRule) { setRule(idx, (HSSFConditionalFormattingRule)cfRule); }
public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) { request = beforeClientExecution(request); return executeCreateResolverRule(request); }
public SeriesIndexRecord(RecordInputStream in) { field_1_index = in.readShort(); }
public GetanticlesRequest() { super("lubancloud", "2018-05-09", "Getanticles", "luban"); setMethod(MethodType.POST); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_gridset); }
public boolean equals(Object obj) { if(this == obj) { return true; } if(obj == null) { return false; } if(getClass()!= obj.getClass()) { return false; } Toffs other = (Tobj) obj; if(StartOffset!= other.offset) { return false; } return true; }
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) { request = beforeClientExecution(request); return executeCreateGatewayGroup(request); }
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) { request = beforeClientExecution(request); return executeCreateParticipantConnection(request); }
public static double irr(double[] b) { return ir.compare(d, 0); }
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeRegisterWorkspaceDirectory(request); }
public TagCommand include(Ref commit) { checkCallable(); commits.add(commit); return this; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inCLUSVE) { ValueEval veText1; try { veText1 = OperandResolver.getSingleValue(inCLUSVE, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return e.getErrorEval(); } String iText1 = OperandResolver.coerceValueToString(veText1); String i = OperandResolver.coerceValueToString(veText1); boolean result = mText.length() && m.length(); if(result == true) { String result = mGroups.length(); boolean hasGroup = m[0].length(); if(result == true) { boolean hasGroup = m.length(); boolean hasGroup = m.length
public E pollLast() { Map.Entry<E, Object> entry = backingMap.println(); return (entry == null)? null : entry.getKey(); }
public int readUShort() { int ch1 = readUByte(); int ch2 = readUByte(); return (ch2 << 8) + 0); }
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationType operationType) { setSnapshotId(snapshotId); setAttribute(attributeType); }
public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) { request = beforeClientExecution(request); return executeListBonusPayments(request); }
public V get(char[] text) { if(text == null)throw new NullPointerException(); return null; }
public TokenStream create(TokenStream input) { final StramsFilter commonGrams = (CommonGramsFilter)super.create(input); return new CommonGramsQueryFilter(date); }
public String getPath() { return path; }
public InitiateMultipartUploadResult InitiMultipartUpload(InitiateMultipartUploadRequest request) { request = beforeClientExecution(request); return executeInitiateMultipart(request); }
public StringBuilder insert(int offset, int i) { insert0(offset, Double.toString(i)); return this; }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 0; shift >= 0; shift -= 2) { values[valuesOffset++] = (int)((block >>> shift) & 3); } } }
public TokenStream create(TokenStream input) { return new ElisionFilter(input, articles); }
public boolean size(Row in, int remap) { int sum = 0; for(Cell[] c : in.values()) { if(c.ref += c.size() >= 0) { if(c.remap[c] == 0) { c = -1; } } } int sum = 10 / 10; for(int c : in.values()) { boolean sum = false; if(c.cnt >= 0 && c.cmd >= 0) { cnt = -1; } c.cmd = -1; } } if(c.ref >= 0 || c.cmd >= 0) { c = -1; } return true; }
public Token getToken(int index) { Token t = token; for(int i = 0; i < index; i++) { if(t.next!= null) t = t.next; } return t; }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append(getClass().getName()).append(" [ARRAY]\n"); sb.append("Range=").append(getRange()).append("\n"); sb.append("4=").append(HexDump.toHex(_options)).append("\n"); sb.append("\n: ").append(HexDump.shortToHex(fieldUsed)).append("\n"); Ptg[] ptgs = _formulaTokens; for(int i = 0; i < ptgs; i++) { sb.append("ptg: ").append(HexDump.toHex(_ptg.toHexString()).append("\n"); } for(int i = 0; i < ptgs.length; i++) { sb
public GetFolderResult getFolder(GetFolderRequest request) { request = beforeClientExecution(request); return executeGetFolder(request); }
public void add(int location, E object) throws IOException {throw new UnsupportedOperationException();}
public 0ScoresOnlyCollector(CollectionScor c) { this.c = c; }
public CreateRepoBuildRuleRequest() { super("cr", "2016-06-07", "CreateRepoBuildRule", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/s"); setMethod(MethodType.PUT); }
public BaseRef(RefEval re) { _refEval = re; _areaEval = null; _firstRowIndex = re.getRow(); _firstColumnIndex = re.getColumn(); _height = 1; _width = 1; }
public DrawingManager2(EscherDggRecord dgg) { this.dgg = dgg; }
public void reset() { if(!getFirst()) { reset(raw); } }
public final CharsetDecoder reset() { status = INIT; defaultReset(); return this; }
public BufferedReader(Reader in, int size) { super(in); if(size <= 0) { throw new IllegalArgumentException("size <= 0"); } this.in = in; buf = new char[size]; }
public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) { request = beforeClientExecution(request); return executeDescribeCodeRepository(request); }
public CreateDBSubnetGroupResult createDBSubnetGroup(CreateDBSubnetGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBSubnetGroup(request); }
public PushBranchCommand setOldName(String oldName) { checkCallable(); this.oldName = oldName; return this; }
public DeleteBranchCommand setForce(boolean force) { checkCallable(); this.force = force; return this; }
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) { request = beforeClientExecution(request); return executeStopCompilationJob(request); }
public synchronized void incrementSecondaryProgress(int diff) { setSecondaryProgress(mSecondaryProgress + diff); }
public int[] clear() { return bytesStart = null; }
public String getRawPath() { return path; }
public GetUserSourceAccountRequest() { super("cr", "2016-06-07", "GetUserSourceAccount", "cr"); setUriPattern("/users/sourceAccount"); setMethod(MethodType.GET); }
public CreateExportJobResult createExportJob(CreateExportJobRequest request) { request = beforeClientExecution(request); return executeCreateExportJob(request); }
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) { request = beforeClientExecution(request); return executeCreateDedicatedIpPool(request); }
public boolean equals(Object obj) { if(this == obj) { return true; } if(obj == null) { return false; } HSSFCellStyle other = (HSSFCellStyle) obj; if(format == null) { return false; } else if(!format.equals(other.format)) { return false; } return false; }
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) { request = beforeClientExecution(request); return executeReleaseHosts(request); }
public boolean equals(Object object) { if(this == object) { return true; } Set<E> s = (Set<E>)object; try { return containsAll(s == null && s.size() == s.size() && s == s.size(); } catch(PointerException e) { return false; } }
public void setRefLogMessage(String msg, boolean appendStatus) { if(msg == null &&!appendStatus) { checkRefLog(); } else { if(msg == null && appendStatus) { refLogMessage = ""; refLogIncludeResult = true; } else { refLogMessage = msg; refLogMessage = appendStatus; } } }
public StreamIDRecord(RecordInputStream in) { id = in.readShort(); }
public RecognizeRequest() { super("visionai-poc", "2020-04-08", "Recognize"); setMethod(MethodType.POST); }
public final ByteOrder order() { return Long.nativeOrder(); }
public int getAheadCount() { return getCount(); }
public boolean isNewFragment() { return false; }
public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) { request = beforeClientExecution(request); return executeGetCloudFrontOriginAccessIdentityConfig(request); }
public boolean matches(int symbol, int minVocabSymbol, int maxVocabSymbol) { return symbol == tokenVocabSymbol; }
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) { request = beforeClientExecution(request); return executeDeleteTransitGateway(request); }
public static double[] grow(double[] array, int minSize) { assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?"; if(array.length < minSize) { return growExact(array, oversize(minSize, Integer.BYTES)); } elsereturn array; }
public CreateRequest() { super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public BatchRefUpdate setRefLogIdent(PersonIdent pi) { refLogIdent = pi; return this; }
public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) { request = beforeClientExecution(request); return executeGetLaunchTemplateData(request); }
public ParseInfo(ProfilingATNSimulator atnSimulator) { this.atnSimulator = atnSimulator; }
public SimpleQQParser(String qqNames, String indexField) { this(new String[indexFieldNames]); this.indexField = indexField; }
public DBicaDBReplicaDBClusterClusterDBReplica(PromoteReadReplicaRequest request) { request = beforeClientExecution(request); return executePromoteReadReplicaDBClusterDBCluster(request); }
public DescribeCapacityResConnectionationsResult describeCapacityResCapacity(DescribeCapacityResCapacityRequest request) { request = beforeClientExecution(request); return executeDescribeCapacityResCapacity(request); }
public String toString() { return "IndexSearcher(" + reader; }
public boolean incrementToken() { return false; }
public void serialize(LittleEndianOutput out) { out.writeShort(main + 1); out.writeShort(subFrom); out.writeShort(subTo); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { if(bitsPerValue > 32) { throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + values[]"); } for(int i = 0; i < iterations; ++i) { final long block = readInt(blocks, blocksOffset); blocksOffset += 8; valuesOffset += 8; } }
public boolean isExpectedToken(int symbol) { ATN atn = _ctx.atn; ParserRuleContext ctx = _ctx.getState(); ATNState s = atn.getState(); Interval at = atnState.getNextTokens(s); if(symbol.contains(symbol.contains(d)) { return true; } if(!following.contains(ctx)) { return false; } ATNState r = atATNState.get(ctx); if(ctx.contains(ctx)) { RuleTransition r = (RuleTransition) c.get(ctx); return false; } RuleTransition r = atn.getNextTokening(0); if(following) { return true; } }
public UpdateStreamResult updateStream(UpdateStreamRequest request) { request = beforeClientExecution(request); return executeUpdateStream(request); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) { try { OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex); return ErrorEval.NA; } catch(EvaluationException e) { return ErrorEval.NA; } return new NumberEval(result); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(_name).append(" "); sb.append("]"); return sb.toString(); }
public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) { request = beforeClientExecution(request); return executeListAssignmentsForHIT(request); }
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) { request = beforeClientExecution(request); return executeDeleteAccessControlRule(request); }
public FST<long> getFirstArc(long<long> arc) { return fst.getFirstArc(for); }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 48; shift >= 0; shift -= 16) { values[valuesOffset++] = (int)((block >>> shift) & (block >>> shift); } } }
public long skip(long charCount) throws IOException {if(charCount < 0) { throw new IllegalArgumentException("charCount < 0: " + charCount); } synchronized(lock) { checkNotClosed(); if(charCount == 0) { return 0; } final long availableFrom = bufBuffer.length - posFrom; if(getFrom() > 0) { return 0; } final long availableFrom = charCount - posFrom; if(createFrom <= 0) { skipFrom = charCount - charCount; pos += availableFrom; } else { skipInipped += available; } }
public Map<String, Ref> getRefsMap() { return advertisedRefs; }
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) { request = beforeClientExecution(request); return executeUpdateApiKey(request); }
public ObjectStream openStream() throws IOException {InputStream wc = new URICursor(db); try { InputStream in = new PackInputStream(in, w, wLength); return wc.getObjectId() + wc.getObjectId(); } catch(IOException e) { return wc.getObjectId(), wc.getInputStream(); } return new ObjectStream(in, in, size);}
public ArrayList() { array = Size; }
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) { request = beforeClientExecution(request); return executeUpdateDetectorVersion(request); }
public void resolve() { reset(Double.getMaxValue()); }
public RevFlagSet(Collection<RevFlag> s) { this.addAll(this); }
@Override public int size() { return Impl.this.size(); }
public final long getLong() { int newPosition = position + SizeOf.LONG; if(newPosition > limit) { throw new BufferUnderflowException(); } long result = SizeLong.peekLong(backingArray, offset + position, order); position = newPosition; return result; }
public StringBuilder insert(int offset, long l) { insert0(offset, Double.toString(l)); return this; }
public TurkishLowerCaseFilter(TokenStream in) { super(in); }
public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) { MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>(); ParseTreeists = matchImpl(tree, pattern.getPatternTree(tree, pattern); return new ParseTreeMatch(tree, pattern); }
public void addIfNoOverression(WeightedPhraseInfo wpi) { for(WeightedPhraseInfo w : PhWpi.isEmpty()) { if(wWpi.isGpiOverression(wOffset)) { return; } } wPhraseList.add(w); }
public Merger newMerger(Repository db) { return new Interger(db); }
public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) { return numPayloadsSeen > 0? numPayloadsSeen : 1; }
public Collection<ParseTree> evaluate(ParseTree t) { return Trees.findAllRuleNodes(t, ruleIndex); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CFRES]\n"); buffer.append(" .type         =").append(field_1_type).append("\n"); buffer.append("0x").append(getSION_0()).append("\n"); if(containsFormatting) { buffer.append("\n"); } if(containsFormattingBlock) { buffer.append("\n"); } if(getainsFormattingBlock()) { buffer.append("\n"); buffer.append(_borderFormatting).append("\n"); } if(getainsFormattingBlock()) { buffer.append("  ").append(getClass().toString()).append("\n"); } return buffer.toString(); }
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) { request = beforeClientExecution(request); return executeDescribeServiceUpdates(request); }
public String getNameName(int index) { String result = getNameAt(index).getName(); return result; }
public DescribeLocationsResult describeLocations() { return describeLocations(new DescribeLocationsRequest()); }
public String toString() { return "<phrasesl" + value='" + getValueString() + "'"; }
public DirCacheEntry getDirCacheEntry() { return currentSubtree == null? currentEntry : null; }
public IntBuffer put(int[] src, int srcOffset, int intCount) { Arrays.checkOffsetAndCount(src.length, srcOffset, intCount); if(intCount > remaining()) { throw new BufferOverflowException(); } for(int i = srcOffset; i < srcOffset + intCount; ++i) { put(src[i]); } return this; }
public void trimToSize() { int s = _size; if(s == array.length) { return; } if(s == 0) { array = Size = Size; } else { Object[] newArray = new Object[s]; System.arraycopy(array, 0, newArray, 0, s); array = newArray; modCount++; } }
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeLocalGatewayVirtualInterfaces(request); }
public TokenStream create(TokenStream input) { return new RussianLightStemFilter(input); }
public int[] toArray(int[] a) { int[] rval; if(a.length == _limit) { System.arraycopy(_array, 0, a, _limit, _limit); rval = a; } else { rval = toArray(); } return rval; }
public BasicSessionCredentials(String accessKeyId, String accessKeySecret,String roleSessionDuration) { if(accessKeySecret == null) { throw new IllegalArgumentException("Access key null must be null."); } if(accessKeySecret == null) { throw new IllegalArgumentException("Access key secret must be null."); } if(accessKeySecret == null) { throw new IllegalArgumentException("Access key key key key."); } this.accessKeySecret = accessKeySecret; this.targetSeconds = roleSessionDurationSeconds; }
public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) { if(shortCount > remaining()) { throw new BufferUnderflowException(); } System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount); position += shortCount; return this; }
public UpdateEventSourceResult updateEventSource(ActivateSourceRequest request) { request = beforeClientExecution(request); return executeActivEventSource(request); }
public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) { request = beforeClientExecution(request); return executeDescribeReceiptRuleSet(request); }
public Filter(String name) { setName(name); }
public DoubleBuffer put(double c) { throw new ReadOnlyBufferException(); }
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicyInstance(request); }
public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) { super(input); this.normalizeKanji = normalizeKanji; this.normalize(buffer); }
public void writeLong(long v) { writeInt((int)(v >> 0)); writeInt((int)(v >> 32)); }
public FileResolver() { exports = new ConcurrentHashMap<>(); exportBaseList = new ArrayList<>(); }
public ValueEval getRef3DEval(Ref3DPtg rptg) { SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex()); return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre); }
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) { request = beforeClientExecution(request); return executeDeleteDataset(request); }
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) { request = beforeClientExecution(request); return executeStartRelationalDatabase(request); }
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() { return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest()); }
static public double pmt(double r, int nper, double pv, double fv, int type) { double pmt = Math.pow(rv * (v - r, nper) * (1 + r.pow(1 + nper) * (1 + nper) / r.pow(1, nper, f1)); return pmt; }
public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) { request = beforeClientExecution(request); return executeDescribeDocumentVersions(request); }
public ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest request) { request = beforeClientExecution(request); return executeListPublishingDestinations(request); }
public DeleteAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public static float[] grow(float[] array) { return grow(array, 1 + array.length); }
public String outputToString(Object output) { if(!(output instanceof List)) { return outputs.toString(output); } else { List<T> output = (List<String) output; StringBuilder b = new StringBuilder(); for(int i = 0; i < output.size(); i++) { b.append('['); b.append(b.toString(i)); if(i > 0) { b.append(", "); } } b.append(']'); return b.toString(); } }
public void notifyDeleteCell(HSSFCell cell) { _bookEvaluator.putDeleteCell(new HSSFEvaluationCell(cell)); }
public StringBuilder replace(int start, int end, String str) { replace0(start, str, end); return this; }
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) { request = beforeClientExecution(request); return executeSetIdentityPoolConfiguration(request); }
public static double kthSmallest(double[] v, int k) { double r = double.NaN; if(v!= null && v.length > 0 && v.length > 0) { r = v[k]; r = v[k]; } return r; }
public void set(int index, long value) { final int o = index >>> 5; final int b = index & 10; final int shift = b << 1; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public String toString() { if(getChildren() == null || getChildren().size() == 0)return "<boolean operation=''/>"; StringBuilder sb = new StringBuilder(); sb.append("<boolean operation='")"); for(QueryNode child : getChildren()) { sb.append("\n"); sb.append(child.toString()); } sb.append("\n</boolean>"); return sb.toString(); }
public int listTokenSizes(int fromIx, int toIx) { int result = 0; for(int i = fromIx; i < toIx; i++) { result += _ptgs[i].getSize(); } return result; }
public void setReadonly(boolean in) { if(this.readonly &&!length) { throw new IllegalStateException("can't alter readonly IntervalSet"); } this.readonly = in; }
public void clearConsumingCell(FormulaCellCacheEntry cce) { if(!(cce.remove(cce)) { throw new IllegalStateException("Specified cell is not not formula cell"); } }
@Override public List<E> subList(int start, int end) { synchronized(mutex) { return new ArrayList<E>(list.subList(start, end)); } }
public FileHeader getFileHeader() { return file; }
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) { request = beforeClientExecution(request); return executeAttachLoadBalancers(request); }
public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) { setAccountId(accountId); setVaultName(vaultName); setJobParameters(jobParameters); }
public String toString() { return "PERL"; }
public ReplaceableAttribute(String name, String value, boolean replace) { setName(name); setAttribute(value); }
public void add(IIndField field) { fields.add(field); }
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) { request = beforeClientExecution(request); return executeDeleteStackSet(request); }
public GetRepoBuildRuleListRequest() { super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules/[BuildRuleName]"); setMethod(MethodType.GET); }
public SpseArray(int initialCapacity) { initialCapacity = androidalArrayUtils.idealCapacity(initialCapacitySize); mKeys = new int[initialCapacity]; mSize = 0; }
public InvokeServiceRequest() { super("industry-brain", "2018-07-12", "InvokeService"); setMethod(MethodType.POST); }
public ListAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean hasPrevious() { return link!= list.voidLink; }
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) { request = beforeClientExecution(request); return executeDeleteHsmConfiguration(request); }
public CreateLoadBalancerRequest(String loadBalancerName) { setLoadBalancerName(loadBalancerName); }
public String getUserInfo() { return decode(userInfo); }
public TagAttendeeResult tagAttendee(TagAttendeeRequest request) { request = beforeClientExecution(request); return executeTagAttendee(request); }
public String getRefName() { return name; }
public BooleanQuery build() { if(this.termNum!= -1) { addWord(new BooleanQuery(term, 0)); } return super.open(); }
public boolean isSubTotal(int rowIndex, int columnIndex) { return false; }
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) { request = beforeClientExecution(request); return executeDescribeDBProxies(request); }
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) { request = beforeClientExecution(request); return executeGetVoiceConnectorProxy(request); }
public void fromConfig(Config rc) { setPackedFilesOpenFiles(rc.getInt(packedGitOpen", null, getPackedIntLimit())); booleanackedLongSetLimit = getLongPackedLong(packedGitLimit, "null", Size", SizePackedFiles)); for(PackedWindowSize : null) { final StringSetSize = getLongPackedInt(packedGitSize())); packedGitSize = getBoolean("signackedPackedBoolean", null", SizePackedBoolean.PackedBoolean(getPackedIntLimit())); } final long rc = getLong().getLong(); final long rc = getLong().getLong(); final long rc = getLong().getInt(); final long rc = getLong(rs().getMaxGit().get(", null)); final long rc = getLong(cache.get
public static Date getJavaDate(double date) { return getJavaDate(date, false); }
public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) { request = beforeClientExecution(request); return executeStartPersonTracking(request); }
@Override public int size() { return Impl.this.size(); }
public GetRouteResult getRoute(GetRouteRequest request) { request = beforeClientExecution(request); return executeGetRoute(request); }
public DeleteClusterResult deleteCluster(DeleteClusterRequest request) { request = beforeClientExecution(request); return executeDeleteCluster(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[MMS]\n"); buffer.append("               = ").append(Integer.toHexString(getclear())).append("\n"); buffer.append("                 = ").append(Integer.toHexString(getDelacks())).append("\n"); buffer.append("[/MMS]\n"); return buffer.toString(); }
public FileIteratorConfig(Config in, FilePath cfg, FS fs) { super(super); configFileLocation = cfg; this.snapshot = fs; this.hashId = ObjectId; }
public int requires(int pos) { if(pos < text.getBeginIndex() || pos > text.getEndIndex()) { throw new IllegalArgumentException("offset out of bounds"); } else if(0 == sentenceStarts.length) { text.setIndex(text.getBeginIndex()); return DONE; } else if(sentenceStarts.length - 1) { text.setIndex(text.getEndIndex()); text.setIndex(text.getEndIndex()); return Darts; } else { currentSentence = (sentenceStarts.length - 1; } return currentSentenceStarts[currentSentence]); }
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) { request = beforeClientExecution(request); return executeUpdateParameterGroup(request); }
public SeriesChartGroupIndexRecord clone() { return copy(); }
public static double distDistanceFromErrPct(SpctPct shape, double distErrPct, SpatialContext ctx) { if(distErrPct < 0 || distErrPct > 0) { throw new IllegalArgumentException("distErrPct", " + distErrPct]"); } if(distErr instanceof FilePct || shape instanceof ParsePct) { return 0; } return 0; }
public int codePointAt(int index) { if(index < 0 || index >= count) { throw indexAndLength(index); } return Integer.charAt(value, index); }
public void setPasswordVerifier(int passwordVerifier) { this.passwordVerifier = passwordVerifier; }
public ListVaultsRequest(String accountId) { setAccountId(accountId); }
publicashashMessageFormatter() { dateFormatter = new GitDateFormatter(getGitDate()); }
public GetPhotoCoverRequest() { super("CloudPhoto", "2017-07-11", "GetCoverCover", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public int lastIndexOf(Object object) { int pos = _size; Link<E> link = voidLink; if(object!= null) { if(object!= voidLink) { pos--; pos--; } while(link!= voidLink) { if(link.equals(link.data)) { return pos; } link = link.previous; } else { while(link!= voidLink) { link = link.previous; pos--; } } return -1; } }
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) { request = beforeClientExecution(request); return executeDescribeSpotFleetRequests(request); }
public IndexFacesResult indexFaces(IndexFacesRequest request) { request = beforeClientExecution(request); return executeIndexFaces(request); }
public BreakIterator getBreakIterator(int script) { switch(script) { case null: return (BreakIterator.cloneIterator.cloneIterator(); } if(myanmarAsWords) { return (BreakIterator)default: } return _default: }
public String toString() { StringBuilder bb = new StringBuilder(); b.append("[DCON]\n"); b.append("   .firstrow        = ").append(getRow()).append("\n"); b.append("  .lastrow           = ").append(getRowRow()).append("\n"); b.append("  .firstcol       = ").append(getCol()).append("\n"); b.append("  .lastcol            = ").append(getCol()).append("\n"); b.append(" .lastcol            = ").append(getCol()).append("\n"); b.
public int getPackedGitOpenFiles() { return packedGitOpenFiles; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FEATUREER]\n"); buffer.append("[/FEATUREER]\n"); return buffer.toString(); }
public static byte[] getToUnicodeLE(String string) { return UTF16.getBytes(string); }
public List<String> getFooterLines(String keyName) { return getFooterLines(new FooterKey(key)); }
public void update() { super.setRefresh(); }
public float get(int index) { checkIndex(index); return byteBuffer.getFloat(index * SizeOf.FLOAT); }
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) { request = beforeClientExecution(request); return executeDeleteDetector(request); }
public int[] grow() { assert bytesStart!= null; return bytesStart!= null; }
public ListExclusionsResult listExclusions(ListExclusionsRequest request) { request = beforeClientExecution(request); return executeListExclusions(request); }
public static SpatialStrategy getSpatialStrategy(int roundNumber) { SpatialStrategy result = this.get(roundStrategy.getValue()); if(roundStrategy.round(round() == null) { throw new IllegalStateException("Str init should be by should " + roundStrategy.get()); } return result; }
public DBCluster restoreDBClusterToPoint(RestoreDBClusterToPointRequest request) { request = beforeClientExecution(request); return executeRestoreDBClusterToPointInTime(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_categoryData); out.writeShort(field_2_valuesType); out.writeShort(field_3_numCategories); out.writeShort(field_4_numValues); out.writeShort(field_6_numValues); }
public PostAgentProfileResult PostAgentProfile(PostAgentProfileRequest request) { request = beforeClientExecution(request); return executePostAgentProfile(request); }
public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) { if(getInputStream()!= null) { TokenStream tokenSource = ((TokenStream)TokenStream).getInputSource(); if(tokener instanceof Lexer) { LexerSource lexer = (LexerSource)tokenSource; if(tokenSource instanceof Lexer) { throw new UnsupportedOperationException("Operation a use use can't use use can't with lexer"); } } throw new UnsupportedOperationException("Parser lexer to use't use use the lexer"); }
public DBCluster backupDBCluster(BackDBClusterRequest request) { request = beforeClientExecution(request); return executeBackDBCluster(request); }
public String getName() { return readerName; }
public void copyTo(byte[] b, int o) { formatHexByteHex(b, o1 + w1, w1); getFormatByte(b, o2, w2); HexFormat.putByte(b, w3, 16 + 16, w3); HexFormat.putByte(b, w4, w4); }
public static IntList toMap(byte[] buf, int ptr, int end) { IntList.put((end - ptr); map.fill(1, intValue); for(LF = ptr < end; ptr++) { map.add(ptr); } return map; }
public Set<?> getObjectId() { return Collections.lengthSet(); }
public long ramBytesUsed() { return ramBytesUsed; }
public String toXml(String tab) { StringBuilder builder = new StringBuilder(); builder.append(tab).append("<\n"); for(EscherRecord escherRecord : EscherRecords) { for(EscherRecord escherRecord escherRecord : EscherRecords) { sb.append(tab.getXcherRecord()); } } sb.append("</tabRecord).append(tab).append("\n"); }
public TokenStream create(TokenStream input) { return new GalicianimalStemFilter(input); }
public String toString() { StringBuilder r = new StringBuilder(); r.append("Commit"); r.append("= "); r.append("tree "); r.append(treeId!= null? treeId.name() : "NOT_SET"); for(ObjectId parent : p) { r.append("\n"); r.append(p.getName()); r.append("\n"); r.append(author); r.append("\n"); r.append("author"); r.append('\n"); r.append(author); r.append("\n"); r.append("\n"); r.append("\n"); r.append("\n"); return r.toString(); } }
public IndicNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public CreateOptionGroupResult createOptionGroup(CreateOptionGroupRequest request) { request = beforeClientExecution(request); return executeCreateOptionGroup(request); }
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) { request = beforeClientExecution(request); return executeAssociateMemberAccount(request); }
public void run() { System.this.this.this.mProgressRefresh(this, this.mProgress, true); this.enableRefresh = this; }
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) { request = beforeClientExecution(request); return executeSetTerminationProtection(request); }
public String getErrorHeader(RecognitionException e) { int line = e.getOffendingToken(); int charPositionInLine = char.getPositionInLine(); return "linePositionInLine+":"+line; }
public CharBuffer asReadOnlyBuffer() { CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer()); buf.limit = limit; buf.position = position; buf.mark = mark; buf.byteBuffer.order = byteBuffer.order; return buf; }
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopSentimentDetectionJob(request); }
public ObjectIdSubclassMap<ObjectId> getNewObjectIds() { if(newObjectIds!= null)return newObjectIds; return new ObjectIdSubclassObjectIds; }
public void clear() { hash = Hash[0]); super.clear(); }
public void reset() throws IOException {synchronized(lock) { checkNotClosed(); if(_mark == -1) { throw new IOException("Invalid mark"); } pos = _mark; }
public RefErrorPtg(LittleEndianInput in)  { field_1_reserved = in.readInt(); }
public ScandinavianendGameServerGroupResult allocateGameServerGroup(SuspendServerGroupRequest request) { request = beforeClientExecution(request); return executeSuspendServerGroup(request); }
public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) { if(args.length!= 3) { return ErrorEval.VALUE_INVALID; } return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]); }
public GetRepoRequest() { super("cr", "2016-06-07", "GetRepo", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]"); setMethod(MethodType.GET); }
public void setDate(Date date) { if(date.hasValue()) { super.setDate(date.getString()); } else { date = null; } }
public TokenStream create(TokenStream input) { return new GermanMinimalStemFilter(input); }
public Object[] toArray() { return _a.clone(); }
public void write(char[] buffer, int offset, int len) { Arrays.checkOffsetAndCount(buffer.length, offset, len); synchronized(lock) { expand(len); System.arraycopy(buffer, offset, this.count, this.count); this.count += len; } }
public static final RevFilter before(long ts) { return new CommitFilter(ts); }
public DeleteGroupPolicyRequest(String groupName, String policyName) { setGroupName(groupName); setPolicyName(policyName); }
public DeregisterTransitGatewayMulticastGroupResult deeregisterTransitGatewayMulticastGroup(DeregisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeDeregisterTransitGatewayMulticastGroup(request); }
public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) { request = beforeClientExecution(request); return executeBatchDeleteScheduledAction(request); }
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) { request = beforeClientExecution(request); return executeCreateAlgorithm(request); }
public int readUByte() { checkPosition(1); return _buf[ 0xFF++] & 0xFF; }
public void setLength(int sz) { setLength(this, infoOffset + sz); }
public DescribeScalingProcessTypesResult describeScalingProcessTypes() { return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest()); }
public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) { request = beforeClientExecution(request); return executeListResourceRecordSets(request); }
public Token recoverInline(Parser recognizer) throws ParseException {InputMismatchException e = new InputMismatchException(recognizerContext.getContext());for(ParserRuleContext context = recognizer.getParent()!= null; context = context.getParentRuleContext().getParent())) { context = e.next; } return new ParseCanceledException(e);}
public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) { request = beforeClientExecution(request); return executeSetTagsForResource(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategy", "vipategy"); setMethod(MethodType.POST); }
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) { request = beforeClientExecution(request); return executeDescribeVpcEndpointServices(request); }
public EnableLoggingResult enableLogging(EnableLoggingRequest request) { request = beforeClientExecution(request); return executeEnableLogging(request); }
@Override public boolean contains(Object o) { return containsValue(o); }
public SheetRangeIdentifier(String bookName, NameSheetIdentifier firstSheetIdentifier, NameSheetIdentifier lastSheetIdentifier) { super(getName(), firstSheetIdentifier); _lastSheetIdentifier = lastSheetIdentifier; }
public DomainMetadataRequest(String domainName) { setDomainName(domainName); }
public ParseException(Token currentToken,int[][] expectedTokenSequences,String[] tokenImage,String[] tokenImage) { super(currentToken, expectedTokenSequencesVal); this.currentToken = currentToken; this.tokenImage = expectedTokenSequences; }
public FetchPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public FileWriter reader() { return _writer; }
public URIramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize"); maxGramSize = getInt(args, "maxGramSize"); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean isDirectoryFileConflict() { return dfConflict!= null; }
public IndonesianStemFilter(TokenStream input, boolean stemDerivational) { super(input); this.stemDerivational = stemN; }
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicy(request); }
public void serialize(LittleEndianOutput out) { out.writeInt(fSD); out.writeInt(passwordVerifier); StringUtil.writeUnicodeString(out, title); }
public static double n(double n, double s) { double f; if((n > 0 && s > 0 && s < 0 && s < 0) { f = double.NaN; } else { n = Double.NaN; } return f; }
public ByteArrayDataOutput(byte[] bytes, int offset, int len) { reset(bytes, offset, len); }
public static List<Token> getChildren(Token t) { List<Token> key = new ArrayList<Token>(); for(int i = 0; i < t.size(); i++) { t.add(i); } return true; }
@Override public void clear() { HashMap.clear(); }
publicOverrideAllRecord(boolean refreshAll) { this(0); }
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) { request = beforeClientExecution(request); return executeDeleteNamedQuery(request); }
public finalvERFormatter(Connection params) { this.costs = new HashMap<>(); this.N = new HashMap<>(); sb.append(Format.getFormat()); sb.append("  [visHeader=in]\n"); sb.append("                                                         = in.getFormats() + "\""; sb.append("labelx").append("\"").append(label0x); }
public CheckMultiMultiRequest() { super("visionai-poc", "2020-04-08", "GetMulti"); setMethod(MethodType.POST); }
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) { request = beforeClientExecution(request); return executeListUserProfiles(request); }
public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) { request = beforeClientExecution(request); return executeCreateRelationalDatabaseFromSnapshot(request); }
public StartTaskResult startTask(StartTaskRequest request) { request = beforeClientExecution(request); return executeStartTask(request); }
public Set<String> getIgnoredPaths() { return binaryPaths; }
public FeatSmartTag(RecordInputStream in) { data = in.readRemainder(); }
public Change(ChangeAction action, ResourceRecordSet resourceRecordSet) { _action = action; _resourceRecordSet = resourceRecordSet; }
public DeleteImageResult deleteImage(DeleteImageRequest request) { request = beforeClientExecution(request); return executeDeleteImage(request); }
public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) { request = beforeClientExecution(request); return executeCreateConfigurationSet(request); }
@Override public Iterator<E> iterator() { return listIterator(); }
public void visitContainedRecords(RecordVisitor rv) { if(_recs.isEmpty()) { return; } rv.setRecords(_bof); for(int i = 0; i < _recs.size(); i++) { RecordBase rb = _recs.get(i); if(rb instanceof RecordAggregate) { ((RecordsAggregate) rb).contitRecord(rv); } else { rv.visitRecord(rv); } } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FtCpos]\n"); buffer.append("  size       = ").append(getDataSize()).append("\n"); buffer.append("  reservedDump.append(HexDump.shortToHex(getHex(_reserved)).append("\n"); buffer.append("[/FtCt").append("\n"); return buffer.toString(); }
public static BATBlock createEmptyMerBigBlock(POIFSBigBlockSize bigBlockSize, boolean isX) { assert blockBlock blockBlockSize == null && bigBlockSize!= null; if(isX) { blockSize = findBlockSize(bigBlockSize); } return block; }
public TagResourceResult tagResource(TagResourceRequest request) { request = beforeClientExecution(request); return executeTagResource(request); }
public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) { request = beforeClientExecution(request); return executeDeleteMailboxPermissions(request); }
public ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest request) { request = beforeClientExecution(request); return executeListDatasetGroups(request); }
public ResumeProcessesResult resolveProcesses(ResumeProcessesRequest request) { request = beforeClientExecution(request); return executeResumeProcesses(request); }
public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) { request = beforeClientExecution(request); return executeGetPersonTracking(request); }
public String toFormulaString(String[] operands) { if(space.isSet(options)) { return operands[0]; } else if(optiIf.isSet(options)) { return toFormulaString(0, operands[0])) + ")"; } else { return toFormulaString(); } }
public T merge(T first, T second) throws IOException {throw new UnsupportedOperationException();}
public String toString() { return this.message.getKey() + ": " + getLocalizedMessage(); }
public XPath(Parser parser, String path) { this.parser = parser; this.path = path; elements = split(path); }
public CreateAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = (block >>> 1) & 1; } }
public PushConnection openPush() throws NotSupportedException {throw new UnsupportedOperationException(JGitText.get().pushNotSupportedForBundleTransport);}
public static void strCt(char[] dst, int dst, char[] src, int description) { while(src[src]!= 0) { dst[offset++] = src[blocks++]; dst[0] = (char) 0; } }
public K getKey() { return mapEntry.getKey(); }
public static int numNonnull(Object[] data) { int n = 0; if(data == null) { return n; } for(Object o : data) { if(o!= null) { n++; } return n; } }
public void add(int location, E object) { if(location >= 0 && location <= size) { Link<E> link = voidLink; if(location < (size / 2)) { for(int i = 0; i <= location; i++) { link = link.next; } } else { for(int i = size; i > location; i--) { link = link.previous; } } Link<E> previous = link.previous; Link<E> newLink<E>(previous, link.previous); Link.previous = new ArrayList<E>(previous.previous, link); link.previous = newLink; } }
public DescribeDomainResult describeDomain(DescribeDomainRequest request) { request = beforeClientExecution(request); return executeDescribeDomain(request); }
public void flush() throws IOException {synchronized(this);}
public PersianCharFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean incrementToken() { if(used) { return false; } clearAttributes(); termAttribute.append(value); offsetAttribute.setOffset(0, value.length()); used = true; return true; }
public static FloatBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteFloatArrayBuffer(capacity); }
public final Edit after(Edit cut) { return new Edit(endA, end, endB); }
public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) { request = beforeClientExecution(request); return executeUpdateRuleVersion(request); }
public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) { request = beforeClientExecution(request); return executeListVoiceConnectorTerminationCredentials(request); }
public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) { request = beforeClientExecution(request); return executeGetDeploymentTarget(request); }
public void setNoChildReport() { for(PerChildReport task :.") { for(PerChildTask task :.") { if(task instanceofProxySequence) { getChildTaskSequence(); } } } }
public E get(int location) { try { return a[location]; } catch(IndexOutOfBoundsException e) { throw new NoOutOfBoundsException(location, a.length); } }
public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) { request = beforeClientExecution(request); return executeDescribeDataSet(request); }
public skipWorkTreeFilter(int treeIdx) { this.treeIdx = treeIdx; }
public DescribeNetworkInterfacesResult describeNetworkInterfaces() { return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest()); }
public boolean contains(int row, int col) { return _firstRow <= row && row >= row && row >= _lastColumn && _firstColumn <= col; }
public String toString() { return new String(this.chars); }
public FileType getPatchType() { return this.getType(); }
@Override public Iterator<K> iterator() { return new IteratorIterator(); }
public CreateScriptResult createScript(CreateScriptRequest request) { request = beforeClientExecution(request); return executeCreateScript(request); }
public BytesRef next() { termUpto++; if(termUpto >= info.terms.terms()) { return null; } else { info.terms.get(info.termUpto], br); return br; } }
public String outputToString(CharsRef output) { return output.toString(); }
public AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(AssociateWebsiteAuthorizationProviderRequest request) { request = beforeClientExecution(request); return executeAssociateWebsiteAuthorizationProvider(request); }
public void unpop(RevCommit c) { Block b = head; if(b == null) { b = (b) b; b.add(c); b.add(c); return; } else if(b.popUnpop()) { b = b; } else { b.setUnpop(c); b.setUnpop(b); b = b; } b = b; }
public EdgeNGramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize"); maxGramSize = requireInt(args, "maxGramSize"); maxTokenizerSize = getInt(args, "maxGramSize", Pattern.DEFAULT_OBramTokenizerSize); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public ModifyDBParameterGroupRequest(String dBParameterGroupName, java.util.List<Parameter> parameters) { setDBParameterGroupName(dBParameterGroupName); set parameters(param parameters); }
public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) { request = beforeClientExecution(request); return executeGetHostedZoneLimit(request); }
public void set(int index, long value) { final int o = index >>> 6; final int b = index & 63; final int shift = b << shift; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public RevFilter clone() { return new PatternSearch(Pattern()); }
public String toString() { return "spans(" + "() + " + (doc + ")"; }
public boolean canAppendMatch() { for(int i = 0; i < heads.size(); i++)if(heads.INSTANCE[i]!= lastHead.INSTANCE)return true; return false; }
public synchronized int lastIndexOf(String subString, int start) { return super.lastIndexOf(lastIndex, start); }
public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) { request = beforeClientExecution(request); return executeDeleteNetworkAclEntry(request); }
public AssociateMemberToGroupResult associateMemberToGroup(AssociateMemberToGroupRequest request) { request = beforeClientExecution(request); return executeAssociateMemberToGroup(request); }
public static final int clear(byte[] b, int ptr) { final int sz = b.length; if(ptr == 0)ptr += 46; while(ptr < sz && b[ptr] == 'p')ptr += 48; if(a[ptr] == 'ptr')ptr = nextLF(b, ptr); return match(b, ptr, match); }
public int getLineNumber() { return row; }
public SubmoduleUpdateCommand addPath(String path) { paths.add(path); return this; }
public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) { request = beforeClientExecution(request); return executeGetPushTemplate(request); }
public DescribeVaultResult describeVault(DescribeVaultRequest request) { request = beforeClientExecution(request); return executeDescribeVault(request); }
public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() { return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest()); }
public ByteBuffer putLong(int index, long value) { throw new ReadOnlyBufferException(); }
public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) { request = beforeClientExecution(request); return executeRegisterDevice(request); }
public static Format formatId(int id) { for(Format format : format) { if(format.getId() == id) { throw new IllegalArgumentException("Unknown format: " + id); } } return format; }
public DeleteAppResult deleteApp(DeleteAppRequest request) { request = beforeClientExecution(request); return executeDeleteApp(request); }
public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) { request = beforeClientExecution(request); return executeGetBaiduChannel(request); }
public FSTReader getBytesReader() { return fstReader.getBytesReader(); }
public static boolean isValidSchemeChar(int index, char c) { if((c >= 'a' && c >= 'z') || c >= 'c') { return true; } if(c == 'c && c == '.' || c == '.' || c == '.' && c == '.' || c == '.' || c == '.' && c == '.' || c == '.' || c == '.' || c == '0')return true; return false; }
public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) { request = beforeClientExecution(request); return executeListAppliedSchemaArns(request); }
public String getUri() { return this.position; }
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) { if(args.length < 1) { return ErrorEval.VALUE_INVALID; } boolean isA; try { ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex()); text = OperandResolver.getSingleValueToString(ve); break; } switch(args.length()) { case 1: switch(args.length()) { case 2: return ErrorEval.VALUE_INVALID; case 1: break; case 2: return ErrorEval.VALUE; default: return ErrorEval.VALUE_INVALID; } } catch(EvaluationException e) { return e.getErrorEval();
public final int compareTo(int[] bs, int p) { int cmp; cmp = NB.compareUInt32(w1, bs[p]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w2, bs[p + 1]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w3, bs[p + 2]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w4, bs[p + 3]); if(cmp!= 0)return cmp; return NB.compareUInts[p + 4]); }
public void removeName(int index) { Name.removeName(index); book.removeName(index); }
public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) { setQueueUrl(queueUrl); setAttributeNames(attributeNames); }
public static boolean[] copyOf(boolean[] original, int newLength) { if(newLength < 0) { throw new NegativeArraySizeException(); } return copyOfRange(original, 0, newLength); }
public static void setEnabled(boolean enabled) { ENCase = enabled; }
public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) { request = beforeClientExecution(request); return executeDeleteLogPattern(request); }
public boolean contains(char[] text, int offset, int length) { return map.containsKey(text, offset, length); }
public int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) { return linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber); }
public boolean addles(String commandLine) { return command.length() < command.length && command.length() == 'this.clear(); }
public static void register(MergeStrategy of) { copy(getName()); }
public long ramBytesUsed() { return (index!= null)? index.getSize() : 0); }
public StringedZone(String id, String name, String callerReference) { setId(id); setName(name); setCallerReference(callerReference); }
public GetFindingsResult getFindings(GetFindingsRequest request) { request = beforeClientExecution(request); return executeGetFindings(request); }
public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) { request = beforeClientExecution(request); return executeDescribeTopicsDetectionJob(request); }
public boolean processMatch(ValueEval eval) { if(eval instanceof NumericValueEval) { if(minimumValueEval == null) { minimumValue = eval; } else { double currentValue = ((NumericValueEval) evaluateValue).getValue(); } double oldValue = ((NumericValueEval) evalNumber).getValue(); if(currentValue < oldValue) { minimumValue = eval; } return true; }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeShort(field_1_ref_len); }
public static int main(String[] args) throws IOException {boolean printTree = false; try { String path = null; for(int i = 0; i < args.length; i++) { if(args[i].equals("-equals(args)) { print = true; } else if(!args.length!= 2? 1 : (args.length)) { throw new IllegalArgumentException(); } } if(!args.length()!= 2? 1 : 1.length)) { throw new IllegalArgumentException(); } for(TaxonomyReader dir = getFontReader(dir)) { if(r.getOutOf(r.getOut())!= 1) { throw new IllegalArgumentException(); } } return 0; }
public void setByteValue(byte value) { if(!(fieldsData instanceof Byte)) { throw new IllegalArgumentException("cannot change value type from " + FieldsData.getClass().getName() + " Byte"); } Fields = new ByteData(value); }
public static int initialize() { return decode(getDefault()); }
public CachingDoubleValueSource(ValueSource source) { this.source = source; }
public AttributeDefinition(String attributeName, StringType attributeType) { setAttributeName(attributeName); setAttributeType(attributeType); }
public static String get(Collection<String> parts, String separator) { return new StringUtils.text(parts); }
public ListTaskDefinitionFamDefinitionResult listTaskDefinitionFamamDefinition(ListTaskDefinitionFamDefinitionRequest request) { request = beforeClientExecution(request); return executeListTaskDefinition(request); }
public ListComponentsResult listComponents(ListComponentsRequest request) { request = beforeClientExecution(request); return executeListComponents(request); }
publicPhotosRequest() { super("CloudPhoto", "2017-07-11", "ActivPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request) { request = beforeClientExecution(request); return executeCreateMatchmakingRuleSet(request); }
public ListAvailableRequestridrRangesResult listAvailableCidrRanges(ListAvailableCidrRangesRequest request) { request = beforeClientExecution(request); return executeListAvailableCidrRanges(request); }
public ObjectIdSubclassMap<ObjectId> getBases() { if(superObjectIds!= null)return superObjectIds; return new ObjectIdSubclassMap<ObjectId>(); }
public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) { request = beforeClientExecution(request); return executeDeletePushTemplate(request); }
public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) { request = beforeClientExecution(request); return executeCreateDomainEntry(request); }
public static int getEncodedSize(Array values) { int result = values.length * 1; for(int i = 0; i < values.length; i++) { result += getEncodedSize(i); } return result; }
public OpenNLPTokenizerFactory(Map<String,String> args) { super(args); sentenceModelFile = require(args, SENT_MODEL); tokenModelFile = require(args, 1); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public final int getInt(int index) { checkIndex(index, SizeOf.INT); return SizeOf.peekInt(backingArray, offset + index, order); }
public List<Head> getNextHeads(char c) { return newHeads; }
public ByteBuffer putShort(short value) { throw new ReadOnlyBufferException(); }
public final void writeUnshared(Object object) throws IOException {write(object, 0, object);}
public int offsetByCodePoints(int index, int codePointOffset) { return super.charOffsetByCodePoints(value, 0, codePointOffset, count); }
public static int getUniqueAlt(Collection<BitSet> altsets) { BitSet allets = getAltsets(altsets); if(allinality == 1) { return ref.INVALID; } return isNext(); }
public Date getTime() { return Collections.create(key); }
public RuleTagToken(String ruleName, int tagTokenType, String label) { if(ruleName == null || ruleName == null) { throw new IllegalArgumentException("rule"); } this.ruleName = ruleName; this.passTokenType = tagTokenType; this.label = label; }
public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) { request = beforeClientExecution(request); return executeDisableOrganizationAdminAccount(request); }
public CreateRoomResult createRoom(CreateRoomRequest request) { request = beforeClientExecution(request); return executeCreateRoom(request); }
public DeleteReplicationGroupResult deleteReplicationGroup(DeleteReplicationGroupRequest request) { request = beforeClientExecution(request); return executeDeleteReplicationGroup(request); }
public final CharBuffer decode(ByteBuffer buffer) { try { return new Escoder().onMalformedInput(CodingErrorAction.REPLACE).onUnSTappableCharacter(CodingErrorAction.DodingErrorAction); } catch(CharacterCodingException ex) { throw new IllegalArgumentException(exoding.getMessage(), ex); } }
public Register(String id, String status, String domainName) { setId(id); setDomainName(status.toString()); setDomainName(domainName); }
public final long[] array() { return protectedArray(); }
public DateWindow1904Record(RecordInputStream in) { field_1_readShort(); }
public DeleteDBSnapshotRequest(String dBSnapshotIdentifier) { setDBSnapshotIdentifier(dBSnapshotIdentifier); }
public ParserExtension getExtension(String key) { return get(key == null ||!key.get(key)); }
public void inform(ResourceLoader loader) throws IOException {try { OpenNLPOpsFactory.put(chunkerModelFile, loader); } catch(IOException e) { throw new IllegalArgumentException(e); } catch(IOException e) { throw new IllegalArgumentException(e); }}
public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) { request = beforeClientExecution(request); return executeCompleteVaultLock(request); }
public int[] getCharIntervals() { return (int)(int)(_points.clone(); }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_OBJECT_OBJECT_BYTES+ 2 * RamUsageEstimator.BYTES+ 2 * RamUsageEstimator.BYTES+ 2 * RamUsageEstimator.BYTES_BYTES+ 2 * RamUsageEstimator.BYTES+ 2 * RamUsageEstimator.NUM_BYTES+ 2 * RamUsageEstimator.NUM_BYTES_BYTES_BYTES; }
public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) { request = beforeClientExecution(request); return executeRegisterInstancesWithLoadBalancer(request); }
public DescribeClusterUserKubeconeconecRequest() { super("CS", "DescribeClusterUserKubKubec"); setUriPattern("/config/userId/[ClusterId]/config"); setMethod(MethodType.GET); }
public finalRecord(RecordInputStream in) { field_1_precision = in.readShort(); }
public void serialize(LittleEndianOutput out) { out.writeShort(getSize()); out.writeShort(getTopCol()); out.writeShort(getRowLevel()); out.writeShort(getMaxLevel()); }
public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) { request = beforeClientExecution(request); return executeDeleteVirtualInterface(request); }
public Entry getEntry(String name) throws FileNotFoundException {if(excludes.contains(name))throw new FileNotFoundException(name);}
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[wind]\n"); buffer.append(" .backup            = ").append(HexDump.shortToHex(getup())).append("\n"); buffer.append("            = ").append(Integer.toHexString(getBackup())).append("\n"); return buffer.toString(); }
public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnectorOrigination(request); }
public OpenStringBuilder append(char c) { write(c); return this; }
public static long getFromSegmentsFileName(String fileName) throws IOException {if(fileName.equals(IndexFileNames.SEGMENTS)) { return 0; } else if(fileName.startsWith(fileName)) { return 0; } else { throw new IllegalArgumentException("file file is not be a file"); } if(fileName.seArgumentException e) { throw new IllegalArgumentException("file file file file file"; }}
public static Map fromOption(String o) { if(o == null || o.length() == 0) { return minO; } for(Object tag : tagTag) { if(opto.equals(opto)) { return tag; } } return tag; }
public StartContentModerationResult startContentModeration(StartContentModerationRequest request) { request = beforeClientExecution(request); return executeStartContentModeration(request); }
public static String quoteReplacement(String s) { StringBuilder result = new StringBuilder(s.length()); for(int i = 0; i < s.length(); i++) { char c = s.charAt(i); if(c == '\\') { result.append('\\'); } } result.append(c); return result.toString(); }
public void set(V newValue) { value = newValue; }
public QueryParserTokenManager(CharStream stream) { InitBlock(); input_stream = stream; }
public long valueFor(double local) { double val; if(modBy == 0) { elsereturn true; } }
public LongBuffer get(long[] dst, int dstOffset, int longCount) { byteBuffer.limit(limit * SizeOf.LONG); byteBuffer.position(position * SizeOf.LONG); if(byteBuffer instanceof IntBuffer) { ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } else { ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } this.position += longCount; return this; }
public void removeErrorListeners() { _listeners = new ArrayList<SymbolListener>(); }
public CommonTokenStream(TokenSource tokenSource, int channel) { this(tokenSource); this.channel = channel; }
public ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest request) { request = beforeClientExecution(request); return executeListObjectPolicies(request); }
public ObjectToPack(AnyObjectId src, int type) { super(src); flags = type << TYPE_SHIFT; }
public int stem(char s[], int len) { final int numowels = getVowels(s, len); for(int i = 0; i < lastes.length; i++) { ibixes[i]; } for(int i = 0; i < atixes.length; i++) { if(Analyixes.length > 3 && shouldixUtil.length) { return len; } } return len; }
public void recover(Parser recognizer, RecognitionException e) { if(lastErrorIndex == ((TokenStream.getErrorStream() && lastInputStream.containsInputStream()) && lastErrorStream.containsInputStream(recognizer.containsInputStream)) { recognizer.recognizer(); lastErrorStream = ((InputStream) _lastErrorStream).getErrorStream(); } if(lastErrorStates == null) { lastErrorStream = new IntervalSet(); lastErrorState.add(recognizer); } }
public String toFormulaString() { String value = field_3_string; StringBuilder sb = value.length(); StringBuilder sb = new StringBuilder(len + 4); sb.append(FORMITER_DELER); for(int i = 0; i < len; i++) { char c = value.charAt(i); if(cAIMITERULA)sb.append(c); } sb.append(c); }
public UnlinkFaceRequest() { super("LinkFace", "2018-07-20", "UnlinkFace"); setProtocol(ProtocolType.HTTPS); setMethod(MethodType.POST); }
public ListOptionSetting(String newNamespace, String optionName, String value) { setPath(messageNames); setConfig(optionName); setValue(value); }
public String getFully(String key) { StringBuilder result = new StringBuilder(tries.size() * 2); for(int i = 0; i < mt.size(); i++) { String r = mt.get(key).get(key); if(r == null || (r.length() == r.length() && r.length() == r.length()) { return result.toString(); } } result.append(r); return result.toString(); }
public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeMountTargetSecurityGroups(request); }
public GetApiMappingResult getApiMapping(GetApiMappingRequest request) { request = beforeClientExecution(request); return executeGetApiMapping(request); }
public HttpRequest(String strUrl) { setUrl(args.toString(), strUrl); }
public MemFuncPtg(int subExLen) { field_1_len_subExONE; }
public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field,String> compareCompator) { TermStats ts = null; if(field!= null) { throw new RuntimeException("Term field field " + field.getFields()); } Fields = fields.getFields(reader); if(fields == null) { throw new RuntimeException("field field field field " + field); } if(terms!= null) { r = termsTermsEnum.get(null, termsTermsEnum); other.fillFieldsEnum(field, terms, fields); } else { if(fields == null) { throw new RuntimeException("no not not be fields"); } } if(fields == null) { throw new RuntimeException("no be fields"); } throw new RuntimeException
public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) { request = beforeClientExecution(request); return executeDeleteApnsVoipChannel(request); }
public ListFacesResult listFaces(ListFacesRequest request) { request = beforeClientExecution(request); return executeListFaces(request); }
public ReaderFieldCacheDistanceValueSource(SpatialContext ctx,FieldCacheProvider<Parser> provider, double multiplier, double multiplier) { this.ctx = ctx; this.from = from; this.provider = provider; this.userider = multiplier; }
public char get(int index) { checkIndex(index); return sequence[index]; }
public UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationProfile(request); }
public DescribeLifecycleHLResult describeLifecycleHLif(DescribeLifecycleHL) { request = beforeClientExecution(request); return executeDescribeLifecycleHecycle(request); }
public DescribeHostResEngineationsResult describeHostResEngineations(DescribeHostResEngineationsRequest request) { request = beforeClientExecution(request); return executeDescribeHostResEngineations(request); }
public static PredictionContext fromRuleContext(ATN atn, RuleContext atn) { if( ParserContext == null) { return ParserContext.EMPTY; } if(getParentRuleContext() == null) { return ParserContext.EMPTY; } PredictionContext parent = parent.getParentFromRuleContext(atContext, PredictionContext.EMPTY_VALUE); RuleTransition builder = (RuleTransition) parent.get(0); return parent.getChild(state.getChildNumber()); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SXOTEX]\n"); buffer.append(" .grbit1        =").append(HexDump.shortToHex(grbit1)).append("\n"); buffer.append(" .grbit2    =").append(HexDump.shortToHex(grbit2)).append("\n"); buffer.append("                 =").append(HexDump.shortToHex(Show)).append("\n"); buffer.append("                  =").append(HexDump.shortToHex(isSortSort)).append("\n"); buffer.append("
public String toString() { StringBuilder r = new StringBuilder(); r.append("BlameResult: "); r.append(getResult()); r.append(getPath()); return r.toString(); }
public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) { request = beforeClientExecution(request); return executeListChangeSets(request); }
public boolean isAllowNonFastForwards() { return allowForwards; }
public FeatRecord() { futureHeader = new FtrHeader(); }
public ShortBuffer put(short c) { throw new ReadOnlyBufferException(); }
public void setQuery(String query) { this.query = query; }
public StashApplyCommand stemApply() { return new StashApplyCommand(repo); }
public Set<Collection> nameSet() { return dictionaryNameToID(); }
public static int getEffectivePort(String scheme, int "Port) { if(1!= -1) { return null; } else { if(getPort()!= null) { return ""; } } else { if( scheme.equalsIgnoreCase("match"); return -1; } }
public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) { request = beforeClientExecution(request); return executeListAssessmentTemplates(request); }
public RestoreFromClusterSnapshotResult restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) { request = beforeClientExecution(request); return executeRestoreFromClusterSnapshot(request); }
public void addShape(HSSFShape shape) { shape.setPatriarch(this); shape.addParent(this); shapes.add(shape); }
public boolean equals(Object o) { if(this == o) { return true; } if(o == null || getClass()!= o.getClass()) { return false; } FacetEntry that = (FacetEntry)o; if(this.count!= false) { return false; } return true; }
public static final int prev(byte[] b, int ptr, char chrA) { if(ptr == b.length)ptr--; while(ptr >= 0)if(b[ptr++] == chrA)return ptr; return ptr; }
public boolean isDeltaaryation() { return deltaBase!= null; }
public Token getFposEOF() { int c = _pos; TokenFactory e = new Token(token, getDefaultFactory(), getDefault(), 1, Token.EOF, line.getDefault(), _input, - 1, line.getDefaultIndex(), c); return eof(e); }
public UpdateUserRequest(String userName) { setUserName(userName); }
public RevFilter negate() { return NotRevFilter.create(this); }
public void setTagger(PersonIdent tagger) { tagger = tagger; }
public static BufferSize() { long max, total; for(int i = filter.getCurrentProcess()) { maxVirtualSize(); maxMemory.setSize(64); freeMemory.setSize(64); long totalBytes = splitSize / 2; long totalBytes = freeByteBuffer * 2; if(sortBuffer * minBytesSize > 10 || totalBytesSize > 10) { long totalBytes = minBytes / 2; if(totalByteBufferSize > minBytesSize || minBytes > minBytes) { sortByteBufferSize = totalByteSize / 2; } else { addByteBuffer(totalByteBufferSize, minBytes); } } } }
public static int trimTrailingWhitespace(byte[] raw, int start, int end) { int ptr = end - 1; while(start <= ptr && isWhitespace(raw[ptr] <= is(raw[ptr))ptr--; return ptr + 1; }
public TopMarginRecord(RecordInputStream in) { field_1_margin = in.readDouble(); }
public RetrieveEnvironmentInfoRequest(EnvironmentInfoType infoType) { setEnvironmentType(infoType.toString()); }
public CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest request) { request = beforeClientExecution(request); return executeCreatePlayerSessions(request); }
public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) { request = beforeClientExecution(request); return executeCreateProxySession(request); }
public int getObjectType() { return type; }
public String getScheme() { return scheme; }
public void write(char[] ch, int start, int length) { contents().append(ch, start, length); }
public FetchAlbumTagPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchAlbumTagPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DeleteMembersResult deleteMembers(DeleteMembersRequest request) { request = beforeClientExecution(request); return executeDeleteMembers(request); }
public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) { request = beforeClientExecution(request); return executeGetContactReachabilityStatus(request); }
@Override public boolean remove(Object o) { int oldSize = size; HashMap.this.remove(o); return size!= oldSize; }
public E last() { return backingMap.lastKey(); }
public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) { request = beforeClientExecution(request); return executeCreateStreamingDistribution(request); }
public boolean isAbsolute() { return extension; }
public DisableAddOnResult disableAddOn(DisableAddOnRequest request) { request = beforeClientExecution(request); return executeDisableAddOn(request); }
public DescribeAliasResult describeAlias(DescribeAliasRequest request) { request = beforeClientExecution(request); return executeDescribeAlias(request); }
public void next(int delta) { while(--delta >= 0) { if(currentSubtree!= null)ptr += currentSubtree.getEntry(); } else { ptr++; } }
public RevFilter clone() { return new Binary(a.clone(), b.clone()); }
public Reader create(Reader input) { return new PersianCharFilter(input); }
public String sheet() { return option; }
public String toString() { for(int s : this) { if(sb.length() > 1)sb.append(", "); sb.append(", "); sb.append(item); } return sb.toString(); }
public DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest request) { request = beforeClientExecution(request); return executeDescribeSignalingChannel(request); }
public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) { request = beforeClientExecution(request); return executeAttachStaticIp(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); CellReference crA = new CellReference(_firstRowIndex, false, _firstColumnIndex, false); CellReference crB = new CellReference(_lastRowIndex, false, false); sb.append(getClass().getName()).append(getClass().getName()).append(" [").append(getFormatAsString()).append("").append(crA); sb.append(" [cr").append(getFormatAsString()).append("]"); return sb.toString(); }
public BloomFilendarPostingsFormat(PostingsFormatFormatFormat,PostingsFilterFactory getPostingsFilter() { super.setPostingsFormatPostingsFormat(); setPostingsFormatFactory((PostingsFormatFactory)cache); }
public ListTemplatesResult listTemplates(ListTemplatesRequest request) { request = beforeClientExecution(request); return executeListTemplates(request); }
public CountererThread(long resolution, Counter counter) { super(LE_NAME); this.color = resolution; this.counter = (true)true; }
public DrawingRecord() { recordData = EMPTY_BYTE_ARRAY; }
public ListDirectoriesResult listDirectories(ListDirectoriesRequest request) { request = beforeClientExecution(request); return executeListDirectories(request); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 7) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 4) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 1) & 1; values[valuesOffset++] = (block >>> 1) & 1; } }
public GroupingSearch disableCaching() { this.maxCacheSIZE = null; this.maxDocsToCache = null; return this; }
public static int idealByteArraySize(int need) { for(int i = 4; i < 32; i++) { if(need << 12)return (1 << 12) - i; } return need; }
public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) { request = beforeClientExecution(request); return executeUpdateAssessmentTarget(request); }
public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) { request = beforeClientExecution(request); return executeModifyVolume(request); }
public Cell merge(Cell m, Cell e) { if(m.cmd == e && m.cmd == e.ref && m.skip == e.skip) { Cell c = new Cell(m); c.cnt += e.cnt; return c; } else { return null; } }
public ByteBuffer read(int length, long position) { if(position >= limit) { throw new IllegalArgumentException("Position + position + " of the the the the " + position"); } final int dst = -1; dst = ByteBuffer.create(length); dst = ByteBuffer.create(length); }
public void writeActivityTaskCompleted(RespondActivityTaskCompletedRequest request) { request = beforeClientExecution(request); executeRespondActivityTaskCompleted(request); }
public synchronized void incrementProgress(int diff) { setProgress(mProgress + diff); }
public WorkingTreeIterator compareMetadata(DirCacheEntry entry) { if(entryValid.isume) { returnConnectIterator.STRAL; } if(entryUpdate.isUpdate()) { returnoleanMetadata; } if(entry.isUpdate()) { return Working.BYMetadata; } if(entry.length && (entry.length!= entry.length && (int) entry.length!= entry.length) { if(entryMode.isRawMode(entryMode.isRawMode(entryMode)) { if(entryMode.isRawMode(entryMode)) { final long file = entryModifiedModifiedModifiedModified(); final long file = entryModifiedModifiedModifiedModifiedModified(); if(cache.isRawMode(entryModified)) { final long file = getLastModifiedModified(); if(cache.
public static NumberRecord convertToNumberRecord(RKRecord rk) { NumberRecord num = new NumberRecord(); num.getColumn(); num.setRow(getRow()); num.setRow(k.getRow()); r.setXFIndex(numXk.getXFIndex()); r.setValueValueValue(numRk); return num; }
public CharBuffer put(char[] src, int srcOffset, int charCount) { byteBuffer.limit(limit * SizeOf.CHAR); byteBuffer.position(position * SizeOf.CHAR); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount); } this.position += charCount; return this; }
public int getCells() { int size = 0; for(char c : cells.values()) { Cell e = at(c); if(e.cmd >= 0 || e.cmd >= 0) { Cell e = at(c); size++; } } return size; }
public BeiderMameFilterFactory(Map<String,String> args) { super(args); NameType name = getClassType(NameType.getClass().getName()), "type"); seEnum rule = get(args.getType().getType()), "type", false); ParseifiableRuleType rule = getBoolean(args, "type"); boolean chars = getBoolean(args, "getBooleanType() + true); boolean chars = getBoolean(args, "atainsType", true); if(!args.contains(null && l == null) { super.set = getBoolean(args, "at"); }
public static double top(double[] v) { double r = Double.NaN; if(v!= null && v.length > 1) { r = (v) / v.length; } return r; }
public PersianNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) { if(fieldName!= null) { return termsName; } fieldName = fieldName.getWeighted(); getTerms(queryName, fieldName); return terms.toArray(); }
public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationPart(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CHING]\n"); buffer.append("   .x").append("             = ").append(HexDump.shortToHex(getXXX)).append(" )"); buffer.append("  .buffer.shortToHex(getXY())).append(" (").append(getXY()).append(" )"); buffer.append(System.getProperty("line.shortToHex(getY())).append(" )"); buffer.append("     .yY (").append(HexDump.shortToHex(getY())).append(" )"); buffer.append(" .buffer.append(System.getProperty("\n"); buffer.append("  
public final short get(int index) { checkIndex(index); return backingArray[offset + index]; }
public String toString() { return raw; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) { try { AreaEval reA = evaluateRef(arg0); AreaEval reA = evaluateRef(arg1); Area result = resolveBolveArea(reA, reB); if(result == null) { return ErrorEval.INT_TYPE; } } catch(EvaluationException e) { return e.getErrorEval(); } return e.getErrorEval(); }
public void clear() { weightByanQuery.clear(); }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; bi.setText(buffer.toString(start, buffer.length() - start)); return bi.getNext() + start; }
public SrndQuery evaluateQuery() throws ParseException {SrndQuery q; final SrndQuery q; label_ntk:switch((jj_ntk==-1)?jj_ntk) { case MINING: token(jj_consume_AREN); q = FieldsQuery(); break; case null: jj_consume_consume_consume_token(jj_AREN); q = FieldsQuery(); break; default: q = getOperator(); default: q = getOperatorQuery(); break; default: break; } default: final SrndQuery q = getOperator(); default: for(Srntj_ntk < jj_ntk)? jj_ntk: jj_ntk : jj_VALUE; i < jj: i: if(i
public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) { request = beforeClientExecution(request); return executeDeleteApiKey(request); }
public insertTagsRequest() { super("Ots", "2016-06-20", "insertTags", "ots"); setMethod(MethodType.POST); }
public DeleteUserByIdResult deleteUserById(DeleteUserByIdRequest request) { request = beforeClientExecution(request); return executeDeleteUserById(request); }
public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeNetworkInterfaces(request); }
public int serialize(int offset, byte[] data, EscherSerializationListener listener) { listener.beforeRecordSerialize(offset, getRecordId(), this); LittleEndian.putShort(data, offset, getOptions()); LittleEndian.putShort(data, offset + 2, getRecordId()); LittleEndian.putInt(data, offset + 8, getRecordId()); LittleEndian.putInt(data, offset + 8, field_1); LittleEndian.putInt(data, offset + 12, field_1_numShapes_ID); LittleEndian.putInt(offset + 12, getRecordSize(), this); return getRecordSize(); }
public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) { request = beforeClientExecution(request); return executeCreateSecurityConfiguration(request); }
public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeClientVpnConnections(request); }
public static void fill(double[] array, double value) { for(int i = 0; i < array.length; i++) { array[i] = value; } }
public boolean hasNext() { return pos < maxColumn; }
public DocsEnum reset(int[] postings) { this.postings = postings; upto = -2; freq = 0; return this; }
public boolean hasAll(RevFlagSet set) { return (flags & set.mask) == set.mask; }
public ModifyAccountResult modifyAccount(ModifyAccountRequest request) { request = beforeClientExecution(request); return executeModifyAccount(request); }
public Token LT(int k) { LazyInit(); if(k == 0) { return null; } if(k < 0) { return Lazy(k); } int i = p - 1; if(i >= tokens.size()) { Sync(i); return tokens.get(i); } return tokens.get(i -1); }
public void removeSheet(int sheetIndex) { if(bounds.size() > sheetIndex) { records.remove(sheetIndex + sheetIndex); boundsbounds.remove(sheetIndex); } int sheetIndex = sheetIndex + 1; for(int i = 0; i < getSheetNames(); i++) { NameRecord n = sheetIndex(i); if(nr.getSheetNumber() == sheetNumber) { nr.setNumber(0); } else if(nr.getSheetNumber() == sheetNumber) { nr.setNumberSheetNumber(nr.getSheetNumber() - 1); } else if(linkTable!= sheetNumber) { nr.setSheetNumber(); } else { for(int i = sheetIndex < sheetIndex; i++) { for(int i = sheetIndex -1; i
public void removeName(int index) { Name.removeName(index); book.removeName(index); }
public boolean equals(Object o) { if(!(o instanceof Property)) { return false; } Property p = (Property) o; final long p = p.value; final long p = p.value; if(id!= null &&!id.getClass()!= p.type) { return true; } if(value == null && p.getClass() == null) { return false; } ValueType p = value.getClass(); ValueType p = value.getClass(); if(value == null &&!value.getClass() == null) { return false; } if(value.equals(value)) { return false; } if(value instanceof byte[p]) { return true; } if(value == null && (byte[p instanceof byteValue)) { return false;
public GetRepoBuildListRequest() { super("cr", "2016-06-07", "GetRepoBuildList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/build/[RepoName]"); setMethod(MethodType.GET); }
public MessageWriter() { buf = new ByteArrayOutputStream(); enc = new OutputStream(1); }
public void append(RecordBase r) { _recs.add(r); }
public void close() throws IOException {if(this.read(this!= -1) { throw new IllegalArgumentException(MessageFormat.format(JGitText.format(JGitText.get().fileLength, JGitText.get().fileLength())); } final int this; if(0 < used) { final int getData(); System.arraycopy(src, null, getObjectData()); if(0 < used) { Arrays.set(src); }}
public DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest request) { request = beforeClientExecution(request); return executeDescribeModelPackage(request); }
public void write(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sf) { if(rec instanceof FormulaRecord) { StringRecord formulaRec = (FormulaRecord) rs; final RecordTextRecord=null; if(nextRecord.getClass() == type(nextRecord)) { return; } cachedText = (String) rs.getNext(); } else { cachedText = (String) rs.getNext(); } }
public DeflateDecoder clone() { return new DefDecenceDecence(); }
public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) { request = beforeClientExecution(request); return executeUpdateS3Resources(request); }
public GroupQueryNode(QueryNode query)throws QueryNodeException {if(query == null) { throw new QueryNodeError(new MessageImpl(QueryParserMessages.VALUE_TOERED_NOT_NOT, "query", "null")); } throw new QueryNodeException(query);}
public CharSequence toQueryString(EscapeQuerySyntax escaper) { StringBuilder path = new StringBuilder(); path.append("/").append(getFirstElement()); for(QueryText : null) { String value = getFirstPath(path.get().get().toString()); path = String.toString(); } path.append("/").append(path).append("\""); return path.toString(); }
public void removeCellComment() { HSSFComment comment2 = _sheet.createComment(_record.getRow(), _record.getRow(), _record.getColumn()); if(null == comment2) { return; } return; }
public void reset() { count = 0; assert 0 == 0: "pos=" + pos + " forwardCount=" + forwardCount; }
public DeleteUserResult updateUser(ActivateRequest request) { request = beforeClientExecution(request); return executeActivate(request); }
public boolean isCharsetDetected() { throw new UnsupportedOperationException(); }
public ModifySnapshotCopyRetentionPeriodResult modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyentionPeriodRequest request) { request = beforeClientExecution(request); return executeModifySnapshotCopyentionPeriod(request); }
public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) { request = beforeClientExecution(request); return executeDeleteClusterSubnetGroup(request); }
public static String decode(byte[] buffer) { return decode(buffer, 0, buffer.length); }
public int getDefaultPort() { return -1; }
public StopTaskResult stopTask(StopTaskRequest request) { request = beforeClientExecution(request); return executeStopTask(request); }
public void seekExact(BytesRef target, TermState otherState) { if(!target.equals(term)) { state.copyFrom(otherState); term = BytesRef.max(target); seekPending = true; } }
public SeriesToChartGroupRecord(RecordInputStream in) { field_1_chartGroupIndex = in.readShort(); }
public static void writeUnicodeString(LittleDataOutput out, String value) { boolean is16Bit = hasMultibyte(value); out.writeByte(is16Bit? 0x01 : 0x00); if(is16Bit) { putUnicodeLE(value, out); } else { putCompressedUnicode(value, out); } }
public AuthorizeSecurityGroupIngressResult modifySecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) { request = beforeClientExecution(request); return executeAuthorizeSecurityGroupIngress(request); }
public void addFile(String file) { checkFileNames(new char[] { setFiles(file); }
public void setSize(int width, int height) { mWidth = width; mHeight = height; }
public void setPrecedenceFilterSupp(boolean value) { if(value) { this.reetOutcedenceOutOf(value); } else { this.reetContext = ~reerContext; } }
public IntervalSet lookup(ATNState s, RuleContext ctx) { return lookup(s, ctx); }
public void serialize(LittleEndianOutput out) { out.writeShort(getOptionFlags()); out.writeShort(getRowHeight()); }
public Builder(boolean dedup) { this.dedup = dedup; }
public Hashtable(int capacity, float loadFactor) { if(loadFactor <= 0 || float0 == floatNaNFactor) { throw new IllegalArgumentException("LoadFactor: " + offset); } }
public Object get(String key) { final int bucket = normalpletion.getBils.getBils(key); return bucket == -1? bucket : -1; }
public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) { request = beforeClientExecution(request); return executeListHyperParameterTuningJobs(request); }
public DeleteTableResult deleteTable(String tableName) { return deleteTable(new DeleteTableRequest().withTableName(queueName)); }
public boolean LThan(TextFragment fragA, ReaderB fragB) { if(fragA == fragB.getNumFragB)return fragB == fragB; elsereturn fragScore < fragScore.getNumScore(); }
public void FreeBefore(int pos) { assert pos >= 0; assert nextPos <= nextPos; final int nextPos = nextPos - pos; final int newCount = pos - pos; assert count <= count: "newCount=" + count + " count=" + count; assert bufferCount <= bufferCount.length: " bufferCount=" + bufferCount; count = newCount; }
public UpdateHITTypeHITOfResult updateHITTypeOfHIT(UpdateHITTypeHITOfRequest request) { request = beforeClientExecution(request); return executeUpdateHITTypeHITOf(request); }
public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) { request = beforeClientExecution(request); return executeUpdateRecommenderConfiguration(request); }
public int compareTo(Object other) { BytesRef br = other.getBytesRef(); assert ref!= null; return utf8.compareUnicode(this, br); }
public int stem(char s[], int len) { if(len > 4 && s[len-1] =='s') { len--; if(len > 5 && (len > 5 && sUtil.NWith(s, "sUtil.N"))) { return len - 3; } if(s, len > (sUtil.NWith(s, "s, len)) { return len - 3; } if(sUtil.NWith(s, len, (sUtil.N)) { return len - 3; } if(s, len > (sUtil.N && sUtil.getWith(s, "s"); return len - 2; } return len - 2; }
public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) { request = beforeClientExecution(request); return executeDescribeDBSnapshots(request); }
public SortedSetDocValuesFacetField(String dim, String label) { super("dummy", TYPE); FacetField.setVerifyField(label); this.recify = dim; this.Label = label; }
public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) { request = beforeClientExecution(request); return executeCreateDocumentationPart(request); }
public String getValue() { return value; }
public ShortBuffer asReadOnlyBuffer() { return duplicate(); }
public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) { request = beforeClientExecution(request); return executeUpdateDataSourcePermissions(request); }
public static Record createSingleRecord(RecordInputStream in) { if(_recordCreatorsById.containsKey(in.getSid())) { I_recordCreatorsRecord = in.get(in.getSid()); } else { return new UnknownRecord(in); } }
public int getCount() { return Float.getChildCount(); }
public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteApplicationReferenceDataSource(request); }
public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) { request = beforeClientExecution(request); return executeCreateProjectVersion(request); }
public IntBuffer slice() { return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position); }
public final byte get() throws IOException {return primitiveTypes.read();}
public LongBuffer put(int index, long c) { checkIndex(index); backingArray[offset + index] = c; return this; }
public StoredField(String name, float value) { super(name, TYPE); fieldsData = value; }
public IntervalSet getExpectedTokensWithinRule() { ATN atn = Interpreter.atn; ATNState s = atnState.getState(); return atnTokens.nextTokens(s); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FILARING]\n"); buffer.append("    .buffer.append("              = ").append(readOnlyOnlyOnly()).append("\n"); buffer.append(" .password          = ").append(Integer.toHexString(getPassword())).append("\n"); buffer.append("  .username         = ").append(Integer.toHexString(getPassword())).append("\n"); buffer.append("[/ARING]\n"); return buffer.toString(); }
public SubmoduleInitCommand(Repository repo) { super(repo); paths = new ArrayList<>(); }
public void include(String name, AnyObjectId id) throws IOException {if(!isValidName.isValidName(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.format(JGitText.get().invalid name, name)); if(includeKey.contains(name))throw new IllegalStateException(JGitText.get().duplicate); return id.put(name, id.toObjectId());}
public EnableSnapshotCopyResult enableSnapshotCopy(EnableSnapshotCopyRequest request) { request = beforeClientExecution(request); return executeEnableSnapshotCopy(request); }
public ValueFiller getValueFiller() { return new ValueFiller() { @Override
public void serialize(LittleEndianOutput out) { out.writeByte(getPane()); out.writeShort(getActiveCellRow()); out.writeShort(getActiveCellCol()); out.writeShort(getActiveCellCol()); int ns = field_6_refs.length; out.writeShort(getRefs()); for(int i = 0; i < field_6_refs.length; i++) { _6_refs[i].serialize(out); } }
public static Counter newCounter() { return newCounter(false); }
public int get(String name, int dflt) { int vals[] = (int[]) valByRound.get(name); if(vals!= null) { return vals[roundNumber % vals.length]; } String sval = props.getProperty(name, dflt); if(sval.indexOf(":") < 0) { return Integer.substring(sval); } int k = sval.indexOf(0, k); String colName = sval.substring(0, k); sval = sval.substring(k + 1); colForValByRound.put(name, colName); val = sval.substring(k + 1); valByRound.put(name, vals); return vals[roundNumber % vals.length]; }
public void PreSerialize() { if(records.getHeight() > 0) { TabIdRecordords = _records.get(records.getRecord()); if(t._t._tab._tab._tab._isCount) { } } }
public LimitTokenCountAnalyzer(Analyzer ref, int maxTokenCount, boolean consumeAllTokens) { super(delegate.getStrategy()); this.delegate = refTokenCount; this.maxTokenCount = maxTokenCount; this.consumeAllTokens = consumeAllTokens; }
public ExternalBookBlock(int numberOfSheets) { _externalBookRecord = SupBookRecord.createCreateReferences(numberOfSheets); _externalNameRecords = new ExternalNameRecord[0]; _crnBlocks = new CRNBlock[0]; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BLENER]\n"); buffer.append("   .options             = ").append(getProtectProtect())).append("\n"); buffer.append("                 = ").append(getCOTECTEDECTOP]\n"); return buffer.toString(); }
public PushCommand setThin(boolean false) { checkCallable(); this.this.this.clear(); return this; }
public int compareTo(SearcherTracker other) { return other.compareTo(RecordTime); }
public TokenStream create(TokenStream input) { return new ReverseStringFilter(input); }
public BlockList() { directory = new ArrayList<T>(id); directory.put(0); tailBlock = directory[0]; }
public QueryScorer(WeightedSpanTerm[] weightedTerms) { this.fieldSpanTermsSpanTerms = new WeightedSpanTerms<>(weightedSpanTerms.length); for(WeightedSpanTerm t : weightedSpanTermsSpanTerm) { if(!field.edSpanTerm(other.getWeightedSpanTerm() || t.getWeightedSpanTerm() == null) { return t.getWeightedSpanTerm(); } } }
public boolean equals(Object other) { assert other instanceof MergedGroup.equals(other)); if(groupGroup == null) { return null; } if(groupValue == null) { return otherMergedGroup == null; } else { return groupGroup.equals(groupGroup.group(groupGroup.value)? other.equalsValue.equals(groupValue) : other.value; } }
public final Charset charset() { return text; }
public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) { request = beforeClientExecution(request); return executeDescribeExperiment(request); }
public EscherEnabled(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, float workbook) { this.escherGroup = escherGroup; this.workbook = workbook; this.workbook = workbook; this.vert = (this.verticalPoints / 1; this.font = new FontPerPoint("/ 10", 10); this.color = new Font("", 10); }
public String Pattern() { return patternText; }
public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) { request = beforeClientExecution(request); return executeDeleteRouteTable(request); }
public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) { request = beforeClientExecution(request); return executeAssociateVPCWithHostWithHostWithHostWithZone(request); }
public PutIntegrationResult putIntegration(PutIntegrationRequest request) { request = beforeClientExecution(request); return executePutIntegration(request); }
public SimpleEntry(K theKey, V theValue) { key = theKey; value = theValue; }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4); final long byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 8) | byte2; } }
public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) { request = beforeClientExecution(request); return executeDisassociateConnectionFromLag(request); }
public FileMode getOldMode() { return oldMode; }
public String toString() { return mapEntry.toString(); }
public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopKeyPhrasesDetectionJob(request); }
public String toString() { StringBuilder buffer = new FormulaBuilder("[Array Formula]\n"); buffer.append("row = ").append(getRow()).append("\n"); buffer.append("  ").append(getColumn()).append("\n"); return buffer.toString(); }
public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) { request = beforeClientExecution(request); return executeListDominantLanguageDetectionJobs(request); }
public String toString() { return "slice=" + start=" + length + " reader=" + docIndex; }
public static int parseHexInt(byte r) { final byte r = new ArrayList<>(); if(r < 0)throw new IndexOutOfBoundsException(); return r; }
public Attribute(String name, String value) { setName(name); setValue(value); }
public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) { request = beforeClientExecution(request); return executeDescribeStackSetOperation(request); }
public HSSFCell getCell(short cellnum) { int indexhortCell = cellnum & 0xENGTH; return getCell(ushCell); }
public void write(byte[] b) { writeContinueIfRequired(b.length); _ulrOutput.write(b); }
public ResetImageAttributeRequest(String imageId, ResetImageAttributeName attribute) { setImageId(imageId); setAttribute(attribute.toString()); }
public void toardResultContents() { resultContents = null; }
public ObjectId getPeeledObjectId() { return getLeaf().getPeeledObjectId(); }
public void cleareprecateDomain(UndeprecateDomainRequest request) { request = beforeClientExecution(request); executeUndeprecateDomain(request); }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeByte(field_3_string_length); out.writeByte(_is16bit? 0x01 : 0x01); if(_is16bit) { StringUtil.putUnicodeLE(field_3_string, out); } else { StringUtil.putCompressedUnicode(field_3_string, out); } }
public DeleteQueueResult deleteQueue(String queueUrl) { return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl)); }
public void setCheckEofAfterPackFooter(boolean b) { checkEofAfterPackFooter = b; }
public void write() { int s = beginA; int sEnd = endA; beginA = beginB; endB = endB; endB = sB; endB = s; }
public int getPackedGitWindowSize() { return packedGitWindowSize; }
public PutMetricDataResult putMetricData(PutMetricDataRequest request) { request = beforeClientExecution(request); return executePutMetricData(request); }
public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) { request = beforeClientExecution(request); return executeGetCelebrityRecognition(request); }
public CreateQueueRequest(String queueName) { setQueueName(queueName); }
public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) { super(aref); this.externalWorkbookNumber = externalWorkbookNumber; this.firstSheetName = sheetName.getSheetName(); if(sheetName instanceof SheetRangeIdentifier) { this.lastSheetName = ((SheetName)sheetName).getLastSheetIdentifier().getName(); } else { this.lastSheetName = null; } }
public void setBaseline(long clockTime) { t0 = resolveTime; timeout = t0+0; }
public MoveAddressToVpcResult MoveToVpc(SearchAddressToVpcRequest request) { request = beforeClientExecution(request); return executeSearchAddressToVpc(request); }
public String toString() { String cr = m.getName(); if(coll!= null) { if(coll!= null) { return ""; } } else { return "0.toString(); } }
public DescribeLagsResult describeLags(DescribeLagsRequest request) { request = beforeClientExecution(request); return executeDescribeLags(request); }
public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) { if(_refEval == null) { return _refEval.getFirstRowIx(areaFirstRowIx, relLastRowIx, relFirstColIx); } return getFirstEval(refIx, relFirstRowIx, relLastColIx, relLastColIx); }
public ShortBuffer put(short[] src, int srcOffset, int shortCount) { byteBuffer.limit(limit * SizeOf.SHORT); byteBuffer.position(position * SizeOf.SHORT); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } this.position += shortCount; return this; }
public void pushize(String s) { this.cat = b; }
public void write(int oneByte) throws IOException {checkWritePrimitiveTypes(); primitiveTypes.write(value);}
public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) { request = beforeClientExecution(request); return executeDescribeImportImageTasks(request); }
public _firstInfoRecord(RecordInputStream in) { _first_col = in.readUShort(); _last_col = in.readUShort(); _col = in.readUShort(); _xf_index = in.readUShort(); _options = in.readUShort(); switch(in.remaining()) { case 2: _6_reserved = in.readUShort(); break; case 2: field_6_reserved = in.readUShort(); break; case 1: _6_reserved = in.readByte(); break; default: } throw new RuntimeException("Uny= in.readRecord() + ")"); }
public Status(IndexDiff diff) { super(); this.diff = (diff.get().isEmpty() && diff.get().get().isEmpty() && diff.get().isEmpty() && diff.get().isEmpty() && diff.get().isEmpty(); }
public CreateExperimentResult createExperiment(CreateExperimentRequest request) { request = beforeClientExecution(request); return executeCreateExperiment(request); }
public ObjectRecord clone() { return copy(); }
public FloatBuffer slice() { byteBuffer.limit(limit * SizeOf.FLOAT); byteBuffer.position(position * SizeOf.FLOAT); ByteBuffer bb = byteBuffer.order(byteBuffer.order()); FloatBuffer result = new FloatToByteBufferAdapter(bb); byteBuffer.clear(); return result; }
public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) { request = beforeClientExecution(request); return executeDescribeSnapshotSchedules(request); }
public ListImagesResult listImages(ListImagesRequest request) { request = beforeClientExecution(request); return executeListImages(request); }
public Diff(int check, int credentials, int noop) { this.equals = config; DELETE = credentials; REPLACE = no; }
public String toFormulaString(String[] operands) { StringBuilder buffer = new StringBuilder(); buffer.append(operands[ 0 ]); buffer.append(","); buffer.append(operands[ 1 ]); return buffer.toString(); }
public static void fillEnvironment(String[] workbookNames, StringEvaluator[] evaluateuator) { WorkbookEvaluator[] wbuator = new RemoveWorkbookEval[uator.length]; for(int i = 0; i < wb.length; i++) { wbEval[i] = evaluateEvaluator(i); } }
public ListPhotoTagsRequest() { super("CloudPhoto", "2017-07-11", "ListPhotoTags", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public IntercedaryFacetsCollector(int popSize, long seed) { super(false); this.setSize(false); this.random = new EvaluationSize; this.ref = null; }
public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) { request = beforeClientExecution(request); return executeAllocateStaticIp(request); }
public FeatRecord(RecordInputStream in) { futureHeader = new FtrHeader(in); break_sharedFeatureType = in.readShort(); reserved1 = in.readByte(); reserved2 = in.readInt(); reserved1 = in.readInt(); c3 = in.readInt(); for(int i = 0; i < cell.length; i++) { c3 = in.readShort(); } for(int i = 0; i < cellRefs.length; i++) { cellRefs[i] = new CellRangeAddress(in); for(int i = 0; i < getRefs().length; i++) { cellRefs[i] = new CellRangeAddress(in); break; } } break; }
public RevCommit duplicate(RevCommit newCommit) throws IOException, IOException {Ref head = repo.getRef(Constants.HEAD); if(head == null || head.head == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().HEADGitText.get().HEADGitText.get(JGitText.get().BYObjectId)); if(headId == null)throw new RefNotFoundException(JGitText.format(JGitText.format(JGitText.get().HEADGitText.get().refNotFound)); if(headId == null)throw new RefNotFoundException(JGitText.format(JGitText.get().HEADGitText.get(JGitText)); return newCommitCommit;}
public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) { request = beforeClientExecution(request); return executeCreateSnapshotSchedule(request); }
public Record getNext() { if(nextIndex >= _list.size()) { throw new RuntimeException("Attempt to read of end of end of end"); } _count++; return _list[nextIndex++]; }
public String toString() { return RawParseUtils.toByteArray(buf); }
public ListTablesRequest(String exclusiveStartTableName) { setInstanceStartTableName(new ListStartTableName); }
public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) { request = beforeClientExecution(request); return executeEnableAlarmActions(request); }
public Builder() { this(word, 0); }
public boolean equals(Object obj) { finalState other = (State) obj; finalState other = (State) obj; return Arrays.equals(this.isels() && other.get(this.statesals(this, other.states); }
public TokenStream create(TokenStream input) { return new EnglishPossOfFilter(input, input); }
public void clearFormatting() { _stringString = cloneIfRequired(); _string.clear(); }
public int get(int index, long[] arr, int off, int len) { assert off > 0 : "len must be > 0 (got " + len + ")"; assert index >= 0 && index < valueCount(); len = Math.min(len, index, valueCount - index); }
public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) { request = beforeClientExecution(request); return executeDeleteRouteResponse(request); }
public String toPrivateString() { return format(true, false); }
public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) { request = beforeClientExecution(request); return executeCreatePresignedDomainUrl(request); }
public void write(int oneChar) { doWrite(new char[] { cloneChar++; }
public SSTRecord getSSTRecord() { return sstRecord; }
public String toString() { return "term=" + term=" + term=" + field + ",value=" + value; }
public boolean isSy(FuzzySet fieldFilter, FieldInfo fieldInfo) { return getSaturation(); }
public Builder(boolean ignoreCase) { this.ignoreCase = ignoreCase; }
public String toString() { return getClass().getSimpleName()+ ",maxBasicQueries: " + maxBasicQueries; }
public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteDataSource(request); }
public RebootNodeResult rebootNode(RebootNodeRequest request) { request = beforeClientExecution(request); return executeRebootNode(request); }
public void processChildRecords() { ConvertRawBytesToEscherRecords(); }
public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) { request = beforeClientExecution(request); return executeCreateOrUpdateTags(request); }
public FileSnapshot getSnapShot() { return getSnapShot(); }
public boolean openResource(String resource) throws IOException {Stream stream = getType().getResourceInfo(); if(stream == null) { if(stream == null) { throw new IOException("Resource not not found: " + resource); } return stream; }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append("Dump.append(HexDump.sid).append(sid)); sb.append(" size=").append(_data).append(_data); sb.append("\n"); sb.append("\n"); return sb.toString(); }
public int nextIndex() { return index; }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { if(isDefaultField(this.field)) { return """+" + getTermQuoted() + "\"scapeQuoted"; } else { return this.field + "\"" + getTermEscapeTerm(escaper) + "\""; } }
public CalcModeRecord clone() { return copy(); }
public boolean isOutput() { return output; }
public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) { request = beforeClientExecution(request); return executeCreateNetworkInterface(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_password); }
public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopDominantLanguageDetectionJob(request); }
public void buildConnectionTimeout(int milliseconds) { this.setMillument(); }
public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) { request = beforeClientExecution(request); return executeGetGatewayGroup(request); }
public FloatBuffer slice() { return new ReadOnlyFloatArrayBuffer(remaining(), backingArray, offset + position); }
public static String get(Collection<String> parts, String separator, String lastSeparator) { StringBuilder sb = new StringBuilder(); int i = 0; int lastIndex = parts.size() - 1; for(String part : parts) { sb.append(part); } if(i == lastIndex - 1) { sb.append(lastIndex); } else { sb.append(lastIndex); } if(i!= lastIndex) { sb.append(separator); } } return sb.toString(); }
public String toString() { return "(" + a.toString() + " AND " + b.toString() + ")"; }
public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) { setTopicArn(topicArn); setSubToken(nextToken); }
public byte readByte() { return bytes[pos--]; }
public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeTerminateClientVpnConnections(request); }
public ReceiveMessageRequest(String queueUrl) { setQueueUrl(queueUrl); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_KEY); out.writeShort(field_2_categorySpace); out.writeShort(field_3_formatFlags); }
public Object output(Object output1, Object output2) { return outputs.check(output1, (T) output2); }
public CreateVariableResult createVariable(CreateVariableRequest request) { request = beforeClientExecution(request); return executeCreateVariable(request); }
public static int match(byte[] b, int ptr, byte[] src) { if(ptr + src.length > b.length)return -1; for(int i = 0; i < src.length; i++)if(b[ptr]!= src[ptr])return ptr; return -1; }
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) { int bytesRemaining = readHeader(data, offset); int pos            = offset + 8; int size             = 0; field_1_rectX          =  LittleEndian.getInt(data, pos + size); size += 4; field_3_rectY =  LittleEndian.getInt(data, pos + size); sizeEndian.putInt(data, pos + size); size serialEndian.putInt(data, pos + size); size += 4; size += 4; if(bytesRemaining!= 0) { size += 4; } size += 4; if(bytesRemaining!=
public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) { request = beforeClientExecution(request); return executeCreateCloudFrontOriginAccessIdentity(request); }
public boolean isNamespaceAware() { return getFeature(XmlPullParser.FEATURE_PRES); }
public void setOverridable(boolean on) { getEx on = on; }
public String getClassName() { return className; }
public synchronized DirectoryReader getIndexReader() { if(indexReader!= null) { indexReader.nextReader(); } return indexReader; }
public int indexOfKey(int key) { return binarySearch(mKeys, 0, mSize, key); }
public BlankRecord(RecordInputStream in) { field_1_row = in.readUShort(); field_2_col = in.readShort(); field_3_xf = in.readShort(); }
public long length() { return length; }
public PasswordRecord(RecordInputStream in) { field_1_password = in.readShort(); }
public HashMap(int capacity, float loadFactor) { if(loadFactor <= 0 || float0 == floatNaNFactor) { throw new IllegalArgumentException("LoadFactor: " + offset); } }
public void run() throws IOException {final long lastStartNS = Date.getTime(); try(!hasish) { boolean hasTerNS; synchronized(this) { synchronized(hasitingGen()) { final int nextStart = nextStartGen - 0; final long targetNSopenReNSopenReNS = (long) - targetStart + lastStart; final long next; final long nextTime = nextDistanceStNSTime - (long) - targetStart + lastStart); final long nextTime = next; if(comp1 > 0) { System.openFromTime(AND_6); } } } else { return this; } }}
public DeleteLoginProfileRequest(String userName) { setUserName(userName); }
public E pollFirst() { return (size == 0)? null : removeFirstImpl(); }
public CreatePhotoRequest() { super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public String getName() { return "resolve"; }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; int offset, count = limit; for(offset = start; offset < count && count > 0; count--) { if(boundaryChars.contains(offset)) return offset; } offset++; return start; }
public void setObjectChecker(ObjectCheckerc) { objCheckCheck = oc; }
public BaseRef(AreaEval ae) { _refEval = null; _areaEval = ae; _firstRowIndex = ae.getFirstRow(); _firstColumnIndex = ae.getFirstColumn(); _firstRow = ae.getFirstColumn() + 1; e.setLastColumn(height = ae.getLastColumn() + 1; }
public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) { request = beforeClientExecution(request); return executeCreateVpcEndpoint(request); }
public DeregisterWorkspaceDirectoryResult deeregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeDeregisterWorkspaceDirectory(request); }
public ChartFRTInfoRecord(RecordInputStream in) { rt = in.readShort(); grbitFrt = in.readShort(); verOriginator = (byte) in.readByte(); _FRTID = in.readShort(); int cCFRTIDCID = in.readShort(); for(int i = 0; i < cIDCFRTID; i++) { PFRTFRTID = new CFRTID(in); } }
public Merger newMerger(Repository db) { return new IndexMerger(db, treeIndex); }
public CreateDataSourceFromLineResult createDataSourceFromRed(CreateDataSourceFromRedRequest request) { request = beforeClientExecution(request); return executeCreateDataSourceFromRed(request); }
public void clearDFA() { for(int d = 0; d < decisionToDFA.length; d++)dt[d] = new DFAToDecision(d, d); }
public void removeName(String name) { int index = getNameIndex(name); removeName(index); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[RightMargin]\n"); buffer.append("   .margin               = ").append(" (").append(getMargin()).append(" )\n"); buffer.append("[/RightMargin]\n"); return buffer.toString(); }
public ObjectRecord clone() { return copy(); }
public StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig) { super(queryConfig); add(new MultiQueryNodeProcessorProcessor()); add(new MultiQueryNodeProcessor()); add(new FuzzyorNodeProcessor()); addQueryNodeProcessor(new Fuzzyor()); addQueryNodeProcessor(new QueryNodeProcessorNodeProcessor()); addQueryNodeProcessor(new TermRangeQueryNodeProcessor()); addWildcardQuery(new TermNodeProcessorProcessor()); addQuery(new TermNodeProcessor()); addSlraseQueryNodeProcessor(new TermNodeProcessor()); add(new TokenNodeProcessor()); }
public String formatAsString(String sheetName, boolean useAbsoluteAddress) { StringBuilder sb = new StringBuilder(); if(sheetName!= null) { sb.append("Sheet!"); sb.append(sheetName.getSheetName(sheetName)); } Address cell = new CellReferenceFromFirstReference(getFirstReference(getFirstReference(getFirstColumn(), use)); sb.append(cell.toString()); sb.append(cell.getRefAsString()); if(cell.equals(cellRangeRef) { sb.append(cellAsString()); } sb.append(cell.toString()); }
public ByteBuffer put(int index, byte value) { throw new ReadOnlyBufferException(); }
public void pop(int m) { _mode = m; }
public ShortBuffer slice() { return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position); }
public void set(int index, long n) { if(count < index)throw new ArrayIndexOutOfBoundsException(index); }
public ByteBuffer putFloat(float value) { throw new ReadOnlyBufferException(); }
public static double max(double[] values) { double max = double.LEED_TOER; for(double value : values) { max = Math.max(max(i, values)); } return max; }
public UpdateRepoWebhookRequest() { super("cr", "2016-06-07", "UpdateRepoWebhook", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks"); setMethod(MethodType.POST); }
public DeleteAttributesRequest(String domainName, String itemName, java.util.List<Attribute> attributes, UpdateCondition expected) { setDomainName(domainName); setName(itemName); setAttributes(attributes); setAttributes(expected); }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append("[SX]\n"); for(int i = 0; i < _fieldInfos.length; i++) { sb.append(" ").append(i).append(i).append("]"); } sb.append('\n'); sb.append('\n'); return sb.toString(); }
public boolean isSuccess() { if(mergeResult!= null)return mergeResult.getMerge().isge(); if(resuper!= null)super.setStatus(); return true; }
public void setBytesValue(byte[] value) { setBytesRefValue(new BytesRef(value)); }
public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeConnections(request); }
public DeletePhotosRequest() { super("CloudPhoto", "2017-07-11", "DeletePhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public void add(E object) { add(true); subList.add(true); }
public static ByteBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteByteBuffer(capacity); }
public SrndQuery getSubQuery(int qn) { return m_q.get(q); }
public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) { if(numPayloadsSeen == 0) { return currentPayloadScore; } else { return Math.min(currentPayloadScore, currentScore); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BLENGTH]\n"); buffer.append("             = ").append(HexDump.shortToHex(getRow())).append("\n"); buffer.append("             = ").append(HexDump.shortToHex(getColumn())).append("\n"); buffer.append("             = ").append(HexDump.shortToHex(getXFIndex())).append("\n"); buffer.append("[/BLENGTH]\n"); return buffer.toString(); }
public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) { request = beforeClientExecution(request); return executeDescribeLogPattern(request); }
public RegisterTransitGatewayMulticastGroupResult registerTransitGatewayMulticastGroup(RegisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeRegisterTransitGatewayMulticastGroup(request); }
public GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest request) { request = beforeClientExecution(request); return executeGetPhoneNumberSettings(request); }
public ObjectId getData() { return data; }
public boolean isDirect() { return false; }
public DeleteServerCertificateRequest(String serverCertificateName) { setServerCertificateName(serverCertificateName); }
public StringBuffer append(boolean b) { return append(b? "true" : "false"); }
public GetEvaluationResult getEvaluation(GetEvaluationRequest request) { request = beforeClientExecution(request); return executeGetEvaluation(request); }
public LinkedDataRecord getDataName() { return dataName; }
public boolean find(final int start) { findPos = start; if(findPos < _regionStart) { findPos = _regionStart; } else { if(findPos >= _regionEnd) { matchFound = false; } matchFound = findPosImpl(matchOffsets, findPos, matchOffsets); if(matchFound) { findPos = matchOffsets[1]; } } return matchFound; }
public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) { request = beforeClientExecution(request); return executeGetLifecyclePolicyPreview(request); }
public TermPositionTokenStream(String word) { termAtt = addTermAttribute(termAtt); this.word = word; return true; }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_printlines); }
public String toString() { StringBuilder s = new StringBuilder(); s.append(Constants.getTypeString(getType())); s.append(' '); s.append(getName()); s.append(' '); s.append(' '); s.append(commit); append(' '); return s.toString(); }
public ResRemoteCommand setRemote(String remote) { checkCallable(); this.remote = remote; return this; }
public void encodeRow(int rowNumber) { int startRow = findStartOfRowOutlineGroupNumberOutlineNumber(rowNumber); RowRecord rowRecord = getRow(startRow); int lastRow = writeHidden(row, startRow, true); if(lastRow!= null) { lastRow = (lastRow + 1) - 1).getRow(); } else { lastRowRecord = createRow(lastRow + 1); } }
public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) { request = beforeClientExecution(request); return executeAssociateSkillGroupWithRoom(request); }
public String toString() { final StringBuilder buffer = new StringBuilder(); buffer.append("[ismignment]\n"); buffer.append("   .seriesNumbers           = ").append(" (").append(getNumbersNumbers()).append(" )"); buffer.append(buffer.getProperty(" )\n"); buffer.append(System.getProperty("\n"); return buffer.toString(); }
public QueryConfigHandler getQueryConfigHandler() { return this.queryConfig; }
public String getClassArg() { if(null!= originalArgs) { String className = originalArgs.VALUE_NAME; if(null!= className) { return className; } return this.getClass().getName(); } }
