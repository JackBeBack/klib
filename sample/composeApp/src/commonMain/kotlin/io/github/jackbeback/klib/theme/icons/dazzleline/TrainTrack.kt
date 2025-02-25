package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrainTrack: ImageVector
    get() {
        if (_TrainTrack != null) {
            return _TrainTrack!!
        }
        _TrainTrack = ImageVector.Builder(
            name = "TrainTrack",
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
                moveTo(6f, 4f)
                horizontalLineTo(18f)
                moveTo(4f, 11f)
                horizontalLineTo(20f)
                moveTo(3f, 18f)
                lineTo(21f, 18f)
                moveTo(9f, 3f)
                lineTo(4f, 21f)
                moveTo(20f, 21f)
                lineTo(15f, 3f)
            }
        }.build()

        return _TrainTrack!!
    }

@Suppress("ObjectPropertyName")
private var _TrainTrack: ImageVector? = null
