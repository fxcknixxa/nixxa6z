const handler = async (m, {conn, usedPrefix}) => {
  const doc = ['pdf', 'zip', 'vnd.openxmlformats-officedocument.presentationml.presentation', 'vnd.openxmlformats-officedocument.spreadsheetml.sheet', 'vnd.openxmlformats-officedocument.wordprocessingml.document'];
  const document = doc[Math.floor(Math.random() * doc.length)];
  const text = `*





 `.trim();
  const buttonMessage= {
    'document': {url: `https://x.com/8fucknixxa`},
    'mimetype': `application/${document}`,
    'fileName': `「  𝐟𝐱𝐜𝐤.𝐧𝐢𝐱𝐱𝐚  」`,
    'fileLength': 99999999999999,
    'pageCount': 888,
    'contextInfo': {
      'forwardingScore': 200,
      'isForwarded': true,
      'externalAdReply': {
        'mediaUrl': 'https://x.com/8fucknixxa',
        'mediaType': 2,
        'previewType': 'pdf',
        'title': '888',
        'body': wm,
        'thumbnail':[imagen1,imagen2,imagen3,imagen4,imagen5].getRandom(),
        'sourceUrl': 'https://youtu.be/_aelrhBsIRE?si=P_T-f8ZsaZz5xxD-'}},
    'caption': text,
    'footer': wm,
    // 'buttons':[
    // {buttonId: `${usedPrefix}menu`, buttonText: {displayText: '𝙼𝙴𝙽𝚄'}, type: 1},
    // {buttonId: `${usedPrefix}donar`, buttonText: {displayText: '𝙳𝙾𝙽𝙰𝚁'}, type: 1}],
    'headerType': 6};
  conn.sendMessage(m.chat, buttonMessage, {quoted: m});
};
handler.help = ['owner', 'creator'];
handler.tags = ['info'];
handler.command = /^(owner|creator|creador|propietario)$/i;
export default handler;
