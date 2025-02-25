package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Fingerprint: ImageVector
    get() {
        if (_Fingerprint != null) {
            return _Fingerprint!!
        }
        _Fingerprint = ImageVector.Builder(
            name = "Fingerprint",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.893f, 17.79f)
                curveTo(6.908f, 17.763f, 6.924f, 17.737f, 6.941f, 17.711f)
                curveTo(8.144f, 15.799f, 8.84f, 13.538f, 8.84f, 11.103f)
                curveTo(8.84f, 9.142f, 10.43f, 7.552f, 12.392f, 7.552f)
                curveTo(14.353f, 7.552f, 15.943f, 9.142f, 15.943f, 11.103f)
                curveTo(15.943f, 12.007f, 15.882f, 12.896f, 15.763f, 13.767f)
                moveTo(13.882f, 19.844f)
                curveTo(14.426f, 18.76f, 14.871f, 17.618f, 15.207f, 16.431f)
                moveTo(18.616f, 17.436f)
                curveTo(19.188f, 15.424f, 19.495f, 13.299f, 19.495f, 11.103f)
                curveTo(19.495f, 7.18f, 16.315f, 4f, 12.392f, 4f)
                curveTo(11.098f, 4f, 9.885f, 4.346f, 8.84f, 4.95f)
                moveTo(4.4f, 14.978f)
                curveTo(4.969f, 13.807f, 5.288f, 12.493f, 5.288f, 11.103f)
                curveTo(5.288f, 9.809f, 5.634f, 8.596f, 6.239f, 7.552f)
                moveTo(12.392f, 11.104f)
                curveTo(12.392f, 14.226f, 11.496f, 17.14f, 9.947f, 19.602f)
            }
        }.build()

        return _Fingerprint!!
    }

@Suppress("ObjectPropertyName")
private var _Fingerprint: ImageVector? = null
